package org.apache.pulsar.common.api.proto;
public final class CommandSend {
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
	public CommandSend setProducerId(long producerId) {
		this.producerId = producerId;
		_bitField0 |= _PRODUCER_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandSend clearProducerId() {
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
	public CommandSend setSequenceId(long sequenceId) {
		this.sequenceId = sequenceId;
		_bitField0 |= _SEQUENCE_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandSend clearSequenceId() {
		_bitField0 &= ~_SEQUENCE_ID_MASK;
		return this;
	}

	private int numMessages = 1;
	private static final int _NUM_MESSAGES_FIELD_NUMBER = 3;
	private static final int _NUM_MESSAGES_TAG = (_NUM_MESSAGES_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _NUM_MESSAGES_TAG_SIZE = LightProtoCodec.computeVarIntSize(_NUM_MESSAGES_TAG);
	private static final int _NUM_MESSAGES_MASK = 1 << (2 % 32);
	public boolean hasNumMessages() {
		return (_bitField0 & _NUM_MESSAGES_MASK) != 0;
	}
	public int getNumMessages() {
		return numMessages;
	}
	public CommandSend setNumMessages(int numMessages) {
		this.numMessages = numMessages;
		_bitField0 |= _NUM_MESSAGES_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandSend clearNumMessages() {
		_bitField0 &= ~_NUM_MESSAGES_MASK;
		numMessages = 1;
		return this;
	}

	private long txnidLeastBits = 0;
	private static final int _TXNID_LEAST_BITS_FIELD_NUMBER = 4;
	private static final int _TXNID_LEAST_BITS_TAG = (_TXNID_LEAST_BITS_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _TXNID_LEAST_BITS_TAG_SIZE = LightProtoCodec.computeVarIntSize(_TXNID_LEAST_BITS_TAG);
	private static final int _TXNID_LEAST_BITS_MASK = 1 << (3 % 32);
	public boolean hasTxnidLeastBits() {
		return (_bitField0 & _TXNID_LEAST_BITS_MASK) != 0;
	}
	public long getTxnidLeastBits() {
		return txnidLeastBits;
	}
	public CommandSend setTxnidLeastBits(long txnidLeastBits) {
		this.txnidLeastBits = txnidLeastBits;
		_bitField0 |= _TXNID_LEAST_BITS_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandSend clearTxnidLeastBits() {
		_bitField0 &= ~_TXNID_LEAST_BITS_MASK;
		txnidLeastBits = 0;
		return this;
	}

	private long txnidMostBits = 0;
	private static final int _TXNID_MOST_BITS_FIELD_NUMBER = 5;
	private static final int _TXNID_MOST_BITS_TAG = (_TXNID_MOST_BITS_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _TXNID_MOST_BITS_TAG_SIZE = LightProtoCodec.computeVarIntSize(_TXNID_MOST_BITS_TAG);
	private static final int _TXNID_MOST_BITS_MASK = 1 << (4 % 32);
	public boolean hasTxnidMostBits() {
		return (_bitField0 & _TXNID_MOST_BITS_MASK) != 0;
	}
	public long getTxnidMostBits() {
		return txnidMostBits;
	}
	public CommandSend setTxnidMostBits(long txnidMostBits) {
		this.txnidMostBits = txnidMostBits;
		_bitField0 |= _TXNID_MOST_BITS_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandSend clearTxnidMostBits() {
		_bitField0 &= ~_TXNID_MOST_BITS_MASK;
		txnidMostBits = 0;
		return this;
	}

	// Add highest sequence id to support batch message with external sequence id
	private long highestSequenceId = 0;
	private static final int _HIGHEST_SEQUENCE_ID_FIELD_NUMBER = 6;
	private static final int _HIGHEST_SEQUENCE_ID_TAG = (_HIGHEST_SEQUENCE_ID_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _HIGHEST_SEQUENCE_ID_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_HIGHEST_SEQUENCE_ID_TAG);
	private static final int _HIGHEST_SEQUENCE_ID_MASK = 1 << (5 % 32);
	public boolean hasHighestSequenceId() {
		return (_bitField0 & _HIGHEST_SEQUENCE_ID_MASK) != 0;
	}
	public long getHighestSequenceId() {
		return highestSequenceId;
	}
	public CommandSend setHighestSequenceId(long highestSequenceId) {
		this.highestSequenceId = highestSequenceId;
		_bitField0 |= _HIGHEST_SEQUENCE_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandSend clearHighestSequenceId() {
		_bitField0 &= ~_HIGHEST_SEQUENCE_ID_MASK;
		highestSequenceId = 0;
		return this;
	}

	private boolean isChunk = false;
	private static final int _IS_CHUNK_FIELD_NUMBER = 7;
	private static final int _IS_CHUNK_TAG = (_IS_CHUNK_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _IS_CHUNK_TAG_SIZE = LightProtoCodec.computeVarIntSize(_IS_CHUNK_TAG);
	private static final int _IS_CHUNK_MASK = 1 << (6 % 32);
	public boolean hasIsChunk() {
		return (_bitField0 & _IS_CHUNK_MASK) != 0;
	}
	public boolean isIsChunk() {
		return isChunk;
	}
	public CommandSend setIsChunk(boolean isChunk) {
		this.isChunk = isChunk;
		_bitField0 |= _IS_CHUNK_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandSend clearIsChunk() {
		_bitField0 &= ~_IS_CHUNK_MASK;
		isChunk = false;
		return this;
	}

	private boolean marker = false;
	private static final int _MARKER_FIELD_NUMBER = 8;
	private static final int _MARKER_TAG = (_MARKER_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _MARKER_TAG_SIZE = LightProtoCodec.computeVarIntSize(_MARKER_TAG);
	private static final int _MARKER_MASK = 1 << (7 % 32);
	public boolean hasMarker() {
		return (_bitField0 & _MARKER_MASK) != 0;
	}
	public boolean isMarker() {
		return marker;
	}
	public CommandSend setMarker(boolean marker) {
		this.marker = marker;
		_bitField0 |= _MARKER_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandSend clearMarker() {
		_bitField0 &= ~_MARKER_MASK;
		marker = false;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _PRODUCER_ID_MASK | _SEQUENCE_ID_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _PRODUCER_ID_TAG);
		LightProtoCodec.writeVarInt64(_b, producerId);
		LightProtoCodec.writeVarInt(_b, _SEQUENCE_ID_TAG);
		LightProtoCodec.writeVarInt64(_b, sequenceId);
		if (hasNumMessages()) {
			LightProtoCodec.writeVarInt(_b, _NUM_MESSAGES_TAG);
			LightProtoCodec.writeVarInt(_b, numMessages);
		}
		if (hasTxnidLeastBits()) {
			LightProtoCodec.writeVarInt(_b, _TXNID_LEAST_BITS_TAG);
			LightProtoCodec.writeVarInt64(_b, txnidLeastBits);
		}
		if (hasTxnidMostBits()) {
			LightProtoCodec.writeVarInt(_b, _TXNID_MOST_BITS_TAG);
			LightProtoCodec.writeVarInt64(_b, txnidMostBits);
		}
		if (hasHighestSequenceId()) {
			LightProtoCodec.writeVarInt(_b, _HIGHEST_SEQUENCE_ID_TAG);
			LightProtoCodec.writeVarInt64(_b, highestSequenceId);
		}
		if (hasIsChunk()) {
			LightProtoCodec.writeVarInt(_b, _IS_CHUNK_TAG);
			_b.writeBoolean(isChunk);
		}
		if (hasMarker()) {
			LightProtoCodec.writeVarInt(_b, _MARKER_TAG);
			_b.writeBoolean(marker);
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
		if (hasNumMessages()) {
			_size += _NUM_MESSAGES_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(numMessages);
		}
		if (hasTxnidLeastBits()) {
			_size += _TXNID_LEAST_BITS_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(txnidLeastBits);
		}
		if (hasTxnidMostBits()) {
			_size += _TXNID_MOST_BITS_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(txnidMostBits);
		}
		if (hasHighestSequenceId()) {
			_size += _HIGHEST_SEQUENCE_ID_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(highestSequenceId);
		}
		if (hasIsChunk()) {
			_size += _IS_CHUNK_TAG_SIZE;
			_size += 1;
		}
		if (hasMarker()) {
			_size += _MARKER_TAG_SIZE;
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
				case _PRODUCER_ID_TAG :
					_bitField0 |= _PRODUCER_ID_MASK;
					producerId = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _SEQUENCE_ID_TAG :
					_bitField0 |= _SEQUENCE_ID_MASK;
					sequenceId = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _NUM_MESSAGES_TAG :
					_bitField0 |= _NUM_MESSAGES_MASK;
					numMessages = LightProtoCodec.readVarInt(_buffer);
					break;
				case _TXNID_LEAST_BITS_TAG :
					_bitField0 |= _TXNID_LEAST_BITS_MASK;
					txnidLeastBits = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _TXNID_MOST_BITS_TAG :
					_bitField0 |= _TXNID_MOST_BITS_MASK;
					txnidMostBits = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _HIGHEST_SEQUENCE_ID_TAG :
					_bitField0 |= _HIGHEST_SEQUENCE_ID_MASK;
					highestSequenceId = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _IS_CHUNK_TAG :
					_bitField0 |= _IS_CHUNK_MASK;
					isChunk = LightProtoCodec.readVarInt(_buffer) == 1;
					break;
				case _MARKER_TAG :
					_bitField0 |= _MARKER_MASK;
					marker = LightProtoCodec.readVarInt(_buffer) == 1;
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
	public CommandSend clear() {
		numMessages = 1;
		txnidLeastBits = 0;
		txnidMostBits = 0;
		highestSequenceId = 0;
		isChunk = false;
		marker = false;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public CommandSend copyFrom(CommandSend _other) {
		_cachedSize = -1;
		if (_other.hasProducerId()) {
			setProducerId(_other.producerId);
		}
		if (_other.hasSequenceId()) {
			setSequenceId(_other.sequenceId);
		}
		if (_other.hasNumMessages()) {
			setNumMessages(_other.numMessages);
		}
		if (_other.hasTxnidLeastBits()) {
			setTxnidLeastBits(_other.txnidLeastBits);
		}
		if (_other.hasTxnidMostBits()) {
			setTxnidMostBits(_other.txnidMostBits);
		}
		if (_other.hasHighestSequenceId()) {
			setHighestSequenceId(_other.highestSequenceId);
		}
		if (_other.hasIsChunk()) {
			setIsChunk(_other.isChunk);
		}
		if (_other.hasMarker()) {
			setMarker(_other.marker);
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
