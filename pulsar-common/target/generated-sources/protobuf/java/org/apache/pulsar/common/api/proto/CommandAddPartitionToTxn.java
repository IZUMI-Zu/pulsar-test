package org.apache.pulsar.common.api.proto;
public final class CommandAddPartitionToTxn {
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
	public CommandAddPartitionToTxn setRequestId(long requestId) {
		this.requestId = requestId;
		_bitField0 |= _REQUEST_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandAddPartitionToTxn clearRequestId() {
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
	public CommandAddPartitionToTxn setTxnidLeastBits(long txnidLeastBits) {
		this.txnidLeastBits = txnidLeastBits;
		_bitField0 |= _TXNID_LEAST_BITS_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandAddPartitionToTxn clearTxnidLeastBits() {
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
	public CommandAddPartitionToTxn setTxnidMostBits(long txnidMostBits) {
		this.txnidMostBits = txnidMostBits;
		_bitField0 |= _TXNID_MOST_BITS_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandAddPartitionToTxn clearTxnidMostBits() {
		_bitField0 &= ~_TXNID_MOST_BITS_MASK;
		txnidMostBits = 0;
		return this;
	}

	private java.util.List<LightProtoCodec.StringHolder> partitions = null;
	private int _partitionsCount = 0;
	private static final int _PARTITIONS_FIELD_NUMBER = 4;
	private static final int _PARTITIONS_TAG = (_PARTITIONS_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _PARTITIONS_TAG_SIZE = LightProtoCodec.computeVarIntSize(_PARTITIONS_TAG);
	public int getPartitionsCount() {
		return _partitionsCount;
	}
	public String getPartitionAt(int idx) {
		if (idx < 0 || idx >= _partitionsCount) {
			throw new IndexOutOfBoundsException(
					"Index " + idx + " is out of the list size (" + _partitionsCount + ") for field 'partitions'");
		}
		LightProtoCodec.StringHolder _sh = partitions.get(idx);
		if (_sh.s == null) {
			_sh.s = LightProtoCodec.readString(_parsedBuffer, _sh.idx, _sh.len);
		}
		return _sh.s;
	}
	public java.util.List<String> getPartitionsList() {
		if (_partitionsCount == 0) {
			return java.util.Collections.emptyList();
		} else {
			java.util.List<String> _l = new java.util.ArrayList<>();
			for (int i = 0; i < _partitionsCount; i++) {
				_l.add(getPartitionAt(i));
			}
			return _l;
		}
	}
	public void addPartition(String partition) {
		if (partitions == null) {
			partitions = new java.util.ArrayList<LightProtoCodec.StringHolder>();
		}
		LightProtoCodec.StringHolder _sh = _newPartitionStringHolder();
		_cachedSize = -1;
		_sh.s = partition;
		_sh.idx = -1;
		_sh.len = LightProtoCodec.computeStringUTF8Size(_sh.s);
	}
	public CommandAddPartitionToTxn addAllPartitions(Iterable<String> partitions) {
		for (String _s : partitions) {
			addPartition(_s);
		}
		return this;
	}
	private LightProtoCodec.StringHolder _newPartitionStringHolder() {
		if (partitions == null) {
			partitions = new java.util.ArrayList<LightProtoCodec.StringHolder>();
		}
		LightProtoCodec.StringHolder _sh;
		if (partitions.size() == _partitionsCount) {
			_sh = new LightProtoCodec.StringHolder();
			partitions.add(_sh);
		} else {
			_sh = partitions.get(_partitionsCount);
		}
		_partitionsCount++;
		return _sh;
	}
	public CommandAddPartitionToTxn clearPartitions() {
		for (int i = 0; i < _partitionsCount; i++) {
			LightProtoCodec.StringHolder _sh = partitions.get(i);
			_sh.s = null;
			_sh.idx = -1;
			_sh.len = -1;
		}
		_partitionsCount = 0;
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
		for (int i = 0; i < _partitionsCount; i++) {
			LightProtoCodec.StringHolder _sh = partitions.get(i);
			LightProtoCodec.writeVarInt(_b, _PARTITIONS_TAG);
			LightProtoCodec.writeVarInt(_b, _sh.len);
			if (_sh.idx == -1) {
				LightProtoCodec.writeString(_b, _sh.s, _sh.len);
			} else {
				_parsedBuffer.getBytes(_sh.idx, _b, _sh.len);
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
		for (int i = 0; i < _partitionsCount; i++) {
			LightProtoCodec.StringHolder _sh = partitions.get(i);
			_size += _PARTITIONS_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_sh.len) + _sh.len;
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
				case _PARTITIONS_TAG :
					LightProtoCodec.StringHolder _partitionsSh = _newPartitionStringHolder();
					_partitionsSh.len = LightProtoCodec.readVarInt(_buffer);
					_partitionsSh.idx = _buffer.readerIndex();
					_buffer.skipBytes(_partitionsSh.len);
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
	public CommandAddPartitionToTxn clear() {
		txnidLeastBits = 0;
		txnidMostBits = 0;
		for (int i = 0; i < _partitionsCount; i++) {
			LightProtoCodec.StringHolder _sh = partitions.get(i);
			_sh.s = null;
			_sh.idx = -1;
			_sh.len = -1;
		}
		_partitionsCount = 0;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public CommandAddPartitionToTxn copyFrom(CommandAddPartitionToTxn _other) {
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
		for (int i = 0; i < _other.getPartitionsCount(); i++) {
			addPartition(_other.getPartitionAt(i));
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
