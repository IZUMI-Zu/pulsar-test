package org.apache.pulsar.common.api.proto;
public final class CommandEndTxnOnPartitionResponse {
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
	public CommandEndTxnOnPartitionResponse setRequestId(long requestId) {
		this.requestId = requestId;
		_bitField0 |= _REQUEST_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandEndTxnOnPartitionResponse clearRequestId() {
		_bitField0 &= ~_REQUEST_ID_MASK;
		return this;
	}

	private long txnidLeastBits = 0;
	private static final int _TXNID_LEAST_BITS_FIELD_NUMBER = 2;
	private static final int _TXNID_LEAST_BITS_TAG = (_TXNID_LEAST_BITS_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _TXNID_LEAST_BITS_TAG_SIZE = LightProtoCodec.computeVarIntSize(_TXNID_LEAST_BITS_TAG);
	private static final int _TXNID_LEAST_BITS_MASK = 1 << (1 % 32);
	public boolean hasTxnidLeastBits() {
		return (_bitField0 & _TXNID_LEAST_BITS_MASK) != 0;
	}
	public long getTxnidLeastBits() {
		return txnidLeastBits;
	}
	public CommandEndTxnOnPartitionResponse setTxnidLeastBits(long txnidLeastBits) {
		this.txnidLeastBits = txnidLeastBits;
		_bitField0 |= _TXNID_LEAST_BITS_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandEndTxnOnPartitionResponse clearTxnidLeastBits() {
		_bitField0 &= ~_TXNID_LEAST_BITS_MASK;
		txnidLeastBits = 0;
		return this;
	}

	private long txnidMostBits = 0;
	private static final int _TXNID_MOST_BITS_FIELD_NUMBER = 3;
	private static final int _TXNID_MOST_BITS_TAG = (_TXNID_MOST_BITS_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _TXNID_MOST_BITS_TAG_SIZE = LightProtoCodec.computeVarIntSize(_TXNID_MOST_BITS_TAG);
	private static final int _TXNID_MOST_BITS_MASK = 1 << (2 % 32);
	public boolean hasTxnidMostBits() {
		return (_bitField0 & _TXNID_MOST_BITS_MASK) != 0;
	}
	public long getTxnidMostBits() {
		return txnidMostBits;
	}
	public CommandEndTxnOnPartitionResponse setTxnidMostBits(long txnidMostBits) {
		this.txnidMostBits = txnidMostBits;
		_bitField0 |= _TXNID_MOST_BITS_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandEndTxnOnPartitionResponse clearTxnidMostBits() {
		_bitField0 &= ~_TXNID_MOST_BITS_MASK;
		txnidMostBits = 0;
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
	public CommandEndTxnOnPartitionResponse setError(ServerError error) {
		this.error = error;
		_bitField0 |= _ERROR_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandEndTxnOnPartitionResponse clearError() {
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
	public CommandEndTxnOnPartitionResponse setMessage(String message) {
		this.message = message;
		_bitField0 |= _MESSAGE_MASK;
		_messageBufferIdx = -1;
		_messageBufferLen = LightProtoCodec.computeStringUTF8Size(message);
		_cachedSize = -1;
		return this;
	}
	public CommandEndTxnOnPartitionResponse clearMessage() {
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
		LightProtoCodec.writeVarInt(_b, _REQUEST_ID_TAG);
		LightProtoCodec.writeVarInt64(_b, requestId);
		if (hasTxnidLeastBits()) {
			LightProtoCodec.writeVarInt(_b, _TXNID_LEAST_BITS_TAG);
			LightProtoCodec.writeVarInt64(_b, txnidLeastBits);
		}
		if (hasTxnidMostBits()) {
			LightProtoCodec.writeVarInt(_b, _TXNID_MOST_BITS_TAG);
			LightProtoCodec.writeVarInt64(_b, txnidMostBits);
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
		_size += _REQUEST_ID_TAG_SIZE;
		_size += LightProtoCodec.computeVarInt64Size(requestId);
		if (hasTxnidLeastBits()) {
			_size += _TXNID_LEAST_BITS_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(txnidLeastBits);
		}
		if (hasTxnidMostBits()) {
			_size += _TXNID_MOST_BITS_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(txnidMostBits);
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
				case _REQUEST_ID_TAG :
					_bitField0 |= _REQUEST_ID_MASK;
					requestId = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _TXNID_LEAST_BITS_TAG :
					_bitField0 |= _TXNID_LEAST_BITS_MASK;
					txnidLeastBits = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _TXNID_MOST_BITS_TAG :
					_bitField0 |= _TXNID_MOST_BITS_MASK;
					txnidMostBits = LightProtoCodec.readVarInt64(_buffer);
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
	public CommandEndTxnOnPartitionResponse clear() {
		txnidLeastBits = 0;
		txnidMostBits = 0;
		message = null;
		_messageBufferIdx = -1;
		_messageBufferLen = -1;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public CommandEndTxnOnPartitionResponse copyFrom(CommandEndTxnOnPartitionResponse _other) {
		_cachedSize = -1;
		if (_other.hasRequestId()) {
			setRequestId(_other.requestId);
		}
		if (_other.hasTxnidLeastBits()) {
			setTxnidLeastBits(_other.txnidLeastBits);
		}
		if (_other.hasTxnidMostBits()) {
			setTxnidMostBits(_other.txnidMostBits);
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
