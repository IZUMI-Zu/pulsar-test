package org.apache.pulsar.common.api.proto;
public final class CommandMessage {
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
	public CommandMessage setConsumerId(long consumerId) {
		this.consumerId = consumerId;
		_bitField0 |= _CONSUMER_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandMessage clearConsumerId() {
		_bitField0 &= ~_CONSUMER_ID_MASK;
		return this;
	}

	private MessageIdData messageId;
	private static final int _MESSAGE_ID_FIELD_NUMBER = 2;
	private static final int _MESSAGE_ID_TAG = (_MESSAGE_ID_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _MESSAGE_ID_TAG_SIZE = LightProtoCodec.computeVarIntSize(_MESSAGE_ID_TAG);
	private static final int _MESSAGE_ID_MASK = 1 << (1 % 32);
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
	public CommandMessage clearMessageId() {
		_bitField0 &= ~_MESSAGE_ID_MASK;
		if (hasMessageId()) {
			messageId.clear();
		}
		return this;
	}

	private int redeliveryCount = 0;
	private static final int _REDELIVERY_COUNT_FIELD_NUMBER = 3;
	private static final int _REDELIVERY_COUNT_TAG = (_REDELIVERY_COUNT_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _REDELIVERY_COUNT_TAG_SIZE = LightProtoCodec.computeVarIntSize(_REDELIVERY_COUNT_TAG);
	private static final int _REDELIVERY_COUNT_MASK = 1 << (2 % 32);
	public boolean hasRedeliveryCount() {
		return (_bitField0 & _REDELIVERY_COUNT_MASK) != 0;
	}
	public int getRedeliveryCount() {
		return redeliveryCount;
	}
	public CommandMessage setRedeliveryCount(int redeliveryCount) {
		this.redeliveryCount = redeliveryCount;
		_bitField0 |= _REDELIVERY_COUNT_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandMessage clearRedeliveryCount() {
		_bitField0 &= ~_REDELIVERY_COUNT_MASK;
		redeliveryCount = 0;
		return this;
	}

	private long[] ackSets = null;
	private int _ackSetsCount = 0;
	private static final int _ACK_SET_FIELD_NUMBER = 4;
	private static final int _ACK_SET_TAG = (_ACK_SET_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _ACK_SET_TAG_SIZE = LightProtoCodec.computeVarIntSize(_ACK_SET_TAG);
	private static final int _ACK_SET_TAG_PACKED = (_ACK_SET_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	public int getAckSetsCount() {
		return _ackSetsCount;
	}
	public long getAckSetAt(int idx) {
		if (idx < 0 || idx >= _ackSetsCount) {
			throw new IndexOutOfBoundsException(
					"Index " + idx + " is out of the list size (" + _ackSetsCount + ") for field 'ack_set'");
		}
		return ackSets[idx];
	}
	public void addAckSet(long ackSet) {
		if (ackSets == null) {
			ackSets = new long[4];
		}
		if (ackSets.length == _ackSetsCount) {
			ackSets = java.util.Arrays.copyOf(ackSets, _ackSetsCount * 2);
		}
		_cachedSize = -1;
		ackSets[_ackSetsCount++] = ackSet;
	}
	public CommandMessage clearAckSet() {
		_ackSetsCount = 0;
		return this;
	}

	private long consumerEpoch;
	private static final int _CONSUMER_EPOCH_FIELD_NUMBER = 5;
	private static final int _CONSUMER_EPOCH_TAG = (_CONSUMER_EPOCH_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _CONSUMER_EPOCH_TAG_SIZE = LightProtoCodec.computeVarIntSize(_CONSUMER_EPOCH_TAG);
	private static final int _CONSUMER_EPOCH_MASK = 1 << (4 % 32);
	public boolean hasConsumerEpoch() {
		return (_bitField0 & _CONSUMER_EPOCH_MASK) != 0;
	}
	public long getConsumerEpoch() {
		if (!hasConsumerEpoch()) {
			throw new IllegalStateException("Field 'consumer_epoch' is not set");
		}
		return consumerEpoch;
	}
	public CommandMessage setConsumerEpoch(long consumerEpoch) {
		this.consumerEpoch = consumerEpoch;
		_bitField0 |= _CONSUMER_EPOCH_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandMessage clearConsumerEpoch() {
		_bitField0 &= ~_CONSUMER_EPOCH_MASK;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _CONSUMER_ID_MASK | _MESSAGE_ID_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _CONSUMER_ID_TAG);
		LightProtoCodec.writeVarInt64(_b, consumerId);
		LightProtoCodec.writeVarInt(_b, _MESSAGE_ID_TAG);
		LightProtoCodec.writeVarInt(_b, messageId.getSerializedSize());
		messageId.writeTo(_b);
		if (hasRedeliveryCount()) {
			LightProtoCodec.writeVarInt(_b, _REDELIVERY_COUNT_TAG);
			LightProtoCodec.writeVarInt(_b, redeliveryCount);
		}
		for (int i = 0; i < _ackSetsCount; i++) {
			long _item = ackSets[i];
			LightProtoCodec.writeVarInt(_b, _ACK_SET_TAG);
			LightProtoCodec.writeVarInt64(_b, _item);
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
		_size += LightProtoCodec.computeVarIntSize(_MESSAGE_ID_TAG);
		int MsgsizeMessageId = messageId.getSerializedSize();
		_size += LightProtoCodec.computeVarIntSize(MsgsizeMessageId) + MsgsizeMessageId;
		if (hasRedeliveryCount()) {
			_size += _REDELIVERY_COUNT_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(redeliveryCount);
		}
		for (int i = 0; i < _ackSetsCount; i++) {
			long _item = ackSets[i];
			_size += _ACK_SET_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(_item);
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
				case _MESSAGE_ID_TAG :
					_bitField0 |= _MESSAGE_ID_MASK;
					int messageIdSize = LightProtoCodec.readVarInt(_buffer);
					setMessageId().parseFrom(_buffer, messageIdSize);
					break;
				case _REDELIVERY_COUNT_TAG :
					_bitField0 |= _REDELIVERY_COUNT_MASK;
					redeliveryCount = LightProtoCodec.readVarInt(_buffer);
					break;
				case _ACK_SET_TAG :
					addAckSet(LightProtoCodec.readVarInt64(_buffer));
					break;
				case _CONSUMER_EPOCH_TAG :
					_bitField0 |= _CONSUMER_EPOCH_MASK;
					consumerEpoch = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _ACK_SET_TAG_PACKED :
					int _ackSetSize = LightProtoCodec.readVarInt(_buffer);
					int _ackSetEndIdx = _buffer.readerIndex() + _ackSetSize;
					while (_buffer.readerIndex() < _ackSetEndIdx) {
						addAckSet(LightProtoCodec.readVarInt64(_buffer));
					}
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
	public CommandMessage clear() {
		if (hasMessageId()) {
			messageId.clear();
		}
		redeliveryCount = 0;
		_ackSetsCount = 0;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public CommandMessage copyFrom(CommandMessage _other) {
		_cachedSize = -1;
		if (_other.hasConsumerId()) {
			setConsumerId(_other.consumerId);
		}
		if (_other.hasMessageId()) {
			setMessageId().copyFrom(_other.messageId);
		}
		if (_other.hasRedeliveryCount()) {
			setRedeliveryCount(_other.redeliveryCount);
		}
		for (int i = 0; i < _other.getAckSetsCount(); i++) {
			addAckSet(_other.getAckSetAt(i));
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
