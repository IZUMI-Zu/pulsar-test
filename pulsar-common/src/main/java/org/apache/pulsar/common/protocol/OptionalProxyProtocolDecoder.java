/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.pulsar.common.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.CompositeByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.codec.ProtocolDetectionResult;
import io.netty.handler.codec.ProtocolDetectionState;
import io.netty.handler.codec.haproxy.HAProxyMessageDecoder;
import io.netty.handler.codec.haproxy.HAProxyProtocolVersion;
import lombok.extern.slf4j.Slf4j;

/**
 * Decoder that added whether a new connection is prefixed with the ProxyProtocol.
 * More about the ProxyProtocol see: http://www.haproxy.org/download/1.8/doc/proxy-protocol.txt.
 */
@Slf4j
public class OptionalProxyProtocolDecoder extends ChannelInboundHandlerAdapter {

    public static final String NAME = "optional-proxy-protocol-decoder";

    public static final int MIN_BYTES_SIZE_TO_DETECT_PROTOCOL = 12;

    private CompositeByteBuf cumulatedByteBuf;

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        if (msg instanceof ByteBuf) {
            // Combine cumulated buffers.
            ByteBuf buf = (ByteBuf) msg;
            if (cumulatedByteBuf != null) {
                buf = cumulatedByteBuf.addComponent(true, buf);
            }

            ProtocolDetectionResult<HAProxyProtocolVersion> result = HAProxyMessageDecoder.detectProtocol(buf);
            if (result.state() == ProtocolDetectionState.NEEDS_MORE_DATA) {
                // Accumulate data if need more data to detect the protocol.
                if (cumulatedByteBuf == null) {
                    cumulatedByteBuf = new CompositeByteBuf(ctx.alloc(), false, MIN_BYTES_SIZE_TO_DETECT_PROTOCOL, buf);
                }
                return;
            }
            cumulatedByteBuf = null;

            if (result.state() == ProtocolDetectionState.DETECTED) {
                ctx.pipeline().addAfter(NAME, null, new HAProxyMessageDecoder());
            }
            ctx.pipeline().remove(this);
            super.channelRead(ctx, buf);
        } else {
            super.channelRead(ctx, msg);
        }
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        super.channelInactive(ctx);
        if (cumulatedByteBuf != null) {
            log.info("Release cumulated byte buffer when channel inactive.");
            cumulatedByteBuf = null;
        }
    }
}
