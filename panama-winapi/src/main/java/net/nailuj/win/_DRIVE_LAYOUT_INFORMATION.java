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
 * struct _DRIVE_LAYOUT_INFORMATION {
 *     DWORD PartitionCount;
 *     DWORD Signature;
 *     PARTITION_INFORMATION PartitionEntry[1];
 * }
 * }
 */
public class _DRIVE_LAYOUT_INFORMATION {

    _DRIVE_LAYOUT_INFORMATION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("PartitionCount"),
        winapi.C_LONG.withName("Signature"),
        MemoryLayout.sequenceLayout(1, _PARTITION_INFORMATION.layout()).withName("PartitionEntry")
    ).withName("_DRIVE_LAYOUT_INFORMATION");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt PartitionCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("PartitionCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD PartitionCount
     * }
     */
    public static final OfInt PartitionCount$layout() {
        return PartitionCount$LAYOUT;
    }

    private static final long PartitionCount$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD PartitionCount
     * }
     */
    public static final long PartitionCount$offset() {
        return PartitionCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD PartitionCount
     * }
     */
    public static int PartitionCount(MemorySegment struct) {
        return struct.get(PartitionCount$LAYOUT, PartitionCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD PartitionCount
     * }
     */
    public static void PartitionCount(MemorySegment struct, int fieldValue) {
        struct.set(PartitionCount$LAYOUT, PartitionCount$OFFSET, fieldValue);
    }

    private static final OfInt Signature$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Signature"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Signature
     * }
     */
    public static final OfInt Signature$layout() {
        return Signature$LAYOUT;
    }

    private static final long Signature$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Signature
     * }
     */
    public static final long Signature$offset() {
        return Signature$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Signature
     * }
     */
    public static int Signature(MemorySegment struct) {
        return struct.get(Signature$LAYOUT, Signature$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Signature
     * }
     */
    public static void Signature(MemorySegment struct, int fieldValue) {
        struct.set(Signature$LAYOUT, Signature$OFFSET, fieldValue);
    }

    private static final SequenceLayout PartitionEntry$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("PartitionEntry"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PARTITION_INFORMATION PartitionEntry[1]
     * }
     */
    public static final SequenceLayout PartitionEntry$layout() {
        return PartitionEntry$LAYOUT;
    }

    private static final long PartitionEntry$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PARTITION_INFORMATION PartitionEntry[1]
     * }
     */
    public static final long PartitionEntry$offset() {
        return PartitionEntry$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PARTITION_INFORMATION PartitionEntry[1]
     * }
     */
    public static MemorySegment PartitionEntry(MemorySegment struct) {
        return struct.asSlice(PartitionEntry$OFFSET, PartitionEntry$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PARTITION_INFORMATION PartitionEntry[1]
     * }
     */
    public static void PartitionEntry(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, PartitionEntry$OFFSET, PartitionEntry$LAYOUT.byteSize());
    }

    private static long[] PartitionEntry$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * PARTITION_INFORMATION PartitionEntry[1]
     * }
     */
    public static long[] PartitionEntry$dimensions() {
        return PartitionEntry$DIMS;
    }
    private static final MethodHandle PartitionEntry$ELEM_HANDLE = PartitionEntry$LAYOUT.sliceHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * PARTITION_INFORMATION PartitionEntry[1]
     * }
     */
    public static MemorySegment PartitionEntry(MemorySegment struct, long index0) {
        try {
            return (MemorySegment)PartitionEntry$ELEM_HANDLE.invokeExact(struct, 0L, index0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * PARTITION_INFORMATION PartitionEntry[1]
     * }
     */
    public static void PartitionEntry(MemorySegment struct, long index0, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, PartitionEntry(struct, index0), 0L, _PARTITION_INFORMATION.layout().byteSize());
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

