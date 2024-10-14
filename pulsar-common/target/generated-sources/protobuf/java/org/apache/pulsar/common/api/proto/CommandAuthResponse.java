package org.apache.pulsar.common.api.proto;
public final class CommandAuthResponse {
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
	public CommandAuthResponse setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
		_bitField0 |= _CLIENT_VERSION_MASK;
		_clientVersionBufferIdx = -1;
		_clientVersionBufferLen = LightProtoCodec.computeStringUTF8Size(clientVersion);
		_cachedSize = -1;
		return this;
	}
	public CommandAuthResponse clearClientVersion() {
		_bitField0 &= ~_CLIENT_VERSION_MASK;
		clientVersion = null;
		_clientVersionBufferIdx = -1;
		_clientVersionBufferLen = -1;
		return this;
	}

	private AuthData response;
	private static final int _RESPONSE_FIELD_NUMBER = 2;
	private static final int _RESPONSE_TAG = (_RESPONSE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _RESPONSE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_RESPONSE_TAG);
	private static final int _RESPONSE_MASK = 1 << (1 % 32);
	public boolean hasResponse() {
		return (_bitField0 & _RESPONSE_MASK) != 0;
	}
	public AuthData getResponse() {
		if (!hasResponse()) {
			throw new IllegalStateException("Field 'response' is not set");
		}
		return response;
	}
	public AuthData setResponse() {
		if (response == null) {
			response = new AuthData();
		}
		_bitField0 |= _RESPONSE_MASK;
		_cachedSize = -1;
		return response;
	}
	public CommandAuthResponse clearResponse() {
		_bitField0 &= ~_RESPONSE_MASK;
		if (hasResponse()) {
			response.clear();
		}
		return this;
	}

	private int protocolVersion = 0;
	private static final int _PROTOCOL_VERSION_FIELD_NUMBER = 3;
	private static final int _PROTOCOL_VERSION_TAG = (_PROTOCOL_VERSION_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _PROTOCOL_VERSION_TAG_SIZE = LightProtoCodec.computeVarIntSize(_PROTOCOL_VERSION_TAG);
	private static final int _PROTOCOL_VERSION_MASK = 1 << (2 % 32);
	public boolean hasProtocolVersion() {
		return (_bitField0 & _PROTOCOL_VERSION_MASK) != 0;
	}
	public int getProtocolVersion() {
		return protocolVersion;
	}
	public CommandAuthResponse setProtocolVersion(int protocolVersion) {
		this.protocolVersion = protocolVersion;
		_bitField0 |= _PROTOCOL_VERSION_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandAuthResponse clearProtocolVersion() {
		_bitField0 &= ~_PROTOCOL_VERSION_MASK;
		protocolVersion = 0;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		int _writeIdx = _b.writerIndex();
		if (hasClientVersion()) {
			LightProtoCodec.writeVarInt(_b, _CLIENT_VERSION_TAG);
			LightProtoCodec.writeVarInt(_b, _clientVersionBufferLen);
			if (_clientVersionBufferIdx == -1) {
				LightProtoCodec.writeString(_b, clientVersion, _clientVersionBufferLen);
			} else {
				_parsedBuffer.getBytes(_clientVersionBufferIdx, _b, _clientVersionBufferLen);
			}
		}
		if (hasResponse()) {
			LightProtoCodec.writeVarInt(_b, _RESPONSE_TAG);
			LightProtoCodec.writeVarInt(_b, response.getSerializedSize());
			response.writeTo(_b);
		}
		if (hasProtocolVersion()) {
			LightProtoCodec.writeVarInt(_b, _PROTOCOL_VERSION_TAG);
			LightProtoCodec.writeVarInt(_b, protocolVersion);
		}
		return (_b.writerIndex() - _writeIdx);
	}
	public int getSerializedSize() {
		if (_cachedSize > -1) {
			return _cachedSize;
		}

		int _size = 0;
		if (hasClientVersion()) {
			_size += _CLIENT_VERSION_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_clientVersionBufferLen);
			_size += _clientVersionBufferLen;
		}
		if (hasResponse()) {
			_size += LightProtoCodec.computeVarIntSize(_RESPONSE_TAG);
			int MsgsizeResponse = response.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeResponse) + MsgsizeResponse;
		}
		if (hasProtocolVersion()) {
			_size += _PROTOCOL_VERSION_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(protocolVersion);
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
				case _RESPONSE_TAG :
					_bitField0 |= _RESPONSE_MASK;
					int responseSize = LightProtoCodec.readVarInt(_buffer);
					setResponse().parseFrom(_buffer, responseSize);
					break;
				case _PROTOCOL_VERSION_TAG :
					_bitField0 |= _PROTOCOL_VERSION_MASK;
					protocolVersion = LightProtoCodec.readVarInt(_buffer);
					break;
				default :
					LightProtoCodec.skipUnknownField(_tag, _buffer);
			}
		}
		_parsedBuffer = _buffer;
	}
	public CommandAuthResponse clear() {
		clientVersion = null;
		_clientVersionBufferIdx = -1;
		_clientVersionBufferLen = -1;
		if (hasResponse()) {
			response.clear();
		}
		protocolVersion = 0;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public CommandAuthResponse copyFrom(CommandAuthResponse _other) {
		_cachedSize = -1;
		if (_other.hasClientVersion()) {
			setClientVersion(_other.getClientVersion());
		}
		if (_other.hasResponse()) {
			setResponse().copyFrom(_other.response);
		}
		if (_other.hasProtocolVersion()) {
			setProtocolVersion(_other.protocolVersion);
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
