package org.apache.pulsar.broker.service.resource.usage;
public final class StorageUsage {
	private long totalBytes;
	private static final int _TOTAL_BYTES_FIELD_NUMBER = 1;
	private static final int _TOTAL_BYTES_TAG = (_TOTAL_BYTES_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _TOTAL_BYTES_TAG_SIZE = LightProtoCodec.computeVarIntSize(_TOTAL_BYTES_TAG);
	private static final int _TOTAL_BYTES_MASK = 1 << (0 % 32);
	public boolean hasTotalBytes() {
		return (_bitField0 & _TOTAL_BYTES_MASK) != 0;
	}
	public long getTotalBytes() {
		if (!hasTotalBytes()) {
			throw new IllegalStateException("Field 'totalBytes' is not set");
		}
		return totalBytes;
	}
	public StorageUsage setTotalBytes(long totalBytes) {
		this.totalBytes = totalBytes;
		_bitField0 |= _TOTAL_BYTES_MASK;
		_cachedSize = -1;
		return this;
	}
	public StorageUsage clearTotalBytes() {
		_bitField0 &= ~_TOTAL_BYTES_MASK;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _TOTAL_BYTES_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _TOTAL_BYTES_TAG);
		LightProtoCodec.writeVarInt64(_b, totalBytes);
		return (_b.writerIndex() - _writeIdx);
	}
	public int getSerializedSize() {
		if (_cachedSize > -1) {
			return _cachedSize;
		}

		int _size = 0;
		_size += _TOTAL_BYTES_TAG_SIZE;
		_size += LightProtoCodec.computeVarInt64Size(totalBytes);
		_cachedSize = _size;
		return _size;
	}
	public void parseFrom(io.netty.buffer.ByteBuf _buffer, int _size) {
		clear();
		int _endIdx = _buffer.readerIndex() + _size;
		while (_buffer.readerIndex() < _endIdx) {
			int _tag = LightProtoCodec.readVarInt(_buffer);
			switch (_tag) {
				case _TOTAL_BYTES_TAG :
					_bitField0 |= _TOTAL_BYTES_MASK;
					totalBytes = LightProtoCodec.readVarInt64(_buffer);
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
	public StorageUsage clear() {
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public StorageUsage copyFrom(StorageUsage _other) {
		_cachedSize = -1;
		if (_other.hasTotalBytes()) {
			setTotalBytes(_other.totalBytes);
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
