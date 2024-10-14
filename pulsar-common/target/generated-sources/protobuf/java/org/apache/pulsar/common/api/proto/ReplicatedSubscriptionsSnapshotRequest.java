package org.apache.pulsar.common.api.proto;
public final class ReplicatedSubscriptionsSnapshotRequest {
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
	public ReplicatedSubscriptionsSnapshotRequest setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
		_bitField0 |= _SNAPSHOT_ID_MASK;
		_snapshotIdBufferIdx = -1;
		_snapshotIdBufferLen = LightProtoCodec.computeStringUTF8Size(snapshotId);
		_cachedSize = -1;
		return this;
	}
	public ReplicatedSubscriptionsSnapshotRequest clearSnapshotId() {
		_bitField0 &= ~_SNAPSHOT_ID_MASK;
		snapshotId = null;
		_snapshotIdBufferIdx = -1;
		_snapshotIdBufferLen = -1;
		return this;
	}

	private String sourceCluster;
	private int _sourceClusterBufferIdx = -1;
	private int _sourceClusterBufferLen = -1;
	private static final int _SOURCE_CLUSTER_FIELD_NUMBER = 2;
	private static final int _SOURCE_CLUSTER_TAG = (_SOURCE_CLUSTER_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _SOURCE_CLUSTER_TAG_SIZE = LightProtoCodec.computeVarIntSize(_SOURCE_CLUSTER_TAG);
	private static final int _SOURCE_CLUSTER_MASK = 1 << (1 % 32);
	public boolean hasSourceCluster() {
		return (_bitField0 & _SOURCE_CLUSTER_MASK) != 0;
	}
	public String getSourceCluster() {
		if (!hasSourceCluster()) {
			throw new IllegalStateException("Field 'source_cluster' is not set");
		}
		if (sourceCluster == null) {
			sourceCluster = LightProtoCodec.readString(_parsedBuffer, _sourceClusterBufferIdx, _sourceClusterBufferLen);
		}
		return sourceCluster;
	}
	public ReplicatedSubscriptionsSnapshotRequest setSourceCluster(String sourceCluster) {
		this.sourceCluster = sourceCluster;
		_bitField0 |= _SOURCE_CLUSTER_MASK;
		_sourceClusterBufferIdx = -1;
		_sourceClusterBufferLen = LightProtoCodec.computeStringUTF8Size(sourceCluster);
		_cachedSize = -1;
		return this;
	}
	public ReplicatedSubscriptionsSnapshotRequest clearSourceCluster() {
		_bitField0 &= ~_SOURCE_CLUSTER_MASK;
		sourceCluster = null;
		_sourceClusterBufferIdx = -1;
		_sourceClusterBufferLen = -1;
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
		if (hasSourceCluster()) {
			LightProtoCodec.writeVarInt(_b, _SOURCE_CLUSTER_TAG);
			LightProtoCodec.writeVarInt(_b, _sourceClusterBufferLen);
			if (_sourceClusterBufferIdx == -1) {
				LightProtoCodec.writeString(_b, sourceCluster, _sourceClusterBufferLen);
			} else {
				_parsedBuffer.getBytes(_sourceClusterBufferIdx, _b, _sourceClusterBufferLen);
			}
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
		if (hasSourceCluster()) {
			_size += _SOURCE_CLUSTER_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_sourceClusterBufferLen);
			_size += _sourceClusterBufferLen;
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
				case _SOURCE_CLUSTER_TAG :
					_bitField0 |= _SOURCE_CLUSTER_MASK;
					_sourceClusterBufferLen = LightProtoCodec.readVarInt(_buffer);
					_sourceClusterBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_sourceClusterBufferLen);
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
	public ReplicatedSubscriptionsSnapshotRequest clear() {
		snapshotId = null;
		_snapshotIdBufferIdx = -1;
		_snapshotIdBufferLen = -1;
		sourceCluster = null;
		_sourceClusterBufferIdx = -1;
		_sourceClusterBufferLen = -1;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public ReplicatedSubscriptionsSnapshotRequest copyFrom(ReplicatedSubscriptionsSnapshotRequest _other) {
		_cachedSize = -1;
		if (_other.hasSnapshotId()) {
			setSnapshotId(_other.getSnapshotId());
		}
		if (_other.hasSourceCluster()) {
			setSourceCluster(_other.getSourceCluster());
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
