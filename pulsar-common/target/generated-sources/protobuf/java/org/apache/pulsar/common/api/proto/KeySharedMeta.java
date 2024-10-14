package org.apache.pulsar.common.api.proto;
public final class KeySharedMeta {
	private KeySharedMode keySharedMode;
	private static final int _KEY_SHARED_MODE_FIELD_NUMBER = 1;
	private static final int _KEY_SHARED_MODE_TAG = (_KEY_SHARED_MODE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _KEY_SHARED_MODE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_KEY_SHARED_MODE_TAG);
	private static final int _KEY_SHARED_MODE_MASK = 1 << (0 % 32);
	public boolean hasKeySharedMode() {
		return (_bitField0 & _KEY_SHARED_MODE_MASK) != 0;
	}
	public KeySharedMode getKeySharedMode() {
		if (!hasKeySharedMode()) {
			throw new IllegalStateException("Field 'keySharedMode' is not set");
		}
		return keySharedMode;
	}
	public KeySharedMeta setKeySharedMode(KeySharedMode keySharedMode) {
		this.keySharedMode = keySharedMode;
		_bitField0 |= _KEY_SHARED_MODE_MASK;
		_cachedSize = -1;
		return this;
	}
	public KeySharedMeta clearKeySharedMode() {
		_bitField0 &= ~_KEY_SHARED_MODE_MASK;
		return this;
	}

	private java.util.List<IntRange> hashRanges = null;
	private int _hashRangesCount = 0;
	private static final int _HASH_RANGES_FIELD_NUMBER = 3;
	private static final int _HASH_RANGES_TAG = (_HASH_RANGES_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _HASH_RANGES_TAG_SIZE = LightProtoCodec.computeVarIntSize(_HASH_RANGES_TAG);
	public int getHashRangesCount() {
		return _hashRangesCount;
	}
	public IntRange getHashRangeAt(int idx) {
		if (idx < 0 || idx >= _hashRangesCount) {
			throw new IndexOutOfBoundsException(
					"Index " + idx + " is out of the list size (" + _hashRangesCount + ") for field 'hashRanges'");
		}
		return hashRanges.get(idx);
	}
	public java.util.List<IntRange> getHashRangesList() {
		if (_hashRangesCount == 0) {
			return java.util.Collections.emptyList();
		} else {
			return hashRanges.subList(0, _hashRangesCount);
		}
	}
	public IntRange addHashRange() {
		if (hashRanges == null) {
			hashRanges = new java.util.ArrayList<IntRange>();
		}
		if (hashRanges.size() == _hashRangesCount) {
			hashRanges.add(new IntRange());
		}
		_cachedSize = -1;
		return hashRanges.get(_hashRangesCount++);
	}
	public KeySharedMeta addAllHashRanges(Iterable<IntRange> hashRanges) {
		for (IntRange _o : hashRanges) {
			addHashRange().copyFrom(_o);
		}
		return this;
	}
	public KeySharedMeta clearHashRanges() {
		for (int i = 0; i < _hashRangesCount; i++) {
			hashRanges.get(i).clear();
		}
		_hashRangesCount = 0;
		return this;
	}

	private boolean allowOutOfOrderDelivery = false;
	private static final int _ALLOW_OUT_OF_ORDER_DELIVERY_FIELD_NUMBER = 4;
	private static final int _ALLOW_OUT_OF_ORDER_DELIVERY_TAG = (_ALLOW_OUT_OF_ORDER_DELIVERY_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _ALLOW_OUT_OF_ORDER_DELIVERY_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_ALLOW_OUT_OF_ORDER_DELIVERY_TAG);
	private static final int _ALLOW_OUT_OF_ORDER_DELIVERY_MASK = 1 << (2 % 32);
	public boolean hasAllowOutOfOrderDelivery() {
		return (_bitField0 & _ALLOW_OUT_OF_ORDER_DELIVERY_MASK) != 0;
	}
	public boolean isAllowOutOfOrderDelivery() {
		return allowOutOfOrderDelivery;
	}
	public KeySharedMeta setAllowOutOfOrderDelivery(boolean allowOutOfOrderDelivery) {
		this.allowOutOfOrderDelivery = allowOutOfOrderDelivery;
		_bitField0 |= _ALLOW_OUT_OF_ORDER_DELIVERY_MASK;
		_cachedSize = -1;
		return this;
	}
	public KeySharedMeta clearAllowOutOfOrderDelivery() {
		_bitField0 &= ~_ALLOW_OUT_OF_ORDER_DELIVERY_MASK;
		allowOutOfOrderDelivery = false;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _KEY_SHARED_MODE_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _KEY_SHARED_MODE_TAG);
		LightProtoCodec.writeVarInt(_b, keySharedMode.getValue());
		for (int i = 0; i < _hashRangesCount; i++) {
			IntRange _item = hashRanges.get(i);
			LightProtoCodec.writeVarInt(_b, _HASH_RANGES_TAG);
			LightProtoCodec.writeVarInt(_b, _item.getSerializedSize());
			_item.writeTo(_b);
		}
		if (hasAllowOutOfOrderDelivery()) {
			LightProtoCodec.writeVarInt(_b, _ALLOW_OUT_OF_ORDER_DELIVERY_TAG);
			_b.writeBoolean(allowOutOfOrderDelivery);
		}
		return (_b.writerIndex() - _writeIdx);
	}
	public int getSerializedSize() {
		if (_cachedSize > -1) {
			return _cachedSize;
		}

		int _size = 0;
		_size += _KEY_SHARED_MODE_TAG_SIZE;
		_size += LightProtoCodec.computeVarIntSize(keySharedMode.getValue());
		for (int i = 0; i < _hashRangesCount; i++) {
			IntRange _item = hashRanges.get(i);
			_size += _HASH_RANGES_TAG_SIZE;
			int MsgsizeHashRanges = _item.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeHashRanges) + MsgsizeHashRanges;
		}
		if (hasAllowOutOfOrderDelivery()) {
			_size += _ALLOW_OUT_OF_ORDER_DELIVERY_TAG_SIZE;
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
				case _KEY_SHARED_MODE_TAG :
					KeySharedMode _keySharedMode = KeySharedMode.valueOf(LightProtoCodec.readVarInt(_buffer));
					if (_keySharedMode != null) {
						_bitField0 |= _KEY_SHARED_MODE_MASK;
						keySharedMode = _keySharedMode;
					}
					break;
				case _HASH_RANGES_TAG :
					int _hashRangesSize = LightProtoCodec.readVarInt(_buffer);
					addHashRange().parseFrom(_buffer, _hashRangesSize);
					break;
				case _ALLOW_OUT_OF_ORDER_DELIVERY_TAG :
					_bitField0 |= _ALLOW_OUT_OF_ORDER_DELIVERY_MASK;
					allowOutOfOrderDelivery = LightProtoCodec.readVarInt(_buffer) == 1;
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
	public KeySharedMeta clear() {
		for (int i = 0; i < _hashRangesCount; i++) {
			hashRanges.get(i).clear();
		}
		_hashRangesCount = 0;
		allowOutOfOrderDelivery = false;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public KeySharedMeta copyFrom(KeySharedMeta _other) {
		_cachedSize = -1;
		if (_other.hasKeySharedMode()) {
			setKeySharedMode(_other.keySharedMode);
		}
		for (int i = 0; i < _other.getHashRangesCount(); i++) {
			addHashRange().copyFrom(_other.getHashRangeAt(i));
		}
		if (_other.hasAllowOutOfOrderDelivery()) {
			setAllowOutOfOrderDelivery(_other.allowOutOfOrderDelivery);
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
