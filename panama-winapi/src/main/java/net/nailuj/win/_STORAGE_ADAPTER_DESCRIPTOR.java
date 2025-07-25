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
 * struct _STORAGE_ADAPTER_DESCRIPTOR {
 *     DWORD Version;
 *     DWORD Size;
 *     DWORD MaximumTransferLength;
 *     DWORD MaximumPhysicalPages;
 *     DWORD AlignmentMask;
 *     BOOLEAN AdapterUsesPio;
 *     BOOLEAN AdapterScansDown;
 *     BOOLEAN CommandQueueing;
 *     BOOLEAN AcceleratedTransfer;
 *     BYTE BusType;
 *     WORD BusMajorVersion;
 *     WORD BusMinorVersion;
 *     BYTE SrbType;
 *     BYTE AddressType;
 * }
 * }
 */
public class _STORAGE_ADAPTER_DESCRIPTOR {

    _STORAGE_ADAPTER_DESCRIPTOR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("Version"),
        winapi.C_LONG.withName("Size"),
        winapi.C_LONG.withName("MaximumTransferLength"),
        winapi.C_LONG.withName("MaximumPhysicalPages"),
        winapi.C_LONG.withName("AlignmentMask"),
        winapi.C_CHAR.withName("AdapterUsesPio"),
        winapi.C_CHAR.withName("AdapterScansDown"),
        winapi.C_CHAR.withName("CommandQueueing"),
        winapi.C_CHAR.withName("AcceleratedTransfer"),
        winapi.C_CHAR.withName("BusType"),
        MemoryLayout.paddingLayout(1),
        winapi.C_SHORT.withName("BusMajorVersion"),
        winapi.C_SHORT.withName("BusMinorVersion"),
        winapi.C_CHAR.withName("SrbType"),
        winapi.C_CHAR.withName("AddressType")
    ).withName("_STORAGE_ADAPTER_DESCRIPTOR");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Version$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Version"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static final OfInt Version$layout() {
        return Version$LAYOUT;
    }

    private static final long Version$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static final long Version$offset() {
        return Version$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static int Version(MemorySegment struct) {
        return struct.get(Version$LAYOUT, Version$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static void Version(MemorySegment struct, int fieldValue) {
        struct.set(Version$LAYOUT, Version$OFFSET, fieldValue);
    }

    private static final OfInt Size$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static final OfInt Size$layout() {
        return Size$LAYOUT;
    }

    private static final long Size$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static final long Size$offset() {
        return Size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static int Size(MemorySegment struct) {
        return struct.get(Size$LAYOUT, Size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static void Size(MemorySegment struct, int fieldValue) {
        struct.set(Size$LAYOUT, Size$OFFSET, fieldValue);
    }

    private static final OfInt MaximumTransferLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("MaximumTransferLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD MaximumTransferLength
     * }
     */
    public static final OfInt MaximumTransferLength$layout() {
        return MaximumTransferLength$LAYOUT;
    }

    private static final long MaximumTransferLength$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD MaximumTransferLength
     * }
     */
    public static final long MaximumTransferLength$offset() {
        return MaximumTransferLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD MaximumTransferLength
     * }
     */
    public static int MaximumTransferLength(MemorySegment struct) {
        return struct.get(MaximumTransferLength$LAYOUT, MaximumTransferLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD MaximumTransferLength
     * }
     */
    public static void MaximumTransferLength(MemorySegment struct, int fieldValue) {
        struct.set(MaximumTransferLength$LAYOUT, MaximumTransferLength$OFFSET, fieldValue);
    }

    private static final OfInt MaximumPhysicalPages$LAYOUT = (OfInt)$LAYOUT.select(groupElement("MaximumPhysicalPages"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD MaximumPhysicalPages
     * }
     */
    public static final OfInt MaximumPhysicalPages$layout() {
        return MaximumPhysicalPages$LAYOUT;
    }

    private static final long MaximumPhysicalPages$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD MaximumPhysicalPages
     * }
     */
    public static final long MaximumPhysicalPages$offset() {
        return MaximumPhysicalPages$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD MaximumPhysicalPages
     * }
     */
    public static int MaximumPhysicalPages(MemorySegment struct) {
        return struct.get(MaximumPhysicalPages$LAYOUT, MaximumPhysicalPages$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD MaximumPhysicalPages
     * }
     */
    public static void MaximumPhysicalPages(MemorySegment struct, int fieldValue) {
        struct.set(MaximumPhysicalPages$LAYOUT, MaximumPhysicalPages$OFFSET, fieldValue);
    }

    private static final OfInt AlignmentMask$LAYOUT = (OfInt)$LAYOUT.select(groupElement("AlignmentMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD AlignmentMask
     * }
     */
    public static final OfInt AlignmentMask$layout() {
        return AlignmentMask$LAYOUT;
    }

    private static final long AlignmentMask$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD AlignmentMask
     * }
     */
    public static final long AlignmentMask$offset() {
        return AlignmentMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD AlignmentMask
     * }
     */
    public static int AlignmentMask(MemorySegment struct) {
        return struct.get(AlignmentMask$LAYOUT, AlignmentMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD AlignmentMask
     * }
     */
    public static void AlignmentMask(MemorySegment struct, int fieldValue) {
        struct.set(AlignmentMask$LAYOUT, AlignmentMask$OFFSET, fieldValue);
    }

    private static final OfByte AdapterUsesPio$LAYOUT = (OfByte)$LAYOUT.select(groupElement("AdapterUsesPio"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN AdapterUsesPio
     * }
     */
    public static final OfByte AdapterUsesPio$layout() {
        return AdapterUsesPio$LAYOUT;
    }

    private static final long AdapterUsesPio$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN AdapterUsesPio
     * }
     */
    public static final long AdapterUsesPio$offset() {
        return AdapterUsesPio$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN AdapterUsesPio
     * }
     */
    public static byte AdapterUsesPio(MemorySegment struct) {
        return struct.get(AdapterUsesPio$LAYOUT, AdapterUsesPio$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN AdapterUsesPio
     * }
     */
    public static void AdapterUsesPio(MemorySegment struct, byte fieldValue) {
        struct.set(AdapterUsesPio$LAYOUT, AdapterUsesPio$OFFSET, fieldValue);
    }

    private static final OfByte AdapterScansDown$LAYOUT = (OfByte)$LAYOUT.select(groupElement("AdapterScansDown"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN AdapterScansDown
     * }
     */
    public static final OfByte AdapterScansDown$layout() {
        return AdapterScansDown$LAYOUT;
    }

    private static final long AdapterScansDown$OFFSET = 21;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN AdapterScansDown
     * }
     */
    public static final long AdapterScansDown$offset() {
        return AdapterScansDown$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN AdapterScansDown
     * }
     */
    public static byte AdapterScansDown(MemorySegment struct) {
        return struct.get(AdapterScansDown$LAYOUT, AdapterScansDown$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN AdapterScansDown
     * }
     */
    public static void AdapterScansDown(MemorySegment struct, byte fieldValue) {
        struct.set(AdapterScansDown$LAYOUT, AdapterScansDown$OFFSET, fieldValue);
    }

    private static final OfByte CommandQueueing$LAYOUT = (OfByte)$LAYOUT.select(groupElement("CommandQueueing"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN CommandQueueing
     * }
     */
    public static final OfByte CommandQueueing$layout() {
        return CommandQueueing$LAYOUT;
    }

    private static final long CommandQueueing$OFFSET = 22;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN CommandQueueing
     * }
     */
    public static final long CommandQueueing$offset() {
        return CommandQueueing$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN CommandQueueing
     * }
     */
    public static byte CommandQueueing(MemorySegment struct) {
        return struct.get(CommandQueueing$LAYOUT, CommandQueueing$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN CommandQueueing
     * }
     */
    public static void CommandQueueing(MemorySegment struct, byte fieldValue) {
        struct.set(CommandQueueing$LAYOUT, CommandQueueing$OFFSET, fieldValue);
    }

    private static final OfByte AcceleratedTransfer$LAYOUT = (OfByte)$LAYOUT.select(groupElement("AcceleratedTransfer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN AcceleratedTransfer
     * }
     */
    public static final OfByte AcceleratedTransfer$layout() {
        return AcceleratedTransfer$LAYOUT;
    }

    private static final long AcceleratedTransfer$OFFSET = 23;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN AcceleratedTransfer
     * }
     */
    public static final long AcceleratedTransfer$offset() {
        return AcceleratedTransfer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN AcceleratedTransfer
     * }
     */
    public static byte AcceleratedTransfer(MemorySegment struct) {
        return struct.get(AcceleratedTransfer$LAYOUT, AcceleratedTransfer$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN AcceleratedTransfer
     * }
     */
    public static void AcceleratedTransfer(MemorySegment struct, byte fieldValue) {
        struct.set(AcceleratedTransfer$LAYOUT, AcceleratedTransfer$OFFSET, fieldValue);
    }

    private static final OfByte BusType$LAYOUT = (OfByte)$LAYOUT.select(groupElement("BusType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE BusType
     * }
     */
    public static final OfByte BusType$layout() {
        return BusType$LAYOUT;
    }

    private static final long BusType$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE BusType
     * }
     */
    public static final long BusType$offset() {
        return BusType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE BusType
     * }
     */
    public static byte BusType(MemorySegment struct) {
        return struct.get(BusType$LAYOUT, BusType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE BusType
     * }
     */
    public static void BusType(MemorySegment struct, byte fieldValue) {
        struct.set(BusType$LAYOUT, BusType$OFFSET, fieldValue);
    }

    private static final OfShort BusMajorVersion$LAYOUT = (OfShort)$LAYOUT.select(groupElement("BusMajorVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD BusMajorVersion
     * }
     */
    public static final OfShort BusMajorVersion$layout() {
        return BusMajorVersion$LAYOUT;
    }

    private static final long BusMajorVersion$OFFSET = 26;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD BusMajorVersion
     * }
     */
    public static final long BusMajorVersion$offset() {
        return BusMajorVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD BusMajorVersion
     * }
     */
    public static short BusMajorVersion(MemorySegment struct) {
        return struct.get(BusMajorVersion$LAYOUT, BusMajorVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD BusMajorVersion
     * }
     */
    public static void BusMajorVersion(MemorySegment struct, short fieldValue) {
        struct.set(BusMajorVersion$LAYOUT, BusMajorVersion$OFFSET, fieldValue);
    }

    private static final OfShort BusMinorVersion$LAYOUT = (OfShort)$LAYOUT.select(groupElement("BusMinorVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD BusMinorVersion
     * }
     */
    public static final OfShort BusMinorVersion$layout() {
        return BusMinorVersion$LAYOUT;
    }

    private static final long BusMinorVersion$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD BusMinorVersion
     * }
     */
    public static final long BusMinorVersion$offset() {
        return BusMinorVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD BusMinorVersion
     * }
     */
    public static short BusMinorVersion(MemorySegment struct) {
        return struct.get(BusMinorVersion$LAYOUT, BusMinorVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD BusMinorVersion
     * }
     */
    public static void BusMinorVersion(MemorySegment struct, short fieldValue) {
        struct.set(BusMinorVersion$LAYOUT, BusMinorVersion$OFFSET, fieldValue);
    }

    private static final OfByte SrbType$LAYOUT = (OfByte)$LAYOUT.select(groupElement("SrbType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE SrbType
     * }
     */
    public static final OfByte SrbType$layout() {
        return SrbType$LAYOUT;
    }

    private static final long SrbType$OFFSET = 30;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE SrbType
     * }
     */
    public static final long SrbType$offset() {
        return SrbType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE SrbType
     * }
     */
    public static byte SrbType(MemorySegment struct) {
        return struct.get(SrbType$LAYOUT, SrbType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE SrbType
     * }
     */
    public static void SrbType(MemorySegment struct, byte fieldValue) {
        struct.set(SrbType$LAYOUT, SrbType$OFFSET, fieldValue);
    }

    private static final OfByte AddressType$LAYOUT = (OfByte)$LAYOUT.select(groupElement("AddressType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE AddressType
     * }
     */
    public static final OfByte AddressType$layout() {
        return AddressType$LAYOUT;
    }

    private static final long AddressType$OFFSET = 31;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE AddressType
     * }
     */
    public static final long AddressType$offset() {
        return AddressType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE AddressType
     * }
     */
    public static byte AddressType(MemorySegment struct) {
        return struct.get(AddressType$LAYOUT, AddressType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE AddressType
     * }
     */
    public static void AddressType(MemorySegment struct, byte fieldValue) {
        struct.set(AddressType$LAYOUT, AddressType$OFFSET, fieldValue);
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

