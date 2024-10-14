package org.apache.pulsar.common.api.proto;
public enum AuthMethod {
	AuthMethodNone(0), AuthMethodYcaV1(1), AuthMethodAthens(2),;
	private final int value;
	private AuthMethod(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public static AuthMethod valueOf(int n) {
		switch (n) {
			case 0 :
				return AuthMethodNone;
			case 1 :
				return AuthMethodYcaV1;
			case 2 :
				return AuthMethodAthens;
			default :
				return null;

		}
	}
	public static final int AuthMethodNone_VALUE = 0;
	public static final int AuthMethodYcaV1_VALUE = 1;
	public static final int AuthMethodAthens_VALUE = 2;
}
