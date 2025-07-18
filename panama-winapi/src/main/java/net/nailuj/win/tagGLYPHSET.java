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
 * struct tagGLYPHSET {
 *     DWORD cbThis;
 *     DWORD flAccel;
 *     DWORD cGlyphsSupported;
 *     DWORD cRanges;
 *     WCRANGE ranges[1];
 * }
 * }
 */
public class tagGLYPHSET {

    tagGLYPHSET() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("cbThis"),
        winapi.C_LONG.withName("flAccel"),
        winapi.C_LONG.withName("cGlyphsSupported"),
        winapi.C_LONG.withName("cRanges"),
        MemoryLayout.sequenceLayout(1, tagWCRANGE.layout()).withName("ranges")
    ).withName("tagGLYPHSET");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cbThis$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbThis"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbThis
     * }
     */
    public static final OfInt cbThis$layout() {
        return cbThis$LAYOUT;
    }

    private static final long cbThis$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbThis
     * }
     */
    public static final long cbThis$offset() {
        return cbThis$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbThis
     * }
     */
    public static int cbThis(MemorySegment struct) {
        return struct.get(cbThis$LAYOUT, cbThis$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbThis
     * }
     */
    public static void cbThis(MemorySegment struct, int fieldValue) {
        struct.set(cbThis$LAYOUT, cbThis$OFFSET, fieldValue);
    }

    private static final OfInt flAccel$LAYOUT = (OfInt)$LAYOUT.select(groupElement("flAccel"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD flAccel
     * }
     */
    public static final OfInt flAccel$layout() {
        return flAccel$LAYOUT;
    }

    private static final long flAccel$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD flAccel
     * }
     */
    public static final long flAccel$offset() {
        return flAccel$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD flAccel
     * }
     */
    public static int flAccel(MemorySegment struct) {
        return struct.get(flAccel$LAYOUT, flAccel$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD flAccel
     * }
     */
    public static void flAccel(MemorySegment struct, int fieldValue) {
        struct.set(flAccel$LAYOUT, flAccel$OFFSET, fieldValue);
    }

    private static final OfInt cGlyphsSupported$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cGlyphsSupported"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cGlyphsSupported
     * }
     */
    public static final OfInt cGlyphsSupported$layout() {
        return cGlyphsSupported$LAYOUT;
    }

    private static final long cGlyphsSupported$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cGlyphsSupported
     * }
     */
    public static final long cGlyphsSupported$offset() {
        return cGlyphsSupported$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cGlyphsSupported
     * }
     */
    public static int cGlyphsSupported(MemorySegment struct) {
        return struct.get(cGlyphsSupported$LAYOUT, cGlyphsSupported$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cGlyphsSupported
     * }
     */
    public static void cGlyphsSupported(MemorySegment struct, int fieldValue) {
        struct.set(cGlyphsSupported$LAYOUT, cGlyphsSupported$OFFSET, fieldValue);
    }

    private static final OfInt cRanges$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cRanges"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cRanges
     * }
     */
    public static final OfInt cRanges$layout() {
        return cRanges$LAYOUT;
    }

    private static final long cRanges$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cRanges
     * }
     */
    public static final long cRanges$offset() {
        return cRanges$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cRanges
     * }
     */
    public static int cRanges(MemorySegment struct) {
        return struct.get(cRanges$LAYOUT, cRanges$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cRanges
     * }
     */
    public static void cRanges(MemorySegment struct, int fieldValue) {
        struct.set(cRanges$LAYOUT, cRanges$OFFSET, fieldValue);
    }

    private static final SequenceLayout ranges$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("ranges"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WCRANGE ranges[1]
     * }
     */
    public static final SequenceLayout ranges$layout() {
        return ranges$LAYOUT;
    }

    private static final long ranges$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WCRANGE ranges[1]
     * }
     */
    public static final long ranges$offset() {
        return ranges$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WCRANGE ranges[1]
     * }
     */
    public static MemorySegment ranges(MemorySegment struct) {
        return struct.asSlice(ranges$OFFSET, ranges$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WCRANGE ranges[1]
     * }
     */
    public static void ranges(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ranges$OFFSET, ranges$LAYOUT.byteSize());
    }

    private static long[] ranges$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * WCRANGE ranges[1]
     * }
     */
    public static long[] ranges$dimensions() {
        return ranges$DIMS;
    }
    private static final MethodHandle ranges$ELEM_HANDLE = ranges$LAYOUT.sliceHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * WCRANGE ranges[1]
     * }
     */
    public static MemorySegment ranges(MemorySegment struct, long index0) {
        try {
            return (MemorySegment)ranges$ELEM_HANDLE.invokeExact(struct, 0L, index0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * WCRANGE ranges[1]
     * }
     */
    public static void ranges(MemorySegment struct, long index0, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, ranges(struct, index0), 0L, tagWCRANGE.layout().byteSize());
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

