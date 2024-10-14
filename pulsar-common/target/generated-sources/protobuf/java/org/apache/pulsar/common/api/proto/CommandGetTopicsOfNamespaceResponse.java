package org.apache.pulsar.common.api.proto;
public final class CommandGetTopicsOfNamespaceResponse {
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
	public CommandGetTopicsOfNamespaceResponse setRequestId(long requestId) {
		this.requestId = requestId;
		_bitField0 |= _REQUEST_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandGetTopicsOfNamespaceResponse clearRequestId() {
		_bitField0 &= ~_REQUEST_ID_MASK;
		return this;
	}

	private java.util.List<LightProtoCodec.StringHolder> topics = null;
	private int _topicsCount = 0;
	private static final int _TOPICS_FIELD_NUMBER = 2;
	private static final int _TOPICS_TAG = (_TOPICS_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _TOPICS_TAG_SIZE = LightProtoCodec.computeVarIntSize(_TOPICS_TAG);
	public int getTopicsCount() {
		return _topicsCount;
	}
	public String getTopicAt(int idx) {
		if (idx < 0 || idx >= _topicsCount) {
			throw new IndexOutOfBoundsException(
					"Index " + idx + " is out of the list size (" + _topicsCount + ") for field 'topics'");
		}
		LightProtoCodec.StringHolder _sh = topics.get(idx);
		if (_sh.s == null) {
			_sh.s = LightProtoCodec.readString(_parsedBuffer, _sh.idx, _sh.len);
		}
		return _sh.s;
	}
	public java.util.List<String> getTopicsList() {
		if (_topicsCount == 0) {
			return java.util.Collections.emptyList();
		} else {
			java.util.List<String> _l = new java.util.ArrayList<>();
			for (int i = 0; i < _topicsCount; i++) {
				_l.add(getTopicAt(i));
			}
			return _l;
		}
	}
	public void addTopic(String topic) {
		if (topics == null) {
			topics = new java.util.ArrayList<LightProtoCodec.StringHolder>();
		}
		LightProtoCodec.StringHolder _sh = _newTopicStringHolder();
		_cachedSize = -1;
		_sh.s = topic;
		_sh.idx = -1;
		_sh.len = LightProtoCodec.computeStringUTF8Size(_sh.s);
	}
	public CommandGetTopicsOfNamespaceResponse addAllTopics(Iterable<String> topics) {
		for (String _s : topics) {
			addTopic(_s);
		}
		return this;
	}
	private LightProtoCodec.StringHolder _newTopicStringHolder() {
		if (topics == null) {
			topics = new java.util.ArrayList<LightProtoCodec.StringHolder>();
		}
		LightProtoCodec.StringHolder _sh;
		if (topics.size() == _topicsCount) {
			_sh = new LightProtoCodec.StringHolder();
			topics.add(_sh);
		} else {
			_sh = topics.get(_topicsCount);
		}
		_topicsCount++;
		return _sh;
	}
	public CommandGetTopicsOfNamespaceResponse clearTopics() {
		for (int i = 0; i < _topicsCount; i++) {
			LightProtoCodec.StringHolder _sh = topics.get(i);
			_sh.s = null;
			_sh.idx = -1;
			_sh.len = -1;
		}
		_topicsCount = 0;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _REQUEST_ID_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _REQUEST_ID_TAG);
		LightProtoCodec.writeVarInt64(_b, requestId);
		for (int i = 0; i < _topicsCount; i++) {
			LightProtoCodec.StringHolder _sh = topics.get(i);
			LightProtoCodec.writeVarInt(_b, _TOPICS_TAG);
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
		for (int i = 0; i < _topicsCount; i++) {
			LightProtoCodec.StringHolder _sh = topics.get(i);
			_size += _TOPICS_TAG_SIZE;
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
				case _TOPICS_TAG :
					LightProtoCodec.StringHolder _topicsSh = _newTopicStringHolder();
					_topicsSh.len = LightProtoCodec.readVarInt(_buffer);
					_topicsSh.idx = _buffer.readerIndex();
					_buffer.skipBytes(_topicsSh.len);
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
	public CommandGetTopicsOfNamespaceResponse clear() {
		for (int i = 0; i < _topicsCount; i++) {
			LightProtoCodec.StringHolder _sh = topics.get(i);
			_sh.s = null;
			_sh.idx = -1;
			_sh.len = -1;
		}
		_topicsCount = 0;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public CommandGetTopicsOfNamespaceResponse copyFrom(CommandGetTopicsOfNamespaceResponse _other) {
		_cachedSize = -1;
		if (_other.hasRequestId()) {
			setRequestId(_other.requestId);
		}
		for (int i = 0; i < _other.getTopicsCount(); i++) {
			addTopic(_other.getTopicAt(i));
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
