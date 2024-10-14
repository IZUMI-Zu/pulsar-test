package org.apache.pulsar.common.api.proto;
public enum KeySharedMode {
	AUTO_SPLIT(0), STICKY(1),;
	private final int value;
	private KeySharedMode(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public static KeySharedMode valueOf(int n) {
		switch (n) {
			case 0 :
				return AUTO_SPLIT;
			case 1 :
				return STICKY;
			default :
				return null;

		}
	}
	public static final int AUTO_SPLIT_VALUE = 0;
	public static final int STICKY_VALUE = 1;
}
