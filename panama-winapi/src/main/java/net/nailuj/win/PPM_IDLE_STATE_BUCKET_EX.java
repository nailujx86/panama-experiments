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
 * struct {
 *     DWORD64 TotalTimeUs;
 *     DWORD MinTimeUs;
 *     DWORD MaxTimeUs;
 *     DWORD Count;
 * }
 * }
 */
public class PPM_IDLE_STATE_BUCKET_EX {

    PPM_IDLE_STATE_BUCKET_EX() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG_LONG.withName("TotalTimeUs"),
        winapi.C_LONG.withName("MinTimeUs"),
        winapi.C_LONG.withName("MaxTimeUs"),
        winapi.C_LONG.withName("Count"),
        MemoryLayout.paddingLayout(4)
    ).withName("$anon$18705:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong TotalTimeUs$LAYOUT = (OfLong)$LAYOUT.select(groupElement("TotalTimeUs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD64 TotalTimeUs
     * }
     */
    public static final OfLong TotalTimeUs$layout() {
        return TotalTimeUs$LAYOUT;
    }

    private static final long TotalTimeUs$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD64 TotalTimeUs
     * }
     */
    public static final long TotalTimeUs$offset() {
        return TotalTimeUs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD64 TotalTimeUs
     * }
     */
    public static long TotalTimeUs(MemorySegment struct) {
        return struct.get(TotalTimeUs$LAYOUT, TotalTimeUs$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD64 TotalTimeUs
     * }
     */
    public static void TotalTimeUs(MemorySegment struct, long fieldValue) {
        struct.set(TotalTimeUs$LAYOUT, TotalTimeUs$OFFSET, fieldValue);
    }

    private static final OfInt MinTimeUs$LAYOUT = (OfInt)$LAYOUT.select(groupElement("MinTimeUs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD MinTimeUs
     * }
     */
    public static final OfInt MinTimeUs$layout() {
        return MinTimeUs$LAYOUT;
    }

    private static final long MinTimeUs$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD MinTimeUs
     * }
     */
    public static final long MinTimeUs$offset() {
        return MinTimeUs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD MinTimeUs
     * }
     */
    public static int MinTimeUs(MemorySegment struct) {
        return struct.get(MinTimeUs$LAYOUT, MinTimeUs$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD MinTimeUs
     * }
     */
    public static void MinTimeUs(MemorySegment struct, int fieldValue) {
        struct.set(MinTimeUs$LAYOUT, MinTimeUs$OFFSET, fieldValue);
    }

    private static final OfInt MaxTimeUs$LAYOUT = (OfInt)$LAYOUT.select(groupElement("MaxTimeUs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD MaxTimeUs
     * }
     */
    public static final OfInt MaxTimeUs$layout() {
        return MaxTimeUs$LAYOUT;
    }

    private static final long MaxTimeUs$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD MaxTimeUs
     * }
     */
    public static final long MaxTimeUs$offset() {
        return MaxTimeUs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD MaxTimeUs
     * }
     */
    public static int MaxTimeUs(MemorySegment struct) {
        return struct.get(MaxTimeUs$LAYOUT, MaxTimeUs$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD MaxTimeUs
     * }
     */
    public static void MaxTimeUs(MemorySegment struct, int fieldValue) {
        struct.set(MaxTimeUs$LAYOUT, MaxTimeUs$OFFSET, fieldValue);
    }

    private static final OfInt Count$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Count"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Count
     * }
     */
    public static final OfInt Count$layout() {
        return Count$LAYOUT;
    }

    private static final long Count$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Count
     * }
     */
    public static final long Count$offset() {
        return Count$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Count
     * }
     */
    public static int Count(MemorySegment struct) {
        return struct.get(Count$LAYOUT, Count$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Count
     * }
     */
    public static void Count(MemorySegment struct, int fieldValue) {
        struct.set(Count$LAYOUT, Count$OFFSET, fieldValue);
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

