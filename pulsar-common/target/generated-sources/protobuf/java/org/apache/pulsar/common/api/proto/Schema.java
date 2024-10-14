package org.apache.pulsar.common.api.proto;
public final class Schema {
	public enum Type {
		None(0), String(1), Json(2), Protobuf(3), Avro(4), Bool(5), Int8(6), Int16(7), Int32(8), Int64(9), Float(
				10), Double(11), Date(12), Time(13), Timestamp(14), KeyValue(
						15), Instant(16), LocalDate(17), LocalTime(18), LocalDateTime(19), ProtobufNative(20),;
		private final int value;
		private Type(int value) {
			this.value = value;
		}
		public int getValue() {
			return value;
		}
		public static Type valueOf(int n) {
			switch (n) {
				case 0 :
					return None;
				case 1 :
					return String;
				case 2 :
					return Json;
				case 3 :
					return Protobuf;
				case 4 :
					return Avro;
				case 5 :
					return Bool;
				case 6 :
					return Int8;
				case 7 :
					return Int16;
				case 8 :
					return Int32;
				case 9 :
					return Int64;
				case 10 :
					return Float;
				case 11 :
					return Double;
				case 12 :
					return Date;
				case 13 :
					return Time;
				case 14 :
					return Timestamp;
				case 15 :
					return KeyValue;
				case 16 :
					return Instant;
				case 17 :
					return LocalDate;
				case 18 :
					return LocalTime;
				case 19 :
					return LocalDateTime;
				case 20 :
					return ProtobufNative;
				default :
					return null;

			}
		}
		public static final int None_VALUE = 0;
		public static final int String_VALUE = 1;
		public static final int Json_VALUE = 2;
		public static final int Protobuf_VALUE = 3;
		public static final int Avro_VALUE = 4;
		public static final int Bool_VALUE = 5;
		public static final int Int8_VALUE = 6;
		public static final int Int16_VALUE = 7;
		public static final int Int32_VALUE = 8;
		public static final int Int64_VALUE = 9;
		public static final int Float_VALUE = 10;
		public static final int Double_VALUE = 11;
		public static final int Date_VALUE = 12;
		public static final int Time_VALUE = 13;
		public static final int Timestamp_VALUE = 14;
		public static final int KeyValue_VALUE = 15;
		public static final int Instant_VALUE = 16;
		public static final int LocalDate_VALUE = 17;
		public static final int LocalTime_VALUE = 18;
		public static final int LocalDateTime_VALUE = 19;
		public static final int ProtobufNative_VALUE = 20;
	}

	private String name;
	private int _nameBufferIdx = -1;
	private int _nameBufferLen = -1;
	private static final int _NAME_FIELD_NUMBER = 1;
	private static final int _NAME_TAG = (_NAME_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _NAME_TAG_SIZE = LightProtoCodec.computeVarIntSize(_NAME_TAG);
	private static final int _NAME_MASK = 1 << (0 % 32);
	public boolean hasName() {
		return (_bitField0 & _NAME_MASK) != 0;
	}
	public String getName() {
		if (!hasName()) {
			throw new IllegalStateException("Field 'name' is not set");
		}
		if (name == null) {
			name = LightProtoCodec.readString(_parsedBuffer, _nameBufferIdx, _nameBufferLen);
		}
		return name;
	}
	public Schema setName(String name) {
		this.name = name;
		_bitField0 |= _NAME_MASK;
		_nameBufferIdx = -1;
		_nameBufferLen = LightProtoCodec.computeStringUTF8Size(name);
		_cachedSize = -1;
		return this;
	}
	public Schema clearName() {
		_bitField0 &= ~_NAME_MASK;
		name = null;
		_nameBufferIdx = -1;
		_nameBufferLen = -1;
		return this;
	}

	private io.netty.buffer.ByteBuf schemaData = null;
	private int _schemaDataIdx = -1;
	private int _schemaDataLen = -1;
	private static final int _SCHEMA_DATA_FIELD_NUMBER = 3;
	private static final int _SCHEMA_DATA_TAG = (_SCHEMA_DATA_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _SCHEMA_DATA_TAG_SIZE = LightProtoCodec.computeVarIntSize(_SCHEMA_DATA_TAG);
	private static final int _SCHEMA_DATA_MASK = 1 << (1 % 32);
	public boolean hasSchemaData() {
		return (_bitField0 & _SCHEMA_DATA_MASK) != 0;
	}
	public int getSchemaDataSize() {
		if (!hasSchemaData()) {
			throw new IllegalStateException("Field 'schema_data' is not set");
		}
		return _schemaDataLen;
	}
	public byte[] getSchemaData() {
		io.netty.buffer.ByteBuf _b = getSchemaDataSlice();
		byte[] res = new byte[_b.readableBytes()];
		_b.getBytes(0, res);
		return res;
	}
	public io.netty.buffer.ByteBuf getSchemaDataSlice() {
		if (!hasSchemaData()) {
			throw new IllegalStateException("Field 'schema_data' is not set");
		}
		if (schemaData == null) {
			return _parsedBuffer.slice(_schemaDataIdx, _schemaDataLen);
		} else {
			return schemaData.slice(0, _schemaDataLen);
		}
	}
	public Schema setSchemaData(byte[] schemaData) {
		setSchemaData(io.netty.buffer.Unpooled.wrappedBuffer(schemaData));
		return this;
	}
	public Schema setSchemaData(io.netty.buffer.ByteBuf schemaData) {
		this.schemaData = schemaData;
		_bitField0 |= _SCHEMA_DATA_MASK;
		_schemaDataIdx = -1;
		_schemaDataLen = schemaData.readableBytes();
		_cachedSize = -1;
		return this;
	}
	public Schema clearSchemaData() {
		_bitField0 &= ~_SCHEMA_DATA_MASK;
		schemaData = null;
		_schemaDataIdx = -1;
		_schemaDataLen = -1;
		return this;
	}

	private Type type;
	private static final int _TYPE_FIELD_NUMBER = 4;
	private static final int _TYPE_TAG = (_TYPE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _TYPE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_TYPE_TAG);
	private static final int _TYPE_MASK = 1 << (2 % 32);
	public boolean hasType() {
		return (_bitField0 & _TYPE_MASK) != 0;
	}
	public Type getType() {
		if (!hasType()) {
			throw new IllegalStateException("Field 'type' is not set");
		}
		return type;
	}
	public Schema setType(Type type) {
		this.type = type;
		_bitField0 |= _TYPE_MASK;
		_cachedSize = -1;
		return this;
	}
	public Schema clearType() {
		_bitField0 &= ~_TYPE_MASK;
		return this;
	}

	private java.util.List<KeyValue> properties = null;
	private int _propertiesCount = 0;
	private static final int _PROPERTIES_FIELD_NUMBER = 5;
	private static final int _PROPERTIES_TAG = (_PROPERTIES_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _PROPERTIES_TAG_SIZE = LightProtoCodec.computeVarIntSize(_PROPERTIES_TAG);
	public int getPropertiesCount() {
		return _propertiesCount;
	}
	public KeyValue getPropertyAt(int idx) {
		if (idx < 0 || idx >= _propertiesCount) {
			throw new IndexOutOfBoundsException(
					"Index " + idx + " is out of the list size (" + _propertiesCount + ") for field 'properties'");
		}
		return properties.get(idx);
	}
	public java.util.List<KeyValue> getPropertiesList() {
		if (_propertiesCount == 0) {
			return java.util.Collections.emptyList();
		} else {
			return properties.subList(0, _propertiesCount);
		}
	}
	public KeyValue addProperty() {
		if (properties == null) {
			properties = new java.util.ArrayList<KeyValue>();
		}
		if (properties.size() == _propertiesCount) {
			properties.add(new KeyValue());
		}
		_cachedSize = -1;
		return properties.get(_propertiesCount++);
	}
	public Schema addAllProperties(Iterable<KeyValue> properties) {
		for (KeyValue _o : properties) {
			addProperty().copyFrom(_o);
		}
		return this;
	}
	public Schema clearProperties() {
		for (int i = 0; i < _propertiesCount; i++) {
			properties.get(i).clear();
		}
		_propertiesCount = 0;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _NAME_MASK | _SCHEMA_DATA_MASK | _TYPE_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _NAME_TAG);
		LightProtoCodec.writeVarInt(_b, _nameBufferLen);
		if (_nameBufferIdx == -1) {
			LightProtoCodec.writeString(_b, name, _nameBufferLen);
		} else {
			_parsedBuffer.getBytes(_nameBufferIdx, _b, _nameBufferLen);
		}
		LightProtoCodec.writeVarInt(_b, _SCHEMA_DATA_TAG);
		LightProtoCodec.writeVarInt(_b, _schemaDataLen);
		if (_schemaDataIdx == -1) {
			_b.writeBytes(schemaData);
		} else {
			_parsedBuffer.getBytes(_schemaDataIdx, _b, _schemaDataLen);
		}
		LightProtoCodec.writeVarInt(_b, _TYPE_TAG);
		LightProtoCodec.writeVarInt(_b, type.getValue());
		for (int i = 0; i < _propertiesCount; i++) {
			KeyValue _item = properties.get(i);
			LightProtoCodec.writeVarInt(_b, _PROPERTIES_TAG);
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
		_size += _NAME_TAG_SIZE;
		_size += LightProtoCodec.computeVarIntSize(_nameBufferLen);
		_size += _nameBufferLen;
		_size += _SCHEMA_DATA_TAG_SIZE;
		_size += LightProtoCodec.computeVarIntSize(_schemaDataLen) + _schemaDataLen;
		_size += _TYPE_TAG_SIZE;
		_size += LightProtoCodec.computeVarIntSize(type.getValue());
		for (int i = 0; i < _propertiesCount; i++) {
			KeyValue _item = properties.get(i);
			_size += _PROPERTIES_TAG_SIZE;
			int MsgsizeProperties = _item.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeProperties) + MsgsizeProperties;
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
				case _NAME_TAG :
					_bitField0 |= _NAME_MASK;
					_nameBufferLen = LightProtoCodec.readVarInt(_buffer);
					_nameBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_nameBufferLen);
					break;
				case _SCHEMA_DATA_TAG :
					_bitField0 |= _SCHEMA_DATA_MASK;
					_schemaDataLen = LightProtoCodec.readVarInt(_buffer);
					_schemaDataIdx = _buffer.readerIndex();
					_buffer.skipBytes(_schemaDataLen);
					break;
				case _TYPE_TAG :
					Type _type = Type.valueOf(LightProtoCodec.readVarInt(_buffer));
					if (_type != null) {
						_bitField0 |= _TYPE_MASK;
						type = _type;
					}
					break;
				case _PROPERTIES_TAG :
					int _propertiesSize = LightProtoCodec.readVarInt(_buffer);
					addProperty().parseFrom(_buffer, _propertiesSize);
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
	public Schema clear() {
		name = null;
		_nameBufferIdx = -1;
		_nameBufferLen = -1;
		schemaData = null;
		_schemaDataIdx = -1;
		_schemaDataLen = -1;
		for (int i = 0; i < _propertiesCount; i++) {
			properties.get(i).clear();
		}
		_propertiesCount = 0;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public Schema copyFrom(Schema _other) {
		_cachedSize = -1;
		if (_other.hasName()) {
			setName(_other.getName());
		}
		if (_other.hasSchemaData()) {
			setSchemaData(_other.getSchemaData());
		}
		if (_other.hasType()) {
			setType(_other.type);
		}
		for (int i = 0; i < _other.getPropertiesCount(); i++) {
			addProperty().copyFrom(_other.getPropertyAt(i));
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
