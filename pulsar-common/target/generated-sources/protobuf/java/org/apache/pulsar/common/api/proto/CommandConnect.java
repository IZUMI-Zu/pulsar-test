package org.apache.pulsar.common.api.proto;
public final class CommandConnect {
	private String clientVersion;
	private int _clientVersionBufferIdx = -1;
	private int _clientVersionBufferLen = -1;
	private static final int _CLIENT_VERSION_FIELD_NUMBER = 1;
	private static final int _CLIENT_VERSION_TAG = (_CLIENT_VERSION_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _CLIENT_VERSION_TAG_SIZE = LightProtoCodec.computeVarIntSize(_CLIENT_VERSION_TAG);
	private static final int _CLIENT_VERSION_MASK = 1 << (0 % 32);
	public boolean hasClientVersion() {
		return (_bitField0 & _CLIENT_VERSION_MASK) != 0;
	}
	public String getClientVersion() {
		if (!hasClientVersion()) {
			throw new IllegalStateException("Field 'client_version' is not set");
		}
		if (clientVersion == null) {
			clientVersion = LightProtoCodec.readString(_parsedBuffer, _clientVersionBufferIdx, _clientVersionBufferLen);
		}
		return clientVersion;
	}
	public CommandConnect setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
		_bitField0 |= _CLIENT_VERSION_MASK;
		_clientVersionBufferIdx = -1;
		_clientVersionBufferLen = LightProtoCodec.computeStringUTF8Size(clientVersion);
		_cachedSize = -1;
		return this;
	}
	public CommandConnect clearClientVersion() {
		_bitField0 &= ~_CLIENT_VERSION_MASK;
		clientVersion = null;
		_clientVersionBufferIdx = -1;
		_clientVersionBufferLen = -1;
		return this;
	}

	private AuthMethod authMethod;
	private static final int _AUTH_METHOD_FIELD_NUMBER = 2;
	private static final int _AUTH_METHOD_TAG = (_AUTH_METHOD_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _AUTH_METHOD_TAG_SIZE = LightProtoCodec.computeVarIntSize(_AUTH_METHOD_TAG);
	private static final int _AUTH_METHOD_MASK = 1 << (1 % 32);
	public boolean hasAuthMethod() {
		return (_bitField0 & _AUTH_METHOD_MASK) != 0;
	}
	public AuthMethod getAuthMethod() {
		if (!hasAuthMethod()) {
			throw new IllegalStateException("Field 'auth_method' is not set");
		}
		return authMethod;
	}
	public CommandConnect setAuthMethod(AuthMethod authMethod) {
		this.authMethod = authMethod;
		_bitField0 |= _AUTH_METHOD_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandConnect clearAuthMethod() {
		_bitField0 &= ~_AUTH_METHOD_MASK;
		return this;
	}

	private io.netty.buffer.ByteBuf authData = null;
	private int _authDataIdx = -1;
	private int _authDataLen = -1;
	private static final int _AUTH_DATA_FIELD_NUMBER = 3;
	private static final int _AUTH_DATA_TAG = (_AUTH_DATA_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _AUTH_DATA_TAG_SIZE = LightProtoCodec.computeVarIntSize(_AUTH_DATA_TAG);
	private static final int _AUTH_DATA_MASK = 1 << (2 % 32);
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
	public CommandConnect setAuthData(byte[] authData) {
		setAuthData(io.netty.buffer.Unpooled.wrappedBuffer(authData));
		return this;
	}
	public CommandConnect setAuthData(io.netty.buffer.ByteBuf authData) {
		this.authData = authData;
		_bitField0 |= _AUTH_DATA_MASK;
		_authDataIdx = -1;
		_authDataLen = authData.readableBytes();
		_cachedSize = -1;
		return this;
	}
	public CommandConnect clearAuthData() {
		_bitField0 &= ~_AUTH_DATA_MASK;
		authData = null;
		_authDataIdx = -1;
		_authDataLen = -1;
		return this;
	}

	private int protocolVersion = 0;
	private static final int _PROTOCOL_VERSION_FIELD_NUMBER = 4;
	private static final int _PROTOCOL_VERSION_TAG = (_PROTOCOL_VERSION_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _PROTOCOL_VERSION_TAG_SIZE = LightProtoCodec.computeVarIntSize(_PROTOCOL_VERSION_TAG);
	private static final int _PROTOCOL_VERSION_MASK = 1 << (3 % 32);
	public boolean hasProtocolVersion() {
		return (_bitField0 & _PROTOCOL_VERSION_MASK) != 0;
	}
	public int getProtocolVersion() {
		return protocolVersion;
	}
	public CommandConnect setProtocolVersion(int protocolVersion) {
		this.protocolVersion = protocolVersion;
		_bitField0 |= _PROTOCOL_VERSION_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandConnect clearProtocolVersion() {
		_bitField0 &= ~_PROTOCOL_VERSION_MASK;
		protocolVersion = 0;
		return this;
	}

	private String authMethodName;
	private int _authMethodNameBufferIdx = -1;
	private int _authMethodNameBufferLen = -1;
	private static final int _AUTH_METHOD_NAME_FIELD_NUMBER = 5;
	private static final int _AUTH_METHOD_NAME_TAG = (_AUTH_METHOD_NAME_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _AUTH_METHOD_NAME_TAG_SIZE = LightProtoCodec.computeVarIntSize(_AUTH_METHOD_NAME_TAG);
	private static final int _AUTH_METHOD_NAME_MASK = 1 << (4 % 32);
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
	public CommandConnect setAuthMethodName(String authMethodName) {
		this.authMethodName = authMethodName;
		_bitField0 |= _AUTH_METHOD_NAME_MASK;
		_authMethodNameBufferIdx = -1;
		_authMethodNameBufferLen = LightProtoCodec.computeStringUTF8Size(authMethodName);
		_cachedSize = -1;
		return this;
	}
	public CommandConnect clearAuthMethodName() {
		_bitField0 &= ~_AUTH_METHOD_NAME_MASK;
		authMethodName = null;
		_authMethodNameBufferIdx = -1;
		_authMethodNameBufferLen = -1;
		return this;
	}

	private String proxyToBrokerUrl;
	private int _proxyToBrokerUrlBufferIdx = -1;
	private int _proxyToBrokerUrlBufferLen = -1;
	private static final int _PROXY_TO_BROKER_URL_FIELD_NUMBER = 6;
	private static final int _PROXY_TO_BROKER_URL_TAG = (_PROXY_TO_BROKER_URL_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _PROXY_TO_BROKER_URL_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_PROXY_TO_BROKER_URL_TAG);
	private static final int _PROXY_TO_BROKER_URL_MASK = 1 << (5 % 32);
	public boolean hasProxyToBrokerUrl() {
		return (_bitField0 & _PROXY_TO_BROKER_URL_MASK) != 0;
	}
	public String getProxyToBrokerUrl() {
		if (!hasProxyToBrokerUrl()) {
			throw new IllegalStateException("Field 'proxy_to_broker_url' is not set");
		}
		if (proxyToBrokerUrl == null) {
			proxyToBrokerUrl = LightProtoCodec.readString(_parsedBuffer, _proxyToBrokerUrlBufferIdx,
					_proxyToBrokerUrlBufferLen);
		}
		return proxyToBrokerUrl;
	}
	public CommandConnect setProxyToBrokerUrl(String proxyToBrokerUrl) {
		this.proxyToBrokerUrl = proxyToBrokerUrl;
		_bitField0 |= _PROXY_TO_BROKER_URL_MASK;
		_proxyToBrokerUrlBufferIdx = -1;
		_proxyToBrokerUrlBufferLen = LightProtoCodec.computeStringUTF8Size(proxyToBrokerUrl);
		_cachedSize = -1;
		return this;
	}
	public CommandConnect clearProxyToBrokerUrl() {
		_bitField0 &= ~_PROXY_TO_BROKER_URL_MASK;
		proxyToBrokerUrl = null;
		_proxyToBrokerUrlBufferIdx = -1;
		_proxyToBrokerUrlBufferLen = -1;
		return this;
	}

	private String originalPrincipal;
	private int _originalPrincipalBufferIdx = -1;
	private int _originalPrincipalBufferLen = -1;
	private static final int _ORIGINAL_PRINCIPAL_FIELD_NUMBER = 7;
	private static final int _ORIGINAL_PRINCIPAL_TAG = (_ORIGINAL_PRINCIPAL_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _ORIGINAL_PRINCIPAL_TAG_SIZE = LightProtoCodec.computeVarIntSize(_ORIGINAL_PRINCIPAL_TAG);
	private static final int _ORIGINAL_PRINCIPAL_MASK = 1 << (6 % 32);
	public boolean hasOriginalPrincipal() {
		return (_bitField0 & _ORIGINAL_PRINCIPAL_MASK) != 0;
	}
	public String getOriginalPrincipal() {
		if (!hasOriginalPrincipal()) {
			throw new IllegalStateException("Field 'original_principal' is not set");
		}
		if (originalPrincipal == null) {
			originalPrincipal = LightProtoCodec.readString(_parsedBuffer, _originalPrincipalBufferIdx,
					_originalPrincipalBufferLen);
		}
		return originalPrincipal;
	}
	public CommandConnect setOriginalPrincipal(String originalPrincipal) {
		this.originalPrincipal = originalPrincipal;
		_bitField0 |= _ORIGINAL_PRINCIPAL_MASK;
		_originalPrincipalBufferIdx = -1;
		_originalPrincipalBufferLen = LightProtoCodec.computeStringUTF8Size(originalPrincipal);
		_cachedSize = -1;
		return this;
	}
	public CommandConnect clearOriginalPrincipal() {
		_bitField0 &= ~_ORIGINAL_PRINCIPAL_MASK;
		originalPrincipal = null;
		_originalPrincipalBufferIdx = -1;
		_originalPrincipalBufferLen = -1;
		return this;
	}

	private String originalAuthData;
	private int _originalAuthDataBufferIdx = -1;
	private int _originalAuthDataBufferLen = -1;
	private static final int _ORIGINAL_AUTH_DATA_FIELD_NUMBER = 8;
	private static final int _ORIGINAL_AUTH_DATA_TAG = (_ORIGINAL_AUTH_DATA_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _ORIGINAL_AUTH_DATA_TAG_SIZE = LightProtoCodec.computeVarIntSize(_ORIGINAL_AUTH_DATA_TAG);
	private static final int _ORIGINAL_AUTH_DATA_MASK = 1 << (7 % 32);
	public boolean hasOriginalAuthData() {
		return (_bitField0 & _ORIGINAL_AUTH_DATA_MASK) != 0;
	}
	public String getOriginalAuthData() {
		if (!hasOriginalAuthData()) {
			throw new IllegalStateException("Field 'original_auth_data' is not set");
		}
		if (originalAuthData == null) {
			originalAuthData = LightProtoCodec.readString(_parsedBuffer, _originalAuthDataBufferIdx,
					_originalAuthDataBufferLen);
		}
		return originalAuthData;
	}
	public CommandConnect setOriginalAuthData(String originalAuthData) {
		this.originalAuthData = originalAuthData;
		_bitField0 |= _ORIGINAL_AUTH_DATA_MASK;
		_originalAuthDataBufferIdx = -1;
		_originalAuthDataBufferLen = LightProtoCodec.computeStringUTF8Size(originalAuthData);
		_cachedSize = -1;
		return this;
	}
	public CommandConnect clearOriginalAuthData() {
		_bitField0 &= ~_ORIGINAL_AUTH_DATA_MASK;
		originalAuthData = null;
		_originalAuthDataBufferIdx = -1;
		_originalAuthDataBufferLen = -1;
		return this;
	}

	private String originalAuthMethod;
	private int _originalAuthMethodBufferIdx = -1;
	private int _originalAuthMethodBufferLen = -1;
	private static final int _ORIGINAL_AUTH_METHOD_FIELD_NUMBER = 9;
	private static final int _ORIGINAL_AUTH_METHOD_TAG = (_ORIGINAL_AUTH_METHOD_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _ORIGINAL_AUTH_METHOD_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_ORIGINAL_AUTH_METHOD_TAG);
	private static final int _ORIGINAL_AUTH_METHOD_MASK = 1 << (8 % 32);
	public boolean hasOriginalAuthMethod() {
		return (_bitField0 & _ORIGINAL_AUTH_METHOD_MASK) != 0;
	}
	public String getOriginalAuthMethod() {
		if (!hasOriginalAuthMethod()) {
			throw new IllegalStateException("Field 'original_auth_method' is not set");
		}
		if (originalAuthMethod == null) {
			originalAuthMethod = LightProtoCodec.readString(_parsedBuffer, _originalAuthMethodBufferIdx,
					_originalAuthMethodBufferLen);
		}
		return originalAuthMethod;
	}
	public CommandConnect setOriginalAuthMethod(String originalAuthMethod) {
		this.originalAuthMethod = originalAuthMethod;
		_bitField0 |= _ORIGINAL_AUTH_METHOD_MASK;
		_originalAuthMethodBufferIdx = -1;
		_originalAuthMethodBufferLen = LightProtoCodec.computeStringUTF8Size(originalAuthMethod);
		_cachedSize = -1;
		return this;
	}
	public CommandConnect clearOriginalAuthMethod() {
		_bitField0 &= ~_ORIGINAL_AUTH_METHOD_MASK;
		originalAuthMethod = null;
		_originalAuthMethodBufferIdx = -1;
		_originalAuthMethodBufferLen = -1;
		return this;
	}

	private FeatureFlags featureFlags;
	private static final int _FEATURE_FLAGS_FIELD_NUMBER = 10;
	private static final int _FEATURE_FLAGS_TAG = (_FEATURE_FLAGS_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _FEATURE_FLAGS_TAG_SIZE = LightProtoCodec.computeVarIntSize(_FEATURE_FLAGS_TAG);
	private static final int _FEATURE_FLAGS_MASK = 1 << (9 % 32);
	public boolean hasFeatureFlags() {
		return (_bitField0 & _FEATURE_FLAGS_MASK) != 0;
	}
	public FeatureFlags getFeatureFlags() {
		if (!hasFeatureFlags()) {
			throw new IllegalStateException("Field 'feature_flags' is not set");
		}
		return featureFlags;
	}
	public FeatureFlags setFeatureFlags() {
		if (featureFlags == null) {
			featureFlags = new FeatureFlags();
		}
		_bitField0 |= _FEATURE_FLAGS_MASK;
		_cachedSize = -1;
		return featureFlags;
	}
	public CommandConnect clearFeatureFlags() {
		_bitField0 &= ~_FEATURE_FLAGS_MASK;
		if (hasFeatureFlags()) {
			featureFlags.clear();
		}
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _CLIENT_VERSION_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _CLIENT_VERSION_TAG);
		LightProtoCodec.writeVarInt(_b, _clientVersionBufferLen);
		if (_clientVersionBufferIdx == -1) {
			LightProtoCodec.writeString(_b, clientVersion, _clientVersionBufferLen);
		} else {
			_parsedBuffer.getBytes(_clientVersionBufferIdx, _b, _clientVersionBufferLen);
		}
		if (hasAuthMethod()) {
			LightProtoCodec.writeVarInt(_b, _AUTH_METHOD_TAG);
			LightProtoCodec.writeVarInt(_b, authMethod.getValue());
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
		if (hasProtocolVersion()) {
			LightProtoCodec.writeVarInt(_b, _PROTOCOL_VERSION_TAG);
			LightProtoCodec.writeVarInt(_b, protocolVersion);
		}
		if (hasAuthMethodName()) {
			LightProtoCodec.writeVarInt(_b, _AUTH_METHOD_NAME_TAG);
			LightProtoCodec.writeVarInt(_b, _authMethodNameBufferLen);
			if (_authMethodNameBufferIdx == -1) {
				LightProtoCodec.writeString(_b, authMethodName, _authMethodNameBufferLen);
			} else {
				_parsedBuffer.getBytes(_authMethodNameBufferIdx, _b, _authMethodNameBufferLen);
			}
		}
		if (hasProxyToBrokerUrl()) {
			LightProtoCodec.writeVarInt(_b, _PROXY_TO_BROKER_URL_TAG);
			LightProtoCodec.writeVarInt(_b, _proxyToBrokerUrlBufferLen);
			if (_proxyToBrokerUrlBufferIdx == -1) {
				LightProtoCodec.writeString(_b, proxyToBrokerUrl, _proxyToBrokerUrlBufferLen);
			} else {
				_parsedBuffer.getBytes(_proxyToBrokerUrlBufferIdx, _b, _proxyToBrokerUrlBufferLen);
			}
		}
		if (hasOriginalPrincipal()) {
			LightProtoCodec.writeVarInt(_b, _ORIGINAL_PRINCIPAL_TAG);
			LightProtoCodec.writeVarInt(_b, _originalPrincipalBufferLen);
			if (_originalPrincipalBufferIdx == -1) {
				LightProtoCodec.writeString(_b, originalPrincipal, _originalPrincipalBufferLen);
			} else {
				_parsedBuffer.getBytes(_originalPrincipalBufferIdx, _b, _originalPrincipalBufferLen);
			}
		}
		if (hasOriginalAuthData()) {
			LightProtoCodec.writeVarInt(_b, _ORIGINAL_AUTH_DATA_TAG);
			LightProtoCodec.writeVarInt(_b, _originalAuthDataBufferLen);
			if (_originalAuthDataBufferIdx == -1) {
				LightProtoCodec.writeString(_b, originalAuthData, _originalAuthDataBufferLen);
			} else {
				_parsedBuffer.getBytes(_originalAuthDataBufferIdx, _b, _originalAuthDataBufferLen);
			}
		}
		if (hasOriginalAuthMethod()) {
			LightProtoCodec.writeVarInt(_b, _ORIGINAL_AUTH_METHOD_TAG);
			LightProtoCodec.writeVarInt(_b, _originalAuthMethodBufferLen);
			if (_originalAuthMethodBufferIdx == -1) {
				LightProtoCodec.writeString(_b, originalAuthMethod, _originalAuthMethodBufferLen);
			} else {
				_parsedBuffer.getBytes(_originalAuthMethodBufferIdx, _b, _originalAuthMethodBufferLen);
			}
		}
		if (hasFeatureFlags()) {
			LightProtoCodec.writeVarInt(_b, _FEATURE_FLAGS_TAG);
			LightProtoCodec.writeVarInt(_b, featureFlags.getSerializedSize());
			featureFlags.writeTo(_b);
		}
		return (_b.writerIndex() - _writeIdx);
	}
	public int getSerializedSize() {
		if (_cachedSize > -1) {
			return _cachedSize;
		}

		int _size = 0;
		_size += _CLIENT_VERSION_TAG_SIZE;
		_size += LightProtoCodec.computeVarIntSize(_clientVersionBufferLen);
		_size += _clientVersionBufferLen;
		if (hasAuthMethod()) {
			_size += _AUTH_METHOD_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(authMethod.getValue());
		}
		if (hasAuthData()) {
			_size += _AUTH_DATA_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_authDataLen) + _authDataLen;
		}
		if (hasProtocolVersion()) {
			_size += _PROTOCOL_VERSION_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(protocolVersion);
		}
		if (hasAuthMethodName()) {
			_size += _AUTH_METHOD_NAME_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_authMethodNameBufferLen);
			_size += _authMethodNameBufferLen;
		}
		if (hasProxyToBrokerUrl()) {
			_size += _PROXY_TO_BROKER_URL_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_proxyToBrokerUrlBufferLen);
			_size += _proxyToBrokerUrlBufferLen;
		}
		if (hasOriginalPrincipal()) {
			_size += _ORIGINAL_PRINCIPAL_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_originalPrincipalBufferLen);
			_size += _originalPrincipalBufferLen;
		}
		if (hasOriginalAuthData()) {
			_size += _ORIGINAL_AUTH_DATA_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_originalAuthDataBufferLen);
			_size += _originalAuthDataBufferLen;
		}
		if (hasOriginalAuthMethod()) {
			_size += _ORIGINAL_AUTH_METHOD_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_originalAuthMethodBufferLen);
			_size += _originalAuthMethodBufferLen;
		}
		if (hasFeatureFlags()) {
			_size += LightProtoCodec.computeVarIntSize(_FEATURE_FLAGS_TAG);
			int MsgsizeFeatureFlags = featureFlags.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeFeatureFlags) + MsgsizeFeatureFlags;
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
				case _CLIENT_VERSION_TAG :
					_bitField0 |= _CLIENT_VERSION_MASK;
					_clientVersionBufferLen = LightProtoCodec.readVarInt(_buffer);
					_clientVersionBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_clientVersionBufferLen);
					break;
				case _AUTH_METHOD_TAG :
					AuthMethod _authMethod = AuthMethod.valueOf(LightProtoCodec.readVarInt(_buffer));
					if (_authMethod != null) {
						_bitField0 |= _AUTH_METHOD_MASK;
						authMethod = _authMethod;
					}
					break;
				case _AUTH_DATA_TAG :
					_bitField0 |= _AUTH_DATA_MASK;
					_authDataLen = LightProtoCodec.readVarInt(_buffer);
					_authDataIdx = _buffer.readerIndex();
					_buffer.skipBytes(_authDataLen);
					break;
				case _PROTOCOL_VERSION_TAG :
					_bitField0 |= _PROTOCOL_VERSION_MASK;
					protocolVersion = LightProtoCodec.readVarInt(_buffer);
					break;
				case _AUTH_METHOD_NAME_TAG :
					_bitField0 |= _AUTH_METHOD_NAME_MASK;
					_authMethodNameBufferLen = LightProtoCodec.readVarInt(_buffer);
					_authMethodNameBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_authMethodNameBufferLen);
					break;
				case _PROXY_TO_BROKER_URL_TAG :
					_bitField0 |= _PROXY_TO_BROKER_URL_MASK;
					_proxyToBrokerUrlBufferLen = LightProtoCodec.readVarInt(_buffer);
					_proxyToBrokerUrlBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_proxyToBrokerUrlBufferLen);
					break;
				case _ORIGINAL_PRINCIPAL_TAG :
					_bitField0 |= _ORIGINAL_PRINCIPAL_MASK;
					_originalPrincipalBufferLen = LightProtoCodec.readVarInt(_buffer);
					_originalPrincipalBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_originalPrincipalBufferLen);
					break;
				case _ORIGINAL_AUTH_DATA_TAG :
					_bitField0 |= _ORIGINAL_AUTH_DATA_MASK;
					_originalAuthDataBufferLen = LightProtoCodec.readVarInt(_buffer);
					_originalAuthDataBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_originalAuthDataBufferLen);
					break;
				case _ORIGINAL_AUTH_METHOD_TAG :
					_bitField0 |= _ORIGINAL_AUTH_METHOD_MASK;
					_originalAuthMethodBufferLen = LightProtoCodec.readVarInt(_buffer);
					_originalAuthMethodBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_originalAuthMethodBufferLen);
					break;
				case _FEATURE_FLAGS_TAG :
					_bitField0 |= _FEATURE_FLAGS_MASK;
					int featureFlagsSize = LightProtoCodec.readVarInt(_buffer);
					setFeatureFlags().parseFrom(_buffer, featureFlagsSize);
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
	public CommandConnect clear() {
		clientVersion = null;
		_clientVersionBufferIdx = -1;
		_clientVersionBufferLen = -1;
		authData = null;
		_authDataIdx = -1;
		_authDataLen = -1;
		protocolVersion = 0;
		authMethodName = null;
		_authMethodNameBufferIdx = -1;
		_authMethodNameBufferLen = -1;
		proxyToBrokerUrl = null;
		_proxyToBrokerUrlBufferIdx = -1;
		_proxyToBrokerUrlBufferLen = -1;
		originalPrincipal = null;
		_originalPrincipalBufferIdx = -1;
		_originalPrincipalBufferLen = -1;
		originalAuthData = null;
		_originalAuthDataBufferIdx = -1;
		_originalAuthDataBufferLen = -1;
		originalAuthMethod = null;
		_originalAuthMethodBufferIdx = -1;
		_originalAuthMethodBufferLen = -1;
		if (hasFeatureFlags()) {
			featureFlags.clear();
		}
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public CommandConnect copyFrom(CommandConnect _other) {
		_cachedSize = -1;
		if (_other.hasClientVersion()) {
			setClientVersion(_other.getClientVersion());
		}
		if (_other.hasAuthMethod()) {
			setAuthMethod(_other.authMethod);
		}
		if (_other.hasAuthData()) {
			setAuthData(_other.getAuthData());
		}
		if (_other.hasProtocolVersion()) {
			setProtocolVersion(_other.protocolVersion);
		}
		if (_other.hasAuthMethodName()) {
			setAuthMethodName(_other.getAuthMethodName());
		}
		if (_other.hasProxyToBrokerUrl()) {
			setProxyToBrokerUrl(_other.getProxyToBrokerUrl());
		}
		if (_other.hasOriginalPrincipal()) {
			setOriginalPrincipal(_other.getOriginalPrincipal());
		}
		if (_other.hasOriginalAuthData()) {
			setOriginalAuthData(_other.getOriginalAuthData());
		}
		if (_other.hasOriginalAuthMethod()) {
			setOriginalAuthMethod(_other.getOriginalAuthMethod());
		}
		if (_other.hasFeatureFlags()) {
			setFeatureFlags().copyFrom(_other.featureFlags);
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
