package org.apache.pulsar.common.api.proto;
public final class CommandGetLastMessageIdResponse {
	private MessageIdData lastMessageId;
	private static final int _LAST_MESSAGE_ID_FIELD_NUMBER = 1;
	private static final int _LAST_MESSAGE_ID_TAG = (_LAST_MESSAGE_ID_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _LAST_MESSAGE_ID_TAG_SIZE = LightProtoCodec.computeVarIntSize(_LAST_MESSAGE_ID_TAG);
	private static final int _LAST_MESSAGE_ID_MASK = 1 << (0 % 32);
	public boolean hasLastMessageId() {
		return (_bitField0 & _LAST_MESSAGE_ID_MASK) != 0;
	}
	public MessageIdData getLastMessageId() {
		if (!hasLastMessageId()) {
			throw new IllegalStateException("Field 'last_message_id' is not set");
		}
		return lastMessageId;
	}
	public MessageIdData setLastMessageId() {
		if (lastMessageId == null) {
			lastMessageId = new MessageIdData();
		}
		_bitField0 |= _LAST_MESSAGE_ID_MASK;
		_cachedSize = -1;
		return lastMessageId;
	}
	public CommandGetLastMessageIdResponse clearLastMessageId() {
		_bitField0 &= ~_LAST_MESSAGE_ID_MASK;
		if (hasLastMessageId()) {
			lastMessageId.clear();
		}
		return this;
	}

	private long requestId;
	private static final int _REQUEST_ID_FIELD_NUMBER = 2;
	private static final int _REQUEST_ID_TAG = (_REQUEST_ID_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _REQUEST_ID_TAG_SIZE = LightProtoCodec.computeVarIntSize(_REQUEST_ID_TAG);
	private static final int _REQUEST_ID_MASK = 1 << (1 % 32);
	public boolean hasRequestId() {
		return (_bitField0 & _REQUEST_ID_MASK) != 0;
	}
	public long getRequestId() {
		if (!hasRequestId()) {
			throw new IllegalStateException("Field 'request_id' is not set");
		}
		return requestId;
	}
	public CommandGetLastMessageIdResponse setRequestId(long requestId) {
		this.requestId = requestId;
		_bitField0 |= _REQUEST_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandGetLastMessageIdResponse clearRequestId() {
		_bitField0 &= ~_REQUEST_ID_MASK;
		return this;
	}

	private MessageIdData consumerMarkDeletePosition;
	private static final int _CONSUMER_MARK_DELETE_POSITION_FIELD_NUMBER = 3;
	private static final int _CONSUMER_MARK_DELETE_POSITION_TAG = (_CONSUMER_MARK_DELETE_POSITION_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _CONSUMER_MARK_DELETE_POSITION_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_CONSUMER_MARK_DELETE_POSITION_TAG);
	private static final int _CONSUMER_MARK_DELETE_POSITION_MASK = 1 << (2 % 32);
	public boolean hasConsumerMarkDeletePosition() {
		return (_bitField0 & _CONSUMER_MARK_DELETE_POSITION_MASK) != 0;
	}
	public MessageIdData getConsumerMarkDeletePosition() {
		if (!hasConsumerMarkDeletePosition()) {
			throw new IllegalStateException("Field 'consumer_mark_delete_position' is not set");
		}
		return consumerMarkDeletePosition;
	}
	public MessageIdData setConsumerMarkDeletePosition() {
		if (consumerMarkDeletePosition == null) {
			consumerMarkDeletePosition = new MessageIdData();
		}
		_bitField0 |= _CONSUMER_MARK_DELETE_POSITION_MASK;
		_cachedSize = -1;
		return consumerMarkDeletePosition;
	}
	public CommandGetLastMessageIdResponse clearConsumerMarkDeletePosition() {
		_bitField0 &= ~_CONSUMER_MARK_DELETE_POSITION_MASK;
		if (hasConsumerMarkDeletePosition()) {
			consumerMarkDeletePosition.clear();
		}
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _LAST_MESSAGE_ID_MASK | _REQUEST_ID_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _LAST_MESSAGE_ID_TAG);
		LightProtoCodec.writeVarInt(_b, lastMessageId.getSerializedSize());
		lastMessageId.writeTo(_b);
		LightProtoCodec.writeVarInt(_b, _REQUEST_ID_TAG);
		LightProtoCodec.writeVarInt64(_b, requestId);
		if (hasConsumerMarkDeletePosition()) {
			LightProtoCodec.writeVarInt(_b, _CONSUMER_MARK_DELETE_POSITION_TAG);
			LightProtoCodec.writeVarInt(_b, consumerMarkDeletePosition.getSerializedSize());
			consumerMarkDeletePosition.writeTo(_b);
		}
		return (_b.writerIndex() - _writeIdx);
	}
	public int getSerializedSize() {
		if (_cachedSize > -1) {
			return _cachedSize;
		}

		int _size = 0;
		_size += LightProtoCodec.computeVarIntSize(_LAST_MESSAGE_ID_TAG);
		int MsgsizeLastMessageId = lastMessageId.getSerializedSize();
		_size += LightProtoCodec.computeVarIntSize(MsgsizeLastMessageId) + MsgsizeLastMessageId;
		_size += _REQUEST_ID_TAG_SIZE;
		_size += LightProtoCodec.computeVarInt64Size(requestId);
		if (hasConsumerMarkDeletePosition()) {
			_size += LightProtoCodec.computeVarIntSize(_CONSUMER_MARK_DELETE_POSITION_TAG);
			int MsgsizeConsumerMarkDeletePosition = consumerMarkDeletePosition.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeConsumerMarkDeletePosition)
					+ MsgsizeConsumerMarkDeletePosition;
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
				case _LAST_MESSAGE_ID_TAG :
					_bitField0 |= _LAST_MESSAGE_ID_MASK;
					int lastMessageIdSize = LightProtoCodec.readVarInt(_buffer);
					setLastMessageId().parseFrom(_buffer, lastMessageIdSize);
					break;
				case _REQUEST_ID_TAG :
					_bitField0 |= _REQUEST_ID_MASK;
					requestId = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _CONSUMER_MARK_DELETE_POSITION_TAG :
					_bitField0 |= _CONSUMER_MARK_DELETE_POSITION_MASK;
					int consumerMarkDeletePositionSize = LightProtoCodec.readVarInt(_buffer);
					setConsumerMarkDeletePosition().parseFrom(_buffer, consumerMarkDeletePositionSize);
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
	public CommandGetLastMessageIdResponse clear() {
		if (hasLastMessageId()) {
			lastMessageId.clear();
		}
		if (hasConsumerMarkDeletePosition()) {
			consumerMarkDeletePosition.clear();
		}
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public CommandGetLastMessageIdResponse copyFrom(CommandGetLastMessageIdResponse _other) {
		_cachedSize = -1;
		if (_other.hasLastMessageId()) {
			setLastMessageId().copyFrom(_other.lastMessageId);
		}
		if (_other.hasRequestId()) {
			setRequestId(_other.requestId);
		}
		if (_other.hasConsumerMarkDeletePosition()) {
			setConsumerMarkDeletePosition().copyFrom(_other.consumerMarkDeletePosition);
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
