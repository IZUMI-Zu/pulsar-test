package org.apache.pulsar.common.api.proto;
public enum ProducerAccessMode {
	Shared(0), Exclusive(1), WaitForExclusive(2),;
	private final int value;
	private ProducerAccessMode(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public static ProducerAccessMode valueOf(int n) {
		switch (n) {
			case 0 :
				return Shared;
			case 1 :
				return Exclusive;
			case 2 :
				return WaitForExclusive;
			default :
				return null;

		}
	}
	public static final int Shared_VALUE = 0;
	public static final int Exclusive_VALUE = 1;
	public static final int WaitForExclusive_VALUE = 2;
}
