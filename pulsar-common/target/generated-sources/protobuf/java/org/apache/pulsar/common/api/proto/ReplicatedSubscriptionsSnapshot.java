package org.apache.pulsar.common.api.proto;
public final class ReplicatedSubscriptionsSnapshot {
	private String snapshotId;
	private int _snapshotIdBufferIdx = -1;
	private int _snapshotIdBufferLen = -1;
	private static final int _SNAPSHOT_ID_FIELD_NUMBER = 1;
	private static final int _SNAPSHOT_ID_TAG = (_SNAPSHOT_ID_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _SNAPSHOT_ID_TAG_SIZE = LightProtoCodec.computeVarIntSize(_SNAPSHOT_ID_TAG);
	private static final int _SNAPSHOT_ID_MASK = 1 << (0 % 32);
	public boolean hasSnapshotId() {
		return (_bitField0 & _SNAPSHOT_ID_MASK) != 0;
	}
	public String getSnapshotId() {
		if (!hasSnapshotId()) {
			throw new IllegalStateException("Field 'snapshot_id' is not set");
		}
		if (snapshotId == null) {
			snapshotId = LightProtoCodec.readString(_parsedBuffer, _snapshotIdBufferIdx, _snapshotIdBufferLen);
		}
		return snapshotId;
	}
	public ReplicatedSubscriptionsSnapshot setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
		_bitField0 |= _SNAPSHOT_ID_MASK;
		_snapshotIdBufferIdx = -1;
		_snapshotIdBufferLen = LightProtoCodec.computeStringUTF8Size(snapshotId);
		_cachedSize = -1;
		return this;
	}
	public ReplicatedSubscriptionsSnapshot clearSnapshotId() {
		_bitField0 &= ~_SNAPSHOT_ID_MASK;
		snapshotId = null;
		_snapshotIdBufferIdx = -1;
		_snapshotIdBufferLen = -1;
		return this;
	}

	private MarkersMessageIdData localMessageId;
	private static final int _LOCAL_MESSAGE_ID_FIELD_NUMBER = 2;
	private static final int _LOCAL_MESSAGE_ID_TAG = (_LOCAL_MESSAGE_ID_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _LOCAL_MESSAGE_ID_TAG_SIZE = LightProtoCodec.computeVarIntSize(_LOCAL_MESSAGE_ID_TAG);
	private static final int _LOCAL_MESSAGE_ID_MASK = 1 << (1 % 32);
	public boolean hasLocalMessageId() {
		return (_bitField0 & _LOCAL_MESSAGE_ID_MASK) != 0;
	}
	public MarkersMessageIdData getLocalMessageId() {
		if (!hasLocalMessageId()) {
			throw new IllegalStateException("Field 'local_message_id' is not set");
		}
		return localMessageId;
	}
	public MarkersMessageIdData setLocalMessageId() {
		if (localMessageId == null) {
			localMessageId = new MarkersMessageIdData();
		}
		_bitField0 |= _LOCAL_MESSAGE_ID_MASK;
		_cachedSize = -1;
		return localMessageId;
	}
	public ReplicatedSubscriptionsSnapshot clearLocalMessageId() {
		_bitField0 &= ~_LOCAL_MESSAGE_ID_MASK;
		if (hasLocalMessageId()) {
			localMessageId.clear();
		}
		return this;
	}

	private java.util.List<ClusterMessageId> clusters = null;
	private int _clustersCount = 0;
	private static final int _CLUSTERS_FIELD_NUMBER = 3;
	private static final int _CLUSTERS_TAG = (_CLUSTERS_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _CLUSTERS_TAG_SIZE = LightProtoCodec.computeVarIntSize(_CLUSTERS_TAG);
	public int getClustersCount() {
		return _clustersCount;
	}
	public ClusterMessageId getClusterAt(int idx) {
		if (idx < 0 || idx >= _clustersCount) {
			throw new IndexOutOfBoundsException(
					"Index " + idx + " is out of the list size (" + _clustersCount + ") for field 'clusters'");
		}
		return clusters.get(idx);
	}
	public java.util.List<ClusterMessageId> getClustersList() {
		if (_clustersCount == 0) {
			return java.util.Collections.emptyList();
		} else {
			return clusters.subList(0, _clustersCount);
		}
	}
	public ClusterMessageId addCluster() {
		if (clusters == null) {
			clusters = new java.util.ArrayList<ClusterMessageId>();
		}
		if (clusters.size() == _clustersCount) {
			clusters.add(new ClusterMessageId());
		}
		_cachedSize = -1;
		return clusters.get(_clustersCount++);
	}
	public ReplicatedSubscriptionsSnapshot addAllClusters(Iterable<ClusterMessageId> clusters) {
		for (ClusterMessageId _o : clusters) {
			addCluster().copyFrom(_o);
		}
		return this;
	}
	public ReplicatedSubscriptionsSnapshot clearClusters() {
		for (int i = 0; i < _clustersCount; i++) {
			clusters.get(i).clear();
		}
		_clustersCount = 0;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _SNAPSHOT_ID_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _SNAPSHOT_ID_TAG);
		LightProtoCodec.writeVarInt(_b, _snapshotIdBufferLen);
		if (_snapshotIdBufferIdx == -1) {
			LightProtoCodec.writeString(_b, snapshotId, _snapshotIdBufferLen);
		} else {
			_parsedBuffer.getBytes(_snapshotIdBufferIdx, _b, _snapshotIdBufferLen);
		}
		if (hasLocalMessageId()) {
			LightProtoCodec.writeVarInt(_b, _LOCAL_MESSAGE_ID_TAG);
			LightProtoCodec.writeVarInt(_b, localMessageId.getSerializedSize());
			localMessageId.writeTo(_b);
		}
		for (int i = 0; i < _clustersCount; i++) {
			ClusterMessageId _item = clusters.get(i);
			LightProtoCodec.writeVarInt(_b, _CLUSTERS_TAG);
			LightProtoCodec.writeVarInt(_b, _item.getSerializedSize());
			_item.writeTo(_b);
		}
		return (_b.writerIndex() - _writeIdx);
	}
	public int getSerializedSize() {
		if (_cachedSize > -1) {
			return _cachedSize;
		}

		int _size = 0;
		_size += _SNAPSHOT_ID_TAG_SIZE;
		_size += LightProtoCodec.computeVarIntSize(_snapshotIdBufferLen);
		_size += _snapshotIdBufferLen;
		if (hasLocalMessageId()) {
			_size += LightProtoCodec.computeVarIntSize(_LOCAL_MESSAGE_ID_TAG);
			int MsgsizeLocalMessageId = localMessageId.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeLocalMessageId) + MsgsizeLocalMessageId;
		}
		for (int i = 0; i < _clustersCount; i++) {
			ClusterMessageId _item = clusters.get(i);
			_size += _CLUSTERS_TAG_SIZE;
			int MsgsizeClusters = _item.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeClusters) + MsgsizeClusters;
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
				case _SNAPSHOT_ID_TAG :
					_bitField0 |= _SNAPSHOT_ID_MASK;
					_snapshotIdBufferLen = LightProtoCodec.readVarInt(_buffer);
					_snapshotIdBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_snapshotIdBufferLen);
					break;
				case _LOCAL_MESSAGE_ID_TAG :
					_bitField0 |= _LOCAL_MESSAGE_ID_MASK;
					int localMessageIdSize = LightProtoCodec.readVarInt(_buffer);
					setLocalMessageId().parseFrom(_buffer, localMessageIdSize);
					break;
				case _CLUSTERS_TAG :
					int _clustersSize = LightProtoCodec.readVarInt(_buffer);
					addCluster().parseFrom(_buffer, _clustersSize);
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
	public ReplicatedSubscriptionsSnapshot clear() {
		snapshotId = null;
		_snapshotIdBufferIdx = -1;
		_snapshotIdBufferLen = -1;
		if (hasLocalMessageId()) {
			localMessageId.clear();
		}
		for (int i = 0; i < _clustersCount; i++) {
			clusters.get(i).clear();
		}
		_clustersCount = 0;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public ReplicatedSubscriptionsSnapshot copyFrom(ReplicatedSubscriptionsSnapshot _other) {
		_cachedSize = -1;
		if (_other.hasSnapshotId()) {
			setSnapshotId(_other.getSnapshotId());
		}
		if (_other.hasLocalMessageId()) {
			setLocalMessageId().copyFrom(_other.localMessageId);
		}
		for (int i = 0; i < _other.getClustersCount(); i++) {
			addCluster().copyFrom(_other.getClusterAt(i));
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
