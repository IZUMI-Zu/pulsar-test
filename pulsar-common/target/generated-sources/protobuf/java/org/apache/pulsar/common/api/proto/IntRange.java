package org.apache.pulsar.common.api.proto;
public final class IntRange {
	private int start;
	private static final int _START_FIELD_NUMBER = 1;
	private static final int _START_TAG = (_START_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _START_TAG_SIZE = LightProtoCodec.computeVarIntSize(_START_TAG);
	private static final int _START_MASK = 1 << (0 % 32);
	public boolean hasStart() {
		return (_bitField0 & _START_MASK) != 0;
	}
	public int getStart() {
		if (!hasStart()) {
			throw new IllegalStateException("Field 'start' is not set");
		}
		return start;
	}
	public IntRange setStart(int start) {
		this.start = start;
		_bitField0 |= _START_MASK;
		_cachedSize = -1;
		return this;
	}
	public IntRange clearStart() {
		_bitField0 &= ~_START_MASK;
		return this;
	}

	private int end;
	private static final int _END_FIELD_NUMBER = 2;
	private static final int _END_TAG = (_END_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _END_TAG_SIZE = LightProtoCodec.computeVarIntSize(_END_TAG);
	private static final int _END_MASK = 1 << (1 % 32);
	public boolean hasEnd() {
		return (_bitField0 & _END_MASK) != 0;
	}
	public int getEnd() {
		if (!hasEnd()) {
			throw new IllegalStateException("Field 'end' is not set");
		}
		return end;
	}
	public IntRange setEnd(int end) {
		this.end = end;
		_bitField0 |= _END_MASK;
		_cachedSize = -1;
		return this;
	}
	public IntRange clearEnd() {
		_bitField0 &= ~_END_MASK;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _START_MASK | _END_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _START_TAG);
		LightProtoCodec.writeVarInt(_b, start);
		LightProtoCodec.writeVarInt(_b, _END_TAG);
		LightProtoCodec.writeVarInt(_b, end);
		return (_b.writerIndex() - _writeIdx);
	}
	public int getSerializedSize() {
		if (_cachedSize > -1) {
			return _cachedSize;
		}

		int _size = 0;
		_size += _START_TAG_SIZE;
		_size += LightProtoCodec.computeVarIntSize(start);
		_size += _END_TAG_SIZE;
		_size += LightProtoCodec.computeVarIntSize(end);
		_cachedSize = _size;
		return _size;
	}
	public void parseFrom(io.netty.buffer.ByteBuf _buffer, int _size) {
		clear();
		int _endIdx = _buffer.readerIndex() + _size;
		while (_buffer.readerIndex() < _endIdx) {
			int _tag = LightProtoCodec.readVarInt(_buffer);
			switch (_tag) {
				case _START_TAG :
					_bitField0 |= _START_MASK;
					start = LightProtoCodec.readVarInt(_buffer);
					break;
				case _END_TAG :
					_bitField0 |= _END_MASK;
					end = LightProtoCodec.readVarInt(_buffer);
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
	public IntRange clear() {
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public IntRange copyFrom(IntRange _other) {
		_cachedSize = -1;
		if (_other.hasStart()) {
			setStart(_other.start);
		}
		if (_other.hasEnd()) {
			setEnd(_other.end);
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
