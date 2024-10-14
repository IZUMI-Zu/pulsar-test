package org.apache.pulsar.common.api.proto;
public final class CommandRedeliverUnacknowledgedMessages {
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
	public CommandRedeliverUnacknowledgedMessages setConsumerId(long consumerId) {
		this.consumerId = consumerId;
		_bitField0 |= _CONSUMER_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandRedeliverUnacknowledgedMessages clearConsumerId() {
		_bitField0 &= ~_CONSUMER_ID_MASK;
		return this;
	}

	private java.util.List<MessageIdData> messageIds = null;
	private int _messageIdsCount = 0;
	private static final int _MESSAGE_IDS_FIELD_NUMBER = 2;
	private static final int _MESSAGE_IDS_TAG = (_MESSAGE_IDS_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _MESSAGE_IDS_TAG_SIZE = LightProtoCodec.computeVarIntSize(_MESSAGE_IDS_TAG);
	public int getMessageIdsCount() {
		return _messageIdsCount;
	}
	public MessageIdData getMessageIdAt(int idx) {
		if (idx < 0 || idx >= _messageIdsCount) {
			throw new IndexOutOfBoundsException(
					"Index " + idx + " is out of the list size (" + _messageIdsCount + ") for field 'message_ids'");
		}
		return messageIds.get(idx);
	}
	public java.util.List<MessageIdData> getMessageIdsList() {
		if (_messageIdsCount == 0) {
			return java.util.Collections.emptyList();
		} else {
			return messageIds.subList(0, _messageIdsCount);
		}
	}
	public MessageIdData addMessageId() {
		if (messageIds == null) {
			messageIds = new java.util.ArrayList<MessageIdData>();
		}
		if (messageIds.size() == _messageIdsCount) {
			messageIds.add(new MessageIdData());
		}
		_cachedSize = -1;
		return messageIds.get(_messageIdsCount++);
	}
	public CommandRedeliverUnacknowledgedMessages addAllMessageIds(Iterable<MessageIdData> messageIds) {
		for (MessageIdData _o : messageIds) {
			addMessageId().copyFrom(_o);
		}
		return this;
	}
	public CommandRedeliverUnacknowledgedMessages clearMessageIds() {
		for (int i = 0; i < _messageIdsCount; i++) {
			messageIds.get(i).clear();
		}
		_messageIdsCount = 0;
		return this;
	}

	private long consumerEpoch;
	private static final int _CONSUMER_EPOCH_FIELD_NUMBER = 3;
	private static final int _CONSUMER_EPOCH_TAG = (_CONSUMER_EPOCH_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _CONSUMER_EPOCH_TAG_SIZE = LightProtoCodec.computeVarIntSize(_CONSUMER_EPOCH_TAG);
	private static final int _CONSUMER_EPOCH_MASK = 1 << (2 % 32);
	public boolean hasConsumerEpoch() {
		return (_bitField0 & _CONSUMER_EPOCH_MASK) != 0;
	}
	public long getConsumerEpoch() {
		if (!hasConsumerEpoch()) {
			throw new IllegalStateException("Field 'consumer_epoch' is not set");
		}
		return consumerEpoch;
	}
	public CommandRedeliverUnacknowledgedMessages setConsumerEpoch(long consumerEpoch) {
		this.consumerEpoch = consumerEpoch;
		_bitField0 |= _CONSUMER_EPOCH_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandRedeliverUnacknowledgedMessages clearConsumerEpoch() {
		_bitField0 &= ~_CONSUMER_EPOCH_MASK;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _CONSUMER_ID_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _CONSUMER_ID_TAG);
		LightProtoCodec.writeVarInt64(_b, consumerId);
		for (int i = 0; i < _messageIdsCount; i++) {
			MessageIdData _item = messageIds.get(i);
			LightProtoCodec.writeVarInt(_b, _MESSAGE_IDS_TAG);
			LightProtoCodec.writeVarInt(_b, _item.getSerializedSize());
			_item.writeTo(_b);
		}
		if (hasConsumerEpoch()) {
			LightProtoCodec.writeVarInt(_b, _CONSUMER_EPOCH_TAG);
			LightProtoCodec.writeVarInt64(_b, consumerEpoch);
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
		for (int i = 0; i < _messageIdsCount; i++) {
			MessageIdData _item = messageIds.get(i);
			_size += _MESSAGE_IDS_TAG_SIZE;
			int MsgsizeMessageIds = _item.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeMessageIds) + MsgsizeMessageIds;
		}
		if (hasConsumerEpoch()) {
			_size += _CONSUMER_EPOCH_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(consumerEpoch);
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
				case _MESSAGE_IDS_TAG :
					int _messageIdsSize = LightProtoCodec.readVarInt(_buffer);
					addMessageId().parseFrom(_buffer, _messageIdsSize);
					break;
				case _CONSUMER_EPOCH_TAG :
					_bitField0 |= _CONSUMER_EPOCH_MASK;
					consumerEpoch = LightProtoCodec.readVarInt64(_buffer);
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
	public CommandRedeliverUnacknowledgedMessages clear() {
		for (int i = 0; i < _messageIdsCount; i++) {
			messageIds.get(i).clear();
		}
		_messageIdsCount = 0;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public CommandRedeliverUnacknowledgedMessages copyFrom(CommandRedeliverUnacknowledgedMessages _other) {
		_cachedSize = -1;
		if (_other.hasConsumerId()) {
			setConsumerId(_other.consumerId);
		}
		for (int i = 0; i < _other.getMessageIdsCount(); i++) {
			addMessageId().copyFrom(_other.getMessageIdAt(i));
		}
		if (_other.hasConsumerEpoch()) {
			setConsumerEpoch(_other.consumerEpoch);
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
