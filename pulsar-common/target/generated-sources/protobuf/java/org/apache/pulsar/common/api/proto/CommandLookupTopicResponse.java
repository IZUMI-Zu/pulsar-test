package org.apache.pulsar.common.api.proto;
public final class CommandLookupTopicResponse {
	public enum LookupType {
		Redirect(0), Connect(1), Failed(2),;
		private final int value;
		private LookupType(int value) {
			this.value = value;
		}
		public int getValue() {
			return value;
		}
		public static LookupType valueOf(int n) {
			switch (n) {
				case 0 :
					return Redirect;
				case 1 :
					return Connect;
				case 2 :
					return Failed;
				default :
					return null;

			}
		}
		public static final int Redirect_VALUE = 0;
		public static final int Connect_VALUE = 1;
		public static final int Failed_VALUE = 2;
	}

	private String brokerServiceUrl;
	private int _brokerServiceUrlBufferIdx = -1;
	private int _brokerServiceUrlBufferLen = -1;
	private static final int _BROKER_SERVICE_URL_FIELD_NUMBER = 1;
	private static final int _BROKER_SERVICE_URL_TAG = (_BROKER_SERVICE_URL_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _BROKER_SERVICE_URL_TAG_SIZE = LightProtoCodec.computeVarIntSize(_BROKER_SERVICE_URL_TAG);
	private static final int _BROKER_SERVICE_URL_MASK = 1 << (0 % 32);
	public boolean hasBrokerServiceUrl() {
		return (_bitField0 & _BROKER_SERVICE_URL_MASK) != 0;
	}
	public String getBrokerServiceUrl() {
		if (!hasBrokerServiceUrl()) {
			throw new IllegalStateException("Field 'brokerServiceUrl' is not set");
		}
		if (brokerServiceUrl == null) {
			brokerServiceUrl = LightProtoCodec.readString(_parsedBuffer, _brokerServiceUrlBufferIdx,
					_brokerServiceUrlBufferLen);
		}
		return brokerServiceUrl;
	}
	public CommandLookupTopicResponse setBrokerServiceUrl(String brokerServiceUrl) {
		this.brokerServiceUrl = brokerServiceUrl;
		_bitField0 |= _BROKER_SERVICE_URL_MASK;
		_brokerServiceUrlBufferIdx = -1;
		_brokerServiceUrlBufferLen = LightProtoCodec.computeStringUTF8Size(brokerServiceUrl);
		_cachedSize = -1;
		return this;
	}
	public CommandLookupTopicResponse clearBrokerServiceUrl() {
		_bitField0 &= ~_BROKER_SERVICE_URL_MASK;
		brokerServiceUrl = null;
		_brokerServiceUrlBufferIdx = -1;
		_brokerServiceUrlBufferLen = -1;
		return this;
	}

	private String brokerServiceUrlTls;
	private int _brokerServiceUrlTlsBufferIdx = -1;
	private int _brokerServiceUrlTlsBufferLen = -1;
	private static final int _BROKER_SERVICE_URL_TLS_FIELD_NUMBER = 2;
	private static final int _BROKER_SERVICE_URL_TLS_TAG = (_BROKER_SERVICE_URL_TLS_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _BROKER_SERVICE_URL_TLS_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_BROKER_SERVICE_URL_TLS_TAG);
	private static final int _BROKER_SERVICE_URL_TLS_MASK = 1 << (1 % 32);
	public boolean hasBrokerServiceUrlTls() {
		return (_bitField0 & _BROKER_SERVICE_URL_TLS_MASK) != 0;
	}
	public String getBrokerServiceUrlTls() {
		if (!hasBrokerServiceUrlTls()) {
			throw new IllegalStateException("Field 'brokerServiceUrlTls' is not set");
		}
		if (brokerServiceUrlTls == null) {
			brokerServiceUrlTls = LightProtoCodec.readString(_parsedBuffer, _brokerServiceUrlTlsBufferIdx,
					_brokerServiceUrlTlsBufferLen);
		}
		return brokerServiceUrlTls;
	}
	public CommandLookupTopicResponse setBrokerServiceUrlTls(String brokerServiceUrlTls) {
		this.brokerServiceUrlTls = brokerServiceUrlTls;
		_bitField0 |= _BROKER_SERVICE_URL_TLS_MASK;
		_brokerServiceUrlTlsBufferIdx = -1;
		_brokerServiceUrlTlsBufferLen = LightProtoCodec.computeStringUTF8Size(brokerServiceUrlTls);
		_cachedSize = -1;
		return this;
	}
	public CommandLookupTopicResponse clearBrokerServiceUrlTls() {
		_bitField0 &= ~_BROKER_SERVICE_URL_TLS_MASK;
		brokerServiceUrlTls = null;
		_brokerServiceUrlTlsBufferIdx = -1;
		_brokerServiceUrlTlsBufferLen = -1;
		return this;
	}

	private LookupType response;
	private static final int _RESPONSE_FIELD_NUMBER = 3;
	private static final int _RESPONSE_TAG = (_RESPONSE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _RESPONSE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_RESPONSE_TAG);
	private static final int _RESPONSE_MASK = 1 << (2 % 32);
	public boolean hasResponse() {
		return (_bitField0 & _RESPONSE_MASK) != 0;
	}
	public LookupType getResponse() {
		if (!hasResponse()) {
			throw new IllegalStateException("Field 'response' is not set");
		}
		return response;
	}
	public CommandLookupTopicResponse setResponse(LookupType response) {
		this.response = response;
		_bitField0 |= _RESPONSE_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandLookupTopicResponse clearResponse() {
		_bitField0 &= ~_RESPONSE_MASK;
		return this;
	}

	private long requestId;
	private static final int _REQUEST_ID_FIELD_NUMBER = 4;
	private static final int _REQUEST_ID_TAG = (_REQUEST_ID_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _REQUEST_ID_TAG_SIZE = LightProtoCodec.computeVarIntSize(_REQUEST_ID_TAG);
	private static final int _REQUEST_ID_MASK = 1 << (3 % 32);
	public boolean hasRequestId() {
		return (_bitField0 & _REQUEST_ID_MASK) != 0;
	}
	public long getRequestId() {
		if (!hasRequestId()) {
			throw new IllegalStateException("Field 'request_id' is not set");
		}
		return requestId;
	}
	public CommandLookupTopicResponse setRequestId(long requestId) {
		this.requestId = requestId;
		_bitField0 |= _REQUEST_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandLookupTopicResponse clearRequestId() {
		_bitField0 &= ~_REQUEST_ID_MASK;
		return this;
	}

	private boolean authoritative = false;
	private static final int _AUTHORITATIVE_FIELD_NUMBER = 5;
	private static final int _AUTHORITATIVE_TAG = (_AUTHORITATIVE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _AUTHORITATIVE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_AUTHORITATIVE_TAG);
	private static final int _AUTHORITATIVE_MASK = 1 << (4 % 32);
	public boolean hasAuthoritative() {
		return (_bitField0 & _AUTHORITATIVE_MASK) != 0;
	}
	public boolean isAuthoritative() {
		return authoritative;
	}
	public CommandLookupTopicResponse setAuthoritative(boolean authoritative) {
		this.authoritative = authoritative;
		_bitField0 |= _AUTHORITATIVE_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandLookupTopicResponse clearAuthoritative() {
		_bitField0 &= ~_AUTHORITATIVE_MASK;
		authoritative = false;
		return this;
	}

	private ServerError error;
	private static final int _ERROR_FIELD_NUMBER = 6;
	private static final int _ERROR_TAG = (_ERROR_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _ERROR_TAG_SIZE = LightProtoCodec.computeVarIntSize(_ERROR_TAG);
	private static final int _ERROR_MASK = 1 << (5 % 32);
	public boolean hasError() {
		return (_bitField0 & _ERROR_MASK) != 0;
	}
	public ServerError getError() {
		if (!hasError()) {
			throw new IllegalStateException("Field 'error' is not set");
		}
		return error;
	}
	public CommandLookupTopicResponse setError(ServerError error) {
		this.error = error;
		_bitField0 |= _ERROR_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandLookupTopicResponse clearError() {
		_bitField0 &= ~_ERROR_MASK;
		return this;
	}

	private String message;
	private int _messageBufferIdx = -1;
	private int _messageBufferLen = -1;
	private static final int _MESSAGE_FIELD_NUMBER = 7;
	private static final int _MESSAGE_TAG = (_MESSAGE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _MESSAGE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_MESSAGE_TAG);
	private static final int _MESSAGE_MASK = 1 << (6 % 32);
	public boolean hasMessage() {
		return (_bitField0 & _MESSAGE_MASK) != 0;
	}
	public String getMessage() {
		if (!hasMessage()) {
			throw new IllegalStateException("Field 'message' is not set");
		}
		if (message == null) {
			message = LightProtoCodec.readString(_parsedBuffer, _messageBufferIdx, _messageBufferLen);
		}
		return message;
	}
	public CommandLookupTopicResponse setMessage(String message) {
		this.message = message;
		_bitField0 |= _MESSAGE_MASK;
		_messageBufferIdx = -1;
		_messageBufferLen = LightProtoCodec.computeStringUTF8Size(message);
		_cachedSize = -1;
		return this;
	}
	public CommandLookupTopicResponse clearMessage() {
		_bitField0 &= ~_MESSAGE_MASK;
		message = null;
		_messageBufferIdx = -1;
		_messageBufferLen = -1;
		return this;
	}

	private boolean proxyThroughServiceUrl = false;
	private static final int _PROXY_THROUGH_SERVICE_URL_FIELD_NUMBER = 8;
	private static final int _PROXY_THROUGH_SERVICE_URL_TAG = (_PROXY_THROUGH_SERVICE_URL_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _PROXY_THROUGH_SERVICE_URL_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_PROXY_THROUGH_SERVICE_URL_TAG);
	private static final int _PROXY_THROUGH_SERVICE_URL_MASK = 1 << (7 % 32);
	public boolean hasProxyThroughServiceUrl() {
		return (_bitField0 & _PROXY_THROUGH_SERVICE_URL_MASK) != 0;
	}
	public boolean isProxyThroughServiceUrl() {
		return proxyThroughServiceUrl;
	}
	public CommandLookupTopicResponse setProxyThroughServiceUrl(boolean proxyThroughServiceUrl) {
		this.proxyThroughServiceUrl = proxyThroughServiceUrl;
		_bitField0 |= _PROXY_THROUGH_SERVICE_URL_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandLookupTopicResponse clearProxyThroughServiceUrl() {
		_bitField0 &= ~_PROXY_THROUGH_SERVICE_URL_MASK;
		proxyThroughServiceUrl = false;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _REQUEST_ID_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		if (hasBrokerServiceUrl()) {
			LightProtoCodec.writeVarInt(_b, _BROKER_SERVICE_URL_TAG);
			LightProtoCodec.writeVarInt(_b, _brokerServiceUrlBufferLen);
			if (_brokerServiceUrlBufferIdx == -1) {
				LightProtoCodec.writeString(_b, brokerServiceUrl, _brokerServiceUrlBufferLen);
			} else {
				_parsedBuffer.getBytes(_brokerServiceUrlBufferIdx, _b, _brokerServiceUrlBufferLen);
			}
		}
		if (hasBrokerServiceUrlTls()) {
			LightProtoCodec.writeVarInt(_b, _BROKER_SERVICE_URL_TLS_TAG);
			LightProtoCodec.writeVarInt(_b, _brokerServiceUrlTlsBufferLen);
			if (_brokerServiceUrlTlsBufferIdx == -1) {
				LightProtoCodec.writeString(_b, brokerServiceUrlTls, _brokerServiceUrlTlsBufferLen);
			} else {
				_parsedBuffer.getBytes(_brokerServiceUrlTlsBufferIdx, _b, _brokerServiceUrlTlsBufferLen);
			}
		}
		if (hasResponse()) {
			LightProtoCodec.writeVarInt(_b, _RESPONSE_TAG);
			LightProtoCodec.writeVarInt(_b, response.getValue());
		}
		LightProtoCodec.writeVarInt(_b, _REQUEST_ID_TAG);
		LightProtoCodec.writeVarInt64(_b, requestId);
		if (hasAuthoritative()) {
			LightProtoCodec.writeVarInt(_b, _AUTHORITATIVE_TAG);
			_b.writeBoolean(authoritative);
		}
		if (hasError()) {
			LightProtoCodec.writeVarInt(_b, _ERROR_TAG);
			LightProtoCodec.writeVarInt(_b, error.getValue());
		}
		if (hasMessage()) {
			LightProtoCodec.writeVarInt(_b, _MESSAGE_TAG);
			LightProtoCodec.writeVarInt(_b, _messageBufferLen);
			if (_messageBufferIdx == -1) {
				LightProtoCodec.writeString(_b, message, _messageBufferLen);
			} else {
				_parsedBuffer.getBytes(_messageBufferIdx, _b, _messageBufferLen);
			}
		}
		if (hasProxyThroughServiceUrl()) {
			LightProtoCodec.writeVarInt(_b, _PROXY_THROUGH_SERVICE_URL_TAG);
			_b.writeBoolean(proxyThroughServiceUrl);
		}
		return (_b.writerIndex() - _writeIdx);
	}
	public int getSerializedSize() {
		if (_cachedSize > -1) {
			return _cachedSize;
		}

		int _size = 0;
		if (hasBrokerServiceUrl()) {
			_size += _BROKER_SERVICE_URL_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_brokerServiceUrlBufferLen);
			_size += _brokerServiceUrlBufferLen;
		}
		if (hasBrokerServiceUrlTls()) {
			_size += _BROKER_SERVICE_URL_TLS_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_brokerServiceUrlTlsBufferLen);
			_size += _brokerServiceUrlTlsBufferLen;
		}
		if (hasResponse()) {
			_size += _RESPONSE_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(response.getValue());
		}
		_size += _REQUEST_ID_TAG_SIZE;
		_size += LightProtoCodec.computeVarInt64Size(requestId);
		if (hasAuthoritative()) {
			_size += _AUTHORITATIVE_TAG_SIZE;
			_size += 1;
		}
		if (hasError()) {
			_size += _ERROR_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(error.getValue());
		}
		if (hasMessage()) {
			_size += _MESSAGE_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_messageBufferLen);
			_size += _messageBufferLen;
		}
		if (hasProxyThroughServiceUrl()) {
			_size += _PROXY_THROUGH_SERVICE_URL_TAG_SIZE;
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
				case _BROKER_SERVICE_URL_TAG :
					_bitField0 |= _BROKER_SERVICE_URL_MASK;
					_brokerServiceUrlBufferLen = LightProtoCodec.readVarInt(_buffer);
					_brokerServiceUrlBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_brokerServiceUrlBufferLen);
					break;
				case _BROKER_SERVICE_URL_TLS_TAG :
					_bitField0 |= _BROKER_SERVICE_URL_TLS_MASK;
					_brokerServiceUrlTlsBufferLen = LightProtoCodec.readVarInt(_buffer);
					_brokerServiceUrlTlsBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_brokerServiceUrlTlsBufferLen);
					break;
				case _RESPONSE_TAG :
					LookupType _response = LookupType.valueOf(LightProtoCodec.readVarInt(_buffer));
					if (_response != null) {
						_bitField0 |= _RESPONSE_MASK;
						response = _response;
					}
					break;
				case _REQUEST_ID_TAG :
					_bitField0 |= _REQUEST_ID_MASK;
					requestId = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _AUTHORITATIVE_TAG :
					_bitField0 |= _AUTHORITATIVE_MASK;
					authoritative = LightProtoCodec.readVarInt(_buffer) == 1;
					break;
				case _ERROR_TAG :
					ServerError _error = ServerError.valueOf(LightProtoCodec.readVarInt(_buffer));
					if (_error != null) {
						_bitField0 |= _ERROR_MASK;
						error = _error;
					}
					break;
				case _MESSAGE_TAG :
					_bitField0 |= _MESSAGE_MASK;
					_messageBufferLen = LightProtoCodec.readVarInt(_buffer);
					_messageBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_messageBufferLen);
					break;
				case _PROXY_THROUGH_SERVICE_URL_TAG :
					_bitField0 |= _PROXY_THROUGH_SERVICE_URL_MASK;
					proxyThroughServiceUrl = LightProtoCodec.readVarInt(_buffer) == 1;
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
	public CommandLookupTopicResponse clear() {
		brokerServiceUrl = null;
		_brokerServiceUrlBufferIdx = -1;
		_brokerServiceUrlBufferLen = -1;
		brokerServiceUrlTls = null;
		_brokerServiceUrlTlsBufferIdx = -1;
		_brokerServiceUrlTlsBufferLen = -1;
		authoritative = false;
		message = null;
		_messageBufferIdx = -1;
		_messageBufferLen = -1;
		proxyThroughServiceUrl = false;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public CommandLookupTopicResponse copyFrom(CommandLookupTopicResponse _other) {
		_cachedSize = -1;
		if (_other.hasBrokerServiceUrl()) {
			setBrokerServiceUrl(_other.getBrokerServiceUrl());
		}
		if (_other.hasBrokerServiceUrlTls()) {
			setBrokerServiceUrlTls(_other.getBrokerServiceUrlTls());
		}
		if (_other.hasResponse()) {
			setResponse(_other.response);
		}
		if (_other.hasRequestId()) {
			setRequestId(_other.requestId);
		}
		if (_other.hasAuthoritative()) {
			setAuthoritative(_other.authoritative);
		}
		if (_other.hasError()) {
			setError(_other.error);
		}
		if (_other.hasMessage()) {
			setMessage(_other.getMessage());
		}
		if (_other.hasProxyThroughServiceUrl()) {
			setProxyThroughServiceUrl(_other.proxyThroughServiceUrl);
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
