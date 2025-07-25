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
 *     DWORD IdleTransitions;
 *     DWORD FailedTransitions;
 *     DWORD InvalidBucketIndex;
 *     DWORD64 TotalTime;
 *     DWORD IdleTimeBuckets[6];
 * }
 * }
 */
public class PPM_IDLE_STATE_ACCOUNTING {

    PPM_IDLE_STATE_ACCOUNTING() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("IdleTransitions"),
        winapi.C_LONG.withName("FailedTransitions"),
        winapi.C_LONG.withName("InvalidBucketIndex"),
        MemoryLayout.paddingLayout(4),
        winapi.C_LONG_LONG.withName("TotalTime"),
        MemoryLayout.sequenceLayout(6, winapi.C_LONG).withName("IdleTimeBuckets")
    ).withName("$anon$18683:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt IdleTransitions$LAYOUT = (OfInt)$LAYOUT.select(groupElement("IdleTransitions"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD IdleTransitions
     * }
     */
    public static final OfInt IdleTransitions$layout() {
        return IdleTransitions$LAYOUT;
    }

    private static final long IdleTransitions$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD IdleTransitions
     * }
     */
    public static final long IdleTransitions$offset() {
        return IdleTransitions$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD IdleTransitions
     * }
     */
    public static int IdleTransitions(MemorySegment struct) {
        return struct.get(IdleTransitions$LAYOUT, IdleTransitions$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD IdleTransitions
     * }
     */
    public static void IdleTransitions(MemorySegment struct, int fieldValue) {
        struct.set(IdleTransitions$LAYOUT, IdleTransitions$OFFSET, fieldValue);
    }

    private static final OfInt FailedTransitions$LAYOUT = (OfInt)$LAYOUT.select(groupElement("FailedTransitions"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD FailedTransitions
     * }
     */
    public static final OfInt FailedTransitions$layout() {
        return FailedTransitions$LAYOUT;
    }

    private static final long FailedTransitions$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD FailedTransitions
     * }
     */
    public static final long FailedTransitions$offset() {
        return FailedTransitions$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD FailedTransitions
     * }
     */
    public static int FailedTransitions(MemorySegment struct) {
        return struct.get(FailedTransitions$LAYOUT, FailedTransitions$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD FailedTransitions
     * }
     */
    public static void FailedTransitions(MemorySegment struct, int fieldValue) {
        struct.set(FailedTransitions$LAYOUT, FailedTransitions$OFFSET, fieldValue);
    }

    private static final OfInt InvalidBucketIndex$LAYOUT = (OfInt)$LAYOUT.select(groupElement("InvalidBucketIndex"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD InvalidBucketIndex
     * }
     */
    public static final OfInt InvalidBucketIndex$layout() {
        return InvalidBucketIndex$LAYOUT;
    }

    private static final long InvalidBucketIndex$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD InvalidBucketIndex
     * }
     */
    public static final long InvalidBucketIndex$offset() {
        return InvalidBucketIndex$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD InvalidBucketIndex
     * }
     */
    public static int InvalidBucketIndex(MemorySegment struct) {
        return struct.get(InvalidBucketIndex$LAYOUT, InvalidBucketIndex$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD InvalidBucketIndex
     * }
     */
    public static void InvalidBucketIndex(MemorySegment struct, int fieldValue) {
        struct.set(InvalidBucketIndex$LAYOUT, InvalidBucketIndex$OFFSET, fieldValue);
    }

    private static final OfLong TotalTime$LAYOUT = (OfLong)$LAYOUT.select(groupElement("TotalTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD64 TotalTime
     * }
     */
    public static final OfLong TotalTime$layout() {
        return TotalTime$LAYOUT;
    }

    private static final long TotalTime$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD64 TotalTime
     * }
     */
    public static final long TotalTime$offset() {
        return TotalTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD64 TotalTime
     * }
     */
    public static long TotalTime(MemorySegment struct) {
        return struct.get(TotalTime$LAYOUT, TotalTime$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD64 TotalTime
     * }
     */
    public static void TotalTime(MemorySegment struct, long fieldValue) {
        struct.set(TotalTime$LAYOUT, TotalTime$OFFSET, fieldValue);
    }

    private static final SequenceLayout IdleTimeBuckets$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("IdleTimeBuckets"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD IdleTimeBuckets[6]
     * }
     */
    public static final SequenceLayout IdleTimeBuckets$layout() {
        return IdleTimeBuckets$LAYOUT;
    }

    private static final long IdleTimeBuckets$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD IdleTimeBuckets[6]
     * }
     */
    public static final long IdleTimeBuckets$offset() {
        return IdleTimeBuckets$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD IdleTimeBuckets[6]
     * }
     */
    public static MemorySegment IdleTimeBuckets(MemorySegment struct) {
        return struct.asSlice(IdleTimeBuckets$OFFSET, IdleTimeBuckets$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD IdleTimeBuckets[6]
     * }
     */
    public static void IdleTimeBuckets(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, IdleTimeBuckets$OFFSET, IdleTimeBuckets$LAYOUT.byteSize());
    }

    private static long[] IdleTimeBuckets$DIMS = { 6 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * DWORD IdleTimeBuckets[6]
     * }
     */
    public static long[] IdleTimeBuckets$dimensions() {
        return IdleTimeBuckets$DIMS;
    }
    private static final VarHandle IdleTimeBuckets$ELEM_HANDLE = IdleTimeBuckets$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * DWORD IdleTimeBuckets[6]
     * }
     */
    public static int IdleTimeBuckets(MemorySegment struct, long index0) {
        return (int)IdleTimeBuckets$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * DWORD IdleTimeBuckets[6]
     * }
     */
    public static void IdleTimeBuckets(MemorySegment struct, long index0, int fieldValue) {
        IdleTimeBuckets$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

