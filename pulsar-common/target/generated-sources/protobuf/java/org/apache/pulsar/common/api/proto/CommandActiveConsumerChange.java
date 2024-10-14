package org.apache.pulsar.common.api.proto;
public final class CommandActiveConsumerChange {
	private long consumerId;
	private static final int _CONSUMER_ID_FIELD_NUMBER = 1;
	private static final int _CONSUMER_ID_TAG = (_CONSUMER_ID_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _CONSUMER_ID_TAG_SIZE = LightProtoCodec.computeVarIntSize(_CONSUMER_ID_TAG);
	private static final int _CONSUMER_ID_MASK = 1 << (0 % 32);
	public boolean hasConsumerId() {
		return (_bitField0 & _CONSUMER_ID_MASK) != 0;
	}
	public long getConsumerId() {
		if (!hasConsumerId()) {
			throw new IllegalStateException("Field 'consumer_id' is not set");
		}
		return consumerId;
	}
	public CommandActiveConsumerChange setConsumerId(long consumerId) {
		this.consumerId = consumerId;
		_bitField0 |= _CONSUMER_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandActiveConsumerChange clearConsumerId() {
		_bitField0 &= ~_CONSUMER_ID_MASK;
		return this;
	}

	private boolean isActive = false;
	private static final int _IS_ACTIVE_FIELD_NUMBER = 2;
	private static final int _IS_ACTIVE_TAG = (_IS_ACTIVE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _IS_ACTIVE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_IS_ACTIVE_TAG);
	private static final int _IS_ACTIVE_MASK = 1 << (1 % 32);
	public boolean hasIsActive() {
		return (_bitField0 & _IS_ACTIVE_MASK) != 0;
	}
	public boolean isIsActive() {
		return isActive;
	}
	public CommandActiveConsumerChange setIsActive(boolean isActive) {
		this.isActive = isActive;
		_bitField0 |= _IS_ACTIVE_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandActiveConsumerChange clearIsActive() {
		_bitField0 &= ~_IS_ACTIVE_MASK;
		isActive = false;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _CONSUMER_ID_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _CONSUMER_ID_TAG);
		LightProtoCodec.writeVarInt64(_b, consumerId);
		if (hasIsActive()) {
			LightProtoCodec.writeVarInt(_b, _IS_ACTIVE_TAG);
			_b.writeBoolean(isActive);
		}
		return (_b.writerIndex() - _writeIdx);
	}
	public int getSerializedSize() {
		if (_cachedSize > -1) {
			return _cachedSize;
		}

		int _size = 0;
		_size += _CONSUMER_ID_TAG_SIZE;
		_size += LightProtoCodec.computeVarInt64Size(consumerId);
		if (hasIsActive()) {
			_size += _IS_ACTIVE_TAG_SIZE;
			_size += 1;
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
				case _CONSUMER_ID_TAG :
					_bitField0 |= _CONSUMER_ID_MASK;
					consumerId = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _IS_ACTIVE_TAG :
					_bitField0 |= _IS_ACTIVE_MASK;
					isActive = LightProtoCodec.readVarInt(_buffer) == 1;
					break;
				default :
					LightProtoCodec.skipUnknownField(_tag, _buffer);
			}
		}
		checkRequiredFields();
		_parsedBuffer = _buffer;
	}
	private void checkRequiredFields() {
		if ((_bitField0 & _REQUIRED_FIELDS_MASK0) != _REQUIRED_FIELDS_MASK0) {
			throw new IllegalStateException("Some required fields are missing");
		}
	}
	public CommandActiveConsumerChange clear() {
		isActive = false;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public CommandActiveConsumerChange copyFrom(CommandActiveConsumerChange _other) {
		_cachedSize = -1;
		if (_other.hasConsumerId()) {
			setConsumerId(_other.consumerId);
		}
		if (_other.hasIsActive()) {
			setIsActive(_other.isActive);
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
