package org.apache.pulsar.common.api.proto;
public final class CommandEndTxn {
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
	public CommandEndTxn setRequestId(long requestId) {
		this.requestId = requestId;
		_bitField0 |= _REQUEST_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandEndTxn clearRequestId() {
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
	public CommandEndTxn setTxnidLeastBits(long txnidLeastBits) {
		this.txnidLeastBits = txnidLeastBits;
		_bitField0 |= _TXNID_LEAST_BITS_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandEndTxn clearTxnidLeastBits() {
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
	public CommandEndTxn setTxnidMostBits(long txnidMostBits) {
		this.txnidMostBits = txnidMostBits;
		_bitField0 |= _TXNID_MOST_BITS_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandEndTxn clearTxnidMostBits() {
		_bitField0 &= ~_TXNID_MOST_BITS_MASK;
		txnidMostBits = 0;
		return this;
	}

	private TxnAction txnAction;
	private static final int _TXN_ACTION_FIELD_NUMBER = 4;
	private static final int _TXN_ACTION_TAG = (_TXN_ACTION_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _TXN_ACTION_TAG_SIZE = LightProtoCodec.computeVarIntSize(_TXN_ACTION_TAG);
	private static final int _TXN_ACTION_MASK = 1 << (3 % 32);
	public boolean hasTxnAction() {
		return (_bitField0 & _TXN_ACTION_MASK) != 0;
	}
	public TxnAction getTxnAction() {
		if (!hasTxnAction()) {
			throw new IllegalStateException("Field 'txn_action' is not set");
		}
		return txnAction;
	}
	public CommandEndTxn setTxnAction(TxnAction txnAction) {
		this.txnAction = txnAction;
		_bitField0 |= _TXN_ACTION_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandEndTxn clearTxnAction() {
		_bitField0 &= ~_TXN_ACTION_MASK;
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
		if (hasTxnAction()) {
			LightProtoCodec.writeVarInt(_b, _TXN_ACTION_TAG);
			LightProtoCodec.writeVarInt(_b, txnAction.getValue());
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
		if (hasTxnAction()) {
			_size += _TXN_ACTION_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(txnAction.getValue());
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
				case _TXN_ACTION_TAG :
					TxnAction _txnAction = TxnAction.valueOf(LightProtoCodec.readVarInt(_buffer));
					if (_txnAction != null) {
						_bitField0 |= _TXN_ACTION_MASK;
						txnAction = _txnAction;
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
	public CommandEndTxn clear() {
		txnidLeastBits = 0;
		txnidMostBits = 0;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public CommandEndTxn copyFrom(CommandEndTxn _other) {
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
		if (_other.hasTxnAction()) {
			setTxnAction(_other.txnAction);
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
