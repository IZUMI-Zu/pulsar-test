package org.apache.pulsar.common.api.proto;
public final class CommandAddSubscriptionToTxn {
	private long requestId;
	private static final int _REQUEST_ID_FIELD_NUMBER = 1;
	private static final int _REQUEST_ID_TAG = (_REQUEST_ID_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _REQUEST_ID_TAG_SIZE = LightProtoCodec.computeVarIntSize(_REQUEST_ID_TAG);
	private static final int _REQUEST_ID_MASK = 1 << (0 % 32);
	public boolean hasRequestId() {
		return (_bitField0 & _REQUEST_ID_MASK) != 0;
	}
	public long getRequestId() {
		if (!hasRequestId()) {
			throw new IllegalStateException("Field 'request_id' is not set");
		}
		return requestId;
	}
	public CommandAddSubscriptionToTxn setRequestId(long requestId) {
		this.requestId = requestId;
		_bitField0 |= _REQUEST_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandAddSubscriptionToTxn clearRequestId() {
		_bitField0 &= ~_REQUEST_ID_MASK;
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
	public CommandAddSubscriptionToTxn setTxnidLeastBits(long txnidLeastBits) {
		this.txnidLeastBits = txnidLeastBits;
		_bitField0 |= _TXNID_LEAST_BITS_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandAddSubscriptionToTxn clearTxnidLeastBits() {
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
	public CommandAddSubscriptionToTxn setTxnidMostBits(long txnidMostBits) {
		this.txnidMostBits = txnidMostBits;
		_bitField0 |= _TXNID_MOST_BITS_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandAddSubscriptionToTxn clearTxnidMostBits() {
		_bitField0 &= ~_TXNID_MOST_BITS_MASK;
		txnidMostBits = 0;
		return this;
	}

	private java.util.List<Subscription> subscriptions = null;
	private int _subscriptionsCount = 0;
	private static final int _SUBSCRIPTION_FIELD_NUMBER = 4;
	private static final int _SUBSCRIPTION_TAG = (_SUBSCRIPTION_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _SUBSCRIPTION_TAG_SIZE = LightProtoCodec.computeVarIntSize(_SUBSCRIPTION_TAG);
	public int getSubscriptionsCount() {
		return _subscriptionsCount;
	}
	public Subscription getSubscriptionAt(int idx) {
		if (idx < 0 || idx >= _subscriptionsCount) {
			throw new IndexOutOfBoundsException(
					"Index " + idx + " is out of the list size (" + _subscriptionsCount + ") for field 'subscription'");
		}
		return subscriptions.get(idx);
	}
	public java.util.List<Subscription> getSubscriptionsList() {
		if (_subscriptionsCount == 0) {
			return java.util.Collections.emptyList();
		} else {
			return subscriptions.subList(0, _subscriptionsCount);
		}
	}
	public Subscription addSubscription() {
		if (subscriptions == null) {
			subscriptions = new java.util.ArrayList<Subscription>();
		}
		if (subscriptions.size() == _subscriptionsCount) {
			subscriptions.add(new Subscription());
		}
		_cachedSize = -1;
		return subscriptions.get(_subscriptionsCount++);
	}
	public CommandAddSubscriptionToTxn addAllSubscriptions(Iterable<Subscription> subscriptions) {
		for (Subscription _o : subscriptions) {
			addSubscription().copyFrom(_o);
		}
		return this;
	}
	public CommandAddSubscriptionToTxn clearSubscription() {
		for (int i = 0; i < _subscriptionsCount; i++) {
			subscriptions.get(i).clear();
		}
		_subscriptionsCount = 0;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _REQUEST_ID_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _REQUEST_ID_TAG);
		LightProtoCodec.writeVarInt64(_b, requestId);
		if (hasTxnidLeastBits()) {
			LightProtoCodec.writeVarInt(_b, _TXNID_LEAST_BITS_TAG);
			LightProtoCodec.writeVarInt64(_b, txnidLeastBits);
		}
		if (hasTxnidMostBits()) {
			LightProtoCodec.writeVarInt(_b, _TXNID_MOST_BITS_TAG);
			LightProtoCodec.writeVarInt64(_b, txnidMostBits);
		}
		for (int i = 0; i < _subscriptionsCount; i++) {
			Subscription _item = subscriptions.get(i);
			LightProtoCodec.writeVarInt(_b, _SUBSCRIPTION_TAG);
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
		_size += _REQUEST_ID_TAG_SIZE;
		_size += LightProtoCodec.computeVarInt64Size(requestId);
		if (hasTxnidLeastBits()) {
			_size += _TXNID_LEAST_BITS_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(txnidLeastBits);
		}
		if (hasTxnidMostBits()) {
			_size += _TXNID_MOST_BITS_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(txnidMostBits);
		}
		for (int i = 0; i < _subscriptionsCount; i++) {
			Subscription _item = subscriptions.get(i);
			_size += _SUBSCRIPTION_TAG_SIZE;
			int MsgsizeSubscription = _item.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeSubscription) + MsgsizeSubscription;
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
				case _REQUEST_ID_TAG :
					_bitField0 |= _REQUEST_ID_MASK;
					requestId = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _TXNID_LEAST_BITS_TAG :
					_bitField0 |= _TXNID_LEAST_BITS_MASK;
					txnidLeastBits = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _TXNID_MOST_BITS_TAG :
					_bitField0 |= _TXNID_MOST_BITS_MASK;
					txnidMostBits = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _SUBSCRIPTION_TAG :
					int _subscriptionSize = LightProtoCodec.readVarInt(_buffer);
					addSubscription().parseFrom(_buffer, _subscriptionSize);
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
	public CommandAddSubscriptionToTxn clear() {
		txnidLeastBits = 0;
		txnidMostBits = 0;
		for (int i = 0; i < _subscriptionsCount; i++) {
			subscriptions.get(i).clear();
		}
		_subscriptionsCount = 0;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public CommandAddSubscriptionToTxn copyFrom(CommandAddSubscriptionToTxn _other) {
		_cachedSize = -1;
		if (_other.hasRequestId()) {
			setRequestId(_other.requestId);
		}
		if (_other.hasTxnidLeastBits()) {
			setTxnidLeastBits(_other.txnidLeastBits);
		}
		if (_other.hasTxnidMostBits()) {
			setTxnidMostBits(_other.txnidMostBits);
		}
		for (int i = 0; i < _other.getSubscriptionsCount(); i++) {
			addSubscription().copyFrom(_other.getSubscriptionAt(i));
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
