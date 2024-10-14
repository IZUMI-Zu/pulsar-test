package org.apache.pulsar.broker.service.resource.usage;
public final class NetworkUsage {
	private long bytesPerPeriod;
	private static final int _BYTES_PER_PERIOD_FIELD_NUMBER = 1;
	private static final int _BYTES_PER_PERIOD_TAG = (_BYTES_PER_PERIOD_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _BYTES_PER_PERIOD_TAG_SIZE = LightProtoCodec.computeVarIntSize(_BYTES_PER_PERIOD_TAG);
	private static final int _BYTES_PER_PERIOD_MASK = 1 << (0 % 32);
	public boolean hasBytesPerPeriod() {
		return (_bitField0 & _BYTES_PER_PERIOD_MASK) != 0;
	}
	public long getBytesPerPeriod() {
		if (!hasBytesPerPeriod()) {
			throw new IllegalStateException("Field 'bytesPerPeriod' is not set");
		}
		return bytesPerPeriod;
	}
	public NetworkUsage setBytesPerPeriod(long bytesPerPeriod) {
		this.bytesPerPeriod = bytesPerPeriod;
		_bitField0 |= _BYTES_PER_PERIOD_MASK;
		_cachedSize = -1;
		return this;
	}
	public NetworkUsage clearBytesPerPeriod() {
		_bitField0 &= ~_BYTES_PER_PERIOD_MASK;
		return this;
	}

	private long messagesPerPeriod;
	private static final int _MESSAGES_PER_PERIOD_FIELD_NUMBER = 2;
	private static final int _MESSAGES_PER_PERIOD_TAG = (_MESSAGES_PER_PERIOD_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _MESSAGES_PER_PERIOD_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_MESSAGES_PER_PERIOD_TAG);
	private static final int _MESSAGES_PER_PERIOD_MASK = 1 << (1 % 32);
	public boolean hasMessagesPerPeriod() {
		return (_bitField0 & _MESSAGES_PER_PERIOD_MASK) != 0;
	}
	public long getMessagesPerPeriod() {
		if (!hasMessagesPerPeriod()) {
			throw new IllegalStateException("Field 'messagesPerPeriod' is not set");
		}
		return messagesPerPeriod;
	}
	public NetworkUsage setMessagesPerPeriod(long messagesPerPeriod) {
		this.messagesPerPeriod = messagesPerPeriod;
		_bitField0 |= _MESSAGES_PER_PERIOD_MASK;
		_cachedSize = -1;
		return this;
	}
	public NetworkUsage clearMessagesPerPeriod() {
		_bitField0 &= ~_MESSAGES_PER_PERIOD_MASK;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _BYTES_PER_PERIOD_MASK | _MESSAGES_PER_PERIOD_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _BYTES_PER_PERIOD_TAG);
		LightProtoCodec.writeVarInt64(_b, bytesPerPeriod);
		LightProtoCodec.writeVarInt(_b, _MESSAGES_PER_PERIOD_TAG);
		LightProtoCodec.writeVarInt64(_b, messagesPerPeriod);
		return (_b.writerIndex() - _writeIdx);
	}
	public int getSerializedSize() {
		if (_cachedSize > -1) {
			return _cachedSize;
		}

		int _size = 0;
		_size += _BYTES_PER_PERIOD_TAG_SIZE;
		_size += LightProtoCodec.computeVarInt64Size(bytesPerPeriod);
		_size += _MESSAGES_PER_PERIOD_TAG_SIZE;
		_size += LightProtoCodec.computeVarInt64Size(messagesPerPeriod);
		_cachedSize = _size;
		return _size;
	}
	public void parseFrom(io.netty.buffer.ByteBuf _buffer, int _size) {
		clear();
		int _endIdx = _buffer.readerIndex() + _size;
		while (_buffer.readerIndex() < _endIdx) {
			int _tag = LightProtoCodec.readVarInt(_buffer);
			switch (_tag) {
				case _BYTES_PER_PERIOD_TAG :
					_bitField0 |= _BYTES_PER_PERIOD_MASK;
					bytesPerPeriod = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _MESSAGES_PER_PERIOD_TAG :
					_bitField0 |= _MESSAGES_PER_PERIOD_MASK;
					messagesPerPeriod = LightProtoCodec.readVarInt64(_buffer);
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
	public NetworkUsage clear() {
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public NetworkUsage copyFrom(NetworkUsage _other) {
		_cachedSize = -1;
		if (_other.hasBytesPerPeriod()) {
			setBytesPerPeriod(_other.bytesPerPeriod);
		}
		if (_other.hasMessagesPerPeriod()) {
			setMessagesPerPeriod(_other.messagesPerPeriod);
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
