package org.apache.pulsar.common.api.proto;
public final class MarkersMessageIdData {
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
			throw new IllegalStateException("Field 'ledger_id' is not set");
		}
		return ledgerId;
	}
	public MarkersMessageIdData setLedgerId(long ledgerId) {
		this.ledgerId = ledgerId;
		_bitField0 |= _LEDGER_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public MarkersMessageIdData clearLedgerId() {
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
			throw new IllegalStateException("Field 'entry_id' is not set");
		}
		return entryId;
	}
	public MarkersMessageIdData setEntryId(long entryId) {
		this.entryId = entryId;
		_bitField0 |= _ENTRY_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public MarkersMessageIdData clearEntryId() {
		_bitField0 &= ~_ENTRY_ID_MASK;
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
	public MarkersMessageIdData clear() {
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public MarkersMessageIdData copyFrom(MarkersMessageIdData _other) {
		_cachedSize = -1;
		if (_other.hasLedgerId()) {
			setLedgerId(_other.ledgerId);
		}
		if (_other.hasEntryId()) {
			setEntryId(_other.entryId);
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
