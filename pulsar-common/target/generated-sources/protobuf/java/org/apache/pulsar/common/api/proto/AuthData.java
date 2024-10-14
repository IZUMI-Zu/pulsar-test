package org.apache.pulsar.common.api.proto;
public final class AuthData {
	private String authMethodName;
	private int _authMethodNameBufferIdx = -1;
	private int _authMethodNameBufferLen = -1;
	private static final int _AUTH_METHOD_NAME_FIELD_NUMBER = 1;
	private static final int _AUTH_METHOD_NAME_TAG = (_AUTH_METHOD_NAME_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _AUTH_METHOD_NAME_TAG_SIZE = LightProtoCodec.computeVarIntSize(_AUTH_METHOD_NAME_TAG);
	private static final int _AUTH_METHOD_NAME_MASK = 1 << (0 % 32);
	public boolean hasAuthMethodName() {
		return (_bitField0 & _AUTH_METHOD_NAME_MASK) != 0;
	}
	public String getAuthMethodName() {
		if (!hasAuthMethodName()) {
			throw new IllegalStateException("Field 'auth_method_name' is not set");
		}
		if (authMethodName == null) {
			authMethodName = LightProtoCodec.readString(_parsedBuffer, _authMethodNameBufferIdx,
					_authMethodNameBufferLen);
		}
		return authMethodName;
	}
	public AuthData setAuthMethodName(String authMethodName) {
		this.authMethodName = authMethodName;
		_bitField0 |= _AUTH_METHOD_NAME_MASK;
		_authMethodNameBufferIdx = -1;
		_authMethodNameBufferLen = LightProtoCodec.computeStringUTF8Size(authMethodName);
		_cachedSize = -1;
		return this;
	}
	public AuthData clearAuthMethodName() {
		_bitField0 &= ~_AUTH_METHOD_NAME_MASK;
		authMethodName = null;
		_authMethodNameBufferIdx = -1;
		_authMethodNameBufferLen = -1;
		return this;
	}

	private io.netty.buffer.ByteBuf authData = null;
	private int _authDataIdx = -1;
	private int _authDataLen = -1;
	private static final int _AUTH_DATA_FIELD_NUMBER = 2;
	private static final int _AUTH_DATA_TAG = (_AUTH_DATA_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _AUTH_DATA_TAG_SIZE = LightProtoCodec.computeVarIntSize(_AUTH_DATA_TAG);
	private static final int _AUTH_DATA_MASK = 1 << (1 % 32);
	public boolean hasAuthData() {
		return (_bitField0 & _AUTH_DATA_MASK) != 0;
	}
	public int getAuthDataSize() {
		if (!hasAuthData()) {
			throw new IllegalStateException("Field 'auth_data' is not set");
		}
		return _authDataLen;
	}
	public byte[] getAuthData() {
		io.netty.buffer.ByteBuf _b = getAuthDataSlice();
		byte[] res = new byte[_b.readableBytes()];
		_b.getBytes(0, res);
		return res;
	}
	public io.netty.buffer.ByteBuf getAuthDataSlice() {
		if (!hasAuthData()) {
			throw new IllegalStateException("Field 'auth_data' is not set");
		}
		if (authData == null) {
			return _parsedBuffer.slice(_authDataIdx, _authDataLen);
		} else {
			return authData.slice(0, _authDataLen);
		}
	}
	public AuthData setAuthData(byte[] authData) {
		setAuthData(io.netty.buffer.Unpooled.wrappedBuffer(authData));
		return this;
	}
	public AuthData setAuthData(io.netty.buffer.ByteBuf authData) {
		this.authData = authData;
		_bitField0 |= _AUTH_DATA_MASK;
		_authDataIdx = -1;
		_authDataLen = authData.readableBytes();
		_cachedSize = -1;
		return this;
	}
	public AuthData clearAuthData() {
		_bitField0 &= ~_AUTH_DATA_MASK;
		authData = null;
		_authDataIdx = -1;
		_authDataLen = -1;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		int _writeIdx = _b.writerIndex();
		if (hasAuthMethodName()) {
			LightProtoCodec.writeVarInt(_b, _AUTH_METHOD_NAME_TAG);
			LightProtoCodec.writeVarInt(_b, _authMethodNameBufferLen);
			if (_authMethodNameBufferIdx == -1) {
				LightProtoCodec.writeString(_b, authMethodName, _authMethodNameBufferLen);
			} else {
				_parsedBuffer.getBytes(_authMethodNameBufferIdx, _b, _authMethodNameBufferLen);
			}
		}
		if (hasAuthData()) {
			LightProtoCodec.writeVarInt(_b, _AUTH_DATA_TAG);
			LightProtoCodec.writeVarInt(_b, _authDataLen);
			if (_authDataIdx == -1) {
				_b.writeBytes(authData);
			} else {
				_parsedBuffer.getBytes(_authDataIdx, _b, _authDataLen);
			}
		}
		return (_b.writerIndex() - _writeIdx);
	}
	public int getSerializedSize() {
		if (_cachedSize > -1) {
			return _cachedSize;
		}

		int _size = 0;
		if (hasAuthMethodName()) {
			_size += _AUTH_METHOD_NAME_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_authMethodNameBufferLen);
			_size += _authMethodNameBufferLen;
		}
		if (hasAuthData()) {
			_size += _AUTH_DATA_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_authDataLen) + _authDataLen;
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
				case _AUTH_METHOD_NAME_TAG :
					_bitField0 |= _AUTH_METHOD_NAME_MASK;
					_authMethodNameBufferLen = LightProtoCodec.readVarInt(_buffer);
					_authMethodNameBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_authMethodNameBufferLen);
					break;
				case _AUTH_DATA_TAG :
					_bitField0 |= _AUTH_DATA_MASK;
					_authDataLen = LightProtoCodec.readVarInt(_buffer);
					_authDataIdx = _buffer.readerIndex();
					_buffer.skipBytes(_authDataLen);
					break;
				default :
					LightProtoCodec.skipUnknownField(_tag, _buffer);
			}
		}
		_parsedBuffer = _buffer;
	}
	public AuthData clear() {
		authMethodName = null;
		_authMethodNameBufferIdx = -1;
		_authMethodNameBufferLen = -1;
		authData = null;
		_authDataIdx = -1;
		_authDataLen = -1;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public AuthData copyFrom(AuthData _other) {
		_cachedSize = -1;
		if (_other.hasAuthMethodName()) {
			setAuthMethodName(_other.getAuthMethodName());
		}
		if (_other.hasAuthData()) {
			setAuthData(_other.getAuthData());
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
