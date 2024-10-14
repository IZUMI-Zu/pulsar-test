package org.apache.pulsar.common.api.proto;
public final class Subscription {
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
	public Subscription setTopic(String topic) {
		this.topic = topic;
		_bitField0 |= _TOPIC_MASK;
		_topicBufferIdx = -1;
		_topicBufferLen = LightProtoCodec.computeStringUTF8Size(topic);
		_cachedSize = -1;
		return this;
	}
	public Subscription clearTopic() {
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
	public Subscription setSubscription(String subscription) {
		this.subscription = subscription;
		_bitField0 |= _SUBSCRIPTION_MASK;
		_subscriptionBufferIdx = -1;
		_subscriptionBufferLen = LightProtoCodec.computeStringUTF8Size(subscription);
		_cachedSize = -1;
		return this;
	}
	public Subscription clearSubscription() {
		_bitField0 &= ~_SUBSCRIPTION_MASK;
		subscription = null;
		_subscriptionBufferIdx = -1;
		_subscriptionBufferLen = -1;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _TOPIC_MASK | _SUBSCRIPTION_MASK;
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
	public Subscription clear() {
		topic = null;
		_topicBufferIdx = -1;
		_topicBufferLen = -1;
		subscription = null;
		_subscriptionBufferIdx = -1;
		_subscriptionBufferLen = -1;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public Subscription copyFrom(Subscription _other) {
		_cachedSize = -1;
		if (_other.hasTopic()) {
			setTopic(_other.getTopic());
		}
		if (_other.hasSubscription()) {
			setSubscription(_other.getSubscription());
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
