package org.apache.pulsar.common.api.proto;
public final class ClusterMessageId {
	private String cluster;
	private int _clusterBufferIdx = -1;
	private int _clusterBufferLen = -1;
	private static final int _CLUSTER_FIELD_NUMBER = 1;
	private static final int _CLUSTER_TAG = (_CLUSTER_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _CLUSTER_TAG_SIZE = LightProtoCodec.computeVarIntSize(_CLUSTER_TAG);
	private static final int _CLUSTER_MASK = 1 << (0 % 32);
	public boolean hasCluster() {
		return (_bitField0 & _CLUSTER_MASK) != 0;
	}
	public String getCluster() {
		if (!hasCluster()) {
			throw new IllegalStateException("Field 'cluster' is not set");
		}
		if (cluster == null) {
			cluster = LightProtoCodec.readString(_parsedBuffer, _clusterBufferIdx, _clusterBufferLen);
		}
		return cluster;
	}
	public ClusterMessageId setCluster(String cluster) {
		this.cluster = cluster;
		_bitField0 |= _CLUSTER_MASK;
		_clusterBufferIdx = -1;
		_clusterBufferLen = LightProtoCodec.computeStringUTF8Size(cluster);
		_cachedSize = -1;
		return this;
	}
	public ClusterMessageId clearCluster() {
		_bitField0 &= ~_CLUSTER_MASK;
		cluster = null;
		_clusterBufferIdx = -1;
		_clusterBufferLen = -1;
		return this;
	}

	private MarkersMessageIdData messageId;
	private static final int _MESSAGE_ID_FIELD_NUMBER = 2;
	private static final int _MESSAGE_ID_TAG = (_MESSAGE_ID_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _MESSAGE_ID_TAG_SIZE = LightProtoCodec.computeVarIntSize(_MESSAGE_ID_TAG);
	private static final int _MESSAGE_ID_MASK = 1 << (1 % 32);
	public boolean hasMessageId() {
		return (_bitField0 & _MESSAGE_ID_MASK) != 0;
	}
	public MarkersMessageIdData getMessageId() {
		if (!hasMessageId()) {
			throw new IllegalStateException("Field 'message_id' is not set");
		}
		return messageId;
	}
	public MarkersMessageIdData setMessageId() {
		if (messageId == null) {
			messageId = new MarkersMessageIdData();
		}
		_bitField0 |= _MESSAGE_ID_MASK;
		_cachedSize = -1;
		return messageId;
	}
	public ClusterMessageId clearMessageId() {
		_bitField0 &= ~_MESSAGE_ID_MASK;
		if (hasMessageId()) {
			messageId.clear();
		}
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _CLUSTER_MASK | _MESSAGE_ID_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _CLUSTER_TAG);
		LightProtoCodec.writeVarInt(_b, _clusterBufferLen);
		if (_clusterBufferIdx == -1) {
			LightProtoCodec.writeString(_b, cluster, _clusterBufferLen);
		} else {
			_parsedBuffer.getBytes(_clusterBufferIdx, _b, _clusterBufferLen);
		}
		LightProtoCodec.writeVarInt(_b, _MESSAGE_ID_TAG);
		LightProtoCodec.writeVarInt(_b, messageId.getSerializedSize());
		messageId.writeTo(_b);
		return (_b.writerIndex() - _writeIdx);
	}
	public int getSerializedSize() {
		if (_cachedSize > -1) {
			return _cachedSize;
		}

		int _size = 0;
		_size += _CLUSTER_TAG_SIZE;
		_size += LightProtoCodec.computeVarIntSize(_clusterBufferLen);
		_size += _clusterBufferLen;
		_size += LightProtoCodec.computeVarIntSize(_MESSAGE_ID_TAG);
		int MsgsizeMessageId = messageId.getSerializedSize();
		_size += LightProtoCodec.computeVarIntSize(MsgsizeMessageId) + MsgsizeMessageId;
		_cachedSize = _size;
		return _size;
	}
	public void parseFrom(io.netty.buffer.ByteBuf _buffer, int _size) {
		clear();
		int _endIdx = _buffer.readerIndex() + _size;
		while (_buffer.readerIndex() < _endIdx) {
			int _tag = LightProtoCodec.readVarInt(_buffer);
			switch (_tag) {
				case _CLUSTER_TAG :
					_bitField0 |= _CLUSTER_MASK;
					_clusterBufferLen = LightProtoCodec.readVarInt(_buffer);
					_clusterBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_clusterBufferLen);
					break;
				case _MESSAGE_ID_TAG :
					_bitField0 |= _MESSAGE_ID_MASK;
					int messageIdSize = LightProtoCodec.readVarInt(_buffer);
					setMessageId().parseFrom(_buffer, messageIdSize);
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
	public ClusterMessageId clear() {
		cluster = null;
		_clusterBufferIdx = -1;
		_clusterBufferLen = -1;
		if (hasMessageId()) {
			messageId.clear();
		}
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public ClusterMessageId copyFrom(ClusterMessageId _other) {
		_cachedSize = -1;
		if (_other.hasCluster()) {
			setCluster(_other.getCluster());
		}
		if (_other.hasMessageId()) {
			setMessageId().copyFrom(_other.messageId);
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
