// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.ProtoUtil;
import us.hebi.quickbuf.RepeatedMessage;
import us.hebi.quickbuf.Utf8String;

public final class BuffInfoOuterClass {
  /**
   * Protobuf type {@code BuffInfo}
   */
  public static final class BuffInfo extends ProtoMessage<BuffInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint64 FEDNBDBBHHN = 1;</code>
     */
    private long fEDNBDBBHHN;

    /**
     * <code>optional float BNEOPNNPFLE = 6;</code>
     */
    private float bNEOPNNPFLE;

    /**
     * <code>optional uint32 level = 2;</code>
     */
    private int level;

    /**
     * <code>optional uint32 IPFABMCJDMN = 4;</code>
     */
    private int iPFABMCJDMN;

    /**
     * <code>optional uint32 count = 12;</code>
     */
    private int count;

    /**
     * <code>optional uint32 base_avatar_id = 14;</code>
     */
    private int baseAvatarId;

    /**
     * <code>repeated .BuffInfo.DynamicValuesEntry dynamic_values = 3;</code>
     */
    private final RepeatedMessage<DynamicValuesEntry> dynamicValues = RepeatedMessage.newEmptyInstance(DynamicValuesEntry.getFactory());

    private BuffInfo() {
    }

    /**
     * @return a new empty instance of {@code BuffInfo}
     */
    public static BuffInfo newInstance() {
      return new BuffInfo();
    }

    /**
     * <code>optional uint64 FEDNBDBBHHN = 1;</code>
     * @return whether the fEDNBDBBHHN field is set
     */
    public boolean hasFEDNBDBBHHN() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint64 FEDNBDBBHHN = 1;</code>
     * @return this
     */
    public BuffInfo clearFEDNBDBBHHN() {
      bitField0_ &= ~0x00000001;
      fEDNBDBBHHN = 0L;
      return this;
    }

    /**
     * <code>optional uint64 FEDNBDBBHHN = 1;</code>
     * @return the fEDNBDBBHHN
     */
    public long getFEDNBDBBHHN() {
      return fEDNBDBBHHN;
    }

    /**
     * <code>optional uint64 FEDNBDBBHHN = 1;</code>
     * @param value the fEDNBDBBHHN to set
     * @return this
     */
    public BuffInfo setFEDNBDBBHHN(final long value) {
      bitField0_ |= 0x00000001;
      fEDNBDBBHHN = value;
      return this;
    }

    /**
     * <code>optional float BNEOPNNPFLE = 6;</code>
     * @return whether the bNEOPNNPFLE field is set
     */
    public boolean hasBNEOPNNPFLE() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional float BNEOPNNPFLE = 6;</code>
     * @return this
     */
    public BuffInfo clearBNEOPNNPFLE() {
      bitField0_ &= ~0x00000002;
      bNEOPNNPFLE = 0F;
      return this;
    }

    /**
     * <code>optional float BNEOPNNPFLE = 6;</code>
     * @return the bNEOPNNPFLE
     */
    public float getBNEOPNNPFLE() {
      return bNEOPNNPFLE;
    }

    /**
     * <code>optional float BNEOPNNPFLE = 6;</code>
     * @param value the bNEOPNNPFLE to set
     * @return this
     */
    public BuffInfo setBNEOPNNPFLE(final float value) {
      bitField0_ |= 0x00000002;
      bNEOPNNPFLE = value;
      return this;
    }

    /**
     * <code>optional uint32 level = 2;</code>
     * @return whether the level field is set
     */
    public boolean hasLevel() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 level = 2;</code>
     * @return this
     */
    public BuffInfo clearLevel() {
      bitField0_ &= ~0x00000004;
      level = 0;
      return this;
    }

    /**
     * <code>optional uint32 level = 2;</code>
     * @return the level
     */
    public int getLevel() {
      return level;
    }

    /**
     * <code>optional uint32 level = 2;</code>
     * @param value the level to set
     * @return this
     */
    public BuffInfo setLevel(final int value) {
      bitField0_ |= 0x00000004;
      level = value;
      return this;
    }

    /**
     * <code>optional uint32 IPFABMCJDMN = 4;</code>
     * @return whether the iPFABMCJDMN field is set
     */
    public boolean hasIPFABMCJDMN() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>optional uint32 IPFABMCJDMN = 4;</code>
     * @return this
     */
    public BuffInfo clearIPFABMCJDMN() {
      bitField0_ &= ~0x00000008;
      iPFABMCJDMN = 0;
      return this;
    }

    /**
     * <code>optional uint32 IPFABMCJDMN = 4;</code>
     * @return the iPFABMCJDMN
     */
    public int getIPFABMCJDMN() {
      return iPFABMCJDMN;
    }

    /**
     * <code>optional uint32 IPFABMCJDMN = 4;</code>
     * @param value the iPFABMCJDMN to set
     * @return this
     */
    public BuffInfo setIPFABMCJDMN(final int value) {
      bitField0_ |= 0x00000008;
      iPFABMCJDMN = value;
      return this;
    }

    /**
     * <code>optional uint32 count = 12;</code>
     * @return whether the count field is set
     */
    public boolean hasCount() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>optional uint32 count = 12;</code>
     * @return this
     */
    public BuffInfo clearCount() {
      bitField0_ &= ~0x00000010;
      count = 0;
      return this;
    }

    /**
     * <code>optional uint32 count = 12;</code>
     * @return the count
     */
    public int getCount() {
      return count;
    }

    /**
     * <code>optional uint32 count = 12;</code>
     * @param value the count to set
     * @return this
     */
    public BuffInfo setCount(final int value) {
      bitField0_ |= 0x00000010;
      count = value;
      return this;
    }

    /**
     * <code>optional uint32 base_avatar_id = 14;</code>
     * @return whether the baseAvatarId field is set
     */
    public boolean hasBaseAvatarId() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>optional uint32 base_avatar_id = 14;</code>
     * @return this
     */
    public BuffInfo clearBaseAvatarId() {
      bitField0_ &= ~0x00000020;
      baseAvatarId = 0;
      return this;
    }

    /**
     * <code>optional uint32 base_avatar_id = 14;</code>
     * @return the baseAvatarId
     */
    public int getBaseAvatarId() {
      return baseAvatarId;
    }

    /**
     * <code>optional uint32 base_avatar_id = 14;</code>
     * @param value the baseAvatarId to set
     * @return this
     */
    public BuffInfo setBaseAvatarId(final int value) {
      bitField0_ |= 0x00000020;
      baseAvatarId = value;
      return this;
    }

    /**
     * <code>repeated .BuffInfo.DynamicValuesEntry dynamic_values = 3;</code>
     * @return whether the dynamicValues field is set
     */
    public boolean hasDynamicValues() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <code>repeated .BuffInfo.DynamicValuesEntry dynamic_values = 3;</code>
     * @return this
     */
    public BuffInfo clearDynamicValues() {
      bitField0_ &= ~0x00000040;
      dynamicValues.clear();
      return this;
    }

    /**
     * <code>repeated .BuffInfo.DynamicValuesEntry dynamic_values = 3;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableDynamicValues()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<DynamicValuesEntry> getDynamicValues() {
      return dynamicValues;
    }

    /**
     * <code>repeated .BuffInfo.DynamicValuesEntry dynamic_values = 3;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<DynamicValuesEntry> getMutableDynamicValues() {
      bitField0_ |= 0x00000040;
      return dynamicValues;
    }

    /**
     * <code>repeated .BuffInfo.DynamicValuesEntry dynamic_values = 3;</code>
     * @param value the dynamicValues to add
     * @return this
     */
    public BuffInfo addDynamicValues(final DynamicValuesEntry value) {
      bitField0_ |= 0x00000040;
      dynamicValues.add(value);
      return this;
    }

    /**
     * <code>repeated .BuffInfo.DynamicValuesEntry dynamic_values = 3;</code>
     * @param values the dynamicValues to add
     * @return this
     */
    public BuffInfo addAllDynamicValues(final DynamicValuesEntry... values) {
      bitField0_ |= 0x00000040;
      dynamicValues.addAll(values);
      return this;
    }

    @Override
    public BuffInfo copyFrom(final BuffInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        fEDNBDBBHHN = other.fEDNBDBBHHN;
        bNEOPNNPFLE = other.bNEOPNNPFLE;
        level = other.level;
        iPFABMCJDMN = other.iPFABMCJDMN;
        count = other.count;
        baseAvatarId = other.baseAvatarId;
        dynamicValues.copyFrom(other.dynamicValues);
      }
      return this;
    }

    @Override
    public BuffInfo mergeFrom(final BuffInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasFEDNBDBBHHN()) {
        setFEDNBDBBHHN(other.fEDNBDBBHHN);
      }
      if (other.hasBNEOPNNPFLE()) {
        setBNEOPNNPFLE(other.bNEOPNNPFLE);
      }
      if (other.hasLevel()) {
        setLevel(other.level);
      }
      if (other.hasIPFABMCJDMN()) {
        setIPFABMCJDMN(other.iPFABMCJDMN);
      }
      if (other.hasCount()) {
        setCount(other.count);
      }
      if (other.hasBaseAvatarId()) {
        setBaseAvatarId(other.baseAvatarId);
      }
      if (other.hasDynamicValues()) {
        getMutableDynamicValues().addAll(other.dynamicValues);
      }
      return this;
    }

    @Override
    public BuffInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      fEDNBDBBHHN = 0L;
      bNEOPNNPFLE = 0F;
      level = 0;
      iPFABMCJDMN = 0;
      count = 0;
      baseAvatarId = 0;
      dynamicValues.clear();
      return this;
    }

    @Override
    public BuffInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      dynamicValues.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof BuffInfo)) {
        return false;
      }
      BuffInfo other = (BuffInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasFEDNBDBBHHN() || fEDNBDBBHHN == other.fEDNBDBBHHN)
        && (!hasBNEOPNNPFLE() || ProtoUtil.isEqual(bNEOPNNPFLE, other.bNEOPNNPFLE))
        && (!hasLevel() || level == other.level)
        && (!hasIPFABMCJDMN() || iPFABMCJDMN == other.iPFABMCJDMN)
        && (!hasCount() || count == other.count)
        && (!hasBaseAvatarId() || baseAvatarId == other.baseAvatarId)
        && (!hasDynamicValues() || dynamicValues.equals(other.dynamicValues));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt64NoTag(fEDNBDBBHHN);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 53);
        output.writeFloatNoTag(bNEOPNNPFLE);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 16);
        output.writeUInt32NoTag(level);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(iPFABMCJDMN);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRawByte((byte) 96);
        output.writeUInt32NoTag(count);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRawByte((byte) 112);
        output.writeUInt32NoTag(baseAvatarId);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        for (int i = 0; i < dynamicValues.length(); i++) {
          output.writeRawByte((byte) 26);
          output.writeMessageNoTag(dynamicValues.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt64SizeNoTag(fEDNBDBBHHN);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 5;
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(level);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(iPFABMCJDMN);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(count);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(baseAvatarId);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += (1 * dynamicValues.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(dynamicValues);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public BuffInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // fEDNBDBBHHN
            fEDNBDBBHHN = input.readUInt64();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 53) {
              break;
            }
          }
          case 53: {
            // bNEOPNNPFLE
            bNEOPNNPFLE = input.readFloat();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 16) {
              break;
            }
          }
          case 16: {
            // level
            level = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 32) {
              break;
            }
          }
          case 32: {
            // iPFABMCJDMN
            iPFABMCJDMN = input.readUInt32();
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 96) {
              break;
            }
          }
          case 96: {
            // count
            count = input.readUInt32();
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 112) {
              break;
            }
          }
          case 112: {
            // baseAvatarId
            baseAvatarId = input.readUInt32();
            bitField0_ |= 0x00000020;
            tag = input.readTag();
            if (tag != 26) {
              break;
            }
          }
          case 26: {
            // dynamicValues
            tag = input.readRepeatedMessage(dynamicValues, tag);
            bitField0_ |= 0x00000040;
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt64(FieldNames.fEDNBDBBHHN, fEDNBDBBHHN);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeFloat(FieldNames.bNEOPNNPFLE, bNEOPNNPFLE);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.level, level);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeUInt32(FieldNames.iPFABMCJDMN, iPFABMCJDMN);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeUInt32(FieldNames.count, count);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeUInt32(FieldNames.baseAvatarId, baseAvatarId);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRepeatedMessage(FieldNames.dynamicValues, dynamicValues);
      }
      output.endObject();
    }

    @Override
    public BuffInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1304199581: {
            if (input.isAtField(FieldNames.fEDNBDBBHHN)) {
              if (!input.trySkipNullValue()) {
                fEDNBDBBHHN = input.readUInt64();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -406688439: {
            if (input.isAtField(FieldNames.bNEOPNNPFLE)) {
              if (!input.trySkipNullValue()) {
                bNEOPNNPFLE = input.readFloat();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 102865796: {
            if (input.isAtField(FieldNames.level)) {
              if (!input.trySkipNullValue()) {
                level = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -509586607: {
            if (input.isAtField(FieldNames.iPFABMCJDMN)) {
              if (!input.trySkipNullValue()) {
                iPFABMCJDMN = input.readUInt32();
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 94851343: {
            if (input.isAtField(FieldNames.count)) {
              if (!input.trySkipNullValue()) {
                count = input.readUInt32();
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 118022725:
          case -1756826157: {
            if (input.isAtField(FieldNames.baseAvatarId)) {
              if (!input.trySkipNullValue()) {
                baseAvatarId = input.readUInt32();
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 571506241:
          case 525223202: {
            if (input.isAtField(FieldNames.dynamicValues)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(dynamicValues);
                bitField0_ |= 0x00000040;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public BuffInfo clone() {
      return new BuffInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static BuffInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new BuffInfo(), data).checkInitialized();
    }

    public static BuffInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new BuffInfo(), input).checkInitialized();
    }

    public static BuffInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new BuffInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating BuffInfo messages
     */
    public static MessageFactory<BuffInfo> getFactory() {
      return BuffInfoFactory.INSTANCE;
    }

    /**
     * Protobuf type {@code DynamicValuesEntry}
     */
    public static final class DynamicValuesEntry extends ProtoMessage<DynamicValuesEntry> implements Cloneable {
      private static final long serialVersionUID = 0L;

      /**
       * <code>optional float value = 2;</code>
       */
      private float value_;

      /**
       * <code>optional string key = 1;</code>
       */
      private final Utf8String key = Utf8String.newEmptyInstance();

      private DynamicValuesEntry() {
      }

      /**
       * @return a new empty instance of {@code DynamicValuesEntry}
       */
      public static DynamicValuesEntry newInstance() {
        return new DynamicValuesEntry();
      }

      /**
       * <code>optional float value = 2;</code>
       * @return whether the value_ field is set
       */
      public boolean hasValue() {
        return (bitField0_ & 0x00000001) != 0;
      }

      /**
       * <code>optional float value = 2;</code>
       * @return this
       */
      public DynamicValuesEntry clearValue() {
        bitField0_ &= ~0x00000001;
        value_ = 0F;
        return this;
      }

      /**
       * <code>optional float value = 2;</code>
       * @return the value_
       */
      public float getValue() {
        return value_;
      }

      /**
       * <code>optional float value = 2;</code>
       * @param value the value_ to set
       * @return this
       */
      public DynamicValuesEntry setValue(final float value) {
        bitField0_ |= 0x00000001;
        value_ = value;
        return this;
      }

      /**
       * <code>optional string key = 1;</code>
       * @return whether the key field is set
       */
      public boolean hasKey() {
        return (bitField0_ & 0x00000002) != 0;
      }

      /**
       * <code>optional string key = 1;</code>
       * @return this
       */
      public DynamicValuesEntry clearKey() {
        bitField0_ &= ~0x00000002;
        key.clear();
        return this;
      }

      /**
       * <code>optional string key = 1;</code>
       * @return the key
       */
      public String getKey() {
        return key.getString();
      }

      /**
       * <code>optional string key = 1;</code>
       * @return internal {@code Utf8String} representation of key for reading
       */
      public Utf8String getKeyBytes() {
        return this.key;
      }

      /**
       * <code>optional string key = 1;</code>
       * @return internal {@code Utf8String} representation of key for modifications
       */
      public Utf8String getMutableKeyBytes() {
        bitField0_ |= 0x00000002;
        return this.key;
      }

      /**
       * <code>optional string key = 1;</code>
       * @param value the key to set
       * @return this
       */
      public DynamicValuesEntry setKey(final CharSequence value) {
        bitField0_ |= 0x00000002;
        key.copyFrom(value);
        return this;
      }

      /**
       * <code>optional string key = 1;</code>
       * @param value the key to set
       * @return this
       */
      public DynamicValuesEntry setKey(final Utf8String value) {
        bitField0_ |= 0x00000002;
        key.copyFrom(value);
        return this;
      }

      @Override
      public DynamicValuesEntry copyFrom(final DynamicValuesEntry other) {
        cachedSize = other.cachedSize;
        if ((bitField0_ | other.bitField0_) != 0) {
          bitField0_ = other.bitField0_;
          value_ = other.value_;
          key.copyFrom(other.key);
        }
        return this;
      }

      @Override
      public DynamicValuesEntry mergeFrom(final DynamicValuesEntry other) {
        if (other.isEmpty()) {
          return this;
        }
        cachedSize = -1;
        if (other.hasValue()) {
          setValue(other.value_);
        }
        if (other.hasKey()) {
          getMutableKeyBytes().copyFrom(other.key);
        }
        return this;
      }

      @Override
      public DynamicValuesEntry clear() {
        if (isEmpty()) {
          return this;
        }
        cachedSize = -1;
        bitField0_ = 0;
        value_ = 0F;
        key.clear();
        return this;
      }

      @Override
      public DynamicValuesEntry clearQuick() {
        if (isEmpty()) {
          return this;
        }
        cachedSize = -1;
        bitField0_ = 0;
        key.clear();
        return this;
      }

      @Override
      public boolean equals(Object o) {
        if (o == this) {
          return true;
        }
        if (!(o instanceof DynamicValuesEntry)) {
          return false;
        }
        DynamicValuesEntry other = (DynamicValuesEntry) o;
        return bitField0_ == other.bitField0_
          && (!hasValue() || ProtoUtil.isEqual(value_, other.value_))
          && (!hasKey() || key.equals(other.key));
      }

      @Override
      public void writeTo(final ProtoSink output) throws IOException {
        if ((bitField0_ & 0x00000001) != 0) {
          output.writeRawByte((byte) 21);
          output.writeFloatNoTag(value_);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          output.writeRawByte((byte) 10);
          output.writeStringNoTag(key);
        }
      }

      @Override
      protected int computeSerializedSize() {
        int size = 0;
        if ((bitField0_ & 0x00000001) != 0) {
          size += 5;
        }
        if ((bitField0_ & 0x00000002) != 0) {
          size += 1 + ProtoSink.computeStringSizeNoTag(key);
        }
        return size;
      }

      @Override
      @SuppressWarnings("fallthrough")
      public DynamicValuesEntry mergeFrom(final ProtoSource input) throws IOException {
        // Enabled Fall-Through Optimization (QuickBuffers)
        int tag = input.readTag();
        while (true) {
          switch (tag) {
            case 21: {
              // value_
              value_ = input.readFloat();
              bitField0_ |= 0x00000001;
              tag = input.readTag();
              if (tag != 10) {
                break;
              }
            }
            case 10: {
              // key
              input.readString(key);
              bitField0_ |= 0x00000002;
              tag = input.readTag();
              if (tag != 0) {
                break;
              }
            }
            case 0: {
              return this;
            }
            default: {
              if (!input.skipField(tag)) {
                return this;
              }
              tag = input.readTag();
              break;
            }
          }
        }
      }

      @Override
      public void writeTo(final JsonSink output) throws IOException {
        output.beginObject();
        if ((bitField0_ & 0x00000001) != 0) {
          output.writeFloat(FieldNames.value_, value_);
        }
        if ((bitField0_ & 0x00000002) != 0) {
          output.writeString(FieldNames.key, key);
        }
        output.endObject();
      }

      @Override
      public DynamicValuesEntry mergeFrom(final JsonSource input) throws IOException {
        if (!input.beginObject()) {
          return this;
        }
        while (!input.isAtEnd()) {
          switch (input.readFieldHash()) {
            case 111972721: {
              if (input.isAtField(FieldNames.value_)) {
                if (!input.trySkipNullValue()) {
                  value_ = input.readFloat();
                  bitField0_ |= 0x00000001;
                }
              } else {
                input.skipUnknownField();
              }
              break;
            }
            case 106079: {
              if (input.isAtField(FieldNames.key)) {
                if (!input.trySkipNullValue()) {
                  input.readString(key);
                  bitField0_ |= 0x00000002;
                }
              } else {
                input.skipUnknownField();
              }
              break;
            }
            default: {
              input.skipUnknownField();
              break;
            }
          }
        }
        input.endObject();
        return this;
      }

      @Override
      public DynamicValuesEntry clone() {
        return new DynamicValuesEntry().copyFrom(this);
      }

      @Override
      public boolean isEmpty() {
        return ((bitField0_) == 0);
      }

      public static DynamicValuesEntry parseFrom(final byte[] data) throws
          InvalidProtocolBufferException {
        return ProtoMessage.mergeFrom(new DynamicValuesEntry(), data).checkInitialized();
      }

      public static DynamicValuesEntry parseFrom(final ProtoSource input) throws IOException {
        return ProtoMessage.mergeFrom(new DynamicValuesEntry(), input).checkInitialized();
      }

      public static DynamicValuesEntry parseFrom(final JsonSource input) throws IOException {
        return ProtoMessage.mergeFrom(new DynamicValuesEntry(), input).checkInitialized();
      }

      /**
       * @return factory for creating DynamicValuesEntry messages
       */
      public static MessageFactory<DynamicValuesEntry> getFactory() {
        return DynamicValuesEntryFactory.INSTANCE;
      }

      private enum DynamicValuesEntryFactory implements MessageFactory<DynamicValuesEntry> {
        INSTANCE;

        @Override
        public DynamicValuesEntry create() {
          return DynamicValuesEntry.newInstance();
        }
      }

      /**
       * Contains name constants used for serializing JSON
       */
      static class FieldNames {
        static final FieldName value_ = FieldName.forField("value");

        static final FieldName key = FieldName.forField("key");
      }
    }

    private enum BuffInfoFactory implements MessageFactory<BuffInfo> {
      INSTANCE;

      @Override
      public BuffInfo create() {
        return BuffInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName fEDNBDBBHHN = FieldName.forField("FEDNBDBBHHN");

      static final FieldName bNEOPNNPFLE = FieldName.forField("BNEOPNNPFLE");

      static final FieldName level = FieldName.forField("level");

      static final FieldName iPFABMCJDMN = FieldName.forField("IPFABMCJDMN");

      static final FieldName count = FieldName.forField("count");

      static final FieldName baseAvatarId = FieldName.forField("baseAvatarId", "base_avatar_id");

      static final FieldName dynamicValues = FieldName.forField("dynamicValues", "dynamic_values");
    }
  }
}
