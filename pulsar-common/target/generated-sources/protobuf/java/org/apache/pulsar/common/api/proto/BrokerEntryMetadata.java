package org.apache.pulsar.common.api.proto;
public final class BrokerEntryMetadata {
	private long brokerTimestamp;
	private static final int _BROKER_TIMESTAMP_FIELD_NUMBER = 1;
	private static final int _BROKER_TIMESTAMP_TAG = (_BROKER_TIMESTAMP_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _BROKER_TIMESTAMP_TAG_SIZE = LightProtoCodec.computeVarIntSize(_BROKER_TIMESTAMP_TAG);
	private static final int _BROKER_TIMESTAMP_MASK = 1 << (0 % 32);
	public boolean hasBrokerTimestamp() {
		return (_bitField0 & _BROKER_TIMESTAMP_MASK) != 0;
	}
	public long getBrokerTimestamp() {
		if (!hasBrokerTimestamp()) {
			throw new IllegalStateException("Field 'broker_timestamp' is not set");
		}
		return brokerTimestamp;
	}
	public BrokerEntryMetadata setBrokerTimestamp(long brokerTimestamp) {
		this.brokerTimestamp = brokerTimestamp;
		_bitField0 |= _BROKER_TIMESTAMP_MASK;
		_cachedSize = -1;
		return this;
	}
	public BrokerEntryMetadata clearBrokerTimestamp() {
		_bitField0 &= ~_BROKER_TIMESTAMP_MASK;
		return this;
	}

	private long index;
	private static final int _INDEX_FIELD_NUMBER = 2;
	private static final int _INDEX_TAG = (_INDEX_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _INDEX_TAG_SIZE = LightProtoCodec.computeVarIntSize(_INDEX_TAG);
	private static final int _INDEX_MASK = 1 << (1 % 32);
	public boolean hasIndex() {
		return (_bitField0 & _INDEX_MASK) != 0;
	}
	public long getIndex() {
		if (!hasIndex()) {
			throw new IllegalStateException("Field 'index' is not set");
		}
		return index;
	}
	public BrokerEntryMetadata setIndex(long index) {
		this.index = index;
		_bitField0 |= _INDEX_MASK;
		_cachedSize = -1;
		return this;
	}
	public BrokerEntryMetadata clearIndex() {
		_bitField0 &= ~_INDEX_MASK;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		int _writeIdx = _b.writerIndex();
		if (hasBrokerTimestamp()) {
			LightProtoCodec.writeVarInt(_b, _BROKER_TIMESTAMP_TAG);
			LightProtoCodec.writeVarInt64(_b, brokerTimestamp);
		}
		if (hasIndex()) {
			LightProtoCodec.writeVarInt(_b, _INDEX_TAG);
			LightProtoCodec.writeVarInt64(_b, index);
		}
		return (_b.writerIndex() - _writeIdx);
	}
	public int getSerializedSize() {
		if (_cachedSize > -1) {
			return _cachedSize;
		}

		int _size = 0;
		if (hasBrokerTimestamp()) {
			_size += _BROKER_TIMESTAMP_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(brokerTimestamp);
		}
		if (hasIndex()) {
			_size += _INDEX_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(index);
		}
		_cachedSize = _size;
		return _size;
	}
	public void parseFrom(io.netty.buffer.ByteBuf _buffer, int _size) {
		clear();
		int _endIdx = _buffer.readerIndex() + _size;
		while (_buffer.readerIndex() < _endIdx) {
			int _tag = LightProtoCodec.readVarInt(_buffer);
			switch (_tag) {
				case _BROKER_TIMESTAMP_TAG :
					_bitField0 |= _BROKER_TIMESTAMP_MASK;
					brokerTimestamp = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _INDEX_TAG :
					_bitField0 |= _INDEX_MASK;
					index = LightProtoCodec.readVarInt64(_buffer);
					break;
				default :
					LightProtoCodec.skipUnknownField(_tag, _buffer);
			}
		}
		_parsedBuffer = _buffer;
	}
	public BrokerEntryMetadata clear() {
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public BrokerEntryMetadata copyFrom(BrokerEntryMetadata _other) {
		_cachedSize = -1;
		if (_other.hasBrokerTimestamp()) {
			setBrokerTimestamp(_other.brokerTimestamp);
		}
		if (_other.hasIndex()) {
			setIndex(_other.index);
		}
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
