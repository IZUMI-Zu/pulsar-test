package org.apache.pulsar.common.api.proto;
public final class CommandLookupTopic {
	private String topic;
	private int _topicBufferIdx = -1;
	private int _topicBufferLen = -1;
	private static final int _TOPIC_FIELD_NUMBER = 1;
	private static final int _TOPIC_TAG = (_TOPIC_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _TOPIC_TAG_SIZE = LightProtoCodec.computeVarIntSize(_TOPIC_TAG);
	private static final int _TOPIC_MASK = 1 << (0 % 32);
	public boolean hasTopic() {
		return (_bitField0 & _TOPIC_MASK) != 0;
	}
	public String getTopic() {
		if (!hasTopic()) {
			throw new IllegalStateException("Field 'topic' is not set");
		}
		if (topic == null) {
			topic = LightProtoCodec.readString(_parsedBuffer, _topicBufferIdx, _topicBufferLen);
		}
		return topic;
	}
	public CommandLookupTopic setTopic(String topic) {
		this.topic = topic;
		_bitField0 |= _TOPIC_MASK;
		_topicBufferIdx = -1;
		_topicBufferLen = LightProtoCodec.computeStringUTF8Size(topic);
		_cachedSize = -1;
		return this;
	}
	public CommandLookupTopic clearTopic() {
		_bitField0 &= ~_TOPIC_MASK;
		topic = null;
		_topicBufferIdx = -1;
		_topicBufferLen = -1;
		return this;
	}

	private long requestId;
	private static final int _REQUEST_ID_FIELD_NUMBER = 2;
	private static final int _REQUEST_ID_TAG = (_REQUEST_ID_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _REQUEST_ID_TAG_SIZE = LightProtoCodec.computeVarIntSize(_REQUEST_ID_TAG);
	private static final int _REQUEST_ID_MASK = 1 << (1 % 32);
	public boolean hasRequestId() {
		return (_bitField0 & _REQUEST_ID_MASK) != 0;
	}
	public long getRequestId() {
		if (!hasRequestId()) {
			throw new IllegalStateException("Field 'request_id' is not set");
		}
		return requestId;
	}
	public CommandLookupTopic setRequestId(long requestId) {
		this.requestId = requestId;
		_bitField0 |= _REQUEST_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandLookupTopic clearRequestId() {
		_bitField0 &= ~_REQUEST_ID_MASK;
		return this;
	}

	private boolean authoritative = false;
	private static final int _AUTHORITATIVE_FIELD_NUMBER = 3;
	private static final int _AUTHORITATIVE_TAG = (_AUTHORITATIVE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _AUTHORITATIVE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_AUTHORITATIVE_TAG);
	private static final int _AUTHORITATIVE_MASK = 1 << (2 % 32);
	public boolean hasAuthoritative() {
		return (_bitField0 & _AUTHORITATIVE_MASK) != 0;
	}
	public boolean isAuthoritative() {
		return authoritative;
	}
	public CommandLookupTopic setAuthoritative(boolean authoritative) {
		this.authoritative = authoritative;
		_bitField0 |= _AUTHORITATIVE_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandLookupTopic clearAuthoritative() {
		_bitField0 &= ~_AUTHORITATIVE_MASK;
		authoritative = false;
		return this;
	}

	private String originalPrincipal;
	private int _originalPrincipalBufferIdx = -1;
	private int _originalPrincipalBufferLen = -1;
	private static final int _ORIGINAL_PRINCIPAL_FIELD_NUMBER = 4;
	private static final int _ORIGINAL_PRINCIPAL_TAG = (_ORIGINAL_PRINCIPAL_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _ORIGINAL_PRINCIPAL_TAG_SIZE = LightProtoCodec.computeVarIntSize(_ORIGINAL_PRINCIPAL_TAG);
	private static final int _ORIGINAL_PRINCIPAL_MASK = 1 << (3 % 32);
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
	public CommandLookupTopic setOriginalPrincipal(String originalPrincipal) {
		this.originalPrincipal = originalPrincipal;
		_bitField0 |= _ORIGINAL_PRINCIPAL_MASK;
		_originalPrincipalBufferIdx = -1;
		_originalPrincipalBufferLen = LightProtoCodec.computeStringUTF8Size(originalPrincipal);
		_cachedSize = -1;
		return this;
	}
	public CommandLookupTopic clearOriginalPrincipal() {
		_bitField0 &= ~_ORIGINAL_PRINCIPAL_MASK;
		originalPrincipal = null;
		_originalPrincipalBufferIdx = -1;
		_originalPrincipalBufferLen = -1;
		return this;
	}

	private String originalAuthData;
	private int _originalAuthDataBufferIdx = -1;
	private int _originalAuthDataBufferLen = -1;
	private static final int _ORIGINAL_AUTH_DATA_FIELD_NUMBER = 5;
	private static final int _ORIGINAL_AUTH_DATA_TAG = (_ORIGINAL_AUTH_DATA_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _ORIGINAL_AUTH_DATA_TAG_SIZE = LightProtoCodec.computeVarIntSize(_ORIGINAL_AUTH_DATA_TAG);
	private static final int _ORIGINAL_AUTH_DATA_MASK = 1 << (4 % 32);
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
	public CommandLookupTopic setOriginalAuthData(String originalAuthData) {
		this.originalAuthData = originalAuthData;
		_bitField0 |= _ORIGINAL_AUTH_DATA_MASK;
		_originalAuthDataBufferIdx = -1;
		_originalAuthDataBufferLen = LightProtoCodec.computeStringUTF8Size(originalAuthData);
		_cachedSize = -1;
		return this;
	}
	public CommandLookupTopic clearOriginalAuthData() {
		_bitField0 &= ~_ORIGINAL_AUTH_DATA_MASK;
		originalAuthData = null;
		_originalAuthDataBufferIdx = -1;
		_originalAuthDataBufferLen = -1;
		return this;
	}

	private String originalAuthMethod;
	private int _originalAuthMethodBufferIdx = -1;
	private int _originalAuthMethodBufferLen = -1;
	private static final int _ORIGINAL_AUTH_METHOD_FIELD_NUMBER = 6;
	private static final int _ORIGINAL_AUTH_METHOD_TAG = (_ORIGINAL_AUTH_METHOD_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _ORIGINAL_AUTH_METHOD_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_ORIGINAL_AUTH_METHOD_TAG);
	private static final int _ORIGINAL_AUTH_METHOD_MASK = 1 << (5 % 32);
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
	public CommandLookupTopic setOriginalAuthMethod(String originalAuthMethod) {
		this.originalAuthMethod = originalAuthMethod;
		_bitField0 |= _ORIGINAL_AUTH_METHOD_MASK;
		_originalAuthMethodBufferIdx = -1;
		_originalAuthMethodBufferLen = LightProtoCodec.computeStringUTF8Size(originalAuthMethod);
		_cachedSize = -1;
		return this;
	}
	public CommandLookupTopic clearOriginalAuthMethod() {
		_bitField0 &= ~_ORIGINAL_AUTH_METHOD_MASK;
		originalAuthMethod = null;
		_originalAuthMethodBufferIdx = -1;
		_originalAuthMethodBufferLen = -1;
		return this;
	}

	private String advertisedListenerName;
	private int _advertisedListenerNameBufferIdx = -1;
	private int _advertisedListenerNameBufferLen = -1;
	private static final int _ADVERTISED_LISTENER_NAME_FIELD_NUMBER = 7;
	private static final int _ADVERTISED_LISTENER_NAME_TAG = (_ADVERTISED_LISTENER_NAME_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _ADVERTISED_LISTENER_NAME_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_ADVERTISED_LISTENER_NAME_TAG);
	private static final int _ADVERTISED_LISTENER_NAME_MASK = 1 << (6 % 32);
	public boolean hasAdvertisedListenerName() {
		return (_bitField0 & _ADVERTISED_LISTENER_NAME_MASK) != 0;
	}
	public String getAdvertisedListenerName() {
		if (!hasAdvertisedListenerName()) {
			throw new IllegalStateException("Field 'advertised_listener_name' is not set");
		}
		if (advertisedListenerName == null) {
			advertisedListenerName = LightProtoCodec.readString(_parsedBuffer, _advertisedListenerNameBufferIdx,
					_advertisedListenerNameBufferLen);
		}
		return advertisedListenerName;
	}
	public CommandLookupTopic setAdvertisedListenerName(String advertisedListenerName) {
		this.advertisedListenerName = advertisedListenerName;
		_bitField0 |= _ADVERTISED_LISTENER_NAME_MASK;
		_advertisedListenerNameBufferIdx = -1;
		_advertisedListenerNameBufferLen = LightProtoCodec.computeStringUTF8Size(advertisedListenerName);
		_cachedSize = -1;
		return this;
	}
	public CommandLookupTopic clearAdvertisedListenerName() {
		_bitField0 &= ~_ADVERTISED_LISTENER_NAME_MASK;
		advertisedListenerName = null;
		_advertisedListenerNameBufferIdx = -1;
		_advertisedListenerNameBufferLen = -1;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _TOPIC_MASK | _REQUEST_ID_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _TOPIC_TAG);
		LightProtoCodec.writeVarInt(_b, _topicBufferLen);
		if (_topicBufferIdx == -1) {
			LightProtoCodec.writeString(_b, topic, _topicBufferLen);
		} else {
			_parsedBuffer.getBytes(_topicBufferIdx, _b, _topicBufferLen);
		}
		LightProtoCodec.writeVarInt(_b, _REQUEST_ID_TAG);
		LightProtoCodec.writeVarInt64(_b, requestId);
		if (hasAuthoritative()) {
			LightProtoCodec.writeVarInt(_b, _AUTHORITATIVE_TAG);
			_b.writeBoolean(authoritative);
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
		if (hasAdvertisedListenerName()) {
			LightProtoCodec.writeVarInt(_b, _ADVERTISED_LISTENER_NAME_TAG);
			LightProtoCodec.writeVarInt(_b, _advertisedListenerNameBufferLen);
			if (_advertisedListenerNameBufferIdx == -1) {
				LightProtoCodec.writeString(_b, advertisedListenerName, _advertisedListenerNameBufferLen);
			} else {
				_parsedBuffer.getBytes(_advertisedListenerNameBufferIdx, _b, _advertisedListenerNameBufferLen);
			}
		}
		return (_b.writerIndex() - _writeIdx);
	}
	public int getSerializedSize() {
		if (_cachedSize > -1) {
			return _cachedSize;
		}

		int _size = 0;
		_size += _TOPIC_TAG_SIZE;
		_size += LightProtoCodec.computeVarIntSize(_topicBufferLen);
		_size += _topicBufferLen;
		_size += _REQUEST_ID_TAG_SIZE;
		_size += LightProtoCodec.computeVarInt64Size(requestId);
		if (hasAuthoritative()) {
			_size += _AUTHORITATIVE_TAG_SIZE;
			_size += 1;
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
		if (hasAdvertisedListenerName()) {
			_size += _ADVERTISED_LISTENER_NAME_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_advertisedListenerNameBufferLen);
			_size += _advertisedListenerNameBufferLen;
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
				case _TOPIC_TAG :
					_bitField0 |= _TOPIC_MASK;
					_topicBufferLen = LightProtoCodec.readVarInt(_buffer);
					_topicBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_topicBufferLen);
					break;
				case _REQUEST_ID_TAG :
					_bitField0 |= _REQUEST_ID_MASK;
					requestId = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _AUTHORITATIVE_TAG :
					_bitField0 |= _AUTHORITATIVE_MASK;
					authoritative = LightProtoCodec.readVarInt(_buffer) == 1;
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
				case _ADVERTISED_LISTENER_NAME_TAG :
					_bitField0 |= _ADVERTISED_LISTENER_NAME_MASK;
					_advertisedListenerNameBufferLen = LightProtoCodec.readVarInt(_buffer);
					_advertisedListenerNameBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_advertisedListenerNameBufferLen);
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
	public CommandLookupTopic clear() {
		topic = null;
		_topicBufferIdx = -1;
		_topicBufferLen = -1;
		authoritative = false;
		originalPrincipal = null;
		_originalPrincipalBufferIdx = -1;
		_originalPrincipalBufferLen = -1;
		originalAuthData = null;
		_originalAuthDataBufferIdx = -1;
		_originalAuthDataBufferLen = -1;
		originalAuthMethod = null;
		_originalAuthMethodBufferIdx = -1;
		_originalAuthMethodBufferLen = -1;
		advertisedListenerName = null;
		_advertisedListenerNameBufferIdx = -1;
		_advertisedListenerNameBufferLen = -1;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public CommandLookupTopic copyFrom(CommandLookupTopic _other) {
		_cachedSize = -1;
		if (_other.hasTopic()) {
			setTopic(_other.getTopic());
		}
		if (_other.hasRequestId()) {
			setRequestId(_other.requestId);
		}
		if (_other.hasAuthoritative()) {
			setAuthoritative(_other.authoritative);
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
		if (_other.hasAdvertisedListenerName()) {
			setAdvertisedListenerName(_other.getAdvertisedListenerName());
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
