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
 *     DWORD StateCount;
 *     DWORD TotalTransitions;
 *     DWORD ResetCount;
 *     DWORD64 StartTime;
 *     PPM_IDLE_STATE_ACCOUNTING State[1];
 * }
 * }
 */
public class PPM_IDLE_ACCOUNTING {

    PPM_IDLE_ACCOUNTING() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("StateCount"),
        winapi.C_LONG.withName("TotalTransitions"),
        winapi.C_LONG.withName("ResetCount"),
        MemoryLayout.paddingLayout(4),
        winapi.C_LONG_LONG.withName("StartTime"),
        MemoryLayout.sequenceLayout(1, PPM_IDLE_STATE_ACCOUNTING.layout()).withName("State")
    ).withName("$anon$18691:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt StateCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("StateCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD StateCount
     * }
     */
    public static final OfInt StateCount$layout() {
        return StateCount$LAYOUT;
    }

    private static final long StateCount$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD StateCount
     * }
     */
    public static final long StateCount$offset() {
        return StateCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD StateCount
     * }
     */
    public static int StateCount(MemorySegment struct) {
        return struct.get(StateCount$LAYOUT, StateCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD StateCount
     * }
     */
    public static void StateCount(MemorySegment struct, int fieldValue) {
        struct.set(StateCount$LAYOUT, StateCount$OFFSET, fieldValue);
    }

    private static final OfInt TotalTransitions$LAYOUT = (OfInt)$LAYOUT.select(groupElement("TotalTransitions"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD TotalTransitions
     * }
     */
    public static final OfInt TotalTransitions$layout() {
        return TotalTransitions$LAYOUT;
    }

    private static final long TotalTransitions$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD TotalTransitions
     * }
     */
    public static final long TotalTransitions$offset() {
        return TotalTransitions$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD TotalTransitions
     * }
     */
    public static int TotalTransitions(MemorySegment struct) {
        return struct.get(TotalTransitions$LAYOUT, TotalTransitions$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD TotalTransitions
     * }
     */
    public static void TotalTransitions(MemorySegment struct, int fieldValue) {
        struct.set(TotalTransitions$LAYOUT, TotalTransitions$OFFSET, fieldValue);
    }

    private static final OfInt ResetCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ResetCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ResetCount
     * }
     */
    public static final OfInt ResetCount$layout() {
        return ResetCount$LAYOUT;
    }

    private static final long ResetCount$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ResetCount
     * }
     */
    public static final long ResetCount$offset() {
        return ResetCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ResetCount
     * }
     */
    public static int ResetCount(MemorySegment struct) {
        return struct.get(ResetCount$LAYOUT, ResetCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ResetCount
     * }
     */
    public static void ResetCount(MemorySegment struct, int fieldValue) {
        struct.set(ResetCount$LAYOUT, ResetCount$OFFSET, fieldValue);
    }

    private static final OfLong StartTime$LAYOUT = (OfLong)$LAYOUT.select(groupElement("StartTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD64 StartTime
     * }
     */
    public static final OfLong StartTime$layout() {
        return StartTime$LAYOUT;
    }

    private static final long StartTime$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD64 StartTime
     * }
     */
    public static final long StartTime$offset() {
        return StartTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD64 StartTime
     * }
     */
    public static long StartTime(MemorySegment struct) {
        return struct.get(StartTime$LAYOUT, StartTime$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD64 StartTime
     * }
     */
    public static void StartTime(MemorySegment struct, long fieldValue) {
        struct.set(StartTime$LAYOUT, StartTime$OFFSET, fieldValue);
    }

    private static final SequenceLayout State$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("State"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PPM_IDLE_STATE_ACCOUNTING State[1]
     * }
     */
    public static final SequenceLayout State$layout() {
        return State$LAYOUT;
    }

    private static final long State$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PPM_IDLE_STATE_ACCOUNTING State[1]
     * }
     */
    public static final long State$offset() {
        return State$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PPM_IDLE_STATE_ACCOUNTING State[1]
     * }
     */
    public static MemorySegment State(MemorySegment struct) {
        return struct.asSlice(State$OFFSET, State$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PPM_IDLE_STATE_ACCOUNTING State[1]
     * }
     */
    public static void State(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, State$OFFSET, State$LAYOUT.byteSize());
    }

    private static long[] State$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * PPM_IDLE_STATE_ACCOUNTING State[1]
     * }
     */
    public static long[] State$dimensions() {
        return State$DIMS;
    }
    private static final MethodHandle State$ELEM_HANDLE = State$LAYOUT.sliceHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * PPM_IDLE_STATE_ACCOUNTING State[1]
     * }
     */
    public static MemorySegment State(MemorySegment struct, long index0) {
        try {
            return (MemorySegment)State$ELEM_HANDLE.invokeExact(struct, 0L, index0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * PPM_IDLE_STATE_ACCOUNTING State[1]
     * }
     */
    public static void State(MemorySegment struct, long index0, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, State(struct, index0), 0L, PPM_IDLE_STATE_ACCOUNTING.layout().byteSize());
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

