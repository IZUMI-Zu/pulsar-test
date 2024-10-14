package org.apache.pulsar.broker.service.resource.usage;
public final class ResourceUsageInfo {
	private String broker;
	private int _brokerBufferIdx = -1;
	private int _brokerBufferLen = -1;
	private static final int _BROKER_FIELD_NUMBER = 1;
	private static final int _BROKER_TAG = (_BROKER_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _BROKER_TAG_SIZE = LightProtoCodec.computeVarIntSize(_BROKER_TAG);
	private static final int _BROKER_MASK = 1 << (0 % 32);
	public boolean hasBroker() {
		return (_bitField0 & _BROKER_MASK) != 0;
	}
	public String getBroker() {
		if (!hasBroker()) {
			throw new IllegalStateException("Field 'broker' is not set");
		}
		if (broker == null) {
			broker = LightProtoCodec.readString(_parsedBuffer, _brokerBufferIdx, _brokerBufferLen);
		}
		return broker;
	}
	public ResourceUsageInfo setBroker(String broker) {
		this.broker = broker;
		_bitField0 |= _BROKER_MASK;
		_brokerBufferIdx = -1;
		_brokerBufferLen = LightProtoCodec.computeStringUTF8Size(broker);
		_cachedSize = -1;
		return this;
	}
	public ResourceUsageInfo clearBroker() {
		_bitField0 &= ~_BROKER_MASK;
		broker = null;
		_brokerBufferIdx = -1;
		_brokerBufferLen = -1;
		return this;
	}

	private java.util.List<ResourceUsage> usageMaps = null;
	private int _usageMapsCount = 0;
	private static final int _USAGE_MAP_FIELD_NUMBER = 2;
	private static final int _USAGE_MAP_TAG = (_USAGE_MAP_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _USAGE_MAP_TAG_SIZE = LightProtoCodec.computeVarIntSize(_USAGE_MAP_TAG);
	public int getUsageMapsCount() {
		return _usageMapsCount;
	}
	public ResourceUsage getUsageMapAt(int idx) {
		if (idx < 0 || idx >= _usageMapsCount) {
			throw new IndexOutOfBoundsException(
					"Index " + idx + " is out of the list size (" + _usageMapsCount + ") for field 'usageMap'");
		}
		return usageMaps.get(idx);
	}
	public java.util.List<ResourceUsage> getUsageMapsList() {
		if (_usageMapsCount == 0) {
			return java.util.Collections.emptyList();
		} else {
			return usageMaps.subList(0, _usageMapsCount);
		}
	}
	public ResourceUsage addUsageMap() {
		if (usageMaps == null) {
			usageMaps = new java.util.ArrayList<ResourceUsage>();
		}
		if (usageMaps.size() == _usageMapsCount) {
			usageMaps.add(new ResourceUsage());
		}
		_cachedSize = -1;
		return usageMaps.get(_usageMapsCount++);
	}
	public ResourceUsageInfo addAllUsageMaps(Iterable<ResourceUsage> usageMaps) {
		for (ResourceUsage _o : usageMaps) {
			addUsageMap().copyFrom(_o);
		}
		return this;
	}
	public ResourceUsageInfo clearUsageMap() {
		for (int i = 0; i < _usageMapsCount; i++) {
			usageMaps.get(i).clear();
		}
		_usageMapsCount = 0;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _BROKER_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _BROKER_TAG);
		LightProtoCodec.writeVarInt(_b, _brokerBufferLen);
		if (_brokerBufferIdx == -1) {
			LightProtoCodec.writeString(_b, broker, _brokerBufferLen);
		} else {
			_parsedBuffer.getBytes(_brokerBufferIdx, _b, _brokerBufferLen);
		}
		for (int i = 0; i < _usageMapsCount; i++) {
			ResourceUsage _item = usageMaps.get(i);
			LightProtoCodec.writeVarInt(_b, _USAGE_MAP_TAG);
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
		_size += _BROKER_TAG_SIZE;
		_size += LightProtoCodec.computeVarIntSize(_brokerBufferLen);
		_size += _brokerBufferLen;
		for (int i = 0; i < _usageMapsCount; i++) {
			ResourceUsage _item = usageMaps.get(i);
			_size += _USAGE_MAP_TAG_SIZE;
			int MsgsizeUsageMap = _item.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeUsageMap) + MsgsizeUsageMap;
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
				case _BROKER_TAG :
					_bitField0 |= _BROKER_MASK;
					_brokerBufferLen = LightProtoCodec.readVarInt(_buffer);
					_brokerBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_brokerBufferLen);
					break;
				case _USAGE_MAP_TAG :
					int _usageMapSize = LightProtoCodec.readVarInt(_buffer);
					addUsageMap().parseFrom(_buffer, _usageMapSize);
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
	public ResourceUsageInfo clear() {
		broker = null;
		_brokerBufferIdx = -1;
		_brokerBufferLen = -1;
		for (int i = 0; i < _usageMapsCount; i++) {
			usageMaps.get(i).clear();
		}
		_usageMapsCount = 0;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public ResourceUsageInfo copyFrom(ResourceUsageInfo _other) {
		_cachedSize = -1;
		if (_other.hasBroker()) {
			setBroker(_other.getBroker());
		}
		for (int i = 0; i < _other.getUsageMapsCount(); i++) {
			addUsageMap().copyFrom(_other.getUsageMapAt(i));
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
