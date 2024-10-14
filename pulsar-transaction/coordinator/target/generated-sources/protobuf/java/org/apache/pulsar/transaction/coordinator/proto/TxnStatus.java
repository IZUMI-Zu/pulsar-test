package org.apache.pulsar.transaction.coordinator.proto;
public enum TxnStatus {
	OPEN(0), COMMITTING(1), COMMITTED(2), ABORTING(3), ABORTED(4),;
	private final int value;
	private TxnStatus(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public static TxnStatus valueOf(int n) {
		switch (n) {
			case 0 :
				return OPEN;
			case 1 :
				return COMMITTING;
			case 2 :
				return COMMITTED;
			case 3 :
				return ABORTING;
			case 4 :
				return ABORTED;
			default :
				return null;

		}
	}
	public static final int OPEN_VALUE = 0;
	public static final int COMMITTING_VALUE = 1;
	public static final int COMMITTED_VALUE = 2;
	public static final int ABORTING_VALUE = 3;
	public static final int ABORTED_VALUE = 4;
}
