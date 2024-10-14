package org.apache.pulsar.common.api.proto;
public enum CompressionType {
	NONE(0), LZ4(1), ZLIB(2), ZSTD(3), SNAPPY(4),;
	private final int value;
	private CompressionType(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public static CompressionType valueOf(int n) {
		switch (n) {
			case 0 :
				return NONE;
			case 1 :
				return LZ4;
			case 2 :
				return ZLIB;
			case 3 :
				return ZSTD;
			case 4 :
				return SNAPPY;
			default :
				return null;

		}
	}
	public static final int NONE_VALUE = 0;
	public static final int LZ4_VALUE = 1;
	public static final int ZLIB_VALUE = 2;
	public static final int ZSTD_VALUE = 3;
	public static final int SNAPPY_VALUE = 4;
}
