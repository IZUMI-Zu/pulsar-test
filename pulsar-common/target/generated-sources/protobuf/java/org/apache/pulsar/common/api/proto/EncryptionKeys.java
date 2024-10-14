package org.apache.pulsar.common.api.proto;
public final class EncryptionKeys {
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
	public EncryptionKeys setKey(String key) {
		this.key = key;
		_bitField0 |= _KEY_MASK;
		_keyBufferIdx = -1;
		_keyBufferLen = LightProtoCodec.computeStringUTF8Size(key);
		_cachedSize = -1;
		return this;
	}
	public EncryptionKeys clearKey() {
		_bitField0 &= ~_KEY_MASK;
		key = null;
		_keyBufferIdx = -1;
		_keyBufferLen = -1;
		return this;
	}

	private io.netty.buffer.ByteBuf value = null;
	private int _valueIdx = -1;
	private int _valueLen = -1;
	private static final int _VALUE_FIELD_NUMBER = 2;
	private static final int _VALUE_TAG = (_VALUE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _VALUE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_VALUE_TAG);
	private static final int _VALUE_MASK = 1 << (1 % 32);
	public boolean hasValue() {
		return (_bitField0 & _VALUE_MASK) != 0;
	}
	public int getValueSize() {
		if (!hasValue()) {
			throw new IllegalStateException("Field 'value' is not set");
		}
		return _valueLen;
	}
	public byte[] getValue() {
		io.netty.buffer.ByteBuf _b = getValueSlice();
		byte[] res = new byte[_b.readableBytes()];
		_b.getBytes(0, res);
		return res;
	}
	public io.netty.buffer.ByteBuf getValueSlice() {
		if (!hasValue()) {
			throw new IllegalStateException("Field 'value' is not set");
		}
		if (value == null) {
			return _parsedBuffer.slice(_valueIdx, _valueLen);
		} else {
			return value.slice(0, _valueLen);
		}
	}
	public EncryptionKeys setValue(byte[] value) {
		setValue(io.netty.buffer.Unpooled.wrappedBuffer(value));
		return this;
	}
	public EncryptionKeys setValue(io.netty.buffer.ByteBuf value) {
		this.value = value;
		_bitField0 |= _VALUE_MASK;
		_valueIdx = -1;
		_valueLen = value.readableBytes();
		_cachedSize = -1;
		return this;
	}
	public EncryptionKeys clearValue() {
		_bitField0 &= ~_VALUE_MASK;
		value = null;
		_valueIdx = -1;
		_valueLen = -1;
		return this;
	}

	private java.util.List<KeyValue> metadatas = null;
	private int _metadatasCount = 0;
	private static final int _METADATA_FIELD_NUMBER = 3;
	private static final int _METADATA_TAG = (_METADATA_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _METADATA_TAG_SIZE = LightProtoCodec.computeVarIntSize(_METADATA_TAG);
	public int getMetadatasCount() {
		return _metadatasCount;
	}
	public KeyValue getMetadataAt(int idx) {
		if (idx < 0 || idx >= _metadatasCount) {
			throw new IndexOutOfBoundsException(
					"Index " + idx + " is out of the list size (" + _metadatasCount + ") for field 'metadata'");
		}
		return metadatas.get(idx);
	}
	public java.util.List<KeyValue> getMetadatasList() {
		if (_metadatasCount == 0) {
			return java.util.Collections.emptyList();
		} else {
			return metadatas.subList(0, _metadatasCount);
		}
	}
	public KeyValue addMetadata() {
		if (metadatas == null) {
			metadatas = new java.util.ArrayList<KeyValue>();
		}
		if (metadatas.size() == _metadatasCount) {
			metadatas.add(new KeyValue());
		}
		_cachedSize = -1;
		return metadatas.get(_metadatasCount++);
	}
	public EncryptionKeys addAllMetadatas(Iterable<KeyValue> metadatas) {
		for (KeyValue _o : metadatas) {
			addMetadata().copyFrom(_o);
		}
		return this;
	}
	public EncryptionKeys clearMetadata() {
		for (int i = 0; i < _metadatasCount; i++) {
			metadatas.get(i).clear();
		}
		_metadatasCount = 0;
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
		LightProtoCodec.writeVarInt(_b, _valueLen);
		if (_valueIdx == -1) {
			_b.writeBytes(value);
		} else {
			_parsedBuffer.getBytes(_valueIdx, _b, _valueLen);
		}
		for (int i = 0; i < _metadatasCount; i++) {
			KeyValue _item = metadatas.get(i);
			LightProtoCodec.writeVarInt(_b, _METADATA_TAG);
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
		_size += _KEY_TAG_SIZE;
		_size += LightProtoCodec.computeVarIntSize(_keyBufferLen);
		_size += _keyBufferLen;
		_size += _VALUE_TAG_SIZE;
		_size += LightProtoCodec.computeVarIntSize(_valueLen) + _valueLen;
		for (int i = 0; i < _metadatasCount; i++) {
			KeyValue _item = metadatas.get(i);
			_size += _METADATA_TAG_SIZE;
			int MsgsizeMetadata = _item.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeMetadata) + MsgsizeMetadata;
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
				case _KEY_TAG :
					_bitField0 |= _KEY_MASK;
					_keyBufferLen = LightProtoCodec.readVarInt(_buffer);
					_keyBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_keyBufferLen);
					break;
				case _VALUE_TAG :
					_bitField0 |= _VALUE_MASK;
					_valueLen = LightProtoCodec.readVarInt(_buffer);
					_valueIdx = _buffer.readerIndex();
					_buffer.skipBytes(_valueLen);
					break;
				case _METADATA_TAG :
					int _metadataSize = LightProtoCodec.readVarInt(_buffer);
					addMetadata().parseFrom(_buffer, _metadataSize);
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
	public EncryptionKeys clear() {
		key = null;
		_keyBufferIdx = -1;
		_keyBufferLen = -1;
		value = null;
		_valueIdx = -1;
		_valueLen = -1;
		for (int i = 0; i < _metadatasCount; i++) {
			metadatas.get(i).clear();
		}
		_metadatasCount = 0;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public EncryptionKeys copyFrom(EncryptionKeys _other) {
		_cachedSize = -1;
		if (_other.hasKey()) {
			setKey(_other.getKey());
		}
		if (_other.hasValue()) {
			setValue(_other.getValue());
		}
		for (int i = 0; i < _other.getMetadatasCount(); i++) {
			addMetadata().copyFrom(_other.getMetadataAt(i));
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
