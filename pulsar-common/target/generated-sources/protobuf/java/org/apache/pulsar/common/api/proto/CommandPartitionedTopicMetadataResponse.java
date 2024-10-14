package org.apache.pulsar.common.api.proto;
public final class CommandPartitionedTopicMetadataResponse {
	public enum LookupType {
		Success(0), Failed(1),;
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
					return Success;
				case 1 :
					return Failed;
				default :
					return null;

			}
		}
		public static final int Success_VALUE = 0;
		public static final int Failed_VALUE = 1;
	}

	private int partitions;
	private static final int _PARTITIONS_FIELD_NUMBER = 1;
	private static final int _PARTITIONS_TAG = (_PARTITIONS_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _PARTITIONS_TAG_SIZE = LightProtoCodec.computeVarIntSize(_PARTITIONS_TAG);
	private static final int _PARTITIONS_MASK = 1 << (0 % 32);
	public boolean hasPartitions() {
		return (_bitField0 & _PARTITIONS_MASK) != 0;
	}
	public int getPartitions() {
		if (!hasPartitions()) {
			throw new IllegalStateException("Field 'partitions' is not set");
		}
		return partitions;
	}
	public CommandPartitionedTopicMetadataResponse setPartitions(int partitions) {
		this.partitions = partitions;
		_bitField0 |= _PARTITIONS_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandPartitionedTopicMetadataResponse clearPartitions() {
		_bitField0 &= ~_PARTITIONS_MASK;
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
	public CommandPartitionedTopicMetadataResponse setRequestId(long requestId) {
		this.requestId = requestId;
		_bitField0 |= _REQUEST_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandPartitionedTopicMetadataResponse clearRequestId() {
		_bitField0 &= ~_REQUEST_ID_MASK;
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
	public CommandPartitionedTopicMetadataResponse setResponse(LookupType response) {
		this.response = response;
		_bitField0 |= _RESPONSE_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandPartitionedTopicMetadataResponse clearResponse() {
		_bitField0 &= ~_RESPONSE_MASK;
		return this;
	}

	private ServerError error;
	private static final int _ERROR_FIELD_NUMBER = 4;
	private static final int _ERROR_TAG = (_ERROR_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _ERROR_TAG_SIZE = LightProtoCodec.computeVarIntSize(_ERROR_TAG);
	private static final int _ERROR_MASK = 1 << (3 % 32);
	public boolean hasError() {
		return (_bitField0 & _ERROR_MASK) != 0;
	}
	public ServerError getError() {
		if (!hasError()) {
			throw new IllegalStateException("Field 'error' is not set");
		}
		return error;
	}
	public CommandPartitionedTopicMetadataResponse setError(ServerError error) {
		this.error = error;
		_bitField0 |= _ERROR_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandPartitionedTopicMetadataResponse clearError() {
		_bitField0 &= ~_ERROR_MASK;
		return this;
	}

	private String message;
	private int _messageBufferIdx = -1;
	private int _messageBufferLen = -1;
	private static final int _MESSAGE_FIELD_NUMBER = 5;
	private static final int _MESSAGE_TAG = (_MESSAGE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _MESSAGE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_MESSAGE_TAG);
	private static final int _MESSAGE_MASK = 1 << (4 % 32);
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
	public CommandPartitionedTopicMetadataResponse setMessage(String message) {
		this.message = message;
		_bitField0 |= _MESSAGE_MASK;
		_messageBufferIdx = -1;
		_messageBufferLen = LightProtoCodec.computeStringUTF8Size(message);
		_cachedSize = -1;
		return this;
	}
	public CommandPartitionedTopicMetadataResponse clearMessage() {
		_bitField0 &= ~_MESSAGE_MASK;
		message = null;
		_messageBufferIdx = -1;
		_messageBufferLen = -1;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _REQUEST_ID_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		if (hasPartitions()) {
			LightProtoCodec.writeVarInt(_b, _PARTITIONS_TAG);
			LightProtoCodec.writeVarInt(_b, partitions);
		}
		LightProtoCodec.writeVarInt(_b, _REQUEST_ID_TAG);
		LightProtoCodec.writeVarInt64(_b, requestId);
		if (hasResponse()) {
			LightProtoCodec.writeVarInt(_b, _RESPONSE_TAG);
			LightProtoCodec.writeVarInt(_b, response.getValue());
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
		return (_b.writerIndex() - _writeIdx);
	}
	public int getSerializedSize() {
		if (_cachedSize > -1) {
			return _cachedSize;
		}

		int _size = 0;
		if (hasPartitions()) {
			_size += _PARTITIONS_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(partitions);
		}
		_size += _REQUEST_ID_TAG_SIZE;
		_size += LightProtoCodec.computeVarInt64Size(requestId);
		if (hasResponse()) {
			_size += _RESPONSE_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(response.getValue());
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
		_cachedSize = _size;
		return _size;
	}
	public void parseFrom(io.netty.buffer.ByteBuf _buffer, int _size) {
		clear();
		int _endIdx = _buffer.readerIndex() + _size;
		while (_buffer.readerIndex() < _endIdx) {
			int _tag = LightProtoCodec.readVarInt(_buffer);
			switch (_tag) {
				case _PARTITIONS_TAG :
					_bitField0 |= _PARTITIONS_MASK;
					partitions = LightProtoCodec.readVarInt(_buffer);
					break;
				case _REQUEST_ID_TAG :
					_bitField0 |= _REQUEST_ID_MASK;
					requestId = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _RESPONSE_TAG :
					LookupType _response = LookupType.valueOf(LightProtoCodec.readVarInt(_buffer));
					if (_response != null) {
						_bitField0 |= _RESPONSE_MASK;
						response = _response;
					}
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
	public CommandPartitionedTopicMetadataResponse clear() {
		message = null;
		_messageBufferIdx = -1;
		_messageBufferLen = -1;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public CommandPartitionedTopicMetadataResponse copyFrom(CommandPartitionedTopicMetadataResponse _other) {
		_cachedSize = -1;
		if (_other.hasPartitions()) {
			setPartitions(_other.partitions);
		}
		if (_other.hasRequestId()) {
			setRequestId(_other.requestId);
		}
		if (_other.hasResponse()) {
			setResponse(_other.response);
		}
		if (_other.hasError()) {
			setError(_other.error);
		}
		if (_other.hasMessage()) {
			setMessage(_other.getMessage());
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
