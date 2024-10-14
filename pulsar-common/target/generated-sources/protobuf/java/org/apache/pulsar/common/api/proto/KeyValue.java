package org.apache.pulsar.common.api.proto;
public final class KeyValue {
	private String key;
	private int _keyBufferIdx = -1;
	private int _keyBufferLen = -1;
	private static final int _KEY_FIELD_NUMBER = 1;
	private static final int _KEY_TAG = (_KEY_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _KEY_TAG_SIZE = LightProtoCodec.computeVarIntSize(_KEY_TAG);
	private static final int _KEY_MASK = 1 << (0 % 32);
	public boolean hasKey() {
		return (_bitField0 & _KEY_MASK) != 0;
	}
	public String getKey() {
		if (!hasKey()) {
			throw new IllegalStateException("Field 'key' is not set");
		}
		if (key == null) {
			key = LightProtoCodec.readString(_parsedBuffer, _keyBufferIdx, _keyBufferLen);
		}
		return key;
	}
	public KeyValue setKey(String key) {
		this.key = key;
		_bitField0 |= _KEY_MASK;
		_keyBufferIdx = -1;
		_keyBufferLen = LightProtoCodec.computeStringUTF8Size(key);
		_cachedSize = -1;
		return this;
	}
	public KeyValue clearKey() {
		_bitField0 &= ~_KEY_MASK;
		key = null;
		_keyBufferIdx = -1;
		_keyBufferLen = -1;
		return this;
	}

	private String value;
	private int _valueBufferIdx = -1;
	private int _valueBufferLen = -1;
	private static final int _VALUE_FIELD_NUMBER = 2;
	private static final int _VALUE_TAG = (_VALUE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _VALUE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_VALUE_TAG);
	private static final int _VALUE_MASK = 1 << (1 % 32);
	public boolean hasValue() {
		return (_bitField0 & _VALUE_MASK) != 0;
	}
	public String getValue() {
		if (!hasValue()) {
			throw new IllegalStateException("Field 'value' is not set");
		}
		if (value == null) {
			value = LightProtoCodec.readString(_parsedBuffer, _valueBufferIdx, _valueBufferLen);
		}
		return value;
	}
	public KeyValue setValue(String value) {
		this.value = value;
		_bitField0 |= _VALUE_MASK;
		_valueBufferIdx = -1;
		_valueBufferLen = LightProtoCodec.computeStringUTF8Size(value);
		_cachedSize = -1;
		return this;
	}
	public KeyValue clearValue() {
		_bitField0 &= ~_VALUE_MASK;
		value = null;
		_valueBufferIdx = -1;
		_valueBufferLen = -1;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _KEY_MASK | _VALUE_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _KEY_TAG);
		LightProtoCodec.writeVarInt(_b, _keyBufferLen);
		if (_keyBufferIdx == -1) {
			LightProtoCodec.writeString(_b, key, _keyBufferLen);
		} else {
			_parsedBuffer.getBytes(_keyBufferIdx, _b, _keyBufferLen);
		}
		LightProtoCodec.writeVarInt(_b, _VALUE_TAG);
		LightProtoCodec.writeVarInt(_b, _valueBufferLen);
		if (_valueBufferIdx == -1) {
			LightProtoCodec.writeString(_b, value, _valueBufferLen);
		} else {
			_parsedBuffer.getBytes(_valueBufferIdx, _b, _valueBufferLen);
		}
		return (_b.writerIndex() - _writeIdx);
	}
	public int getSerializedSize() {
		if (_cachedSize > -1) {
			return _cachedSize;
		}

		int _size = 0;
		_size += _KEY_TAG_SIZE;
		_size += LightProtoCodec.computeVarIntSize(_keyBufferLen);
		_size += _keyBufferLen;
		_size += _VALUE_TAG_SIZE;
		_size += LightProtoCodec.computeVarIntSize(_valueBufferLen);
		_size += _valueBufferLen;
		_cachedSize = _size;
		return _size;
	}
	public void parseFrom(io.netty.buffer.ByteBuf _buffer, int _size) {
		clear();
		int _endIdx = _buffer.readerIndex() + _size;
		while (_buffer.readerIndex() < _endIdx) {
			int _tag = LightProtoCodec.readVarInt(_buffer);
			switch (_tag) {
				case _KEY_TAG :
					_bitField0 |= _KEY_MASK;
					_keyBufferLen = LightProtoCodec.readVarInt(_buffer);
					_keyBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_keyBufferLen);
					break;
				case _VALUE_TAG :
					_bitField0 |= _VALUE_MASK;
					_valueBufferLen = LightProtoCodec.readVarInt(_buffer);
					_valueBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_valueBufferLen);
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
	public KeyValue clear() {
		key = null;
		_keyBufferIdx = -1;
		_keyBufferLen = -1;
		value = null;
		_valueBufferIdx = -1;
		_valueBufferLen = -1;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public KeyValue copyFrom(KeyValue _other) {
		_cachedSize = -1;
		if (_other.hasKey()) {
			setKey(_other.getKey());
		}
		if (_other.hasValue()) {
			setValue(_other.getValue());
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
