package org.apache.pulsar.common.api.proto;
public final class CommandConnected {
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
	public CommandConnected setServerVersion(String serverVersion) {
		this.serverVersion = serverVersion;
		_bitField0 |= _SERVER_VERSION_MASK;
		_serverVersionBufferIdx = -1;
		_serverVersionBufferLen = LightProtoCodec.computeStringUTF8Size(serverVersion);
		_cachedSize = -1;
		return this;
	}
	public CommandConnected clearServerVersion() {
		_bitField0 &= ~_SERVER_VERSION_MASK;
		serverVersion = null;
		_serverVersionBufferIdx = -1;
		_serverVersionBufferLen = -1;
		return this;
	}

	private int protocolVersion = 0;
	private static final int _PROTOCOL_VERSION_FIELD_NUMBER = 2;
	private static final int _PROTOCOL_VERSION_TAG = (_PROTOCOL_VERSION_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _PROTOCOL_VERSION_TAG_SIZE = LightProtoCodec.computeVarIntSize(_PROTOCOL_VERSION_TAG);
	private static final int _PROTOCOL_VERSION_MASK = 1 << (1 % 32);
	public boolean hasProtocolVersion() {
		return (_bitField0 & _PROTOCOL_VERSION_MASK) != 0;
	}
	public int getProtocolVersion() {
		return protocolVersion;
	}
	public CommandConnected setProtocolVersion(int protocolVersion) {
		this.protocolVersion = protocolVersion;
		_bitField0 |= _PROTOCOL_VERSION_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandConnected clearProtocolVersion() {
		_bitField0 &= ~_PROTOCOL_VERSION_MASK;
		protocolVersion = 0;
		return this;
	}

	private int maxMessageSize;
	private static final int _MAX_MESSAGE_SIZE_FIELD_NUMBER = 3;
	private static final int _MAX_MESSAGE_SIZE_TAG = (_MAX_MESSAGE_SIZE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _MAX_MESSAGE_SIZE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_MAX_MESSAGE_SIZE_TAG);
	private static final int _MAX_MESSAGE_SIZE_MASK = 1 << (2 % 32);
	public boolean hasMaxMessageSize() {
		return (_bitField0 & _MAX_MESSAGE_SIZE_MASK) != 0;
	}
	public int getMaxMessageSize() {
		if (!hasMaxMessageSize()) {
			throw new IllegalStateException("Field 'max_message_size' is not set");
		}
		return maxMessageSize;
	}
	public CommandConnected setMaxMessageSize(int maxMessageSize) {
		this.maxMessageSize = maxMessageSize;
		_bitField0 |= _MAX_MESSAGE_SIZE_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandConnected clearMaxMessageSize() {
		_bitField0 &= ~_MAX_MESSAGE_SIZE_MASK;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _SERVER_VERSION_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _SERVER_VERSION_TAG);
		LightProtoCodec.writeVarInt(_b, _serverVersionBufferLen);
		if (_serverVersionBufferIdx == -1) {
			LightProtoCodec.writeString(_b, serverVersion, _serverVersionBufferLen);
		} else {
			_parsedBuffer.getBytes(_serverVersionBufferIdx, _b, _serverVersionBufferLen);
		}
		if (hasProtocolVersion()) {
			LightProtoCodec.writeVarInt(_b, _PROTOCOL_VERSION_TAG);
			LightProtoCodec.writeVarInt(_b, protocolVersion);
		}
		if (hasMaxMessageSize()) {
			LightProtoCodec.writeVarInt(_b, _MAX_MESSAGE_SIZE_TAG);
			LightProtoCodec.writeVarInt(_b, maxMessageSize);
		}
		return (_b.writerIndex() - _writeIdx);
	}
	public int getSerializedSize() {
		if (_cachedSize > -1) {
			return _cachedSize;
		}

		int _size = 0;
		_size += _SERVER_VERSION_TAG_SIZE;
		_size += LightProtoCodec.computeVarIntSize(_serverVersionBufferLen);
		_size += _serverVersionBufferLen;
		if (hasProtocolVersion()) {
			_size += _PROTOCOL_VERSION_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(protocolVersion);
		}
		if (hasMaxMessageSize()) {
			_size += _MAX_MESSAGE_SIZE_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(maxMessageSize);
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
				case _PROTOCOL_VERSION_TAG :
					_bitField0 |= _PROTOCOL_VERSION_MASK;
					protocolVersion = LightProtoCodec.readVarInt(_buffer);
					break;
				case _MAX_MESSAGE_SIZE_TAG :
					_bitField0 |= _MAX_MESSAGE_SIZE_MASK;
					maxMessageSize = LightProtoCodec.readVarInt(_buffer);
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
	public CommandConnected clear() {
		serverVersion = null;
		_serverVersionBufferIdx = -1;
		_serverVersionBufferLen = -1;
		protocolVersion = 0;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public CommandConnected copyFrom(CommandConnected _other) {
		_cachedSize = -1;
		if (_other.hasServerVersion()) {
			setServerVersion(_other.getServerVersion());
		}
		if (_other.hasProtocolVersion()) {
			setProtocolVersion(_other.protocolVersion);
		}
		if (_other.hasMaxMessageSize()) {
			setMaxMessageSize(_other.maxMessageSize);
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
