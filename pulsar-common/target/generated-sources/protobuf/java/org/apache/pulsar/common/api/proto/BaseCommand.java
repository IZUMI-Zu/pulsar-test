package org.apache.pulsar.common.api.proto;
public final class BaseCommand {
	public enum Type {
		CONNECT(2), CONNECTED(3), SUBSCRIBE(4), PRODUCER(5), SEND(6), SEND_RECEIPT(7), SEND_ERROR(8), MESSAGE(9), ACK(
				10), FLOW(11), UNSUBSCRIBE(12), SUCCESS(13), ERROR(14), CLOSE_PRODUCER(15), CLOSE_CONSUMER(
						16), PRODUCER_SUCCESS(17), PING(18), PONG(19), REDELIVER_UNACKNOWLEDGED_MESSAGES(
								20), PARTITIONED_METADATA(21), PARTITIONED_METADATA_RESPONSE(22), LOOKUP(
										23), LOOKUP_RESPONSE(24), CONSUMER_STATS(25), CONSUMER_STATS_RESPONSE(
												26), REACHED_END_OF_TOPIC(27), SEEK(28), GET_LAST_MESSAGE_ID(
														29), GET_LAST_MESSAGE_ID_RESPONSE(30), ACTIVE_CONSUMER_CHANGE(
																31), GET_TOPICS_OF_NAMESPACE(
																		32), GET_TOPICS_OF_NAMESPACE_RESPONSE(
																				33), GET_SCHEMA(
																						34), GET_SCHEMA_RESPONSE(
																								35), AUTH_CHALLENGE(
																										36), AUTH_RESPONSE(
																												37), ACK_RESPONSE(
																														38), GET_OR_CREATE_SCHEMA(
																																39), GET_OR_CREATE_SCHEMA_RESPONSE(
																																		40), NEW_TXN(
																																				50), NEW_TXN_RESPONSE(
																																						51), ADD_PARTITION_TO_TXN(
																																								52), ADD_PARTITION_TO_TXN_RESPONSE(
																																										53), ADD_SUBSCRIPTION_TO_TXN(
																																												54), ADD_SUBSCRIPTION_TO_TXN_RESPONSE(
																																														55), END_TXN(
																																																56), END_TXN_RESPONSE(
																																																		57), END_TXN_ON_PARTITION(
																																																				58), END_TXN_ON_PARTITION_RESPONSE(
																																																						59), END_TXN_ON_SUBSCRIPTION(
																																																								60), END_TXN_ON_SUBSCRIPTION_RESPONSE(
																																																										61), TC_CLIENT_CONNECT_REQUEST(
																																																												62), TC_CLIENT_CONNECT_RESPONSE(
																																																														63),;
		private final int value;
		private Type(int value) {
			this.value = value;
		}
		public int getValue() {
			return value;
		}
		public static Type valueOf(int n) {
			switch (n) {
				case 2 :
					return CONNECT;
				case 3 :
					return CONNECTED;
				case 4 :
					return SUBSCRIBE;
				case 5 :
					return PRODUCER;
				case 6 :
					return SEND;
				case 7 :
					return SEND_RECEIPT;
				case 8 :
					return SEND_ERROR;
				case 9 :
					return MESSAGE;
				case 10 :
					return ACK;
				case 11 :
					return FLOW;
				case 12 :
					return UNSUBSCRIBE;
				case 13 :
					return SUCCESS;
				case 14 :
					return ERROR;
				case 15 :
					return CLOSE_PRODUCER;
				case 16 :
					return CLOSE_CONSUMER;
				case 17 :
					return PRODUCER_SUCCESS;
				case 18 :
					return PING;
				case 19 :
					return PONG;
				case 20 :
					return REDELIVER_UNACKNOWLEDGED_MESSAGES;
				case 21 :
					return PARTITIONED_METADATA;
				case 22 :
					return PARTITIONED_METADATA_RESPONSE;
				case 23 :
					return LOOKUP;
				case 24 :
					return LOOKUP_RESPONSE;
				case 25 :
					return CONSUMER_STATS;
				case 26 :
					return CONSUMER_STATS_RESPONSE;
				case 27 :
					return REACHED_END_OF_TOPIC;
				case 28 :
					return SEEK;
				case 29 :
					return GET_LAST_MESSAGE_ID;
				case 30 :
					return GET_LAST_MESSAGE_ID_RESPONSE;
				case 31 :
					return ACTIVE_CONSUMER_CHANGE;
				case 32 :
					return GET_TOPICS_OF_NAMESPACE;
				case 33 :
					return GET_TOPICS_OF_NAMESPACE_RESPONSE;
				case 34 :
					return GET_SCHEMA;
				case 35 :
					return GET_SCHEMA_RESPONSE;
				case 36 :
					return AUTH_CHALLENGE;
				case 37 :
					return AUTH_RESPONSE;
				case 38 :
					return ACK_RESPONSE;
				case 39 :
					return GET_OR_CREATE_SCHEMA;
				case 40 :
					return GET_OR_CREATE_SCHEMA_RESPONSE;
				case 50 :
					return NEW_TXN;
				case 51 :
					return NEW_TXN_RESPONSE;
				case 52 :
					return ADD_PARTITION_TO_TXN;
				case 53 :
					return ADD_PARTITION_TO_TXN_RESPONSE;
				case 54 :
					return ADD_SUBSCRIPTION_TO_TXN;
				case 55 :
					return ADD_SUBSCRIPTION_TO_TXN_RESPONSE;
				case 56 :
					return END_TXN;
				case 57 :
					return END_TXN_RESPONSE;
				case 58 :
					return END_TXN_ON_PARTITION;
				case 59 :
					return END_TXN_ON_PARTITION_RESPONSE;
				case 60 :
					return END_TXN_ON_SUBSCRIPTION;
				case 61 :
					return END_TXN_ON_SUBSCRIPTION_RESPONSE;
				case 62 :
					return TC_CLIENT_CONNECT_REQUEST;
				case 63 :
					return TC_CLIENT_CONNECT_RESPONSE;
				default :
					return null;

			}
		}
		public static final int CONNECT_VALUE = 2;
		public static final int CONNECTED_VALUE = 3;
		public static final int SUBSCRIBE_VALUE = 4;
		public static final int PRODUCER_VALUE = 5;
		public static final int SEND_VALUE = 6;
		public static final int SEND_RECEIPT_VALUE = 7;
		public static final int SEND_ERROR_VALUE = 8;
		public static final int MESSAGE_VALUE = 9;
		public static final int ACK_VALUE = 10;
		public static final int FLOW_VALUE = 11;
		public static final int UNSUBSCRIBE_VALUE = 12;
		public static final int SUCCESS_VALUE = 13;
		public static final int ERROR_VALUE = 14;
		public static final int CLOSE_PRODUCER_VALUE = 15;
		public static final int CLOSE_CONSUMER_VALUE = 16;
		public static final int PRODUCER_SUCCESS_VALUE = 17;
		public static final int PING_VALUE = 18;
		public static final int PONG_VALUE = 19;
		public static final int REDELIVER_UNACKNOWLEDGED_MESSAGES_VALUE = 20;
		public static final int PARTITIONED_METADATA_VALUE = 21;
		public static final int PARTITIONED_METADATA_RESPONSE_VALUE = 22;
		public static final int LOOKUP_VALUE = 23;
		public static final int LOOKUP_RESPONSE_VALUE = 24;
		public static final int CONSUMER_STATS_VALUE = 25;
		public static final int CONSUMER_STATS_RESPONSE_VALUE = 26;
		public static final int REACHED_END_OF_TOPIC_VALUE = 27;
		public static final int SEEK_VALUE = 28;
		public static final int GET_LAST_MESSAGE_ID_VALUE = 29;
		public static final int GET_LAST_MESSAGE_ID_RESPONSE_VALUE = 30;
		public static final int ACTIVE_CONSUMER_CHANGE_VALUE = 31;
		public static final int GET_TOPICS_OF_NAMESPACE_VALUE = 32;
		public static final int GET_TOPICS_OF_NAMESPACE_RESPONSE_VALUE = 33;
		public static final int GET_SCHEMA_VALUE = 34;
		public static final int GET_SCHEMA_RESPONSE_VALUE = 35;
		public static final int AUTH_CHALLENGE_VALUE = 36;
		public static final int AUTH_RESPONSE_VALUE = 37;
		public static final int ACK_RESPONSE_VALUE = 38;
		public static final int GET_OR_CREATE_SCHEMA_VALUE = 39;
		public static final int GET_OR_CREATE_SCHEMA_RESPONSE_VALUE = 40;
		public static final int NEW_TXN_VALUE = 50;
		public static final int NEW_TXN_RESPONSE_VALUE = 51;
		public static final int ADD_PARTITION_TO_TXN_VALUE = 52;
		public static final int ADD_PARTITION_TO_TXN_RESPONSE_VALUE = 53;
		public static final int ADD_SUBSCRIPTION_TO_TXN_VALUE = 54;
		public static final int ADD_SUBSCRIPTION_TO_TXN_RESPONSE_VALUE = 55;
		public static final int END_TXN_VALUE = 56;
		public static final int END_TXN_RESPONSE_VALUE = 57;
		public static final int END_TXN_ON_PARTITION_VALUE = 58;
		public static final int END_TXN_ON_PARTITION_RESPONSE_VALUE = 59;
		public static final int END_TXN_ON_SUBSCRIPTION_VALUE = 60;
		public static final int END_TXN_ON_SUBSCRIPTION_RESPONSE_VALUE = 61;
		public static final int TC_CLIENT_CONNECT_REQUEST_VALUE = 62;
		public static final int TC_CLIENT_CONNECT_RESPONSE_VALUE = 63;
	}

	private Type type;
	private static final int _TYPE_FIELD_NUMBER = 1;
	private static final int _TYPE_TAG = (_TYPE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_VARINT;
	private static final int _TYPE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_TYPE_TAG);
	private static final int _TYPE_MASK = 1 << (0 % 32);
	public boolean hasType() {
		return (_bitField0 & _TYPE_MASK) != 0;
	}
	public Type getType() {
		if (!hasType()) {
			throw new IllegalStateException("Field 'type' is not set");
		}
		return type;
	}
	public BaseCommand setType(Type type) {
		this.type = type;
		_bitField0 |= _TYPE_MASK;
		_cachedSize = -1;
		return this;
	}
	public BaseCommand clearType() {
		_bitField0 &= ~_TYPE_MASK;
		return this;
	}

	private CommandConnect connect;
	private static final int _CONNECT_FIELD_NUMBER = 2;
	private static final int _CONNECT_TAG = (_CONNECT_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _CONNECT_TAG_SIZE = LightProtoCodec.computeVarIntSize(_CONNECT_TAG);
	private static final int _CONNECT_MASK = 1 << (1 % 32);
	public boolean hasConnect() {
		return (_bitField0 & _CONNECT_MASK) != 0;
	}
	public CommandConnect getConnect() {
		if (!hasConnect()) {
			throw new IllegalStateException("Field 'connect' is not set");
		}
		return connect;
	}
	public CommandConnect setConnect() {
		if (connect == null) {
			connect = new CommandConnect();
		}
		_bitField0 |= _CONNECT_MASK;
		_cachedSize = -1;
		return connect;
	}
	public BaseCommand clearConnect() {
		_bitField0 &= ~_CONNECT_MASK;
		if (hasConnect()) {
			connect.clear();
		}
		return this;
	}

	private CommandConnected connected;
	private static final int _CONNECTED_FIELD_NUMBER = 3;
	private static final int _CONNECTED_TAG = (_CONNECTED_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _CONNECTED_TAG_SIZE = LightProtoCodec.computeVarIntSize(_CONNECTED_TAG);
	private static final int _CONNECTED_MASK = 1 << (2 % 32);
	public boolean hasConnected() {
		return (_bitField0 & _CONNECTED_MASK) != 0;
	}
	public CommandConnected getConnected() {
		if (!hasConnected()) {
			throw new IllegalStateException("Field 'connected' is not set");
		}
		return connected;
	}
	public CommandConnected setConnected() {
		if (connected == null) {
			connected = new CommandConnected();
		}
		_bitField0 |= _CONNECTED_MASK;
		_cachedSize = -1;
		return connected;
	}
	public BaseCommand clearConnected() {
		_bitField0 &= ~_CONNECTED_MASK;
		if (hasConnected()) {
			connected.clear();
		}
		return this;
	}

	private CommandSubscribe subscribe;
	private static final int _SUBSCRIBE_FIELD_NUMBER = 4;
	private static final int _SUBSCRIBE_TAG = (_SUBSCRIBE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _SUBSCRIBE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_SUBSCRIBE_TAG);
	private static final int _SUBSCRIBE_MASK = 1 << (3 % 32);
	public boolean hasSubscribe() {
		return (_bitField0 & _SUBSCRIBE_MASK) != 0;
	}
	public CommandSubscribe getSubscribe() {
		if (!hasSubscribe()) {
			throw new IllegalStateException("Field 'subscribe' is not set");
		}
		return subscribe;
	}
	public CommandSubscribe setSubscribe() {
		if (subscribe == null) {
			subscribe = new CommandSubscribe();
		}
		_bitField0 |= _SUBSCRIBE_MASK;
		_cachedSize = -1;
		return subscribe;
	}
	public BaseCommand clearSubscribe() {
		_bitField0 &= ~_SUBSCRIBE_MASK;
		if (hasSubscribe()) {
			subscribe.clear();
		}
		return this;
	}

	private CommandProducer producer;
	private static final int _PRODUCER_FIELD_NUMBER = 5;
	private static final int _PRODUCER_TAG = (_PRODUCER_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _PRODUCER_TAG_SIZE = LightProtoCodec.computeVarIntSize(_PRODUCER_TAG);
	private static final int _PRODUCER_MASK = 1 << (4 % 32);
	public boolean hasProducer() {
		return (_bitField0 & _PRODUCER_MASK) != 0;
	}
	public CommandProducer getProducer() {
		if (!hasProducer()) {
			throw new IllegalStateException("Field 'producer' is not set");
		}
		return producer;
	}
	public CommandProducer setProducer() {
		if (producer == null) {
			producer = new CommandProducer();
		}
		_bitField0 |= _PRODUCER_MASK;
		_cachedSize = -1;
		return producer;
	}
	public BaseCommand clearProducer() {
		_bitField0 &= ~_PRODUCER_MASK;
		if (hasProducer()) {
			producer.clear();
		}
		return this;
	}

	private CommandSend send;
	private static final int _SEND_FIELD_NUMBER = 6;
	private static final int _SEND_TAG = (_SEND_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _SEND_TAG_SIZE = LightProtoCodec.computeVarIntSize(_SEND_TAG);
	private static final int _SEND_MASK = 1 << (5 % 32);
	public boolean hasSend() {
		return (_bitField0 & _SEND_MASK) != 0;
	}
	public CommandSend getSend() {
		if (!hasSend()) {
			throw new IllegalStateException("Field 'send' is not set");
		}
		return send;
	}
	public CommandSend setSend() {
		if (send == null) {
			send = new CommandSend();
		}
		_bitField0 |= _SEND_MASK;
		_cachedSize = -1;
		return send;
	}
	public BaseCommand clearSend() {
		_bitField0 &= ~_SEND_MASK;
		if (hasSend()) {
			send.clear();
		}
		return this;
	}

	private CommandSendReceipt sendReceipt;
	private static final int _SEND_RECEIPT_FIELD_NUMBER = 7;
	private static final int _SEND_RECEIPT_TAG = (_SEND_RECEIPT_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _SEND_RECEIPT_TAG_SIZE = LightProtoCodec.computeVarIntSize(_SEND_RECEIPT_TAG);
	private static final int _SEND_RECEIPT_MASK = 1 << (6 % 32);
	public boolean hasSendReceipt() {
		return (_bitField0 & _SEND_RECEIPT_MASK) != 0;
	}
	public CommandSendReceipt getSendReceipt() {
		if (!hasSendReceipt()) {
			throw new IllegalStateException("Field 'send_receipt' is not set");
		}
		return sendReceipt;
	}
	public CommandSendReceipt setSendReceipt() {
		if (sendReceipt == null) {
			sendReceipt = new CommandSendReceipt();
		}
		_bitField0 |= _SEND_RECEIPT_MASK;
		_cachedSize = -1;
		return sendReceipt;
	}
	public BaseCommand clearSendReceipt() {
		_bitField0 &= ~_SEND_RECEIPT_MASK;
		if (hasSendReceipt()) {
			sendReceipt.clear();
		}
		return this;
	}

	private CommandSendError sendError;
	private static final int _SEND_ERROR_FIELD_NUMBER = 8;
	private static final int _SEND_ERROR_TAG = (_SEND_ERROR_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _SEND_ERROR_TAG_SIZE = LightProtoCodec.computeVarIntSize(_SEND_ERROR_TAG);
	private static final int _SEND_ERROR_MASK = 1 << (7 % 32);
	public boolean hasSendError() {
		return (_bitField0 & _SEND_ERROR_MASK) != 0;
	}
	public CommandSendError getSendError() {
		if (!hasSendError()) {
			throw new IllegalStateException("Field 'send_error' is not set");
		}
		return sendError;
	}
	public CommandSendError setSendError() {
		if (sendError == null) {
			sendError = new CommandSendError();
		}
		_bitField0 |= _SEND_ERROR_MASK;
		_cachedSize = -1;
		return sendError;
	}
	public BaseCommand clearSendError() {
		_bitField0 &= ~_SEND_ERROR_MASK;
		if (hasSendError()) {
			sendError.clear();
		}
		return this;
	}

	private CommandMessage message;
	private static final int _MESSAGE_FIELD_NUMBER = 9;
	private static final int _MESSAGE_TAG = (_MESSAGE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _MESSAGE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_MESSAGE_TAG);
	private static final int _MESSAGE_MASK = 1 << (8 % 32);
	public boolean hasMessage() {
		return (_bitField0 & _MESSAGE_MASK) != 0;
	}
	public CommandMessage getMessage() {
		if (!hasMessage()) {
			throw new IllegalStateException("Field 'message' is not set");
		}
		return message;
	}
	public CommandMessage setMessage() {
		if (message == null) {
			message = new CommandMessage();
		}
		_bitField0 |= _MESSAGE_MASK;
		_cachedSize = -1;
		return message;
	}
	public BaseCommand clearMessage() {
		_bitField0 &= ~_MESSAGE_MASK;
		if (hasMessage()) {
			message.clear();
		}
		return this;
	}

	private CommandAck ack;
	private static final int _ACK_FIELD_NUMBER = 10;
	private static final int _ACK_TAG = (_ACK_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _ACK_TAG_SIZE = LightProtoCodec.computeVarIntSize(_ACK_TAG);
	private static final int _ACK_MASK = 1 << (9 % 32);
	public boolean hasAck() {
		return (_bitField0 & _ACK_MASK) != 0;
	}
	public CommandAck getAck() {
		if (!hasAck()) {
			throw new IllegalStateException("Field 'ack' is not set");
		}
		return ack;
	}
	public CommandAck setAck() {
		if (ack == null) {
			ack = new CommandAck();
		}
		_bitField0 |= _ACK_MASK;
		_cachedSize = -1;
		return ack;
	}
	public BaseCommand clearAck() {
		_bitField0 &= ~_ACK_MASK;
		if (hasAck()) {
			ack.clear();
		}
		return this;
	}

	private CommandFlow flow;
	private static final int _FLOW_FIELD_NUMBER = 11;
	private static final int _FLOW_TAG = (_FLOW_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _FLOW_TAG_SIZE = LightProtoCodec.computeVarIntSize(_FLOW_TAG);
	private static final int _FLOW_MASK = 1 << (10 % 32);
	public boolean hasFlow() {
		return (_bitField0 & _FLOW_MASK) != 0;
	}
	public CommandFlow getFlow() {
		if (!hasFlow()) {
			throw new IllegalStateException("Field 'flow' is not set");
		}
		return flow;
	}
	public CommandFlow setFlow() {
		if (flow == null) {
			flow = new CommandFlow();
		}
		_bitField0 |= _FLOW_MASK;
		_cachedSize = -1;
		return flow;
	}
	public BaseCommand clearFlow() {
		_bitField0 &= ~_FLOW_MASK;
		if (hasFlow()) {
			flow.clear();
		}
		return this;
	}

	private CommandUnsubscribe unsubscribe;
	private static final int _UNSUBSCRIBE_FIELD_NUMBER = 12;
	private static final int _UNSUBSCRIBE_TAG = (_UNSUBSCRIBE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _UNSUBSCRIBE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_UNSUBSCRIBE_TAG);
	private static final int _UNSUBSCRIBE_MASK = 1 << (11 % 32);
	public boolean hasUnsubscribe() {
		return (_bitField0 & _UNSUBSCRIBE_MASK) != 0;
	}
	public CommandUnsubscribe getUnsubscribe() {
		if (!hasUnsubscribe()) {
			throw new IllegalStateException("Field 'unsubscribe' is not set");
		}
		return unsubscribe;
	}
	public CommandUnsubscribe setUnsubscribe() {
		if (unsubscribe == null) {
			unsubscribe = new CommandUnsubscribe();
		}
		_bitField0 |= _UNSUBSCRIBE_MASK;
		_cachedSize = -1;
		return unsubscribe;
	}
	public BaseCommand clearUnsubscribe() {
		_bitField0 &= ~_UNSUBSCRIBE_MASK;
		if (hasUnsubscribe()) {
			unsubscribe.clear();
		}
		return this;
	}

	private CommandSuccess success;
	private static final int _SUCCESS_FIELD_NUMBER = 13;
	private static final int _SUCCESS_TAG = (_SUCCESS_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _SUCCESS_TAG_SIZE = LightProtoCodec.computeVarIntSize(_SUCCESS_TAG);
	private static final int _SUCCESS_MASK = 1 << (12 % 32);
	public boolean hasSuccess() {
		return (_bitField0 & _SUCCESS_MASK) != 0;
	}
	public CommandSuccess getSuccess() {
		if (!hasSuccess()) {
			throw new IllegalStateException("Field 'success' is not set");
		}
		return success;
	}
	public CommandSuccess setSuccess() {
		if (success == null) {
			success = new CommandSuccess();
		}
		_bitField0 |= _SUCCESS_MASK;
		_cachedSize = -1;
		return success;
	}
	public BaseCommand clearSuccess() {
		_bitField0 &= ~_SUCCESS_MASK;
		if (hasSuccess()) {
			success.clear();
		}
		return this;
	}

	private CommandError error;
	private static final int _ERROR_FIELD_NUMBER = 14;
	private static final int _ERROR_TAG = (_ERROR_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _ERROR_TAG_SIZE = LightProtoCodec.computeVarIntSize(_ERROR_TAG);
	private static final int _ERROR_MASK = 1 << (13 % 32);
	public boolean hasError() {
		return (_bitField0 & _ERROR_MASK) != 0;
	}
	public CommandError getError() {
		if (!hasError()) {
			throw new IllegalStateException("Field 'error' is not set");
		}
		return error;
	}
	public CommandError setError() {
		if (error == null) {
			error = new CommandError();
		}
		_bitField0 |= _ERROR_MASK;
		_cachedSize = -1;
		return error;
	}
	public BaseCommand clearError() {
		_bitField0 &= ~_ERROR_MASK;
		if (hasError()) {
			error.clear();
		}
		return this;
	}

	private CommandCloseProducer closeProducer;
	private static final int _CLOSE_PRODUCER_FIELD_NUMBER = 15;
	private static final int _CLOSE_PRODUCER_TAG = (_CLOSE_PRODUCER_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _CLOSE_PRODUCER_TAG_SIZE = LightProtoCodec.computeVarIntSize(_CLOSE_PRODUCER_TAG);
	private static final int _CLOSE_PRODUCER_MASK = 1 << (14 % 32);
	public boolean hasCloseProducer() {
		return (_bitField0 & _CLOSE_PRODUCER_MASK) != 0;
	}
	public CommandCloseProducer getCloseProducer() {
		if (!hasCloseProducer()) {
			throw new IllegalStateException("Field 'close_producer' is not set");
		}
		return closeProducer;
	}
	public CommandCloseProducer setCloseProducer() {
		if (closeProducer == null) {
			closeProducer = new CommandCloseProducer();
		}
		_bitField0 |= _CLOSE_PRODUCER_MASK;
		_cachedSize = -1;
		return closeProducer;
	}
	public BaseCommand clearCloseProducer() {
		_bitField0 &= ~_CLOSE_PRODUCER_MASK;
		if (hasCloseProducer()) {
			closeProducer.clear();
		}
		return this;
	}

	private CommandCloseConsumer closeConsumer;
	private static final int _CLOSE_CONSUMER_FIELD_NUMBER = 16;
	private static final int _CLOSE_CONSUMER_TAG = (_CLOSE_CONSUMER_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _CLOSE_CONSUMER_TAG_SIZE = LightProtoCodec.computeVarIntSize(_CLOSE_CONSUMER_TAG);
	private static final int _CLOSE_CONSUMER_MASK = 1 << (15 % 32);
	public boolean hasCloseConsumer() {
		return (_bitField0 & _CLOSE_CONSUMER_MASK) != 0;
	}
	public CommandCloseConsumer getCloseConsumer() {
		if (!hasCloseConsumer()) {
			throw new IllegalStateException("Field 'close_consumer' is not set");
		}
		return closeConsumer;
	}
	public CommandCloseConsumer setCloseConsumer() {
		if (closeConsumer == null) {
			closeConsumer = new CommandCloseConsumer();
		}
		_bitField0 |= _CLOSE_CONSUMER_MASK;
		_cachedSize = -1;
		return closeConsumer;
	}
	public BaseCommand clearCloseConsumer() {
		_bitField0 &= ~_CLOSE_CONSUMER_MASK;
		if (hasCloseConsumer()) {
			closeConsumer.clear();
		}
		return this;
	}

	private CommandProducerSuccess producerSuccess;
	private static final int _PRODUCER_SUCCESS_FIELD_NUMBER = 17;
	private static final int _PRODUCER_SUCCESS_TAG = (_PRODUCER_SUCCESS_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _PRODUCER_SUCCESS_TAG_SIZE = LightProtoCodec.computeVarIntSize(_PRODUCER_SUCCESS_TAG);
	private static final int _PRODUCER_SUCCESS_MASK = 1 << (16 % 32);
	public boolean hasProducerSuccess() {
		return (_bitField0 & _PRODUCER_SUCCESS_MASK) != 0;
	}
	public CommandProducerSuccess getProducerSuccess() {
		if (!hasProducerSuccess()) {
			throw new IllegalStateException("Field 'producer_success' is not set");
		}
		return producerSuccess;
	}
	public CommandProducerSuccess setProducerSuccess() {
		if (producerSuccess == null) {
			producerSuccess = new CommandProducerSuccess();
		}
		_bitField0 |= _PRODUCER_SUCCESS_MASK;
		_cachedSize = -1;
		return producerSuccess;
	}
	public BaseCommand clearProducerSuccess() {
		_bitField0 &= ~_PRODUCER_SUCCESS_MASK;
		if (hasProducerSuccess()) {
			producerSuccess.clear();
		}
		return this;
	}

	private CommandPing ping;
	private static final int _PING_FIELD_NUMBER = 18;
	private static final int _PING_TAG = (_PING_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _PING_TAG_SIZE = LightProtoCodec.computeVarIntSize(_PING_TAG);
	private static final int _PING_MASK = 1 << (17 % 32);
	public boolean hasPing() {
		return (_bitField0 & _PING_MASK) != 0;
	}
	public CommandPing getPing() {
		if (!hasPing()) {
			throw new IllegalStateException("Field 'ping' is not set");
		}
		return ping;
	}
	public CommandPing setPing() {
		if (ping == null) {
			ping = new CommandPing();
		}
		_bitField0 |= _PING_MASK;
		_cachedSize = -1;
		return ping;
	}
	public BaseCommand clearPing() {
		_bitField0 &= ~_PING_MASK;
		if (hasPing()) {
			ping.clear();
		}
		return this;
	}

	private CommandPong pong;
	private static final int _PONG_FIELD_NUMBER = 19;
	private static final int _PONG_TAG = (_PONG_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _PONG_TAG_SIZE = LightProtoCodec.computeVarIntSize(_PONG_TAG);
	private static final int _PONG_MASK = 1 << (18 % 32);
	public boolean hasPong() {
		return (_bitField0 & _PONG_MASK) != 0;
	}
	public CommandPong getPong() {
		if (!hasPong()) {
			throw new IllegalStateException("Field 'pong' is not set");
		}
		return pong;
	}
	public CommandPong setPong() {
		if (pong == null) {
			pong = new CommandPong();
		}
		_bitField0 |= _PONG_MASK;
		_cachedSize = -1;
		return pong;
	}
	public BaseCommand clearPong() {
		_bitField0 &= ~_PONG_MASK;
		if (hasPong()) {
			pong.clear();
		}
		return this;
	}

	private CommandRedeliverUnacknowledgedMessages redeliverUnacknowledgedMessages;
	private static final int _REDELIVER_UNACKNOWLEDGED_MESSAGES_FIELD_NUMBER = 20;
	private static final int _REDELIVER_UNACKNOWLEDGED_MESSAGES_TAG = (_REDELIVER_UNACKNOWLEDGED_MESSAGES_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _REDELIVER_UNACKNOWLEDGED_MESSAGES_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_REDELIVER_UNACKNOWLEDGED_MESSAGES_TAG);
	private static final int _REDELIVER_UNACKNOWLEDGED_MESSAGES_MASK = 1 << (19 % 32);
	public boolean hasRedeliverUnacknowledgedMessages() {
		return (_bitField0 & _REDELIVER_UNACKNOWLEDGED_MESSAGES_MASK) != 0;
	}
	public CommandRedeliverUnacknowledgedMessages getRedeliverUnacknowledgedMessages() {
		if (!hasRedeliverUnacknowledgedMessages()) {
			throw new IllegalStateException("Field 'redeliverUnacknowledgedMessages' is not set");
		}
		return redeliverUnacknowledgedMessages;
	}
	public CommandRedeliverUnacknowledgedMessages setRedeliverUnacknowledgedMessages() {
		if (redeliverUnacknowledgedMessages == null) {
			redeliverUnacknowledgedMessages = new CommandRedeliverUnacknowledgedMessages();
		}
		_bitField0 |= _REDELIVER_UNACKNOWLEDGED_MESSAGES_MASK;
		_cachedSize = -1;
		return redeliverUnacknowledgedMessages;
	}
	public BaseCommand clearRedeliverUnacknowledgedMessages() {
		_bitField0 &= ~_REDELIVER_UNACKNOWLEDGED_MESSAGES_MASK;
		if (hasRedeliverUnacknowledgedMessages()) {
			redeliverUnacknowledgedMessages.clear();
		}
		return this;
	}

	private CommandPartitionedTopicMetadata partitionMetadata;
	private static final int _PARTITION_METADATA_FIELD_NUMBER = 21;
	private static final int _PARTITION_METADATA_TAG = (_PARTITION_METADATA_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _PARTITION_METADATA_TAG_SIZE = LightProtoCodec.computeVarIntSize(_PARTITION_METADATA_TAG);
	private static final int _PARTITION_METADATA_MASK = 1 << (20 % 32);
	public boolean hasPartitionMetadata() {
		return (_bitField0 & _PARTITION_METADATA_MASK) != 0;
	}
	public CommandPartitionedTopicMetadata getPartitionMetadata() {
		if (!hasPartitionMetadata()) {
			throw new IllegalStateException("Field 'partitionMetadata' is not set");
		}
		return partitionMetadata;
	}
	public CommandPartitionedTopicMetadata setPartitionMetadata() {
		if (partitionMetadata == null) {
			partitionMetadata = new CommandPartitionedTopicMetadata();
		}
		_bitField0 |= _PARTITION_METADATA_MASK;
		_cachedSize = -1;
		return partitionMetadata;
	}
	public BaseCommand clearPartitionMetadata() {
		_bitField0 &= ~_PARTITION_METADATA_MASK;
		if (hasPartitionMetadata()) {
			partitionMetadata.clear();
		}
		return this;
	}

	private CommandPartitionedTopicMetadataResponse partitionMetadataResponse;
	private static final int _PARTITION_METADATA_RESPONSE_FIELD_NUMBER = 22;
	private static final int _PARTITION_METADATA_RESPONSE_TAG = (_PARTITION_METADATA_RESPONSE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _PARTITION_METADATA_RESPONSE_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_PARTITION_METADATA_RESPONSE_TAG);
	private static final int _PARTITION_METADATA_RESPONSE_MASK = 1 << (21 % 32);
	public boolean hasPartitionMetadataResponse() {
		return (_bitField0 & _PARTITION_METADATA_RESPONSE_MASK) != 0;
	}
	public CommandPartitionedTopicMetadataResponse getPartitionMetadataResponse() {
		if (!hasPartitionMetadataResponse()) {
			throw new IllegalStateException("Field 'partitionMetadataResponse' is not set");
		}
		return partitionMetadataResponse;
	}
	public CommandPartitionedTopicMetadataResponse setPartitionMetadataResponse() {
		if (partitionMetadataResponse == null) {
			partitionMetadataResponse = new CommandPartitionedTopicMetadataResponse();
		}
		_bitField0 |= _PARTITION_METADATA_RESPONSE_MASK;
		_cachedSize = -1;
		return partitionMetadataResponse;
	}
	public BaseCommand clearPartitionMetadataResponse() {
		_bitField0 &= ~_PARTITION_METADATA_RESPONSE_MASK;
		if (hasPartitionMetadataResponse()) {
			partitionMetadataResponse.clear();
		}
		return this;
	}

	private CommandLookupTopic lookupTopic;
	private static final int _LOOKUP_TOPIC_FIELD_NUMBER = 23;
	private static final int _LOOKUP_TOPIC_TAG = (_LOOKUP_TOPIC_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _LOOKUP_TOPIC_TAG_SIZE = LightProtoCodec.computeVarIntSize(_LOOKUP_TOPIC_TAG);
	private static final int _LOOKUP_TOPIC_MASK = 1 << (22 % 32);
	public boolean hasLookupTopic() {
		return (_bitField0 & _LOOKUP_TOPIC_MASK) != 0;
	}
	public CommandLookupTopic getLookupTopic() {
		if (!hasLookupTopic()) {
			throw new IllegalStateException("Field 'lookupTopic' is not set");
		}
		return lookupTopic;
	}
	public CommandLookupTopic setLookupTopic() {
		if (lookupTopic == null) {
			lookupTopic = new CommandLookupTopic();
		}
		_bitField0 |= _LOOKUP_TOPIC_MASK;
		_cachedSize = -1;
		return lookupTopic;
	}
	public BaseCommand clearLookupTopic() {
		_bitField0 &= ~_LOOKUP_TOPIC_MASK;
		if (hasLookupTopic()) {
			lookupTopic.clear();
		}
		return this;
	}

	private CommandLookupTopicResponse lookupTopicResponse;
	private static final int _LOOKUP_TOPIC_RESPONSE_FIELD_NUMBER = 24;
	private static final int _LOOKUP_TOPIC_RESPONSE_TAG = (_LOOKUP_TOPIC_RESPONSE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _LOOKUP_TOPIC_RESPONSE_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_LOOKUP_TOPIC_RESPONSE_TAG);
	private static final int _LOOKUP_TOPIC_RESPONSE_MASK = 1 << (23 % 32);
	public boolean hasLookupTopicResponse() {
		return (_bitField0 & _LOOKUP_TOPIC_RESPONSE_MASK) != 0;
	}
	public CommandLookupTopicResponse getLookupTopicResponse() {
		if (!hasLookupTopicResponse()) {
			throw new IllegalStateException("Field 'lookupTopicResponse' is not set");
		}
		return lookupTopicResponse;
	}
	public CommandLookupTopicResponse setLookupTopicResponse() {
		if (lookupTopicResponse == null) {
			lookupTopicResponse = new CommandLookupTopicResponse();
		}
		_bitField0 |= _LOOKUP_TOPIC_RESPONSE_MASK;
		_cachedSize = -1;
		return lookupTopicResponse;
	}
	public BaseCommand clearLookupTopicResponse() {
		_bitField0 &= ~_LOOKUP_TOPIC_RESPONSE_MASK;
		if (hasLookupTopicResponse()) {
			lookupTopicResponse.clear();
		}
		return this;
	}

	private CommandConsumerStats consumerStats;
	private static final int _CONSUMER_STATS_FIELD_NUMBER = 25;
	private static final int _CONSUMER_STATS_TAG = (_CONSUMER_STATS_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _CONSUMER_STATS_TAG_SIZE = LightProtoCodec.computeVarIntSize(_CONSUMER_STATS_TAG);
	private static final int _CONSUMER_STATS_MASK = 1 << (24 % 32);
	public boolean hasConsumerStats() {
		return (_bitField0 & _CONSUMER_STATS_MASK) != 0;
	}
	public CommandConsumerStats getConsumerStats() {
		if (!hasConsumerStats()) {
			throw new IllegalStateException("Field 'consumerStats' is not set");
		}
		return consumerStats;
	}
	public CommandConsumerStats setConsumerStats() {
		if (consumerStats == null) {
			consumerStats = new CommandConsumerStats();
		}
		_bitField0 |= _CONSUMER_STATS_MASK;
		_cachedSize = -1;
		return consumerStats;
	}
	public BaseCommand clearConsumerStats() {
		_bitField0 &= ~_CONSUMER_STATS_MASK;
		if (hasConsumerStats()) {
			consumerStats.clear();
		}
		return this;
	}

	private CommandConsumerStatsResponse consumerStatsResponse;
	private static final int _CONSUMER_STATS_RESPONSE_FIELD_NUMBER = 26;
	private static final int _CONSUMER_STATS_RESPONSE_TAG = (_CONSUMER_STATS_RESPONSE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _CONSUMER_STATS_RESPONSE_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_CONSUMER_STATS_RESPONSE_TAG);
	private static final int _CONSUMER_STATS_RESPONSE_MASK = 1 << (25 % 32);
	public boolean hasConsumerStatsResponse() {
		return (_bitField0 & _CONSUMER_STATS_RESPONSE_MASK) != 0;
	}
	public CommandConsumerStatsResponse getConsumerStatsResponse() {
		if (!hasConsumerStatsResponse()) {
			throw new IllegalStateException("Field 'consumerStatsResponse' is not set");
		}
		return consumerStatsResponse;
	}
	public CommandConsumerStatsResponse setConsumerStatsResponse() {
		if (consumerStatsResponse == null) {
			consumerStatsResponse = new CommandConsumerStatsResponse();
		}
		_bitField0 |= _CONSUMER_STATS_RESPONSE_MASK;
		_cachedSize = -1;
		return consumerStatsResponse;
	}
	public BaseCommand clearConsumerStatsResponse() {
		_bitField0 &= ~_CONSUMER_STATS_RESPONSE_MASK;
		if (hasConsumerStatsResponse()) {
			consumerStatsResponse.clear();
		}
		return this;
	}

	private CommandReachedEndOfTopic reachedEndOfTopic;
	private static final int _REACHED_END_OF_TOPIC_FIELD_NUMBER = 27;
	private static final int _REACHED_END_OF_TOPIC_TAG = (_REACHED_END_OF_TOPIC_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _REACHED_END_OF_TOPIC_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_REACHED_END_OF_TOPIC_TAG);
	private static final int _REACHED_END_OF_TOPIC_MASK = 1 << (26 % 32);
	public boolean hasReachedEndOfTopic() {
		return (_bitField0 & _REACHED_END_OF_TOPIC_MASK) != 0;
	}
	public CommandReachedEndOfTopic getReachedEndOfTopic() {
		if (!hasReachedEndOfTopic()) {
			throw new IllegalStateException("Field 'reachedEndOfTopic' is not set");
		}
		return reachedEndOfTopic;
	}
	public CommandReachedEndOfTopic setReachedEndOfTopic() {
		if (reachedEndOfTopic == null) {
			reachedEndOfTopic = new CommandReachedEndOfTopic();
		}
		_bitField0 |= _REACHED_END_OF_TOPIC_MASK;
		_cachedSize = -1;
		return reachedEndOfTopic;
	}
	public BaseCommand clearReachedEndOfTopic() {
		_bitField0 &= ~_REACHED_END_OF_TOPIC_MASK;
		if (hasReachedEndOfTopic()) {
			reachedEndOfTopic.clear();
		}
		return this;
	}

	private CommandSeek seek;
	private static final int _SEEK_FIELD_NUMBER = 28;
	private static final int _SEEK_TAG = (_SEEK_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _SEEK_TAG_SIZE = LightProtoCodec.computeVarIntSize(_SEEK_TAG);
	private static final int _SEEK_MASK = 1 << (27 % 32);
	public boolean hasSeek() {
		return (_bitField0 & _SEEK_MASK) != 0;
	}
	public CommandSeek getSeek() {
		if (!hasSeek()) {
			throw new IllegalStateException("Field 'seek' is not set");
		}
		return seek;
	}
	public CommandSeek setSeek() {
		if (seek == null) {
			seek = new CommandSeek();
		}
		_bitField0 |= _SEEK_MASK;
		_cachedSize = -1;
		return seek;
	}
	public BaseCommand clearSeek() {
		_bitField0 &= ~_SEEK_MASK;
		if (hasSeek()) {
			seek.clear();
		}
		return this;
	}

	private CommandGetLastMessageId getLastMessageId;
	private static final int _GET_LAST_MESSAGE_ID_FIELD_NUMBER = 29;
	private static final int _GET_LAST_MESSAGE_ID_TAG = (_GET_LAST_MESSAGE_ID_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _GET_LAST_MESSAGE_ID_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_GET_LAST_MESSAGE_ID_TAG);
	private static final int _GET_LAST_MESSAGE_ID_MASK = 1 << (28 % 32);
	public boolean hasGetLastMessageId() {
		return (_bitField0 & _GET_LAST_MESSAGE_ID_MASK) != 0;
	}
	public CommandGetLastMessageId getGetLastMessageId() {
		if (!hasGetLastMessageId()) {
			throw new IllegalStateException("Field 'getLastMessageId' is not set");
		}
		return getLastMessageId;
	}
	public CommandGetLastMessageId setGetLastMessageId() {
		if (getLastMessageId == null) {
			getLastMessageId = new CommandGetLastMessageId();
		}
		_bitField0 |= _GET_LAST_MESSAGE_ID_MASK;
		_cachedSize = -1;
		return getLastMessageId;
	}
	public BaseCommand clearGetLastMessageId() {
		_bitField0 &= ~_GET_LAST_MESSAGE_ID_MASK;
		if (hasGetLastMessageId()) {
			getLastMessageId.clear();
		}
		return this;
	}

	private CommandGetLastMessageIdResponse getLastMessageIdResponse;
	private static final int _GET_LAST_MESSAGE_ID_RESPONSE_FIELD_NUMBER = 30;
	private static final int _GET_LAST_MESSAGE_ID_RESPONSE_TAG = (_GET_LAST_MESSAGE_ID_RESPONSE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _GET_LAST_MESSAGE_ID_RESPONSE_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_GET_LAST_MESSAGE_ID_RESPONSE_TAG);
	private static final int _GET_LAST_MESSAGE_ID_RESPONSE_MASK = 1 << (29 % 32);
	public boolean hasGetLastMessageIdResponse() {
		return (_bitField0 & _GET_LAST_MESSAGE_ID_RESPONSE_MASK) != 0;
	}
	public CommandGetLastMessageIdResponse getGetLastMessageIdResponse() {
		if (!hasGetLastMessageIdResponse()) {
			throw new IllegalStateException("Field 'getLastMessageIdResponse' is not set");
		}
		return getLastMessageIdResponse;
	}
	public CommandGetLastMessageIdResponse setGetLastMessageIdResponse() {
		if (getLastMessageIdResponse == null) {
			getLastMessageIdResponse = new CommandGetLastMessageIdResponse();
		}
		_bitField0 |= _GET_LAST_MESSAGE_ID_RESPONSE_MASK;
		_cachedSize = -1;
		return getLastMessageIdResponse;
	}
	public BaseCommand clearGetLastMessageIdResponse() {
		_bitField0 &= ~_GET_LAST_MESSAGE_ID_RESPONSE_MASK;
		if (hasGetLastMessageIdResponse()) {
			getLastMessageIdResponse.clear();
		}
		return this;
	}

	private CommandActiveConsumerChange activeConsumerChange;
	private static final int _ACTIVE_CONSUMER_CHANGE_FIELD_NUMBER = 31;
	private static final int _ACTIVE_CONSUMER_CHANGE_TAG = (_ACTIVE_CONSUMER_CHANGE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _ACTIVE_CONSUMER_CHANGE_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_ACTIVE_CONSUMER_CHANGE_TAG);
	private static final int _ACTIVE_CONSUMER_CHANGE_MASK = 1 << (30 % 32);
	public boolean hasActiveConsumerChange() {
		return (_bitField0 & _ACTIVE_CONSUMER_CHANGE_MASK) != 0;
	}
	public CommandActiveConsumerChange getActiveConsumerChange() {
		if (!hasActiveConsumerChange()) {
			throw new IllegalStateException("Field 'active_consumer_change' is not set");
		}
		return activeConsumerChange;
	}
	public CommandActiveConsumerChange setActiveConsumerChange() {
		if (activeConsumerChange == null) {
			activeConsumerChange = new CommandActiveConsumerChange();
		}
		_bitField0 |= _ACTIVE_CONSUMER_CHANGE_MASK;
		_cachedSize = -1;
		return activeConsumerChange;
	}
	public BaseCommand clearActiveConsumerChange() {
		_bitField0 &= ~_ACTIVE_CONSUMER_CHANGE_MASK;
		if (hasActiveConsumerChange()) {
			activeConsumerChange.clear();
		}
		return this;
	}

	private CommandGetTopicsOfNamespace getTopicsOfNamespace;
	private static final int _GET_TOPICS_OF_NAMESPACE_FIELD_NUMBER = 32;
	private static final int _GET_TOPICS_OF_NAMESPACE_TAG = (_GET_TOPICS_OF_NAMESPACE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _GET_TOPICS_OF_NAMESPACE_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_GET_TOPICS_OF_NAMESPACE_TAG);
	private static final int _GET_TOPICS_OF_NAMESPACE_MASK = 1 << (31 % 32);
	public boolean hasGetTopicsOfNamespace() {
		return (_bitField0 & _GET_TOPICS_OF_NAMESPACE_MASK) != 0;
	}
	public CommandGetTopicsOfNamespace getGetTopicsOfNamespace() {
		if (!hasGetTopicsOfNamespace()) {
			throw new IllegalStateException("Field 'getTopicsOfNamespace' is not set");
		}
		return getTopicsOfNamespace;
	}
	public CommandGetTopicsOfNamespace setGetTopicsOfNamespace() {
		if (getTopicsOfNamespace == null) {
			getTopicsOfNamespace = new CommandGetTopicsOfNamespace();
		}
		_bitField0 |= _GET_TOPICS_OF_NAMESPACE_MASK;
		_cachedSize = -1;
		return getTopicsOfNamespace;
	}
	public BaseCommand clearGetTopicsOfNamespace() {
		_bitField0 &= ~_GET_TOPICS_OF_NAMESPACE_MASK;
		if (hasGetTopicsOfNamespace()) {
			getTopicsOfNamespace.clear();
		}
		return this;
	}

	private CommandGetTopicsOfNamespaceResponse getTopicsOfNamespaceResponse;
	private static final int _GET_TOPICS_OF_NAMESPACE_RESPONSE_FIELD_NUMBER = 33;
	private static final int _GET_TOPICS_OF_NAMESPACE_RESPONSE_TAG = (_GET_TOPICS_OF_NAMESPACE_RESPONSE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _GET_TOPICS_OF_NAMESPACE_RESPONSE_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_GET_TOPICS_OF_NAMESPACE_RESPONSE_TAG);
	private static final int _GET_TOPICS_OF_NAMESPACE_RESPONSE_MASK = 1 << (32 % 32);
	public boolean hasGetTopicsOfNamespaceResponse() {
		return (_bitField1 & _GET_TOPICS_OF_NAMESPACE_RESPONSE_MASK) != 0;
	}
	public CommandGetTopicsOfNamespaceResponse getGetTopicsOfNamespaceResponse() {
		if (!hasGetTopicsOfNamespaceResponse()) {
			throw new IllegalStateException("Field 'getTopicsOfNamespaceResponse' is not set");
		}
		return getTopicsOfNamespaceResponse;
	}
	public CommandGetTopicsOfNamespaceResponse setGetTopicsOfNamespaceResponse() {
		if (getTopicsOfNamespaceResponse == null) {
			getTopicsOfNamespaceResponse = new CommandGetTopicsOfNamespaceResponse();
		}
		_bitField1 |= _GET_TOPICS_OF_NAMESPACE_RESPONSE_MASK;
		_cachedSize = -1;
		return getTopicsOfNamespaceResponse;
	}
	public BaseCommand clearGetTopicsOfNamespaceResponse() {
		_bitField1 &= ~_GET_TOPICS_OF_NAMESPACE_RESPONSE_MASK;
		if (hasGetTopicsOfNamespaceResponse()) {
			getTopicsOfNamespaceResponse.clear();
		}
		return this;
	}

	private CommandGetSchema getSchema;
	private static final int _GET_SCHEMA_FIELD_NUMBER = 34;
	private static final int _GET_SCHEMA_TAG = (_GET_SCHEMA_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _GET_SCHEMA_TAG_SIZE = LightProtoCodec.computeVarIntSize(_GET_SCHEMA_TAG);
	private static final int _GET_SCHEMA_MASK = 1 << (33 % 32);
	public boolean hasGetSchema() {
		return (_bitField1 & _GET_SCHEMA_MASK) != 0;
	}
	public CommandGetSchema getGetSchema() {
		if (!hasGetSchema()) {
			throw new IllegalStateException("Field 'getSchema' is not set");
		}
		return getSchema;
	}
	public CommandGetSchema setGetSchema() {
		if (getSchema == null) {
			getSchema = new CommandGetSchema();
		}
		_bitField1 |= _GET_SCHEMA_MASK;
		_cachedSize = -1;
		return getSchema;
	}
	public BaseCommand clearGetSchema() {
		_bitField1 &= ~_GET_SCHEMA_MASK;
		if (hasGetSchema()) {
			getSchema.clear();
		}
		return this;
	}

	private CommandGetSchemaResponse getSchemaResponse;
	private static final int _GET_SCHEMA_RESPONSE_FIELD_NUMBER = 35;
	private static final int _GET_SCHEMA_RESPONSE_TAG = (_GET_SCHEMA_RESPONSE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _GET_SCHEMA_RESPONSE_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_GET_SCHEMA_RESPONSE_TAG);
	private static final int _GET_SCHEMA_RESPONSE_MASK = 1 << (34 % 32);
	public boolean hasGetSchemaResponse() {
		return (_bitField1 & _GET_SCHEMA_RESPONSE_MASK) != 0;
	}
	public CommandGetSchemaResponse getGetSchemaResponse() {
		if (!hasGetSchemaResponse()) {
			throw new IllegalStateException("Field 'getSchemaResponse' is not set");
		}
		return getSchemaResponse;
	}
	public CommandGetSchemaResponse setGetSchemaResponse() {
		if (getSchemaResponse == null) {
			getSchemaResponse = new CommandGetSchemaResponse();
		}
		_bitField1 |= _GET_SCHEMA_RESPONSE_MASK;
		_cachedSize = -1;
		return getSchemaResponse;
	}
	public BaseCommand clearGetSchemaResponse() {
		_bitField1 &= ~_GET_SCHEMA_RESPONSE_MASK;
		if (hasGetSchemaResponse()) {
			getSchemaResponse.clear();
		}
		return this;
	}

	private CommandAuthChallenge authChallenge;
	private static final int _AUTH_CHALLENGE_FIELD_NUMBER = 36;
	private static final int _AUTH_CHALLENGE_TAG = (_AUTH_CHALLENGE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _AUTH_CHALLENGE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_AUTH_CHALLENGE_TAG);
	private static final int _AUTH_CHALLENGE_MASK = 1 << (35 % 32);
	public boolean hasAuthChallenge() {
		return (_bitField1 & _AUTH_CHALLENGE_MASK) != 0;
	}
	public CommandAuthChallenge getAuthChallenge() {
		if (!hasAuthChallenge()) {
			throw new IllegalStateException("Field 'authChallenge' is not set");
		}
		return authChallenge;
	}
	public CommandAuthChallenge setAuthChallenge() {
		if (authChallenge == null) {
			authChallenge = new CommandAuthChallenge();
		}
		_bitField1 |= _AUTH_CHALLENGE_MASK;
		_cachedSize = -1;
		return authChallenge;
	}
	public BaseCommand clearAuthChallenge() {
		_bitField1 &= ~_AUTH_CHALLENGE_MASK;
		if (hasAuthChallenge()) {
			authChallenge.clear();
		}
		return this;
	}

	private CommandAuthResponse authResponse;
	private static final int _AUTH_RESPONSE_FIELD_NUMBER = 37;
	private static final int _AUTH_RESPONSE_TAG = (_AUTH_RESPONSE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _AUTH_RESPONSE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_AUTH_RESPONSE_TAG);
	private static final int _AUTH_RESPONSE_MASK = 1 << (36 % 32);
	public boolean hasAuthResponse() {
		return (_bitField1 & _AUTH_RESPONSE_MASK) != 0;
	}
	public CommandAuthResponse getAuthResponse() {
		if (!hasAuthResponse()) {
			throw new IllegalStateException("Field 'authResponse' is not set");
		}
		return authResponse;
	}
	public CommandAuthResponse setAuthResponse() {
		if (authResponse == null) {
			authResponse = new CommandAuthResponse();
		}
		_bitField1 |= _AUTH_RESPONSE_MASK;
		_cachedSize = -1;
		return authResponse;
	}
	public BaseCommand clearAuthResponse() {
		_bitField1 &= ~_AUTH_RESPONSE_MASK;
		if (hasAuthResponse()) {
			authResponse.clear();
		}
		return this;
	}

	private CommandAckResponse ackResponse;
	private static final int _ACK_RESPONSE_FIELD_NUMBER = 38;
	private static final int _ACK_RESPONSE_TAG = (_ACK_RESPONSE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _ACK_RESPONSE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_ACK_RESPONSE_TAG);
	private static final int _ACK_RESPONSE_MASK = 1 << (37 % 32);
	public boolean hasAckResponse() {
		return (_bitField1 & _ACK_RESPONSE_MASK) != 0;
	}
	public CommandAckResponse getAckResponse() {
		if (!hasAckResponse()) {
			throw new IllegalStateException("Field 'ackResponse' is not set");
		}
		return ackResponse;
	}
	public CommandAckResponse setAckResponse() {
		if (ackResponse == null) {
			ackResponse = new CommandAckResponse();
		}
		_bitField1 |= _ACK_RESPONSE_MASK;
		_cachedSize = -1;
		return ackResponse;
	}
	public BaseCommand clearAckResponse() {
		_bitField1 &= ~_ACK_RESPONSE_MASK;
		if (hasAckResponse()) {
			ackResponse.clear();
		}
		return this;
	}

	private CommandGetOrCreateSchema getOrCreateSchema;
	private static final int _GET_OR_CREATE_SCHEMA_FIELD_NUMBER = 39;
	private static final int _GET_OR_CREATE_SCHEMA_TAG = (_GET_OR_CREATE_SCHEMA_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _GET_OR_CREATE_SCHEMA_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_GET_OR_CREATE_SCHEMA_TAG);
	private static final int _GET_OR_CREATE_SCHEMA_MASK = 1 << (38 % 32);
	public boolean hasGetOrCreateSchema() {
		return (_bitField1 & _GET_OR_CREATE_SCHEMA_MASK) != 0;
	}
	public CommandGetOrCreateSchema getGetOrCreateSchema() {
		if (!hasGetOrCreateSchema()) {
			throw new IllegalStateException("Field 'getOrCreateSchema' is not set");
		}
		return getOrCreateSchema;
	}
	public CommandGetOrCreateSchema setGetOrCreateSchema() {
		if (getOrCreateSchema == null) {
			getOrCreateSchema = new CommandGetOrCreateSchema();
		}
		_bitField1 |= _GET_OR_CREATE_SCHEMA_MASK;
		_cachedSize = -1;
		return getOrCreateSchema;
	}
	public BaseCommand clearGetOrCreateSchema() {
		_bitField1 &= ~_GET_OR_CREATE_SCHEMA_MASK;
		if (hasGetOrCreateSchema()) {
			getOrCreateSchema.clear();
		}
		return this;
	}

	private CommandGetOrCreateSchemaResponse getOrCreateSchemaResponse;
	private static final int _GET_OR_CREATE_SCHEMA_RESPONSE_FIELD_NUMBER = 40;
	private static final int _GET_OR_CREATE_SCHEMA_RESPONSE_TAG = (_GET_OR_CREATE_SCHEMA_RESPONSE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _GET_OR_CREATE_SCHEMA_RESPONSE_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_GET_OR_CREATE_SCHEMA_RESPONSE_TAG);
	private static final int _GET_OR_CREATE_SCHEMA_RESPONSE_MASK = 1 << (39 % 32);
	public boolean hasGetOrCreateSchemaResponse() {
		return (_bitField1 & _GET_OR_CREATE_SCHEMA_RESPONSE_MASK) != 0;
	}
	public CommandGetOrCreateSchemaResponse getGetOrCreateSchemaResponse() {
		if (!hasGetOrCreateSchemaResponse()) {
			throw new IllegalStateException("Field 'getOrCreateSchemaResponse' is not set");
		}
		return getOrCreateSchemaResponse;
	}
	public CommandGetOrCreateSchemaResponse setGetOrCreateSchemaResponse() {
		if (getOrCreateSchemaResponse == null) {
			getOrCreateSchemaResponse = new CommandGetOrCreateSchemaResponse();
		}
		_bitField1 |= _GET_OR_CREATE_SCHEMA_RESPONSE_MASK;
		_cachedSize = -1;
		return getOrCreateSchemaResponse;
	}
	public BaseCommand clearGetOrCreateSchemaResponse() {
		_bitField1 &= ~_GET_OR_CREATE_SCHEMA_RESPONSE_MASK;
		if (hasGetOrCreateSchemaResponse()) {
			getOrCreateSchemaResponse.clear();
		}
		return this;
	}

	private CommandNewTxn newTxn;
	private static final int _NEW_TXN_FIELD_NUMBER = 50;
	private static final int _NEW_TXN_TAG = (_NEW_TXN_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _NEW_TXN_TAG_SIZE = LightProtoCodec.computeVarIntSize(_NEW_TXN_TAG);
	private static final int _NEW_TXN_MASK = 1 << (40 % 32);
	public boolean hasNewTxn() {
		return (_bitField1 & _NEW_TXN_MASK) != 0;
	}
	public CommandNewTxn getNewTxn() {
		if (!hasNewTxn()) {
			throw new IllegalStateException("Field 'newTxn' is not set");
		}
		return newTxn;
	}
	public CommandNewTxn setNewTxn() {
		if (newTxn == null) {
			newTxn = new CommandNewTxn();
		}
		_bitField1 |= _NEW_TXN_MASK;
		_cachedSize = -1;
		return newTxn;
	}
	public BaseCommand clearNewTxn() {
		_bitField1 &= ~_NEW_TXN_MASK;
		if (hasNewTxn()) {
			newTxn.clear();
		}
		return this;
	}

	private CommandNewTxnResponse newTxnResponse;
	private static final int _NEW_TXN_RESPONSE_FIELD_NUMBER = 51;
	private static final int _NEW_TXN_RESPONSE_TAG = (_NEW_TXN_RESPONSE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _NEW_TXN_RESPONSE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_NEW_TXN_RESPONSE_TAG);
	private static final int _NEW_TXN_RESPONSE_MASK = 1 << (41 % 32);
	public boolean hasNewTxnResponse() {
		return (_bitField1 & _NEW_TXN_RESPONSE_MASK) != 0;
	}
	public CommandNewTxnResponse getNewTxnResponse() {
		if (!hasNewTxnResponse()) {
			throw new IllegalStateException("Field 'newTxnResponse' is not set");
		}
		return newTxnResponse;
	}
	public CommandNewTxnResponse setNewTxnResponse() {
		if (newTxnResponse == null) {
			newTxnResponse = new CommandNewTxnResponse();
		}
		_bitField1 |= _NEW_TXN_RESPONSE_MASK;
		_cachedSize = -1;
		return newTxnResponse;
	}
	public BaseCommand clearNewTxnResponse() {
		_bitField1 &= ~_NEW_TXN_RESPONSE_MASK;
		if (hasNewTxnResponse()) {
			newTxnResponse.clear();
		}
		return this;
	}

	private CommandAddPartitionToTxn addPartitionToTxn;
	private static final int _ADD_PARTITION_TO_TXN_FIELD_NUMBER = 52;
	private static final int _ADD_PARTITION_TO_TXN_TAG = (_ADD_PARTITION_TO_TXN_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _ADD_PARTITION_TO_TXN_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_ADD_PARTITION_TO_TXN_TAG);
	private static final int _ADD_PARTITION_TO_TXN_MASK = 1 << (42 % 32);
	public boolean hasAddPartitionToTxn() {
		return (_bitField1 & _ADD_PARTITION_TO_TXN_MASK) != 0;
	}
	public CommandAddPartitionToTxn getAddPartitionToTxn() {
		if (!hasAddPartitionToTxn()) {
			throw new IllegalStateException("Field 'addPartitionToTxn' is not set");
		}
		return addPartitionToTxn;
	}
	public CommandAddPartitionToTxn setAddPartitionToTxn() {
		if (addPartitionToTxn == null) {
			addPartitionToTxn = new CommandAddPartitionToTxn();
		}
		_bitField1 |= _ADD_PARTITION_TO_TXN_MASK;
		_cachedSize = -1;
		return addPartitionToTxn;
	}
	public BaseCommand clearAddPartitionToTxn() {
		_bitField1 &= ~_ADD_PARTITION_TO_TXN_MASK;
		if (hasAddPartitionToTxn()) {
			addPartitionToTxn.clear();
		}
		return this;
	}

	private CommandAddPartitionToTxnResponse addPartitionToTxnResponse;
	private static final int _ADD_PARTITION_TO_TXN_RESPONSE_FIELD_NUMBER = 53;
	private static final int _ADD_PARTITION_TO_TXN_RESPONSE_TAG = (_ADD_PARTITION_TO_TXN_RESPONSE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _ADD_PARTITION_TO_TXN_RESPONSE_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_ADD_PARTITION_TO_TXN_RESPONSE_TAG);
	private static final int _ADD_PARTITION_TO_TXN_RESPONSE_MASK = 1 << (43 % 32);
	public boolean hasAddPartitionToTxnResponse() {
		return (_bitField1 & _ADD_PARTITION_TO_TXN_RESPONSE_MASK) != 0;
	}
	public CommandAddPartitionToTxnResponse getAddPartitionToTxnResponse() {
		if (!hasAddPartitionToTxnResponse()) {
			throw new IllegalStateException("Field 'addPartitionToTxnResponse' is not set");
		}
		return addPartitionToTxnResponse;
	}
	public CommandAddPartitionToTxnResponse setAddPartitionToTxnResponse() {
		if (addPartitionToTxnResponse == null) {
			addPartitionToTxnResponse = new CommandAddPartitionToTxnResponse();
		}
		_bitField1 |= _ADD_PARTITION_TO_TXN_RESPONSE_MASK;
		_cachedSize = -1;
		return addPartitionToTxnResponse;
	}
	public BaseCommand clearAddPartitionToTxnResponse() {
		_bitField1 &= ~_ADD_PARTITION_TO_TXN_RESPONSE_MASK;
		if (hasAddPartitionToTxnResponse()) {
			addPartitionToTxnResponse.clear();
		}
		return this;
	}

	private CommandAddSubscriptionToTxn addSubscriptionToTxn;
	private static final int _ADD_SUBSCRIPTION_TO_TXN_FIELD_NUMBER = 54;
	private static final int _ADD_SUBSCRIPTION_TO_TXN_TAG = (_ADD_SUBSCRIPTION_TO_TXN_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _ADD_SUBSCRIPTION_TO_TXN_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_ADD_SUBSCRIPTION_TO_TXN_TAG);
	private static final int _ADD_SUBSCRIPTION_TO_TXN_MASK = 1 << (44 % 32);
	public boolean hasAddSubscriptionToTxn() {
		return (_bitField1 & _ADD_SUBSCRIPTION_TO_TXN_MASK) != 0;
	}
	public CommandAddSubscriptionToTxn getAddSubscriptionToTxn() {
		if (!hasAddSubscriptionToTxn()) {
			throw new IllegalStateException("Field 'addSubscriptionToTxn' is not set");
		}
		return addSubscriptionToTxn;
	}
	public CommandAddSubscriptionToTxn setAddSubscriptionToTxn() {
		if (addSubscriptionToTxn == null) {
			addSubscriptionToTxn = new CommandAddSubscriptionToTxn();
		}
		_bitField1 |= _ADD_SUBSCRIPTION_TO_TXN_MASK;
		_cachedSize = -1;
		return addSubscriptionToTxn;
	}
	public BaseCommand clearAddSubscriptionToTxn() {
		_bitField1 &= ~_ADD_SUBSCRIPTION_TO_TXN_MASK;
		if (hasAddSubscriptionToTxn()) {
			addSubscriptionToTxn.clear();
		}
		return this;
	}

	private CommandAddSubscriptionToTxnResponse addSubscriptionToTxnResponse;
	private static final int _ADD_SUBSCRIPTION_TO_TXN_RESPONSE_FIELD_NUMBER = 55;
	private static final int _ADD_SUBSCRIPTION_TO_TXN_RESPONSE_TAG = (_ADD_SUBSCRIPTION_TO_TXN_RESPONSE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _ADD_SUBSCRIPTION_TO_TXN_RESPONSE_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_ADD_SUBSCRIPTION_TO_TXN_RESPONSE_TAG);
	private static final int _ADD_SUBSCRIPTION_TO_TXN_RESPONSE_MASK = 1 << (45 % 32);
	public boolean hasAddSubscriptionToTxnResponse() {
		return (_bitField1 & _ADD_SUBSCRIPTION_TO_TXN_RESPONSE_MASK) != 0;
	}
	public CommandAddSubscriptionToTxnResponse getAddSubscriptionToTxnResponse() {
		if (!hasAddSubscriptionToTxnResponse()) {
			throw new IllegalStateException("Field 'addSubscriptionToTxnResponse' is not set");
		}
		return addSubscriptionToTxnResponse;
	}
	public CommandAddSubscriptionToTxnResponse setAddSubscriptionToTxnResponse() {
		if (addSubscriptionToTxnResponse == null) {
			addSubscriptionToTxnResponse = new CommandAddSubscriptionToTxnResponse();
		}
		_bitField1 |= _ADD_SUBSCRIPTION_TO_TXN_RESPONSE_MASK;
		_cachedSize = -1;
		return addSubscriptionToTxnResponse;
	}
	public BaseCommand clearAddSubscriptionToTxnResponse() {
		_bitField1 &= ~_ADD_SUBSCRIPTION_TO_TXN_RESPONSE_MASK;
		if (hasAddSubscriptionToTxnResponse()) {
			addSubscriptionToTxnResponse.clear();
		}
		return this;
	}

	private CommandEndTxn endTxn;
	private static final int _END_TXN_FIELD_NUMBER = 56;
	private static final int _END_TXN_TAG = (_END_TXN_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _END_TXN_TAG_SIZE = LightProtoCodec.computeVarIntSize(_END_TXN_TAG);
	private static final int _END_TXN_MASK = 1 << (46 % 32);
	public boolean hasEndTxn() {
		return (_bitField1 & _END_TXN_MASK) != 0;
	}
	public CommandEndTxn getEndTxn() {
		if (!hasEndTxn()) {
			throw new IllegalStateException("Field 'endTxn' is not set");
		}
		return endTxn;
	}
	public CommandEndTxn setEndTxn() {
		if (endTxn == null) {
			endTxn = new CommandEndTxn();
		}
		_bitField1 |= _END_TXN_MASK;
		_cachedSize = -1;
		return endTxn;
	}
	public BaseCommand clearEndTxn() {
		_bitField1 &= ~_END_TXN_MASK;
		if (hasEndTxn()) {
			endTxn.clear();
		}
		return this;
	}

	private CommandEndTxnResponse endTxnResponse;
	private static final int _END_TXN_RESPONSE_FIELD_NUMBER = 57;
	private static final int _END_TXN_RESPONSE_TAG = (_END_TXN_RESPONSE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _END_TXN_RESPONSE_TAG_SIZE = LightProtoCodec.computeVarIntSize(_END_TXN_RESPONSE_TAG);
	private static final int _END_TXN_RESPONSE_MASK = 1 << (47 % 32);
	public boolean hasEndTxnResponse() {
		return (_bitField1 & _END_TXN_RESPONSE_MASK) != 0;
	}
	public CommandEndTxnResponse getEndTxnResponse() {
		if (!hasEndTxnResponse()) {
			throw new IllegalStateException("Field 'endTxnResponse' is not set");
		}
		return endTxnResponse;
	}
	public CommandEndTxnResponse setEndTxnResponse() {
		if (endTxnResponse == null) {
			endTxnResponse = new CommandEndTxnResponse();
		}
		_bitField1 |= _END_TXN_RESPONSE_MASK;
		_cachedSize = -1;
		return endTxnResponse;
	}
	public BaseCommand clearEndTxnResponse() {
		_bitField1 &= ~_END_TXN_RESPONSE_MASK;
		if (hasEndTxnResponse()) {
			endTxnResponse.clear();
		}
		return this;
	}

	private CommandEndTxnOnPartition endTxnOnPartition;
	private static final int _END_TXN_ON_PARTITION_FIELD_NUMBER = 58;
	private static final int _END_TXN_ON_PARTITION_TAG = (_END_TXN_ON_PARTITION_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _END_TXN_ON_PARTITION_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_END_TXN_ON_PARTITION_TAG);
	private static final int _END_TXN_ON_PARTITION_MASK = 1 << (48 % 32);
	public boolean hasEndTxnOnPartition() {
		return (_bitField1 & _END_TXN_ON_PARTITION_MASK) != 0;
	}
	public CommandEndTxnOnPartition getEndTxnOnPartition() {
		if (!hasEndTxnOnPartition()) {
			throw new IllegalStateException("Field 'endTxnOnPartition' is not set");
		}
		return endTxnOnPartition;
	}
	public CommandEndTxnOnPartition setEndTxnOnPartition() {
		if (endTxnOnPartition == null) {
			endTxnOnPartition = new CommandEndTxnOnPartition();
		}
		_bitField1 |= _END_TXN_ON_PARTITION_MASK;
		_cachedSize = -1;
		return endTxnOnPartition;
	}
	public BaseCommand clearEndTxnOnPartition() {
		_bitField1 &= ~_END_TXN_ON_PARTITION_MASK;
		if (hasEndTxnOnPartition()) {
			endTxnOnPartition.clear();
		}
		return this;
	}

	private CommandEndTxnOnPartitionResponse endTxnOnPartitionResponse;
	private static final int _END_TXN_ON_PARTITION_RESPONSE_FIELD_NUMBER = 59;
	private static final int _END_TXN_ON_PARTITION_RESPONSE_TAG = (_END_TXN_ON_PARTITION_RESPONSE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _END_TXN_ON_PARTITION_RESPONSE_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_END_TXN_ON_PARTITION_RESPONSE_TAG);
	private static final int _END_TXN_ON_PARTITION_RESPONSE_MASK = 1 << (49 % 32);
	public boolean hasEndTxnOnPartitionResponse() {
		return (_bitField1 & _END_TXN_ON_PARTITION_RESPONSE_MASK) != 0;
	}
	public CommandEndTxnOnPartitionResponse getEndTxnOnPartitionResponse() {
		if (!hasEndTxnOnPartitionResponse()) {
			throw new IllegalStateException("Field 'endTxnOnPartitionResponse' is not set");
		}
		return endTxnOnPartitionResponse;
	}
	public CommandEndTxnOnPartitionResponse setEndTxnOnPartitionResponse() {
		if (endTxnOnPartitionResponse == null) {
			endTxnOnPartitionResponse = new CommandEndTxnOnPartitionResponse();
		}
		_bitField1 |= _END_TXN_ON_PARTITION_RESPONSE_MASK;
		_cachedSize = -1;
		return endTxnOnPartitionResponse;
	}
	public BaseCommand clearEndTxnOnPartitionResponse() {
		_bitField1 &= ~_END_TXN_ON_PARTITION_RESPONSE_MASK;
		if (hasEndTxnOnPartitionResponse()) {
			endTxnOnPartitionResponse.clear();
		}
		return this;
	}

	private CommandEndTxnOnSubscription endTxnOnSubscription;
	private static final int _END_TXN_ON_SUBSCRIPTION_FIELD_NUMBER = 60;
	private static final int _END_TXN_ON_SUBSCRIPTION_TAG = (_END_TXN_ON_SUBSCRIPTION_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _END_TXN_ON_SUBSCRIPTION_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_END_TXN_ON_SUBSCRIPTION_TAG);
	private static final int _END_TXN_ON_SUBSCRIPTION_MASK = 1 << (50 % 32);
	public boolean hasEndTxnOnSubscription() {
		return (_bitField1 & _END_TXN_ON_SUBSCRIPTION_MASK) != 0;
	}
	public CommandEndTxnOnSubscription getEndTxnOnSubscription() {
		if (!hasEndTxnOnSubscription()) {
			throw new IllegalStateException("Field 'endTxnOnSubscription' is not set");
		}
		return endTxnOnSubscription;
	}
	public CommandEndTxnOnSubscription setEndTxnOnSubscription() {
		if (endTxnOnSubscription == null) {
			endTxnOnSubscription = new CommandEndTxnOnSubscription();
		}
		_bitField1 |= _END_TXN_ON_SUBSCRIPTION_MASK;
		_cachedSize = -1;
		return endTxnOnSubscription;
	}
	public BaseCommand clearEndTxnOnSubscription() {
		_bitField1 &= ~_END_TXN_ON_SUBSCRIPTION_MASK;
		if (hasEndTxnOnSubscription()) {
			endTxnOnSubscription.clear();
		}
		return this;
	}

	private CommandEndTxnOnSubscriptionResponse endTxnOnSubscriptionResponse;
	private static final int _END_TXN_ON_SUBSCRIPTION_RESPONSE_FIELD_NUMBER = 61;
	private static final int _END_TXN_ON_SUBSCRIPTION_RESPONSE_TAG = (_END_TXN_ON_SUBSCRIPTION_RESPONSE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _END_TXN_ON_SUBSCRIPTION_RESPONSE_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_END_TXN_ON_SUBSCRIPTION_RESPONSE_TAG);
	private static final int _END_TXN_ON_SUBSCRIPTION_RESPONSE_MASK = 1 << (51 % 32);
	public boolean hasEndTxnOnSubscriptionResponse() {
		return (_bitField1 & _END_TXN_ON_SUBSCRIPTION_RESPONSE_MASK) != 0;
	}
	public CommandEndTxnOnSubscriptionResponse getEndTxnOnSubscriptionResponse() {
		if (!hasEndTxnOnSubscriptionResponse()) {
			throw new IllegalStateException("Field 'endTxnOnSubscriptionResponse' is not set");
		}
		return endTxnOnSubscriptionResponse;
	}
	public CommandEndTxnOnSubscriptionResponse setEndTxnOnSubscriptionResponse() {
		if (endTxnOnSubscriptionResponse == null) {
			endTxnOnSubscriptionResponse = new CommandEndTxnOnSubscriptionResponse();
		}
		_bitField1 |= _END_TXN_ON_SUBSCRIPTION_RESPONSE_MASK;
		_cachedSize = -1;
		return endTxnOnSubscriptionResponse;
	}
	public BaseCommand clearEndTxnOnSubscriptionResponse() {
		_bitField1 &= ~_END_TXN_ON_SUBSCRIPTION_RESPONSE_MASK;
		if (hasEndTxnOnSubscriptionResponse()) {
			endTxnOnSubscriptionResponse.clear();
		}
		return this;
	}

	private CommandTcClientConnectRequest tcClientConnectRequest;
	private static final int _TC_CLIENT_CONNECT_REQUEST_FIELD_NUMBER = 62;
	private static final int _TC_CLIENT_CONNECT_REQUEST_TAG = (_TC_CLIENT_CONNECT_REQUEST_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _TC_CLIENT_CONNECT_REQUEST_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_TC_CLIENT_CONNECT_REQUEST_TAG);
	private static final int _TC_CLIENT_CONNECT_REQUEST_MASK = 1 << (52 % 32);
	public boolean hasTcClientConnectRequest() {
		return (_bitField1 & _TC_CLIENT_CONNECT_REQUEST_MASK) != 0;
	}
	public CommandTcClientConnectRequest getTcClientConnectRequest() {
		if (!hasTcClientConnectRequest()) {
			throw new IllegalStateException("Field 'tcClientConnectRequest' is not set");
		}
		return tcClientConnectRequest;
	}
	public CommandTcClientConnectRequest setTcClientConnectRequest() {
		if (tcClientConnectRequest == null) {
			tcClientConnectRequest = new CommandTcClientConnectRequest();
		}
		_bitField1 |= _TC_CLIENT_CONNECT_REQUEST_MASK;
		_cachedSize = -1;
		return tcClientConnectRequest;
	}
	public BaseCommand clearTcClientConnectRequest() {
		_bitField1 &= ~_TC_CLIENT_CONNECT_REQUEST_MASK;
		if (hasTcClientConnectRequest()) {
			tcClientConnectRequest.clear();
		}
		return this;
	}

	private CommandTcClientConnectResponse tcClientConnectResponse;
	private static final int _TC_CLIENT_CONNECT_RESPONSE_FIELD_NUMBER = 63;
	private static final int _TC_CLIENT_CONNECT_RESPONSE_TAG = (_TC_CLIENT_CONNECT_RESPONSE_FIELD_NUMBER << LightProtoCodec.TAG_TYPE_BITS)
			| LightProtoCodec.WIRETYPE_LENGTH_DELIMITED;
	private static final int _TC_CLIENT_CONNECT_RESPONSE_TAG_SIZE = LightProtoCodec
			.computeVarIntSize(_TC_CLIENT_CONNECT_RESPONSE_TAG);
	private static final int _TC_CLIENT_CONNECT_RESPONSE_MASK = 1 << (53 % 32);
	public boolean hasTcClientConnectResponse() {
		return (_bitField1 & _TC_CLIENT_CONNECT_RESPONSE_MASK) != 0;
	}
	public CommandTcClientConnectResponse getTcClientConnectResponse() {
		if (!hasTcClientConnectResponse()) {
			throw new IllegalStateException("Field 'tcClientConnectResponse' is not set");
		}
		return tcClientConnectResponse;
	}
	public CommandTcClientConnectResponse setTcClientConnectResponse() {
		if (tcClientConnectResponse == null) {
			tcClientConnectResponse = new CommandTcClientConnectResponse();
		}
		_bitField1 |= _TC_CLIENT_CONNECT_RESPONSE_MASK;
		_cachedSize = -1;
		return tcClientConnectResponse;
	}
	public BaseCommand clearTcClientConnectResponse() {
		_bitField1 &= ~_TC_CLIENT_CONNECT_RESPONSE_MASK;
		if (hasTcClientConnectResponse()) {
			tcClientConnectResponse.clear();
		}
		return this;
	}

	private int _bitField0;
	private static final int _REQUIRED_FIELDS_MASK0 = 0 | _TYPE_MASK;
	private int _bitField1;
	private static final int _REQUIRED_FIELDS_MASK1 = 0;
	public int writeTo(io.netty.buffer.ByteBuf _b) {
		checkRequiredFields();
		int _writeIdx = _b.writerIndex();
		LightProtoCodec.writeVarInt(_b, _TYPE_TAG);
		LightProtoCodec.writeVarInt(_b, type.getValue());
		if (hasConnect()) {
			LightProtoCodec.writeVarInt(_b, _CONNECT_TAG);
			LightProtoCodec.writeVarInt(_b, connect.getSerializedSize());
			connect.writeTo(_b);
		}
		if (hasConnected()) {
			LightProtoCodec.writeVarInt(_b, _CONNECTED_TAG);
			LightProtoCodec.writeVarInt(_b, connected.getSerializedSize());
			connected.writeTo(_b);
		}
		if (hasSubscribe()) {
			LightProtoCodec.writeVarInt(_b, _SUBSCRIBE_TAG);
			LightProtoCodec.writeVarInt(_b, subscribe.getSerializedSize());
			subscribe.writeTo(_b);
		}
		if (hasProducer()) {
			LightProtoCodec.writeVarInt(_b, _PRODUCER_TAG);
			LightProtoCodec.writeVarInt(_b, producer.getSerializedSize());
			producer.writeTo(_b);
		}
		if (hasSend()) {
			LightProtoCodec.writeVarInt(_b, _SEND_TAG);
			LightProtoCodec.writeVarInt(_b, send.getSerializedSize());
			send.writeTo(_b);
		}
		if (hasSendReceipt()) {
			LightProtoCodec.writeVarInt(_b, _SEND_RECEIPT_TAG);
			LightProtoCodec.writeVarInt(_b, sendReceipt.getSerializedSize());
			sendReceipt.writeTo(_b);
		}
		if (hasSendError()) {
			LightProtoCodec.writeVarInt(_b, _SEND_ERROR_TAG);
			LightProtoCodec.writeVarInt(_b, sendError.getSerializedSize());
			sendError.writeTo(_b);
		}
		if (hasMessage()) {
			LightProtoCodec.writeVarInt(_b, _MESSAGE_TAG);
			LightProtoCodec.writeVarInt(_b, message.getSerializedSize());
			message.writeTo(_b);
		}
		if (hasAck()) {
			LightProtoCodec.writeVarInt(_b, _ACK_TAG);
			LightProtoCodec.writeVarInt(_b, ack.getSerializedSize());
			ack.writeTo(_b);
		}
		if (hasFlow()) {
			LightProtoCodec.writeVarInt(_b, _FLOW_TAG);
			LightProtoCodec.writeVarInt(_b, flow.getSerializedSize());
			flow.writeTo(_b);
		}
		if (hasUnsubscribe()) {
			LightProtoCodec.writeVarInt(_b, _UNSUBSCRIBE_TAG);
			LightProtoCodec.writeVarInt(_b, unsubscribe.getSerializedSize());
			unsubscribe.writeTo(_b);
		}
		if (hasSuccess()) {
			LightProtoCodec.writeVarInt(_b, _SUCCESS_TAG);
			LightProtoCodec.writeVarInt(_b, success.getSerializedSize());
			success.writeTo(_b);
		}
		if (hasError()) {
			LightProtoCodec.writeVarInt(_b, _ERROR_TAG);
			LightProtoCodec.writeVarInt(_b, error.getSerializedSize());
			error.writeTo(_b);
		}
		if (hasCloseProducer()) {
			LightProtoCodec.writeVarInt(_b, _CLOSE_PRODUCER_TAG);
			LightProtoCodec.writeVarInt(_b, closeProducer.getSerializedSize());
			closeProducer.writeTo(_b);
		}
		if (hasCloseConsumer()) {
			LightProtoCodec.writeVarInt(_b, _CLOSE_CONSUMER_TAG);
			LightProtoCodec.writeVarInt(_b, closeConsumer.getSerializedSize());
			closeConsumer.writeTo(_b);
		}
		if (hasProducerSuccess()) {
			LightProtoCodec.writeVarInt(_b, _PRODUCER_SUCCESS_TAG);
			LightProtoCodec.writeVarInt(_b, producerSuccess.getSerializedSize());
			producerSuccess.writeTo(_b);
		}
		if (hasPing()) {
			LightProtoCodec.writeVarInt(_b, _PING_TAG);
			LightProtoCodec.writeVarInt(_b, ping.getSerializedSize());
			ping.writeTo(_b);
		}
		if (hasPong()) {
			LightProtoCodec.writeVarInt(_b, _PONG_TAG);
			LightProtoCodec.writeVarInt(_b, pong.getSerializedSize());
			pong.writeTo(_b);
		}
		if (hasRedeliverUnacknowledgedMessages()) {
			LightProtoCodec.writeVarInt(_b, _REDELIVER_UNACKNOWLEDGED_MESSAGES_TAG);
			LightProtoCodec.writeVarInt(_b, redeliverUnacknowledgedMessages.getSerializedSize());
			redeliverUnacknowledgedMessages.writeTo(_b);
		}
		if (hasPartitionMetadata()) {
			LightProtoCodec.writeVarInt(_b, _PARTITION_METADATA_TAG);
			LightProtoCodec.writeVarInt(_b, partitionMetadata.getSerializedSize());
			partitionMetadata.writeTo(_b);
		}
		if (hasPartitionMetadataResponse()) {
			LightProtoCodec.writeVarInt(_b, _PARTITION_METADATA_RESPONSE_TAG);
			LightProtoCodec.writeVarInt(_b, partitionMetadataResponse.getSerializedSize());
			partitionMetadataResponse.writeTo(_b);
		}
		if (hasLookupTopic()) {
			LightProtoCodec.writeVarInt(_b, _LOOKUP_TOPIC_TAG);
			LightProtoCodec.writeVarInt(_b, lookupTopic.getSerializedSize());
			lookupTopic.writeTo(_b);
		}
		if (hasLookupTopicResponse()) {
			LightProtoCodec.writeVarInt(_b, _LOOKUP_TOPIC_RESPONSE_TAG);
			LightProtoCodec.writeVarInt(_b, lookupTopicResponse.getSerializedSize());
			lookupTopicResponse.writeTo(_b);
		}
		if (hasConsumerStats()) {
			LightProtoCodec.writeVarInt(_b, _CONSUMER_STATS_TAG);
			LightProtoCodec.writeVarInt(_b, consumerStats.getSerializedSize());
			consumerStats.writeTo(_b);
		}
		if (hasConsumerStatsResponse()) {
			LightProtoCodec.writeVarInt(_b, _CONSUMER_STATS_RESPONSE_TAG);
			LightProtoCodec.writeVarInt(_b, consumerStatsResponse.getSerializedSize());
			consumerStatsResponse.writeTo(_b);
		}
		if (hasReachedEndOfTopic()) {
			LightProtoCodec.writeVarInt(_b, _REACHED_END_OF_TOPIC_TAG);
			LightProtoCodec.writeVarInt(_b, reachedEndOfTopic.getSerializedSize());
			reachedEndOfTopic.writeTo(_b);
		}
		if (hasSeek()) {
			LightProtoCodec.writeVarInt(_b, _SEEK_TAG);
			LightProtoCodec.writeVarInt(_b, seek.getSerializedSize());
			seek.writeTo(_b);
		}
		if (hasGetLastMessageId()) {
			LightProtoCodec.writeVarInt(_b, _GET_LAST_MESSAGE_ID_TAG);
			LightProtoCodec.writeVarInt(_b, getLastMessageId.getSerializedSize());
			getLastMessageId.writeTo(_b);
		}
		if (hasGetLastMessageIdResponse()) {
			LightProtoCodec.writeVarInt(_b, _GET_LAST_MESSAGE_ID_RESPONSE_TAG);
			LightProtoCodec.writeVarInt(_b, getLastMessageIdResponse.getSerializedSize());
			getLastMessageIdResponse.writeTo(_b);
		}
		if (hasActiveConsumerChange()) {
			LightProtoCodec.writeVarInt(_b, _ACTIVE_CONSUMER_CHANGE_TAG);
			LightProtoCodec.writeVarInt(_b, activeConsumerChange.getSerializedSize());
			activeConsumerChange.writeTo(_b);
		}
		if (hasGetTopicsOfNamespace()) {
			LightProtoCodec.writeVarInt(_b, _GET_TOPICS_OF_NAMESPACE_TAG);
			LightProtoCodec.writeVarInt(_b, getTopicsOfNamespace.getSerializedSize());
			getTopicsOfNamespace.writeTo(_b);
		}
		if (hasGetTopicsOfNamespaceResponse()) {
			LightProtoCodec.writeVarInt(_b, _GET_TOPICS_OF_NAMESPACE_RESPONSE_TAG);
			LightProtoCodec.writeVarInt(_b, getTopicsOfNamespaceResponse.getSerializedSize());
			getTopicsOfNamespaceResponse.writeTo(_b);
		}
		if (hasGetSchema()) {
			LightProtoCodec.writeVarInt(_b, _GET_SCHEMA_TAG);
			LightProtoCodec.writeVarInt(_b, getSchema.getSerializedSize());
			getSchema.writeTo(_b);
		}
		if (hasGetSchemaResponse()) {
			LightProtoCodec.writeVarInt(_b, _GET_SCHEMA_RESPONSE_TAG);
			LightProtoCodec.writeVarInt(_b, getSchemaResponse.getSerializedSize());
			getSchemaResponse.writeTo(_b);
		}
		if (hasAuthChallenge()) {
			LightProtoCodec.writeVarInt(_b, _AUTH_CHALLENGE_TAG);
			LightProtoCodec.writeVarInt(_b, authChallenge.getSerializedSize());
			authChallenge.writeTo(_b);
		}
		if (hasAuthResponse()) {
			LightProtoCodec.writeVarInt(_b, _AUTH_RESPONSE_TAG);
			LightProtoCodec.writeVarInt(_b, authResponse.getSerializedSize());
			authResponse.writeTo(_b);
		}
		if (hasAckResponse()) {
			LightProtoCodec.writeVarInt(_b, _ACK_RESPONSE_TAG);
			LightProtoCodec.writeVarInt(_b, ackResponse.getSerializedSize());
			ackResponse.writeTo(_b);
		}
		if (hasGetOrCreateSchema()) {
			LightProtoCodec.writeVarInt(_b, _GET_OR_CREATE_SCHEMA_TAG);
			LightProtoCodec.writeVarInt(_b, getOrCreateSchema.getSerializedSize());
			getOrCreateSchema.writeTo(_b);
		}
		if (hasGetOrCreateSchemaResponse()) {
			LightProtoCodec.writeVarInt(_b, _GET_OR_CREATE_SCHEMA_RESPONSE_TAG);
			LightProtoCodec.writeVarInt(_b, getOrCreateSchemaResponse.getSerializedSize());
			getOrCreateSchemaResponse.writeTo(_b);
		}
		if (hasNewTxn()) {
			LightProtoCodec.writeVarInt(_b, _NEW_TXN_TAG);
			LightProtoCodec.writeVarInt(_b, newTxn.getSerializedSize());
			newTxn.writeTo(_b);
		}
		if (hasNewTxnResponse()) {
			LightProtoCodec.writeVarInt(_b, _NEW_TXN_RESPONSE_TAG);
			LightProtoCodec.writeVarInt(_b, newTxnResponse.getSerializedSize());
			newTxnResponse.writeTo(_b);
		}
		if (hasAddPartitionToTxn()) {
			LightProtoCodec.writeVarInt(_b, _ADD_PARTITION_TO_TXN_TAG);
			LightProtoCodec.writeVarInt(_b, addPartitionToTxn.getSerializedSize());
			addPartitionToTxn.writeTo(_b);
		}
		if (hasAddPartitionToTxnResponse()) {
			LightProtoCodec.writeVarInt(_b, _ADD_PARTITION_TO_TXN_RESPONSE_TAG);
			LightProtoCodec.writeVarInt(_b, addPartitionToTxnResponse.getSerializedSize());
			addPartitionToTxnResponse.writeTo(_b);
		}
		if (hasAddSubscriptionToTxn()) {
			LightProtoCodec.writeVarInt(_b, _ADD_SUBSCRIPTION_TO_TXN_TAG);
			LightProtoCodec.writeVarInt(_b, addSubscriptionToTxn.getSerializedSize());
			addSubscriptionToTxn.writeTo(_b);
		}
		if (hasAddSubscriptionToTxnResponse()) {
			LightProtoCodec.writeVarInt(_b, _ADD_SUBSCRIPTION_TO_TXN_RESPONSE_TAG);
			LightProtoCodec.writeVarInt(_b, addSubscriptionToTxnResponse.getSerializedSize());
			addSubscriptionToTxnResponse.writeTo(_b);
		}
		if (hasEndTxn()) {
			LightProtoCodec.writeVarInt(_b, _END_TXN_TAG);
			LightProtoCodec.writeVarInt(_b, endTxn.getSerializedSize());
			endTxn.writeTo(_b);
		}
		if (hasEndTxnResponse()) {
			LightProtoCodec.writeVarInt(_b, _END_TXN_RESPONSE_TAG);
			LightProtoCodec.writeVarInt(_b, endTxnResponse.getSerializedSize());
			endTxnResponse.writeTo(_b);
		}
		if (hasEndTxnOnPartition()) {
			LightProtoCodec.writeVarInt(_b, _END_TXN_ON_PARTITION_TAG);
			LightProtoCodec.writeVarInt(_b, endTxnOnPartition.getSerializedSize());
			endTxnOnPartition.writeTo(_b);
		}
		if (hasEndTxnOnPartitionResponse()) {
			LightProtoCodec.writeVarInt(_b, _END_TXN_ON_PARTITION_RESPONSE_TAG);
			LightProtoCodec.writeVarInt(_b, endTxnOnPartitionResponse.getSerializedSize());
			endTxnOnPartitionResponse.writeTo(_b);
		}
		if (hasEndTxnOnSubscription()) {
			LightProtoCodec.writeVarInt(_b, _END_TXN_ON_SUBSCRIPTION_TAG);
			LightProtoCodec.writeVarInt(_b, endTxnOnSubscription.getSerializedSize());
			endTxnOnSubscription.writeTo(_b);
		}
		if (hasEndTxnOnSubscriptionResponse()) {
			LightProtoCodec.writeVarInt(_b, _END_TXN_ON_SUBSCRIPTION_RESPONSE_TAG);
			LightProtoCodec.writeVarInt(_b, endTxnOnSubscriptionResponse.getSerializedSize());
			endTxnOnSubscriptionResponse.writeTo(_b);
		}
		if (hasTcClientConnectRequest()) {
			LightProtoCodec.writeVarInt(_b, _TC_CLIENT_CONNECT_REQUEST_TAG);
			LightProtoCodec.writeVarInt(_b, tcClientConnectRequest.getSerializedSize());
			tcClientConnectRequest.writeTo(_b);
		}
		if (hasTcClientConnectResponse()) {
			LightProtoCodec.writeVarInt(_b, _TC_CLIENT_CONNECT_RESPONSE_TAG);
			LightProtoCodec.writeVarInt(_b, tcClientConnectResponse.getSerializedSize());
			tcClientConnectResponse.writeTo(_b);
		}
		return (_b.writerIndex() - _writeIdx);
	}
	public int getSerializedSize() {
		if (_cachedSize > -1) {
			return _cachedSize;
		}

		int _size = 0;
		_size += _TYPE_TAG_SIZE;
		_size += LightProtoCodec.computeVarIntSize(type.getValue());
		if (hasConnect()) {
			_size += LightProtoCodec.computeVarIntSize(_CONNECT_TAG);
			int MsgsizeConnect = connect.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeConnect) + MsgsizeConnect;
		}
		if (hasConnected()) {
			_size += LightProtoCodec.computeVarIntSize(_CONNECTED_TAG);
			int MsgsizeConnected = connected.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeConnected) + MsgsizeConnected;
		}
		if (hasSubscribe()) {
			_size += LightProtoCodec.computeVarIntSize(_SUBSCRIBE_TAG);
			int MsgsizeSubscribe = subscribe.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeSubscribe) + MsgsizeSubscribe;
		}
		if (hasProducer()) {
			_size += LightProtoCodec.computeVarIntSize(_PRODUCER_TAG);
			int MsgsizeProducer = producer.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeProducer) + MsgsizeProducer;
		}
		if (hasSend()) {
			_size += LightProtoCodec.computeVarIntSize(_SEND_TAG);
			int MsgsizeSend = send.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeSend) + MsgsizeSend;
		}
		if (hasSendReceipt()) {
			_size += LightProtoCodec.computeVarIntSize(_SEND_RECEIPT_TAG);
			int MsgsizeSendReceipt = sendReceipt.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeSendReceipt) + MsgsizeSendReceipt;
		}
		if (hasSendError()) {
			_size += LightProtoCodec.computeVarIntSize(_SEND_ERROR_TAG);
			int MsgsizeSendError = sendError.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeSendError) + MsgsizeSendError;
		}
		if (hasMessage()) {
			_size += LightProtoCodec.computeVarIntSize(_MESSAGE_TAG);
			int MsgsizeMessage = message.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeMessage) + MsgsizeMessage;
		}
		if (hasAck()) {
			_size += LightProtoCodec.computeVarIntSize(_ACK_TAG);
			int MsgsizeAck = ack.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeAck) + MsgsizeAck;
		}
		if (hasFlow()) {
			_size += LightProtoCodec.computeVarIntSize(_FLOW_TAG);
			int MsgsizeFlow = flow.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeFlow) + MsgsizeFlow;
		}
		if (hasUnsubscribe()) {
			_size += LightProtoCodec.computeVarIntSize(_UNSUBSCRIBE_TAG);
			int MsgsizeUnsubscribe = unsubscribe.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeUnsubscribe) + MsgsizeUnsubscribe;
		}
		if (hasSuccess()) {
			_size += LightProtoCodec.computeVarIntSize(_SUCCESS_TAG);
			int MsgsizeSuccess = success.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeSuccess) + MsgsizeSuccess;
		}
		if (hasError()) {
			_size += LightProtoCodec.computeVarIntSize(_ERROR_TAG);
			int MsgsizeError = error.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeError) + MsgsizeError;
		}
		if (hasCloseProducer()) {
			_size += LightProtoCodec.computeVarIntSize(_CLOSE_PRODUCER_TAG);
			int MsgsizeCloseProducer = closeProducer.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeCloseProducer) + MsgsizeCloseProducer;
		}
		if (hasCloseConsumer()) {
			_size += LightProtoCodec.computeVarIntSize(_CLOSE_CONSUMER_TAG);
			int MsgsizeCloseConsumer = closeConsumer.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeCloseConsumer) + MsgsizeCloseConsumer;
		}
		if (hasProducerSuccess()) {
			_size += LightProtoCodec.computeVarIntSize(_PRODUCER_SUCCESS_TAG);
			int MsgsizeProducerSuccess = producerSuccess.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeProducerSuccess) + MsgsizeProducerSuccess;
		}
		if (hasPing()) {
			_size += LightProtoCodec.computeVarIntSize(_PING_TAG);
			int MsgsizePing = ping.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizePing) + MsgsizePing;
		}
		if (hasPong()) {
			_size += LightProtoCodec.computeVarIntSize(_PONG_TAG);
			int MsgsizePong = pong.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizePong) + MsgsizePong;
		}
		if (hasRedeliverUnacknowledgedMessages()) {
			_size += LightProtoCodec.computeVarIntSize(_REDELIVER_UNACKNOWLEDGED_MESSAGES_TAG);
			int MsgsizeRedeliverUnacknowledgedMessages = redeliverUnacknowledgedMessages.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeRedeliverUnacknowledgedMessages)
					+ MsgsizeRedeliverUnacknowledgedMessages;
		}
		if (hasPartitionMetadata()) {
			_size += LightProtoCodec.computeVarIntSize(_PARTITION_METADATA_TAG);
			int MsgsizePartitionMetadata = partitionMetadata.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizePartitionMetadata) + MsgsizePartitionMetadata;
		}
		if (hasPartitionMetadataResponse()) {
			_size += LightProtoCodec.computeVarIntSize(_PARTITION_METADATA_RESPONSE_TAG);
			int MsgsizePartitionMetadataResponse = partitionMetadataResponse.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizePartitionMetadataResponse)
					+ MsgsizePartitionMetadataResponse;
		}
		if (hasLookupTopic()) {
			_size += LightProtoCodec.computeVarIntSize(_LOOKUP_TOPIC_TAG);
			int MsgsizeLookupTopic = lookupTopic.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeLookupTopic) + MsgsizeLookupTopic;
		}
		if (hasLookupTopicResponse()) {
			_size += LightProtoCodec.computeVarIntSize(_LOOKUP_TOPIC_RESPONSE_TAG);
			int MsgsizeLookupTopicResponse = lookupTopicResponse.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeLookupTopicResponse) + MsgsizeLookupTopicResponse;
		}
		if (hasConsumerStats()) {
			_size += LightProtoCodec.computeVarIntSize(_CONSUMER_STATS_TAG);
			int MsgsizeConsumerStats = consumerStats.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeConsumerStats) + MsgsizeConsumerStats;
		}
		if (hasConsumerStatsResponse()) {
			_size += LightProtoCodec.computeVarIntSize(_CONSUMER_STATS_RESPONSE_TAG);
			int MsgsizeConsumerStatsResponse = consumerStatsResponse.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeConsumerStatsResponse) + MsgsizeConsumerStatsResponse;
		}
		if (hasReachedEndOfTopic()) {
			_size += LightProtoCodec.computeVarIntSize(_REACHED_END_OF_TOPIC_TAG);
			int MsgsizeReachedEndOfTopic = reachedEndOfTopic.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeReachedEndOfTopic) + MsgsizeReachedEndOfTopic;
		}
		if (hasSeek()) {
			_size += LightProtoCodec.computeVarIntSize(_SEEK_TAG);
			int MsgsizeSeek = seek.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeSeek) + MsgsizeSeek;
		}
		if (hasGetLastMessageId()) {
			_size += LightProtoCodec.computeVarIntSize(_GET_LAST_MESSAGE_ID_TAG);
			int MsgsizeGetLastMessageId = getLastMessageId.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeGetLastMessageId) + MsgsizeGetLastMessageId;
		}
		if (hasGetLastMessageIdResponse()) {
			_size += LightProtoCodec.computeVarIntSize(_GET_LAST_MESSAGE_ID_RESPONSE_TAG);
			int MsgsizeGetLastMessageIdResponse = getLastMessageIdResponse.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeGetLastMessageIdResponse)
					+ MsgsizeGetLastMessageIdResponse;
		}
		if (hasActiveConsumerChange()) {
			_size += LightProtoCodec.computeVarIntSize(_ACTIVE_CONSUMER_CHANGE_TAG);
			int MsgsizeActiveConsumerChange = activeConsumerChange.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeActiveConsumerChange) + MsgsizeActiveConsumerChange;
		}
		if (hasGetTopicsOfNamespace()) {
			_size += LightProtoCodec.computeVarIntSize(_GET_TOPICS_OF_NAMESPACE_TAG);
			int MsgsizeGetTopicsOfNamespace = getTopicsOfNamespace.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeGetTopicsOfNamespace) + MsgsizeGetTopicsOfNamespace;
		}
		if (hasGetTopicsOfNamespaceResponse()) {
			_size += LightProtoCodec.computeVarIntSize(_GET_TOPICS_OF_NAMESPACE_RESPONSE_TAG);
			int MsgsizeGetTopicsOfNamespaceResponse = getTopicsOfNamespaceResponse.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeGetTopicsOfNamespaceResponse)
					+ MsgsizeGetTopicsOfNamespaceResponse;
		}
		if (hasGetSchema()) {
			_size += LightProtoCodec.computeVarIntSize(_GET_SCHEMA_TAG);
			int MsgsizeGetSchema = getSchema.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeGetSchema) + MsgsizeGetSchema;
		}
		if (hasGetSchemaResponse()) {
			_size += LightProtoCodec.computeVarIntSize(_GET_SCHEMA_RESPONSE_TAG);
			int MsgsizeGetSchemaResponse = getSchemaResponse.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeGetSchemaResponse) + MsgsizeGetSchemaResponse;
		}
		if (hasAuthChallenge()) {
			_size += LightProtoCodec.computeVarIntSize(_AUTH_CHALLENGE_TAG);
			int MsgsizeAuthChallenge = authChallenge.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeAuthChallenge) + MsgsizeAuthChallenge;
		}
		if (hasAuthResponse()) {
			_size += LightProtoCodec.computeVarIntSize(_AUTH_RESPONSE_TAG);
			int MsgsizeAuthResponse = authResponse.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeAuthResponse) + MsgsizeAuthResponse;
		}
		if (hasAckResponse()) {
			_size += LightProtoCodec.computeVarIntSize(_ACK_RESPONSE_TAG);
			int MsgsizeAckResponse = ackResponse.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeAckResponse) + MsgsizeAckResponse;
		}
		if (hasGetOrCreateSchema()) {
			_size += LightProtoCodec.computeVarIntSize(_GET_OR_CREATE_SCHEMA_TAG);
			int MsgsizeGetOrCreateSchema = getOrCreateSchema.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeGetOrCreateSchema) + MsgsizeGetOrCreateSchema;
		}
		if (hasGetOrCreateSchemaResponse()) {
			_size += LightProtoCodec.computeVarIntSize(_GET_OR_CREATE_SCHEMA_RESPONSE_TAG);
			int MsgsizeGetOrCreateSchemaResponse = getOrCreateSchemaResponse.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeGetOrCreateSchemaResponse)
					+ MsgsizeGetOrCreateSchemaResponse;
		}
		if (hasNewTxn()) {
			_size += LightProtoCodec.computeVarIntSize(_NEW_TXN_TAG);
			int MsgsizeNewTxn = newTxn.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeNewTxn) + MsgsizeNewTxn;
		}
		if (hasNewTxnResponse()) {
			_size += LightProtoCodec.computeVarIntSize(_NEW_TXN_RESPONSE_TAG);
			int MsgsizeNewTxnResponse = newTxnResponse.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeNewTxnResponse) + MsgsizeNewTxnResponse;
		}
		if (hasAddPartitionToTxn()) {
			_size += LightProtoCodec.computeVarIntSize(_ADD_PARTITION_TO_TXN_TAG);
			int MsgsizeAddPartitionToTxn = addPartitionToTxn.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeAddPartitionToTxn) + MsgsizeAddPartitionToTxn;
		}
		if (hasAddPartitionToTxnResponse()) {
			_size += LightProtoCodec.computeVarIntSize(_ADD_PARTITION_TO_TXN_RESPONSE_TAG);
			int MsgsizeAddPartitionToTxnResponse = addPartitionToTxnResponse.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeAddPartitionToTxnResponse)
					+ MsgsizeAddPartitionToTxnResponse;
		}
		if (hasAddSubscriptionToTxn()) {
			_size += LightProtoCodec.computeVarIntSize(_ADD_SUBSCRIPTION_TO_TXN_TAG);
			int MsgsizeAddSubscriptionToTxn = addSubscriptionToTxn.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeAddSubscriptionToTxn) + MsgsizeAddSubscriptionToTxn;
		}
		if (hasAddSubscriptionToTxnResponse()) {
			_size += LightProtoCodec.computeVarIntSize(_ADD_SUBSCRIPTION_TO_TXN_RESPONSE_TAG);
			int MsgsizeAddSubscriptionToTxnResponse = addSubscriptionToTxnResponse.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeAddSubscriptionToTxnResponse)
					+ MsgsizeAddSubscriptionToTxnResponse;
		}
		if (hasEndTxn()) {
			_size += LightProtoCodec.computeVarIntSize(_END_TXN_TAG);
			int MsgsizeEndTxn = endTxn.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeEndTxn) + MsgsizeEndTxn;
		}
		if (hasEndTxnResponse()) {
			_size += LightProtoCodec.computeVarIntSize(_END_TXN_RESPONSE_TAG);
			int MsgsizeEndTxnResponse = endTxnResponse.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeEndTxnResponse) + MsgsizeEndTxnResponse;
		}
		if (hasEndTxnOnPartition()) {
			_size += LightProtoCodec.computeVarIntSize(_END_TXN_ON_PARTITION_TAG);
			int MsgsizeEndTxnOnPartition = endTxnOnPartition.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeEndTxnOnPartition) + MsgsizeEndTxnOnPartition;
		}
		if (hasEndTxnOnPartitionResponse()) {
			_size += LightProtoCodec.computeVarIntSize(_END_TXN_ON_PARTITION_RESPONSE_TAG);
			int MsgsizeEndTxnOnPartitionResponse = endTxnOnPartitionResponse.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeEndTxnOnPartitionResponse)
					+ MsgsizeEndTxnOnPartitionResponse;
		}
		if (hasEndTxnOnSubscription()) {
			_size += LightProtoCodec.computeVarIntSize(_END_TXN_ON_SUBSCRIPTION_TAG);
			int MsgsizeEndTxnOnSubscription = endTxnOnSubscription.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeEndTxnOnSubscription) + MsgsizeEndTxnOnSubscription;
		}
		if (hasEndTxnOnSubscriptionResponse()) {
			_size += LightProtoCodec.computeVarIntSize(_END_TXN_ON_SUBSCRIPTION_RESPONSE_TAG);
			int MsgsizeEndTxnOnSubscriptionResponse = endTxnOnSubscriptionResponse.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeEndTxnOnSubscriptionResponse)
					+ MsgsizeEndTxnOnSubscriptionResponse;
		}
		if (hasTcClientConnectRequest()) {
			_size += LightProtoCodec.computeVarIntSize(_TC_CLIENT_CONNECT_REQUEST_TAG);
			int MsgsizeTcClientConnectRequest = tcClientConnectRequest.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeTcClientConnectRequest) + MsgsizeTcClientConnectRequest;
		}
		if (hasTcClientConnectResponse()) {
			_size += LightProtoCodec.computeVarIntSize(_TC_CLIENT_CONNECT_RESPONSE_TAG);
			int MsgsizeTcClientConnectResponse = tcClientConnectResponse.getSerializedSize();
			_size += LightProtoCodec.computeVarIntSize(MsgsizeTcClientConnectResponse) + MsgsizeTcClientConnectResponse;
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
				case _TYPE_TAG :
					Type _type = Type.valueOf(LightProtoCodec.readVarInt(_buffer));
					if (_type != null) {
						_bitField0 |= _TYPE_MASK;
						type = _type;
					}
					break;
				case _CONNECT_TAG :
					_bitField0 |= _CONNECT_MASK;
					int connectSize = LightProtoCodec.readVarInt(_buffer);
					setConnect().parseFrom(_buffer, connectSize);
					break;
				case _CONNECTED_TAG :
					_bitField0 |= _CONNECTED_MASK;
					int connectedSize = LightProtoCodec.readVarInt(_buffer);
					setConnected().parseFrom(_buffer, connectedSize);
					break;
				case _SUBSCRIBE_TAG :
					_bitField0 |= _SUBSCRIBE_MASK;
					int subscribeSize = LightProtoCodec.readVarInt(_buffer);
					setSubscribe().parseFrom(_buffer, subscribeSize);
					break;
				case _PRODUCER_TAG :
					_bitField0 |= _PRODUCER_MASK;
					int producerSize = LightProtoCodec.readVarInt(_buffer);
					setProducer().parseFrom(_buffer, producerSize);
					break;
				case _SEND_TAG :
					_bitField0 |= _SEND_MASK;
					int sendSize = LightProtoCodec.readVarInt(_buffer);
					setSend().parseFrom(_buffer, sendSize);
					break;
				case _SEND_RECEIPT_TAG :
					_bitField0 |= _SEND_RECEIPT_MASK;
					int sendReceiptSize = LightProtoCodec.readVarInt(_buffer);
					setSendReceipt().parseFrom(_buffer, sendReceiptSize);
					break;
				case _SEND_ERROR_TAG :
					_bitField0 |= _SEND_ERROR_MASK;
					int sendErrorSize = LightProtoCodec.readVarInt(_buffer);
					setSendError().parseFrom(_buffer, sendErrorSize);
					break;
				case _MESSAGE_TAG :
					_bitField0 |= _MESSAGE_MASK;
					int messageSize = LightProtoCodec.readVarInt(_buffer);
					setMessage().parseFrom(_buffer, messageSize);
					break;
				case _ACK_TAG :
					_bitField0 |= _ACK_MASK;
					int ackSize = LightProtoCodec.readVarInt(_buffer);
					setAck().parseFrom(_buffer, ackSize);
					break;
				case _FLOW_TAG :
					_bitField0 |= _FLOW_MASK;
					int flowSize = LightProtoCodec.readVarInt(_buffer);
					setFlow().parseFrom(_buffer, flowSize);
					break;
				case _UNSUBSCRIBE_TAG :
					_bitField0 |= _UNSUBSCRIBE_MASK;
					int unsubscribeSize = LightProtoCodec.readVarInt(_buffer);
					setUnsubscribe().parseFrom(_buffer, unsubscribeSize);
					break;
				case _SUCCESS_TAG :
					_bitField0 |= _SUCCESS_MASK;
					int successSize = LightProtoCodec.readVarInt(_buffer);
					setSuccess().parseFrom(_buffer, successSize);
					break;
				case _ERROR_TAG :
					_bitField0 |= _ERROR_MASK;
					int errorSize = LightProtoCodec.readVarInt(_buffer);
					setError().parseFrom(_buffer, errorSize);
					break;
				case _CLOSE_PRODUCER_TAG :
					_bitField0 |= _CLOSE_PRODUCER_MASK;
					int closeProducerSize = LightProtoCodec.readVarInt(_buffer);
					setCloseProducer().parseFrom(_buffer, closeProducerSize);
					break;
				case _CLOSE_CONSUMER_TAG :
					_bitField0 |= _CLOSE_CONSUMER_MASK;
					int closeConsumerSize = LightProtoCodec.readVarInt(_buffer);
					setCloseConsumer().parseFrom(_buffer, closeConsumerSize);
					break;
				case _PRODUCER_SUCCESS_TAG :
					_bitField0 |= _PRODUCER_SUCCESS_MASK;
					int producerSuccessSize = LightProtoCodec.readVarInt(_buffer);
					setProducerSuccess().parseFrom(_buffer, producerSuccessSize);
					break;
				case _PING_TAG :
					_bitField0 |= _PING_MASK;
					int pingSize = LightProtoCodec.readVarInt(_buffer);
					setPing().parseFrom(_buffer, pingSize);
					break;
				case _PONG_TAG :
					_bitField0 |= _PONG_MASK;
					int pongSize = LightProtoCodec.readVarInt(_buffer);
					setPong().parseFrom(_buffer, pongSize);
					break;
				case _REDELIVER_UNACKNOWLEDGED_MESSAGES_TAG :
					_bitField0 |= _REDELIVER_UNACKNOWLEDGED_MESSAGES_MASK;
					int redeliverUnacknowledgedMessagesSize = LightProtoCodec.readVarInt(_buffer);
					setRedeliverUnacknowledgedMessages().parseFrom(_buffer, redeliverUnacknowledgedMessagesSize);
					break;
				case _PARTITION_METADATA_TAG :
					_bitField0 |= _PARTITION_METADATA_MASK;
					int partitionMetadataSize = LightProtoCodec.readVarInt(_buffer);
					setPartitionMetadata().parseFrom(_buffer, partitionMetadataSize);
					break;
				case _PARTITION_METADATA_RESPONSE_TAG :
					_bitField0 |= _PARTITION_METADATA_RESPONSE_MASK;
					int partitionMetadataResponseSize = LightProtoCodec.readVarInt(_buffer);
					setPartitionMetadataResponse().parseFrom(_buffer, partitionMetadataResponseSize);
					break;
				case _LOOKUP_TOPIC_TAG :
					_bitField0 |= _LOOKUP_TOPIC_MASK;
					int lookupTopicSize = LightProtoCodec.readVarInt(_buffer);
					setLookupTopic().parseFrom(_buffer, lookupTopicSize);
					break;
				case _LOOKUP_TOPIC_RESPONSE_TAG :
					_bitField0 |= _LOOKUP_TOPIC_RESPONSE_MASK;
					int lookupTopicResponseSize = LightProtoCodec.readVarInt(_buffer);
					setLookupTopicResponse().parseFrom(_buffer, lookupTopicResponseSize);
					break;
				case _CONSUMER_STATS_TAG :
					_bitField0 |= _CONSUMER_STATS_MASK;
					int consumerStatsSize = LightProtoCodec.readVarInt(_buffer);
					setConsumerStats().parseFrom(_buffer, consumerStatsSize);
					break;
				case _CONSUMER_STATS_RESPONSE_TAG :
					_bitField0 |= _CONSUMER_STATS_RESPONSE_MASK;
					int consumerStatsResponseSize = LightProtoCodec.readVarInt(_buffer);
					setConsumerStatsResponse().parseFrom(_buffer, consumerStatsResponseSize);
					break;
				case _REACHED_END_OF_TOPIC_TAG :
					_bitField0 |= _REACHED_END_OF_TOPIC_MASK;
					int reachedEndOfTopicSize = LightProtoCodec.readVarInt(_buffer);
					setReachedEndOfTopic().parseFrom(_buffer, reachedEndOfTopicSize);
					break;
				case _SEEK_TAG :
					_bitField0 |= _SEEK_MASK;
					int seekSize = LightProtoCodec.readVarInt(_buffer);
					setSeek().parseFrom(_buffer, seekSize);
					break;
				case _GET_LAST_MESSAGE_ID_TAG :
					_bitField0 |= _GET_LAST_MESSAGE_ID_MASK;
					int getLastMessageIdSize = LightProtoCodec.readVarInt(_buffer);
					setGetLastMessageId().parseFrom(_buffer, getLastMessageIdSize);
					break;
				case _GET_LAST_MESSAGE_ID_RESPONSE_TAG :
					_bitField0 |= _GET_LAST_MESSAGE_ID_RESPONSE_MASK;
					int getLastMessageIdResponseSize = LightProtoCodec.readVarInt(_buffer);
					setGetLastMessageIdResponse().parseFrom(_buffer, getLastMessageIdResponseSize);
					break;
				case _ACTIVE_CONSUMER_CHANGE_TAG :
					_bitField0 |= _ACTIVE_CONSUMER_CHANGE_MASK;
					int activeConsumerChangeSize = LightProtoCodec.readVarInt(_buffer);
					setActiveConsumerChange().parseFrom(_buffer, activeConsumerChangeSize);
					break;
				case _GET_TOPICS_OF_NAMESPACE_TAG :
					_bitField0 |= _GET_TOPICS_OF_NAMESPACE_MASK;
					int getTopicsOfNamespaceSize = LightProtoCodec.readVarInt(_buffer);
					setGetTopicsOfNamespace().parseFrom(_buffer, getTopicsOfNamespaceSize);
					break;
				case _GET_TOPICS_OF_NAMESPACE_RESPONSE_TAG :
					_bitField1 |= _GET_TOPICS_OF_NAMESPACE_RESPONSE_MASK;
					int getTopicsOfNamespaceResponseSize = LightProtoCodec.readVarInt(_buffer);
					setGetTopicsOfNamespaceResponse().parseFrom(_buffer, getTopicsOfNamespaceResponseSize);
					break;
				case _GET_SCHEMA_TAG :
					_bitField1 |= _GET_SCHEMA_MASK;
					int getSchemaSize = LightProtoCodec.readVarInt(_buffer);
					setGetSchema().parseFrom(_buffer, getSchemaSize);
					break;
				case _GET_SCHEMA_RESPONSE_TAG :
					_bitField1 |= _GET_SCHEMA_RESPONSE_MASK;
					int getSchemaResponseSize = LightProtoCodec.readVarInt(_buffer);
					setGetSchemaResponse().parseFrom(_buffer, getSchemaResponseSize);
					break;
				case _AUTH_CHALLENGE_TAG :
					_bitField1 |= _AUTH_CHALLENGE_MASK;
					int authChallengeSize = LightProtoCodec.readVarInt(_buffer);
					setAuthChallenge().parseFrom(_buffer, authChallengeSize);
					break;
				case _AUTH_RESPONSE_TAG :
					_bitField1 |= _AUTH_RESPONSE_MASK;
					int authResponseSize = LightProtoCodec.readVarInt(_buffer);
					setAuthResponse().parseFrom(_buffer, authResponseSize);
					break;
				case _ACK_RESPONSE_TAG :
					_bitField1 |= _ACK_RESPONSE_MASK;
					int ackResponseSize = LightProtoCodec.readVarInt(_buffer);
					setAckResponse().parseFrom(_buffer, ackResponseSize);
					break;
				case _GET_OR_CREATE_SCHEMA_TAG :
					_bitField1 |= _GET_OR_CREATE_SCHEMA_MASK;
					int getOrCreateSchemaSize = LightProtoCodec.readVarInt(_buffer);
					setGetOrCreateSchema().parseFrom(_buffer, getOrCreateSchemaSize);
					break;
				case _GET_OR_CREATE_SCHEMA_RESPONSE_TAG :
					_bitField1 |= _GET_OR_CREATE_SCHEMA_RESPONSE_MASK;
					int getOrCreateSchemaResponseSize = LightProtoCodec.readVarInt(_buffer);
					setGetOrCreateSchemaResponse().parseFrom(_buffer, getOrCreateSchemaResponseSize);
					break;
				case _NEW_TXN_TAG :
					_bitField1 |= _NEW_TXN_MASK;
					int newTxnSize = LightProtoCodec.readVarInt(_buffer);
					setNewTxn().parseFrom(_buffer, newTxnSize);
					break;
				case _NEW_TXN_RESPONSE_TAG :
					_bitField1 |= _NEW_TXN_RESPONSE_MASK;
					int newTxnResponseSize = LightProtoCodec.readVarInt(_buffer);
					setNewTxnResponse().parseFrom(_buffer, newTxnResponseSize);
					break;
				case _ADD_PARTITION_TO_TXN_TAG :
					_bitField1 |= _ADD_PARTITION_TO_TXN_MASK;
					int addPartitionToTxnSize = LightProtoCodec.readVarInt(_buffer);
					setAddPartitionToTxn().parseFrom(_buffer, addPartitionToTxnSize);
					break;
				case _ADD_PARTITION_TO_TXN_RESPONSE_TAG :
					_bitField1 |= _ADD_PARTITION_TO_TXN_RESPONSE_MASK;
					int addPartitionToTxnResponseSize = LightProtoCodec.readVarInt(_buffer);
					setAddPartitionToTxnResponse().parseFrom(_buffer, addPartitionToTxnResponseSize);
					break;
				case _ADD_SUBSCRIPTION_TO_TXN_TAG :
					_bitField1 |= _ADD_SUBSCRIPTION_TO_TXN_MASK;
					int addSubscriptionToTxnSize = LightProtoCodec.readVarInt(_buffer);
					setAddSubscriptionToTxn().parseFrom(_buffer, addSubscriptionToTxnSize);
					break;
				case _ADD_SUBSCRIPTION_TO_TXN_RESPONSE_TAG :
					_bitField1 |= _ADD_SUBSCRIPTION_TO_TXN_RESPONSE_MASK;
					int addSubscriptionToTxnResponseSize = LightProtoCodec.readVarInt(_buffer);
					setAddSubscriptionToTxnResponse().parseFrom(_buffer, addSubscriptionToTxnResponseSize);
					break;
				case _END_TXN_TAG :
					_bitField1 |= _END_TXN_MASK;
					int endTxnSize = LightProtoCodec.readVarInt(_buffer);
					setEndTxn().parseFrom(_buffer, endTxnSize);
					break;
				case _END_TXN_RESPONSE_TAG :
					_bitField1 |= _END_TXN_RESPONSE_MASK;
					int endTxnResponseSize = LightProtoCodec.readVarInt(_buffer);
					setEndTxnResponse().parseFrom(_buffer, endTxnResponseSize);
					break;
				case _END_TXN_ON_PARTITION_TAG :
					_bitField1 |= _END_TXN_ON_PARTITION_MASK;
					int endTxnOnPartitionSize = LightProtoCodec.readVarInt(_buffer);
					setEndTxnOnPartition().parseFrom(_buffer, endTxnOnPartitionSize);
					break;
				case _END_TXN_ON_PARTITION_RESPONSE_TAG :
					_bitField1 |= _END_TXN_ON_PARTITION_RESPONSE_MASK;
					int endTxnOnPartitionResponseSize = LightProtoCodec.readVarInt(_buffer);
					setEndTxnOnPartitionResponse().parseFrom(_buffer, endTxnOnPartitionResponseSize);
					break;
				case _END_TXN_ON_SUBSCRIPTION_TAG :
					_bitField1 |= _END_TXN_ON_SUBSCRIPTION_MASK;
					int endTxnOnSubscriptionSize = LightProtoCodec.readVarInt(_buffer);
					setEndTxnOnSubscription().parseFrom(_buffer, endTxnOnSubscriptionSize);
					break;
				case _END_TXN_ON_SUBSCRIPTION_RESPONSE_TAG :
					_bitField1 |= _END_TXN_ON_SUBSCRIPTION_RESPONSE_MASK;
					int endTxnOnSubscriptionResponseSize = LightProtoCodec.readVarInt(_buffer);
					setEndTxnOnSubscriptionResponse().parseFrom(_buffer, endTxnOnSubscriptionResponseSize);
					break;
				case _TC_CLIENT_CONNECT_REQUEST_TAG :
					_bitField1 |= _TC_CLIENT_CONNECT_REQUEST_MASK;
					int tcClientConnectRequestSize = LightProtoCodec.readVarInt(_buffer);
					setTcClientConnectRequest().parseFrom(_buffer, tcClientConnectRequestSize);
					break;
				case _TC_CLIENT_CONNECT_RESPONSE_TAG :
					_bitField1 |= _TC_CLIENT_CONNECT_RESPONSE_MASK;
					int tcClientConnectResponseSize = LightProtoCodec.readVarInt(_buffer);
					setTcClientConnectResponse().parseFrom(_buffer, tcClientConnectResponseSize);
					break;
				default :
					LightProtoCodec.skipUnknownField(_tag, _buffer);
			}
		}
		checkRequiredFields();
		_parsedBuffer = _buffer;
	}
	private void checkRequiredFields() {
		if ((_bitField0 & _REQUIRED_FIELDS_MASK0) != _REQUIRED_FIELDS_MASK0
				|| (_bitField1 & _REQUIRED_FIELDS_MASK1) != _REQUIRED_FIELDS_MASK1) {
			throw new IllegalStateException("Some required fields are missing");
		}
	}
	public BaseCommand clear() {
		if (hasConnect()) {
			connect.clear();
		}
		if (hasConnected()) {
			connected.clear();
		}
		if (hasSubscribe()) {
			subscribe.clear();
		}
		if (hasProducer()) {
			producer.clear();
		}
		if (hasSend()) {
			send.clear();
		}
		if (hasSendReceipt()) {
			sendReceipt.clear();
		}
		if (hasSendError()) {
			sendError.clear();
		}
		if (hasMessage()) {
			message.clear();
		}
		if (hasAck()) {
			ack.clear();
		}
		if (hasFlow()) {
			flow.clear();
		}
		if (hasUnsubscribe()) {
			unsubscribe.clear();
		}
		if (hasSuccess()) {
			success.clear();
		}
		if (hasError()) {
			error.clear();
		}
		if (hasCloseProducer()) {
			closeProducer.clear();
		}
		if (hasCloseConsumer()) {
			closeConsumer.clear();
		}
		if (hasProducerSuccess()) {
			producerSuccess.clear();
		}
		if (hasPing()) {
			ping.clear();
		}
		if (hasPong()) {
			pong.clear();
		}
		if (hasRedeliverUnacknowledgedMessages()) {
			redeliverUnacknowledgedMessages.clear();
		}
		if (hasPartitionMetadata()) {
			partitionMetadata.clear();
		}
		if (hasPartitionMetadataResponse()) {
			partitionMetadataResponse.clear();
		}
		if (hasLookupTopic()) {
			lookupTopic.clear();
		}
		if (hasLookupTopicResponse()) {
			lookupTopicResponse.clear();
		}
		if (hasConsumerStats()) {
			consumerStats.clear();
		}
		if (hasConsumerStatsResponse()) {
			consumerStatsResponse.clear();
		}
		if (hasReachedEndOfTopic()) {
			reachedEndOfTopic.clear();
		}
		if (hasSeek()) {
			seek.clear();
		}
		if (hasGetLastMessageId()) {
			getLastMessageId.clear();
		}
		if (hasGetLastMessageIdResponse()) {
			getLastMessageIdResponse.clear();
		}
		if (hasActiveConsumerChange()) {
			activeConsumerChange.clear();
		}
		if (hasGetTopicsOfNamespace()) {
			getTopicsOfNamespace.clear();
		}
		if (hasGetTopicsOfNamespaceResponse()) {
			getTopicsOfNamespaceResponse.clear();
		}
		if (hasGetSchema()) {
			getSchema.clear();
		}
		if (hasGetSchemaResponse()) {
			getSchemaResponse.clear();
		}
		if (hasAuthChallenge()) {
			authChallenge.clear();
		}
		if (hasAuthResponse()) {
			authResponse.clear();
		}
		if (hasAckResponse()) {
			ackResponse.clear();
		}
		if (hasGetOrCreateSchema()) {
			getOrCreateSchema.clear();
		}
		if (hasGetOrCreateSchemaResponse()) {
			getOrCreateSchemaResponse.clear();
		}
		if (hasNewTxn()) {
			newTxn.clear();
		}
		if (hasNewTxnResponse()) {
			newTxnResponse.clear();
		}
		if (hasAddPartitionToTxn()) {
			addPartitionToTxn.clear();
		}
		if (hasAddPartitionToTxnResponse()) {
			addPartitionToTxnResponse.clear();
		}
		if (hasAddSubscriptionToTxn()) {
			addSubscriptionToTxn.clear();
		}
		if (hasAddSubscriptionToTxnResponse()) {
			addSubscriptionToTxnResponse.clear();
		}
		if (hasEndTxn()) {
			endTxn.clear();
		}
		if (hasEndTxnResponse()) {
			endTxnResponse.clear();
		}
		if (hasEndTxnOnPartition()) {
			endTxnOnPartition.clear();
		}
		if (hasEndTxnOnPartitionResponse()) {
			endTxnOnPartitionResponse.clear();
		}
		if (hasEndTxnOnSubscription()) {
			endTxnOnSubscription.clear();
		}
		if (hasEndTxnOnSubscriptionResponse()) {
			endTxnOnSubscriptionResponse.clear();
		}
		if (hasTcClientConnectRequest()) {
			tcClientConnectRequest.clear();
		}
		if (hasTcClientConnectResponse()) {
			tcClientConnectResponse.clear();
		}
		_parsedBuffer = null;
		_cachedSize = -1;
		_bitField0 = 0;
		_bitField1 = 0;
		return this;
	}
	public BaseCommand copyFrom(BaseCommand _other) {
		_cachedSize = -1;
		if (_other.hasType()) {
			setType(_other.type);
		}
		if (_other.hasConnect()) {
			setConnect().copyFrom(_other.connect);
		}
		if (_other.hasConnected()) {
			setConnected().copyFrom(_other.connected);
		}
		if (_other.hasSubscribe()) {
			setSubscribe().copyFrom(_other.subscribe);
		}
		if (_other.hasProducer()) {
			setProducer().copyFrom(_other.producer);
		}
		if (_other.hasSend()) {
			setSend().copyFrom(_other.send);
		}
		if (_other.hasSendReceipt()) {
			setSendReceipt().copyFrom(_other.sendReceipt);
		}
		if (_other.hasSendError()) {
			setSendError().copyFrom(_other.sendError);
		}
		if (_other.hasMessage()) {
			setMessage().copyFrom(_other.message);
		}
		if (_other.hasAck()) {
			setAck().copyFrom(_other.ack);
		}
		if (_other.hasFlow()) {
			setFlow().copyFrom(_other.flow);
		}
		if (_other.hasUnsubscribe()) {
			setUnsubscribe().copyFrom(_other.unsubscribe);
		}
		if (_other.hasSuccess()) {
			setSuccess().copyFrom(_other.success);
		}
		if (_other.hasError()) {
			setError().copyFrom(_other.error);
		}
		if (_other.hasCloseProducer()) {
			setCloseProducer().copyFrom(_other.closeProducer);
		}
		if (_other.hasCloseConsumer()) {
			setCloseConsumer().copyFrom(_other.closeConsumer);
		}
		if (_other.hasProducerSuccess()) {
			setProducerSuccess().copyFrom(_other.producerSuccess);
		}
		if (_other.hasPing()) {
			setPing().copyFrom(_other.ping);
		}
		if (_other.hasPong()) {
			setPong().copyFrom(_other.pong);
		}
		if (_other.hasRedeliverUnacknowledgedMessages()) {
			setRedeliverUnacknowledgedMessages().copyFrom(_other.redeliverUnacknowledgedMessages);
		}
		if (_other.hasPartitionMetadata()) {
			setPartitionMetadata().copyFrom(_other.partitionMetadata);
		}
		if (_other.hasPartitionMetadataResponse()) {
			setPartitionMetadataResponse().copyFrom(_other.partitionMetadataResponse);
		}
		if (_other.hasLookupTopic()) {
			setLookupTopic().copyFrom(_other.lookupTopic);
		}
		if (_other.hasLookupTopicResponse()) {
			setLookupTopicResponse().copyFrom(_other.lookupTopicResponse);
		}
		if (_other.hasConsumerStats()) {
			setConsumerStats().copyFrom(_other.consumerStats);
		}
		if (_other.hasConsumerStatsResponse()) {
			setConsumerStatsResponse().copyFrom(_other.consumerStatsResponse);
		}
		if (_other.hasReachedEndOfTopic()) {
			setReachedEndOfTopic().copyFrom(_other.reachedEndOfTopic);
		}
		if (_other.hasSeek()) {
			setSeek().copyFrom(_other.seek);
		}
		if (_other.hasGetLastMessageId()) {
			setGetLastMessageId().copyFrom(_other.getLastMessageId);
		}
		if (_other.hasGetLastMessageIdResponse()) {
			setGetLastMessageIdResponse().copyFrom(_other.getLastMessageIdResponse);
		}
		if (_other.hasActiveConsumerChange()) {
			setActiveConsumerChange().copyFrom(_other.activeConsumerChange);
		}
		if (_other.hasGetTopicsOfNamespace()) {
			setGetTopicsOfNamespace().copyFrom(_other.getTopicsOfNamespace);
		}
		if (_other.hasGetTopicsOfNamespaceResponse()) {
			setGetTopicsOfNamespaceResponse().copyFrom(_other.getTopicsOfNamespaceResponse);
		}
		if (_other.hasGetSchema()) {
			setGetSchema().copyFrom(_other.getSchema);
		}
		if (_other.hasGetSchemaResponse()) {
			setGetSchemaResponse().copyFrom(_other.getSchemaResponse);
		}
		if (_other.hasAuthChallenge()) {
			setAuthChallenge().copyFrom(_other.authChallenge);
		}
		if (_other.hasAuthResponse()) {
			setAuthResponse().copyFrom(_other.authResponse);
		}
		if (_other.hasAckResponse()) {
			setAckResponse().copyFrom(_other.ackResponse);
		}
		if (_other.hasGetOrCreateSchema()) {
			setGetOrCreateSchema().copyFrom(_other.getOrCreateSchema);
		}
		if (_other.hasGetOrCreateSchemaResponse()) {
			setGetOrCreateSchemaResponse().copyFrom(_other.getOrCreateSchemaResponse);
		}
		if (_other.hasNewTxn()) {
			setNewTxn().copyFrom(_other.newTxn);
		}
		if (_other.hasNewTxnResponse()) {
			setNewTxnResponse().copyFrom(_other.newTxnResponse);
		}
		if (_other.hasAddPartitionToTxn()) {
			setAddPartitionToTxn().copyFrom(_other.addPartitionToTxn);
		}
		if (_other.hasAddPartitionToTxnResponse()) {
			setAddPartitionToTxnResponse().copyFrom(_other.addPartitionToTxnResponse);
		}
		if (_other.hasAddSubscriptionToTxn()) {
			setAddSubscriptionToTxn().copyFrom(_other.addSubscriptionToTxn);
		}
		if (_other.hasAddSubscriptionToTxnResponse()) {
			setAddSubscriptionToTxnResponse().copyFrom(_other.addSubscriptionToTxnResponse);
		}
		if (_other.hasEndTxn()) {
			setEndTxn().copyFrom(_other.endTxn);
		}
		if (_other.hasEndTxnResponse()) {
			setEndTxnResponse().copyFrom(_other.endTxnResponse);
		}
		if (_other.hasEndTxnOnPartition()) {
			setEndTxnOnPartition().copyFrom(_other.endTxnOnPartition);
		}
		if (_other.hasEndTxnOnPartitionResponse()) {
			setEndTxnOnPartitionResponse().copyFrom(_other.endTxnOnPartitionResponse);
		}
		if (_other.hasEndTxnOnSubscription()) {
			setEndTxnOnSubscription().copyFrom(_other.endTxnOnSubscription);
		}
		if (_other.hasEndTxnOnSubscriptionResponse()) {
			setEndTxnOnSubscriptionResponse().copyFrom(_other.endTxnOnSubscriptionResponse);
		}
		if (_other.hasTcClientConnectRequest()) {
			setTcClientConnectRequest().copyFrom(_other.tcClientConnectRequest);
		}
		if (_other.hasTcClientConnectResponse()) {
			setTcClientConnectResponse().copyFrom(_other.tcClientConnectResponse);
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
