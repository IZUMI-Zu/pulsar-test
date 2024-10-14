package org.apache.pulsar.common.api.proto;
public final class CommandFlow {
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
	public CommandFlow setConsumerId(long consumerId) {
		this.consumerId = consumerId;
		_bitField0 |= _CONSUMER_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandFlow clearConsumerId() {
		_bitField0 &= ~_CONSUMER_ID_MASK;
		return this;
	}

	private int messagePermits;
	private static final int _MESSAGE_PERMITS_FIELD_NUMBER = 2;
	private static final int _MESSAGE_PERMITS_TAG = (_MESSAGE_PERMITS_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _MESSAGE_PERMITS_TAG_SIZE = LightProtoCodec.computeVarIntSize(_MESSAGE_PERMITS_TAG);
	private static final int _MESSAGE_PERMITS_MASK = 1 << (1 % 32);
	public boolean hasMessagePermits() {
		return (_bitField0 & _MESSAGE_PERMITS_MASK) != 0;
	}
	public int getMessagePermits() {
		if (!hasMessagePermits()) {
			throw new IllegalStateException("Field 'messagePermits' is not set");
		}
		return messagePermits;
	}
	public CommandFlow setMessagePermits(int messagePermits) {
		this.messagePermits = messagePermits;
		_bitField0 |= _MESSAGE_PERMITS_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandFlow clearMessagePermits() {
		_bitField0 &= ~_MESSAGE_PERMITS_MASK;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _CONSUMER_ID_MASK | _MESSAGE_PERMITS_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _CONSUMER_ID_TAG);
		LightProtoCodec.writeVarInt64(_b, consumerId);
		LightProtoCodec.writeVarInt(_b, _MESSAGE_PERMITS_TAG);
		LightProtoCodec.writeVarInt(_b, messagePermits);
		return (_b.writerIndex() - _writeIdx);
	}
	public int getSerializedSize() {
		if (_cachedSize > -1) {
			return _cachedSize;
		}

		int _size = 0;
		_size += _CONSUMER_ID_TAG_SIZE;
		_size += LightProtoCodec.computeVarInt64Size(consumerId);
		_size += _MESSAGE_PERMITS_TAG_SIZE;
		_size += LightProtoCodec.computeVarIntSize(messagePermits);
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
				case _MESSAGE_PERMITS_TAG :
					_bitField0 |= _MESSAGE_PERMITS_MASK;
					messagePermits = LightProtoCodec.readVarInt(_buffer);
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
	public CommandFlow clear() {
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public CommandFlow copyFrom(CommandFlow _other) {
		_cachedSize = -1;
		if (_other.hasConsumerId()) {
			setConsumerId(_other.consumerId);
		}
		if (_other.hasMessagePermits()) {
			setMessagePermits(_other.messagePermits);
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
