package org.apache.pulsar.common.api.proto;
public final class CommandNewTxn {
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
	public CommandNewTxn setRequestId(long requestId) {
		this.requestId = requestId;
		_bitField0 |= _REQUEST_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandNewTxn clearRequestId() {
		_bitField0 &= ~_REQUEST_ID_MASK;
		return this;
	}

	private long txnTtlSeconds = 0;
	private static final int _TXN_TTL_SECONDS_FIELD_NUMBER = 2;
	private static final int _TXN_TTL_SECONDS_TAG = (_TXN_TTL_SECONDS_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _TXN_TTL_SECONDS_TAG_SIZE = LightProtoCodec.computeVarIntSize(_TXN_TTL_SECONDS_TAG);
	private static final int _TXN_TTL_SECONDS_MASK = 1 << (1 % 32);
	public boolean hasTxnTtlSeconds() {
		return (_bitField0 & _TXN_TTL_SECONDS_MASK) != 0;
	}
	public long getTxnTtlSeconds() {
		return txnTtlSeconds;
	}
	public CommandNewTxn setTxnTtlSeconds(long txnTtlSeconds) {
		this.txnTtlSeconds = txnTtlSeconds;
		_bitField0 |= _TXN_TTL_SECONDS_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandNewTxn clearTxnTtlSeconds() {
		_bitField0 &= ~_TXN_TTL_SECONDS_MASK;
		txnTtlSeconds = 0;
		return this;
	}

	private long tcId = 0;
	private static final int _TC_ID_FIELD_NUMBER = 3;
	private static final int _TC_ID_TAG = (_TC_ID_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _TC_ID_TAG_SIZE = LightProtoCodec.computeVarIntSize(_TC_ID_TAG);
	private static final int _TC_ID_MASK = 1 << (2 % 32);
	public boolean hasTcId() {
		return (_bitField0 & _TC_ID_MASK) != 0;
	}
	public long getTcId() {
		return tcId;
	}
	public CommandNewTxn setTcId(long tcId) {
		this.tcId = tcId;
		_bitField0 |= _TC_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandNewTxn clearTcId() {
		_bitField0 &= ~_TC_ID_MASK;
		tcId = 0;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _REQUEST_ID_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _REQUEST_ID_TAG);
		LightProtoCodec.writeVarInt64(_b, requestId);
		if (hasTxnTtlSeconds()) {
			LightProtoCodec.writeVarInt(_b, _TXN_TTL_SECONDS_TAG);
			LightProtoCodec.writeVarInt64(_b, txnTtlSeconds);
		}
		if (hasTcId()) {
			LightProtoCodec.writeVarInt(_b, _TC_ID_TAG);
			LightProtoCodec.writeVarInt64(_b, tcId);
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
		if (hasTxnTtlSeconds()) {
			_size += _TXN_TTL_SECONDS_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(txnTtlSeconds);
		}
		if (hasTcId()) {
			_size += _TC_ID_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(tcId);
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
				case _TXN_TTL_SECONDS_TAG :
					_bitField0 |= _TXN_TTL_SECONDS_MASK;
					txnTtlSeconds = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _TC_ID_TAG :
					_bitField0 |= _TC_ID_MASK;
					tcId = LightProtoCodec.readVarInt64(_buffer);
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
	public CommandNewTxn clear() {
		txnTtlSeconds = 0;
		tcId = 0;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public CommandNewTxn copyFrom(CommandNewTxn _other) {
		_cachedSize = -1;
		if (_other.hasRequestId()) {
			setRequestId(_other.requestId);
		}
		if (_other.hasTxnTtlSeconds()) {
			setTxnTtlSeconds(_other.txnTtlSeconds);
		}
		if (_other.hasTcId()) {
			setTcId(_other.tcId);
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
