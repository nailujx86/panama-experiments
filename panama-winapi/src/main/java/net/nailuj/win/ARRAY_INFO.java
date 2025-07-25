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
 *     long Dimension;
 *     unsigned long *BufferConformanceMark;
 *     unsigned long *BufferVarianceMark;
 *     unsigned long *MaxCountArray;
 *     unsigned long *OffsetArray;
 *     unsigned long *ActualCountArray;
 * }
 * }
 */
public class ARRAY_INFO {

    ARRAY_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("Dimension"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("BufferConformanceMark"),
        winapi.C_POINTER.withName("BufferVarianceMark"),
        winapi.C_POINTER.withName("MaxCountArray"),
        winapi.C_POINTER.withName("OffsetArray"),
        winapi.C_POINTER.withName("ActualCountArray")
    ).withName("$anon$575:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Dimension$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Dimension"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * long Dimension
     * }
     */
    public static final OfInt Dimension$layout() {
        return Dimension$LAYOUT;
    }

    private static final long Dimension$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * long Dimension
     * }
     */
    public static final long Dimension$offset() {
        return Dimension$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * long Dimension
     * }
     */
    public static int Dimension(MemorySegment struct) {
        return struct.get(Dimension$LAYOUT, Dimension$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * long Dimension
     * }
     */
    public static void Dimension(MemorySegment struct, int fieldValue) {
        struct.set(Dimension$LAYOUT, Dimension$OFFSET, fieldValue);
    }

    private static final AddressLayout BufferConformanceMark$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("BufferConformanceMark"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long *BufferConformanceMark
     * }
     */
    public static final AddressLayout BufferConformanceMark$layout() {
        return BufferConformanceMark$LAYOUT;
    }

    private static final long BufferConformanceMark$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long *BufferConformanceMark
     * }
     */
    public static final long BufferConformanceMark$offset() {
        return BufferConformanceMark$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long *BufferConformanceMark
     * }
     */
    public static MemorySegment BufferConformanceMark(MemorySegment struct) {
        return struct.get(BufferConformanceMark$LAYOUT, BufferConformanceMark$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long *BufferConformanceMark
     * }
     */
    public static void BufferConformanceMark(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(BufferConformanceMark$LAYOUT, BufferConformanceMark$OFFSET, fieldValue);
    }

    private static final AddressLayout BufferVarianceMark$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("BufferVarianceMark"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long *BufferVarianceMark
     * }
     */
    public static final AddressLayout BufferVarianceMark$layout() {
        return BufferVarianceMark$LAYOUT;
    }

    private static final long BufferVarianceMark$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long *BufferVarianceMark
     * }
     */
    public static final long BufferVarianceMark$offset() {
        return BufferVarianceMark$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long *BufferVarianceMark
     * }
     */
    public static MemorySegment BufferVarianceMark(MemorySegment struct) {
        return struct.get(BufferVarianceMark$LAYOUT, BufferVarianceMark$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long *BufferVarianceMark
     * }
     */
    public static void BufferVarianceMark(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(BufferVarianceMark$LAYOUT, BufferVarianceMark$OFFSET, fieldValue);
    }

    private static final AddressLayout MaxCountArray$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("MaxCountArray"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long *MaxCountArray
     * }
     */
    public static final AddressLayout MaxCountArray$layout() {
        return MaxCountArray$LAYOUT;
    }

    private static final long MaxCountArray$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long *MaxCountArray
     * }
     */
    public static final long MaxCountArray$offset() {
        return MaxCountArray$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long *MaxCountArray
     * }
     */
    public static MemorySegment MaxCountArray(MemorySegment struct) {
        return struct.get(MaxCountArray$LAYOUT, MaxCountArray$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long *MaxCountArray
     * }
     */
    public static void MaxCountArray(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(MaxCountArray$LAYOUT, MaxCountArray$OFFSET, fieldValue);
    }

    private static final AddressLayout OffsetArray$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("OffsetArray"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long *OffsetArray
     * }
     */
    public static final AddressLayout OffsetArray$layout() {
        return OffsetArray$LAYOUT;
    }

    private static final long OffsetArray$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long *OffsetArray
     * }
     */
    public static final long OffsetArray$offset() {
        return OffsetArray$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long *OffsetArray
     * }
     */
    public static MemorySegment OffsetArray(MemorySegment struct) {
        return struct.get(OffsetArray$LAYOUT, OffsetArray$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long *OffsetArray
     * }
     */
    public static void OffsetArray(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(OffsetArray$LAYOUT, OffsetArray$OFFSET, fieldValue);
    }

    private static final AddressLayout ActualCountArray$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("ActualCountArray"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long *ActualCountArray
     * }
     */
    public static final AddressLayout ActualCountArray$layout() {
        return ActualCountArray$LAYOUT;
    }

    private static final long ActualCountArray$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long *ActualCountArray
     * }
     */
    public static final long ActualCountArray$offset() {
        return ActualCountArray$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long *ActualCountArray
     * }
     */
    public static MemorySegment ActualCountArray(MemorySegment struct) {
        return struct.get(ActualCountArray$LAYOUT, ActualCountArray$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long *ActualCountArray
     * }
     */
    public static void ActualCountArray(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ActualCountArray$LAYOUT, ActualCountArray$OFFSET, fieldValue);
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

