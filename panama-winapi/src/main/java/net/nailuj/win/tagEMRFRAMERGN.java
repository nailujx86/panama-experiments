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
 * struct tagEMRFRAMERGN {
 *     EMR emr;
 *     RECTL rclBounds;
 *     DWORD cbRgnData;
 *     DWORD ihBrush;
 *     SIZEL szlStroke;
 *     BYTE RgnData[1];
 * }
 * }
 */
public class tagEMRFRAMERGN {

    tagEMRFRAMERGN() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        tagEMR.layout().withName("emr"),
        _RECTL.layout().withName("rclBounds"),
        winapi.C_LONG.withName("cbRgnData"),
        winapi.C_LONG.withName("ihBrush"),
        tagSIZE.layout().withName("szlStroke"),
        MemoryLayout.sequenceLayout(1, winapi.C_CHAR).withName("RgnData"),
        MemoryLayout.paddingLayout(3)
    ).withName("tagEMRFRAMERGN");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout emr$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("emr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * EMR emr
     * }
     */
    public static final GroupLayout emr$layout() {
        return emr$LAYOUT;
    }

    private static final long emr$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * EMR emr
     * }
     */
    public static final long emr$offset() {
        return emr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * EMR emr
     * }
     */
    public static MemorySegment emr(MemorySegment struct) {
        return struct.asSlice(emr$OFFSET, emr$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * EMR emr
     * }
     */
    public static void emr(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, emr$OFFSET, emr$LAYOUT.byteSize());
    }

    private static final GroupLayout rclBounds$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("rclBounds"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RECTL rclBounds
     * }
     */
    public static final GroupLayout rclBounds$layout() {
        return rclBounds$LAYOUT;
    }

    private static final long rclBounds$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RECTL rclBounds
     * }
     */
    public static final long rclBounds$offset() {
        return rclBounds$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RECTL rclBounds
     * }
     */
    public static MemorySegment rclBounds(MemorySegment struct) {
        return struct.asSlice(rclBounds$OFFSET, rclBounds$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RECTL rclBounds
     * }
     */
    public static void rclBounds(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, rclBounds$OFFSET, rclBounds$LAYOUT.byteSize());
    }

    private static final OfInt cbRgnData$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbRgnData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbRgnData
     * }
     */
    public static final OfInt cbRgnData$layout() {
        return cbRgnData$LAYOUT;
    }

    private static final long cbRgnData$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbRgnData
     * }
     */
    public static final long cbRgnData$offset() {
        return cbRgnData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbRgnData
     * }
     */
    public static int cbRgnData(MemorySegment struct) {
        return struct.get(cbRgnData$LAYOUT, cbRgnData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbRgnData
     * }
     */
    public static void cbRgnData(MemorySegment struct, int fieldValue) {
        struct.set(cbRgnData$LAYOUT, cbRgnData$OFFSET, fieldValue);
    }

    private static final OfInt ihBrush$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ihBrush"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ihBrush
     * }
     */
    public static final OfInt ihBrush$layout() {
        return ihBrush$LAYOUT;
    }

    private static final long ihBrush$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ihBrush
     * }
     */
    public static final long ihBrush$offset() {
        return ihBrush$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ihBrush
     * }
     */
    public static int ihBrush(MemorySegment struct) {
        return struct.get(ihBrush$LAYOUT, ihBrush$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ihBrush
     * }
     */
    public static void ihBrush(MemorySegment struct, int fieldValue) {
        struct.set(ihBrush$LAYOUT, ihBrush$OFFSET, fieldValue);
    }

    private static final GroupLayout szlStroke$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("szlStroke"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SIZEL szlStroke
     * }
     */
    public static final GroupLayout szlStroke$layout() {
        return szlStroke$LAYOUT;
    }

    private static final long szlStroke$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SIZEL szlStroke
     * }
     */
    public static final long szlStroke$offset() {
        return szlStroke$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SIZEL szlStroke
     * }
     */
    public static MemorySegment szlStroke(MemorySegment struct) {
        return struct.asSlice(szlStroke$OFFSET, szlStroke$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SIZEL szlStroke
     * }
     */
    public static void szlStroke(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, szlStroke$OFFSET, szlStroke$LAYOUT.byteSize());
    }

    private static final SequenceLayout RgnData$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("RgnData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE RgnData[1]
     * }
     */
    public static final SequenceLayout RgnData$layout() {
        return RgnData$LAYOUT;
    }

    private static final long RgnData$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE RgnData[1]
     * }
     */
    public static final long RgnData$offset() {
        return RgnData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE RgnData[1]
     * }
     */
    public static MemorySegment RgnData(MemorySegment struct) {
        return struct.asSlice(RgnData$OFFSET, RgnData$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE RgnData[1]
     * }
     */
    public static void RgnData(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, RgnData$OFFSET, RgnData$LAYOUT.byteSize());
    }

    private static long[] RgnData$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE RgnData[1]
     * }
     */
    public static long[] RgnData$dimensions() {
        return RgnData$DIMS;
    }
    private static final VarHandle RgnData$ELEM_HANDLE = RgnData$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE RgnData[1]
     * }
     */
    public static byte RgnData(MemorySegment struct, long index0) {
        return (byte)RgnData$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE RgnData[1]
     * }
     */
    public static void RgnData(MemorySegment struct, long index0, byte fieldValue) {
        RgnData$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

