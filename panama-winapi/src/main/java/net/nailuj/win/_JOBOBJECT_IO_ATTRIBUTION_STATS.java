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
 * struct _JOBOBJECT_IO_ATTRIBUTION_STATS {
 *     ULONG_PTR IoCount;
 *     ULONGLONG TotalNonOverlappedQueueTime;
 *     ULONGLONG TotalNonOverlappedServiceTime;
 *     ULONGLONG TotalSize;
 * }
 * }
 */
public class _JOBOBJECT_IO_ATTRIBUTION_STATS {

    _JOBOBJECT_IO_ATTRIBUTION_STATS() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG_LONG.withName("IoCount"),
        winapi.C_LONG_LONG.withName("TotalNonOverlappedQueueTime"),
        winapi.C_LONG_LONG.withName("TotalNonOverlappedServiceTime"),
        winapi.C_LONG_LONG.withName("TotalSize")
    ).withName("_JOBOBJECT_IO_ATTRIBUTION_STATS");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong IoCount$LAYOUT = (OfLong)$LAYOUT.select(groupElement("IoCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG_PTR IoCount
     * }
     */
    public static final OfLong IoCount$layout() {
        return IoCount$LAYOUT;
    }

    private static final long IoCount$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG_PTR IoCount
     * }
     */
    public static final long IoCount$offset() {
        return IoCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG_PTR IoCount
     * }
     */
    public static long IoCount(MemorySegment struct) {
        return struct.get(IoCount$LAYOUT, IoCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG_PTR IoCount
     * }
     */
    public static void IoCount(MemorySegment struct, long fieldValue) {
        struct.set(IoCount$LAYOUT, IoCount$OFFSET, fieldValue);
    }

    private static final OfLong TotalNonOverlappedQueueTime$LAYOUT = (OfLong)$LAYOUT.select(groupElement("TotalNonOverlappedQueueTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONGLONG TotalNonOverlappedQueueTime
     * }
     */
    public static final OfLong TotalNonOverlappedQueueTime$layout() {
        return TotalNonOverlappedQueueTime$LAYOUT;
    }

    private static final long TotalNonOverlappedQueueTime$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONGLONG TotalNonOverlappedQueueTime
     * }
     */
    public static final long TotalNonOverlappedQueueTime$offset() {
        return TotalNonOverlappedQueueTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONGLONG TotalNonOverlappedQueueTime
     * }
     */
    public static long TotalNonOverlappedQueueTime(MemorySegment struct) {
        return struct.get(TotalNonOverlappedQueueTime$LAYOUT, TotalNonOverlappedQueueTime$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONGLONG TotalNonOverlappedQueueTime
     * }
     */
    public static void TotalNonOverlappedQueueTime(MemorySegment struct, long fieldValue) {
        struct.set(TotalNonOverlappedQueueTime$LAYOUT, TotalNonOverlappedQueueTime$OFFSET, fieldValue);
    }

    private static final OfLong TotalNonOverlappedServiceTime$LAYOUT = (OfLong)$LAYOUT.select(groupElement("TotalNonOverlappedServiceTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONGLONG TotalNonOverlappedServiceTime
     * }
     */
    public static final OfLong TotalNonOverlappedServiceTime$layout() {
        return TotalNonOverlappedServiceTime$LAYOUT;
    }

    private static final long TotalNonOverlappedServiceTime$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONGLONG TotalNonOverlappedServiceTime
     * }
     */
    public static final long TotalNonOverlappedServiceTime$offset() {
        return TotalNonOverlappedServiceTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONGLONG TotalNonOverlappedServiceTime
     * }
     */
    public static long TotalNonOverlappedServiceTime(MemorySegment struct) {
        return struct.get(TotalNonOverlappedServiceTime$LAYOUT, TotalNonOverlappedServiceTime$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONGLONG TotalNonOverlappedServiceTime
     * }
     */
    public static void TotalNonOverlappedServiceTime(MemorySegment struct, long fieldValue) {
        struct.set(TotalNonOverlappedServiceTime$LAYOUT, TotalNonOverlappedServiceTime$OFFSET, fieldValue);
    }

    private static final OfLong TotalSize$LAYOUT = (OfLong)$LAYOUT.select(groupElement("TotalSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONGLONG TotalSize
     * }
     */
    public static final OfLong TotalSize$layout() {
        return TotalSize$LAYOUT;
    }

    private static final long TotalSize$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONGLONG TotalSize
     * }
     */
    public static final long TotalSize$offset() {
        return TotalSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONGLONG TotalSize
     * }
     */
    public static long TotalSize(MemorySegment struct) {
        return struct.get(TotalSize$LAYOUT, TotalSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONGLONG TotalSize
     * }
     */
    public static void TotalSize(MemorySegment struct, long fieldValue) {
        struct.set(TotalSize$LAYOUT, TotalSize$OFFSET, fieldValue);
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

