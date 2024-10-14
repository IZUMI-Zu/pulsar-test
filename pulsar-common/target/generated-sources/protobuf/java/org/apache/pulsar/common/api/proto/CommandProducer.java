package org.apache.pulsar.common.api.proto;
public final class CommandProducer {
	private String topic;
	private int _topicBufferIdx = -1;
	private int _topicBufferLen = -1;
	private static final int _TOPIC_FIELD_NUMBER = 1;
	private static final int _TOPIC_TAG = (_TOPIC_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _TOPIC_TAG_SIZE = LightProtoCodec.computeVarIntSize(_TOPIC_TAG);
	private static final int _TOPIC_MASK = 1 << (0 % 32);
	public boolean hasTopic() {
		return (_bitField0 & _TOPIC_MASK) != 0;
	}
	public String getTopic() {
		if (!hasTopic()) {
			throw new IllegalStateException("Field 'topic' is not set");
		}
		if (topic == null) {
			topic = LightProtoCodec.readString(_parsedBuffer, _topicBufferIdx, _topicBufferLen);
		}
		return topic;
	}
	public CommandProducer setTopic(String topic) {
		this.topic = topic;
		_bitField0 |= _TOPIC_MASK;
		_topicBufferIdx = -1;
		_topicBufferLen = LightProtoCodec.computeStringUTF8Size(topic);
		_cachedSize = -1;
		return this;
	}
	public CommandProducer clearTopic() {
		_bitField0 &= ~_TOPIC_MASK;
		topic = null;
		_topicBufferIdx = -1;
		_topicBufferLen = -1;
		return this;
	}

	private long producerId;
	private static final int _PRODUCER_ID_FIELD_NUMBER = 2;
	private static final int _PRODUCER_ID_TAG = (_PRODUCER_ID_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _PRODUCER_ID_TAG_SIZE = LightProtoCodec.computeVarIntSize(_PRODUCER_ID_TAG);
	private static final int _PRODUCER_ID_MASK = 1 << (1 % 32);
	public boolean hasProducerId() {
		return (_bitField0 & _PRODUCER_ID_MASK) != 0;
	}
	public long getProducerId() {
		if (!hasProducerId()) {
			throw new IllegalStateException("Field 'producer_id' is not set");
		}
		return producerId;
	}
	public CommandProducer setProducerId(long producerId) {
		this.producerId = producerId;
		_bitField0 |= _PRODUCER_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandProducer clearProducerId() {
		_bitField0 &= ~_PRODUCER_ID_MASK;
		return this;
	}

	private long requestId;
	private static final int _REQUEST_ID_FIELD_NUMBER = 3;
	private static final int _REQUEST_ID_TAG = (_REQUEST_ID_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _REQUEST_ID_TAG_SIZE = LightProtoCodec.computeVarIntSize(_REQUEST_ID_TAG);
	private static final int _REQUEST_ID_MASK = 1 << (2 % 32);
	public boolean hasRequestId() {
		return (_bitField0 & _REQUEST_ID_MASK) != 0;
	}
	public long getRequestId() {
		if (!hasRequestId()) {
			throw new IllegalStateException("Field 'request_id' is not set");
		}
		return requestId;
	}
	public CommandProducer setRequestId(long requestId) {
		this.requestId = requestId;
		_bitField0 |= _REQUEST_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandProducer clearRequestId() {
		_bitField0 &= ~_REQUEST_ID_MASK;
		return this;
	}

	// If a producer name is specified, the name will be used,
	// otherwise the broker will generate a unique name
	private String producerName;
	private int _producerNameBufferIdx = -1;
	private int _producerNameBufferLen = -1;
	private static final int _PRODUCER_NAME_FIELD_NUMBER = 4;
	private static final int _PRODUCER_NAME_TAG = (_PRODUCER_NAME_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _PRODUCER_NAME_TAG_SIZE = LightProtoCodec.computeVarIntSize(_PRODUCER_NAME_TAG);
	private static final int _PRODUCER_NAME_MASK = 1 << (3 % 32);
	public boolean hasProducerName() {
		return (_bitField0 & _PRODUCER_NAME_MASK) != 0;
	}
	public String getProducerName() {
		if (!hasProducerName()) {
			throw new IllegalStateException("Field 'producer_name' is not set");
		}
		if (producerName == null) {
			producerName = LightProtoCodec.readString(_parsedBuffer, _producerNameBufferIdx, _producerNameBufferLen);
		}
		return producerName;
	}
	public CommandProducer setProducerName(String producerName) {
		this.producerName = producerName;
		_bitField0 |= _PRODUCER_NAME_MASK;
		_producerNameBufferIdx = -1;
		_producerNameBufferLen = LightProtoCodec.computeStringUTF8Size(producerName);
		_cachedSize = -1;
		return this;
	}
	public CommandProducer clearProducerName() {
		_bitField0 &= ~_PRODUCER_NAME_MASK;
		producerName = null;
		_producerNameBufferIdx = -1;
		_producerNameBufferLen = -1;
		return this;
	}

	private boolean encrypted = false;
	private static final int _ENCRYPTED_FIELD_NUMBER = 5;
	private static final int _ENCRYPTED_TAG = (_ENCRYPTED_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _ENCRYPTED_TAG_SIZE = LightProtoCodec.computeVarIntSize(_ENCRYPTED_TAG);
	private static final int _ENCRYPTED_MASK = 1 << (4 % 32);
	public boolean hasEncrypted() {
		return (_bitField0 & _ENCRYPTED_MASK) != 0;
	}
	public boolean isEncrypted() {
		return encrypted;
	}
	public CommandProducer setEncrypted(boolean encrypted) {
		this.encrypted = encrypted;
		_bitField0 |= _ENCRYPTED_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandProducer clearEncrypted() {
		_bitField0 &= ~_ENCRYPTED_MASK;
		encrypted = false;
		return this;
	}

	// Add optional metadata key=value to this producer
	private java.util.List<KeyValue> metadatas = null;
	private int _metadatasCount = 0;
	private static final int _METADATA_FIELD_NUMBER = 6;
	private static final int _METADATA_TAG = (_METADATA_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _METADATA_TAG_SIZE = LightProtoCodec.computeVarIntSize(_METADATA_TAG);
	public int getMetadatasCount() {
		return _metadatasCount;
	}
	public KeyValue getMetadataAt(int idx) {
		if (idx < 0 || idx >= _metadatasCount) {
			throw new IndexOutOfBoundsException(
					"Index " + idx + " is out of the list size (" + _metadatasCount + ") for field 'metadata'");
		}
		return metadatas.get(idx);
	}
	public java.util.List<KeyValue> getMetadatasList() {
		if (_metadatasCount == 0) {
			return java.util.Collections.emptyList();
		} else {
			return metadatas.subList(0, _metadatasCount);
		}
	}
	public KeyValue addMetadata() {
		if (metadatas == null) {
			metadatas = new java.util.ArrayList<KeyValue>();
		}
		if (metadatas.size() == _metadatasCount) {
			metadatas.add(new KeyValue());
		}
		_cachedSize = -1;
		return metadatas.get(_metadatasCount++);
	}
	public CommandProducer addAllMetadatas(Iterable<KeyValue> metadatas) {
		for (KeyValue _o : metadatas) {
			addMetadata().copyFrom(_o);
		}
		return this;
	}
	public CommandProducer clearMetadata() {
		for (int i = 0; i < _metadatasCount; i++) {
			metadatas.get(i).clear();
		}
		_metadatasCount = 0;
		return this;
	}

	private Schema schema;
	private static final int _SCHEMA_FIELD_NUMBER = 7;
	private static final int _SCHEMA_TAG = (_SCHEMA_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _SCHEMA_TAG_SIZE = LightProtoCodec.computeVarIntSize(_SCHEMA_TAG);
	private static final int _SCHEMA_MASK = 1 << (6 % 32);
	public boolean hasSchema() {
		return (_bitField0 & _SCHEMA_MASK) != 0;
	}
	public Schema getSchema() {
		if (!hasSchema()) {
			throw new IllegalStateException("Field 'schema' is not set");
		}
		return schema;
	}
	public Schema setSchema() {
		if (schema == null) {
			schema = new Schema();
		}
		_bitField0 |= _SCHEMA_MASK;
		_cachedSize = -1;
		return schema;
	}
	public CommandProducer clearSchema() {
		_bitField0 &= ~_SCHEMA_MASK;
		if (hasSchema()) {
			schema.clear();
		}
		return this;
	}

	private long epoch = 0;
	private static final int _EPOCH_FIELD_NUMBER = 8;
	private static final int _EPOCH_TAG = (_EPOCH_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _EPOCH_TAG_SIZE = LightProtoCodec.computeVarIntSize(_EPOCH_TAG);
	private static final int _EPOCH_MASK = 1 << (7 % 32);
	public boolean hasEpoch() {
		return (_bitField0 & _EPOCH_MASK) != 0;
	}
	public long getEpoch() {
		return epoch;
	}
	public CommandProducer setEpoch(long epoch) {
		this.epoch = epoch;
		_bitField0 |= _EPOCH_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandProducer clearEpoch() {
		_bitField0 &= ~_EPOCH_MASK;
		epoch = 0;
		return this;
	}

	private boolean userProvidedProducerName = true;
	private static final int _USER_PROVIDED_PRODUCER_NAME_FIELD_NUMBER = 9;
	private static final int _USER_PROVIDED_PRODUCER_NAME_TAG = (_USER_PROVIDED_PRODUCER_NAME_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _USER_PROVIDED_PRODUCER_NAME_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_USER_PROVIDED_PRODUCER_NAME_TAG);
	private static final int _USER_PROVIDED_PRODUCER_NAME_MASK = 1 << (8 % 32);
	public boolean hasUserProvidedProducerName() {
		return (_bitField0 & _USER_PROVIDED_PRODUCER_NAME_MASK) != 0;
	}
	public boolean isUserProvidedProducerName() {
		return userProvidedProducerName;
	}
	public CommandProducer setUserProvidedProducerName(boolean userProvidedProducerName) {
		this.userProvidedProducerName = userProvidedProducerName;
		_bitField0 |= _USER_PROVIDED_PRODUCER_NAME_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandProducer clearUserProvidedProducerName() {
		_bitField0 &= ~_USER_PROVIDED_PRODUCER_NAME_MASK;
		userProvidedProducerName = true;
		return this;
	}

	private ProducerAccessMode producerAccessMode = ProducerAccessMode.Shared;
	private static final int _PRODUCER_ACCESS_MODE_FIELD_NUMBER = 10;
	private static final int _PRODUCER_ACCESS_MODE_TAG = (_PRODUCER_ACCESS_MODE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _PRODUCER_ACCESS_MODE_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_PRODUCER_ACCESS_MODE_TAG);
	private static final int _PRODUCER_ACCESS_MODE_MASK = 1 << (9 % 32);
	public boolean hasProducerAccessMode() {
		return (_bitField0 & _PRODUCER_ACCESS_MODE_MASK) != 0;
	}
	public ProducerAccessMode getProducerAccessMode() {
		return producerAccessMode;
	}
	public CommandProducer setProducerAccessMode(ProducerAccessMode producerAccessMode) {
		this.producerAccessMode = producerAccessMode;
		_bitField0 |= _PRODUCER_ACCESS_MODE_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandProducer clearProducerAccessMode() {
		_bitField0 &= ~_PRODUCER_ACCESS_MODE_MASK;
		producerAccessMode = ProducerAccessMode.Shared;
		return this;
	}

	private long topicEpoch;
	private static final int _TOPIC_EPOCH_FIELD_NUMBER = 11;
	private static final int _TOPIC_EPOCH_TAG = (_TOPIC_EPOCH_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _TOPIC_EPOCH_TAG_SIZE = LightProtoCodec.computeVarIntSize(_TOPIC_EPOCH_TAG);
	private static final int _TOPIC_EPOCH_MASK = 1 << (10 % 32);
	public boolean hasTopicEpoch() {
		return (_bitField0 & _TOPIC_EPOCH_MASK) != 0;
	}
	public long getTopicEpoch() {
		if (!hasTopicEpoch()) {
			throw new IllegalStateException("Field 'topic_epoch' is not set");
		}
		return topicEpoch;
	}
	public CommandProducer setTopicEpoch(long topicEpoch) {
		this.topicEpoch = topicEpoch;
		_bitField0 |= _TOPIC_EPOCH_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandProducer clearTopicEpoch() {
		_bitField0 &= ~_TOPIC_EPOCH_MASK;
		return this;
	}

	private boolean txnEnabled = false;
	private static final int _TXN_ENABLED_FIELD_NUMBER = 12;
	private static final int _TXN_ENABLED_TAG = (_TXN_ENABLED_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _TXN_ENABLED_TAG_SIZE = LightProtoCodec.computeVarIntSize(_TXN_ENABLED_TAG);
	private static final int _TXN_ENABLED_MASK = 1 << (11 % 32);
	public boolean hasTxnEnabled() {
		return (_bitField0 & _TXN_ENABLED_MASK) != 0;
	}
	public boolean isTxnEnabled() {
		return txnEnabled;
	}
	public CommandProducer setTxnEnabled(boolean txnEnabled) {
		this.txnEnabled = txnEnabled;
		_bitField0 |= _TXN_ENABLED_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandProducer clearTxnEnabled() {
		_bitField0 &= ~_TXN_ENABLED_MASK;
		txnEnabled = false;
		return this;
	}

	private String initialSubscriptionName;
	private int _initialSubscriptionNameBufferIdx = -1;
	private int _initialSubscriptionNameBufferLen = -1;
	private static final int _INITIAL_SUBSCRIPTION_NAME_FIELD_NUMBER = 13;
	private static final int _INITIAL_SUBSCRIPTION_NAME_TAG = (_INITIAL_SUBSCRIPTION_NAME_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _INITIAL_SUBSCRIPTION_NAME_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_INITIAL_SUBSCRIPTION_NAME_TAG);
	private static final int _INITIAL_SUBSCRIPTION_NAME_MASK = 1 << (12 % 32);
	public boolean hasInitialSubscriptionName() {
		return (_bitField0 & _INITIAL_SUBSCRIPTION_NAME_MASK) != 0;
	}
	public String getInitialSubscriptionName() {
		if (!hasInitialSubscriptionName()) {
			throw new IllegalStateException("Field 'initial_subscription_name' is not set");
		}
		if (initialSubscriptionName == null) {
			initialSubscriptionName = LightProtoCodec.readString(_parsedBuffer, _initialSubscriptionNameBufferIdx,
					_initialSubscriptionNameBufferLen);
		}
		return initialSubscriptionName;
	}
	public CommandProducer setInitialSubscriptionName(String initialSubscriptionName) {
		this.initialSubscriptionName = initialSubscriptionName;
		_bitField0 |= _INITIAL_SUBSCRIPTION_NAME_MASK;
		_initialSubscriptionNameBufferIdx = -1;
		_initialSubscriptionNameBufferLen = LightProtoCodec.computeStringUTF8Size(initialSubscriptionName);
		_cachedSize = -1;
		return this;
	}
	public CommandProducer clearInitialSubscriptionName() {
		_bitField0 &= ~_INITIAL_SUBSCRIPTION_NAME_MASK;
		initialSubscriptionName = null;
		_initialSubscriptionNameBufferIdx = -1;
		_initialSubscriptionNameBufferLen = -1;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _TOPIC_MASK | _PRODUCER_ID_MASK | _REQUEST_ID_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _TOPIC_TAG);
		LightProtoCodec.writeVarInt(_b, _topicBufferLen);
		if (_topicBufferIdx == -1) {
			LightProtoCodec.writeString(_b, topic, _topicBufferLen);
		} else {
			_parsedBuffer.getBytes(_topicBufferIdx, _b, _topicBufferLen);
		}
		LightProtoCodec.writeVarInt(_b, _PRODUCER_ID_TAG);
		LightProtoCodec.writeVarInt64(_b, producerId);
		LightProtoCodec.writeVarInt(_b, _REQUEST_ID_TAG);
		LightProtoCodec.writeVarInt64(_b, requestId);
		if (hasProducerName()) {
			LightProtoCodec.writeVarInt(_b, _PRODUCER_NAME_TAG);
			LightProtoCodec.writeVarInt(_b, _producerNameBufferLen);
			if (_producerNameBufferIdx == -1) {
				LightProtoCodec.writeString(_b, producerName, _producerNameBufferLen);
			} else {
				_parsedBuffer.getBytes(_producerNameBufferIdx, _b, _producerNameBufferLen);
			}
		}
		if (hasEncrypted()) {
			LightProtoCodec.writeVarInt(_b, _ENCRYPTED_TAG);
			_b.writeBoolean(encrypted);
		}
		for (int i = 0; i < _metadatasCount; i++) {
			KeyValue _item = metadatas.get(i);
			LightProtoCodec.writeVarInt(_b, _METADATA_TAG);
			LightProtoCodec.writeVarInt(_b, _item.getSerializedSize());
			_item.writeTo(_b);
		}
		if (hasSchema()) {
			LightProtoCodec.writeVarInt(_b, _SCHEMA_TAG);
			LightProtoCodec.writeVarInt(_b, schema.getSerializedSize());
			schema.writeTo(_b);
		}
		if (hasEpoch()) {
			LightProtoCodec.writeVarInt(_b, _EPOCH_TAG);
			LightProtoCodec.writeVarInt64(_b, epoch);
		}
		if (hasUserProvidedProducerName()) {
			LightProtoCodec.writeVarInt(_b, _USER_PROVIDED_PRODUCER_NAME_TAG);
			_b.writeBoolean(userProvidedProducerName);
		}
		if (hasProducerAccessMode()) {
			LightProtoCodec.writeVarInt(_b, _PRODUCER_ACCESS_MODE_TAG);
			LightProtoCodec.writeVarInt(_b, producerAccessMode.getValue());
		}
		if (hasTopicEpoch()) {
			LightProtoCodec.writeVarInt(_b, _TOPIC_EPOCH_TAG);
			LightProtoCodec.writeVarInt64(_b, topicEpoch);
		}
		if (hasTxnEnabled()) {
			LightProtoCodec.writeVarInt(_b, _TXN_ENABLED_TAG);
			_b.writeBoolean(txnEnabled);
		}
		if (hasInitialSubscriptionName()) {
			LightProtoCodec.writeVarInt(_b, _INITIAL_SUBSCRIPTION_NAME_TAG);
			LightProtoCodec.writeVarInt(_b, _initialSubscriptionNameBufferLen);
			if (_initialSubscriptionNameBufferIdx == -1) {
				LightProtoCodec.writeString(_b, initialSubscriptionName, _initialSubscriptionNameBufferLen);
			} else {
				_parsedBuffer.getBytes(_initialSubscriptionNameBufferIdx, _b, _initialSubscriptionNameBufferLen);
			}
		}
		return (_b.writerIndex() - _writeIdx);
	}
	public int getSerializedSize() {
		if (_cachedSize > -1) {
			return _cachedSize;
		}

		int _size = 0;
		_size += _TOPIC_TAG_SIZE;
		_size += LightProtoCodec.computeVarIntSize(_topicBufferLen);
		_size += _topicBufferLen;
		_size += _PRODUCER_ID_TAG_SIZE;
		_size += LightProtoCodec.computeVarInt64Size(producerId);
		_size += _REQUEST_ID_TAG_SIZE;
		_size += LightProtoCodec.computeVarInt64Size(requestId);
		if (hasProducerName()) {
			_size += _PRODUCER_NAME_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_producerNameBufferLen);
			_size += _producerNameBufferLen;
		}
		if (hasEncrypted()) {
			_size += _ENCRYPTED_TAG_SIZE;
			_size += 1;
		}
		for (int i = 0; i < _metadatasCount; i++) {
			KeyValue _item = metadatas.get(i);
			_size += _METADATA_TAG_SIZE;
			int MsgsizeMetadata = _item.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeMetadata) + MsgsizeMetadata;
		}
		if (hasSchema()) {
			_size += LightProtoCodec.computeVarIntSize(_SCHEMA_TAG);
			int MsgsizeSchema = schema.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeSchema) + MsgsizeSchema;
		}
		if (hasEpoch()) {
			_size += _EPOCH_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(epoch);
		}
		if (hasUserProvidedProducerName()) {
			_size += _USER_PROVIDED_PRODUCER_NAME_TAG_SIZE;
			_size += 1;
		}
		if (hasProducerAccessMode()) {
			_size += _PRODUCER_ACCESS_MODE_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(producerAccessMode.getValue());
		}
		if (hasTopicEpoch()) {
			_size += _TOPIC_EPOCH_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(topicEpoch);
		}
		if (hasTxnEnabled()) {
			_size += _TXN_ENABLED_TAG_SIZE;
			_size += 1;
		}
		if (hasInitialSubscriptionName()) {
			_size += _INITIAL_SUBSCRIPTION_NAME_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_initialSubscriptionNameBufferLen);
			_size += _initialSubscriptionNameBufferLen;
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
				case _TOPIC_TAG :
					_bitField0 |= _TOPIC_MASK;
					_topicBufferLen = LightProtoCodec.readVarInt(_buffer);
					_topicBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_topicBufferLen);
					break;
				case _PRODUCER_ID_TAG :
					_bitField0 |= _PRODUCER_ID_MASK;
					producerId = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _REQUEST_ID_TAG :
					_bitField0 |= _REQUEST_ID_MASK;
					requestId = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _PRODUCER_NAME_TAG :
					_bitField0 |= _PRODUCER_NAME_MASK;
					_producerNameBufferLen = LightProtoCodec.readVarInt(_buffer);
					_producerNameBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_producerNameBufferLen);
					break;
				case _ENCRYPTED_TAG :
					_bitField0 |= _ENCRYPTED_MASK;
					encrypted = LightProtoCodec.readVarInt(_buffer) == 1;
					break;
				case _METADATA_TAG :
					int _metadataSize = LightProtoCodec.readVarInt(_buffer);
					addMetadata().parseFrom(_buffer, _metadataSize);
					break;
				case _SCHEMA_TAG :
					_bitField0 |= _SCHEMA_MASK;
					int schemaSize = LightProtoCodec.readVarInt(_buffer);
					setSchema().parseFrom(_buffer, schemaSize);
					break;
				case _EPOCH_TAG :
					_bitField0 |= _EPOCH_MASK;
					epoch = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _USER_PROVIDED_PRODUCER_NAME_TAG :
					_bitField0 |= _USER_PROVIDED_PRODUCER_NAME_MASK;
					userProvidedProducerName = LightProtoCodec.readVarInt(_buffer) == 1;
					break;
				case _PRODUCER_ACCESS_MODE_TAG :
					ProducerAccessMode _producerAccessMode = ProducerAccessMode
							.valueOf(LightProtoCodec.readVarInt(_buffer));
					if (_producerAccessMode != null) {
						_bitField0 |= _PRODUCER_ACCESS_MODE_MASK;
						producerAccessMode = _producerAccessMode;
					}
					break;
				case _TOPIC_EPOCH_TAG :
					_bitField0 |= _TOPIC_EPOCH_MASK;
					topicEpoch = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _TXN_ENABLED_TAG :
					_bitField0 |= _TXN_ENABLED_MASK;
					txnEnabled = LightProtoCodec.readVarInt(_buffer) == 1;
					break;
				case _INITIAL_SUBSCRIPTION_NAME_TAG :
					_bitField0 |= _INITIAL_SUBSCRIPTION_NAME_MASK;
					_initialSubscriptionNameBufferLen = LightProtoCodec.readVarInt(_buffer);
					_initialSubscriptionNameBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_initialSubscriptionNameBufferLen);
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
	public CommandProducer clear() {
		topic = null;
		_topicBufferIdx = -1;
		_topicBufferLen = -1;
		producerName = null;
		_producerNameBufferIdx = -1;
		_producerNameBufferLen = -1;
		encrypted = false;
		for (int i = 0; i < _metadatasCount; i++) {
			metadatas.get(i).clear();
		}
		_metadatasCount = 0;
		if (hasSchema()) {
			schema.clear();
		}
		epoch = 0;
		userProvidedProducerName = true;
		producerAccessMode = ProducerAccessMode.Shared;
		txnEnabled = false;
		initialSubscriptionName = null;
		_initialSubscriptionNameBufferIdx = -1;
		_initialSubscriptionNameBufferLen = -1;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public CommandProducer copyFrom(CommandProducer _other) {
		_cachedSize = -1;
		if (_other.hasTopic()) {
			setTopic(_other.getTopic());
		}
		if (_other.hasProducerId()) {
			setProducerId(_other.producerId);
		}
		if (_other.hasRequestId()) {
			setRequestId(_other.requestId);
		}
		if (_other.hasProducerName()) {
			setProducerName(_other.getProducerName());
		}
		if (_other.hasEncrypted()) {
			setEncrypted(_other.encrypted);
		}
		for (int i = 0; i < _other.getMetadatasCount(); i++) {
			addMetadata().copyFrom(_other.getMetadataAt(i));
		}
		if (_other.hasSchema()) {
			setSchema().copyFrom(_other.schema);
		}
		if (_other.hasEpoch()) {
			setEpoch(_other.epoch);
		}
		if (_other.hasUserProvidedProducerName()) {
			setUserProvidedProducerName(_other.userProvidedProducerName);
		}
		if (_other.hasProducerAccessMode()) {
			setProducerAccessMode(_other.producerAccessMode);
		}
		if (_other.hasTopicEpoch()) {
			setTopicEpoch(_other.topicEpoch);
		}
		if (_other.hasTxnEnabled()) {
			setTxnEnabled(_other.txnEnabled);
		}
		if (_other.hasInitialSubscriptionName()) {
			setInitialSubscriptionName(_other.getInitialSubscriptionName());
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
