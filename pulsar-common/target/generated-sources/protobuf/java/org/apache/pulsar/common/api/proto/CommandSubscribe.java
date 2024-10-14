package org.apache.pulsar.common.api.proto;
public final class CommandSubscribe {
	public enum SubType {
		Exclusive(0), Shared(1), Failover(2), Key_Shared(3),;
		private final int value;
		private SubType(int value) {
			this.value = value;
		}
		public int getValue() {
			return value;
		}
		public static SubType valueOf(int n) {
			switch (n) {
				case 0 :
					return Exclusive;
				case 1 :
					return Shared;
				case 2 :
					return Failover;
				case 3 :
					return Key_Shared;
				default :
					return null;

			}
		}
		public static final int Exclusive_VALUE = 0;
		public static final int Shared_VALUE = 1;
		public static final int Failover_VALUE = 2;
		public static final int Key_Shared_VALUE = 3;
	}

	public enum InitialPosition {
		Latest(0), Earliest(1),;
		private final int value;
		private InitialPosition(int value) {
			this.value = value;
		}
		public int getValue() {
			return value;
		}
		public static InitialPosition valueOf(int n) {
			switch (n) {
				case 0 :
					return Latest;
				case 1 :
					return Earliest;
				default :
					return null;

			}
		}
		public static final int Latest_VALUE = 0;
		public static final int Earliest_VALUE = 1;
	}

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
	public CommandSubscribe setTopic(String topic) {
		this.topic = topic;
		_bitField0 |= _TOPIC_MASK;
		_topicBufferIdx = -1;
		_topicBufferLen = LightProtoCodec.computeStringUTF8Size(topic);
		_cachedSize = -1;
		return this;
	}
	public CommandSubscribe clearTopic() {
		_bitField0 &= ~_TOPIC_MASK;
		topic = null;
		_topicBufferIdx = -1;
		_topicBufferLen = -1;
		return this;
	}

	private String subscription;
	private int _subscriptionBufferIdx = -1;
	private int _subscriptionBufferLen = -1;
	private static final int _SUBSCRIPTION_FIELD_NUMBER = 2;
	private static final int _SUBSCRIPTION_TAG = (_SUBSCRIPTION_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _SUBSCRIPTION_TAG_SIZE = LightProtoCodec.computeVarIntSize(_SUBSCRIPTION_TAG);
	private static final int _SUBSCRIPTION_MASK = 1 << (1 % 32);
	public boolean hasSubscription() {
		return (_bitField0 & _SUBSCRIPTION_MASK) != 0;
	}
	public String getSubscription() {
		if (!hasSubscription()) {
			throw new IllegalStateException("Field 'subscription' is not set");
		}
		if (subscription == null) {
			subscription = LightProtoCodec.readString(_parsedBuffer, _subscriptionBufferIdx, _subscriptionBufferLen);
		}
		return subscription;
	}
	public CommandSubscribe setSubscription(String subscription) {
		this.subscription = subscription;
		_bitField0 |= _SUBSCRIPTION_MASK;
		_subscriptionBufferIdx = -1;
		_subscriptionBufferLen = LightProtoCodec.computeStringUTF8Size(subscription);
		_cachedSize = -1;
		return this;
	}
	public CommandSubscribe clearSubscription() {
		_bitField0 &= ~_SUBSCRIPTION_MASK;
		subscription = null;
		_subscriptionBufferIdx = -1;
		_subscriptionBufferLen = -1;
		return this;
	}

	private SubType subType;
	private static final int _SUB_TYPE_FIELD_NUMBER = 3;
	private static final int _SUB_TYPE_TAG = (_SUB_TYPE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _SUB_TYPE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_SUB_TYPE_TAG);
	private static final int _SUB_TYPE_MASK = 1 << (2 % 32);
	public boolean hasSubType() {
		return (_bitField0 & _SUB_TYPE_MASK) != 0;
	}
	public SubType getSubType() {
		if (!hasSubType()) {
			throw new IllegalStateException("Field 'subType' is not set");
		}
		return subType;
	}
	public CommandSubscribe setSubType(SubType subType) {
		this.subType = subType;
		_bitField0 |= _SUB_TYPE_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandSubscribe clearSubType() {
		_bitField0 &= ~_SUB_TYPE_MASK;
		return this;
	}

	private long consumerId;
	private static final int _CONSUMER_ID_FIELD_NUMBER = 4;
	private static final int _CONSUMER_ID_TAG = (_CONSUMER_ID_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _CONSUMER_ID_TAG_SIZE = LightProtoCodec.computeVarIntSize(_CONSUMER_ID_TAG);
	private static final int _CONSUMER_ID_MASK = 1 << (3 % 32);
	public boolean hasConsumerId() {
		return (_bitField0 & _CONSUMER_ID_MASK) != 0;
	}
	public long getConsumerId() {
		if (!hasConsumerId()) {
			throw new IllegalStateException("Field 'consumer_id' is not set");
		}
		return consumerId;
	}
	public CommandSubscribe setConsumerId(long consumerId) {
		this.consumerId = consumerId;
		_bitField0 |= _CONSUMER_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandSubscribe clearConsumerId() {
		_bitField0 &= ~_CONSUMER_ID_MASK;
		return this;
	}

	private long requestId;
	private static final int _REQUEST_ID_FIELD_NUMBER = 5;
	private static final int _REQUEST_ID_TAG = (_REQUEST_ID_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _REQUEST_ID_TAG_SIZE = LightProtoCodec.computeVarIntSize(_REQUEST_ID_TAG);
	private static final int _REQUEST_ID_MASK = 1 << (4 % 32);
	public boolean hasRequestId() {
		return (_bitField0 & _REQUEST_ID_MASK) != 0;
	}
	public long getRequestId() {
		if (!hasRequestId()) {
			throw new IllegalStateException("Field 'request_id' is not set");
		}
		return requestId;
	}
	public CommandSubscribe setRequestId(long requestId) {
		this.requestId = requestId;
		_bitField0 |= _REQUEST_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandSubscribe clearRequestId() {
		_bitField0 &= ~_REQUEST_ID_MASK;
		return this;
	}

	private String consumerName;
	private int _consumerNameBufferIdx = -1;
	private int _consumerNameBufferLen = -1;
	private static final int _CONSUMER_NAME_FIELD_NUMBER = 6;
	private static final int _CONSUMER_NAME_TAG = (_CONSUMER_NAME_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _CONSUMER_NAME_TAG_SIZE = LightProtoCodec.computeVarIntSize(_CONSUMER_NAME_TAG);
	private static final int _CONSUMER_NAME_MASK = 1 << (5 % 32);
	public boolean hasConsumerName() {
		return (_bitField0 & _CONSUMER_NAME_MASK) != 0;
	}
	public String getConsumerName() {
		if (!hasConsumerName()) {
			throw new IllegalStateException("Field 'consumer_name' is not set");
		}
		if (consumerName == null) {
			consumerName = LightProtoCodec.readString(_parsedBuffer, _consumerNameBufferIdx, _consumerNameBufferLen);
		}
		return consumerName;
	}
	public CommandSubscribe setConsumerName(String consumerName) {
		this.consumerName = consumerName;
		_bitField0 |= _CONSUMER_NAME_MASK;
		_consumerNameBufferIdx = -1;
		_consumerNameBufferLen = LightProtoCodec.computeStringUTF8Size(consumerName);
		_cachedSize = -1;
		return this;
	}
	public CommandSubscribe clearConsumerName() {
		_bitField0 &= ~_CONSUMER_NAME_MASK;
		consumerName = null;
		_consumerNameBufferIdx = -1;
		_consumerNameBufferLen = -1;
		return this;
	}

	private int priorityLevel;
	private static final int _PRIORITY_LEVEL_FIELD_NUMBER = 7;
	private static final int _PRIORITY_LEVEL_TAG = (_PRIORITY_LEVEL_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _PRIORITY_LEVEL_TAG_SIZE = LightProtoCodec.computeVarIntSize(_PRIORITY_LEVEL_TAG);
	private static final int _PRIORITY_LEVEL_MASK = 1 << (6 % 32);
	public boolean hasPriorityLevel() {
		return (_bitField0 & _PRIORITY_LEVEL_MASK) != 0;
	}
	public int getPriorityLevel() {
		if (!hasPriorityLevel()) {
			throw new IllegalStateException("Field 'priority_level' is not set");
		}
		return priorityLevel;
	}
	public CommandSubscribe setPriorityLevel(int priorityLevel) {
		this.priorityLevel = priorityLevel;
		_bitField0 |= _PRIORITY_LEVEL_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandSubscribe clearPriorityLevel() {
		_bitField0 &= ~_PRIORITY_LEVEL_MASK;
		return this;
	}

	private boolean durable = true;
	private static final int _DURABLE_FIELD_NUMBER = 8;
	private static final int _DURABLE_TAG = (_DURABLE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _DURABLE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_DURABLE_TAG);
	private static final int _DURABLE_MASK = 1 << (7 % 32);
	public boolean hasDurable() {
		return (_bitField0 & _DURABLE_MASK) != 0;
	}
	public boolean isDurable() {
		return durable;
	}
	public CommandSubscribe setDurable(boolean durable) {
		this.durable = durable;
		_bitField0 |= _DURABLE_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandSubscribe clearDurable() {
		_bitField0 &= ~_DURABLE_MASK;
		durable = true;
		return this;
	}

	private MessageIdData startMessageId;
	private static final int _START_MESSAGE_ID_FIELD_NUMBER = 9;
	private static final int _START_MESSAGE_ID_TAG = (_START_MESSAGE_ID_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _START_MESSAGE_ID_TAG_SIZE = LightProtoCodec.computeVarIntSize(_START_MESSAGE_ID_TAG);
	private static final int _START_MESSAGE_ID_MASK = 1 << (8 % 32);
	public boolean hasStartMessageId() {
		return (_bitField0 & _START_MESSAGE_ID_MASK) != 0;
	}
	public MessageIdData getStartMessageId() {
		if (!hasStartMessageId()) {
			throw new IllegalStateException("Field 'start_message_id' is not set");
		}
		return startMessageId;
	}
	public MessageIdData setStartMessageId() {
		if (startMessageId == null) {
			startMessageId = new MessageIdData();
		}
		_bitField0 |= _START_MESSAGE_ID_MASK;
		_cachedSize = -1;
		return startMessageId;
	}
	public CommandSubscribe clearStartMessageId() {
		_bitField0 &= ~_START_MESSAGE_ID_MASK;
		if (hasStartMessageId()) {
			startMessageId.clear();
		}
		return this;
	}

	// Add optional metadata key=value to this consumer
	private java.util.List<KeyValue> metadatas = null;
	private int _metadatasCount = 0;
	private static final int _METADATA_FIELD_NUMBER = 10;
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
	public CommandSubscribe addAllMetadatas(Iterable<KeyValue> metadatas) {
		for (KeyValue _o : metadatas) {
			addMetadata().copyFrom(_o);
		}
		return this;
	}
	public CommandSubscribe clearMetadata() {
		for (int i = 0; i < _metadatasCount; i++) {
			metadatas.get(i).clear();
		}
		_metadatasCount = 0;
		return this;
	}

	private boolean readCompacted;
	private static final int _READ_COMPACTED_FIELD_NUMBER = 11;
	private static final int _READ_COMPACTED_TAG = (_READ_COMPACTED_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _READ_COMPACTED_TAG_SIZE = LightProtoCodec.computeVarIntSize(_READ_COMPACTED_TAG);
	private static final int _READ_COMPACTED_MASK = 1 << (10 % 32);
	public boolean hasReadCompacted() {
		return (_bitField0 & _READ_COMPACTED_MASK) != 0;
	}
	public boolean isReadCompacted() {
		if (!hasReadCompacted()) {
			throw new IllegalStateException("Field 'read_compacted' is not set");
		}
		return readCompacted;
	}
	public CommandSubscribe setReadCompacted(boolean readCompacted) {
		this.readCompacted = readCompacted;
		_bitField0 |= _READ_COMPACTED_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandSubscribe clearReadCompacted() {
		_bitField0 &= ~_READ_COMPACTED_MASK;
		return this;
	}

	private Schema schema;
	private static final int _SCHEMA_FIELD_NUMBER = 12;
	private static final int _SCHEMA_TAG = (_SCHEMA_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _SCHEMA_TAG_SIZE = LightProtoCodec.computeVarIntSize(_SCHEMA_TAG);
	private static final int _SCHEMA_MASK = 1 << (11 % 32);
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
	public CommandSubscribe clearSchema() {
		_bitField0 &= ~_SCHEMA_MASK;
		if (hasSchema()) {
			schema.clear();
		}
		return this;
	}

	private InitialPosition initialPosition = InitialPosition.Latest;
	private static final int _INITIAL_POSITION_FIELD_NUMBER = 13;
	private static final int _INITIAL_POSITION_TAG = (_INITIAL_POSITION_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _INITIAL_POSITION_TAG_SIZE = LightProtoCodec.computeVarIntSize(_INITIAL_POSITION_TAG);
	private static final int _INITIAL_POSITION_MASK = 1 << (12 % 32);
	public boolean hasInitialPosition() {
		return (_bitField0 & _INITIAL_POSITION_MASK) != 0;
	}
	public InitialPosition getInitialPosition() {
		return initialPosition;
	}
	public CommandSubscribe setInitialPosition(InitialPosition initialPosition) {
		this.initialPosition = initialPosition;
		_bitField0 |= _INITIAL_POSITION_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandSubscribe clearInitialPosition() {
		_bitField0 &= ~_INITIAL_POSITION_MASK;
		initialPosition = InitialPosition.Latest;
		return this;
	}

	private boolean replicateSubscriptionState;
	private static final int _REPLICATE_SUBSCRIPTION_STATE_FIELD_NUMBER = 14;
	private static final int _REPLICATE_SUBSCRIPTION_STATE_TAG = (_REPLICATE_SUBSCRIPTION_STATE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _REPLICATE_SUBSCRIPTION_STATE_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_REPLICATE_SUBSCRIPTION_STATE_TAG);
	private static final int _REPLICATE_SUBSCRIPTION_STATE_MASK = 1 << (13 % 32);
	public boolean hasReplicateSubscriptionState() {
		return (_bitField0 & _REPLICATE_SUBSCRIPTION_STATE_MASK) != 0;
	}
	public boolean isReplicateSubscriptionState() {
		if (!hasReplicateSubscriptionState()) {
			throw new IllegalStateException("Field 'replicate_subscription_state' is not set");
		}
		return replicateSubscriptionState;
	}
	public CommandSubscribe setReplicateSubscriptionState(boolean replicateSubscriptionState) {
		this.replicateSubscriptionState = replicateSubscriptionState;
		_bitField0 |= _REPLICATE_SUBSCRIPTION_STATE_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandSubscribe clearReplicateSubscriptionState() {
		_bitField0 &= ~_REPLICATE_SUBSCRIPTION_STATE_MASK;
		return this;
	}

	private boolean forceTopicCreation = true;
	private static final int _FORCE_TOPIC_CREATION_FIELD_NUMBER = 15;
	private static final int _FORCE_TOPIC_CREATION_TAG = (_FORCE_TOPIC_CREATION_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _FORCE_TOPIC_CREATION_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_FORCE_TOPIC_CREATION_TAG);
	private static final int _FORCE_TOPIC_CREATION_MASK = 1 << (14 % 32);
	public boolean hasForceTopicCreation() {
		return (_bitField0 & _FORCE_TOPIC_CREATION_MASK) != 0;
	}
	public boolean isForceTopicCreation() {
		return forceTopicCreation;
	}
	public CommandSubscribe setForceTopicCreation(boolean forceTopicCreation) {
		this.forceTopicCreation = forceTopicCreation;
		_bitField0 |= _FORCE_TOPIC_CREATION_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandSubscribe clearForceTopicCreation() {
		_bitField0 &= ~_FORCE_TOPIC_CREATION_MASK;
		forceTopicCreation = true;
		return this;
	}

	private long startMessageRollbackDurationSec = 0;
	private static final int _START_MESSAGE_ROLLBACK_DURATION_SEC_FIELD_NUMBER = 16;
	private static final int _START_MESSAGE_ROLLBACK_DURATION_SEC_TAG = (_START_MESSAGE_ROLLBACK_DURATION_SEC_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _START_MESSAGE_ROLLBACK_DURATION_SEC_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_START_MESSAGE_ROLLBACK_DURATION_SEC_TAG);
	private static final int _START_MESSAGE_ROLLBACK_DURATION_SEC_MASK = 1 << (15 % 32);
	public boolean hasStartMessageRollbackDurationSec() {
		return (_bitField0 & _START_MESSAGE_ROLLBACK_DURATION_SEC_MASK) != 0;
	}
	public long getStartMessageRollbackDurationSec() {
		return startMessageRollbackDurationSec;
	}
	public CommandSubscribe setStartMessageRollbackDurationSec(long startMessageRollbackDurationSec) {
		this.startMessageRollbackDurationSec = startMessageRollbackDurationSec;
		_bitField0 |= _START_MESSAGE_ROLLBACK_DURATION_SEC_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandSubscribe clearStartMessageRollbackDurationSec() {
		_bitField0 &= ~_START_MESSAGE_ROLLBACK_DURATION_SEC_MASK;
		startMessageRollbackDurationSec = 0;
		return this;
	}

	private KeySharedMeta keySharedMeta;
	private static final int _KEY_SHARED_META_FIELD_NUMBER = 17;
	private static final int _KEY_SHARED_META_TAG = (_KEY_SHARED_META_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _KEY_SHARED_META_TAG_SIZE = LightProtoCodec.computeVarIntSize(_KEY_SHARED_META_TAG);
	private static final int _KEY_SHARED_META_MASK = 1 << (16 % 32);
	public boolean hasKeySharedMeta() {
		return (_bitField0 & _KEY_SHARED_META_MASK) != 0;
	}
	public KeySharedMeta getKeySharedMeta() {
		if (!hasKeySharedMeta()) {
			throw new IllegalStateException("Field 'keySharedMeta' is not set");
		}
		return keySharedMeta;
	}
	public KeySharedMeta setKeySharedMeta() {
		if (keySharedMeta == null) {
			keySharedMeta = new KeySharedMeta();
		}
		_bitField0 |= _KEY_SHARED_META_MASK;
		_cachedSize = -1;
		return keySharedMeta;
	}
	public CommandSubscribe clearKeySharedMeta() {
		_bitField0 &= ~_KEY_SHARED_META_MASK;
		if (hasKeySharedMeta()) {
			keySharedMeta.clear();
		}
		return this;
	}

	private java.util.List<KeyValue> subscriptionProperties = null;
	private int _subscriptionPropertiesCount = 0;
	private static final int _SUBSCRIPTION_PROPERTIES_FIELD_NUMBER = 18;
	private static final int _SUBSCRIPTION_PROPERTIES_TAG = (_SUBSCRIPTION_PROPERTIES_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _SUBSCRIPTION_PROPERTIES_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_SUBSCRIPTION_PROPERTIES_TAG);
	public int getSubscriptionPropertiesCount() {
		return _subscriptionPropertiesCount;
	}
	public KeyValue getSubscriptionPropertyAt(int idx) {
		if (idx < 0 || idx >= _subscriptionPropertiesCount) {
			throw new IndexOutOfBoundsException("Index " + idx + " is out of the list size ("
					+ _subscriptionPropertiesCount + ") for field 'subscription_properties'");
		}
		return subscriptionProperties.get(idx);
	}
	public java.util.List<KeyValue> getSubscriptionPropertiesList() {
		if (_subscriptionPropertiesCount == 0) {
			return java.util.Collections.emptyList();
		} else {
			return subscriptionProperties.subList(0, _subscriptionPropertiesCount);
		}
	}
	public KeyValue addSubscriptionProperty() {
		if (subscriptionProperties == null) {
			subscriptionProperties = new java.util.ArrayList<KeyValue>();
		}
		if (subscriptionProperties.size() == _subscriptionPropertiesCount) {
			subscriptionProperties.add(new KeyValue());
		}
		_cachedSize = -1;
		return subscriptionProperties.get(_subscriptionPropertiesCount++);
	}
	public CommandSubscribe addAllSubscriptionProperties(Iterable<KeyValue> subscriptionProperties) {
		for (KeyValue _o : subscriptionProperties) {
			addSubscriptionProperty().copyFrom(_o);
		}
		return this;
	}
	public CommandSubscribe clearSubscriptionProperties() {
		for (int i = 0; i < _subscriptionPropertiesCount; i++) {
			subscriptionProperties.get(i).clear();
		}
		_subscriptionPropertiesCount = 0;
		return this;
	}

	private long consumerEpoch;
	private static final int _CONSUMER_EPOCH_FIELD_NUMBER = 19;
	private static final int _CONSUMER_EPOCH_TAG = (_CONSUMER_EPOCH_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _CONSUMER_EPOCH_TAG_SIZE = LightProtoCodec.computeVarIntSize(_CONSUMER_EPOCH_TAG);
	private static final int _CONSUMER_EPOCH_MASK = 1 << (18 % 32);
	public boolean hasConsumerEpoch() {
		return (_bitField0 & _CONSUMER_EPOCH_MASK) != 0;
	}
	public long getConsumerEpoch() {
		if (!hasConsumerEpoch()) {
			throw new IllegalStateException("Field 'consumer_epoch' is not set");
		}
		return consumerEpoch;
	}
	public CommandSubscribe setConsumerEpoch(long consumerEpoch) {
		this.consumerEpoch = consumerEpoch;
		_bitField0 |= _CONSUMER_EPOCH_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandSubscribe clearConsumerEpoch() {
		_bitField0 &= ~_CONSUMER_EPOCH_MASK;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _TOPIC_MASK | _SUBSCRIPTION_MASK | _SUB_TYPE_MASK
			| _CONSUMER_ID_MASK | _REQUEST_ID_MASK;
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
		LightProtoCodec.writeVarInt(_b, _SUBSCRIPTION_TAG);
		LightProtoCodec.writeVarInt(_b, _subscriptionBufferLen);
		if (_subscriptionBufferIdx == -1) {
			LightProtoCodec.writeString(_b, subscription, _subscriptionBufferLen);
		} else {
			_parsedBuffer.getBytes(_subscriptionBufferIdx, _b, _subscriptionBufferLen);
		}
		LightProtoCodec.writeVarInt(_b, _SUB_TYPE_TAG);
		LightProtoCodec.writeVarInt(_b, subType.getValue());
		LightProtoCodec.writeVarInt(_b, _CONSUMER_ID_TAG);
		LightProtoCodec.writeVarInt64(_b, consumerId);
		LightProtoCodec.writeVarInt(_b, _REQUEST_ID_TAG);
		LightProtoCodec.writeVarInt64(_b, requestId);
		if (hasConsumerName()) {
			LightProtoCodec.writeVarInt(_b, _CONSUMER_NAME_TAG);
			LightProtoCodec.writeVarInt(_b, _consumerNameBufferLen);
			if (_consumerNameBufferIdx == -1) {
				LightProtoCodec.writeString(_b, consumerName, _consumerNameBufferLen);
			} else {
				_parsedBuffer.getBytes(_consumerNameBufferIdx, _b, _consumerNameBufferLen);
			}
		}
		if (hasPriorityLevel()) {
			LightProtoCodec.writeVarInt(_b, _PRIORITY_LEVEL_TAG);
			LightProtoCodec.writeVarInt(_b, priorityLevel);
		}
		if (hasDurable()) {
			LightProtoCodec.writeVarInt(_b, _DURABLE_TAG);
			_b.writeBoolean(durable);
		}
		if (hasStartMessageId()) {
			LightProtoCodec.writeVarInt(_b, _START_MESSAGE_ID_TAG);
			LightProtoCodec.writeVarInt(_b, startMessageId.getSerializedSize());
			startMessageId.writeTo(_b);
		}
		for (int i = 0; i < _metadatasCount; i++) {
			KeyValue _item = metadatas.get(i);
			LightProtoCodec.writeVarInt(_b, _METADATA_TAG);
			LightProtoCodec.writeVarInt(_b, _item.getSerializedSize());
			_item.writeTo(_b);
		}
		if (hasReadCompacted()) {
			LightProtoCodec.writeVarInt(_b, _READ_COMPACTED_TAG);
			_b.writeBoolean(readCompacted);
		}
		if (hasSchema()) {
			LightProtoCodec.writeVarInt(_b, _SCHEMA_TAG);
			LightProtoCodec.writeVarInt(_b, schema.getSerializedSize());
			schema.writeTo(_b);
		}
		if (hasInitialPosition()) {
			LightProtoCodec.writeVarInt(_b, _INITIAL_POSITION_TAG);
			LightProtoCodec.writeVarInt(_b, initialPosition.getValue());
		}
		if (hasReplicateSubscriptionState()) {
			LightProtoCodec.writeVarInt(_b, _REPLICATE_SUBSCRIPTION_STATE_TAG);
			_b.writeBoolean(replicateSubscriptionState);
		}
		if (hasForceTopicCreation()) {
			LightProtoCodec.writeVarInt(_b, _FORCE_TOPIC_CREATION_TAG);
			_b.writeBoolean(forceTopicCreation);
		}
		if (hasStartMessageRollbackDurationSec()) {
			LightProtoCodec.writeVarInt(_b, _START_MESSAGE_ROLLBACK_DURATION_SEC_TAG);
			LightProtoCodec.writeVarInt64(_b, startMessageRollbackDurationSec);
		}
		if (hasKeySharedMeta()) {
			LightProtoCodec.writeVarInt(_b, _KEY_SHARED_META_TAG);
			LightProtoCodec.writeVarInt(_b, keySharedMeta.getSerializedSize());
			keySharedMeta.writeTo(_b);
		}
		for (int i = 0; i < _subscriptionPropertiesCount; i++) {
			KeyValue _item = subscriptionProperties.get(i);
			LightProtoCodec.writeVarInt(_b, _SUBSCRIPTION_PROPERTIES_TAG);
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
		_size += _TOPIC_TAG_SIZE;
		_size += LightProtoCodec.computeVarIntSize(_topicBufferLen);
		_size += _topicBufferLen;
		_size += _SUBSCRIPTION_TAG_SIZE;
		_size += LightProtoCodec.computeVarIntSize(_subscriptionBufferLen);
		_size += _subscriptionBufferLen;
		_size += _SUB_TYPE_TAG_SIZE;
		_size += LightProtoCodec.computeVarIntSize(subType.getValue());
		_size += _CONSUMER_ID_TAG_SIZE;
		_size += LightProtoCodec.computeVarInt64Size(consumerId);
		_size += _REQUEST_ID_TAG_SIZE;
		_size += LightProtoCodec.computeVarInt64Size(requestId);
		if (hasConsumerName()) {
			_size += _CONSUMER_NAME_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_consumerNameBufferLen);
			_size += _consumerNameBufferLen;
		}
		if (hasPriorityLevel()) {
			_size += _PRIORITY_LEVEL_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(priorityLevel);
		}
		if (hasDurable()) {
			_size += _DURABLE_TAG_SIZE;
			_size += 1;
		}
		if (hasStartMessageId()) {
			_size += LightProtoCodec.computeVarIntSize(_START_MESSAGE_ID_TAG);
			int MsgsizeStartMessageId = startMessageId.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeStartMessageId) + MsgsizeStartMessageId;
		}
		for (int i = 0; i < _metadatasCount; i++) {
			KeyValue _item = metadatas.get(i);
			_size += _METADATA_TAG_SIZE;
			int MsgsizeMetadata = _item.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeMetadata) + MsgsizeMetadata;
		}
		if (hasReadCompacted()) {
			_size += _READ_COMPACTED_TAG_SIZE;
			_size += 1;
		}
		if (hasSchema()) {
			_size += LightProtoCodec.computeVarIntSize(_SCHEMA_TAG);
			int MsgsizeSchema = schema.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeSchema) + MsgsizeSchema;
		}
		if (hasInitialPosition()) {
			_size += _INITIAL_POSITION_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(initialPosition.getValue());
		}
		if (hasReplicateSubscriptionState()) {
			_size += _REPLICATE_SUBSCRIPTION_STATE_TAG_SIZE;
			_size += 1;
		}
		if (hasForceTopicCreation()) {
			_size += _FORCE_TOPIC_CREATION_TAG_SIZE;
			_size += 1;
		}
		if (hasStartMessageRollbackDurationSec()) {
			_size += _START_MESSAGE_ROLLBACK_DURATION_SEC_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(startMessageRollbackDurationSec);
		}
		if (hasKeySharedMeta()) {
			_size += LightProtoCodec.computeVarIntSize(_KEY_SHARED_META_TAG);
			int MsgsizeKeySharedMeta = keySharedMeta.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeKeySharedMeta) + MsgsizeKeySharedMeta;
		}
		for (int i = 0; i < _subscriptionPropertiesCount; i++) {
			KeyValue _item = subscriptionProperties.get(i);
			_size += _SUBSCRIPTION_PROPERTIES_TAG_SIZE;
			int MsgsizeSubscriptionProperties = _item.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeSubscriptionProperties) + MsgsizeSubscriptionProperties;
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
				case _TOPIC_TAG :
					_bitField0 |= _TOPIC_MASK;
					_topicBufferLen = LightProtoCodec.readVarInt(_buffer);
					_topicBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_topicBufferLen);
					break;
				case _SUBSCRIPTION_TAG :
					_bitField0 |= _SUBSCRIPTION_MASK;
					_subscriptionBufferLen = LightProtoCodec.readVarInt(_buffer);
					_subscriptionBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_subscriptionBufferLen);
					break;
				case _SUB_TYPE_TAG :
					SubType _subType = SubType.valueOf(LightProtoCodec.readVarInt(_buffer));
					if (_subType != null) {
						_bitField0 |= _SUB_TYPE_MASK;
						subType = _subType;
					}
					break;
				case _CONSUMER_ID_TAG :
					_bitField0 |= _CONSUMER_ID_MASK;
					consumerId = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _REQUEST_ID_TAG :
					_bitField0 |= _REQUEST_ID_MASK;
					requestId = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _CONSUMER_NAME_TAG :
					_bitField0 |= _CONSUMER_NAME_MASK;
					_consumerNameBufferLen = LightProtoCodec.readVarInt(_buffer);
					_consumerNameBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_consumerNameBufferLen);
					break;
				case _PRIORITY_LEVEL_TAG :
					_bitField0 |= _PRIORITY_LEVEL_MASK;
					priorityLevel = LightProtoCodec.readVarInt(_buffer);
					break;
				case _DURABLE_TAG :
					_bitField0 |= _DURABLE_MASK;
					durable = LightProtoCodec.readVarInt(_buffer) == 1;
					break;
				case _START_MESSAGE_ID_TAG :
					_bitField0 |= _START_MESSAGE_ID_MASK;
					int startMessageIdSize = LightProtoCodec.readVarInt(_buffer);
					setStartMessageId().parseFrom(_buffer, startMessageIdSize);
					break;
				case _METADATA_TAG :
					int _metadataSize = LightProtoCodec.readVarInt(_buffer);
					addMetadata().parseFrom(_buffer, _metadataSize);
					break;
				case _READ_COMPACTED_TAG :
					_bitField0 |= _READ_COMPACTED_MASK;
					readCompacted = LightProtoCodec.readVarInt(_buffer) == 1;
					break;
				case _SCHEMA_TAG :
					_bitField0 |= _SCHEMA_MASK;
					int schemaSize = LightProtoCodec.readVarInt(_buffer);
					setSchema().parseFrom(_buffer, schemaSize);
					break;
				case _INITIAL_POSITION_TAG :
					InitialPosition _initialPosition = InitialPosition.valueOf(LightProtoCodec.readVarInt(_buffer));
					if (_initialPosition != null) {
						_bitField0 |= _INITIAL_POSITION_MASK;
						initialPosition = _initialPosition;
					}
					break;
				case _REPLICATE_SUBSCRIPTION_STATE_TAG :
					_bitField0 |= _REPLICATE_SUBSCRIPTION_STATE_MASK;
					replicateSubscriptionState = LightProtoCodec.readVarInt(_buffer) == 1;
					break;
				case _FORCE_TOPIC_CREATION_TAG :
					_bitField0 |= _FORCE_TOPIC_CREATION_MASK;
					forceTopicCreation = LightProtoCodec.readVarInt(_buffer) == 1;
					break;
				case _START_MESSAGE_ROLLBACK_DURATION_SEC_TAG :
					_bitField0 |= _START_MESSAGE_ROLLBACK_DURATION_SEC_MASK;
					startMessageRollbackDurationSec = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _KEY_SHARED_META_TAG :
					_bitField0 |= _KEY_SHARED_META_MASK;
					int keySharedMetaSize = LightProtoCodec.readVarInt(_buffer);
					setKeySharedMeta().parseFrom(_buffer, keySharedMetaSize);
					break;
				case _SUBSCRIPTION_PROPERTIES_TAG :
					int _subscriptionPropertiesSize = LightProtoCodec.readVarInt(_buffer);
					addSubscriptionProperty().parseFrom(_buffer, _subscriptionPropertiesSize);
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
	public CommandSubscribe clear() {
		topic = null;
		_topicBufferIdx = -1;
		_topicBufferLen = -1;
		subscription = null;
		_subscriptionBufferIdx = -1;
		_subscriptionBufferLen = -1;
		consumerName = null;
		_consumerNameBufferIdx = -1;
		_consumerNameBufferLen = -1;
		durable = true;
		if (hasStartMessageId()) {
			startMessageId.clear();
		}
		for (int i = 0; i < _metadatasCount; i++) {
			metadatas.get(i).clear();
		}
		_metadatasCount = 0;
		if (hasSchema()) {
			schema.clear();
		}
		initialPosition = InitialPosition.Latest;
		forceTopicCreation = true;
		startMessageRollbackDurationSec = 0;
		if (hasKeySharedMeta()) {
			keySharedMeta.clear();
		}
		for (int i = 0; i < _subscriptionPropertiesCount; i++) {
			subscriptionProperties.get(i).clear();
		}
		_subscriptionPropertiesCount = 0;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public CommandSubscribe copyFrom(CommandSubscribe _other) {
		_cachedSize = -1;
		if (_other.hasTopic()) {
			setTopic(_other.getTopic());
		}
		if (_other.hasSubscription()) {
			setSubscription(_other.getSubscription());
		}
		if (_other.hasSubType()) {
			setSubType(_other.subType);
		}
		if (_other.hasConsumerId()) {
			setConsumerId(_other.consumerId);
		}
		if (_other.hasRequestId()) {
			setRequestId(_other.requestId);
		}
		if (_other.hasConsumerName()) {
			setConsumerName(_other.getConsumerName());
		}
		if (_other.hasPriorityLevel()) {
			setPriorityLevel(_other.priorityLevel);
		}
		if (_other.hasDurable()) {
			setDurable(_other.durable);
		}
		if (_other.hasStartMessageId()) {
			setStartMessageId().copyFrom(_other.startMessageId);
		}
		for (int i = 0; i < _other.getMetadatasCount(); i++) {
			addMetadata().copyFrom(_other.getMetadataAt(i));
		}
		if (_other.hasReadCompacted()) {
			setReadCompacted(_other.readCompacted);
		}
		if (_other.hasSchema()) {
			setSchema().copyFrom(_other.schema);
		}
		if (_other.hasInitialPosition()) {
			setInitialPosition(_other.initialPosition);
		}
		if (_other.hasReplicateSubscriptionState()) {
			setReplicateSubscriptionState(_other.replicateSubscriptionState);
		}
		if (_other.hasForceTopicCreation()) {
			setForceTopicCreation(_other.forceTopicCreation);
		}
		if (_other.hasStartMessageRollbackDurationSec()) {
			setStartMessageRollbackDurationSec(_other.startMessageRollbackDurationSec);
		}
		if (_other.hasKeySharedMeta()) {
			setKeySharedMeta().copyFrom(_other.keySharedMeta);
		}
		for (int i = 0; i < _other.getSubscriptionPropertiesCount(); i++) {
			addSubscriptionProperty().copyFrom(_other.getSubscriptionPropertyAt(i));
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
