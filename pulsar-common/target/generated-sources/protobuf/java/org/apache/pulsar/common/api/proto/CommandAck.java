package org.apache.pulsar.common.api.proto;
public final class CommandAck {
	public enum AckType {
		Individual(0), Cumulative(1),;
		private final int value;
		private AckType(int value) {
			this.value = value;
		}
		public int getValue() {
			return value;
		}
		public static AckType valueOf(int n) {
			switch (n) {
				case 0 :
					return Individual;
				case 1 :
					return Cumulative;
				default :
					return null;

			}
		}
		public static final int Individual_VALUE = 0;
		public static final int Cumulative_VALUE = 1;
	}

	public enum ValidationError {
		UncompressedSizeCorruption(0), DecompressionError(1), ChecksumMismatch(2), BatchDeSerializeError(
				3), DecryptionError(4),;
		private final int value;
		private ValidationError(int value) {
			this.value = value;
		}
		public int getValue() {
			return value;
		}
		public static ValidationError valueOf(int n) {
			switch (n) {
				case 0 :
					return UncompressedSizeCorruption;
				case 1 :
					return DecompressionError;
				case 2 :
					return ChecksumMismatch;
				case 3 :
					return BatchDeSerializeError;
				case 4 :
					return DecryptionError;
				default :
					return null;

			}
		}
		public static final int UncompressedSizeCorruption_VALUE = 0;
		public static final int DecompressionError_VALUE = 1;
		public static final int ChecksumMismatch_VALUE = 2;
		public static final int BatchDeSerializeError_VALUE = 3;
		public static final int DecryptionError_VALUE = 4;
	}

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
	public CommandAck setConsumerId(long consumerId) {
		this.consumerId = consumerId;
		_bitField0 |= _CONSUMER_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandAck clearConsumerId() {
		_bitField0 &= ~_CONSUMER_ID_MASK;
		return this;
	}

	private AckType ackType;
	private static final int _ACK_TYPE_FIELD_NUMBER = 2;
	private static final int _ACK_TYPE_TAG = (_ACK_TYPE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _ACK_TYPE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_ACK_TYPE_TAG);
	private static final int _ACK_TYPE_MASK = 1 << (1 % 32);
	public boolean hasAckType() {
		return (_bitField0 & _ACK_TYPE_MASK) != 0;
	}
	public AckType getAckType() {
		if (!hasAckType()) {
			throw new IllegalStateException("Field 'ack_type' is not set");
		}
		return ackType;
	}
	public CommandAck setAckType(AckType ackType) {
		this.ackType = ackType;
		_bitField0 |= _ACK_TYPE_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandAck clearAckType() {
		_bitField0 &= ~_ACK_TYPE_MASK;
		return this;
	}

	private java.util.List<MessageIdData> messageIds = null;
	private int _messageIdsCount = 0;
	private static final int _MESSAGE_ID_FIELD_NUMBER = 3;
	private static final int _MESSAGE_ID_TAG = (_MESSAGE_ID_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _MESSAGE_ID_TAG_SIZE = LightProtoCodec.computeVarIntSize(_MESSAGE_ID_TAG);
	public int getMessageIdsCount() {
		return _messageIdsCount;
	}
	public MessageIdData getMessageIdAt(int idx) {
		if (idx < 0 || idx >= _messageIdsCount) {
			throw new IndexOutOfBoundsException(
					"Index " + idx + " is out of the list size (" + _messageIdsCount + ") for field 'message_id'");
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
	public CommandAck addAllMessageIds(Iterable<MessageIdData> messageIds) {
		for (MessageIdData _o : messageIds) {
			addMessageId().copyFrom(_o);
		}
		return this;
	}
	public CommandAck clearMessageId() {
		for (int i = 0; i < _messageIdsCount; i++) {
			messageIds.get(i).clear();
		}
		_messageIdsCount = 0;
		return this;
	}

	private ValidationError validationError;
	private static final int _VALIDATION_ERROR_FIELD_NUMBER = 4;
	private static final int _VALIDATION_ERROR_TAG = (_VALIDATION_ERROR_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _VALIDATION_ERROR_TAG_SIZE = LightProtoCodec.computeVarIntSize(_VALIDATION_ERROR_TAG);
	private static final int _VALIDATION_ERROR_MASK = 1 << (3 % 32);
	public boolean hasValidationError() {
		return (_bitField0 & _VALIDATION_ERROR_MASK) != 0;
	}
	public ValidationError getValidationError() {
		if (!hasValidationError()) {
			throw new IllegalStateException("Field 'validation_error' is not set");
		}
		return validationError;
	}
	public CommandAck setValidationError(ValidationError validationError) {
		this.validationError = validationError;
		_bitField0 |= _VALIDATION_ERROR_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandAck clearValidationError() {
		_bitField0 &= ~_VALIDATION_ERROR_MASK;
		return this;
	}

	private java.util.List<KeyLongValue> properties = null;
	private int _propertiesCount = 0;
	private static final int _PROPERTIES_FIELD_NUMBER = 5;
	private static final int _PROPERTIES_TAG = (_PROPERTIES_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _PROPERTIES_TAG_SIZE = LightProtoCodec.computeVarIntSize(_PROPERTIES_TAG);
	public int getPropertiesCount() {
		return _propertiesCount;
	}
	public KeyLongValue getPropertyAt(int idx) {
		if (idx < 0 || idx >= _propertiesCount) {
			throw new IndexOutOfBoundsException(
					"Index " + idx + " is out of the list size (" + _propertiesCount + ") for field 'properties'");
		}
		return properties.get(idx);
	}
	public java.util.List<KeyLongValue> getPropertiesList() {
		if (_propertiesCount == 0) {
			return java.util.Collections.emptyList();
		} else {
			return properties.subList(0, _propertiesCount);
		}
	}
	public KeyLongValue addProperty() {
		if (properties == null) {
			properties = new java.util.ArrayList<KeyLongValue>();
		}
		if (properties.size() == _propertiesCount) {
			properties.add(new KeyLongValue());
		}
		_cachedSize = -1;
		return properties.get(_propertiesCount++);
	}
	public CommandAck addAllProperties(Iterable<KeyLongValue> properties) {
		for (KeyLongValue _o : properties) {
			addProperty().copyFrom(_o);
		}
		return this;
	}
	public CommandAck clearProperties() {
		for (int i = 0; i < _propertiesCount; i++) {
			properties.get(i).clear();
		}
		_propertiesCount = 0;
		return this;
	}

	private long txnidLeastBits = 0;
	private static final int _TXNID_LEAST_BITS_FIELD_NUMBER = 6;
	private static final int _TXNID_LEAST_BITS_TAG = (_TXNID_LEAST_BITS_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _TXNID_LEAST_BITS_TAG_SIZE = LightProtoCodec.computeVarIntSize(_TXNID_LEAST_BITS_TAG);
	private static final int _TXNID_LEAST_BITS_MASK = 1 << (5 % 32);
	public boolean hasTxnidLeastBits() {
		return (_bitField0 & _TXNID_LEAST_BITS_MASK) != 0;
	}
	public long getTxnidLeastBits() {
		return txnidLeastBits;
	}
	public CommandAck setTxnidLeastBits(long txnidLeastBits) {
		this.txnidLeastBits = txnidLeastBits;
		_bitField0 |= _TXNID_LEAST_BITS_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandAck clearTxnidLeastBits() {
		_bitField0 &= ~_TXNID_LEAST_BITS_MASK;
		txnidLeastBits = 0;
		return this;
	}

	private long txnidMostBits = 0;
	private static final int _TXNID_MOST_BITS_FIELD_NUMBER = 7;
	private static final int _TXNID_MOST_BITS_TAG = (_TXNID_MOST_BITS_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _TXNID_MOST_BITS_TAG_SIZE = LightProtoCodec.computeVarIntSize(_TXNID_MOST_BITS_TAG);
	private static final int _TXNID_MOST_BITS_MASK = 1 << (6 % 32);
	public boolean hasTxnidMostBits() {
		return (_bitField0 & _TXNID_MOST_BITS_MASK) != 0;
	}
	public long getTxnidMostBits() {
		return txnidMostBits;
	}
	public CommandAck setTxnidMostBits(long txnidMostBits) {
		this.txnidMostBits = txnidMostBits;
		_bitField0 |= _TXNID_MOST_BITS_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandAck clearTxnidMostBits() {
		_bitField0 &= ~_TXNID_MOST_BITS_MASK;
		txnidMostBits = 0;
		return this;
	}

	private long requestId;
	private static final int _REQUEST_ID_FIELD_NUMBER = 8;
	private static final int _REQUEST_ID_TAG = (_REQUEST_ID_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _REQUEST_ID_TAG_SIZE = LightProtoCodec.computeVarIntSize(_REQUEST_ID_TAG);
	private static final int _REQUEST_ID_MASK = 1 << (7 % 32);
	public boolean hasRequestId() {
		return (_bitField0 & _REQUEST_ID_MASK) != 0;
	}
	public long getRequestId() {
		if (!hasRequestId()) {
			throw new IllegalStateException("Field 'request_id' is not set");
		}
		return requestId;
	}
	public CommandAck setRequestId(long requestId) {
		this.requestId = requestId;
		_bitField0 |= _REQUEST_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandAck clearRequestId() {
		_bitField0 &= ~_REQUEST_ID_MASK;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _CONSUMER_ID_MASK | _ACK_TYPE_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _CONSUMER_ID_TAG);
		LightProtoCodec.writeVarInt64(_b, consumerId);
		LightProtoCodec.writeVarInt(_b, _ACK_TYPE_TAG);
		LightProtoCodec.writeVarInt(_b, ackType.getValue());
		for (int i = 0; i < _messageIdsCount; i++) {
			MessageIdData _item = messageIds.get(i);
			LightProtoCodec.writeVarInt(_b, _MESSAGE_ID_TAG);
			LightProtoCodec.writeVarInt(_b, _item.getSerializedSize());
			_item.writeTo(_b);
		}
		if (hasValidationError()) {
			LightProtoCodec.writeVarInt(_b, _VALIDATION_ERROR_TAG);
			LightProtoCodec.writeVarInt(_b, validationError.getValue());
		}
		for (int i = 0; i < _propertiesCount; i++) {
			KeyLongValue _item = properties.get(i);
			LightProtoCodec.writeVarInt(_b, _PROPERTIES_TAG);
			LightProtoCodec.writeVarInt(_b, _item.getSerializedSize());
			_item.writeTo(_b);
		}
		if (hasTxnidLeastBits()) {
			LightProtoCodec.writeVarInt(_b, _TXNID_LEAST_BITS_TAG);
			LightProtoCodec.writeVarInt64(_b, txnidLeastBits);
		}
		if (hasTxnidMostBits()) {
			LightProtoCodec.writeVarInt(_b, _TXNID_MOST_BITS_TAG);
			LightProtoCodec.writeVarInt64(_b, txnidMostBits);
		}
		if (hasRequestId()) {
			LightProtoCodec.writeVarInt(_b, _REQUEST_ID_TAG);
			LightProtoCodec.writeVarInt64(_b, requestId);
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
		_size += _ACK_TYPE_TAG_SIZE;
		_size += LightProtoCodec.computeVarIntSize(ackType.getValue());
		for (int i = 0; i < _messageIdsCount; i++) {
			MessageIdData _item = messageIds.get(i);
			_size += _MESSAGE_ID_TAG_SIZE;
			int MsgsizeMessageId = _item.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeMessageId) + MsgsizeMessageId;
		}
		if (hasValidationError()) {
			_size += _VALIDATION_ERROR_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(validationError.getValue());
		}
		for (int i = 0; i < _propertiesCount; i++) {
			KeyLongValue _item = properties.get(i);
			_size += _PROPERTIES_TAG_SIZE;
			int MsgsizeProperties = _item.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeProperties) + MsgsizeProperties;
		}
		if (hasTxnidLeastBits()) {
			_size += _TXNID_LEAST_BITS_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(txnidLeastBits);
		}
		if (hasTxnidMostBits()) {
			_size += _TXNID_MOST_BITS_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(txnidMostBits);
		}
		if (hasRequestId()) {
			_size += _REQUEST_ID_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(requestId);
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
				case _ACK_TYPE_TAG :
					AckType _ackType = AckType.valueOf(LightProtoCodec.readVarInt(_buffer));
					if (_ackType != null) {
						_bitField0 |= _ACK_TYPE_MASK;
						ackType = _ackType;
					}
					break;
				case _MESSAGE_ID_TAG :
					int _messageIdSize = LightProtoCodec.readVarInt(_buffer);
					addMessageId().parseFrom(_buffer, _messageIdSize);
					break;
				case _VALIDATION_ERROR_TAG :
					ValidationError _validationError = ValidationError.valueOf(LightProtoCodec.readVarInt(_buffer));
					if (_validationError != null) {
						_bitField0 |= _VALIDATION_ERROR_MASK;
						validationError = _validationError;
					}
					break;
				case _PROPERTIES_TAG :
					int _propertiesSize = LightProtoCodec.readVarInt(_buffer);
					addProperty().parseFrom(_buffer, _propertiesSize);
					break;
				case _TXNID_LEAST_BITS_TAG :
					_bitField0 |= _TXNID_LEAST_BITS_MASK;
					txnidLeastBits = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _TXNID_MOST_BITS_TAG :
					_bitField0 |= _TXNID_MOST_BITS_MASK;
					txnidMostBits = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _REQUEST_ID_TAG :
					_bitField0 |= _REQUEST_ID_MASK;
					requestId = LightProtoCodec.readVarInt64(_buffer);
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
	public CommandAck clear() {
		for (int i = 0; i < _messageIdsCount; i++) {
			messageIds.get(i).clear();
		}
		_messageIdsCount = 0;
		for (int i = 0; i < _propertiesCount; i++) {
			properties.get(i).clear();
		}
		_propertiesCount = 0;
		txnidLeastBits = 0;
		txnidMostBits = 0;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public CommandAck copyFrom(CommandAck _other) {
		_cachedSize = -1;
		if (_other.hasConsumerId()) {
			setConsumerId(_other.consumerId);
		}
		if (_other.hasAckType()) {
			setAckType(_other.ackType);
		}
		for (int i = 0; i < _other.getMessageIdsCount(); i++) {
			addMessageId().copyFrom(_other.getMessageIdAt(i));
		}
		if (_other.hasValidationError()) {
			setValidationError(_other.validationError);
		}
		for (int i = 0; i < _other.getPropertiesCount(); i++) {
			addProperty().copyFrom(_other.getPropertyAt(i));
		}
		if (_other.hasTxnidLeastBits()) {
			setTxnidLeastBits(_other.txnidLeastBits);
		}
		if (_other.hasTxnidMostBits()) {
			setTxnidMostBits(_other.txnidMostBits);
		}
		if (_other.hasRequestId()) {
			setRequestId(_other.requestId);
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
