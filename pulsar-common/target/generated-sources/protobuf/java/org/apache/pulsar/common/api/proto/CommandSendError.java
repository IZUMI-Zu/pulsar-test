package org.apache.pulsar.common.api.proto;
public final class CommandSendError {
	private long producerId;
	private static final int _PRODUCER_ID_FIELD_NUMBER = 1;
	private static final int _PRODUCER_ID_TAG = (_PRODUCER_ID_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _PRODUCER_ID_TAG_SIZE = LightProtoCodec.computeVarIntSize(_PRODUCER_ID_TAG);
	private static final int _PRODUCER_ID_MASK = 1 << (0 % 32);
	public boolean hasProducerId() {
		return (_bitField0 & _PRODUCER_ID_MASK) != 0;
	}
	public long getProducerId() {
		if (!hasProducerId()) {
			throw new IllegalStateException("Field 'producer_id' is not set");
		}
		return producerId;
	}
	public CommandSendError setProducerId(long producerId) {
		this.producerId = producerId;
		_bitField0 |= _PRODUCER_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandSendError clearProducerId() {
		_bitField0 &= ~_PRODUCER_ID_MASK;
		return this;
	}

	private long sequenceId;
	private static final int _SEQUENCE_ID_FIELD_NUMBER = 2;
	private static final int _SEQUENCE_ID_TAG = (_SEQUENCE_ID_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _SEQUENCE_ID_TAG_SIZE = LightProtoCodec.computeVarIntSize(_SEQUENCE_ID_TAG);
	private static final int _SEQUENCE_ID_MASK = 1 << (1 % 32);
	public boolean hasSequenceId() {
		return (_bitField0 & _SEQUENCE_ID_MASK) != 0;
	}
	public long getSequenceId() {
		if (!hasSequenceId()) {
			throw new IllegalStateException("Field 'sequence_id' is not set");
		}
		return sequenceId;
	}
	public CommandSendError setSequenceId(long sequenceId) {
		this.sequenceId = sequenceId;
		_bitField0 |= _SEQUENCE_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandSendError clearSequenceId() {
		_bitField0 &= ~_SEQUENCE_ID_MASK;
		return this;
	}

	private ServerError error;
	private static final int _ERROR_FIELD_NUMBER = 3;
	private static final int _ERROR_TAG = (_ERROR_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _ERROR_TAG_SIZE = LightProtoCodec.computeVarIntSize(_ERROR_TAG);
	private static final int _ERROR_MASK = 1 << (2 % 32);
	public boolean hasError() {
		return (_bitField0 & _ERROR_MASK) != 0;
	}
	public ServerError getError() {
		if (!hasError()) {
			throw new IllegalStateException("Field 'error' is not set");
		}
		return error;
	}
	public CommandSendError setError(ServerError error) {
		this.error = error;
		_bitField0 |= _ERROR_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandSendError clearError() {
		_bitField0 &= ~_ERROR_MASK;
		return this;
	}

	private String message;
	private int _messageBufferIdx = -1;
	private int _messageBufferLen = -1;
	private static final int _MESSAGE_FIELD_NUMBER = 4;
	private static final int _MESSAGE_TAG = (_MESSAGE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _MESSAGE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_MESSAGE_TAG);
	private static final int _MESSAGE_MASK = 1 << (3 % 32);
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
	public CommandSendError setMessage(String message) {
		this.message = message;
		_bitField0 |= _MESSAGE_MASK;
		_messageBufferIdx = -1;
		_messageBufferLen = LightProtoCodec.computeStringUTF8Size(message);
		_cachedSize = -1;
		return this;
	}
	public CommandSendError clearMessage() {
		_bitField0 &= ~_MESSAGE_MASK;
		message = null;
		_messageBufferIdx = -1;
		_messageBufferLen = -1;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _PRODUCER_ID_MASK | _SEQUENCE_ID_MASK | _ERROR_MASK
			| _MESSAGE_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _PRODUCER_ID_TAG);
		LightProtoCodec.writeVarInt64(_b, producerId);
		LightProtoCodec.writeVarInt(_b, _SEQUENCE_ID_TAG);
		LightProtoCodec.writeVarInt64(_b, sequenceId);
		LightProtoCodec.writeVarInt(_b, _ERROR_TAG);
		LightProtoCodec.writeVarInt(_b, error.getValue());
		LightProtoCodec.writeVarInt(_b, _MESSAGE_TAG);
		LightProtoCodec.writeVarInt(_b, _messageBufferLen);
		if (_messageBufferIdx == -1) {
			LightProtoCodec.writeString(_b, message, _messageBufferLen);
		} else {
			_parsedBuffer.getBytes(_messageBufferIdx, _b, _messageBufferLen);
		}
		return (_b.writerIndex() - _writeIdx);
	}
	public int getSerializedSize() {
		if (_cachedSize > -1) {
			return _cachedSize;
		}

		int _size = 0;
		_size += _PRODUCER_ID_TAG_SIZE;
		_size += LightProtoCodec.computeVarInt64Size(producerId);
		_size += _SEQUENCE_ID_TAG_SIZE;
		_size += LightProtoCodec.computeVarInt64Size(sequenceId);
		_size += _ERROR_TAG_SIZE;
		_size += LightProtoCodec.computeVarIntSize(error.getValue());
		_size += _MESSAGE_TAG_SIZE;
		_size += LightProtoCodec.computeVarIntSize(_messageBufferLen);
		_size += _messageBufferLen;
		_cachedSize = _size;
		return _size;
	}
	public void parseFrom(io.netty.buffer.ByteBuf _buffer, int _size) {
		clear();
		int _endIdx = _buffer.readerIndex() + _size;
		while (_buffer.readerIndex() < _endIdx) {
			int _tag = LightProtoCodec.readVarInt(_buffer);
			switch (_tag) {
				case _PRODUCER_ID_TAG :
					_bitField0 |= _PRODUCER_ID_MASK;
					producerId = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _SEQUENCE_ID_TAG :
					_bitField0 |= _SEQUENCE_ID_MASK;
					sequenceId = LightProtoCodec.readVarInt64(_buffer);
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
	public CommandSendError clear() {
		message = null;
		_messageBufferIdx = -1;
		_messageBufferLen = -1;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public CommandSendError copyFrom(CommandSendError _other) {
		_cachedSize = -1;
		if (_other.hasProducerId()) {
			setProducerId(_other.producerId);
		}
		if (_other.hasSequenceId()) {
			setSequenceId(_other.sequenceId);
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
