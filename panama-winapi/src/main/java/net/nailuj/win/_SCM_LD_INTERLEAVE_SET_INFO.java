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
 * struct _SCM_LD_INTERLEAVE_SET_INFO {
 *     DWORD Version;
 *     DWORD Size;
 *     DWORD InterleaveSetSize;
 *     SCM_INTERLEAVED_PD_INFO InterleaveSet[1];
 * }
 * }
 */
public class _SCM_LD_INTERLEAVE_SET_INFO {

    _SCM_LD_INTERLEAVE_SET_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("Version"),
        winapi.C_LONG.withName("Size"),
        winapi.C_LONG.withName("InterleaveSetSize"),
        MemoryLayout.sequenceLayout(1, _SCM_INTERLEAVED_PD_INFO.layout()).withName("InterleaveSet")
    ).withName("_SCM_LD_INTERLEAVE_SET_INFO");

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

    private static final OfInt InterleaveSetSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("InterleaveSetSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD InterleaveSetSize
     * }
     */
    public static final OfInt InterleaveSetSize$layout() {
        return InterleaveSetSize$LAYOUT;
    }

    private static final long InterleaveSetSize$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD InterleaveSetSize
     * }
     */
    public static final long InterleaveSetSize$offset() {
        return InterleaveSetSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD InterleaveSetSize
     * }
     */
    public static int InterleaveSetSize(MemorySegment struct) {
        return struct.get(InterleaveSetSize$LAYOUT, InterleaveSetSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD InterleaveSetSize
     * }
     */
    public static void InterleaveSetSize(MemorySegment struct, int fieldValue) {
        struct.set(InterleaveSetSize$LAYOUT, InterleaveSetSize$OFFSET, fieldValue);
    }

    private static final SequenceLayout InterleaveSet$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("InterleaveSet"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SCM_INTERLEAVED_PD_INFO InterleaveSet[1]
     * }
     */
    public static final SequenceLayout InterleaveSet$layout() {
        return InterleaveSet$LAYOUT;
    }

    private static final long InterleaveSet$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SCM_INTERLEAVED_PD_INFO InterleaveSet[1]
     * }
     */
    public static final long InterleaveSet$offset() {
        return InterleaveSet$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SCM_INTERLEAVED_PD_INFO InterleaveSet[1]
     * }
     */
    public static MemorySegment InterleaveSet(MemorySegment struct) {
        return struct.asSlice(InterleaveSet$OFFSET, InterleaveSet$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SCM_INTERLEAVED_PD_INFO InterleaveSet[1]
     * }
     */
    public static void InterleaveSet(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, InterleaveSet$OFFSET, InterleaveSet$LAYOUT.byteSize());
    }

    private static long[] InterleaveSet$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * SCM_INTERLEAVED_PD_INFO InterleaveSet[1]
     * }
     */
    public static long[] InterleaveSet$dimensions() {
        return InterleaveSet$DIMS;
    }
    private static final MethodHandle InterleaveSet$ELEM_HANDLE = InterleaveSet$LAYOUT.sliceHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * SCM_INTERLEAVED_PD_INFO InterleaveSet[1]
     * }
     */
    public static MemorySegment InterleaveSet(MemorySegment struct, long index0) {
        try {
            return (MemorySegment)InterleaveSet$ELEM_HANDLE.invokeExact(struct, 0L, index0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * SCM_INTERLEAVED_PD_INFO InterleaveSet[1]
     * }
     */
    public static void InterleaveSet(MemorySegment struct, long index0, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, InterleaveSet(struct, index0), 0L, _SCM_INTERLEAVED_PD_INFO.layout().byteSize());
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

