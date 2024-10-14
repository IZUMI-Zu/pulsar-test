package org.apache.pulsar.common.api.proto.test;
public final class TestMessageIdData {
	private long ledgerId;
	private static final int _LEDGER_ID_FIELD_NUMBER = 1;
	private static final int _LEDGER_ID_TAG = (_LEDGER_ID_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _LEDGER_ID_TAG_SIZE = LightProtoCodec.computeVarIntSize(_LEDGER_ID_TAG);
	private static final int _LEDGER_ID_MASK = 1 << (0 % 32);
	public boolean hasLedgerId() {
		return (_bitField0 & _LEDGER_ID_MASK) != 0;
	}
	public long getLedgerId() {
		if (!hasLedgerId()) {
			throw new IllegalStateException("Field 'ledgerId' is not set");
		}
		return ledgerId;
	}
	public TestMessageIdData setLedgerId(long ledgerId) {
		this.ledgerId = ledgerId;
		_bitField0 |= _LEDGER_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public TestMessageIdData clearLedgerId() {
		_bitField0 &= ~_LEDGER_ID_MASK;
		return this;
	}

	private long entryId;
	private static final int _ENTRY_ID_FIELD_NUMBER = 2;
	private static final int _ENTRY_ID_TAG = (_ENTRY_ID_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _ENTRY_ID_TAG_SIZE = LightProtoCodec.computeVarIntSize(_ENTRY_ID_TAG);
	private static final int _ENTRY_ID_MASK = 1 << (1 % 32);
	public boolean hasEntryId() {
		return (_bitField0 & _ENTRY_ID_MASK) != 0;
	}
	public long getEntryId() {
		if (!hasEntryId()) {
			throw new IllegalStateException("Field 'entryId' is not set");
		}
		return entryId;
	}
	public TestMessageIdData setEntryId(long entryId) {
		this.entryId = entryId;
		_bitField0 |= _ENTRY_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public TestMessageIdData clearEntryId() {
		_bitField0 &= ~_ENTRY_ID_MASK;
		return this;
	}

	private int partition = -1;
	private static final int _PARTITION_FIELD_NUMBER = 3;
	private static final int _PARTITION_TAG = (_PARTITION_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _PARTITION_TAG_SIZE = LightProtoCodec.computeVarIntSize(_PARTITION_TAG);
	private static final int _PARTITION_MASK = 1 << (2 % 32);
	public boolean hasPartition() {
		return (_bitField0 & _PARTITION_MASK) != 0;
	}
	public int getPartition() {
		return partition;
	}
	public TestMessageIdData setPartition(int partition) {
		this.partition = partition;
		_bitField0 |= _PARTITION_MASK;
		_cachedSize = -1;
		return this;
	}
	public TestMessageIdData clearPartition() {
		_bitField0 &= ~_PARTITION_MASK;
		partition = -1;
		return this;
	}

	private int batchIndex = -1;
	private static final int _BATCH_INDEX_FIELD_NUMBER = 4;
	private static final int _BATCH_INDEX_TAG = (_BATCH_INDEX_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _BATCH_INDEX_TAG_SIZE = LightProtoCodec.computeVarIntSize(_BATCH_INDEX_TAG);
	private static final int _BATCH_INDEX_MASK = 1 << (3 % 32);
	public boolean hasBatchIndex() {
		return (_bitField0 & _BATCH_INDEX_MASK) != 0;
	}
	public int getBatchIndex() {
		return batchIndex;
	}
	public TestMessageIdData setBatchIndex(int batchIndex) {
		this.batchIndex = batchIndex;
		_bitField0 |= _BATCH_INDEX_MASK;
		_cachedSize = -1;
		return this;
	}
	public TestMessageIdData clearBatchIndex() {
		_bitField0 &= ~_BATCH_INDEX_MASK;
		batchIndex = -1;
		return this;
	}

	private long[] ackSets = null;
	private int _ackSetsCount = 0;
	private static final int _ACK_SET_FIELD_NUMBER = 5;
	private static final int _ACK_SET_TAG = (_ACK_SET_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _ACK_SET_TAG_SIZE = LightProtoCodec.computeVarIntSize(_ACK_SET_TAG);
	private static final int _ACK_SET_TAG_PACKED = (_ACK_SET_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	public int getAckSetsCount() {
		return _ackSetsCount;
	}
	public long getAckSetAt(int idx) {
		if (idx < 0 || idx >= _ackSetsCount) {
			throw new IndexOutOfBoundsException(
					"Index " + idx + " is out of the list size (" + _ackSetsCount + ") for field 'ack_set'");
		}
		return ackSets[idx];
	}
	public void addAckSet(long ackSet) {
		if (ackSets == null) {
			ackSets = new long[4];
		}
		if (ackSets.length == _ackSetsCount) {
			ackSets = java.util.Arrays.copyOf(ackSets, _ackSetsCount * 2);
		}
		_cachedSize = -1;
		ackSets[_ackSetsCount++] = ackSet;
	}
	public TestMessageIdData clearAckSet() {
		_ackSetsCount = 0;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _LEDGER_ID_MASK | _ENTRY_ID_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _LEDGER_ID_TAG);
		LightProtoCodec.writeVarInt64(_b, ledgerId);
		LightProtoCodec.writeVarInt(_b, _ENTRY_ID_TAG);
		LightProtoCodec.writeVarInt64(_b, entryId);
		if (hasPartition()) {
			LightProtoCodec.writeVarInt(_b, _PARTITION_TAG);
			LightProtoCodec.writeVarInt(_b, partition);
		}
		if (hasBatchIndex()) {
			LightProtoCodec.writeVarInt(_b, _BATCH_INDEX_TAG);
			LightProtoCodec.writeVarInt(_b, batchIndex);
		}
		LightProtoCodec.writeVarInt(_b, _ACK_SET_TAG_PACKED);
		int _ackSetsSize = 0;
		for (int i = 0; i < _ackSetsCount; i++) {
			long _item = ackSets[i];
			_ackSetsSize += LightProtoCodec.computeVarInt64Size(_item);
		}
		LightProtoCodec.writeVarInt(_b, _ackSetsSize);
		for (int i = 0; i < _ackSetsCount; i++) {
			long _item = ackSets[i];
			LightProtoCodec.writeVarInt64(_b, _item);
		}
		return (_b.writerIndex() - _writeIdx);
	}
	public int getSerializedSize() {
		if (_cachedSize > -1) {
			return _cachedSize;
		}

		int _size = 0;
		_size += _LEDGER_ID_TAG_SIZE;
		_size += LightProtoCodec.computeVarInt64Size(ledgerId);
		_size += _ENTRY_ID_TAG_SIZE;
		_size += LightProtoCodec.computeVarInt64Size(entryId);
		if (hasPartition()) {
			_size += _PARTITION_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(partition);
		}
		if (hasBatchIndex()) {
			_size += _BATCH_INDEX_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(batchIndex);
		}
		_size += _ACK_SET_TAG_SIZE;
		int _ackSetsSize = 0;
		for (int i = 0; i < _ackSetsCount; i++) {
			long _item = ackSets[i];
			_ackSetsSize += LightProtoCodec.computeVarInt64Size(_item);
		}
		_size += LightProtoCodec.computeVarIntSize(_ackSetsSize);
		_size += _ackSetsSize;
		_cachedSize = _size;
		return _size;
	}
	public void parseFrom(io.netty.buffer.ByteBuf _buffer, int _size) {
		clear();
		int _endIdx = _buffer.readerIndex() + _size;
		while (_buffer.readerIndex() < _endIdx) {
			int _tag = LightProtoCodec.readVarInt(_buffer);
			switch (_tag) {
				case _LEDGER_ID_TAG :
					_bitField0 |= _LEDGER_ID_MASK;
					ledgerId = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _ENTRY_ID_TAG :
					_bitField0 |= _ENTRY_ID_MASK;
					entryId = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _PARTITION_TAG :
					_bitField0 |= _PARTITION_MASK;
					partition = LightProtoCodec.readVarInt(_buffer);
					break;
				case _BATCH_INDEX_TAG :
					_bitField0 |= _BATCH_INDEX_MASK;
					batchIndex = LightProtoCodec.readVarInt(_buffer);
					break;
				case _ACK_SET_TAG :
					addAckSet(LightProtoCodec.readVarInt64(_buffer));
					break;
				case _ACK_SET_TAG_PACKED :
					int _ackSetSize = LightProtoCodec.readVarInt(_buffer);
					int _ackSetEndIdx = _buffer.readerIndex() + _ackSetSize;
					while (_buffer.readerIndex() < _ackSetEndIdx) {
						addAckSet(LightProtoCodec.readVarInt64(_buffer));
					}
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
	public TestMessageIdData clear() {
		partition = -1;
		batchIndex = -1;
		_ackSetsCount = 0;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public TestMessageIdData copyFrom(TestMessageIdData _other) {
		_cachedSize = -1;
		if (_other.hasLedgerId()) {
			setLedgerId(_other.ledgerId);
		}
		if (_other.hasEntryId()) {
			setEntryId(_other.entryId);
		}
		if (_other.hasPartition()) {
			setPartition(_other.partition);
		}
		if (_other.hasBatchIndex()) {
			setBatchIndex(_other.batchIndex);
		}
		for (int i = 0; i < _other.getAckSetsCount(); i++) {
			addAckSet(_other.getAckSetAt(i));
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
