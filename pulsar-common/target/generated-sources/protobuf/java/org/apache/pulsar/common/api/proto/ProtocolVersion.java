package org.apache.pulsar.common.api.proto;
public enum ProtocolVersion {
	v0(0), v1(1), v2(2), v3(3), v4(4), v5(5), v6(6), v7(7), v8(8), v9(9), v10(10), v11(11), v12(12), v13(13), v14(
			14), v15(15), v16(16), v17(17), v18(18), v19(19),;
	private final int value;
	private ProtocolVersion(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public static ProtocolVersion valueOf(int n) {
		switch (n) {
			case 0 :
				return v0;
			case 1 :
				return v1;
			case 2 :
				return v2;
			case 3 :
				return v3;
			case 4 :
				return v4;
			case 5 :
				return v5;
			case 6 :
				return v6;
			case 7 :
				return v7;
			case 8 :
				return v8;
			case 9 :
				return v9;
			case 10 :
				return v10;
			case 11 :
				return v11;
			case 12 :
				return v12;
			case 13 :
				return v13;
			case 14 :
				return v14;
			case 15 :
				return v15;
			case 16 :
				return v16;
			case 17 :
				return v17;
			case 18 :
				return v18;
			case 19 :
				return v19;
			default :
				return null;

		}
	}
	public static final int v0_VALUE = 0;
	public static final int v1_VALUE = 1;
	public static final int v2_VALUE = 2;
	public static final int v3_VALUE = 3;
	public static final int v4_VALUE = 4;
	public static final int v5_VALUE = 5;
	public static final int v6_VALUE = 6;
	public static final int v7_VALUE = 7;
	public static final int v8_VALUE = 8;
	public static final int v9_VALUE = 9;
	public static final int v10_VALUE = 10;
	public static final int v11_VALUE = 11;
	public static final int v12_VALUE = 12;
	public static final int v13_VALUE = 13;
	public static final int v14_VALUE = 14;
	public static final int v15_VALUE = 15;
	public static final int v16_VALUE = 16;
	public static final int v17_VALUE = 17;
	public static final int v18_VALUE = 18;
	public static final int v19_VALUE = 19;
}
