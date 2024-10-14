package org.apache.pulsar.common.api.proto;
public enum MarkerType {
	UNKNOWN_MARKER(0), REPLICATED_SUBSCRIPTION_SNAPSHOT_REQUEST(10), REPLICATED_SUBSCRIPTION_SNAPSHOT_RESPONSE(
			11), REPLICATED_SUBSCRIPTION_SNAPSHOT(
					12), REPLICATED_SUBSCRIPTION_UPDATE(13), TXN_COMMITTING(20), TXN_COMMIT(21), TXN_ABORT(22),;
	private final int value;
	private MarkerType(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public static MarkerType valueOf(int n) {
		switch (n) {
			case 0 :
				return UNKNOWN_MARKER;
			case 10 :
				return REPLICATED_SUBSCRIPTION_SNAPSHOT_REQUEST;
			case 11 :
				return REPLICATED_SUBSCRIPTION_SNAPSHOT_RESPONSE;
			case 12 :
				return REPLICATED_SUBSCRIPTION_SNAPSHOT;
			case 13 :
				return REPLICATED_SUBSCRIPTION_UPDATE;
			case 20 :
				return TXN_COMMITTING;
			case 21 :
				return TXN_COMMIT;
			case 22 :
				return TXN_ABORT;
			default :
				return null;

		}
	}
	public static final int UNKNOWN_MARKER_VALUE = 0;
	public static final int REPLICATED_SUBSCRIPTION_SNAPSHOT_REQUEST_VALUE = 10;
	public static final int REPLICATED_SUBSCRIPTION_SNAPSHOT_RESPONSE_VALUE = 11;
	public static final int REPLICATED_SUBSCRIPTION_SNAPSHOT_VALUE = 12;
	public static final int REPLICATED_SUBSCRIPTION_UPDATE_VALUE = 13;
	public static final int TXN_COMMITTING_VALUE = 20;
	public static final int TXN_COMMIT_VALUE = 21;
	public static final int TXN_ABORT_VALUE = 22;
}
