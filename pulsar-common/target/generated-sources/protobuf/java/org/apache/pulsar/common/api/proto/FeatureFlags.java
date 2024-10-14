package org.apache.pulsar.common.api.proto;
public final class FeatureFlags {
	private boolean supportsAuthRefresh = false;
	private static final int _SUPPORTS_AUTH_REFRESH_FIELD_NUMBER = 1;
	private static final int _SUPPORTS_AUTH_REFRESH_TAG = (_SUPPORTS_AUTH_REFRESH_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _SUPPORTS_AUTH_REFRESH_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_SUPPORTS_AUTH_REFRESH_TAG);
	private static final int _SUPPORTS_AUTH_REFRESH_MASK = 1 << (0 % 32);
	public boolean hasSupportsAuthRefresh() {
		return (_bitField0 & _SUPPORTS_AUTH_REFRESH_MASK) != 0;
	}
	public boolean isSupportsAuthRefresh() {
		return supportsAuthRefresh;
	}
	public FeatureFlags setSupportsAuthRefresh(boolean supportsAuthRefresh) {
		this.supportsAuthRefresh = supportsAuthRefresh;
		_bitField0 |= _SUPPORTS_AUTH_REFRESH_MASK;
		_cachedSize = -1;
		return this;
	}
	public FeatureFlags clearSupportsAuthRefresh() {
		_bitField0 &= ~_SUPPORTS_AUTH_REFRESH_MASK;
		supportsAuthRefresh = false;
		return this;
	}

	private boolean supportsBrokerEntryMetadata = false;
	private static final int _SUPPORTS_BROKER_ENTRY_METADATA_FIELD_NUMBER = 2;
	private static final int _SUPPORTS_BROKER_ENTRY_METADATA_TAG = (_SUPPORTS_BROKER_ENTRY_METADATA_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _SUPPORTS_BROKER_ENTRY_METADATA_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_SUPPORTS_BROKER_ENTRY_METADATA_TAG);
	private static final int _SUPPORTS_BROKER_ENTRY_METADATA_MASK = 1 << (1 % 32);
	public boolean hasSupportsBrokerEntryMetadata() {
		return (_bitField0 & _SUPPORTS_BROKER_ENTRY_METADATA_MASK) != 0;
	}
	public boolean isSupportsBrokerEntryMetadata() {
		return supportsBrokerEntryMetadata;
	}
	public FeatureFlags setSupportsBrokerEntryMetadata(boolean supportsBrokerEntryMetadata) {
		this.supportsBrokerEntryMetadata = supportsBrokerEntryMetadata;
		_bitField0 |= _SUPPORTS_BROKER_ENTRY_METADATA_MASK;
		_cachedSize = -1;
		return this;
	}
	public FeatureFlags clearSupportsBrokerEntryMetadata() {
		_bitField0 &= ~_SUPPORTS_BROKER_ENTRY_METADATA_MASK;
		supportsBrokerEntryMetadata = false;
		return this;
	}

	private boolean supportsPartialProducer = false;
	private static final int _SUPPORTS_PARTIAL_PRODUCER_FIELD_NUMBER = 3;
	private static final int _SUPPORTS_PARTIAL_PRODUCER_TAG = (_SUPPORTS_PARTIAL_PRODUCER_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _SUPPORTS_PARTIAL_PRODUCER_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_SUPPORTS_PARTIAL_PRODUCER_TAG);
	private static final int _SUPPORTS_PARTIAL_PRODUCER_MASK = 1 << (2 % 32);
	public boolean hasSupportsPartialProducer() {
		return (_bitField0 & _SUPPORTS_PARTIAL_PRODUCER_MASK) != 0;
	}
	public boolean isSupportsPartialProducer() {
		return supportsPartialProducer;
	}
	public FeatureFlags setSupportsPartialProducer(boolean supportsPartialProducer) {
		this.supportsPartialProducer = supportsPartialProducer;
		_bitField0 |= _SUPPORTS_PARTIAL_PRODUCER_MASK;
		_cachedSize = -1;
		return this;
	}
	public FeatureFlags clearSupportsPartialProducer() {
		_bitField0 &= ~_SUPPORTS_PARTIAL_PRODUCER_MASK;
		supportsPartialProducer = false;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		int _writeIdx = _b.writerIndex();
		if (hasSupportsAuthRefresh()) {
			LightProtoCodec.writeVarInt(_b, _SUPPORTS_AUTH_REFRESH_TAG);
			_b.writeBoolean(supportsAuthRefresh);
		}
		if (hasSupportsBrokerEntryMetadata()) {
			LightProtoCodec.writeVarInt(_b, _SUPPORTS_BROKER_ENTRY_METADATA_TAG);
			_b.writeBoolean(supportsBrokerEntryMetadata);
		}
		if (hasSupportsPartialProducer()) {
			LightProtoCodec.writeVarInt(_b, _SUPPORTS_PARTIAL_PRODUCER_TAG);
			_b.writeBoolean(supportsPartialProducer);
		}
		return (_b.writerIndex() - _writeIdx);
	}
	public int getSerializedSize() {
		if (_cachedSize > -1) {
			return _cachedSize;
		}

		int _size = 0;
		if (hasSupportsAuthRefresh()) {
			_size += _SUPPORTS_AUTH_REFRESH_TAG_SIZE;
			_size += 1;
		}
		if (hasSupportsBrokerEntryMetadata()) {
			_size += _SUPPORTS_BROKER_ENTRY_METADATA_TAG_SIZE;
			_size += 1;
		}
		if (hasSupportsPartialProducer()) {
			_size += _SUPPORTS_PARTIAL_PRODUCER_TAG_SIZE;
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
				case _SUPPORTS_AUTH_REFRESH_TAG :
					_bitField0 |= _SUPPORTS_AUTH_REFRESH_MASK;
					supportsAuthRefresh = LightProtoCodec.readVarInt(_buffer) == 1;
					break;
				case _SUPPORTS_BROKER_ENTRY_METADATA_TAG :
					_bitField0 |= _SUPPORTS_BROKER_ENTRY_METADATA_MASK;
					supportsBrokerEntryMetadata = LightProtoCodec.readVarInt(_buffer) == 1;
					break;
				case _SUPPORTS_PARTIAL_PRODUCER_TAG :
					_bitField0 |= _SUPPORTS_PARTIAL_PRODUCER_MASK;
					supportsPartialProducer = LightProtoCodec.readVarInt(_buffer) == 1;
					break;
				default :
					LightProtoCodec.skipUnknownField(_tag, _buffer);
			}
		}
		_parsedBuffer = _buffer;
	}
	public FeatureFlags clear() {
		supportsAuthRefresh = false;
		supportsBrokerEntryMetadata = false;
		supportsPartialProducer = false;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public FeatureFlags copyFrom(FeatureFlags _other) {
		_cachedSize = -1;
		if (_other.hasSupportsAuthRefresh()) {
			setSupportsAuthRefresh(_other.supportsAuthRefresh);
		}
		if (_other.hasSupportsBrokerEntryMetadata()) {
			setSupportsBrokerEntryMetadata(_other.supportsBrokerEntryMetadata);
		}
		if (_other.hasSupportsPartialProducer()) {
			setSupportsPartialProducer(_other.supportsPartialProducer);
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
