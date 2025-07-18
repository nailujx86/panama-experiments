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
 * struct _wireSAFEARRAY {
 *     USHORT cDims;
 *     USHORT fFeatures;
 *     ULONG cbElements;
 *     ULONG cLocks;
 *     SAFEARRAYUNION uArrayStructs;
 *     SAFEARRAYBOUND rgsabound[1];
 * }
 * }
 */
public class _wireSAFEARRAY {

    _wireSAFEARRAY() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_SHORT.withName("cDims"),
        winapi.C_SHORT.withName("fFeatures"),
        winapi.C_LONG.withName("cbElements"),
        winapi.C_LONG.withName("cLocks"),
        MemoryLayout.paddingLayout(4),
        _wireSAFEARRAY_UNION.layout().withName("uArrayStructs"),
        MemoryLayout.sequenceLayout(1, tagSAFEARRAYBOUND.layout()).withName("rgsabound")
    ).withName("_wireSAFEARRAY");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort cDims$LAYOUT = (OfShort)$LAYOUT.select(groupElement("cDims"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * USHORT cDims
     * }
     */
    public static final OfShort cDims$layout() {
        return cDims$LAYOUT;
    }

    private static final long cDims$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * USHORT cDims
     * }
     */
    public static final long cDims$offset() {
        return cDims$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * USHORT cDims
     * }
     */
    public static short cDims(MemorySegment struct) {
        return struct.get(cDims$LAYOUT, cDims$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * USHORT cDims
     * }
     */
    public static void cDims(MemorySegment struct, short fieldValue) {
        struct.set(cDims$LAYOUT, cDims$OFFSET, fieldValue);
    }

    private static final OfShort fFeatures$LAYOUT = (OfShort)$LAYOUT.select(groupElement("fFeatures"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * USHORT fFeatures
     * }
     */
    public static final OfShort fFeatures$layout() {
        return fFeatures$LAYOUT;
    }

    private static final long fFeatures$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * USHORT fFeatures
     * }
     */
    public static final long fFeatures$offset() {
        return fFeatures$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * USHORT fFeatures
     * }
     */
    public static short fFeatures(MemorySegment struct) {
        return struct.get(fFeatures$LAYOUT, fFeatures$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * USHORT fFeatures
     * }
     */
    public static void fFeatures(MemorySegment struct, short fieldValue) {
        struct.set(fFeatures$LAYOUT, fFeatures$OFFSET, fieldValue);
    }

    private static final OfInt cbElements$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbElements"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG cbElements
     * }
     */
    public static final OfInt cbElements$layout() {
        return cbElements$LAYOUT;
    }

    private static final long cbElements$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG cbElements
     * }
     */
    public static final long cbElements$offset() {
        return cbElements$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG cbElements
     * }
     */
    public static int cbElements(MemorySegment struct) {
        return struct.get(cbElements$LAYOUT, cbElements$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG cbElements
     * }
     */
    public static void cbElements(MemorySegment struct, int fieldValue) {
        struct.set(cbElements$LAYOUT, cbElements$OFFSET, fieldValue);
    }

    private static final OfInt cLocks$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cLocks"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG cLocks
     * }
     */
    public static final OfInt cLocks$layout() {
        return cLocks$LAYOUT;
    }

    private static final long cLocks$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG cLocks
     * }
     */
    public static final long cLocks$offset() {
        return cLocks$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG cLocks
     * }
     */
    public static int cLocks(MemorySegment struct) {
        return struct.get(cLocks$LAYOUT, cLocks$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG cLocks
     * }
     */
    public static void cLocks(MemorySegment struct, int fieldValue) {
        struct.set(cLocks$LAYOUT, cLocks$OFFSET, fieldValue);
    }

    private static final GroupLayout uArrayStructs$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("uArrayStructs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SAFEARRAYUNION uArrayStructs
     * }
     */
    public static final GroupLayout uArrayStructs$layout() {
        return uArrayStructs$LAYOUT;
    }

    private static final long uArrayStructs$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SAFEARRAYUNION uArrayStructs
     * }
     */
    public static final long uArrayStructs$offset() {
        return uArrayStructs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SAFEARRAYUNION uArrayStructs
     * }
     */
    public static MemorySegment uArrayStructs(MemorySegment struct) {
        return struct.asSlice(uArrayStructs$OFFSET, uArrayStructs$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SAFEARRAYUNION uArrayStructs
     * }
     */
    public static void uArrayStructs(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, uArrayStructs$OFFSET, uArrayStructs$LAYOUT.byteSize());
    }

    private static final SequenceLayout rgsabound$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("rgsabound"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SAFEARRAYBOUND rgsabound[1]
     * }
     */
    public static final SequenceLayout rgsabound$layout() {
        return rgsabound$LAYOUT;
    }

    private static final long rgsabound$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SAFEARRAYBOUND rgsabound[1]
     * }
     */
    public static final long rgsabound$offset() {
        return rgsabound$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SAFEARRAYBOUND rgsabound[1]
     * }
     */
    public static MemorySegment rgsabound(MemorySegment struct) {
        return struct.asSlice(rgsabound$OFFSET, rgsabound$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SAFEARRAYBOUND rgsabound[1]
     * }
     */
    public static void rgsabound(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, rgsabound$OFFSET, rgsabound$LAYOUT.byteSize());
    }

    private static long[] rgsabound$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * SAFEARRAYBOUND rgsabound[1]
     * }
     */
    public static long[] rgsabound$dimensions() {
        return rgsabound$DIMS;
    }
    private static final MethodHandle rgsabound$ELEM_HANDLE = rgsabound$LAYOUT.sliceHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * SAFEARRAYBOUND rgsabound[1]
     * }
     */
    public static MemorySegment rgsabound(MemorySegment struct, long index0) {
        try {
            return (MemorySegment)rgsabound$ELEM_HANDLE.invokeExact(struct, 0L, index0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * SAFEARRAYBOUND rgsabound[1]
     * }
     */
    public static void rgsabound(MemorySegment struct, long index0, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, rgsabound(struct, index0), 0L, tagSAFEARRAYBOUND.layout().byteSize());
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

