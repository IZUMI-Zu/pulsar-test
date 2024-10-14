package org.apache.pulsar.common.api.proto;
public final class CommandPing {
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		int _writeIdx = _b.writerIndex();
		return (_b.writerIndex() - _writeIdx);
	}
	public int getSerializedSize() {
		if (_cachedSize > -1) {
			return _cachedSize;
		}

		int _size = 0;
		_cachedSize = _size;
		return _size;
	}
	public void parseFrom(io.netty.buffer.ByteBuf _buffer, int _size) {
		clear();
		int _endIdx = _buffer.readerIndex() + _size;
		while (_buffer.readerIndex() < _endIdx) {
			int _tag = LightProtoCodec.readVarInt(_buffer);
			switch (_tag) {
				default :
					LightProtoCodec.skipUnknownField(_tag, _buffer);
			}
		}
		_parsedBuffer = _buffer;
	}
	public CommandPing clear() {
		_parsedBuffer = null;
		_cachedSize = -1;
		return this;
	}
	public CommandPing copyFrom(CommandPing _other) {
		_cachedSize = -1;
		return this;
	}
	public byte[] toByteArray() {
		byte[] a = new byte[getSerializedSize()];
		io.netty.buffer.ByteBuf b = io.netty.buffer.Unpooled.wrappedBuffer(a).writerIndex(0);
		this.writeTo(b);
		return a;
	}
	public void parseFrom(byte[] a) {
		io.netty.buffer.ByteBuf b = io.netty.buffer.Unpooled.wrappedBuffer(a);
		this.parseFrom(b, b.readableBytes());
	}
	private int _cachedSize;

	private io.netty.buffer.ByteBuf _parsedBuffer;

}
