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
 * struct tagEMREXTESCAPE {
 *     EMR emr;
 *     INT iEscape;
 *     INT cbEscData;
 *     BYTE EscData[1];
 * }
 * }
 */
public class tagEMREXTESCAPE {

    tagEMREXTESCAPE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        tagEMR.layout().withName("emr"),
        winapi.C_INT.withName("iEscape"),
        winapi.C_INT.withName("cbEscData"),
        MemoryLayout.sequenceLayout(1, winapi.C_CHAR).withName("EscData"),
        MemoryLayout.paddingLayout(3)
    ).withName("tagEMREXTESCAPE");

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

    private static final OfInt iEscape$LAYOUT = (OfInt)$LAYOUT.select(groupElement("iEscape"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * INT iEscape
     * }
     */
    public static final OfInt iEscape$layout() {
        return iEscape$LAYOUT;
    }

    private static final long iEscape$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * INT iEscape
     * }
     */
    public static final long iEscape$offset() {
        return iEscape$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * INT iEscape
     * }
     */
    public static int iEscape(MemorySegment struct) {
        return struct.get(iEscape$LAYOUT, iEscape$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * INT iEscape
     * }
     */
    public static void iEscape(MemorySegment struct, int fieldValue) {
        struct.set(iEscape$LAYOUT, iEscape$OFFSET, fieldValue);
    }

    private static final OfInt cbEscData$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbEscData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * INT cbEscData
     * }
     */
    public static final OfInt cbEscData$layout() {
        return cbEscData$LAYOUT;
    }

    private static final long cbEscData$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * INT cbEscData
     * }
     */
    public static final long cbEscData$offset() {
        return cbEscData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * INT cbEscData
     * }
     */
    public static int cbEscData(MemorySegment struct) {
        return struct.get(cbEscData$LAYOUT, cbEscData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * INT cbEscData
     * }
     */
    public static void cbEscData(MemorySegment struct, int fieldValue) {
        struct.set(cbEscData$LAYOUT, cbEscData$OFFSET, fieldValue);
    }

    private static final SequenceLayout EscData$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("EscData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE EscData[1]
     * }
     */
    public static final SequenceLayout EscData$layout() {
        return EscData$LAYOUT;
    }

    private static final long EscData$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE EscData[1]
     * }
     */
    public static final long EscData$offset() {
        return EscData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE EscData[1]
     * }
     */
    public static MemorySegment EscData(MemorySegment struct) {
        return struct.asSlice(EscData$OFFSET, EscData$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE EscData[1]
     * }
     */
    public static void EscData(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, EscData$OFFSET, EscData$LAYOUT.byteSize());
    }

    private static long[] EscData$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE EscData[1]
     * }
     */
    public static long[] EscData$dimensions() {
        return EscData$DIMS;
    }
    private static final VarHandle EscData$ELEM_HANDLE = EscData$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE EscData[1]
     * }
     */
    public static byte EscData(MemorySegment struct, long index0) {
        return (byte)EscData$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE EscData[1]
     * }
     */
    public static void EscData(MemorySegment struct, long index0, byte fieldValue) {
        EscData$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

