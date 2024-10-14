package org.apache.pulsar.common.api.proto;
public final class ReplicatedSubscriptionsUpdate {
	private String subscriptionName;
	private int _subscriptionNameBufferIdx = -1;
	private int _subscriptionNameBufferLen = -1;
	private static final int _SUBSCRIPTION_NAME_FIELD_NUMBER = 1;
	private static final int _SUBSCRIPTION_NAME_TAG = (_SUBSCRIPTION_NAME_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _SUBSCRIPTION_NAME_TAG_SIZE = LightProtoCodec.computeVarIntSize(_SUBSCRIPTION_NAME_TAG);
	private static final int _SUBSCRIPTION_NAME_MASK = 1 << (0 % 32);
	public boolean hasSubscriptionName() {
		return (_bitField0 & _SUBSCRIPTION_NAME_MASK) != 0;
	}
	public String getSubscriptionName() {
		if (!hasSubscriptionName()) {
			throw new IllegalStateException("Field 'subscription_name' is not set");
		}
		if (subscriptionName == null) {
			subscriptionName = LightProtoCodec.readString(_parsedBuffer, _subscriptionNameBufferIdx,
					_subscriptionNameBufferLen);
		}
		return subscriptionName;
	}
	public ReplicatedSubscriptionsUpdate setSubscriptionName(String subscriptionName) {
		this.subscriptionName = subscriptionName;
		_bitField0 |= _SUBSCRIPTION_NAME_MASK;
		_subscriptionNameBufferIdx = -1;
		_subscriptionNameBufferLen = LightProtoCodec.computeStringUTF8Size(subscriptionName);
		_cachedSize = -1;
		return this;
	}
	public ReplicatedSubscriptionsUpdate clearSubscriptionName() {
		_bitField0 &= ~_SUBSCRIPTION_NAME_MASK;
		subscriptionName = null;
		_subscriptionNameBufferIdx = -1;
		_subscriptionNameBufferLen = -1;
		return this;
	}

	private java.util.List<ClusterMessageId> clusters = null;
	private int _clustersCount = 0;
	private static final int _CLUSTERS_FIELD_NUMBER = 2;
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
	public ReplicatedSubscriptionsUpdate addAllClusters(Iterable<ClusterMessageId> clusters) {
		for (ClusterMessageId _o : clusters) {
			addCluster().copyFrom(_o);
		}
		return this;
	}
	public ReplicatedSubscriptionsUpdate clearClusters() {
		for (int i = 0; i < _clustersCount; i++) {
			clusters.get(i).clear();
		}
		_clustersCount = 0;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _SUBSCRIPTION_NAME_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _SUBSCRIPTION_NAME_TAG);
		LightProtoCodec.writeVarInt(_b, _subscriptionNameBufferLen);
		if (_subscriptionNameBufferIdx == -1) {
			LightProtoCodec.writeString(_b, subscriptionName, _subscriptionNameBufferLen);
		} else {
			_parsedBuffer.getBytes(_subscriptionNameBufferIdx, _b, _subscriptionNameBufferLen);
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
		_size += _SUBSCRIPTION_NAME_TAG_SIZE;
		_size += LightProtoCodec.computeVarIntSize(_subscriptionNameBufferLen);
		_size += _subscriptionNameBufferLen;
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
				case _SUBSCRIPTION_NAME_TAG :
					_bitField0 |= _SUBSCRIPTION_NAME_MASK;
					_subscriptionNameBufferLen = LightProtoCodec.readVarInt(_buffer);
					_subscriptionNameBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_subscriptionNameBufferLen);
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
	public ReplicatedSubscriptionsUpdate clear() {
		subscriptionName = null;
		_subscriptionNameBufferIdx = -1;
		_subscriptionNameBufferLen = -1;
		for (int i = 0; i < _clustersCount; i++) {
			clusters.get(i).clear();
		}
		_clustersCount = 0;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public ReplicatedSubscriptionsUpdate copyFrom(ReplicatedSubscriptionsUpdate _other) {
		_cachedSize = -1;
		if (_other.hasSubscriptionName()) {
			setSubscriptionName(_other.getSubscriptionName());
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
