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
 * struct _DEVICE_COPY_OFFLOAD_DESCRIPTOR {
 *     DWORD Version;
 *     DWORD Size;
 *     DWORD MaximumTokenLifetime;
 *     DWORD DefaultTokenLifetime;
 *     DWORDLONG MaximumTransferSize;
 *     DWORDLONG OptimalTransferCount;
 *     DWORD MaximumDataDescriptors;
 *     DWORD MaximumTransferLengthPerDescriptor;
 *     DWORD OptimalTransferLengthPerDescriptor;
 *     WORD OptimalTransferLengthGranularity;
 *     BYTE Reserved[2];
 * }
 * }
 */
public class _DEVICE_COPY_OFFLOAD_DESCRIPTOR {

    _DEVICE_COPY_OFFLOAD_DESCRIPTOR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("Version"),
        winapi.C_LONG.withName("Size"),
        winapi.C_LONG.withName("MaximumTokenLifetime"),
        winapi.C_LONG.withName("DefaultTokenLifetime"),
        winapi.C_LONG_LONG.withName("MaximumTransferSize"),
        winapi.C_LONG_LONG.withName("OptimalTransferCount"),
        winapi.C_LONG.withName("MaximumDataDescriptors"),
        winapi.C_LONG.withName("MaximumTransferLengthPerDescriptor"),
        winapi.C_LONG.withName("OptimalTransferLengthPerDescriptor"),
        winapi.C_SHORT.withName("OptimalTransferLengthGranularity"),
        MemoryLayout.sequenceLayout(2, winapi.C_CHAR).withName("Reserved")
    ).withName("_DEVICE_COPY_OFFLOAD_DESCRIPTOR");

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

    private static final OfInt MaximumTokenLifetime$LAYOUT = (OfInt)$LAYOUT.select(groupElement("MaximumTokenLifetime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD MaximumTokenLifetime
     * }
     */
    public static final OfInt MaximumTokenLifetime$layout() {
        return MaximumTokenLifetime$LAYOUT;
    }

    private static final long MaximumTokenLifetime$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD MaximumTokenLifetime
     * }
     */
    public static final long MaximumTokenLifetime$offset() {
        return MaximumTokenLifetime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD MaximumTokenLifetime
     * }
     */
    public static int MaximumTokenLifetime(MemorySegment struct) {
        return struct.get(MaximumTokenLifetime$LAYOUT, MaximumTokenLifetime$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD MaximumTokenLifetime
     * }
     */
    public static void MaximumTokenLifetime(MemorySegment struct, int fieldValue) {
        struct.set(MaximumTokenLifetime$LAYOUT, MaximumTokenLifetime$OFFSET, fieldValue);
    }

    private static final OfInt DefaultTokenLifetime$LAYOUT = (OfInt)$LAYOUT.select(groupElement("DefaultTokenLifetime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD DefaultTokenLifetime
     * }
     */
    public static final OfInt DefaultTokenLifetime$layout() {
        return DefaultTokenLifetime$LAYOUT;
    }

    private static final long DefaultTokenLifetime$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD DefaultTokenLifetime
     * }
     */
    public static final long DefaultTokenLifetime$offset() {
        return DefaultTokenLifetime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD DefaultTokenLifetime
     * }
     */
    public static int DefaultTokenLifetime(MemorySegment struct) {
        return struct.get(DefaultTokenLifetime$LAYOUT, DefaultTokenLifetime$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD DefaultTokenLifetime
     * }
     */
    public static void DefaultTokenLifetime(MemorySegment struct, int fieldValue) {
        struct.set(DefaultTokenLifetime$LAYOUT, DefaultTokenLifetime$OFFSET, fieldValue);
    }

    private static final OfLong MaximumTransferSize$LAYOUT = (OfLong)$LAYOUT.select(groupElement("MaximumTransferSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG MaximumTransferSize
     * }
     */
    public static final OfLong MaximumTransferSize$layout() {
        return MaximumTransferSize$LAYOUT;
    }

    private static final long MaximumTransferSize$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG MaximumTransferSize
     * }
     */
    public static final long MaximumTransferSize$offset() {
        return MaximumTransferSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG MaximumTransferSize
     * }
     */
    public static long MaximumTransferSize(MemorySegment struct) {
        return struct.get(MaximumTransferSize$LAYOUT, MaximumTransferSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG MaximumTransferSize
     * }
     */
    public static void MaximumTransferSize(MemorySegment struct, long fieldValue) {
        struct.set(MaximumTransferSize$LAYOUT, MaximumTransferSize$OFFSET, fieldValue);
    }

    private static final OfLong OptimalTransferCount$LAYOUT = (OfLong)$LAYOUT.select(groupElement("OptimalTransferCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG OptimalTransferCount
     * }
     */
    public static final OfLong OptimalTransferCount$layout() {
        return OptimalTransferCount$LAYOUT;
    }

    private static final long OptimalTransferCount$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG OptimalTransferCount
     * }
     */
    public static final long OptimalTransferCount$offset() {
        return OptimalTransferCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG OptimalTransferCount
     * }
     */
    public static long OptimalTransferCount(MemorySegment struct) {
        return struct.get(OptimalTransferCount$LAYOUT, OptimalTransferCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG OptimalTransferCount
     * }
     */
    public static void OptimalTransferCount(MemorySegment struct, long fieldValue) {
        struct.set(OptimalTransferCount$LAYOUT, OptimalTransferCount$OFFSET, fieldValue);
    }

    private static final OfInt MaximumDataDescriptors$LAYOUT = (OfInt)$LAYOUT.select(groupElement("MaximumDataDescriptors"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD MaximumDataDescriptors
     * }
     */
    public static final OfInt MaximumDataDescriptors$layout() {
        return MaximumDataDescriptors$LAYOUT;
    }

    private static final long MaximumDataDescriptors$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD MaximumDataDescriptors
     * }
     */
    public static final long MaximumDataDescriptors$offset() {
        return MaximumDataDescriptors$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD MaximumDataDescriptors
     * }
     */
    public static int MaximumDataDescriptors(MemorySegment struct) {
        return struct.get(MaximumDataDescriptors$LAYOUT, MaximumDataDescriptors$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD MaximumDataDescriptors
     * }
     */
    public static void MaximumDataDescriptors(MemorySegment struct, int fieldValue) {
        struct.set(MaximumDataDescriptors$LAYOUT, MaximumDataDescriptors$OFFSET, fieldValue);
    }

    private static final OfInt MaximumTransferLengthPerDescriptor$LAYOUT = (OfInt)$LAYOUT.select(groupElement("MaximumTransferLengthPerDescriptor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD MaximumTransferLengthPerDescriptor
     * }
     */
    public static final OfInt MaximumTransferLengthPerDescriptor$layout() {
        return MaximumTransferLengthPerDescriptor$LAYOUT;
    }

    private static final long MaximumTransferLengthPerDescriptor$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD MaximumTransferLengthPerDescriptor
     * }
     */
    public static final long MaximumTransferLengthPerDescriptor$offset() {
        return MaximumTransferLengthPerDescriptor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD MaximumTransferLengthPerDescriptor
     * }
     */
    public static int MaximumTransferLengthPerDescriptor(MemorySegment struct) {
        return struct.get(MaximumTransferLengthPerDescriptor$LAYOUT, MaximumTransferLengthPerDescriptor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD MaximumTransferLengthPerDescriptor
     * }
     */
    public static void MaximumTransferLengthPerDescriptor(MemorySegment struct, int fieldValue) {
        struct.set(MaximumTransferLengthPerDescriptor$LAYOUT, MaximumTransferLengthPerDescriptor$OFFSET, fieldValue);
    }

    private static final OfInt OptimalTransferLengthPerDescriptor$LAYOUT = (OfInt)$LAYOUT.select(groupElement("OptimalTransferLengthPerDescriptor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD OptimalTransferLengthPerDescriptor
     * }
     */
    public static final OfInt OptimalTransferLengthPerDescriptor$layout() {
        return OptimalTransferLengthPerDescriptor$LAYOUT;
    }

    private static final long OptimalTransferLengthPerDescriptor$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD OptimalTransferLengthPerDescriptor
     * }
     */
    public static final long OptimalTransferLengthPerDescriptor$offset() {
        return OptimalTransferLengthPerDescriptor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD OptimalTransferLengthPerDescriptor
     * }
     */
    public static int OptimalTransferLengthPerDescriptor(MemorySegment struct) {
        return struct.get(OptimalTransferLengthPerDescriptor$LAYOUT, OptimalTransferLengthPerDescriptor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD OptimalTransferLengthPerDescriptor
     * }
     */
    public static void OptimalTransferLengthPerDescriptor(MemorySegment struct, int fieldValue) {
        struct.set(OptimalTransferLengthPerDescriptor$LAYOUT, OptimalTransferLengthPerDescriptor$OFFSET, fieldValue);
    }

    private static final OfShort OptimalTransferLengthGranularity$LAYOUT = (OfShort)$LAYOUT.select(groupElement("OptimalTransferLengthGranularity"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD OptimalTransferLengthGranularity
     * }
     */
    public static final OfShort OptimalTransferLengthGranularity$layout() {
        return OptimalTransferLengthGranularity$LAYOUT;
    }

    private static final long OptimalTransferLengthGranularity$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD OptimalTransferLengthGranularity
     * }
     */
    public static final long OptimalTransferLengthGranularity$offset() {
        return OptimalTransferLengthGranularity$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD OptimalTransferLengthGranularity
     * }
     */
    public static short OptimalTransferLengthGranularity(MemorySegment struct) {
        return struct.get(OptimalTransferLengthGranularity$LAYOUT, OptimalTransferLengthGranularity$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD OptimalTransferLengthGranularity
     * }
     */
    public static void OptimalTransferLengthGranularity(MemorySegment struct, short fieldValue) {
        struct.set(OptimalTransferLengthGranularity$LAYOUT, OptimalTransferLengthGranularity$OFFSET, fieldValue);
    }

    private static final SequenceLayout Reserved$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Reserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Reserved[2]
     * }
     */
    public static final SequenceLayout Reserved$layout() {
        return Reserved$LAYOUT;
    }

    private static final long Reserved$OFFSET = 46;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Reserved[2]
     * }
     */
    public static final long Reserved$offset() {
        return Reserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Reserved[2]
     * }
     */
    public static MemorySegment Reserved(MemorySegment struct) {
        return struct.asSlice(Reserved$OFFSET, Reserved$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Reserved[2]
     * }
     */
    public static void Reserved(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Reserved$OFFSET, Reserved$LAYOUT.byteSize());
    }

    private static long[] Reserved$DIMS = { 2 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE Reserved[2]
     * }
     */
    public static long[] Reserved$dimensions() {
        return Reserved$DIMS;
    }
    private static final VarHandle Reserved$ELEM_HANDLE = Reserved$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE Reserved[2]
     * }
     */
    public static byte Reserved(MemorySegment struct, long index0) {
        return (byte)Reserved$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE Reserved[2]
     * }
     */
    public static void Reserved(MemorySegment struct, long index0, byte fieldValue) {
        Reserved$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

