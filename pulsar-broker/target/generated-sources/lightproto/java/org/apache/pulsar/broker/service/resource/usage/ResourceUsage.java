package org.apache.pulsar.broker.service.resource.usage;
public final class ResourceUsage {
	private String owner;
	private int _ownerBufferIdx = -1;
	private int _ownerBufferLen = -1;
	private static final int _OWNER_FIELD_NUMBER = 1;
	private static final int _OWNER_TAG = (_OWNER_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _OWNER_TAG_SIZE = LightProtoCodec.computeVarIntSize(_OWNER_TAG);
	private static final int _OWNER_MASK = 1 << (0 % 32);
	public boolean hasOwner() {
		return (_bitField0 & _OWNER_MASK) != 0;
	}
	public String getOwner() {
		if (!hasOwner()) {
			throw new IllegalStateException("Field 'owner' is not set");
		}
		if (owner == null) {
			owner = LightProtoCodec.readString(_parsedBuffer, _ownerBufferIdx, _ownerBufferLen);
		}
		return owner;
	}
	public ResourceUsage setOwner(String owner) {
		this.owner = owner;
		_bitField0 |= _OWNER_MASK;
		_ownerBufferIdx = -1;
		_ownerBufferLen = LightProtoCodec.computeStringUTF8Size(owner);
		_cachedSize = -1;
		return this;
	}
	public ResourceUsage clearOwner() {
		_bitField0 &= ~_OWNER_MASK;
		owner = null;
		_ownerBufferIdx = -1;
		_ownerBufferLen = -1;
		return this;
	}

	private NetworkUsage publish;
	private static final int _PUBLISH_FIELD_NUMBER = 2;
	private static final int _PUBLISH_TAG = (_PUBLISH_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _PUBLISH_TAG_SIZE = LightProtoCodec.computeVarIntSize(_PUBLISH_TAG);
	private static final int _PUBLISH_MASK = 1 << (1 % 32);
	public boolean hasPublish() {
		return (_bitField0 & _PUBLISH_MASK) != 0;
	}
	public NetworkUsage getPublish() {
		if (!hasPublish()) {
			throw new IllegalStateException("Field 'publish' is not set");
		}
		return publish;
	}
	public NetworkUsage setPublish() {
		if (publish == null) {
			publish = new NetworkUsage();
		}
		_bitField0 |= _PUBLISH_MASK;
		_cachedSize = -1;
		return publish;
	}
	public ResourceUsage clearPublish() {
		_bitField0 &= ~_PUBLISH_MASK;
		if (hasPublish()) {
			publish.clear();
		}
		return this;
	}

	private NetworkUsage dispatch;
	private static final int _DISPATCH_FIELD_NUMBER = 3;
	private static final int _DISPATCH_TAG = (_DISPATCH_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _DISPATCH_TAG_SIZE = LightProtoCodec.computeVarIntSize(_DISPATCH_TAG);
	private static final int _DISPATCH_MASK = 1 << (2 % 32);
	public boolean hasDispatch() {
		return (_bitField0 & _DISPATCH_MASK) != 0;
	}
	public NetworkUsage getDispatch() {
		if (!hasDispatch()) {
			throw new IllegalStateException("Field 'dispatch' is not set");
		}
		return dispatch;
	}
	public NetworkUsage setDispatch() {
		if (dispatch == null) {
			dispatch = new NetworkUsage();
		}
		_bitField0 |= _DISPATCH_MASK;
		_cachedSize = -1;
		return dispatch;
	}
	public ResourceUsage clearDispatch() {
		_bitField0 &= ~_DISPATCH_MASK;
		if (hasDispatch()) {
			dispatch.clear();
		}
		return this;
	}

	private StorageUsage storage;
	private static final int _STORAGE_FIELD_NUMBER = 4;
	private static final int _STORAGE_TAG = (_STORAGE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _STORAGE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_STORAGE_TAG);
	private static final int _STORAGE_MASK = 1 << (3 % 32);
	public boolean hasStorage() {
		return (_bitField0 & _STORAGE_MASK) != 0;
	}
	public StorageUsage getStorage() {
		if (!hasStorage()) {
			throw new IllegalStateException("Field 'storage' is not set");
		}
		return storage;
	}
	public StorageUsage setStorage() {
		if (storage == null) {
			storage = new StorageUsage();
		}
		_bitField0 |= _STORAGE_MASK;
		_cachedSize = -1;
		return storage;
	}
	public ResourceUsage clearStorage() {
		_bitField0 &= ~_STORAGE_MASK;
		if (hasStorage()) {
			storage.clear();
		}
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _OWNER_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _OWNER_TAG);
		LightProtoCodec.writeVarInt(_b, _ownerBufferLen);
		if (_ownerBufferIdx == -1) {
			LightProtoCodec.writeString(_b, owner, _ownerBufferLen);
		} else {
			_parsedBuffer.getBytes(_ownerBufferIdx, _b, _ownerBufferLen);
		}
		if (hasPublish()) {
			LightProtoCodec.writeVarInt(_b, _PUBLISH_TAG);
			LightProtoCodec.writeVarInt(_b, publish.getSerializedSize());
			publish.writeTo(_b);
		}
		if (hasDispatch()) {
			LightProtoCodec.writeVarInt(_b, _DISPATCH_TAG);
			LightProtoCodec.writeVarInt(_b, dispatch.getSerializedSize());
			dispatch.writeTo(_b);
		}
		if (hasStorage()) {
			LightProtoCodec.writeVarInt(_b, _STORAGE_TAG);
			LightProtoCodec.writeVarInt(_b, storage.getSerializedSize());
			storage.writeTo(_b);
		}
		return (_b.writerIndex() - _writeIdx);
	}
	public int getSerializedSize() {
		if (_cachedSize > -1) {
			return _cachedSize;
		}

		int _size = 0;
		_size += _OWNER_TAG_SIZE;
		_size += LightProtoCodec.computeVarIntSize(_ownerBufferLen);
		_size += _ownerBufferLen;
		if (hasPublish()) {
			_size += LightProtoCodec.computeVarIntSize(_PUBLISH_TAG);
			int MsgsizePublish = publish.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizePublish) + MsgsizePublish;
		}
		if (hasDispatch()) {
			_size += LightProtoCodec.computeVarIntSize(_DISPATCH_TAG);
			int MsgsizeDispatch = dispatch.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeDispatch) + MsgsizeDispatch;
		}
		if (hasStorage()) {
			_size += LightProtoCodec.computeVarIntSize(_STORAGE_TAG);
			int MsgsizeStorage = storage.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeStorage) + MsgsizeStorage;
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
				case _OWNER_TAG :
					_bitField0 |= _OWNER_MASK;
					_ownerBufferLen = LightProtoCodec.readVarInt(_buffer);
					_ownerBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_ownerBufferLen);
					break;
				case _PUBLISH_TAG :
					_bitField0 |= _PUBLISH_MASK;
					int publishSize = LightProtoCodec.readVarInt(_buffer);
					setPublish().parseFrom(_buffer, publishSize);
					break;
				case _DISPATCH_TAG :
					_bitField0 |= _DISPATCH_MASK;
					int dispatchSize = LightProtoCodec.readVarInt(_buffer);
					setDispatch().parseFrom(_buffer, dispatchSize);
					break;
				case _STORAGE_TAG :
					_bitField0 |= _STORAGE_MASK;
					int storageSize = LightProtoCodec.readVarInt(_buffer);
					setStorage().parseFrom(_buffer, storageSize);
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
	public ResourceUsage clear() {
		owner = null;
		_ownerBufferIdx = -1;
		_ownerBufferLen = -1;
		if (hasPublish()) {
			publish.clear();
		}
		if (hasDispatch()) {
			dispatch.clear();
		}
		if (hasStorage()) {
			storage.clear();
		}
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public ResourceUsage copyFrom(ResourceUsage _other) {
		_cachedSize = -1;
		if (_other.hasOwner()) {
			setOwner(_other.getOwner());
		}
		if (_other.hasPublish()) {
			setPublish().copyFrom(_other.publish);
		}
		if (_other.hasDispatch()) {
			setDispatch().copyFrom(_other.dispatch);
		}
		if (_other.hasStorage()) {
			setStorage().copyFrom(_other.storage);
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
