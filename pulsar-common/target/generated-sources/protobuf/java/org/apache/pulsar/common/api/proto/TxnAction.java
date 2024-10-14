package org.apache.pulsar.common.api.proto;
public enum TxnAction {
	COMMIT(0), ABORT(1),;
	private final int value;
	private TxnAction(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public static TxnAction valueOf(int n) {
		switch (n) {
			case 0 :
				return COMMIT;
			case 1 :
				return ABORT;
			default :
				return null;

		}
	}
	public static final int COMMIT_VALUE = 0;
	public static final int ABORT_VALUE = 1;
}
