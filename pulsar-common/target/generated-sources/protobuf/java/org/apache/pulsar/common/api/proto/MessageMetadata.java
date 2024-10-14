package org.apache.pulsar.common.api.proto;
public final class MessageMetadata {
	private String producerName;
	private int _producerNameBufferIdx = -1;
	private int _producerNameBufferLen = -1;
	private static final int _PRODUCER_NAME_FIELD_NUMBER = 1;
	private static final int _PRODUCER_NAME_TAG = (_PRODUCER_NAME_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _PRODUCER_NAME_TAG_SIZE = LightProtoCodec.computeVarIntSize(_PRODUCER_NAME_TAG);
	private static final int _PRODUCER_NAME_MASK = 1 << (0 % 32);
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
	public MessageMetadata setProducerName(String producerName) {
		this.producerName = producerName;
		_bitField0 |= _PRODUCER_NAME_MASK;
		_producerNameBufferIdx = -1;
		_producerNameBufferLen = LightProtoCodec.computeStringUTF8Size(producerName);
		_cachedSize = -1;
		return this;
	}
	public MessageMetadata clearProducerName() {
		_bitField0 &= ~_PRODUCER_NAME_MASK;
		producerName = null;
		_producerNameBufferIdx = -1;
		_producerNameBufferLen = -1;
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
	public MessageMetadata setSequenceId(long sequenceId) {
		this.sequenceId = sequenceId;
		_bitField0 |= _SEQUENCE_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public MessageMetadata clearSequenceId() {
		_bitField0 &= ~_SEQUENCE_ID_MASK;
		return this;
	}

	private long publishTime;
	private static final int _PUBLISH_TIME_FIELD_NUMBER = 3;
	private static final int _PUBLISH_TIME_TAG = (_PUBLISH_TIME_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _PUBLISH_TIME_TAG_SIZE = LightProtoCodec.computeVarIntSize(_PUBLISH_TIME_TAG);
	private static final int _PUBLISH_TIME_MASK = 1 << (2 % 32);
	public boolean hasPublishTime() {
		return (_bitField0 & _PUBLISH_TIME_MASK) != 0;
	}
	public long getPublishTime() {
		if (!hasPublishTime()) {
			throw new IllegalStateException("Field 'publish_time' is not set");
		}
		return publishTime;
	}
	public MessageMetadata setPublishTime(long publishTime) {
		this.publishTime = publishTime;
		_bitField0 |= _PUBLISH_TIME_MASK;
		_cachedSize = -1;
		return this;
	}
	public MessageMetadata clearPublishTime() {
		_bitField0 &= ~_PUBLISH_TIME_MASK;
		return this;
	}

	private java.util.List<KeyValue> properties = null;
	private int _propertiesCount = 0;
	private static final int _PROPERTIES_FIELD_NUMBER = 4;
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
	public MessageMetadata addAllProperties(Iterable<KeyValue> properties) {
		for (KeyValue _o : properties) {
			addProperty().copyFrom(_o);
		}
		return this;
	}
	public MessageMetadata clearProperties() {
		for (int i = 0; i < _propertiesCount; i++) {
			properties.get(i).clear();
		}
		_propertiesCount = 0;
		return this;
	}

	private String replicatedFrom;
	private int _replicatedFromBufferIdx = -1;
	private int _replicatedFromBufferLen = -1;
	private static final int _REPLICATED_FROM_FIELD_NUMBER = 5;
	private static final int _REPLICATED_FROM_TAG = (_REPLICATED_FROM_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _REPLICATED_FROM_TAG_SIZE = LightProtoCodec.computeVarIntSize(_REPLICATED_FROM_TAG);
	private static final int _REPLICATED_FROM_MASK = 1 << (4 % 32);
	public boolean hasReplicatedFrom() {
		return (_bitField0 & _REPLICATED_FROM_MASK) != 0;
	}
	public String getReplicatedFrom() {
		if (!hasReplicatedFrom()) {
			throw new IllegalStateException("Field 'replicated_from' is not set");
		}
		if (replicatedFrom == null) {
			replicatedFrom = LightProtoCodec.readString(_parsedBuffer, _replicatedFromBufferIdx,
					_replicatedFromBufferLen);
		}
		return replicatedFrom;
	}
	public MessageMetadata setReplicatedFrom(String replicatedFrom) {
		this.replicatedFrom = replicatedFrom;
		_bitField0 |= _REPLICATED_FROM_MASK;
		_replicatedFromBufferIdx = -1;
		_replicatedFromBufferLen = LightProtoCodec.computeStringUTF8Size(replicatedFrom);
		_cachedSize = -1;
		return this;
	}
	public MessageMetadata clearReplicatedFrom() {
		_bitField0 &= ~_REPLICATED_FROM_MASK;
		replicatedFrom = null;
		_replicatedFromBufferIdx = -1;
		_replicatedFromBufferLen = -1;
		return this;
	}

	private String partitionKey;
	private int _partitionKeyBufferIdx = -1;
	private int _partitionKeyBufferLen = -1;
	private static final int _PARTITION_KEY_FIELD_NUMBER = 6;
	private static final int _PARTITION_KEY_TAG = (_PARTITION_KEY_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _PARTITION_KEY_TAG_SIZE = LightProtoCodec.computeVarIntSize(_PARTITION_KEY_TAG);
	private static final int _PARTITION_KEY_MASK = 1 << (5 % 32);
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
	public MessageMetadata setPartitionKey(String partitionKey) {
		this.partitionKey = partitionKey;
		_bitField0 |= _PARTITION_KEY_MASK;
		_partitionKeyBufferIdx = -1;
		_partitionKeyBufferLen = LightProtoCodec.computeStringUTF8Size(partitionKey);
		_cachedSize = -1;
		return this;
	}
	public MessageMetadata clearPartitionKey() {
		_bitField0 &= ~_PARTITION_KEY_MASK;
		partitionKey = null;
		_partitionKeyBufferIdx = -1;
		_partitionKeyBufferLen = -1;
		return this;
	}

	private java.util.List<LightProtoCodec.StringHolder> replicateTos = null;
	private int _replicateTosCount = 0;
	private static final int _REPLICATE_TO_FIELD_NUMBER = 7;
	private static final int _REPLICATE_TO_TAG = (_REPLICATE_TO_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _REPLICATE_TO_TAG_SIZE = LightProtoCodec.computeVarIntSize(_REPLICATE_TO_TAG);
	public int getReplicateTosCount() {
		return _replicateTosCount;
	}
	public String getReplicateToAt(int idx) {
		if (idx < 0 || idx >= _replicateTosCount) {
			throw new IndexOutOfBoundsException(
					"Index " + idx + " is out of the list size (" + _replicateTosCount + ") for field 'replicate_to'");
		}
		LightProtoCodec.StringHolder _sh = replicateTos.get(idx);
		if (_sh.s == null) {
			_sh.s = LightProtoCodec.readString(_parsedBuffer, _sh.idx, _sh.len);
		}
		return _sh.s;
	}
	public java.util.List<String> getReplicateTosList() {
		if (_replicateTosCount == 0) {
			return java.util.Collections.emptyList();
		} else {
			java.util.List<String> _l = new java.util.ArrayList<>();
			for (int i = 0; i < _replicateTosCount; i++) {
				_l.add(getReplicateToAt(i));
			}
			return _l;
		}
	}
	public void addReplicateTo(String replicateTo) {
		if (replicateTos == null) {
			replicateTos = new java.util.ArrayList<LightProtoCodec.StringHolder>();
		}
		LightProtoCodec.StringHolder _sh = _newReplicateToStringHolder();
		_cachedSize = -1;
		_sh.s = replicateTo;
		_sh.idx = -1;
		_sh.len = LightProtoCodec.computeStringUTF8Size(_sh.s);
	}
	public MessageMetadata addAllReplicateTos(Iterable<String> replicateTos) {
		for (String _s : replicateTos) {
			addReplicateTo(_s);
		}
		return this;
	}
	private LightProtoCodec.StringHolder _newReplicateToStringHolder() {
		if (replicateTos == null) {
			replicateTos = new java.util.ArrayList<LightProtoCodec.StringHolder>();
		}
		LightProtoCodec.StringHolder _sh;
		if (replicateTos.size() == _replicateTosCount) {
			_sh = new LightProtoCodec.StringHolder();
			replicateTos.add(_sh);
		} else {
			_sh = replicateTos.get(_replicateTosCount);
		}
		_replicateTosCount++;
		return _sh;
	}
	public MessageMetadata clearReplicateTo() {
		for (int i = 0; i < _replicateTosCount; i++) {
			LightProtoCodec.StringHolder _sh = replicateTos.get(i);
			_sh.s = null;
			_sh.idx = -1;
			_sh.len = -1;
		}
		_replicateTosCount = 0;
		return this;
	}

	private CompressionType compression = CompressionType.NONE;
	private static final int _COMPRESSION_FIELD_NUMBER = 8;
	private static final int _COMPRESSION_TAG = (_COMPRESSION_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _COMPRESSION_TAG_SIZE = LightProtoCodec.computeVarIntSize(_COMPRESSION_TAG);
	private static final int _COMPRESSION_MASK = 1 << (7 % 32);
	public boolean hasCompression() {
		return (_bitField0 & _COMPRESSION_MASK) != 0;
	}
	public CompressionType getCompression() {
		return compression;
	}
	public MessageMetadata setCompression(CompressionType compression) {
		this.compression = compression;
		_bitField0 |= _COMPRESSION_MASK;
		_cachedSize = -1;
		return this;
	}
	public MessageMetadata clearCompression() {
		_bitField0 &= ~_COMPRESSION_MASK;
		compression = CompressionType.NONE;
		return this;
	}

	private int uncompressedSize = 0;
	private static final int _UNCOMPRESSED_SIZE_FIELD_NUMBER = 9;
	private static final int _UNCOMPRESSED_SIZE_TAG = (_UNCOMPRESSED_SIZE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _UNCOMPRESSED_SIZE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_UNCOMPRESSED_SIZE_TAG);
	private static final int _UNCOMPRESSED_SIZE_MASK = 1 << (8 % 32);
	public boolean hasUncompressedSize() {
		return (_bitField0 & _UNCOMPRESSED_SIZE_MASK) != 0;
	}
	public int getUncompressedSize() {
		return uncompressedSize;
	}
	public MessageMetadata setUncompressedSize(int uncompressedSize) {
		this.uncompressedSize = uncompressedSize;
		_bitField0 |= _UNCOMPRESSED_SIZE_MASK;
		_cachedSize = -1;
		return this;
	}
	public MessageMetadata clearUncompressedSize() {
		_bitField0 &= ~_UNCOMPRESSED_SIZE_MASK;
		uncompressedSize = 0;
		return this;
	}

	private int numMessagesInBatch = 1;
	private static final int _NUM_MESSAGES_IN_BATCH_FIELD_NUMBER = 11;
	private static final int _NUM_MESSAGES_IN_BATCH_TAG = (_NUM_MESSAGES_IN_BATCH_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _NUM_MESSAGES_IN_BATCH_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_NUM_MESSAGES_IN_BATCH_TAG);
	private static final int _NUM_MESSAGES_IN_BATCH_MASK = 1 << (9 % 32);
	public boolean hasNumMessagesInBatch() {
		return (_bitField0 & _NUM_MESSAGES_IN_BATCH_MASK) != 0;
	}
	public int getNumMessagesInBatch() {
		return numMessagesInBatch;
	}
	public MessageMetadata setNumMessagesInBatch(int numMessagesInBatch) {
		this.numMessagesInBatch = numMessagesInBatch;
		_bitField0 |= _NUM_MESSAGES_IN_BATCH_MASK;
		_cachedSize = -1;
		return this;
	}
	public MessageMetadata clearNumMessagesInBatch() {
		_bitField0 &= ~_NUM_MESSAGES_IN_BATCH_MASK;
		numMessagesInBatch = 1;
		return this;
	}

	private long eventTime = 0;
	private static final int _EVENT_TIME_FIELD_NUMBER = 12;
	private static final int _EVENT_TIME_TAG = (_EVENT_TIME_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _EVENT_TIME_TAG_SIZE = LightProtoCodec.computeVarIntSize(_EVENT_TIME_TAG);
	private static final int _EVENT_TIME_MASK = 1 << (10 % 32);
	public boolean hasEventTime() {
		return (_bitField0 & _EVENT_TIME_MASK) != 0;
	}
	public long getEventTime() {
		return eventTime;
	}
	public MessageMetadata setEventTime(long eventTime) {
		this.eventTime = eventTime;
		_bitField0 |= _EVENT_TIME_MASK;
		_cachedSize = -1;
		return this;
	}
	public MessageMetadata clearEventTime() {
		_bitField0 &= ~_EVENT_TIME_MASK;
		eventTime = 0;
		return this;
	}

	private java.util.List<EncryptionKeys> encryptionKeys = null;
	private int _encryptionKeysCount = 0;
	private static final int _ENCRYPTION_KEYS_FIELD_NUMBER = 13;
	private static final int _ENCRYPTION_KEYS_TAG = (_ENCRYPTION_KEYS_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _ENCRYPTION_KEYS_TAG_SIZE = LightProtoCodec.computeVarIntSize(_ENCRYPTION_KEYS_TAG);
	public int getEncryptionKeysCount() {
		return _encryptionKeysCount;
	}
	public EncryptionKeys getEncryptionKeyAt(int idx) {
		if (idx < 0 || idx >= _encryptionKeysCount) {
			throw new IndexOutOfBoundsException("Index " + idx + " is out of the list size (" + _encryptionKeysCount
					+ ") for field 'encryption_keys'");
		}
		return encryptionKeys.get(idx);
	}
	public java.util.List<EncryptionKeys> getEncryptionKeysList() {
		if (_encryptionKeysCount == 0) {
			return java.util.Collections.emptyList();
		} else {
			return encryptionKeys.subList(0, _encryptionKeysCount);
		}
	}
	public EncryptionKeys addEncryptionKey() {
		if (encryptionKeys == null) {
			encryptionKeys = new java.util.ArrayList<EncryptionKeys>();
		}
		if (encryptionKeys.size() == _encryptionKeysCount) {
			encryptionKeys.add(new EncryptionKeys());
		}
		_cachedSize = -1;
		return encryptionKeys.get(_encryptionKeysCount++);
	}
	public MessageMetadata addAllEncryptionKeys(Iterable<EncryptionKeys> encryptionKeys) {
		for (EncryptionKeys _o : encryptionKeys) {
			addEncryptionKey().copyFrom(_o);
		}
		return this;
	}
	public MessageMetadata clearEncryptionKeys() {
		for (int i = 0; i < _encryptionKeysCount; i++) {
			encryptionKeys.get(i).clear();
		}
		_encryptionKeysCount = 0;
		return this;
	}

	private String encryptionAlgo;
	private int _encryptionAlgoBufferIdx = -1;
	private int _encryptionAlgoBufferLen = -1;
	private static final int _ENCRYPTION_ALGO_FIELD_NUMBER = 14;
	private static final int _ENCRYPTION_ALGO_TAG = (_ENCRYPTION_ALGO_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _ENCRYPTION_ALGO_TAG_SIZE = LightProtoCodec.computeVarIntSize(_ENCRYPTION_ALGO_TAG);
	private static final int _ENCRYPTION_ALGO_MASK = 1 << (12 % 32);
	public boolean hasEncryptionAlgo() {
		return (_bitField0 & _ENCRYPTION_ALGO_MASK) != 0;
	}
	public String getEncryptionAlgo() {
		if (!hasEncryptionAlgo()) {
			throw new IllegalStateException("Field 'encryption_algo' is not set");
		}
		if (encryptionAlgo == null) {
			encryptionAlgo = LightProtoCodec.readString(_parsedBuffer, _encryptionAlgoBufferIdx,
					_encryptionAlgoBufferLen);
		}
		return encryptionAlgo;
	}
	public MessageMetadata setEncryptionAlgo(String encryptionAlgo) {
		this.encryptionAlgo = encryptionAlgo;
		_bitField0 |= _ENCRYPTION_ALGO_MASK;
		_encryptionAlgoBufferIdx = -1;
		_encryptionAlgoBufferLen = LightProtoCodec.computeStringUTF8Size(encryptionAlgo);
		_cachedSize = -1;
		return this;
	}
	public MessageMetadata clearEncryptionAlgo() {
		_bitField0 &= ~_ENCRYPTION_ALGO_MASK;
		encryptionAlgo = null;
		_encryptionAlgoBufferIdx = -1;
		_encryptionAlgoBufferLen = -1;
		return this;
	}

	private io.netty.buffer.ByteBuf encryptionParam = null;
	private int _encryptionParamIdx = -1;
	private int _encryptionParamLen = -1;
	private static final int _ENCRYPTION_PARAM_FIELD_NUMBER = 15;
	private static final int _ENCRYPTION_PARAM_TAG = (_ENCRYPTION_PARAM_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _ENCRYPTION_PARAM_TAG_SIZE = LightProtoCodec.computeVarIntSize(_ENCRYPTION_PARAM_TAG);
	private static final int _ENCRYPTION_PARAM_MASK = 1 << (13 % 32);
	public boolean hasEncryptionParam() {
		return (_bitField0 & _ENCRYPTION_PARAM_MASK) != 0;
	}
	public int getEncryptionParamSize() {
		if (!hasEncryptionParam()) {
			throw new IllegalStateException("Field 'encryption_param' is not set");
		}
		return _encryptionParamLen;
	}
	public byte[] getEncryptionParam() {
		io.netty.buffer.ByteBuf _b = getEncryptionParamSlice();
		byte[] res = new byte[_b.readableBytes()];
		_b.getBytes(0, res);
		return res;
	}
	public io.netty.buffer.ByteBuf getEncryptionParamSlice() {
		if (!hasEncryptionParam()) {
			throw new IllegalStateException("Field 'encryption_param' is not set");
		}
		if (encryptionParam == null) {
			return _parsedBuffer.slice(_encryptionParamIdx, _encryptionParamLen);
		} else {
			return encryptionParam.slice(0, _encryptionParamLen);
		}
	}
	public MessageMetadata setEncryptionParam(byte[] encryptionParam) {
		setEncryptionParam(io.netty.buffer.Unpooled.wrappedBuffer(encryptionParam));
		return this;
	}
	public MessageMetadata setEncryptionParam(io.netty.buffer.ByteBuf encryptionParam) {
		this.encryptionParam = encryptionParam;
		_bitField0 |= _ENCRYPTION_PARAM_MASK;
		_encryptionParamIdx = -1;
		_encryptionParamLen = encryptionParam.readableBytes();
		_cachedSize = -1;
		return this;
	}
	public MessageMetadata clearEncryptionParam() {
		_bitField0 &= ~_ENCRYPTION_PARAM_MASK;
		encryptionParam = null;
		_encryptionParamIdx = -1;
		_encryptionParamLen = -1;
		return this;
	}

	private io.netty.buffer.ByteBuf schemaVersion = null;
	private int _schemaVersionIdx = -1;
	private int _schemaVersionLen = -1;
	private static final int _SCHEMA_VERSION_FIELD_NUMBER = 16;
	private static final int _SCHEMA_VERSION_TAG = (_SCHEMA_VERSION_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _SCHEMA_VERSION_TAG_SIZE = LightProtoCodec.computeVarIntSize(_SCHEMA_VERSION_TAG);
	private static final int _SCHEMA_VERSION_MASK = 1 << (14 % 32);
	public boolean hasSchemaVersion() {
		return (_bitField0 & _SCHEMA_VERSION_MASK) != 0;
	}
	public int getSchemaVersionSize() {
		if (!hasSchemaVersion()) {
			throw new IllegalStateException("Field 'schema_version' is not set");
		}
		return _schemaVersionLen;
	}
	public byte[] getSchemaVersion() {
		io.netty.buffer.ByteBuf _b = getSchemaVersionSlice();
		byte[] res = new byte[_b.readableBytes()];
		_b.getBytes(0, res);
		return res;
	}
	public io.netty.buffer.ByteBuf getSchemaVersionSlice() {
		if (!hasSchemaVersion()) {
			throw new IllegalStateException("Field 'schema_version' is not set");
		}
		if (schemaVersion == null) {
			return _parsedBuffer.slice(_schemaVersionIdx, _schemaVersionLen);
		} else {
			return schemaVersion.slice(0, _schemaVersionLen);
		}
	}
	public MessageMetadata setSchemaVersion(byte[] schemaVersion) {
		setSchemaVersion(io.netty.buffer.Unpooled.wrappedBuffer(schemaVersion));
		return this;
	}
	public MessageMetadata setSchemaVersion(io.netty.buffer.ByteBuf schemaVersion) {
		this.schemaVersion = schemaVersion;
		_bitField0 |= _SCHEMA_VERSION_MASK;
		_schemaVersionIdx = -1;
		_schemaVersionLen = schemaVersion.readableBytes();
		_cachedSize = -1;
		return this;
	}
	public MessageMetadata clearSchemaVersion() {
		_bitField0 &= ~_SCHEMA_VERSION_MASK;
		schemaVersion = null;
		_schemaVersionIdx = -1;
		_schemaVersionLen = -1;
		return this;
	}

	private boolean partitionKeyB64Encoded = false;
	private static final int _PARTITION_KEY_B64_ENCODED_FIELD_NUMBER = 17;
	private static final int _PARTITION_KEY_B64_ENCODED_TAG = (_PARTITION_KEY_B64_ENCODED_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _PARTITION_KEY_B64_ENCODED_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_PARTITION_KEY_B64_ENCODED_TAG);
	private static final int _PARTITION_KEY_B64_ENCODED_MASK = 1 << (15 % 32);
	public boolean hasPartitionKeyB64Encoded() {
		return (_bitField0 & _PARTITION_KEY_B64_ENCODED_MASK) != 0;
	}
	public boolean isPartitionKeyB64Encoded() {
		return partitionKeyB64Encoded;
	}
	public MessageMetadata setPartitionKeyB64Encoded(boolean partitionKeyB64Encoded) {
		this.partitionKeyB64Encoded = partitionKeyB64Encoded;
		_bitField0 |= _PARTITION_KEY_B64_ENCODED_MASK;
		_cachedSize = -1;
		return this;
	}
	public MessageMetadata clearPartitionKeyB64Encoded() {
		_bitField0 &= ~_PARTITION_KEY_B64_ENCODED_MASK;
		partitionKeyB64Encoded = false;
		return this;
	}

	private io.netty.buffer.ByteBuf orderingKey = null;
	private int _orderingKeyIdx = -1;
	private int _orderingKeyLen = -1;
	private static final int _ORDERING_KEY_FIELD_NUMBER = 18;
	private static final int _ORDERING_KEY_TAG = (_ORDERING_KEY_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _ORDERING_KEY_TAG_SIZE = LightProtoCodec.computeVarIntSize(_ORDERING_KEY_TAG);
	private static final int _ORDERING_KEY_MASK = 1 << (16 % 32);
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
	public MessageMetadata setOrderingKey(byte[] orderingKey) {
		setOrderingKey(io.netty.buffer.Unpooled.wrappedBuffer(orderingKey));
		return this;
	}
	public MessageMetadata setOrderingKey(io.netty.buffer.ByteBuf orderingKey) {
		this.orderingKey = orderingKey;
		_bitField0 |= _ORDERING_KEY_MASK;
		_orderingKeyIdx = -1;
		_orderingKeyLen = orderingKey.readableBytes();
		_cachedSize = -1;
		return this;
	}
	public MessageMetadata clearOrderingKey() {
		_bitField0 &= ~_ORDERING_KEY_MASK;
		orderingKey = null;
		_orderingKeyIdx = -1;
		_orderingKeyLen = -1;
		return this;
	}

	private long deliverAtTime;
	private static final int _DELIVER_AT_TIME_FIELD_NUMBER = 19;
	private static final int _DELIVER_AT_TIME_TAG = (_DELIVER_AT_TIME_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _DELIVER_AT_TIME_TAG_SIZE = LightProtoCodec.computeVarIntSize(_DELIVER_AT_TIME_TAG);
	private static final int _DELIVER_AT_TIME_MASK = 1 << (17 % 32);
	public boolean hasDeliverAtTime() {
		return (_bitField0 & _DELIVER_AT_TIME_MASK) != 0;
	}
	public long getDeliverAtTime() {
		if (!hasDeliverAtTime()) {
			throw new IllegalStateException("Field 'deliver_at_time' is not set");
		}
		return deliverAtTime;
	}
	public MessageMetadata setDeliverAtTime(long deliverAtTime) {
		this.deliverAtTime = deliverAtTime;
		_bitField0 |= _DELIVER_AT_TIME_MASK;
		_cachedSize = -1;
		return this;
	}
	public MessageMetadata clearDeliverAtTime() {
		_bitField0 &= ~_DELIVER_AT_TIME_MASK;
		return this;
	}

	private int markerType;
	private static final int _MARKER_TYPE_FIELD_NUMBER = 20;
	private static final int _MARKER_TYPE_TAG = (_MARKER_TYPE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _MARKER_TYPE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_MARKER_TYPE_TAG);
	private static final int _MARKER_TYPE_MASK = 1 << (18 % 32);
	public boolean hasMarkerType() {
		return (_bitField0 & _MARKER_TYPE_MASK) != 0;
	}
	public int getMarkerType() {
		if (!hasMarkerType()) {
			throw new IllegalStateException("Field 'marker_type' is not set");
		}
		return markerType;
	}
	public MessageMetadata setMarkerType(int markerType) {
		this.markerType = markerType;
		_bitField0 |= _MARKER_TYPE_MASK;
		_cachedSize = -1;
		return this;
	}
	public MessageMetadata clearMarkerType() {
		_bitField0 &= ~_MARKER_TYPE_MASK;
		return this;
	}

	private long txnidLeastBits;
	private static final int _TXNID_LEAST_BITS_FIELD_NUMBER = 22;
	private static final int _TXNID_LEAST_BITS_TAG = (_TXNID_LEAST_BITS_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _TXNID_LEAST_BITS_TAG_SIZE = LightProtoCodec.computeVarIntSize(_TXNID_LEAST_BITS_TAG);
	private static final int _TXNID_LEAST_BITS_MASK = 1 << (19 % 32);
	public boolean hasTxnidLeastBits() {
		return (_bitField0 & _TXNID_LEAST_BITS_MASK) != 0;
	}
	public long getTxnidLeastBits() {
		if (!hasTxnidLeastBits()) {
			throw new IllegalStateException("Field 'txnid_least_bits' is not set");
		}
		return txnidLeastBits;
	}
	public MessageMetadata setTxnidLeastBits(long txnidLeastBits) {
		this.txnidLeastBits = txnidLeastBits;
		_bitField0 |= _TXNID_LEAST_BITS_MASK;
		_cachedSize = -1;
		return this;
	}
	public MessageMetadata clearTxnidLeastBits() {
		_bitField0 &= ~_TXNID_LEAST_BITS_MASK;
		return this;
	}

	private long txnidMostBits;
	private static final int _TXNID_MOST_BITS_FIELD_NUMBER = 23;
	private static final int _TXNID_MOST_BITS_TAG = (_TXNID_MOST_BITS_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _TXNID_MOST_BITS_TAG_SIZE = LightProtoCodec.computeVarIntSize(_TXNID_MOST_BITS_TAG);
	private static final int _TXNID_MOST_BITS_MASK = 1 << (20 % 32);
	public boolean hasTxnidMostBits() {
		return (_bitField0 & _TXNID_MOST_BITS_MASK) != 0;
	}
	public long getTxnidMostBits() {
		if (!hasTxnidMostBits()) {
			throw new IllegalStateException("Field 'txnid_most_bits' is not set");
		}
		return txnidMostBits;
	}
	public MessageMetadata setTxnidMostBits(long txnidMostBits) {
		this.txnidMostBits = txnidMostBits;
		_bitField0 |= _TXNID_MOST_BITS_MASK;
		_cachedSize = -1;
		return this;
	}
	public MessageMetadata clearTxnidMostBits() {
		_bitField0 &= ~_TXNID_MOST_BITS_MASK;
		return this;
	}

	// Add highest sequence id to support batch message with external sequence id
	private long highestSequenceId = 0;
	private static final int _HIGHEST_SEQUENCE_ID_FIELD_NUMBER = 24;
	private static final int _HIGHEST_SEQUENCE_ID_TAG = (_HIGHEST_SEQUENCE_ID_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _HIGHEST_SEQUENCE_ID_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_HIGHEST_SEQUENCE_ID_TAG);
	private static final int _HIGHEST_SEQUENCE_ID_MASK = 1 << (21 % 32);
	public boolean hasHighestSequenceId() {
		return (_bitField0 & _HIGHEST_SEQUENCE_ID_MASK) != 0;
	}
	public long getHighestSequenceId() {
		return highestSequenceId;
	}
	public MessageMetadata setHighestSequenceId(long highestSequenceId) {
		this.highestSequenceId = highestSequenceId;
		_bitField0 |= _HIGHEST_SEQUENCE_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public MessageMetadata clearHighestSequenceId() {
		_bitField0 &= ~_HIGHEST_SEQUENCE_ID_MASK;
		highestSequenceId = 0;
		return this;
	}

	private boolean nullValue = false;
	private static final int _NULL_VALUE_FIELD_NUMBER = 25;
	private static final int _NULL_VALUE_TAG = (_NULL_VALUE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _NULL_VALUE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_NULL_VALUE_TAG);
	private static final int _NULL_VALUE_MASK = 1 << (22 % 32);
	public boolean hasNullValue() {
		return (_bitField0 & _NULL_VALUE_MASK) != 0;
	}
	public boolean isNullValue() {
		return nullValue;
	}
	public MessageMetadata setNullValue(boolean nullValue) {
		this.nullValue = nullValue;
		_bitField0 |= _NULL_VALUE_MASK;
		_cachedSize = -1;
		return this;
	}
	public MessageMetadata clearNullValue() {
		_bitField0 &= ~_NULL_VALUE_MASK;
		nullValue = false;
		return this;
	}

	private String uuid;
	private int _uuidBufferIdx = -1;
	private int _uuidBufferLen = -1;
	private static final int _UUID_FIELD_NUMBER = 26;
	private static final int _UUID_TAG = (_UUID_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _UUID_TAG_SIZE = LightProtoCodec.computeVarIntSize(_UUID_TAG);
	private static final int _UUID_MASK = 1 << (23 % 32);
	public boolean hasUuid() {
		return (_bitField0 & _UUID_MASK) != 0;
	}
	public String getUuid() {
		if (!hasUuid()) {
			throw new IllegalStateException("Field 'uuid' is not set");
		}
		if (uuid == null) {
			uuid = LightProtoCodec.readString(_parsedBuffer, _uuidBufferIdx, _uuidBufferLen);
		}
		return uuid;
	}
	public MessageMetadata setUuid(String uuid) {
		this.uuid = uuid;
		_bitField0 |= _UUID_MASK;
		_uuidBufferIdx = -1;
		_uuidBufferLen = LightProtoCodec.computeStringUTF8Size(uuid);
		_cachedSize = -1;
		return this;
	}
	public MessageMetadata clearUuid() {
		_bitField0 &= ~_UUID_MASK;
		uuid = null;
		_uuidBufferIdx = -1;
		_uuidBufferLen = -1;
		return this;
	}

	private int numChunksFromMsg;
	private static final int _NUM_CHUNKS_FROM_MSG_FIELD_NUMBER = 27;
	private static final int _NUM_CHUNKS_FROM_MSG_TAG = (_NUM_CHUNKS_FROM_MSG_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _NUM_CHUNKS_FROM_MSG_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_NUM_CHUNKS_FROM_MSG_TAG);
	private static final int _NUM_CHUNKS_FROM_MSG_MASK = 1 << (24 % 32);
	public boolean hasNumChunksFromMsg() {
		return (_bitField0 & _NUM_CHUNKS_FROM_MSG_MASK) != 0;
	}
	public int getNumChunksFromMsg() {
		if (!hasNumChunksFromMsg()) {
			throw new IllegalStateException("Field 'num_chunks_from_msg' is not set");
		}
		return numChunksFromMsg;
	}
	public MessageMetadata setNumChunksFromMsg(int numChunksFromMsg) {
		this.numChunksFromMsg = numChunksFromMsg;
		_bitField0 |= _NUM_CHUNKS_FROM_MSG_MASK;
		_cachedSize = -1;
		return this;
	}
	public MessageMetadata clearNumChunksFromMsg() {
		_bitField0 &= ~_NUM_CHUNKS_FROM_MSG_MASK;
		return this;
	}

	private int totalChunkMsgSize;
	private static final int _TOTAL_CHUNK_MSG_SIZE_FIELD_NUMBER = 28;
	private static final int _TOTAL_CHUNK_MSG_SIZE_TAG = (_TOTAL_CHUNK_MSG_SIZE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _TOTAL_CHUNK_MSG_SIZE_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_TOTAL_CHUNK_MSG_SIZE_TAG);
	private static final int _TOTAL_CHUNK_MSG_SIZE_MASK = 1 << (25 % 32);
	public boolean hasTotalChunkMsgSize() {
		return (_bitField0 & _TOTAL_CHUNK_MSG_SIZE_MASK) != 0;
	}
	public int getTotalChunkMsgSize() {
		if (!hasTotalChunkMsgSize()) {
			throw new IllegalStateException("Field 'total_chunk_msg_size' is not set");
		}
		return totalChunkMsgSize;
	}
	public MessageMetadata setTotalChunkMsgSize(int totalChunkMsgSize) {
		this.totalChunkMsgSize = totalChunkMsgSize;
		_bitField0 |= _TOTAL_CHUNK_MSG_SIZE_MASK;
		_cachedSize = -1;
		return this;
	}
	public MessageMetadata clearTotalChunkMsgSize() {
		_bitField0 &= ~_TOTAL_CHUNK_MSG_SIZE_MASK;
		return this;
	}

	private int chunkId;
	private static final int _CHUNK_ID_FIELD_NUMBER = 29;
	private static final int _CHUNK_ID_TAG = (_CHUNK_ID_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _CHUNK_ID_TAG_SIZE = LightProtoCodec.computeVarIntSize(_CHUNK_ID_TAG);
	private static final int _CHUNK_ID_MASK = 1 << (26 % 32);
	public boolean hasChunkId() {
		return (_bitField0 & _CHUNK_ID_MASK) != 0;
	}
	public int getChunkId() {
		if (!hasChunkId()) {
			throw new IllegalStateException("Field 'chunk_id' is not set");
		}
		return chunkId;
	}
	public MessageMetadata setChunkId(int chunkId) {
		this.chunkId = chunkId;
		_bitField0 |= _CHUNK_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public MessageMetadata clearChunkId() {
		_bitField0 &= ~_CHUNK_ID_MASK;
		return this;
	}

	private boolean nullPartitionKey = false;
	private static final int _NULL_PARTITION_KEY_FIELD_NUMBER = 30;
	private static final int _NULL_PARTITION_KEY_TAG = (_NULL_PARTITION_KEY_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _NULL_PARTITION_KEY_TAG_SIZE = LightProtoCodec.computeVarIntSize(_NULL_PARTITION_KEY_TAG);
	private static final int _NULL_PARTITION_KEY_MASK = 1 << (27 % 32);
	public boolean hasNullPartitionKey() {
		return (_bitField0 & _NULL_PARTITION_KEY_MASK) != 0;
	}
	public boolean isNullPartitionKey() {
		return nullPartitionKey;
	}
	public MessageMetadata setNullPartitionKey(boolean nullPartitionKey) {
		this.nullPartitionKey = nullPartitionKey;
		_bitField0 |= _NULL_PARTITION_KEY_MASK;
		_cachedSize = -1;
		return this;
	}
	public MessageMetadata clearNullPartitionKey() {
		_bitField0 &= ~_NULL_PARTITION_KEY_MASK;
		nullPartitionKey = false;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _PRODUCER_NAME_MASK | _SEQUENCE_ID_MASK | _PUBLISH_TIME_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _PRODUCER_NAME_TAG);
		LightProtoCodec.writeVarInt(_b, _producerNameBufferLen);
		if (_producerNameBufferIdx == -1) {
			LightProtoCodec.writeString(_b, producerName, _producerNameBufferLen);
		} else {
			_parsedBuffer.getBytes(_producerNameBufferIdx, _b, _producerNameBufferLen);
		}
		LightProtoCodec.writeVarInt(_b, _SEQUENCE_ID_TAG);
		LightProtoCodec.writeVarInt64(_b, sequenceId);
		LightProtoCodec.writeVarInt(_b, _PUBLISH_TIME_TAG);
		LightProtoCodec.writeVarInt64(_b, publishTime);
		for (int i = 0; i < _propertiesCount; i++) {
			KeyValue _item = properties.get(i);
			LightProtoCodec.writeVarInt(_b, _PROPERTIES_TAG);
			LightProtoCodec.writeVarInt(_b, _item.getSerializedSize());
			_item.writeTo(_b);
		}
		if (hasReplicatedFrom()) {
			LightProtoCodec.writeVarInt(_b, _REPLICATED_FROM_TAG);
			LightProtoCodec.writeVarInt(_b, _replicatedFromBufferLen);
			if (_replicatedFromBufferIdx == -1) {
				LightProtoCodec.writeString(_b, replicatedFrom, _replicatedFromBufferLen);
			} else {
				_parsedBuffer.getBytes(_replicatedFromBufferIdx, _b, _replicatedFromBufferLen);
			}
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
		for (int i = 0; i < _replicateTosCount; i++) {
			LightProtoCodec.StringHolder _sh = replicateTos.get(i);
			LightProtoCodec.writeVarInt(_b, _REPLICATE_TO_TAG);
			LightProtoCodec.writeVarInt(_b, _sh.len);
			if (_sh.idx == -1) {
				LightProtoCodec.writeString(_b, _sh.s, _sh.len);
			} else {
				_parsedBuffer.getBytes(_sh.idx, _b, _sh.len);
			}
		}
		if (hasCompression()) {
			LightProtoCodec.writeVarInt(_b, _COMPRESSION_TAG);
			LightProtoCodec.writeVarInt(_b, compression.getValue());
		}
		if (hasUncompressedSize()) {
			LightProtoCodec.writeVarInt(_b, _UNCOMPRESSED_SIZE_TAG);
			LightProtoCodec.writeVarInt(_b, uncompressedSize);
		}
		if (hasNumMessagesInBatch()) {
			LightProtoCodec.writeVarInt(_b, _NUM_MESSAGES_IN_BATCH_TAG);
			LightProtoCodec.writeVarInt(_b, numMessagesInBatch);
		}
		if (hasEventTime()) {
			LightProtoCodec.writeVarInt(_b, _EVENT_TIME_TAG);
			LightProtoCodec.writeVarInt64(_b, eventTime);
		}
		for (int i = 0; i < _encryptionKeysCount; i++) {
			EncryptionKeys _item = encryptionKeys.get(i);
			LightProtoCodec.writeVarInt(_b, _ENCRYPTION_KEYS_TAG);
			LightProtoCodec.writeVarInt(_b, _item.getSerializedSize());
			_item.writeTo(_b);
		}
		if (hasEncryptionAlgo()) {
			LightProtoCodec.writeVarInt(_b, _ENCRYPTION_ALGO_TAG);
			LightProtoCodec.writeVarInt(_b, _encryptionAlgoBufferLen);
			if (_encryptionAlgoBufferIdx == -1) {
				LightProtoCodec.writeString(_b, encryptionAlgo, _encryptionAlgoBufferLen);
			} else {
				_parsedBuffer.getBytes(_encryptionAlgoBufferIdx, _b, _encryptionAlgoBufferLen);
			}
		}
		if (hasEncryptionParam()) {
			LightProtoCodec.writeVarInt(_b, _ENCRYPTION_PARAM_TAG);
			LightProtoCodec.writeVarInt(_b, _encryptionParamLen);
			if (_encryptionParamIdx == -1) {
				_b.writeBytes(encryptionParam);
			} else {
				_parsedBuffer.getBytes(_encryptionParamIdx, _b, _encryptionParamLen);
			}
		}
		if (hasSchemaVersion()) {
			LightProtoCodec.writeVarInt(_b, _SCHEMA_VERSION_TAG);
			LightProtoCodec.writeVarInt(_b, _schemaVersionLen);
			if (_schemaVersionIdx == -1) {
				_b.writeBytes(schemaVersion);
			} else {
				_parsedBuffer.getBytes(_schemaVersionIdx, _b, _schemaVersionLen);
			}
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
		if (hasDeliverAtTime()) {
			LightProtoCodec.writeVarInt(_b, _DELIVER_AT_TIME_TAG);
			LightProtoCodec.writeVarInt64(_b, deliverAtTime);
		}
		if (hasMarkerType()) {
			LightProtoCodec.writeVarInt(_b, _MARKER_TYPE_TAG);
			LightProtoCodec.writeVarInt(_b, markerType);
		}
		if (hasTxnidLeastBits()) {
			LightProtoCodec.writeVarInt(_b, _TXNID_LEAST_BITS_TAG);
			LightProtoCodec.writeVarInt64(_b, txnidLeastBits);
		}
		if (hasTxnidMostBits()) {
			LightProtoCodec.writeVarInt(_b, _TXNID_MOST_BITS_TAG);
			LightProtoCodec.writeVarInt64(_b, txnidMostBits);
		}
		if (hasHighestSequenceId()) {
			LightProtoCodec.writeVarInt(_b, _HIGHEST_SEQUENCE_ID_TAG);
			LightProtoCodec.writeVarInt64(_b, highestSequenceId);
		}
		if (hasNullValue()) {
			LightProtoCodec.writeVarInt(_b, _NULL_VALUE_TAG);
			_b.writeBoolean(nullValue);
		}
		if (hasUuid()) {
			LightProtoCodec.writeVarInt(_b, _UUID_TAG);
			LightProtoCodec.writeVarInt(_b, _uuidBufferLen);
			if (_uuidBufferIdx == -1) {
				LightProtoCodec.writeString(_b, uuid, _uuidBufferLen);
			} else {
				_parsedBuffer.getBytes(_uuidBufferIdx, _b, _uuidBufferLen);
			}
		}
		if (hasNumChunksFromMsg()) {
			LightProtoCodec.writeVarInt(_b, _NUM_CHUNKS_FROM_MSG_TAG);
			LightProtoCodec.writeVarInt(_b, numChunksFromMsg);
		}
		if (hasTotalChunkMsgSize()) {
			LightProtoCodec.writeVarInt(_b, _TOTAL_CHUNK_MSG_SIZE_TAG);
			LightProtoCodec.writeVarInt(_b, totalChunkMsgSize);
		}
		if (hasChunkId()) {
			LightProtoCodec.writeVarInt(_b, _CHUNK_ID_TAG);
			LightProtoCodec.writeVarInt(_b, chunkId);
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
		_size += _PRODUCER_NAME_TAG_SIZE;
		_size += LightProtoCodec.computeVarIntSize(_producerNameBufferLen);
		_size += _producerNameBufferLen;
		_size += _SEQUENCE_ID_TAG_SIZE;
		_size += LightProtoCodec.computeVarInt64Size(sequenceId);
		_size += _PUBLISH_TIME_TAG_SIZE;
		_size += LightProtoCodec.computeVarInt64Size(publishTime);
		for (int i = 0; i < _propertiesCount; i++) {
			KeyValue _item = properties.get(i);
			_size += _PROPERTIES_TAG_SIZE;
			int MsgsizeProperties = _item.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeProperties) + MsgsizeProperties;
		}
		if (hasReplicatedFrom()) {
			_size += _REPLICATED_FROM_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_replicatedFromBufferLen);
			_size += _replicatedFromBufferLen;
		}
		if (hasPartitionKey()) {
			_size += _PARTITION_KEY_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_partitionKeyBufferLen);
			_size += _partitionKeyBufferLen;
		}
		for (int i = 0; i < _replicateTosCount; i++) {
			LightProtoCodec.StringHolder _sh = replicateTos.get(i);
			_size += _REPLICATE_TO_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_sh.len) + _sh.len;
		}
		if (hasCompression()) {
			_size += _COMPRESSION_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(compression.getValue());
		}
		if (hasUncompressedSize()) {
			_size += _UNCOMPRESSED_SIZE_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(uncompressedSize);
		}
		if (hasNumMessagesInBatch()) {
			_size += _NUM_MESSAGES_IN_BATCH_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(numMessagesInBatch);
		}
		if (hasEventTime()) {
			_size += _EVENT_TIME_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(eventTime);
		}
		for (int i = 0; i < _encryptionKeysCount; i++) {
			EncryptionKeys _item = encryptionKeys.get(i);
			_size += _ENCRYPTION_KEYS_TAG_SIZE;
			int MsgsizeEncryptionKeys = _item.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeEncryptionKeys) + MsgsizeEncryptionKeys;
		}
		if (hasEncryptionAlgo()) {
			_size += _ENCRYPTION_ALGO_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_encryptionAlgoBufferLen);
			_size += _encryptionAlgoBufferLen;
		}
		if (hasEncryptionParam()) {
			_size += _ENCRYPTION_PARAM_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_encryptionParamLen) + _encryptionParamLen;
		}
		if (hasSchemaVersion()) {
			_size += _SCHEMA_VERSION_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_schemaVersionLen) + _schemaVersionLen;
		}
		if (hasPartitionKeyB64Encoded()) {
			_size += _PARTITION_KEY_B64_ENCODED_TAG_SIZE;
			_size += 1;
		}
		if (hasOrderingKey()) {
			_size += _ORDERING_KEY_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_orderingKeyLen) + _orderingKeyLen;
		}
		if (hasDeliverAtTime()) {
			_size += _DELIVER_AT_TIME_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(deliverAtTime);
		}
		if (hasMarkerType()) {
			_size += _MARKER_TYPE_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(markerType);
		}
		if (hasTxnidLeastBits()) {
			_size += _TXNID_LEAST_BITS_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(txnidLeastBits);
		}
		if (hasTxnidMostBits()) {
			_size += _TXNID_MOST_BITS_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(txnidMostBits);
		}
		if (hasHighestSequenceId()) {
			_size += _HIGHEST_SEQUENCE_ID_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(highestSequenceId);
		}
		if (hasNullValue()) {
			_size += _NULL_VALUE_TAG_SIZE;
			_size += 1;
		}
		if (hasUuid()) {
			_size += _UUID_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_uuidBufferLen);
			_size += _uuidBufferLen;
		}
		if (hasNumChunksFromMsg()) {
			_size += _NUM_CHUNKS_FROM_MSG_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(numChunksFromMsg);
		}
		if (hasTotalChunkMsgSize()) {
			_size += _TOTAL_CHUNK_MSG_SIZE_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(totalChunkMsgSize);
		}
		if (hasChunkId()) {
			_size += _CHUNK_ID_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(chunkId);
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
				case _PRODUCER_NAME_TAG :
					_bitField0 |= _PRODUCER_NAME_MASK;
					_producerNameBufferLen = LightProtoCodec.readVarInt(_buffer);
					_producerNameBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_producerNameBufferLen);
					break;
				case _SEQUENCE_ID_TAG :
					_bitField0 |= _SEQUENCE_ID_MASK;
					sequenceId = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _PUBLISH_TIME_TAG :
					_bitField0 |= _PUBLISH_TIME_MASK;
					publishTime = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _PROPERTIES_TAG :
					int _propertiesSize = LightProtoCodec.readVarInt(_buffer);
					addProperty().parseFrom(_buffer, _propertiesSize);
					break;
				case _REPLICATED_FROM_TAG :
					_bitField0 |= _REPLICATED_FROM_MASK;
					_replicatedFromBufferLen = LightProtoCodec.readVarInt(_buffer);
					_replicatedFromBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_replicatedFromBufferLen);
					break;
				case _PARTITION_KEY_TAG :
					_bitField0 |= _PARTITION_KEY_MASK;
					_partitionKeyBufferLen = LightProtoCodec.readVarInt(_buffer);
					_partitionKeyBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_partitionKeyBufferLen);
					break;
				case _REPLICATE_TO_TAG :
					LightProtoCodec.StringHolder _replicateToSh = _newReplicateToStringHolder();
					_replicateToSh.len = LightProtoCodec.readVarInt(_buffer);
					_replicateToSh.idx = _buffer.readerIndex();
					_buffer.skipBytes(_replicateToSh.len);
					break;
				case _COMPRESSION_TAG :
					CompressionType _compression = CompressionType.valueOf(LightProtoCodec.readVarInt(_buffer));
					if (_compression != null) {
						_bitField0 |= _COMPRESSION_MASK;
						compression = _compression;
					}
					break;
				case _UNCOMPRESSED_SIZE_TAG :
					_bitField0 |= _UNCOMPRESSED_SIZE_MASK;
					uncompressedSize = LightProtoCodec.readVarInt(_buffer);
					break;
				case _NUM_MESSAGES_IN_BATCH_TAG :
					_bitField0 |= _NUM_MESSAGES_IN_BATCH_MASK;
					numMessagesInBatch = LightProtoCodec.readVarInt(_buffer);
					break;
				case _EVENT_TIME_TAG :
					_bitField0 |= _EVENT_TIME_MASK;
					eventTime = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _ENCRYPTION_KEYS_TAG :
					int _encryptionKeysSize = LightProtoCodec.readVarInt(_buffer);
					addEncryptionKey().parseFrom(_buffer, _encryptionKeysSize);
					break;
				case _ENCRYPTION_ALGO_TAG :
					_bitField0 |= _ENCRYPTION_ALGO_MASK;
					_encryptionAlgoBufferLen = LightProtoCodec.readVarInt(_buffer);
					_encryptionAlgoBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_encryptionAlgoBufferLen);
					break;
				case _ENCRYPTION_PARAM_TAG :
					_bitField0 |= _ENCRYPTION_PARAM_MASK;
					_encryptionParamLen = LightProtoCodec.readVarInt(_buffer);
					_encryptionParamIdx = _buffer.readerIndex();
					_buffer.skipBytes(_encryptionParamLen);
					break;
				case _SCHEMA_VERSION_TAG :
					_bitField0 |= _SCHEMA_VERSION_MASK;
					_schemaVersionLen = LightProtoCodec.readVarInt(_buffer);
					_schemaVersionIdx = _buffer.readerIndex();
					_buffer.skipBytes(_schemaVersionLen);
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
				case _DELIVER_AT_TIME_TAG :
					_bitField0 |= _DELIVER_AT_TIME_MASK;
					deliverAtTime = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _MARKER_TYPE_TAG :
					_bitField0 |= _MARKER_TYPE_MASK;
					markerType = LightProtoCodec.readVarInt(_buffer);
					break;
				case _TXNID_LEAST_BITS_TAG :
					_bitField0 |= _TXNID_LEAST_BITS_MASK;
					txnidLeastBits = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _TXNID_MOST_BITS_TAG :
					_bitField0 |= _TXNID_MOST_BITS_MASK;
					txnidMostBits = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _HIGHEST_SEQUENCE_ID_TAG :
					_bitField0 |= _HIGHEST_SEQUENCE_ID_MASK;
					highestSequenceId = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _NULL_VALUE_TAG :
					_bitField0 |= _NULL_VALUE_MASK;
					nullValue = LightProtoCodec.readVarInt(_buffer) == 1;
					break;
				case _UUID_TAG :
					_bitField0 |= _UUID_MASK;
					_uuidBufferLen = LightProtoCodec.readVarInt(_buffer);
					_uuidBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_uuidBufferLen);
					break;
				case _NUM_CHUNKS_FROM_MSG_TAG :
					_bitField0 |= _NUM_CHUNKS_FROM_MSG_MASK;
					numChunksFromMsg = LightProtoCodec.readVarInt(_buffer);
					break;
				case _TOTAL_CHUNK_MSG_SIZE_TAG :
					_bitField0 |= _TOTAL_CHUNK_MSG_SIZE_MASK;
					totalChunkMsgSize = LightProtoCodec.readVarInt(_buffer);
					break;
				case _CHUNK_ID_TAG :
					_bitField0 |= _CHUNK_ID_MASK;
					chunkId = LightProtoCodec.readVarInt(_buffer);
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
	public MessageMetadata clear() {
		producerName = null;
		_producerNameBufferIdx = -1;
		_producerNameBufferLen = -1;
		for (int i = 0; i < _propertiesCount; i++) {
			properties.get(i).clear();
		}
		_propertiesCount = 0;
		replicatedFrom = null;
		_replicatedFromBufferIdx = -1;
		_replicatedFromBufferLen = -1;
		partitionKey = null;
		_partitionKeyBufferIdx = -1;
		_partitionKeyBufferLen = -1;
		for (int i = 0; i < _replicateTosCount; i++) {
			LightProtoCodec.StringHolder _sh = replicateTos.get(i);
			_sh.s = null;
			_sh.idx = -1;
			_sh.len = -1;
		}
		_replicateTosCount = 0;
		compression = CompressionType.NONE;
		uncompressedSize = 0;
		numMessagesInBatch = 1;
		eventTime = 0;
		for (int i = 0; i < _encryptionKeysCount; i++) {
			encryptionKeys.get(i).clear();
		}
		_encryptionKeysCount = 0;
		encryptionAlgo = null;
		_encryptionAlgoBufferIdx = -1;
		_encryptionAlgoBufferLen = -1;
		encryptionParam = null;
		_encryptionParamIdx = -1;
		_encryptionParamLen = -1;
		schemaVersion = null;
		_schemaVersionIdx = -1;
		_schemaVersionLen = -1;
		partitionKeyB64Encoded = false;
		orderingKey = null;
		_orderingKeyIdx = -1;
		_orderingKeyLen = -1;
		highestSequenceId = 0;
		nullValue = false;
		uuid = null;
		_uuidBufferIdx = -1;
		_uuidBufferLen = -1;
		nullPartitionKey = false;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public MessageMetadata copyFrom(MessageMetadata _other) {
		_cachedSize = -1;
		if (_other.hasProducerName()) {
			setProducerName(_other.getProducerName());
		}
		if (_other.hasSequenceId()) {
			setSequenceId(_other.sequenceId);
		}
		if (_other.hasPublishTime()) {
			setPublishTime(_other.publishTime);
		}
		for (int i = 0; i < _other.getPropertiesCount(); i++) {
			addProperty().copyFrom(_other.getPropertyAt(i));
		}
		if (_other.hasReplicatedFrom()) {
			setReplicatedFrom(_other.getReplicatedFrom());
		}
		if (_other.hasPartitionKey()) {
			setPartitionKey(_other.getPartitionKey());
		}
		for (int i = 0; i < _other.getReplicateTosCount(); i++) {
			addReplicateTo(_other.getReplicateToAt(i));
		}
		if (_other.hasCompression()) {
			setCompression(_other.compression);
		}
		if (_other.hasUncompressedSize()) {
			setUncompressedSize(_other.uncompressedSize);
		}
		if (_other.hasNumMessagesInBatch()) {
			setNumMessagesInBatch(_other.numMessagesInBatch);
		}
		if (_other.hasEventTime()) {
			setEventTime(_other.eventTime);
		}
		for (int i = 0; i < _other.getEncryptionKeysCount(); i++) {
			addEncryptionKey().copyFrom(_other.getEncryptionKeyAt(i));
		}
		if (_other.hasEncryptionAlgo()) {
			setEncryptionAlgo(_other.getEncryptionAlgo());
		}
		if (_other.hasEncryptionParam()) {
			setEncryptionParam(_other.getEncryptionParam());
		}
		if (_other.hasSchemaVersion()) {
			setSchemaVersion(_other.getSchemaVersion());
		}
		if (_other.hasPartitionKeyB64Encoded()) {
			setPartitionKeyB64Encoded(_other.partitionKeyB64Encoded);
		}
		if (_other.hasOrderingKey()) {
			setOrderingKey(_other.getOrderingKey());
		}
		if (_other.hasDeliverAtTime()) {
			setDeliverAtTime(_other.deliverAtTime);
		}
		if (_other.hasMarkerType()) {
			setMarkerType(_other.markerType);
		}
		if (_other.hasTxnidLeastBits()) {
			setTxnidLeastBits(_other.txnidLeastBits);
		}
		if (_other.hasTxnidMostBits()) {
			setTxnidMostBits(_other.txnidMostBits);
		}
		if (_other.hasHighestSequenceId()) {
			setHighestSequenceId(_other.highestSequenceId);
		}
		if (_other.hasNullValue()) {
			setNullValue(_other.nullValue);
		}
		if (_other.hasUuid()) {
			setUuid(_other.getUuid());
		}
		if (_other.hasNumChunksFromMsg()) {
			setNumChunksFromMsg(_other.numChunksFromMsg);
		}
		if (_other.hasTotalChunkMsgSize()) {
			setTotalChunkMsgSize(_other.totalChunkMsgSize);
		}
		if (_other.hasChunkId()) {
			setChunkId(_other.chunkId);
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
