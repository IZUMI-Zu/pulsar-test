package org.apache.pulsar.common.api.proto;
public final class CommandSeek {
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
	public CommandSeek setConsumerId(long consumerId) {
		this.consumerId = consumerId;
		_bitField0 |= _CONSUMER_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandSeek clearConsumerId() {
		_bitField0 &= ~_CONSUMER_ID_MASK;
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
	public CommandSeek setRequestId(long requestId) {
		this.requestId = requestId;
		_bitField0 |= _REQUEST_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandSeek clearRequestId() {
		_bitField0 &= ~_REQUEST_ID_MASK;
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
	public CommandSeek clearMessageId() {
		_bitField0 &= ~_MESSAGE_ID_MASK;
		if (hasMessageId()) {
			messageId.clear();
		}
		return this;
	}

	private long messagePublishTime;
	private static final int _MESSAGE_PUBLISH_TIME_FIELD_NUMBER = 4;
	private static final int _MESSAGE_PUBLISH_TIME_TAG = (_MESSAGE_PUBLISH_TIME_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _MESSAGE_PUBLISH_TIME_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_MESSAGE_PUBLISH_TIME_TAG);
	private static final int _MESSAGE_PUBLISH_TIME_MASK = 1 << (3 % 32);
	public boolean hasMessagePublishTime() {
		return (_bitField0 & _MESSAGE_PUBLISH_TIME_MASK) != 0;
	}
	public long getMessagePublishTime() {
		if (!hasMessagePublishTime()) {
			throw new IllegalStateException("Field 'message_publish_time' is not set");
		}
		return messagePublishTime;
	}
	public CommandSeek setMessagePublishTime(long messagePublishTime) {
		this.messagePublishTime = messagePublishTime;
		_bitField0 |= _MESSAGE_PUBLISH_TIME_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandSeek clearMessagePublishTime() {
		_bitField0 &= ~_MESSAGE_PUBLISH_TIME_MASK;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _CONSUMER_ID_MASK | _REQUEST_ID_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _CONSUMER_ID_TAG);
		LightProtoCodec.writeVarInt64(_b, consumerId);
		LightProtoCodec.writeVarInt(_b, _REQUEST_ID_TAG);
		LightProtoCodec.writeVarInt64(_b, requestId);
		if (hasMessageId()) {
			LightProtoCodec.writeVarInt(_b, _MESSAGE_ID_TAG);
			LightProtoCodec.writeVarInt(_b, messageId.getSerializedSize());
			messageId.writeTo(_b);
		}
		if (hasMessagePublishTime()) {
			LightProtoCodec.writeVarInt(_b, _MESSAGE_PUBLISH_TIME_TAG);
			LightProtoCodec.writeVarInt64(_b, messagePublishTime);
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
		_size += _REQUEST_ID_TAG_SIZE;
		_size += LightProtoCodec.computeVarInt64Size(requestId);
		if (hasMessageId()) {
			_size += LightProtoCodec.computeVarIntSize(_MESSAGE_ID_TAG);
			int MsgsizeMessageId = messageId.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeMessageId) + MsgsizeMessageId;
		}
		if (hasMessagePublishTime()) {
			_size += _MESSAGE_PUBLISH_TIME_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(messagePublishTime);
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
				case _REQUEST_ID_TAG :
					_bitField0 |= _REQUEST_ID_MASK;
					requestId = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _MESSAGE_ID_TAG :
					_bitField0 |= _MESSAGE_ID_MASK;
					int messageIdSize = LightProtoCodec.readVarInt(_buffer);
					setMessageId().parseFrom(_buffer, messageIdSize);
					break;
				case _MESSAGE_PUBLISH_TIME_TAG :
					_bitField0 |= _MESSAGE_PUBLISH_TIME_MASK;
					messagePublishTime = LightProtoCodec.readVarInt64(_buffer);
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
	public CommandSeek clear() {
		if (hasMessageId()) {
			messageId.clear();
		}
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public CommandSeek copyFrom(CommandSeek _other) {
		_cachedSize = -1;
		if (_other.hasConsumerId()) {
			setConsumerId(_other.consumerId);
		}
		if (_other.hasRequestId()) {
			setRequestId(_other.requestId);
		}
		if (_other.hasMessageId()) {
			setMessageId().copyFrom(_other.messageId);
		}
		if (_other.hasMessagePublishTime()) {
			setMessagePublishTime(_other.messagePublishTime);
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
