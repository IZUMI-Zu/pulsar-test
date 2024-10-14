package org.apache.pulsar.common.api.proto;
public final class CommandGetSchemaResponse {
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
	public CommandGetSchemaResponse setRequestId(long requestId) {
		this.requestId = requestId;
		_bitField0 |= _REQUEST_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandGetSchemaResponse clearRequestId() {
		_bitField0 &= ~_REQUEST_ID_MASK;
		return this;
	}

	private ServerError errorCode;
	private static final int _ERROR_CODE_FIELD_NUMBER = 2;
	private static final int _ERROR_CODE_TAG = (_ERROR_CODE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _ERROR_CODE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_ERROR_CODE_TAG);
	private static final int _ERROR_CODE_MASK = 1 << (1 % 32);
	public boolean hasErrorCode() {
		return (_bitField0 & _ERROR_CODE_MASK) != 0;
	}
	public ServerError getErrorCode() {
		if (!hasErrorCode()) {
			throw new IllegalStateException("Field 'error_code' is not set");
		}
		return errorCode;
	}
	public CommandGetSchemaResponse setErrorCode(ServerError errorCode) {
		this.errorCode = errorCode;
		_bitField0 |= _ERROR_CODE_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandGetSchemaResponse clearErrorCode() {
		_bitField0 &= ~_ERROR_CODE_MASK;
		return this;
	}

	private String errorMessage;
	private int _errorMessageBufferIdx = -1;
	private int _errorMessageBufferLen = -1;
	private static final int _ERROR_MESSAGE_FIELD_NUMBER = 3;
	private static final int _ERROR_MESSAGE_TAG = (_ERROR_MESSAGE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _ERROR_MESSAGE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_ERROR_MESSAGE_TAG);
	private static final int _ERROR_MESSAGE_MASK = 1 << (2 % 32);
	public boolean hasErrorMessage() {
		return (_bitField0 & _ERROR_MESSAGE_MASK) != 0;
	}
	public String getErrorMessage() {
		if (!hasErrorMessage()) {
			throw new IllegalStateException("Field 'error_message' is not set");
		}
		if (errorMessage == null) {
			errorMessage = LightProtoCodec.readString(_parsedBuffer, _errorMessageBufferIdx, _errorMessageBufferLen);
		}
		return errorMessage;
	}
	public CommandGetSchemaResponse setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
		_bitField0 |= _ERROR_MESSAGE_MASK;
		_errorMessageBufferIdx = -1;
		_errorMessageBufferLen = LightProtoCodec.computeStringUTF8Size(errorMessage);
		_cachedSize = -1;
		return this;
	}
	public CommandGetSchemaResponse clearErrorMessage() {
		_bitField0 &= ~_ERROR_MESSAGE_MASK;
		errorMessage = null;
		_errorMessageBufferIdx = -1;
		_errorMessageBufferLen = -1;
		return this;
	}

	private Schema schema;
	private static final int _SCHEMA_FIELD_NUMBER = 4;
	private static final int _SCHEMA_TAG = (_SCHEMA_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _SCHEMA_TAG_SIZE = LightProtoCodec.computeVarIntSize(_SCHEMA_TAG);
	private static final int _SCHEMA_MASK = 1 << (3 % 32);
	public boolean hasSchema() {
		return (_bitField0 & _SCHEMA_MASK) != 0;
	}
	public Schema getSchema() {
		if (!hasSchema()) {
			throw new IllegalStateException("Field 'schema' is not set");
		}
		return schema;
	}
	public Schema setSchema() {
		if (schema == null) {
			schema = new Schema();
		}
		_bitField0 |= _SCHEMA_MASK;
		_cachedSize = -1;
		return schema;
	}
	public CommandGetSchemaResponse clearSchema() {
		_bitField0 &= ~_SCHEMA_MASK;
		if (hasSchema()) {
			schema.clear();
		}
		return this;
	}

	private io.netty.buffer.ByteBuf schemaVersion = null;
	private int _schemaVersionIdx = -1;
	private int _schemaVersionLen = -1;
	private static final int _SCHEMA_VERSION_FIELD_NUMBER = 5;
	private static final int _SCHEMA_VERSION_TAG = (_SCHEMA_VERSION_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _SCHEMA_VERSION_TAG_SIZE = LightProtoCodec.computeVarIntSize(_SCHEMA_VERSION_TAG);
	private static final int _SCHEMA_VERSION_MASK = 1 << (4 % 32);
	public boolean hasSchemaVersion() {
		return (_bitField0 & _SCHEMA_VERSION_MASK) != 0;
	}
	public int getSchemaVersionSize() {
		if (!hasSchemaVersion()) {
			throw new IllegalStateException("Field 'schema_version' is not set");
		}
		return _schemaVersionLen;
	}
	public byte[] getSchemaVersion() {
		io.netty.buffer.ByteBuf _b = getSchemaVersionSlice();
		byte[] res = new byte[_b.readableBytes()];
		_b.getBytes(0, res);
		return res;
	}
	public io.netty.buffer.ByteBuf getSchemaVersionSlice() {
		if (!hasSchemaVersion()) {
			throw new IllegalStateException("Field 'schema_version' is not set");
		}
		if (schemaVersion == null) {
			return _parsedBuffer.slice(_schemaVersionIdx, _schemaVersionLen);
		} else {
			return schemaVersion.slice(0, _schemaVersionLen);
		}
	}
	public CommandGetSchemaResponse setSchemaVersion(byte[] schemaVersion) {
		setSchemaVersion(io.netty.buffer.Unpooled.wrappedBuffer(schemaVersion));
		return this;
	}
	public CommandGetSchemaResponse setSchemaVersion(io.netty.buffer.ByteBuf schemaVersion) {
		this.schemaVersion = schemaVersion;
		_bitField0 |= _SCHEMA_VERSION_MASK;
		_schemaVersionIdx = -1;
		_schemaVersionLen = schemaVersion.readableBytes();
		_cachedSize = -1;
		return this;
	}
	public CommandGetSchemaResponse clearSchemaVersion() {
		_bitField0 &= ~_SCHEMA_VERSION_MASK;
		schemaVersion = null;
		_schemaVersionIdx = -1;
		_schemaVersionLen = -1;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _REQUEST_ID_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _REQUEST_ID_TAG);
		LightProtoCodec.writeVarInt64(_b, requestId);
		if (hasErrorCode()) {
			LightProtoCodec.writeVarInt(_b, _ERROR_CODE_TAG);
			LightProtoCodec.writeVarInt(_b, errorCode.getValue());
		}
		if (hasErrorMessage()) {
			LightProtoCodec.writeVarInt(_b, _ERROR_MESSAGE_TAG);
			LightProtoCodec.writeVarInt(_b, _errorMessageBufferLen);
			if (_errorMessageBufferIdx == -1) {
				LightProtoCodec.writeString(_b, errorMessage, _errorMessageBufferLen);
			} else {
				_parsedBuffer.getBytes(_errorMessageBufferIdx, _b, _errorMessageBufferLen);
			}
		}
		if (hasSchema()) {
			LightProtoCodec.writeVarInt(_b, _SCHEMA_TAG);
			LightProtoCodec.writeVarInt(_b, schema.getSerializedSize());
			schema.writeTo(_b);
		}
		if (hasSchemaVersion()) {
			LightProtoCodec.writeVarInt(_b, _SCHEMA_VERSION_TAG);
			LightProtoCodec.writeVarInt(_b, _schemaVersionLen);
			if (_schemaVersionIdx == -1) {
				_b.writeBytes(schemaVersion);
			} else {
				_parsedBuffer.getBytes(_schemaVersionIdx, _b, _schemaVersionLen);
			}
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
		if (hasErrorCode()) {
			_size += _ERROR_CODE_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(errorCode.getValue());
		}
		if (hasErrorMessage()) {
			_size += _ERROR_MESSAGE_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_errorMessageBufferLen);
			_size += _errorMessageBufferLen;
		}
		if (hasSchema()) {
			_size += LightProtoCodec.computeVarIntSize(_SCHEMA_TAG);
			int MsgsizeSchema = schema.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeSchema) + MsgsizeSchema;
		}
		if (hasSchemaVersion()) {
			_size += _SCHEMA_VERSION_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_schemaVersionLen) + _schemaVersionLen;
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
				case _ERROR_CODE_TAG :
					ServerError _errorCode = ServerError.valueOf(LightProtoCodec.readVarInt(_buffer));
					if (_errorCode != null) {
						_bitField0 |= _ERROR_CODE_MASK;
						errorCode = _errorCode;
					}
					break;
				case _ERROR_MESSAGE_TAG :
					_bitField0 |= _ERROR_MESSAGE_MASK;
					_errorMessageBufferLen = LightProtoCodec.readVarInt(_buffer);
					_errorMessageBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_errorMessageBufferLen);
					break;
				case _SCHEMA_TAG :
					_bitField0 |= _SCHEMA_MASK;
					int schemaSize = LightProtoCodec.readVarInt(_buffer);
					setSchema().parseFrom(_buffer, schemaSize);
					break;
				case _SCHEMA_VERSION_TAG :
					_bitField0 |= _SCHEMA_VERSION_MASK;
					_schemaVersionLen = LightProtoCodec.readVarInt(_buffer);
					_schemaVersionIdx = _buffer.readerIndex();
					_buffer.skipBytes(_schemaVersionLen);
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
	public CommandGetSchemaResponse clear() {
		errorMessage = null;
		_errorMessageBufferIdx = -1;
		_errorMessageBufferLen = -1;
		if (hasSchema()) {
			schema.clear();
		}
		schemaVersion = null;
		_schemaVersionIdx = -1;
		_schemaVersionLen = -1;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public CommandGetSchemaResponse copyFrom(CommandGetSchemaResponse _other) {
		_cachedSize = -1;
		if (_other.hasRequestId()) {
			setRequestId(_other.requestId);
		}
		if (_other.hasErrorCode()) {
			setErrorCode(_other.errorCode);
		}
		if (_other.hasErrorMessage()) {
			setErrorMessage(_other.getErrorMessage());
		}
		if (_other.hasSchema()) {
			setSchema().copyFrom(_other.schema);
		}
		if (_other.hasSchemaVersion()) {
			setSchemaVersion(_other.getSchemaVersion());
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
