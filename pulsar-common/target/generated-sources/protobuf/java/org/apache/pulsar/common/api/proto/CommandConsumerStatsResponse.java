package org.apache.pulsar.common.api.proto;
public final class CommandConsumerStatsResponse {
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
	public CommandConsumerStatsResponse setRequestId(long requestId) {
		this.requestId = requestId;
		_bitField0 |= _REQUEST_ID_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandConsumerStatsResponse clearRequestId() {
		_bitField0 &= ~_REQUEST_ID_MASK;
		return this;
	}

	private ServerError errorCode;
	private static final int _ERROR_CODE_FIELD_NUMBER = 2;
	private static final int _ERROR_CODE_TAG = (_ERROR_CODE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _ERROR_CODE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_ERROR_CODE_TAG);
	private static final int _ERROR_CODE_MASK = 1 << (1 % 32);
	public boolean hasErrorCode() {
		return (_bitField0 & _ERROR_CODE_MASK) != 0;
	}
	public ServerError getErrorCode() {
		if (!hasErrorCode()) {
			throw new IllegalStateException("Field 'error_code' is not set");
		}
		return errorCode;
	}
	public CommandConsumerStatsResponse setErrorCode(ServerError errorCode) {
		this.errorCode = errorCode;
		_bitField0 |= _ERROR_CODE_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandConsumerStatsResponse clearErrorCode() {
		_bitField0 &= ~_ERROR_CODE_MASK;
		return this;
	}

	private String errorMessage;
	private int _errorMessageBufferIdx = -1;
	private int _errorMessageBufferLen = -1;
	private static final int _ERROR_MESSAGE_FIELD_NUMBER = 3;
	private static final int _ERROR_MESSAGE_TAG = (_ERROR_MESSAGE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _ERROR_MESSAGE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_ERROR_MESSAGE_TAG);
	private static final int _ERROR_MESSAGE_MASK = 1 << (2 % 32);
	public boolean hasErrorMessage() {
		return (_bitField0 & _ERROR_MESSAGE_MASK) != 0;
	}
	public String getErrorMessage() {
		if (!hasErrorMessage()) {
			throw new IllegalStateException("Field 'error_message' is not set");
		}
		if (errorMessage == null) {
			errorMessage = LightProtoCodec.readString(_parsedBuffer, _errorMessageBufferIdx, _errorMessageBufferLen);
		}
		return errorMessage;
	}
	public CommandConsumerStatsResponse setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
		_bitField0 |= _ERROR_MESSAGE_MASK;
		_errorMessageBufferIdx = -1;
		_errorMessageBufferLen = LightProtoCodec.computeStringUTF8Size(errorMessage);
		_cachedSize = -1;
		return this;
	}
	public CommandConsumerStatsResponse clearErrorMessage() {
		_bitField0 &= ~_ERROR_MESSAGE_MASK;
		errorMessage = null;
		_errorMessageBufferIdx = -1;
		_errorMessageBufferLen = -1;
		return this;
	}

	// Total rate of messages delivered to the consumer. msg/s
	private double msgRateOut;
	private static final int _MSG_RATE_OUT_FIELD_NUMBER = 4;
	private static final int _MSG_RATE_OUT_TAG = (_MSG_RATE_OUT_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_FIXED64;
	private static final int _MSG_RATE_OUT_TAG_SIZE = LightProtoCodec.computeVarIntSize(_MSG_RATE_OUT_TAG);
	private static final int _MSG_RATE_OUT_MASK = 1 << (3 % 32);
	public boolean hasMsgRateOut() {
		return (_bitField0 & _MSG_RATE_OUT_MASK) != 0;
	}
	public double getMsgRateOut() {
		if (!hasMsgRateOut()) {
			throw new IllegalStateException("Field 'msgRateOut' is not set");
		}
		return msgRateOut;
	}
	public CommandConsumerStatsResponse setMsgRateOut(double msgRateOut) {
		this.msgRateOut = msgRateOut;
		_bitField0 |= _MSG_RATE_OUT_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandConsumerStatsResponse clearMsgRateOut() {
		_bitField0 &= ~_MSG_RATE_OUT_MASK;
		return this;
	}

	// Total throughput delivered to the consumer. bytes/s
	private double msgThroughputOut;
	private static final int _MSG_THROUGHPUT_OUT_FIELD_NUMBER = 5;
	private static final int _MSG_THROUGHPUT_OUT_TAG = (_MSG_THROUGHPUT_OUT_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_FIXED64;
	private static final int _MSG_THROUGHPUT_OUT_TAG_SIZE = LightProtoCodec.computeVarIntSize(_MSG_THROUGHPUT_OUT_TAG);
	private static final int _MSG_THROUGHPUT_OUT_MASK = 1 << (4 % 32);
	public boolean hasMsgThroughputOut() {
		return (_bitField0 & _MSG_THROUGHPUT_OUT_MASK) != 0;
	}
	public double getMsgThroughputOut() {
		if (!hasMsgThroughputOut()) {
			throw new IllegalStateException("Field 'msgThroughputOut' is not set");
		}
		return msgThroughputOut;
	}
	public CommandConsumerStatsResponse setMsgThroughputOut(double msgThroughputOut) {
		this.msgThroughputOut = msgThroughputOut;
		_bitField0 |= _MSG_THROUGHPUT_OUT_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandConsumerStatsResponse clearMsgThroughputOut() {
		_bitField0 &= ~_MSG_THROUGHPUT_OUT_MASK;
		return this;
	}

	// Total rate of messages redelivered by this consumer. msg/s
	private double msgRateRedeliver;
	private static final int _MSG_RATE_REDELIVER_FIELD_NUMBER = 6;
	private static final int _MSG_RATE_REDELIVER_TAG = (_MSG_RATE_REDELIVER_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_FIXED64;
	private static final int _MSG_RATE_REDELIVER_TAG_SIZE = LightProtoCodec.computeVarIntSize(_MSG_RATE_REDELIVER_TAG);
	private static final int _MSG_RATE_REDELIVER_MASK = 1 << (5 % 32);
	public boolean hasMsgRateRedeliver() {
		return (_bitField0 & _MSG_RATE_REDELIVER_MASK) != 0;
	}
	public double getMsgRateRedeliver() {
		if (!hasMsgRateRedeliver()) {
			throw new IllegalStateException("Field 'msgRateRedeliver' is not set");
		}
		return msgRateRedeliver;
	}
	public CommandConsumerStatsResponse setMsgRateRedeliver(double msgRateRedeliver) {
		this.msgRateRedeliver = msgRateRedeliver;
		_bitField0 |= _MSG_RATE_REDELIVER_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandConsumerStatsResponse clearMsgRateRedeliver() {
		_bitField0 &= ~_MSG_RATE_REDELIVER_MASK;
		return this;
	}

	// Name of the consumer
	private String consumerName;
	private int _consumerNameBufferIdx = -1;
	private int _consumerNameBufferLen = -1;
	private static final int _CONSUMER_NAME_FIELD_NUMBER = 7;
	private static final int _CONSUMER_NAME_TAG = (_CONSUMER_NAME_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _CONSUMER_NAME_TAG_SIZE = LightProtoCodec.computeVarIntSize(_CONSUMER_NAME_TAG);
	private static final int _CONSUMER_NAME_MASK = 1 << (6 % 32);
	public boolean hasConsumerName() {
		return (_bitField0 & _CONSUMER_NAME_MASK) != 0;
	}
	public String getConsumerName() {
		if (!hasConsumerName()) {
			throw new IllegalStateException("Field 'consumerName' is not set");
		}
		if (consumerName == null) {
			consumerName = LightProtoCodec.readString(_parsedBuffer, _consumerNameBufferIdx, _consumerNameBufferLen);
		}
		return consumerName;
	}
	public CommandConsumerStatsResponse setConsumerName(String consumerName) {
		this.consumerName = consumerName;
		_bitField0 |= _CONSUMER_NAME_MASK;
		_consumerNameBufferIdx = -1;
		_consumerNameBufferLen = LightProtoCodec.computeStringUTF8Size(consumerName);
		_cachedSize = -1;
		return this;
	}
	public CommandConsumerStatsResponse clearConsumerName() {
		_bitField0 &= ~_CONSUMER_NAME_MASK;
		consumerName = null;
		_consumerNameBufferIdx = -1;
		_consumerNameBufferLen = -1;
		return this;
	}

	// Number of available message permits for the consumer
	private long availablePermits;
	private static final int _AVAILABLE_PERMITS_FIELD_NUMBER = 8;
	private static final int _AVAILABLE_PERMITS_TAG = (_AVAILABLE_PERMITS_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _AVAILABLE_PERMITS_TAG_SIZE = LightProtoCodec.computeVarIntSize(_AVAILABLE_PERMITS_TAG);
	private static final int _AVAILABLE_PERMITS_MASK = 1 << (7 % 32);
	public boolean hasAvailablePermits() {
		return (_bitField0 & _AVAILABLE_PERMITS_MASK) != 0;
	}
	public long getAvailablePermits() {
		if (!hasAvailablePermits()) {
			throw new IllegalStateException("Field 'availablePermits' is not set");
		}
		return availablePermits;
	}
	public CommandConsumerStatsResponse setAvailablePermits(long availablePermits) {
		this.availablePermits = availablePermits;
		_bitField0 |= _AVAILABLE_PERMITS_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandConsumerStatsResponse clearAvailablePermits() {
		_bitField0 &= ~_AVAILABLE_PERMITS_MASK;
		return this;
	}

	// Number of unacknowledged messages for the consumer
	private long unackedMessages;
	private static final int _UNACKED_MESSAGES_FIELD_NUMBER = 9;
	private static final int _UNACKED_MESSAGES_TAG = (_UNACKED_MESSAGES_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _UNACKED_MESSAGES_TAG_SIZE = LightProtoCodec.computeVarIntSize(_UNACKED_MESSAGES_TAG);
	private static final int _UNACKED_MESSAGES_MASK = 1 << (8 % 32);
	public boolean hasUnackedMessages() {
		return (_bitField0 & _UNACKED_MESSAGES_MASK) != 0;
	}
	public long getUnackedMessages() {
		if (!hasUnackedMessages()) {
			throw new IllegalStateException("Field 'unackedMessages' is not set");
		}
		return unackedMessages;
	}
	public CommandConsumerStatsResponse setUnackedMessages(long unackedMessages) {
		this.unackedMessages = unackedMessages;
		_bitField0 |= _UNACKED_MESSAGES_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandConsumerStatsResponse clearUnackedMessages() {
		_bitField0 &= ~_UNACKED_MESSAGES_MASK;
		return this;
	}

	// Flag to verify if consumer is blocked due to reaching threshold of unacked
	// messages
	private boolean blockedConsumerOnUnackedMsgs;
	private static final int _BLOCKED_CONSUMER_ON_UNACKED_MSGS_FIELD_NUMBER = 10;
	private static final int _BLOCKED_CONSUMER_ON_UNACKED_MSGS_TAG = (_BLOCKED_CONSUMER_ON_UNACKED_MSGS_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _BLOCKED_CONSUMER_ON_UNACKED_MSGS_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_BLOCKED_CONSUMER_ON_UNACKED_MSGS_TAG);
	private static final int _BLOCKED_CONSUMER_ON_UNACKED_MSGS_MASK = 1 << (9 % 32);
	public boolean hasBlockedConsumerOnUnackedMsgs() {
		return (_bitField0 & _BLOCKED_CONSUMER_ON_UNACKED_MSGS_MASK) != 0;
	}
	public boolean isBlockedConsumerOnUnackedMsgs() {
		if (!hasBlockedConsumerOnUnackedMsgs()) {
			throw new IllegalStateException("Field 'blockedConsumerOnUnackedMsgs' is not set");
		}
		return blockedConsumerOnUnackedMsgs;
	}
	public CommandConsumerStatsResponse setBlockedConsumerOnUnackedMsgs(boolean blockedConsumerOnUnackedMsgs) {
		this.blockedConsumerOnUnackedMsgs = blockedConsumerOnUnackedMsgs;
		_bitField0 |= _BLOCKED_CONSUMER_ON_UNACKED_MSGS_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandConsumerStatsResponse clearBlockedConsumerOnUnackedMsgs() {
		_bitField0 &= ~_BLOCKED_CONSUMER_ON_UNACKED_MSGS_MASK;
		return this;
	}

	// Address of this consumer
	private String address;
	private int _addressBufferIdx = -1;
	private int _addressBufferLen = -1;
	private static final int _ADDRESS_FIELD_NUMBER = 11;
	private static final int _ADDRESS_TAG = (_ADDRESS_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _ADDRESS_TAG_SIZE = LightProtoCodec.computeVarIntSize(_ADDRESS_TAG);
	private static final int _ADDRESS_MASK = 1 << (10 % 32);
	public boolean hasAddress() {
		return (_bitField0 & _ADDRESS_MASK) != 0;
	}
	public String getAddress() {
		if (!hasAddress()) {
			throw new IllegalStateException("Field 'address' is not set");
		}
		if (address == null) {
			address = LightProtoCodec.readString(_parsedBuffer, _addressBufferIdx, _addressBufferLen);
		}
		return address;
	}
	public CommandConsumerStatsResponse setAddress(String address) {
		this.address = address;
		_bitField0 |= _ADDRESS_MASK;
		_addressBufferIdx = -1;
		_addressBufferLen = LightProtoCodec.computeStringUTF8Size(address);
		_cachedSize = -1;
		return this;
	}
	public CommandConsumerStatsResponse clearAddress() {
		_bitField0 &= ~_ADDRESS_MASK;
		address = null;
		_addressBufferIdx = -1;
		_addressBufferLen = -1;
		return this;
	}

	// Timestamp of connection
	private String connectedSince;
	private int _connectedSinceBufferIdx = -1;
	private int _connectedSinceBufferLen = -1;
	private static final int _CONNECTED_SINCE_FIELD_NUMBER = 12;
	private static final int _CONNECTED_SINCE_TAG = (_CONNECTED_SINCE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _CONNECTED_SINCE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_CONNECTED_SINCE_TAG);
	private static final int _CONNECTED_SINCE_MASK = 1 << (11 % 32);
	public boolean hasConnectedSince() {
		return (_bitField0 & _CONNECTED_SINCE_MASK) != 0;
	}
	public String getConnectedSince() {
		if (!hasConnectedSince()) {
			throw new IllegalStateException("Field 'connectedSince' is not set");
		}
		if (connectedSince == null) {
			connectedSince = LightProtoCodec.readString(_parsedBuffer, _connectedSinceBufferIdx,
					_connectedSinceBufferLen);
		}
		return connectedSince;
	}
	public CommandConsumerStatsResponse setConnectedSince(String connectedSince) {
		this.connectedSince = connectedSince;
		_bitField0 |= _CONNECTED_SINCE_MASK;
		_connectedSinceBufferIdx = -1;
		_connectedSinceBufferLen = LightProtoCodec.computeStringUTF8Size(connectedSince);
		_cachedSize = -1;
		return this;
	}
	public CommandConsumerStatsResponse clearConnectedSince() {
		_bitField0 &= ~_CONNECTED_SINCE_MASK;
		connectedSince = null;
		_connectedSinceBufferIdx = -1;
		_connectedSinceBufferLen = -1;
		return this;
	}

	// Whether this subscription is Exclusive or Shared or Failover
	private String type;
	private int _typeBufferIdx = -1;
	private int _typeBufferLen = -1;
	private static final int _TYPE_FIELD_NUMBER = 13;
	private static final int _TYPE_TAG = (_TYPE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _TYPE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_TYPE_TAG);
	private static final int _TYPE_MASK = 1 << (12 % 32);
	public boolean hasType() {
		return (_bitField0 & _TYPE_MASK) != 0;
	}
	public String getType() {
		if (!hasType()) {
			throw new IllegalStateException("Field 'type' is not set");
		}
		if (type == null) {
			type = LightProtoCodec.readString(_parsedBuffer, _typeBufferIdx, _typeBufferLen);
		}
		return type;
	}
	public CommandConsumerStatsResponse setType(String type) {
		this.type = type;
		_bitField0 |= _TYPE_MASK;
		_typeBufferIdx = -1;
		_typeBufferLen = LightProtoCodec.computeStringUTF8Size(type);
		_cachedSize = -1;
		return this;
	}
	public CommandConsumerStatsResponse clearType() {
		_bitField0 &= ~_TYPE_MASK;
		type = null;
		_typeBufferIdx = -1;
		_typeBufferLen = -1;
		return this;
	}

	// Total rate of messages expired on this subscription. msg/s
	private double msgRateExpired;
	private static final int _MSG_RATE_EXPIRED_FIELD_NUMBER = 14;
	private static final int _MSG_RATE_EXPIRED_TAG = (_MSG_RATE_EXPIRED_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_FIXED64;
	private static final int _MSG_RATE_EXPIRED_TAG_SIZE = LightProtoCodec.computeVarIntSize(_MSG_RATE_EXPIRED_TAG);
	private static final int _MSG_RATE_EXPIRED_MASK = 1 << (13 % 32);
	public boolean hasMsgRateExpired() {
		return (_bitField0 & _MSG_RATE_EXPIRED_MASK) != 0;
	}
	public double getMsgRateExpired() {
		if (!hasMsgRateExpired()) {
			throw new IllegalStateException("Field 'msgRateExpired' is not set");
		}
		return msgRateExpired;
	}
	public CommandConsumerStatsResponse setMsgRateExpired(double msgRateExpired) {
		this.msgRateExpired = msgRateExpired;
		_bitField0 |= _MSG_RATE_EXPIRED_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandConsumerStatsResponse clearMsgRateExpired() {
		_bitField0 &= ~_MSG_RATE_EXPIRED_MASK;
		return this;
	}

	// Number of messages in the subscription backlog
	private long msgBacklog;
	private static final int _MSG_BACKLOG_FIELD_NUMBER = 15;
	private static final int _MSG_BACKLOG_TAG = (_MSG_BACKLOG_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _MSG_BACKLOG_TAG_SIZE = LightProtoCodec.computeVarIntSize(_MSG_BACKLOG_TAG);
	private static final int _MSG_BACKLOG_MASK = 1 << (14 % 32);
	public boolean hasMsgBacklog() {
		return (_bitField0 & _MSG_BACKLOG_MASK) != 0;
	}
	public long getMsgBacklog() {
		if (!hasMsgBacklog()) {
			throw new IllegalStateException("Field 'msgBacklog' is not set");
		}
		return msgBacklog;
	}
	public CommandConsumerStatsResponse setMsgBacklog(long msgBacklog) {
		this.msgBacklog = msgBacklog;
		_bitField0 |= _MSG_BACKLOG_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandConsumerStatsResponse clearMsgBacklog() {
		_bitField0 &= ~_MSG_BACKLOG_MASK;
		return this;
	}

	// Total rate of messages ack. msg/s
	private double messageAckRate;
	private static final int _MESSAGE_ACK_RATE_FIELD_NUMBER = 16;
	private static final int _MESSAGE_ACK_RATE_TAG = (_MESSAGE_ACK_RATE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_FIXED64;
	private static final int _MESSAGE_ACK_RATE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_MESSAGE_ACK_RATE_TAG);
	private static final int _MESSAGE_ACK_RATE_MASK = 1 << (15 % 32);
	public boolean hasMessageAckRate() {
		return (_bitField0 & _MESSAGE_ACK_RATE_MASK) != 0;
	}
	public double getMessageAckRate() {
		if (!hasMessageAckRate()) {
			throw new IllegalStateException("Field 'messageAckRate' is not set");
		}
		return messageAckRate;
	}
	public CommandConsumerStatsResponse setMessageAckRate(double messageAckRate) {
		this.messageAckRate = messageAckRate;
		_bitField0 |= _MESSAGE_ACK_RATE_MASK;
		_cachedSize = -1;
		return this;
	}
	public CommandConsumerStatsResponse clearMessageAckRate() {
		_bitField0 &= ~_MESSAGE_ACK_RATE_MASK;
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _REQUEST_ID_MASK;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _REQUEST_ID_TAG);
		LightProtoCodec.writeVarInt64(_b, requestId);
		if (hasErrorCode()) {
			LightProtoCodec.writeVarInt(_b, _ERROR_CODE_TAG);
			LightProtoCodec.writeVarInt(_b, errorCode.getValue());
		}
		if (hasErrorMessage()) {
			LightProtoCodec.writeVarInt(_b, _ERROR_MESSAGE_TAG);
			LightProtoCodec.writeVarInt(_b, _errorMessageBufferLen);
			if (_errorMessageBufferIdx == -1) {
				LightProtoCodec.writeString(_b, errorMessage, _errorMessageBufferLen);
			} else {
				_parsedBuffer.getBytes(_errorMessageBufferIdx, _b, _errorMessageBufferLen);
			}
		}
		if (hasMsgRateOut()) {
			LightProtoCodec.writeVarInt(_b, _MSG_RATE_OUT_TAG);
			LightProtoCodec.writeDouble(_b, msgRateOut);
		}
		if (hasMsgThroughputOut()) {
			LightProtoCodec.writeVarInt(_b, _MSG_THROUGHPUT_OUT_TAG);
			LightProtoCodec.writeDouble(_b, msgThroughputOut);
		}
		if (hasMsgRateRedeliver()) {
			LightProtoCodec.writeVarInt(_b, _MSG_RATE_REDELIVER_TAG);
			LightProtoCodec.writeDouble(_b, msgRateRedeliver);
		}
		if (hasConsumerName()) {
			LightProtoCodec.writeVarInt(_b, _CONSUMER_NAME_TAG);
			LightProtoCodec.writeVarInt(_b, _consumerNameBufferLen);
			if (_consumerNameBufferIdx == -1) {
				LightProtoCodec.writeString(_b, consumerName, _consumerNameBufferLen);
			} else {
				_parsedBuffer.getBytes(_consumerNameBufferIdx, _b, _consumerNameBufferLen);
			}
		}
		if (hasAvailablePermits()) {
			LightProtoCodec.writeVarInt(_b, _AVAILABLE_PERMITS_TAG);
			LightProtoCodec.writeVarInt64(_b, availablePermits);
		}
		if (hasUnackedMessages()) {
			LightProtoCodec.writeVarInt(_b, _UNACKED_MESSAGES_TAG);
			LightProtoCodec.writeVarInt64(_b, unackedMessages);
		}
		if (hasBlockedConsumerOnUnackedMsgs()) {
			LightProtoCodec.writeVarInt(_b, _BLOCKED_CONSUMER_ON_UNACKED_MSGS_TAG);
			_b.writeBoolean(blockedConsumerOnUnackedMsgs);
		}
		if (hasAddress()) {
			LightProtoCodec.writeVarInt(_b, _ADDRESS_TAG);
			LightProtoCodec.writeVarInt(_b, _addressBufferLen);
			if (_addressBufferIdx == -1) {
				LightProtoCodec.writeString(_b, address, _addressBufferLen);
			} else {
				_parsedBuffer.getBytes(_addressBufferIdx, _b, _addressBufferLen);
			}
		}
		if (hasConnectedSince()) {
			LightProtoCodec.writeVarInt(_b, _CONNECTED_SINCE_TAG);
			LightProtoCodec.writeVarInt(_b, _connectedSinceBufferLen);
			if (_connectedSinceBufferIdx == -1) {
				LightProtoCodec.writeString(_b, connectedSince, _connectedSinceBufferLen);
			} else {
				_parsedBuffer.getBytes(_connectedSinceBufferIdx, _b, _connectedSinceBufferLen);
			}
		}
		if (hasType()) {
			LightProtoCodec.writeVarInt(_b, _TYPE_TAG);
			LightProtoCodec.writeVarInt(_b, _typeBufferLen);
			if (_typeBufferIdx == -1) {
				LightProtoCodec.writeString(_b, type, _typeBufferLen);
			} else {
				_parsedBuffer.getBytes(_typeBufferIdx, _b, _typeBufferLen);
			}
		}
		if (hasMsgRateExpired()) {
			LightProtoCodec.writeVarInt(_b, _MSG_RATE_EXPIRED_TAG);
			LightProtoCodec.writeDouble(_b, msgRateExpired);
		}
		if (hasMsgBacklog()) {
			LightProtoCodec.writeVarInt(_b, _MSG_BACKLOG_TAG);
			LightProtoCodec.writeVarInt64(_b, msgBacklog);
		}
		if (hasMessageAckRate()) {
			LightProtoCodec.writeVarInt(_b, _MESSAGE_ACK_RATE_TAG);
			LightProtoCodec.writeDouble(_b, messageAckRate);
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
		if (hasErrorCode()) {
			_size += _ERROR_CODE_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(errorCode.getValue());
		}
		if (hasErrorMessage()) {
			_size += _ERROR_MESSAGE_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_errorMessageBufferLen);
			_size += _errorMessageBufferLen;
		}
		if (hasMsgRateOut()) {
			_size += _MSG_RATE_OUT_TAG_SIZE;
			_size += 8;
		}
		if (hasMsgThroughputOut()) {
			_size += _MSG_THROUGHPUT_OUT_TAG_SIZE;
			_size += 8;
		}
		if (hasMsgRateRedeliver()) {
			_size += _MSG_RATE_REDELIVER_TAG_SIZE;
			_size += 8;
		}
		if (hasConsumerName()) {
			_size += _CONSUMER_NAME_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_consumerNameBufferLen);
			_size += _consumerNameBufferLen;
		}
		if (hasAvailablePermits()) {
			_size += _AVAILABLE_PERMITS_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(availablePermits);
		}
		if (hasUnackedMessages()) {
			_size += _UNACKED_MESSAGES_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(unackedMessages);
		}
		if (hasBlockedConsumerOnUnackedMsgs()) {
			_size += _BLOCKED_CONSUMER_ON_UNACKED_MSGS_TAG_SIZE;
			_size += 1;
		}
		if (hasAddress()) {
			_size += _ADDRESS_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_addressBufferLen);
			_size += _addressBufferLen;
		}
		if (hasConnectedSince()) {
			_size += _CONNECTED_SINCE_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_connectedSinceBufferLen);
			_size += _connectedSinceBufferLen;
		}
		if (hasType()) {
			_size += _TYPE_TAG_SIZE;
			_size += LightProtoCodec.computeVarIntSize(_typeBufferLen);
			_size += _typeBufferLen;
		}
		if (hasMsgRateExpired()) {
			_size += _MSG_RATE_EXPIRED_TAG_SIZE;
			_size += 8;
		}
		if (hasMsgBacklog()) {
			_size += _MSG_BACKLOG_TAG_SIZE;
			_size += LightProtoCodec.computeVarInt64Size(msgBacklog);
		}
		if (hasMessageAckRate()) {
			_size += _MESSAGE_ACK_RATE_TAG_SIZE;
			_size += 8;
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
				case _ERROR_CODE_TAG :
					ServerError _errorCode = ServerError.valueOf(LightProtoCodec.readVarInt(_buffer));
					if (_errorCode != null) {
						_bitField0 |= _ERROR_CODE_MASK;
						errorCode = _errorCode;
					}
					break;
				case _ERROR_MESSAGE_TAG :
					_bitField0 |= _ERROR_MESSAGE_MASK;
					_errorMessageBufferLen = LightProtoCodec.readVarInt(_buffer);
					_errorMessageBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_errorMessageBufferLen);
					break;
				case _MSG_RATE_OUT_TAG :
					_bitField0 |= _MSG_RATE_OUT_MASK;
					msgRateOut = LightProtoCodec.readDouble(_buffer);
					break;
				case _MSG_THROUGHPUT_OUT_TAG :
					_bitField0 |= _MSG_THROUGHPUT_OUT_MASK;
					msgThroughputOut = LightProtoCodec.readDouble(_buffer);
					break;
				case _MSG_RATE_REDELIVER_TAG :
					_bitField0 |= _MSG_RATE_REDELIVER_MASK;
					msgRateRedeliver = LightProtoCodec.readDouble(_buffer);
					break;
				case _CONSUMER_NAME_TAG :
					_bitField0 |= _CONSUMER_NAME_MASK;
					_consumerNameBufferLen = LightProtoCodec.readVarInt(_buffer);
					_consumerNameBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_consumerNameBufferLen);
					break;
				case _AVAILABLE_PERMITS_TAG :
					_bitField0 |= _AVAILABLE_PERMITS_MASK;
					availablePermits = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _UNACKED_MESSAGES_TAG :
					_bitField0 |= _UNACKED_MESSAGES_MASK;
					unackedMessages = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _BLOCKED_CONSUMER_ON_UNACKED_MSGS_TAG :
					_bitField0 |= _BLOCKED_CONSUMER_ON_UNACKED_MSGS_MASK;
					blockedConsumerOnUnackedMsgs = LightProtoCodec.readVarInt(_buffer) == 1;
					break;
				case _ADDRESS_TAG :
					_bitField0 |= _ADDRESS_MASK;
					_addressBufferLen = LightProtoCodec.readVarInt(_buffer);
					_addressBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_addressBufferLen);
					break;
				case _CONNECTED_SINCE_TAG :
					_bitField0 |= _CONNECTED_SINCE_MASK;
					_connectedSinceBufferLen = LightProtoCodec.readVarInt(_buffer);
					_connectedSinceBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_connectedSinceBufferLen);
					break;
				case _TYPE_TAG :
					_bitField0 |= _TYPE_MASK;
					_typeBufferLen = LightProtoCodec.readVarInt(_buffer);
					_typeBufferIdx = _buffer.readerIndex();
					_buffer.skipBytes(_typeBufferLen);
					break;
				case _MSG_RATE_EXPIRED_TAG :
					_bitField0 |= _MSG_RATE_EXPIRED_MASK;
					msgRateExpired = LightProtoCodec.readDouble(_buffer);
					break;
				case _MSG_BACKLOG_TAG :
					_bitField0 |= _MSG_BACKLOG_MASK;
					msgBacklog = LightProtoCodec.readVarInt64(_buffer);
					break;
				case _MESSAGE_ACK_RATE_TAG :
					_bitField0 |= _MESSAGE_ACK_RATE_MASK;
					messageAckRate = LightProtoCodec.readDouble(_buffer);
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
	public CommandConsumerStatsResponse clear() {
		errorMessage = null;
		_errorMessageBufferIdx = -1;
		_errorMessageBufferLen = -1;
		consumerName = null;
		_consumerNameBufferIdx = -1;
		_consumerNameBufferLen = -1;
		address = null;
		_addressBufferIdx = -1;
		_addressBufferLen = -1;
		connectedSince = null;
		_connectedSinceBufferIdx = -1;
		_connectedSinceBufferLen = -1;
		type = null;
		_typeBufferIdx = -1;
		_typeBufferLen = -1;
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		return this;
	}
	public CommandConsumerStatsResponse copyFrom(CommandConsumerStatsResponse _other) {
		_cachedSize = -1;
		if (_other.hasRequestId()) {
			setRequestId(_other.requestId);
		}
		if (_other.hasErrorCode()) {
			setErrorCode(_other.errorCode);
		}
		if (_other.hasErrorMessage()) {
			setErrorMessage(_other.getErrorMessage());
		}
		if (_other.hasMsgRateOut()) {
			setMsgRateOut(_other.msgRateOut);
		}
		if (_other.hasMsgThroughputOut()) {
			setMsgThroughputOut(_other.msgThroughputOut);
		}
		if (_other.hasMsgRateRedeliver()) {
			setMsgRateRedeliver(_other.msgRateRedeliver);
		}
		if (_other.hasConsumerName()) {
			setConsumerName(_other.getConsumerName());
		}
		if (_other.hasAvailablePermits()) {
			setAvailablePermits(_other.availablePermits);
		}
		if (_other.hasUnackedMessages()) {
			setUnackedMessages(_other.unackedMessages);
		}
		if (_other.hasBlockedConsumerOnUnackedMsgs()) {
			setBlockedConsumerOnUnackedMsgs(_other.blockedConsumerOnUnackedMsgs);
		}
		if (_other.hasAddress()) {
			setAddress(_other.getAddress());
		}
		if (_other.hasConnectedSince()) {
			setConnectedSince(_other.getConnectedSince());
		}
		if (_other.hasType()) {
			setType(_other.getType());
		}
		if (_other.hasMsgRateExpired()) {
			setMsgRateExpired(_other.msgRateExpired);
		}
		if (_other.hasMsgBacklog()) {
			setMsgBacklog(_other.msgBacklog);
		}
		if (_other.hasMessageAckRate()) {
			setMessageAckRate(_other.messageAckRate);
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
