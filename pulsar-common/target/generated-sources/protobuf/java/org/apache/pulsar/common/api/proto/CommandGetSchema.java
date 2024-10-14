package org.apache.pulsar.common.api.proto;
public final class CommandGetSchema {
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
	public CommandGetSchema setRequestId(long requestId) {
		this.requestId = requestId;
		_bitField0 |= _REQUEST_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandGetSchema clearRequestId() {
		_bitField0 &= ~_REQUEST_ID_MASK;
		return this;
	}

	private String topic;
	private int _topicBufferIdx = -1;
	private int _topicBufferLen = -1;
	private static final int _TOPIC_FIELD_NUMBER = 2;
	private static final int _TOPIC_TAG = (_TOPIC_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _TOPIC_TAG_SIZE = LightProtoCodec.computeVarIntSize(_TOPIC_TAG);
	private static final int _TOPIC_MASK = 1 << (1 % 32);
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
	public CommandGetSchema setTopic(String topic) {
		this.topic = topic;
		_bitField0 |= _TOPIC_MASK;
		_topicBufferIdx = -1;
		_topicBufferLen = LightProtoCodec.computeStringUTF8Size(topic);
		_cachedSize = -1;
		return this;
	}
	public CommandGetSchema clearTopic() {
		_bitField0 &= ~_TOPIC_MASK;
		topic = null;
		_topicBufferIdx = -1;
		_topicBufferLen = -1;
		return this;
	}

	private io.netty.buffer.ByteBuf schemaVersion = null;
	private int _schemaVersionIdx = -1;
	private int _schemaVersionLen = -1;
	private static final int _SCHEMA_VERSION_FIELD_NUMBER = 3;
	private static final int _SCHEMA_VERSION_TAG = (_SCHEMA_VERSION_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _SCHEMA_VERSION_TAG_SIZE = LightProtoCodec.computeVarIntSize(_SCHEMA_VERSION_TAG);
	private static final int _SCHEMA_VERSION_MASK = 1 << (2 % 32);
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
	public CommandGetSchema setSchemaVersion(byte[] schemaVersion) {
		setSchemaVersion(io.netty.buffer.Unpooled.wrappedBuffer(schemaVersion));
		return this;
	}
	public CommandGetSchema setSchemaVersion(io.netty.buffer.ByteBuf schemaVersion) {
		this.schemaVersion = schemaVersion;
		_bitField0 |= _SCHEMA_VERSION_MASK;
		_schemaVersionIdx = -1;
		_schemaVersionLen = schemaVersion.readableBytes();
		_cachedSize = -1;
		return this;
	}
	public CommandGetSchema clearSchemaVersion() {
		_bitField0 &= ~_SCHEMA_VERSION_MASK;
		schemaVersion = null;
		_schemaVersionIdx = -1;
		_schemaVersionLen = -1;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _REQUEST_ID_MASK | _TOPIC_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _REQUEST_ID_TAG);
		LightProtoCodec.writeVarInt64(_b, requestId);
		LightProtoCodec.writeVarInt(_b, _TOPIC_TAG);
		LightProtoCodec.writeVarInt(_b, _topicBufferLen);
		if (_topicBufferIdx == -1) {
			LightProtoCodec.writeString(_b, topic, _topicBufferLen);
		} else {
			_parsedBuffer.getBytes(_topicBufferIdx, _b, _topicBufferLen);
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
		_size += _TOPIC_TAG_SIZE;
		_size += LightProtoCodec.computeVarIntSize(_topicBufferLen);
		_size += _topicBufferLen;
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
				case _TOPIC_TAG :
					_bitField0 |= _TOPIC_MASK;
					_topicBufferLen = LightProtoCodec.readVarInt(_buffer);
					_topicBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_topicBufferLen);
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
	public CommandGetSchema clear() {
		topic = null;
		_topicBufferIdx = -1;
		_topicBufferLen = -1;
		schemaVersion = null;
		_schemaVersionIdx = -1;
		_schemaVersionLen = -1;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public CommandGetSchema copyFrom(CommandGetSchema _other) {
		_cachedSize = -1;
		if (_other.hasRequestId()) {
			setRequestId(_other.requestId);
		}
		if (_other.hasTopic()) {
			setTopic(_other.getTopic());
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
