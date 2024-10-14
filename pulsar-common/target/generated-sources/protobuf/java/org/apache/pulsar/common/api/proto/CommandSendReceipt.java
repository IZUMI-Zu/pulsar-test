package org.apache.pulsar.common.api.proto;
public final class CommandSendReceipt {
	private long producerId;
	private static final int _PRODUCER_ID_FIELD_NUMBER = 1;
	private static final int _PRODUCER_ID_TAG = (_PRODUCER_ID_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _PRODUCER_ID_TAG_SIZE = LightProtoCodec.computeVarIntSize(_PRODUCER_ID_TAG);
	private static final int _PRODUCER_ID_MASK = 1 << (0 % 32);
	public boolean hasProducerId() {
		return (_bitField0 & _PRODUCER_ID_MASK) != 0;
	}
	public long getProducerId() {
		if (!hasProducerId()) {
			throw new IllegalStateException("Field 'producer_id' is not set");
		}
		return producerId;
	}
	public CommandSendReceipt setProducerId(long producerId) {
		this.producerId = producerId;
		_bitField0 |= _PRODUCER_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandSendReceipt clearProducerId() {
		_bitField0 &= ~_PRODUCER_ID_MASK;
		return this;
	}

	private long sequenceId;
	private static final int _SEQUENCE_ID_FIELD_NUMBER = 2;
	private static final int _SEQUENCE_ID_TAG = (_SEQUENCE_ID_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _SEQUENCE_ID_TAG_SIZE = LightProtoCodec.computeVarIntSize(_SEQUENCE_ID_TAG);
	private static final int _SEQUENCE_ID_MASK = 1 << (1 % 32);
	public boolean hasSequenceId() {
		return (_bitField0 & _SEQUENCE_ID_MASK) != 0;
	}
	public long getSequenceId() {
		if (!hasSequenceId()) {
			throw new IllegalStateException("Field 'sequence_id' is not set");
		}
		return sequenceId;
	}
	public CommandSendReceipt setSequenceId(long sequenceId) {
		this.sequenceId = sequenceId;
		_bitField0 |= _SEQUENCE_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandSendReceipt clearSequenceId() {
		_bitField0 &= ~_SEQUENCE_ID_MASK;
		return this;
	}

	private MessageIdData messageId;
	private static final int _MESSAGE_ID_FIELD_NUMBER = 3;
	private static final int _MESSAGE_ID_TAG = (_MESSAGE_ID_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _MESSAGE_ID_TAG_SIZE = LightProtoCodec.computeVarIntSize(_MESSAGE_ID_TAG);
	private static final int _MESSAGE_ID_MASK = 1 << (2 % 32);
	public boolean hasMessageId() {
		return (_bitField0 & _MESSAGE_ID_MASK) != 0;
	}
	public MessageIdData getMessageId() {
		if (!hasMessageId()) {
			throw new IllegalStateException("Field 'message_id' is not set");
		}
		return messageId;
	}
	public MessageIdData setMessageId() {
		if (messageId == null) {
			messageId = new MessageIdData();
		}
		_bitField0 |= _MESSAGE_ID_MASK;
		_cachedSize = -1;
		return messageId;
	}
	public CommandSendReceipt clearMessageId() {
		_bitField0 &= ~_MESSAGE_ID_MASK;
		if (hasMessageId()) {
			messageId.clear();
		}
		return this;
	}

	private long highestSequenceId = 0;
	private static final int _HIGHEST_SEQUENCE_ID_FIELD_NUMBER = 4;
	private static final int _HIGHEST_SEQUENCE_ID_TAG = (_HIGHEST_SEQUENCE_ID_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _HIGHEST_SEQUENCE_ID_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_HIGHEST_SEQUENCE_ID_TAG);
	private static final int _HIGHEST_SEQUENCE_ID_MASK = 1 << (3 % 32);
	public boolean hasHighestSequenceId() {
		return (_bitField0 & _HIGHEST_SEQUENCE_ID_MASK) != 0;
	}
	public long getHighestSequenceId() {
		return highestSequenceId;
	}
	public CommandSendReceipt setHighestSequenceId(long highestSequenceId) {
		this.highestSequenceId = highestSequenceId;
		_bitField0 |= _HIGHEST_SEQUENCE_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandSendReceipt clearHighestSequenceId() {
		_bitField0 &= ~_HIGHEST_SEQUENCE_ID_MASK;
		highestSequenceId = 0;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _PRODUCER_ID_MASK | _SEQUENCE_ID_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _PRODUCER_ID_TAG);
		LightProtoCodec.writeVarInt64(_b, producerId);
		LightProtoCodec.writeVarInt(_b, _SEQUENCE_ID_TAG);
		LightProtoCodec.writeVarInt64(_b, sequenceId);
		if (hasMessageId()) {
			LightProtoCodec.writeVarInt(_b, _MESSAGE_ID_TAG);
			LightProtoCodec.writeVarInt(_b, messageId.getSerializedSize());
			messageId.writeTo(_b);
		}
		if (hasHighestSequenceId()) {
			LightProtoCodec.writeVarInt(_b, _HIGHEST_SEQUENCE_ID_TAG);
			LightProtoCodec.writeVarInt64(_b, highestSequenceId);
		}
		return (_b.writerIndex() - _writeIdx);
	}
	public int getSerializedSize() {
		if (_cachedSize > -1) {
			return _cachedSize;
		}

		int _size = 0;
		_size += _PRODUCER_ID_TAG_SIZE;
		_size += LightProtoCodec.computeVarInt64Size(producerId);
		_size += _SEQUENCE_ID_TAG_SIZE;
		_size += LightProtoCodec.computeVarInt64Size(sequenceId);
		if (hasMessageId()) {
			_size += LightProtoCodec.computeVarIntSize(_MESSAGE_ID_TAG);
			int MsgsizeMessageId = messageId.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeMessageId) + MsgsizeMessageId;
		}
		if (hasHighestSequenceId()) {
			_size += _HIGHEST_SEQUENCE_ID_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(highestSequenceId);
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
				case _PRODUCER_ID_TAG :
					_bitField0 |= _PRODUCER_ID_MASK;
					producerId = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _SEQUENCE_ID_TAG :
					_bitField0 |= _SEQUENCE_ID_MASK;
					sequenceId = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _MESSAGE_ID_TAG :
					_bitField0 |= _MESSAGE_ID_MASK;
					int messageIdSize = LightProtoCodec.readVarInt(_buffer);
					setMessageId().parseFrom(_buffer, messageIdSize);
					break;
				case _HIGHEST_SEQUENCE_ID_TAG :
					_bitField0 |= _HIGHEST_SEQUENCE_ID_MASK;
					highestSequenceId = LightProtoCodec.readVarInt64(_buffer);
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
	public CommandSendReceipt clear() {
		if (hasMessageId()) {
			messageId.clear();
		}
		highestSequenceId = 0;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public CommandSendReceipt copyFrom(CommandSendReceipt _other) {
		_cachedSize = -1;
		if (_other.hasProducerId()) {
			setProducerId(_other.producerId);
		}
		if (_other.hasSequenceId()) {
			setSequenceId(_other.sequenceId);
		}
		if (_other.hasMessageId()) {
			setMessageId().copyFrom(_other.messageId);
		}
		if (_other.hasHighestSequenceId()) {
			setHighestSequenceId(_other.highestSequenceId);
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
