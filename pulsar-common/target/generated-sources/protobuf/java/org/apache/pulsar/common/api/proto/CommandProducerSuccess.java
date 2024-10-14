package org.apache.pulsar.common.api.proto;
public final class CommandProducerSuccess {
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
	public CommandProducerSuccess setRequestId(long requestId) {
		this.requestId = requestId;
		_bitField0 |= _REQUEST_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandProducerSuccess clearRequestId() {
		_bitField0 &= ~_REQUEST_ID_MASK;
		return this;
	}

	private String producerName;
	private int _producerNameBufferIdx = -1;
	private int _producerNameBufferLen = -1;
	private static final int _PRODUCER_NAME_FIELD_NUMBER = 2;
	private static final int _PRODUCER_NAME_TAG = (_PRODUCER_NAME_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _PRODUCER_NAME_TAG_SIZE = LightProtoCodec.computeVarIntSize(_PRODUCER_NAME_TAG);
	private static final int _PRODUCER_NAME_MASK = 1 << (1 % 32);
	public boolean hasProducerName() {
		return (_bitField0 & _PRODUCER_NAME_MASK) != 0;
	}
	public String getProducerName() {
		if (!hasProducerName()) {
			throw new IllegalStateException("Field 'producer_name' is not set");
		}
		if (producerName == null) {
			producerName = LightProtoCodec.readString(_parsedBuffer, _producerNameBufferIdx, _producerNameBufferLen);
		}
		return producerName;
	}
	public CommandProducerSuccess setProducerName(String producerName) {
		this.producerName = producerName;
		_bitField0 |= _PRODUCER_NAME_MASK;
		_producerNameBufferIdx = -1;
		_producerNameBufferLen = LightProtoCodec.computeStringUTF8Size(producerName);
		_cachedSize = -1;
		return this;
	}
	public CommandProducerSuccess clearProducerName() {
		_bitField0 &= ~_PRODUCER_NAME_MASK;
		producerName = null;
		_producerNameBufferIdx = -1;
		_producerNameBufferLen = -1;
		return this;
	}

	private long lastSequenceId = -1;
	private static final int _LAST_SEQUENCE_ID_FIELD_NUMBER = 3;
	private static final int _LAST_SEQUENCE_ID_TAG = (_LAST_SEQUENCE_ID_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _LAST_SEQUENCE_ID_TAG_SIZE = LightProtoCodec.computeVarIntSize(_LAST_SEQUENCE_ID_TAG);
	private static final int _LAST_SEQUENCE_ID_MASK = 1 << (2 % 32);
	public boolean hasLastSequenceId() {
		return (_bitField0 & _LAST_SEQUENCE_ID_MASK) != 0;
	}
	public long getLastSequenceId() {
		return lastSequenceId;
	}
	public CommandProducerSuccess setLastSequenceId(long lastSequenceId) {
		this.lastSequenceId = lastSequenceId;
		_bitField0 |= _LAST_SEQUENCE_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandProducerSuccess clearLastSequenceId() {
		_bitField0 &= ~_LAST_SEQUENCE_ID_MASK;
		lastSequenceId = -1;
		return this;
	}

	private io.netty.buffer.ByteBuf schemaVersion = null;
	private int _schemaVersionIdx = -1;
	private int _schemaVersionLen = -1;
	private static final int _SCHEMA_VERSION_FIELD_NUMBER = 4;
	private static final int _SCHEMA_VERSION_TAG = (_SCHEMA_VERSION_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _SCHEMA_VERSION_TAG_SIZE = LightProtoCodec.computeVarIntSize(_SCHEMA_VERSION_TAG);
	private static final int _SCHEMA_VERSION_MASK = 1 << (3 % 32);
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
	public CommandProducerSuccess setSchemaVersion(byte[] schemaVersion) {
		setSchemaVersion(io.netty.buffer.Unpooled.wrappedBuffer(schemaVersion));
		return this;
	}
	public CommandProducerSuccess setSchemaVersion(io.netty.buffer.ByteBuf schemaVersion) {
		this.schemaVersion = schemaVersion;
		_bitField0 |= _SCHEMA_VERSION_MASK;
		_schemaVersionIdx = -1;
		_schemaVersionLen = schemaVersion.readableBytes();
		_cachedSize = -1;
		return this;
	}
	public CommandProducerSuccess clearSchemaVersion() {
		_bitField0 &= ~_SCHEMA_VERSION_MASK;
		schemaVersion = null;
		_schemaVersionIdx = -1;
		_schemaVersionLen = -1;
		return this;
	}

	private long topicEpoch;
	private static final int _TOPIC_EPOCH_FIELD_NUMBER = 5;
	private static final int _TOPIC_EPOCH_TAG = (_TOPIC_EPOCH_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _TOPIC_EPOCH_TAG_SIZE = LightProtoCodec.computeVarIntSize(_TOPIC_EPOCH_TAG);
	private static final int _TOPIC_EPOCH_MASK = 1 << (4 % 32);
	public boolean hasTopicEpoch() {
		return (_bitField0 & _TOPIC_EPOCH_MASK) != 0;
	}
	public long getTopicEpoch() {
		if (!hasTopicEpoch()) {
			throw new IllegalStateException("Field 'topic_epoch' is not set");
		}
		return topicEpoch;
	}
	public CommandProducerSuccess setTopicEpoch(long topicEpoch) {
		this.topicEpoch = topicEpoch;
		_bitField0 |= _TOPIC_EPOCH_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandProducerSuccess clearTopicEpoch() {
		_bitField0 &= ~_TOPIC_EPOCH_MASK;
		return this;
	}

	private boolean producerReady = true;
	private static final int _PRODUCER_READY_FIELD_NUMBER = 6;
	private static final int _PRODUCER_READY_TAG = (_PRODUCER_READY_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _PRODUCER_READY_TAG_SIZE = LightProtoCodec.computeVarIntSize(_PRODUCER_READY_TAG);
	private static final int _PRODUCER_READY_MASK = 1 << (5 % 32);
	public boolean hasProducerReady() {
		return (_bitField0 & _PRODUCER_READY_MASK) != 0;
	}
	public boolean isProducerReady() {
		return producerReady;
	}
	public CommandProducerSuccess setProducerReady(boolean producerReady) {
		this.producerReady = producerReady;
		_bitField0 |= _PRODUCER_READY_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandProducerSuccess clearProducerReady() {
		_bitField0 &= ~_PRODUCER_READY_MASK;
		producerReady = true;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _REQUEST_ID_MASK | _PRODUCER_NAME_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _REQUEST_ID_TAG);
		LightProtoCodec.writeVarInt64(_b, requestId);
		LightProtoCodec.writeVarInt(_b, _PRODUCER_NAME_TAG);
		LightProtoCodec.writeVarInt(_b, _producerNameBufferLen);
		if (_producerNameBufferIdx == -1) {
			LightProtoCodec.writeString(_b, producerName, _producerNameBufferLen);
		} else {
			_parsedBuffer.getBytes(_producerNameBufferIdx, _b, _producerNameBufferLen);
		}
		if (hasLastSequenceId()) {
			LightProtoCodec.writeVarInt(_b, _LAST_SEQUENCE_ID_TAG);
			LightProtoCodec.writeVarInt64(_b, lastSequenceId);
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
		if (hasTopicEpoch()) {
			LightProtoCodec.writeVarInt(_b, _TOPIC_EPOCH_TAG);
			LightProtoCodec.writeVarInt64(_b, topicEpoch);
		}
		if (hasProducerReady()) {
			LightProtoCodec.writeVarInt(_b, _PRODUCER_READY_TAG);
			_b.writeBoolean(producerReady);
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
		_size += _PRODUCER_NAME_TAG_SIZE;
		_size += LightProtoCodec.computeVarIntSize(_producerNameBufferLen);
		_size += _producerNameBufferLen;
		if (hasLastSequenceId()) {
			_size += _LAST_SEQUENCE_ID_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(lastSequenceId);
		}
		if (hasSchemaVersion()) {
			_size += _SCHEMA_VERSION_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_schemaVersionLen) + _schemaVersionLen;
		}
		if (hasTopicEpoch()) {
			_size += _TOPIC_EPOCH_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(topicEpoch);
		}
		if (hasProducerReady()) {
			_size += _PRODUCER_READY_TAG_SIZE;
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
				case _REQUEST_ID_TAG :
					_bitField0 |= _REQUEST_ID_MASK;
					requestId = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _PRODUCER_NAME_TAG :
					_bitField0 |= _PRODUCER_NAME_MASK;
					_producerNameBufferLen = LightProtoCodec.readVarInt(_buffer);
					_producerNameBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_producerNameBufferLen);
					break;
				case _LAST_SEQUENCE_ID_TAG :
					_bitField0 |= _LAST_SEQUENCE_ID_MASK;
					lastSequenceId = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _SCHEMA_VERSION_TAG :
					_bitField0 |= _SCHEMA_VERSION_MASK;
					_schemaVersionLen = LightProtoCodec.readVarInt(_buffer);
					_schemaVersionIdx = _buffer.readerIndex();
					_buffer.skipBytes(_schemaVersionLen);
					break;
				case _TOPIC_EPOCH_TAG :
					_bitField0 |= _TOPIC_EPOCH_MASK;
					topicEpoch = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _PRODUCER_READY_TAG :
					_bitField0 |= _PRODUCER_READY_MASK;
					producerReady = LightProtoCodec.readVarInt(_buffer) == 1;
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
	public CommandProducerSuccess clear() {
		producerName = null;
		_producerNameBufferIdx = -1;
		_producerNameBufferLen = -1;
		lastSequenceId = -1;
		schemaVersion = null;
		_schemaVersionIdx = -1;
		_schemaVersionLen = -1;
		producerReady = true;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public CommandProducerSuccess copyFrom(CommandProducerSuccess _other) {
		_cachedSize = -1;
		if (_other.hasRequestId()) {
			setRequestId(_other.requestId);
		}
		if (_other.hasProducerName()) {
			setProducerName(_other.getProducerName());
		}
		if (_other.hasLastSequenceId()) {
			setLastSequenceId(_other.lastSequenceId);
		}
		if (_other.hasSchemaVersion()) {
			setSchemaVersion(_other.getSchemaVersion());
		}
		if (_other.hasTopicEpoch()) {
			setTopicEpoch(_other.topicEpoch);
		}
		if (_other.hasProducerReady()) {
			setProducerReady(_other.producerReady);
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
