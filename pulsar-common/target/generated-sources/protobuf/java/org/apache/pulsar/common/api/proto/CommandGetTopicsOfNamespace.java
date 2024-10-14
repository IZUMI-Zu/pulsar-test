package org.apache.pulsar.common.api.proto;
public final class CommandGetTopicsOfNamespace {
	public enum Mode {
		PERSISTENT(0), NON_PERSISTENT(1), ALL(2),;
		private final int value;
		private Mode(int value) {
			this.value = value;
		}
		public int getValue() {
			return value;
		}
		public static Mode valueOf(int n) {
			switch (n) {
				case 0 :
					return PERSISTENT;
				case 1 :
					return NON_PERSISTENT;
				case 2 :
					return ALL;
				default :
					return null;

			}
		}
		public static final int PERSISTENT_VALUE = 0;
		public static final int NON_PERSISTENT_VALUE = 1;
		public static final int ALL_VALUE = 2;
	}

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
	public CommandGetTopicsOfNamespace setRequestId(long requestId) {
		this.requestId = requestId;
		_bitField0 |= _REQUEST_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandGetTopicsOfNamespace clearRequestId() {
		_bitField0 &= ~_REQUEST_ID_MASK;
		return this;
	}

	private String namespace;
	private int _namespaceBufferIdx = -1;
	private int _namespaceBufferLen = -1;
	private static final int _NAMESPACE_FIELD_NUMBER = 2;
	private static final int _NAMESPACE_TAG = (_NAMESPACE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _NAMESPACE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_NAMESPACE_TAG);
	private static final int _NAMESPACE_MASK = 1 << (1 % 32);
	public boolean hasNamespace() {
		return (_bitField0 & _NAMESPACE_MASK) != 0;
	}
	public String getNamespace() {
		if (!hasNamespace()) {
			throw new IllegalStateException("Field 'namespace' is not set");
		}
		if (namespace == null) {
			namespace = LightProtoCodec.readString(_parsedBuffer, _namespaceBufferIdx, _namespaceBufferLen);
		}
		return namespace;
	}
	public CommandGetTopicsOfNamespace setNamespace(String namespace) {
		this.namespace = namespace;
		_bitField0 |= _NAMESPACE_MASK;
		_namespaceBufferIdx = -1;
		_namespaceBufferLen = LightProtoCodec.computeStringUTF8Size(namespace);
		_cachedSize = -1;
		return this;
	}
	public CommandGetTopicsOfNamespace clearNamespace() {
		_bitField0 &= ~_NAMESPACE_MASK;
		namespace = null;
		_namespaceBufferIdx = -1;
		_namespaceBufferLen = -1;
		return this;
	}

	private Mode mode = Mode.PERSISTENT;
	private static final int _MODE_FIELD_NUMBER = 3;
	private static final int _MODE_TAG = (_MODE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _MODE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_MODE_TAG);
	private static final int _MODE_MASK = 1 << (2 % 32);
	public boolean hasMode() {
		return (_bitField0 & _MODE_MASK) != 0;
	}
	public Mode getMode() {
		return mode;
	}
	public CommandGetTopicsOfNamespace setMode(Mode mode) {
		this.mode = mode;
		_bitField0 |= _MODE_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandGetTopicsOfNamespace clearMode() {
		_bitField0 &= ~_MODE_MASK;
		mode = Mode.PERSISTENT;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _REQUEST_ID_MASK | _NAMESPACE_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _REQUEST_ID_TAG);
		LightProtoCodec.writeVarInt64(_b, requestId);
		LightProtoCodec.writeVarInt(_b, _NAMESPACE_TAG);
		LightProtoCodec.writeVarInt(_b, _namespaceBufferLen);
		if (_namespaceBufferIdx == -1) {
			LightProtoCodec.writeString(_b, namespace, _namespaceBufferLen);
		} else {
			_parsedBuffer.getBytes(_namespaceBufferIdx, _b, _namespaceBufferLen);
		}
		if (hasMode()) {
			LightProtoCodec.writeVarInt(_b, _MODE_TAG);
			LightProtoCodec.writeVarInt(_b, mode.getValue());
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
		_size += _NAMESPACE_TAG_SIZE;
		_size += LightProtoCodec.computeVarIntSize(_namespaceBufferLen);
		_size += _namespaceBufferLen;
		if (hasMode()) {
			_size += _MODE_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(mode.getValue());
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
				case _NAMESPACE_TAG :
					_bitField0 |= _NAMESPACE_MASK;
					_namespaceBufferLen = LightProtoCodec.readVarInt(_buffer);
					_namespaceBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_namespaceBufferLen);
					break;
				case _MODE_TAG :
					Mode _mode = Mode.valueOf(LightProtoCodec.readVarInt(_buffer));
					if (_mode != null) {
						_bitField0 |= _MODE_MASK;
						mode = _mode;
					}
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
	public CommandGetTopicsOfNamespace clear() {
		namespace = null;
		_namespaceBufferIdx = -1;
		_namespaceBufferLen = -1;
		mode = Mode.PERSISTENT;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public CommandGetTopicsOfNamespace copyFrom(CommandGetTopicsOfNamespace _other) {
		_cachedSize = -1;
		if (_other.hasRequestId()) {
			setRequestId(_other.requestId);
		}
		if (_other.hasNamespace()) {
			setNamespace(_other.getNamespace());
		}
		if (_other.hasMode()) {
			setMode(_other.mode);
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
