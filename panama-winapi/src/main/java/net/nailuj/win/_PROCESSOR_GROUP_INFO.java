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
 * struct _PROCESSOR_GROUP_INFO {
 *     BYTE MaximumProcessorCount;
 *     BYTE ActiveProcessorCount;
 *     BYTE Reserved[38];
 *     KAFFINITY ActiveProcessorMask;
 * }
 * }
 */
public class _PROCESSOR_GROUP_INFO {

    _PROCESSOR_GROUP_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_CHAR.withName("MaximumProcessorCount"),
        winapi.C_CHAR.withName("ActiveProcessorCount"),
        MemoryLayout.sequenceLayout(38, winapi.C_CHAR).withName("Reserved"),
        winapi.C_LONG_LONG.withName("ActiveProcessorMask")
    ).withName("_PROCESSOR_GROUP_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfByte MaximumProcessorCount$LAYOUT = (OfByte)$LAYOUT.select(groupElement("MaximumProcessorCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE MaximumProcessorCount
     * }
     */
    public static final OfByte MaximumProcessorCount$layout() {
        return MaximumProcessorCount$LAYOUT;
    }

    private static final long MaximumProcessorCount$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE MaximumProcessorCount
     * }
     */
    public static final long MaximumProcessorCount$offset() {
        return MaximumProcessorCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE MaximumProcessorCount
     * }
     */
    public static byte MaximumProcessorCount(MemorySegment struct) {
        return struct.get(MaximumProcessorCount$LAYOUT, MaximumProcessorCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE MaximumProcessorCount
     * }
     */
    public static void MaximumProcessorCount(MemorySegment struct, byte fieldValue) {
        struct.set(MaximumProcessorCount$LAYOUT, MaximumProcessorCount$OFFSET, fieldValue);
    }

    private static final OfByte ActiveProcessorCount$LAYOUT = (OfByte)$LAYOUT.select(groupElement("ActiveProcessorCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE ActiveProcessorCount
     * }
     */
    public static final OfByte ActiveProcessorCount$layout() {
        return ActiveProcessorCount$LAYOUT;
    }

    private static final long ActiveProcessorCount$OFFSET = 1;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE ActiveProcessorCount
     * }
     */
    public static final long ActiveProcessorCount$offset() {
        return ActiveProcessorCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE ActiveProcessorCount
     * }
     */
    public static byte ActiveProcessorCount(MemorySegment struct) {
        return struct.get(ActiveProcessorCount$LAYOUT, ActiveProcessorCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE ActiveProcessorCount
     * }
     */
    public static void ActiveProcessorCount(MemorySegment struct, byte fieldValue) {
        struct.set(ActiveProcessorCount$LAYOUT, ActiveProcessorCount$OFFSET, fieldValue);
    }

    private static final SequenceLayout Reserved$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Reserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Reserved[38]
     * }
     */
    public static final SequenceLayout Reserved$layout() {
        return Reserved$LAYOUT;
    }

    private static final long Reserved$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Reserved[38]
     * }
     */
    public static final long Reserved$offset() {
        return Reserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Reserved[38]
     * }
     */
    public static MemorySegment Reserved(MemorySegment struct) {
        return struct.asSlice(Reserved$OFFSET, Reserved$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Reserved[38]
     * }
     */
    public static void Reserved(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Reserved$OFFSET, Reserved$LAYOUT.byteSize());
    }

    private static long[] Reserved$DIMS = { 38 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE Reserved[38]
     * }
     */
    public static long[] Reserved$dimensions() {
        return Reserved$DIMS;
    }
    private static final VarHandle Reserved$ELEM_HANDLE = Reserved$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE Reserved[38]
     * }
     */
    public static byte Reserved(MemorySegment struct, long index0) {
        return (byte)Reserved$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE Reserved[38]
     * }
     */
    public static void Reserved(MemorySegment struct, long index0, byte fieldValue) {
        Reserved$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfLong ActiveProcessorMask$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ActiveProcessorMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * KAFFINITY ActiveProcessorMask
     * }
     */
    public static final OfLong ActiveProcessorMask$layout() {
        return ActiveProcessorMask$LAYOUT;
    }

    private static final long ActiveProcessorMask$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * KAFFINITY ActiveProcessorMask
     * }
     */
    public static final long ActiveProcessorMask$offset() {
        return ActiveProcessorMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * KAFFINITY ActiveProcessorMask
     * }
     */
    public static long ActiveProcessorMask(MemorySegment struct) {
        return struct.get(ActiveProcessorMask$LAYOUT, ActiveProcessorMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * KAFFINITY ActiveProcessorMask
     * }
     */
    public static void ActiveProcessorMask(MemorySegment struct, long fieldValue) {
        struct.set(ActiveProcessorMask$LAYOUT, ActiveProcessorMask$OFFSET, fieldValue);
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

