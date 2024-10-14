package org.apache.pulsar.common.api.proto;
public final class CommandSuccess {
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
	public CommandSuccess setRequestId(long requestId) {
		this.requestId = requestId;
		_bitField0 |= _REQUEST_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandSuccess clearRequestId() {
		_bitField0 &= ~_REQUEST_ID_MASK;
		return this;
	}

	private Schema schema;
	private static final int _SCHEMA_FIELD_NUMBER = 2;
	private static final int _SCHEMA_TAG = (_SCHEMA_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _SCHEMA_TAG_SIZE = LightProtoCodec.computeVarIntSize(_SCHEMA_TAG);
	private static final int _SCHEMA_MASK = 1 << (1 % 32);
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
	public CommandSuccess clearSchema() {
		_bitField0 &= ~_SCHEMA_MASK;
		if (hasSchema()) {
			schema.clear();
		}
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _REQUEST_ID_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _REQUEST_ID_TAG);
		LightProtoCodec.writeVarInt64(_b, requestId);
		if (hasSchema()) {
			LightProtoCodec.writeVarInt(_b, _SCHEMA_TAG);
			LightProtoCodec.writeVarInt(_b, schema.getSerializedSize());
			schema.writeTo(_b);
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
		if (hasSchema()) {
			_size += LightProtoCodec.computeVarIntSize(_SCHEMA_TAG);
			int MsgsizeSchema = schema.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeSchema) + MsgsizeSchema;
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
				case _SCHEMA_TAG :
					_bitField0 |= _SCHEMA_MASK;
					int schemaSize = LightProtoCodec.readVarInt(_buffer);
					setSchema().parseFrom(_buffer, schemaSize);
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
	public CommandSuccess clear() {
		if (hasSchema()) {
			schema.clear();
		}
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public CommandSuccess copyFrom(CommandSuccess _other) {
		_cachedSize = -1;
		if (_other.hasRequestId()) {
			setRequestId(_other.requestId);
		}
		if (_other.hasSchema()) {
			setSchema().copyFrom(_other.schema);
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
