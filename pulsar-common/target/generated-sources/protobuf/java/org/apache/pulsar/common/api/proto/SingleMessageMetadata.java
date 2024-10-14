package org.apache.pulsar.common.api.proto;
public final class SingleMessageMetadata {
	private java.util.List<KeyValue> properties = null;
	private int _propertiesCount = 0;
	private static final int _PROPERTIES_FIELD_NUMBER = 1;
	private static final int _PROPERTIES_TAG = (_PROPERTIES_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _PROPERTIES_TAG_SIZE = LightProtoCodec.computeVarIntSize(_PROPERTIES_TAG);
	public int getPropertiesCount() {
		return _propertiesCount;
	}
	public KeyValue getPropertyAt(int idx) {
		if (idx < 0 || idx >= _propertiesCount) {
			throw new IndexOutOfBoundsException(
					"Index " + idx + " is out of the list size (" + _propertiesCount + ") for field 'properties'");
		}
		return properties.get(idx);
	}
	public java.util.List<KeyValue> getPropertiesList() {
		if (_propertiesCount == 0) {
			return java.util.Collections.emptyList();
		} else {
			return properties.subList(0, _propertiesCount);
		}
	}
	public KeyValue addProperty() {
		if (properties == null) {
			properties = new java.util.ArrayList<KeyValue>();
		}
		if (properties.size() == _propertiesCount) {
			properties.add(new KeyValue());
		}
		_cachedSize = -1;
		return properties.get(_propertiesCount++);
	}
	public SingleMessageMetadata addAllProperties(Iterable<KeyValue> properties) {
		for (KeyValue _o : properties) {
			addProperty().copyFrom(_o);
		}
		return this;
	}
	public SingleMessageMetadata clearProperties() {
		for (int i = 0; i < _propertiesCount; i++) {
			properties.get(i).clear();
		}
		_propertiesCount = 0;
		return this;
	}

	private String partitionKey;
	private int _partitionKeyBufferIdx = -1;
	private int _partitionKeyBufferLen = -1;
	private static final int _PARTITION_KEY_FIELD_NUMBER = 2;
	private static final int _PARTITION_KEY_TAG = (_PARTITION_KEY_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _PARTITION_KEY_TAG_SIZE = LightProtoCodec.computeVarIntSize(_PARTITION_KEY_TAG);
	private static final int _PARTITION_KEY_MASK = 1 << (1 % 32);
	public boolean hasPartitionKey() {
		return (_bitField0 & _PARTITION_KEY_MASK) != 0;
	}
	public String getPartitionKey() {
		if (!hasPartitionKey()) {
			throw new IllegalStateException("Field 'partition_key' is not set");
		}
		if (partitionKey == null) {
			partitionKey = LightProtoCodec.readString(_parsedBuffer, _partitionKeyBufferIdx, _partitionKeyBufferLen);
		}
		return partitionKey;
	}
	public SingleMessageMetadata setPartitionKey(String partitionKey) {
		this.partitionKey = partitionKey;
		_bitField0 |= _PARTITION_KEY_MASK;
		_partitionKeyBufferIdx = -1;
		_partitionKeyBufferLen = LightProtoCodec.computeStringUTF8Size(partitionKey);
		_cachedSize = -1;
		return this;
	}
	public SingleMessageMetadata clearPartitionKey() {
		_bitField0 &= ~_PARTITION_KEY_MASK;
		partitionKey = null;
		_partitionKeyBufferIdx = -1;
		_partitionKeyBufferLen = -1;
		return this;
	}

	private int payloadSize;
	private static final int _PAYLOAD_SIZE_FIELD_NUMBER = 3;
	private static final int _PAYLOAD_SIZE_TAG = (_PAYLOAD_SIZE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _PAYLOAD_SIZE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_PAYLOAD_SIZE_TAG);
	private static final int _PAYLOAD_SIZE_MASK = 1 << (2 % 32);
	public boolean hasPayloadSize() {
		return (_bitField0 & _PAYLOAD_SIZE_MASK) != 0;
	}
	public int getPayloadSize() {
		if (!hasPayloadSize()) {
			throw new IllegalStateException("Field 'payload_size' is not set");
		}
		return payloadSize;
	}
	public SingleMessageMetadata setPayloadSize(int payloadSize) {
		this.payloadSize = payloadSize;
		_bitField0 |= _PAYLOAD_SIZE_MASK;
		_cachedSize = -1;
		return this;
	}
	public SingleMessageMetadata clearPayloadSize() {
		_bitField0 &= ~_PAYLOAD_SIZE_MASK;
		return this;
	}

	private boolean compactedOut = false;
	private static final int _COMPACTED_OUT_FIELD_NUMBER = 4;
	private static final int _COMPACTED_OUT_TAG = (_COMPACTED_OUT_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _COMPACTED_OUT_TAG_SIZE = LightProtoCodec.computeVarIntSize(_COMPACTED_OUT_TAG);
	private static final int _COMPACTED_OUT_MASK = 1 << (3 % 32);
	public boolean hasCompactedOut() {
		return (_bitField0 & _COMPACTED_OUT_MASK) != 0;
	}
	public boolean isCompactedOut() {
		return compactedOut;
	}
	public SingleMessageMetadata setCompactedOut(boolean compactedOut) {
		this.compactedOut = compactedOut;
		_bitField0 |= _COMPACTED_OUT_MASK;
		_cachedSize = -1;
		return this;
	}
	public SingleMessageMetadata clearCompactedOut() {
		_bitField0 &= ~_COMPACTED_OUT_MASK;
		compactedOut = false;
		return this;
	}

	private long eventTime = 0;
	private static final int _EVENT_TIME_FIELD_NUMBER = 5;
	private static final int _EVENT_TIME_TAG = (_EVENT_TIME_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _EVENT_TIME_TAG_SIZE = LightProtoCodec.computeVarIntSize(_EVENT_TIME_TAG);
	private static final int _EVENT_TIME_MASK = 1 << (4 % 32);
	public boolean hasEventTime() {
		return (_bitField0 & _EVENT_TIME_MASK) != 0;
	}
	public long getEventTime() {
		return eventTime;
	}
	public SingleMessageMetadata setEventTime(long eventTime) {
		this.eventTime = eventTime;
		_bitField0 |= _EVENT_TIME_MASK;
		_cachedSize = -1;
		return this;
	}
	public SingleMessageMetadata clearEventTime() {
		_bitField0 &= ~_EVENT_TIME_MASK;
		eventTime = 0;
		return this;
	}

	private boolean partitionKeyB64Encoded = false;
	private static final int _PARTITION_KEY_B64_ENCODED_FIELD_NUMBER = 6;
	private static final int _PARTITION_KEY_B64_ENCODED_TAG = (_PARTITION_KEY_B64_ENCODED_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _PARTITION_KEY_B64_ENCODED_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_PARTITION_KEY_B64_ENCODED_TAG);
	private static final int _PARTITION_KEY_B64_ENCODED_MASK = 1 << (5 % 32);
	public boolean hasPartitionKeyB64Encoded() {
		return (_bitField0 & _PARTITION_KEY_B64_ENCODED_MASK) != 0;
	}
	public boolean isPartitionKeyB64Encoded() {
		return partitionKeyB64Encoded;
	}
	public SingleMessageMetadata setPartitionKeyB64Encoded(boolean partitionKeyB64Encoded) {
		this.partitionKeyB64Encoded = partitionKeyB64Encoded;
		_bitField0 |= _PARTITION_KEY_B64_ENCODED_MASK;
		_cachedSize = -1;
		return this;
	}
	public SingleMessageMetadata clearPartitionKeyB64Encoded() {
		_bitField0 &= ~_PARTITION_KEY_B64_ENCODED_MASK;
		partitionKeyB64Encoded = false;
		return this;
	}

	private io.netty.buffer.ByteBuf orderingKey = null;
	private int _orderingKeyIdx = -1;
	private int _orderingKeyLen = -1;
	private static final int _ORDERING_KEY_FIELD_NUMBER = 7;
	private static final int _ORDERING_KEY_TAG = (_ORDERING_KEY_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _ORDERING_KEY_TAG_SIZE = LightProtoCodec.computeVarIntSize(_ORDERING_KEY_TAG);
	private static final int _ORDERING_KEY_MASK = 1 << (6 % 32);
	public boolean hasOrderingKey() {
		return (_bitField0 & _ORDERING_KEY_MASK) != 0;
	}
	public int getOrderingKeySize() {
		if (!hasOrderingKey()) {
			throw new IllegalStateException("Field 'ordering_key' is not set");
		}
		return _orderingKeyLen;
	}
	public byte[] getOrderingKey() {
		io.netty.buffer.ByteBuf _b = getOrderingKeySlice();
		byte[] res = new byte[_b.readableBytes()];
		_b.getBytes(0, res);
		return res;
	}
	public io.netty.buffer.ByteBuf getOrderingKeySlice() {
		if (!hasOrderingKey()) {
			throw new IllegalStateException("Field 'ordering_key' is not set");
		}
		if (orderingKey == null) {
			return _parsedBuffer.slice(_orderingKeyIdx, _orderingKeyLen);
		} else {
			return orderingKey.slice(0, _orderingKeyLen);
		}
	}
	public SingleMessageMetadata setOrderingKey(byte[] orderingKey) {
		setOrderingKey(io.netty.buffer.Unpooled.wrappedBuffer(orderingKey));
		return this;
	}
	public SingleMessageMetadata setOrderingKey(io.netty.buffer.ByteBuf orderingKey) {
		this.orderingKey = orderingKey;
		_bitField0 |= _ORDERING_KEY_MASK;
		_orderingKeyIdx = -1;
		_orderingKeyLen = orderingKey.readableBytes();
		_cachedSize = -1;
		return this;
	}
	public SingleMessageMetadata clearOrderingKey() {
		_bitField0 &= ~_ORDERING_KEY_MASK;
		orderingKey = null;
		_orderingKeyIdx = -1;
		_orderingKeyLen = -1;
		return this;
	}

	private long sequenceId;
	private static final int _SEQUENCE_ID_FIELD_NUMBER = 8;
	private static final int _SEQUENCE_ID_TAG = (_SEQUENCE_ID_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _SEQUENCE_ID_TAG_SIZE = LightProtoCodec.computeVarIntSize(_SEQUENCE_ID_TAG);
	private static final int _SEQUENCE_ID_MASK = 1 << (7 % 32);
	public boolean hasSequenceId() {
		return (_bitField0 & _SEQUENCE_ID_MASK) != 0;
	}
	public long getSequenceId() {
		if (!hasSequenceId()) {
			throw new IllegalStateException("Field 'sequence_id' is not set");
		}
		return sequenceId;
	}
	public SingleMessageMetadata setSequenceId(long sequenceId) {
		this.sequenceId = sequenceId;
		_bitField0 |= _SEQUENCE_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public SingleMessageMetadata clearSequenceId() {
		_bitField0 &= ~_SEQUENCE_ID_MASK;
		return this;
	}

	private boolean nullValue = false;
	private static final int _NULL_VALUE_FIELD_NUMBER = 9;
	private static final int _NULL_VALUE_TAG = (_NULL_VALUE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _NULL_VALUE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_NULL_VALUE_TAG);
	private static final int _NULL_VALUE_MASK = 1 << (8 % 32);
	public boolean hasNullValue() {
		return (_bitField0 & _NULL_VALUE_MASK) != 0;
	}
	public boolean isNullValue() {
		return nullValue;
	}
	public SingleMessageMetadata setNullValue(boolean nullValue) {
		this.nullValue = nullValue;
		_bitField0 |= _NULL_VALUE_MASK;
		_cachedSize = -1;
		return this;
	}
	public SingleMessageMetadata clearNullValue() {
		_bitField0 &= ~_NULL_VALUE_MASK;
		nullValue = false;
		return this;
	}

	private boolean nullPartitionKey = false;
	private static final int _NULL_PARTITION_KEY_FIELD_NUMBER = 10;
	private static final int _NULL_PARTITION_KEY_TAG = (_NULL_PARTITION_KEY_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _NULL_PARTITION_KEY_TAG_SIZE = LightProtoCodec.computeVarIntSize(_NULL_PARTITION_KEY_TAG);
	private static final int _NULL_PARTITION_KEY_MASK = 1 << (9 % 32);
	public boolean hasNullPartitionKey() {
		return (_bitField0 & _NULL_PARTITION_KEY_MASK) != 0;
	}
	public boolean isNullPartitionKey() {
		return nullPartitionKey;
	}
	public SingleMessageMetadata setNullPartitionKey(boolean nullPartitionKey) {
		this.nullPartitionKey = nullPartitionKey;
		_bitField0 |= _NULL_PARTITION_KEY_MASK;
		_cachedSize = -1;
		return this;
	}
	public SingleMessageMetadata clearNullPartitionKey() {
		_bitField0 &= ~_NULL_PARTITION_KEY_MASK;
		nullPartitionKey = false;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _PAYLOAD_SIZE_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		for (int i = 0; i < _propertiesCount; i++) {
			KeyValue _item = properties.get(i);
			LightProtoCodec.writeVarInt(_b, _PROPERTIES_TAG);
			LightProtoCodec.writeVarInt(_b, _item.getSerializedSize());
			_item.writeTo(_b);
		}
		if (hasPartitionKey()) {
			LightProtoCodec.writeVarInt(_b, _PARTITION_KEY_TAG);
			LightProtoCodec.writeVarInt(_b, _partitionKeyBufferLen);
			if (_partitionKeyBufferIdx == -1) {
				LightProtoCodec.writeString(_b, partitionKey, _partitionKeyBufferLen);
			} else {
				_parsedBuffer.getBytes(_partitionKeyBufferIdx, _b, _partitionKeyBufferLen);
			}
		}
		LightProtoCodec.writeVarInt(_b, _PAYLOAD_SIZE_TAG);
		LightProtoCodec.writeVarInt(_b, payloadSize);
		if (hasCompactedOut()) {
			LightProtoCodec.writeVarInt(_b, _COMPACTED_OUT_TAG);
			_b.writeBoolean(compactedOut);
		}
		if (hasEventTime()) {
			LightProtoCodec.writeVarInt(_b, _EVENT_TIME_TAG);
			LightProtoCodec.writeVarInt64(_b, eventTime);
		}
		if (hasPartitionKeyB64Encoded()) {
			LightProtoCodec.writeVarInt(_b, _PARTITION_KEY_B64_ENCODED_TAG);
			_b.writeBoolean(partitionKeyB64Encoded);
		}
		if (hasOrderingKey()) {
			LightProtoCodec.writeVarInt(_b, _ORDERING_KEY_TAG);
			LightProtoCodec.writeVarInt(_b, _orderingKeyLen);
			if (_orderingKeyIdx == -1) {
				_b.writeBytes(orderingKey);
			} else {
				_parsedBuffer.getBytes(_orderingKeyIdx, _b, _orderingKeyLen);
			}
		}
		if (hasSequenceId()) {
			LightProtoCodec.writeVarInt(_b, _SEQUENCE_ID_TAG);
			LightProtoCodec.writeVarInt64(_b, sequenceId);
		}
		if (hasNullValue()) {
			LightProtoCodec.writeVarInt(_b, _NULL_VALUE_TAG);
			_b.writeBoolean(nullValue);
		}
		if (hasNullPartitionKey()) {
			LightProtoCodec.writeVarInt(_b, _NULL_PARTITION_KEY_TAG);
			_b.writeBoolean(nullPartitionKey);
		}
		return (_b.writerIndex() - _writeIdx);
	}
	public int getSerializedSize() {
		if (_cachedSize > -1) {
			return _cachedSize;
		}

		int _size = 0;
		for (int i = 0; i < _propertiesCount; i++) {
			KeyValue _item = properties.get(i);
			_size += _PROPERTIES_TAG_SIZE;
			int MsgsizeProperties = _item.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeProperties) + MsgsizeProperties;
		}
		if (hasPartitionKey()) {
			_size += _PARTITION_KEY_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_partitionKeyBufferLen);
			_size += _partitionKeyBufferLen;
		}
		_size += _PAYLOAD_SIZE_TAG_SIZE;
		_size += LightProtoCodec.computeVarIntSize(payloadSize);
		if (hasCompactedOut()) {
			_size += _COMPACTED_OUT_TAG_SIZE;
			_size += 1;
		}
		if (hasEventTime()) {
			_size += _EVENT_TIME_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(eventTime);
		}
		if (hasPartitionKeyB64Encoded()) {
			_size += _PARTITION_KEY_B64_ENCODED_TAG_SIZE;
			_size += 1;
		}
		if (hasOrderingKey()) {
			_size += _ORDERING_KEY_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_orderingKeyLen) + _orderingKeyLen;
		}
		if (hasSequenceId()) {
			_size += _SEQUENCE_ID_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(sequenceId);
		}
		if (hasNullValue()) {
			_size += _NULL_VALUE_TAG_SIZE;
			_size += 1;
		}
		if (hasNullPartitionKey()) {
			_size += _NULL_PARTITION_KEY_TAG_SIZE;
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
				case _PROPERTIES_TAG :
					int _propertiesSize = LightProtoCodec.readVarInt(_buffer);
					addProperty().parseFrom(_buffer, _propertiesSize);
					break;
				case _PARTITION_KEY_TAG :
					_bitField0 |= _PARTITION_KEY_MASK;
					_partitionKeyBufferLen = LightProtoCodec.readVarInt(_buffer);
					_partitionKeyBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_partitionKeyBufferLen);
					break;
				case _PAYLOAD_SIZE_TAG :
					_bitField0 |= _PAYLOAD_SIZE_MASK;
					payloadSize = LightProtoCodec.readVarInt(_buffer);
					break;
				case _COMPACTED_OUT_TAG :
					_bitField0 |= _COMPACTED_OUT_MASK;
					compactedOut = LightProtoCodec.readVarInt(_buffer) == 1;
					break;
				case _EVENT_TIME_TAG :
					_bitField0 |= _EVENT_TIME_MASK;
					eventTime = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _PARTITION_KEY_B64_ENCODED_TAG :
					_bitField0 |= _PARTITION_KEY_B64_ENCODED_MASK;
					partitionKeyB64Encoded = LightProtoCodec.readVarInt(_buffer) == 1;
					break;
				case _ORDERING_KEY_TAG :
					_bitField0 |= _ORDERING_KEY_MASK;
					_orderingKeyLen = LightProtoCodec.readVarInt(_buffer);
					_orderingKeyIdx = _buffer.readerIndex();
					_buffer.skipBytes(_orderingKeyLen);
					break;
				case _SEQUENCE_ID_TAG :
					_bitField0 |= _SEQUENCE_ID_MASK;
					sequenceId = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _NULL_VALUE_TAG :
					_bitField0 |= _NULL_VALUE_MASK;
					nullValue = LightProtoCodec.readVarInt(_buffer) == 1;
					break;
				case _NULL_PARTITION_KEY_TAG :
					_bitField0 |= _NULL_PARTITION_KEY_MASK;
					nullPartitionKey = LightProtoCodec.readVarInt(_buffer) == 1;
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
	public SingleMessageMetadata clear() {
		for (int i = 0; i < _propertiesCount; i++) {
			properties.get(i).clear();
		}
		_propertiesCount = 0;
		partitionKey = null;
		_partitionKeyBufferIdx = -1;
		_partitionKeyBufferLen = -1;
		compactedOut = false;
		eventTime = 0;
		partitionKeyB64Encoded = false;
		orderingKey = null;
		_orderingKeyIdx = -1;
		_orderingKeyLen = -1;
		nullValue = false;
		nullPartitionKey = false;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public SingleMessageMetadata copyFrom(SingleMessageMetadata _other) {
		_cachedSize = -1;
		for (int i = 0; i < _other.getPropertiesCount(); i++) {
			addProperty().copyFrom(_other.getPropertyAt(i));
		}
		if (_other.hasPartitionKey()) {
			setPartitionKey(_other.getPartitionKey());
		}
		if (_other.hasPayloadSize()) {
			setPayloadSize(_other.payloadSize);
		}
		if (_other.hasCompactedOut()) {
			setCompactedOut(_other.compactedOut);
		}
		if (_other.hasEventTime()) {
			setEventTime(_other.eventTime);
		}
		if (_other.hasPartitionKeyB64Encoded()) {
			setPartitionKeyB64Encoded(_other.partitionKeyB64Encoded);
		}
		if (_other.hasOrderingKey()) {
			setOrderingKey(_other.getOrderingKey());
		}
		if (_other.hasSequenceId()) {
			setSequenceId(_other.sequenceId);
		}
		if (_other.hasNullValue()) {
			setNullValue(_other.nullValue);
		}
		if (_other.hasNullPartitionKey()) {
			setNullPartitionKey(_other.nullPartitionKey);
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
