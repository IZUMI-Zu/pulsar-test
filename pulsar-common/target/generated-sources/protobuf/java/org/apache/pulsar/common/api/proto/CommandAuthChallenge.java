package org.apache.pulsar.common.api.proto;
public final class CommandAuthChallenge {
	private String serverVersion;
	private int _serverVersionBufferIdx = -1;
	private int _serverVersionBufferLen = -1;
	private static final int _SERVER_VERSION_FIELD_NUMBER = 1;
	private static final int _SERVER_VERSION_TAG = (_SERVER_VERSION_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _SERVER_VERSION_TAG_SIZE = LightProtoCodec.computeVarIntSize(_SERVER_VERSION_TAG);
	private static final int _SERVER_VERSION_MASK = 1 << (0 % 32);
	public boolean hasServerVersion() {
		return (_bitField0 & _SERVER_VERSION_MASK) != 0;
	}
	public String getServerVersion() {
		if (!hasServerVersion()) {
			throw new IllegalStateException("Field 'server_version' is not set");
		}
		if (serverVersion == null) {
			serverVersion = LightProtoCodec.readString(_parsedBuffer, _serverVersionBufferIdx, _serverVersionBufferLen);
		}
		return serverVersion;
	}
	public CommandAuthChallenge setServerVersion(String serverVersion) {
		this.serverVersion = serverVersion;
		_bitField0 |= _SERVER_VERSION_MASK;
		_serverVersionBufferIdx = -1;
		_serverVersionBufferLen = LightProtoCodec.computeStringUTF8Size(serverVersion);
		_cachedSize = -1;
		return this;
	}
	public CommandAuthChallenge clearServerVersion() {
		_bitField0 &= ~_SERVER_VERSION_MASK;
		serverVersion = null;
		_serverVersionBufferIdx = -1;
		_serverVersionBufferLen = -1;
		return this;
	}

	private AuthData challenge;
	private static final int _CHALLENGE_FIELD_NUMBER = 2;
	private static final int _CHALLENGE_TAG = (_CHALLENGE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _CHALLENGE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_CHALLENGE_TAG);
	private static final int _CHALLENGE_MASK = 1 << (1 % 32);
	public boolean hasChallenge() {
		return (_bitField0 & _CHALLENGE_MASK) != 0;
	}
	public AuthData getChallenge() {
		if (!hasChallenge()) {
			throw new IllegalStateException("Field 'challenge' is not set");
		}
		return challenge;
	}
	public AuthData setChallenge() {
		if (challenge == null) {
			challenge = new AuthData();
		}
		_bitField0 |= _CHALLENGE_MASK;
		_cachedSize = -1;
		return challenge;
	}
	public CommandAuthChallenge clearChallenge() {
		_bitField0 &= ~_CHALLENGE_MASK;
		if (hasChallenge()) {
			challenge.clear();
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
	public CommandAuthChallenge setProtocolVersion(int protocolVersion) {
		this.protocolVersion = protocolVersion;
		_bitField0 |= _PROTOCOL_VERSION_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandAuthChallenge clearProtocolVersion() {
		_bitField0 &= ~_PROTOCOL_VERSION_MASK;
		protocolVersion = 0;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		int _writeIdx = _b.writerIndex();
		if (hasServerVersion()) {
			LightProtoCodec.writeVarInt(_b, _SERVER_VERSION_TAG);
			LightProtoCodec.writeVarInt(_b, _serverVersionBufferLen);
			if (_serverVersionBufferIdx == -1) {
				LightProtoCodec.writeString(_b, serverVersion, _serverVersionBufferLen);
			} else {
				_parsedBuffer.getBytes(_serverVersionBufferIdx, _b, _serverVersionBufferLen);
			}
		}
		if (hasChallenge()) {
			LightProtoCodec.writeVarInt(_b, _CHALLENGE_TAG);
			LightProtoCodec.writeVarInt(_b, challenge.getSerializedSize());
			challenge.writeTo(_b);
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
		if (hasServerVersion()) {
			_size += _SERVER_VERSION_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_serverVersionBufferLen);
			_size += _serverVersionBufferLen;
		}
		if (hasChallenge()) {
			_size += LightProtoCodec.computeVarIntSize(_CHALLENGE_TAG);
			int MsgsizeChallenge = challenge.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeChallenge) + MsgsizeChallenge;
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
				case _SERVER_VERSION_TAG :
					_bitField0 |= _SERVER_VERSION_MASK;
					_serverVersionBufferLen = LightProtoCodec.readVarInt(_buffer);
					_serverVersionBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_serverVersionBufferLen);
					break;
				case _CHALLENGE_TAG :
					_bitField0 |= _CHALLENGE_MASK;
					int challengeSize = LightProtoCodec.readVarInt(_buffer);
					setChallenge().parseFrom(_buffer, challengeSize);
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
	public CommandAuthChallenge clear() {
		serverVersion = null;
		_serverVersionBufferIdx = -1;
		_serverVersionBufferLen = -1;
		if (hasChallenge()) {
			challenge.clear();
		}
		protocolVersion = 0;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public CommandAuthChallenge copyFrom(CommandAuthChallenge _other) {
		_cachedSize = -1;
		if (_other.hasServerVersion()) {
			setServerVersion(_other.getServerVersion());
		}
		if (_other.hasChallenge()) {
			setChallenge().copyFrom(_other.challenge);
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
