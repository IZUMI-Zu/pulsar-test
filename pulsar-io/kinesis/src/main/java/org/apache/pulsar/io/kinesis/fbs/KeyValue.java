// automatically generated by the FlatBuffers compiler, do not modify

package org.apache.pulsar.io.kinesis.fbs;

import java.nio.*;
import java.lang.*;

import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class KeyValue extends Table {
  public static KeyValue getRootAsKeyValue(ByteBuffer _bb) { return getRootAsKeyValue(_bb, new KeyValue()); }
  public static KeyValue getRootAsKeyValue(ByteBuffer _bb, KeyValue obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public KeyValue __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String key() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer keyAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer keyInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }
  public String value() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer valueAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer valueInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }

  public static int createKeyValue(FlatBufferBuilder builder,
      int keyOffset,
      int valueOffset) {
    builder.startObject(2);
    KeyValue.addValue(builder, valueOffset);
    KeyValue.addKey(builder, keyOffset);
    return KeyValue.endKeyValue(builder);
  }

  public static void startKeyValue(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addKey(FlatBufferBuilder builder, int keyOffset) { builder.addOffset(0, keyOffset, 0); }
  public static void addValue(FlatBufferBuilder builder, int valueOffset) { builder.addOffset(1, valueOffset, 0); }
  public static int endKeyValue(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

