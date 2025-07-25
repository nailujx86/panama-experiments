// Generated by jextract

package net.nailuj.win;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct DISPLAYCONFIG_TARGET_DEVICE_NAME {
 *     DISPLAYCONFIG_DEVICE_INFO_HEADER header;
 *     DISPLAYCONFIG_TARGET_DEVICE_NAME_FLAGS flags;
 *     DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY outputTechnology;
 *     UINT16 edidManufactureId;
 *     UINT16 edidProductCodeId;
 *     UINT32 connectorInstance;
 *     WCHAR monitorFriendlyDeviceName[64];
 *     WCHAR monitorDevicePath[128];
 * }
 * }
 */
public class DISPLAYCONFIG_TARGET_DEVICE_NAME {

    DISPLAYCONFIG_TARGET_DEVICE_NAME() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        DISPLAYCONFIG_DEVICE_INFO_HEADER.layout().withName("header"),
        DISPLAYCONFIG_TARGET_DEVICE_NAME_FLAGS.layout().withName("flags"),
        winapi.C_INT.withName("outputTechnology"),
        winapi.C_SHORT.withName("edidManufactureId"),
        winapi.C_SHORT.withName("edidProductCodeId"),
        winapi.C_INT.withName("connectorInstance"),
        MemoryLayout.sequenceLayout(64, winapi.C_SHORT).withName("monitorFriendlyDeviceName"),
        MemoryLayout.sequenceLayout(128, winapi.C_SHORT).withName("monitorDevicePath")
    ).withName("DISPLAYCONFIG_TARGET_DEVICE_NAME");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout header$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("header"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_DEVICE_INFO_HEADER header
     * }
     */
    public static final GroupLayout header$layout() {
        return header$LAYOUT;
    }

    private static final long header$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_DEVICE_INFO_HEADER header
     * }
     */
    public static final long header$offset() {
        return header$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_DEVICE_INFO_HEADER header
     * }
     */
    public static MemorySegment header(MemorySegment struct) {
        return struct.asSlice(header$OFFSET, header$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_DEVICE_INFO_HEADER header
     * }
     */
    public static void header(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, header$OFFSET, header$LAYOUT.byteSize());
    }

    private static final GroupLayout flags$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_TARGET_DEVICE_NAME_FLAGS flags
     * }
     */
    public static final GroupLayout flags$layout() {
        return flags$LAYOUT;
    }

    private static final long flags$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_TARGET_DEVICE_NAME_FLAGS flags
     * }
     */
    public static final long flags$offset() {
        return flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_TARGET_DEVICE_NAME_FLAGS flags
     * }
     */
    public static MemorySegment flags(MemorySegment struct) {
        return struct.asSlice(flags$OFFSET, flags$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_TARGET_DEVICE_NAME_FLAGS flags
     * }
     */
    public static void flags(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, flags$OFFSET, flags$LAYOUT.byteSize());
    }

    private static final OfInt outputTechnology$LAYOUT = (OfInt)$LAYOUT.select(groupElement("outputTechnology"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY outputTechnology
     * }
     */
    public static final OfInt outputTechnology$layout() {
        return outputTechnology$LAYOUT;
    }

    private static final long outputTechnology$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY outputTechnology
     * }
     */
    public static final long outputTechnology$offset() {
        return outputTechnology$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY outputTechnology
     * }
     */
    public static int outputTechnology(MemorySegment struct) {
        return struct.get(outputTechnology$LAYOUT, outputTechnology$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DISPLAYCONFIG_VIDEO_OUTPUT_TECHNOLOGY outputTechnology
     * }
     */
    public static void outputTechnology(MemorySegment struct, int fieldValue) {
        struct.set(outputTechnology$LAYOUT, outputTechnology$OFFSET, fieldValue);
    }

    private static final OfShort edidManufactureId$LAYOUT = (OfShort)$LAYOUT.select(groupElement("edidManufactureId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT16 edidManufactureId
     * }
     */
    public static final OfShort edidManufactureId$layout() {
        return edidManufactureId$LAYOUT;
    }

    private static final long edidManufactureId$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT16 edidManufactureId
     * }
     */
    public static final long edidManufactureId$offset() {
        return edidManufactureId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT16 edidManufactureId
     * }
     */
    public static short edidManufactureId(MemorySegment struct) {
        return struct.get(edidManufactureId$LAYOUT, edidManufactureId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT16 edidManufactureId
     * }
     */
    public static void edidManufactureId(MemorySegment struct, short fieldValue) {
        struct.set(edidManufactureId$LAYOUT, edidManufactureId$OFFSET, fieldValue);
    }

    private static final OfShort edidProductCodeId$LAYOUT = (OfShort)$LAYOUT.select(groupElement("edidProductCodeId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT16 edidProductCodeId
     * }
     */
    public static final OfShort edidProductCodeId$layout() {
        return edidProductCodeId$LAYOUT;
    }

    private static final long edidProductCodeId$OFFSET = 30;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT16 edidProductCodeId
     * }
     */
    public static final long edidProductCodeId$offset() {
        return edidProductCodeId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT16 edidProductCodeId
     * }
     */
    public static short edidProductCodeId(MemorySegment struct) {
        return struct.get(edidProductCodeId$LAYOUT, edidProductCodeId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT16 edidProductCodeId
     * }
     */
    public static void edidProductCodeId(MemorySegment struct, short fieldValue) {
        struct.set(edidProductCodeId$LAYOUT, edidProductCodeId$OFFSET, fieldValue);
    }

    private static final OfInt connectorInstance$LAYOUT = (OfInt)$LAYOUT.select(groupElement("connectorInstance"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT32 connectorInstance
     * }
     */
    public static final OfInt connectorInstance$layout() {
        return connectorInstance$LAYOUT;
    }

    private static final long connectorInstance$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT32 connectorInstance
     * }
     */
    public static final long connectorInstance$offset() {
        return connectorInstance$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT32 connectorInstance
     * }
     */
    public static int connectorInstance(MemorySegment struct) {
        return struct.get(connectorInstance$LAYOUT, connectorInstance$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT32 connectorInstance
     * }
     */
    public static void connectorInstance(MemorySegment struct, int fieldValue) {
        struct.set(connectorInstance$LAYOUT, connectorInstance$OFFSET, fieldValue);
    }

    private static final SequenceLayout monitorFriendlyDeviceName$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("monitorFriendlyDeviceName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WCHAR monitorFriendlyDeviceName[64]
     * }
     */
    public static final SequenceLayout monitorFriendlyDeviceName$layout() {
        return monitorFriendlyDeviceName$LAYOUT;
    }

    private static final long monitorFriendlyDeviceName$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WCHAR monitorFriendlyDeviceName[64]
     * }
     */
    public static final long monitorFriendlyDeviceName$offset() {
        return monitorFriendlyDeviceName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WCHAR monitorFriendlyDeviceName[64]
     * }
     */
    public static MemorySegment monitorFriendlyDeviceName(MemorySegment struct) {
        return struct.asSlice(monitorFriendlyDeviceName$OFFSET, monitorFriendlyDeviceName$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WCHAR monitorFriendlyDeviceName[64]
     * }
     */
    public static void monitorFriendlyDeviceName(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, monitorFriendlyDeviceName$OFFSET, monitorFriendlyDeviceName$LAYOUT.byteSize());
    }

    private static long[] monitorFriendlyDeviceName$DIMS = { 64 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * WCHAR monitorFriendlyDeviceName[64]
     * }
     */
    public static long[] monitorFriendlyDeviceName$dimensions() {
        return monitorFriendlyDeviceName$DIMS;
    }
    private static final VarHandle monitorFriendlyDeviceName$ELEM_HANDLE = monitorFriendlyDeviceName$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * WCHAR monitorFriendlyDeviceName[64]
     * }
     */
    public static short monitorFriendlyDeviceName(MemorySegment struct, long index0) {
        return (short)monitorFriendlyDeviceName$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * WCHAR monitorFriendlyDeviceName[64]
     * }
     */
    public static void monitorFriendlyDeviceName(MemorySegment struct, long index0, short fieldValue) {
        monitorFriendlyDeviceName$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout monitorDevicePath$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("monitorDevicePath"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WCHAR monitorDevicePath[128]
     * }
     */
    public static final SequenceLayout monitorDevicePath$layout() {
        return monitorDevicePath$LAYOUT;
    }

    private static final long monitorDevicePath$OFFSET = 164;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WCHAR monitorDevicePath[128]
     * }
     */
    public static final long monitorDevicePath$offset() {
        return monitorDevicePath$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WCHAR monitorDevicePath[128]
     * }
     */
    public static MemorySegment monitorDevicePath(MemorySegment struct) {
        return struct.asSlice(monitorDevicePath$OFFSET, monitorDevicePath$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WCHAR monitorDevicePath[128]
     * }
     */
    public static void monitorDevicePath(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, monitorDevicePath$OFFSET, monitorDevicePath$LAYOUT.byteSize());
    }

    private static long[] monitorDevicePath$DIMS = { 128 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * WCHAR monitorDevicePath[128]
     * }
     */
    public static long[] monitorDevicePath$dimensions() {
        return monitorDevicePath$DIMS;
    }
    private static final VarHandle monitorDevicePath$ELEM_HANDLE = monitorDevicePath$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * WCHAR monitorDevicePath[128]
     * }
     */
    public static short monitorDevicePath(MemorySegment struct, long index0) {
        return (short)monitorDevicePath$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * WCHAR monitorDevicePath[128]
     * }
     */
    public static void monitorDevicePath(MemorySegment struct, long index0, short fieldValue) {
        monitorDevicePath$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

