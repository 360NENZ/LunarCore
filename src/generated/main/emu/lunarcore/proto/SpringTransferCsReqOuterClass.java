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

public final class SpringTransferCsReqOuterClass {
  /**
   * Protobuf type {@code SpringTransferCsReq}
   */
  public static final class SpringTransferCsReq extends ProtoMessage<SpringTransferCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 floor_id = 4;</code>
     */
    private int floorId;

    /**
     * <code>optional uint32 prop_entity_id = 8;</code>
     */
    private int propEntityId;

    /**
     * <code>optional uint32 plane_id = 13;</code>
     */
    private int planeId;

    private SpringTransferCsReq() {
    }

    /**
     * @return a new empty instance of {@code SpringTransferCsReq}
     */
    public static SpringTransferCsReq newInstance() {
      return new SpringTransferCsReq();
    }

    /**
     * <code>optional uint32 floor_id = 4;</code>
     * @return whether the floorId field is set
     */
    public boolean hasFloorId() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 floor_id = 4;</code>
     * @return this
     */
    public SpringTransferCsReq clearFloorId() {
      bitField0_ &= ~0x00000001;
      floorId = 0;
      return this;
    }

    /**
     * <code>optional uint32 floor_id = 4;</code>
     * @return the floorId
     */
    public int getFloorId() {
      return floorId;
    }

    /**
     * <code>optional uint32 floor_id = 4;</code>
     * @param value the floorId to set
     * @return this
     */
    public SpringTransferCsReq setFloorId(final int value) {
      bitField0_ |= 0x00000001;
      floorId = value;
      return this;
    }

    /**
     * <code>optional uint32 prop_entity_id = 8;</code>
     * @return whether the propEntityId field is set
     */
    public boolean hasPropEntityId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 prop_entity_id = 8;</code>
     * @return this
     */
    public SpringTransferCsReq clearPropEntityId() {
      bitField0_ &= ~0x00000002;
      propEntityId = 0;
      return this;
    }

    /**
     * <code>optional uint32 prop_entity_id = 8;</code>
     * @return the propEntityId
     */
    public int getPropEntityId() {
      return propEntityId;
    }

    /**
     * <code>optional uint32 prop_entity_id = 8;</code>
     * @param value the propEntityId to set
     * @return this
     */
    public SpringTransferCsReq setPropEntityId(final int value) {
      bitField0_ |= 0x00000002;
      propEntityId = value;
      return this;
    }

    /**
     * <code>optional uint32 plane_id = 13;</code>
     * @return whether the planeId field is set
     */
    public boolean hasPlaneId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 plane_id = 13;</code>
     * @return this
     */
    public SpringTransferCsReq clearPlaneId() {
      bitField0_ &= ~0x00000004;
      planeId = 0;
      return this;
    }

    /**
     * <code>optional uint32 plane_id = 13;</code>
     * @return the planeId
     */
    public int getPlaneId() {
      return planeId;
    }

    /**
     * <code>optional uint32 plane_id = 13;</code>
     * @param value the planeId to set
     * @return this
     */
    public SpringTransferCsReq setPlaneId(final int value) {
      bitField0_ |= 0x00000004;
      planeId = value;
      return this;
    }

    @Override
    public SpringTransferCsReq copyFrom(final SpringTransferCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        floorId = other.floorId;
        propEntityId = other.propEntityId;
        planeId = other.planeId;
      }
      return this;
    }

    @Override
    public SpringTransferCsReq mergeFrom(final SpringTransferCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasFloorId()) {
        setFloorId(other.floorId);
      }
      if (other.hasPropEntityId()) {
        setPropEntityId(other.propEntityId);
      }
      if (other.hasPlaneId()) {
        setPlaneId(other.planeId);
      }
      return this;
    }

    @Override
    public SpringTransferCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      floorId = 0;
      propEntityId = 0;
      planeId = 0;
      return this;
    }

    @Override
    public SpringTransferCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SpringTransferCsReq)) {
        return false;
      }
      SpringTransferCsReq other = (SpringTransferCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasFloorId() || floorId == other.floorId)
        && (!hasPropEntityId() || propEntityId == other.propEntityId)
        && (!hasPlaneId() || planeId == other.planeId);
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 32);
        output.writeUInt32NoTag(floorId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(propEntityId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 104);
        output.writeUInt32NoTag(planeId);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(floorId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(propEntityId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(planeId);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SpringTransferCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 32: {
            // floorId
            floorId = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 64) {
              break;
            }
          }
          case 64: {
            // propEntityId
            propEntityId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 104) {
              break;
            }
          }
          case 104: {
            // planeId
            planeId = input.readUInt32();
            bitField0_ |= 0x00000004;
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
        output.writeUInt32(FieldNames.floorId, floorId);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.propEntityId, propEntityId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.planeId, planeId);
      }
      output.endObject();
    }

    @Override
    public SpringTransferCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -766027193:
          case 2022982190: {
            if (input.isAtField(FieldNames.floorId)) {
              if (!input.trySkipNullValue()) {
                floorId = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -68717343:
          case -57484005: {
            if (input.isAtField(FieldNames.propEntityId)) {
              if (!input.trySkipNullValue()) {
                propEntityId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -493896553:
          case 1869097438: {
            if (input.isAtField(FieldNames.planeId)) {
              if (!input.trySkipNullValue()) {
                planeId = input.readUInt32();
                bitField0_ |= 0x00000004;
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
    public SpringTransferCsReq clone() {
      return new SpringTransferCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SpringTransferCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SpringTransferCsReq(), data).checkInitialized();
    }

    public static SpringTransferCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SpringTransferCsReq(), input).checkInitialized();
    }

    public static SpringTransferCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SpringTransferCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating SpringTransferCsReq messages
     */
    public static MessageFactory<SpringTransferCsReq> getFactory() {
      return SpringTransferCsReqFactory.INSTANCE;
    }

    private enum SpringTransferCsReqFactory implements MessageFactory<SpringTransferCsReq> {
      INSTANCE;

      @Override
      public SpringTransferCsReq create() {
        return SpringTransferCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName floorId = FieldName.forField("floorId", "floor_id");

      static final FieldName propEntityId = FieldName.forField("propEntityId", "prop_entity_id");

      static final FieldName planeId = FieldName.forField("planeId", "plane_id");
    }
  }
}