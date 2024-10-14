package org.apache.pulsar.transaction.coordinator.proto;
public final class TransactionMetadataEntry {
	public enum TransactionMetadataOp {
		NEW(0), ADD_PARTITION(1), ADD_SUBSCRIPTION(2), UPDATE(3),;
		private final int value;
		private TransactionMetadataOp(int value) {
			this.value = value;
		}
		public int getValue() {
			return value;
		}
		public static TransactionMetadataOp valueOf(int n) {
			switch (n) {
				case 0 :
					return NEW;
				case 1 :
					return ADD_PARTITION;
				case 2 :
					return ADD_SUBSCRIPTION;
				case 3 :
					return UPDATE;
				default :
					return null;

			}
		}
		public static final int NEW_VALUE = 0;
		public static final int ADD_PARTITION_VALUE = 1;
		public static final int ADD_SUBSCRIPTION_VALUE = 2;
		public static final int UPDATE_VALUE = 3;
	}

	private TransactionMetadataOp metadataOp;
	private static final int _METADATA_OP_FIELD_NUMBER = 1;
	private static final int _METADATA_OP_TAG = (_METADATA_OP_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _METADATA_OP_TAG_SIZE = LightProtoCodec.computeVarIntSize(_METADATA_OP_TAG);
	private static final int _METADATA_OP_MASK = 1 << (0 % 32);
	public boolean hasMetadataOp() {
		return (_bitField0 & _METADATA_OP_MASK) != 0;
	}
	public TransactionMetadataOp getMetadataOp() {
		if (!hasMetadataOp()) {
			throw new IllegalStateException("Field 'metadata_op' is not set");
		}
		return metadataOp;
	}
	public TransactionMetadataEntry setMetadataOp(TransactionMetadataOp metadataOp) {
		this.metadataOp = metadataOp;
		_bitField0 |= _METADATA_OP_MASK;
		_cachedSize = -1;
		return this;
	}
	public TransactionMetadataEntry clearMetadataOp() {
		_bitField0 &= ~_METADATA_OP_MASK;
		return this;
	}

	private long txnidLeastBits = 0;
	private static final int _TXNID_LEAST_BITS_FIELD_NUMBER = 2;
	private static final int _TXNID_LEAST_BITS_TAG = (_TXNID_LEAST_BITS_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _TXNID_LEAST_BITS_TAG_SIZE = LightProtoCodec.computeVarIntSize(_TXNID_LEAST_BITS_TAG);
	private static final int _TXNID_LEAST_BITS_MASK = 1 << (1 % 32);
	public boolean hasTxnidLeastBits() {
		return (_bitField0 & _TXNID_LEAST_BITS_MASK) != 0;
	}
	public long getTxnidLeastBits() {
		return txnidLeastBits;
	}
	public TransactionMetadataEntry setTxnidLeastBits(long txnidLeastBits) {
		this.txnidLeastBits = txnidLeastBits;
		_bitField0 |= _TXNID_LEAST_BITS_MASK;
		_cachedSize = -1;
		return this;
	}
	public TransactionMetadataEntry clearTxnidLeastBits() {
		_bitField0 &= ~_TXNID_LEAST_BITS_MASK;
		txnidLeastBits = 0;
		return this;
	}

	private long txnidMostBits = 0;
	private static final int _TXNID_MOST_BITS_FIELD_NUMBER = 3;
	private static final int _TXNID_MOST_BITS_TAG = (_TXNID_MOST_BITS_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _TXNID_MOST_BITS_TAG_SIZE = LightProtoCodec.computeVarIntSize(_TXNID_MOST_BITS_TAG);
	private static final int _TXNID_MOST_BITS_MASK = 1 << (2 % 32);
	public boolean hasTxnidMostBits() {
		return (_bitField0 & _TXNID_MOST_BITS_MASK) != 0;
	}
	public long getTxnidMostBits() {
		return txnidMostBits;
	}
	public TransactionMetadataEntry setTxnidMostBits(long txnidMostBits) {
		this.txnidMostBits = txnidMostBits;
		_bitField0 |= _TXNID_MOST_BITS_MASK;
		_cachedSize = -1;
		return this;
	}
	public TransactionMetadataEntry clearTxnidMostBits() {
		_bitField0 &= ~_TXNID_MOST_BITS_MASK;
		txnidMostBits = 0;
		return this;
	}

	private TxnStatus expectedStatus;
	private static final int _EXPECTED_STATUS_FIELD_NUMBER = 4;
	private static final int _EXPECTED_STATUS_TAG = (_EXPECTED_STATUS_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _EXPECTED_STATUS_TAG_SIZE = LightProtoCodec.computeVarIntSize(_EXPECTED_STATUS_TAG);
	private static final int _EXPECTED_STATUS_MASK = 1 << (3 % 32);
	public boolean hasExpectedStatus() {
		return (_bitField0 & _EXPECTED_STATUS_MASK) != 0;
	}
	public TxnStatus getExpectedStatus() {
		if (!hasExpectedStatus()) {
			throw new IllegalStateException("Field 'expected_status' is not set");
		}
		return expectedStatus;
	}
	public TransactionMetadataEntry setExpectedStatus(TxnStatus expectedStatus) {
		this.expectedStatus = expectedStatus;
		_bitField0 |= _EXPECTED_STATUS_MASK;
		_cachedSize = -1;
		return this;
	}
	public TransactionMetadataEntry clearExpectedStatus() {
		_bitField0 &= ~_EXPECTED_STATUS_MASK;
		return this;
	}

	private TxnStatus newStatus;
	private static final int _NEW_STATUS_FIELD_NUMBER = 5;
	private static final int _NEW_STATUS_TAG = (_NEW_STATUS_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _NEW_STATUS_TAG_SIZE = LightProtoCodec.computeVarIntSize(_NEW_STATUS_TAG);
	private static final int _NEW_STATUS_MASK = 1 << (4 % 32);
	public boolean hasNewStatus() {
		return (_bitField0 & _NEW_STATUS_MASK) != 0;
	}
	public TxnStatus getNewStatus() {
		if (!hasNewStatus()) {
			throw new IllegalStateException("Field 'new_status' is not set");
		}
		return newStatus;
	}
	public TransactionMetadataEntry setNewStatus(TxnStatus newStatus) {
		this.newStatus = newStatus;
		_bitField0 |= _NEW_STATUS_MASK;
		_cachedSize = -1;
		return this;
	}
	public TransactionMetadataEntry clearNewStatus() {
		_bitField0 &= ~_NEW_STATUS_MASK;
		return this;
	}

	private java.util.List<LightProtoCodec.StringHolder> partitions = null;
	private int _partitionsCount = 0;
	private static final int _PARTITIONS_FIELD_NUMBER = 6;
	private static final int _PARTITIONS_TAG = (_PARTITIONS_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _PARTITIONS_TAG_SIZE = LightProtoCodec.computeVarIntSize(_PARTITIONS_TAG);
	public int getPartitionsCount() {
		return _partitionsCount;
	}
	public String getPartitionAt(int idx) {
		if (idx < 0 || idx >= _partitionsCount) {
			throw new IndexOutOfBoundsException(
					"Index " + idx + " is out of the list size (" + _partitionsCount + ") for field 'partitions'");
		}
		LightProtoCodec.StringHolder _sh = partitions.get(idx);
		if (_sh.s == null) {
			_sh.s = LightProtoCodec.readString(_parsedBuffer, _sh.idx, _sh.len);
		}
		return _sh.s;
	}
	public java.util.List<String> getPartitionsList() {
		if (_partitionsCount == 0) {
			return java.util.Collections.emptyList();
		} else {
			java.util.List<String> _l = new java.util.ArrayList<>();
			for (int i = 0; i < _partitionsCount; i++) {
				_l.add(getPartitionAt(i));
			}
			return _l;
		}
	}
	public void addPartition(String partition) {
		if (partitions == null) {
			partitions = new java.util.ArrayList<LightProtoCodec.StringHolder>();
		}
		LightProtoCodec.StringHolder _sh = _newPartitionStringHolder();
		_cachedSize = -1;
		_sh.s = partition;
		_sh.idx = -1;
		_sh.len = LightProtoCodec.computeStringUTF8Size(_sh.s);
	}
	public TransactionMetadataEntry addAllPartitions(Iterable<String> partitions) {
		for (String _s : partitions) {
			addPartition(_s);
		}
		return this;
	}
	private LightProtoCodec.StringHolder _newPartitionStringHolder() {
		if (partitions == null) {
			partitions = new java.util.ArrayList<LightProtoCodec.StringHolder>();
		}
		LightProtoCodec.StringHolder _sh;
		if (partitions.size() == _partitionsCount) {
			_sh = new LightProtoCodec.StringHolder();
			partitions.add(_sh);
		} else {
			_sh = partitions.get(_partitionsCount);
		}
		_partitionsCount++;
		return _sh;
	}
	public TransactionMetadataEntry clearPartitions() {
		for (int i = 0; i < _partitionsCount; i++) {
			LightProtoCodec.StringHolder _sh = partitions.get(i);
			_sh.s = null;
			_sh.idx = -1;
			_sh.len = -1;
		}
		_partitionsCount = 0;
		return this;
	}

	private java.util.List<org.apache.pulsar.common.api.proto.Subscription> subscriptions = null;
	private int _subscriptionsCount = 0;
	private static final int _SUBSCRIPTIONS_FIELD_NUMBER = 7;
	private static final int _SUBSCRIPTIONS_TAG = (_SUBSCRIPTIONS_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _SUBSCRIPTIONS_TAG_SIZE = LightProtoCodec.computeVarIntSize(_SUBSCRIPTIONS_TAG);
	public int getSubscriptionsCount() {
		return _subscriptionsCount;
	}
	public org.apache.pulsar.common.api.proto.Subscription getSubscriptionAt(int idx) {
		if (idx < 0 || idx >= _subscriptionsCount) {
			throw new IndexOutOfBoundsException("Index " + idx + " is out of the list size (" + _subscriptionsCount
					+ ") for field 'subscriptions'");
		}
		return subscriptions.get(idx);
	}
	public java.util.List<org.apache.pulsar.common.api.proto.Subscription> getSubscriptionsList() {
		if (_subscriptionsCount == 0) {
			return java.util.Collections.emptyList();
		} else {
			return subscriptions.subList(0, _subscriptionsCount);
		}
	}
	public org.apache.pulsar.common.api.proto.Subscription addSubscription() {
		if (subscriptions == null) {
			subscriptions = new java.util.ArrayList<org.apache.pulsar.common.api.proto.Subscription>();
		}
		if (subscriptions.size() == _subscriptionsCount) {
			subscriptions.add(new org.apache.pulsar.common.api.proto.Subscription());
		}
		_cachedSize = -1;
		return subscriptions.get(_subscriptionsCount++);
	}
	public TransactionMetadataEntry addAllSubscriptions(
			Iterable<org.apache.pulsar.common.api.proto.Subscription> subscriptions) {
		for (org.apache.pulsar.common.api.proto.Subscription _o : subscriptions) {
			addSubscription().copyFrom(_o);
		}
		return this;
	}
	public TransactionMetadataEntry clearSubscriptions() {
		for (int i = 0; i < _subscriptionsCount; i++) {
			subscriptions.get(i).clear();
		}
		_subscriptionsCount = 0;
		return this;
	}

	private long timeoutMs;
	private static final int _TIMEOUT_MS_FIELD_NUMBER = 8;
	private static final int _TIMEOUT_MS_TAG = (_TIMEOUT_MS_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _TIMEOUT_MS_TAG_SIZE = LightProtoCodec.computeVarIntSize(_TIMEOUT_MS_TAG);
	private static final int _TIMEOUT_MS_MASK = 1 << (7 % 32);
	public boolean hasTimeoutMs() {
		return (_bitField0 & _TIMEOUT_MS_MASK) != 0;
	}
	public long getTimeoutMs() {
		if (!hasTimeoutMs()) {
			throw new IllegalStateException("Field 'timeout_ms' is not set");
		}
		return timeoutMs;
	}
	public TransactionMetadataEntry setTimeoutMs(long timeoutMs) {
		this.timeoutMs = timeoutMs;
		_bitField0 |= _TIMEOUT_MS_MASK;
		_cachedSize = -1;
		return this;
	}
	public TransactionMetadataEntry clearTimeoutMs() {
		_bitField0 &= ~_TIMEOUT_MS_MASK;
		return this;
	}

	private long startTime;
	private static final int _START_TIME_FIELD_NUMBER = 9;
	private static final int _START_TIME_TAG = (_START_TIME_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _START_TIME_TAG_SIZE = LightProtoCodec.computeVarIntSize(_START_TIME_TAG);
	private static final int _START_TIME_MASK = 1 << (8 % 32);
	public boolean hasStartTime() {
		return (_bitField0 & _START_TIME_MASK) != 0;
	}
	public long getStartTime() {
		if (!hasStartTime()) {
			throw new IllegalStateException("Field 'start_time' is not set");
		}
		return startTime;
	}
	public TransactionMetadataEntry setStartTime(long startTime) {
		this.startTime = startTime;
		_bitField0 |= _START_TIME_MASK;
		_cachedSize = -1;
		return this;
	}
	public TransactionMetadataEntry clearStartTime() {
		_bitField0 &= ~_START_TIME_MASK;
		return this;
	}

	private long lastModificationTime;
	private static final int _LAST_MODIFICATION_TIME_FIELD_NUMBER = 10;
	private static final int _LAST_MODIFICATION_TIME_TAG = (_LAST_MODIFICATION_TIME_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _LAST_MODIFICATION_TIME_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_LAST_MODIFICATION_TIME_TAG);
	private static final int _LAST_MODIFICATION_TIME_MASK = 1 << (9 % 32);
	public boolean hasLastModificationTime() {
		return (_bitField0 & _LAST_MODIFICATION_TIME_MASK) != 0;
	}
	public long getLastModificationTime() {
		if (!hasLastModificationTime()) {
			throw new IllegalStateException("Field 'last_modification_time' is not set");
		}
		return lastModificationTime;
	}
	public TransactionMetadataEntry setLastModificationTime(long lastModificationTime) {
		this.lastModificationTime = lastModificationTime;
		_bitField0 |= _LAST_MODIFICATION_TIME_MASK;
		_cachedSize = -1;
		return this;
	}
	public TransactionMetadataEntry clearLastModificationTime() {
		_bitField0 &= ~_LAST_MODIFICATION_TIME_MASK;
		return this;
	}

	private long maxLocalTxnId;
	private static final int _MAX_LOCAL_TXN_ID_FIELD_NUMBER = 11;
	private static final int _MAX_LOCAL_TXN_ID_TAG = (_MAX_LOCAL_TXN_ID_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _MAX_LOCAL_TXN_ID_TAG_SIZE = LightProtoCodec.computeVarIntSize(_MAX_LOCAL_TXN_ID_TAG);
	private static final int _MAX_LOCAL_TXN_ID_MASK = 1 << (10 % 32);
	public boolean hasMaxLocalTxnId() {
		return (_bitField0 & _MAX_LOCAL_TXN_ID_MASK) != 0;
	}
	public long getMaxLocalTxnId() {
		if (!hasMaxLocalTxnId()) {
			throw new IllegalStateException("Field 'max_local_txn_id' is not set");
		}
		return maxLocalTxnId;
	}
	public TransactionMetadataEntry setMaxLocalTxnId(long maxLocalTxnId) {
		this.maxLocalTxnId = maxLocalTxnId;
		_bitField0 |= _MAX_LOCAL_TXN_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public TransactionMetadataEntry clearMaxLocalTxnId() {
		_bitField0 &= ~_MAX_LOCAL_TXN_ID_MASK;
		return this;
	}

	private String owner;
	private int _ownerBufferIdx = -1;
	private int _ownerBufferLen = -1;
	private static final int _OWNER_FIELD_NUMBER = 12;
	private static final int _OWNER_TAG = (_OWNER_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _OWNER_TAG_SIZE = LightProtoCodec.computeVarIntSize(_OWNER_TAG);
	private static final int _OWNER_MASK = 1 << (11 % 32);
	public boolean hasOwner() {
		return (_bitField0 & _OWNER_MASK) != 0;
	}
	public String getOwner() {
		if (!hasOwner()) {
			throw new IllegalStateException("Field 'owner' is not set");
		}
		if (owner == null) {
			owner = LightProtoCodec.readString(_parsedBuffer, _ownerBufferIdx, _ownerBufferLen);
		}
		return owner;
	}
	public TransactionMetadataEntry setOwner(String owner) {
		this.owner = owner;
		_bitField0 |= _OWNER_MASK;
		_ownerBufferIdx = -1;
		_ownerBufferLen = LightProtoCodec.computeStringUTF8Size(owner);
		_cachedSize = -1;
		return this;
	}
	public TransactionMetadataEntry clearOwner() {
		_bitField0 &= ~_OWNER_MASK;
		owner = null;
		_ownerBufferIdx = -1;
		_ownerBufferLen = -1;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		int _writeIdx = _b.writerIndex();
		if (hasMetadataOp()) {
			LightProtoCodec.writeVarInt(_b, _METADATA_OP_TAG);
			LightProtoCodec.writeVarInt(_b, metadataOp.getValue());
		}
		if (hasTxnidLeastBits()) {
			LightProtoCodec.writeVarInt(_b, _TXNID_LEAST_BITS_TAG);
			LightProtoCodec.writeVarInt64(_b, txnidLeastBits);
		}
		if (hasTxnidMostBits()) {
			LightProtoCodec.writeVarInt(_b, _TXNID_MOST_BITS_TAG);
			LightProtoCodec.writeVarInt64(_b, txnidMostBits);
		}
		if (hasExpectedStatus()) {
			LightProtoCodec.writeVarInt(_b, _EXPECTED_STATUS_TAG);
			LightProtoCodec.writeVarInt(_b, expectedStatus.getValue());
		}
		if (hasNewStatus()) {
			LightProtoCodec.writeVarInt(_b, _NEW_STATUS_TAG);
			LightProtoCodec.writeVarInt(_b, newStatus.getValue());
		}
		for (int i = 0; i < _partitionsCount; i++) {
			LightProtoCodec.StringHolder _sh = partitions.get(i);
			LightProtoCodec.writeVarInt(_b, _PARTITIONS_TAG);
			LightProtoCodec.writeVarInt(_b, _sh.len);
			if (_sh.idx == -1) {
				LightProtoCodec.writeString(_b, _sh.s, _sh.len);
			} else {
				_parsedBuffer.getBytes(_sh.idx, _b, _sh.len);
			}
		}
		for (int i = 0; i < _subscriptionsCount; i++) {
			org.apache.pulsar.common.api.proto.Subscription _item = subscriptions.get(i);
			LightProtoCodec.writeVarInt(_b, _SUBSCRIPTIONS_TAG);
			LightProtoCodec.writeVarInt(_b, _item.getSerializedSize());
			_item.writeTo(_b);
		}
		if (hasTimeoutMs()) {
			LightProtoCodec.writeVarInt(_b, _TIMEOUT_MS_TAG);
			LightProtoCodec.writeVarInt64(_b, timeoutMs);
		}
		if (hasStartTime()) {
			LightProtoCodec.writeVarInt(_b, _START_TIME_TAG);
			LightProtoCodec.writeVarInt64(_b, startTime);
		}
		if (hasLastModificationTime()) {
			LightProtoCodec.writeVarInt(_b, _LAST_MODIFICATION_TIME_TAG);
			LightProtoCodec.writeVarInt64(_b, lastModificationTime);
		}
		if (hasMaxLocalTxnId()) {
			LightProtoCodec.writeVarInt(_b, _MAX_LOCAL_TXN_ID_TAG);
			LightProtoCodec.writeVarInt64(_b, maxLocalTxnId);
		}
		if (hasOwner()) {
			LightProtoCodec.writeVarInt(_b, _OWNER_TAG);
			LightProtoCodec.writeVarInt(_b, _ownerBufferLen);
			if (_ownerBufferIdx == -1) {
				LightProtoCodec.writeString(_b, owner, _ownerBufferLen);
			} else {
				_parsedBuffer.getBytes(_ownerBufferIdx, _b, _ownerBufferLen);
			}
		}
		return (_b.writerIndex() - _writeIdx);
	}
	public int getSerializedSize() {
		if (_cachedSize > -1) {
			return _cachedSize;
		}

		int _size = 0;
		if (hasMetadataOp()) {
			_size += _METADATA_OP_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(metadataOp.getValue());
		}
		if (hasTxnidLeastBits()) {
			_size += _TXNID_LEAST_BITS_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(txnidLeastBits);
		}
		if (hasTxnidMostBits()) {
			_size += _TXNID_MOST_BITS_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(txnidMostBits);
		}
		if (hasExpectedStatus()) {
			_size += _EXPECTED_STATUS_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(expectedStatus.getValue());
		}
		if (hasNewStatus()) {
			_size += _NEW_STATUS_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(newStatus.getValue());
		}
		for (int i = 0; i < _partitionsCount; i++) {
			LightProtoCodec.StringHolder _sh = partitions.get(i);
			_size += _PARTITIONS_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_sh.len) + _sh.len;
		}
		for (int i = 0; i < _subscriptionsCount; i++) {
			org.apache.pulsar.common.api.proto.Subscription _item = subscriptions.get(i);
			_size += _SUBSCRIPTIONS_TAG_SIZE;
			int MsgsizeSubscriptions = _item.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeSubscriptions) + MsgsizeSubscriptions;
		}
		if (hasTimeoutMs()) {
			_size += _TIMEOUT_MS_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(timeoutMs);
		}
		if (hasStartTime()) {
			_size += _START_TIME_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(startTime);
		}
		if (hasLastModificationTime()) {
			_size += _LAST_MODIFICATION_TIME_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(lastModificationTime);
		}
		if (hasMaxLocalTxnId()) {
			_size += _MAX_LOCAL_TXN_ID_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(maxLocalTxnId);
		}
		if (hasOwner()) {
			_size += _OWNER_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_ownerBufferLen);
			_size += _ownerBufferLen;
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
				case _METADATA_OP_TAG :
					TransactionMetadataOp _metadataOp = TransactionMetadataOp
							.valueOf(LightProtoCodec.readVarInt(_buffer));
					if (_metadataOp != null) {
						_bitField0 |= _METADATA_OP_MASK;
						metadataOp = _metadataOp;
					}
					break;
				case _TXNID_LEAST_BITS_TAG :
					_bitField0 |= _TXNID_LEAST_BITS_MASK;
					txnidLeastBits = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _TXNID_MOST_BITS_TAG :
					_bitField0 |= _TXNID_MOST_BITS_MASK;
					txnidMostBits = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _EXPECTED_STATUS_TAG :
					TxnStatus _expectedStatus = TxnStatus.valueOf(LightProtoCodec.readVarInt(_buffer));
					if (_expectedStatus != null) {
						_bitField0 |= _EXPECTED_STATUS_MASK;
						expectedStatus = _expectedStatus;
					}
					break;
				case _NEW_STATUS_TAG :
					TxnStatus _newStatus = TxnStatus.valueOf(LightProtoCodec.readVarInt(_buffer));
					if (_newStatus != null) {
						_bitField0 |= _NEW_STATUS_MASK;
						newStatus = _newStatus;
					}
					break;
				case _PARTITIONS_TAG :
					LightProtoCodec.StringHolder _partitionsSh = _newPartitionStringHolder();
					_partitionsSh.len = LightProtoCodec.readVarInt(_buffer);
					_partitionsSh.idx = _buffer.readerIndex();
					_buffer.skipBytes(_partitionsSh.len);
					break;
				case _SUBSCRIPTIONS_TAG :
					int _subscriptionsSize = LightProtoCodec.readVarInt(_buffer);
					addSubscription().parseFrom(_buffer, _subscriptionsSize);
					break;
				case _TIMEOUT_MS_TAG :
					_bitField0 |= _TIMEOUT_MS_MASK;
					timeoutMs = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _START_TIME_TAG :
					_bitField0 |= _START_TIME_MASK;
					startTime = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _LAST_MODIFICATION_TIME_TAG :
					_bitField0 |= _LAST_MODIFICATION_TIME_MASK;
					lastModificationTime = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _MAX_LOCAL_TXN_ID_TAG :
					_bitField0 |= _MAX_LOCAL_TXN_ID_MASK;
					maxLocalTxnId = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _OWNER_TAG :
					_bitField0 |= _OWNER_MASK;
					_ownerBufferLen = LightProtoCodec.readVarInt(_buffer);
					_ownerBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_ownerBufferLen);
					break;
				default :
					LightProtoCodec.skipUnknownField(_tag, _buffer);
			}
		}
		_parsedBuffer = _buffer;
	}
	public TransactionMetadataEntry clear() {
		txnidLeastBits = 0;
		txnidMostBits = 0;
		for (int i = 0; i < _partitionsCount; i++) {
			LightProtoCodec.StringHolder _sh = partitions.get(i);
			_sh.s = null;
			_sh.idx = -1;
			_sh.len = -1;
		}
		_partitionsCount = 0;
		for (int i = 0; i < _subscriptionsCount; i++) {
			subscriptions.get(i).clear();
		}
		_subscriptionsCount = 0;
		owner = null;
		_ownerBufferIdx = -1;
		_ownerBufferLen = -1;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public TransactionMetadataEntry copyFrom(TransactionMetadataEntry _other) {
		_cachedSize = -1;
		if (_other.hasMetadataOp()) {
			setMetadataOp(_other.metadataOp);
		}
		if (_other.hasTxnidLeastBits()) {
			setTxnidLeastBits(_other.txnidLeastBits);
		}
		if (_other.hasTxnidMostBits()) {
			setTxnidMostBits(_other.txnidMostBits);
		}
		if (_other.hasExpectedStatus()) {
			setExpectedStatus(_other.expectedStatus);
		}
		if (_other.hasNewStatus()) {
			setNewStatus(_other.newStatus);
		}
		for (int i = 0; i < _other.getPartitionsCount(); i++) {
			addPartition(_other.getPartitionAt(i));
		}
		for (int i = 0; i < _other.getSubscriptionsCount(); i++) {
			addSubscription().copyFrom(_other.getSubscriptionAt(i));
		}
		if (_other.hasTimeoutMs()) {
			setTimeoutMs(_other.timeoutMs);
		}
		if (_other.hasStartTime()) {
			setStartTime(_other.startTime);
		}
		if (_other.hasLastModificationTime()) {
			setLastModificationTime(_other.lastModificationTime);
		}
		if (_other.hasMaxLocalTxnId()) {
			setMaxLocalTxnId(_other.maxLocalTxnId);
		}
		if (_other.hasOwner()) {
			setOwner(_other.getOwner());
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
