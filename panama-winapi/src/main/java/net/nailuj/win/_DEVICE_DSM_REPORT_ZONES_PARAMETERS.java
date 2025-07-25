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
 * struct _DEVICE_DSM_REPORT_ZONES_PARAMETERS {
 *     DWORD Size;
 *     BYTE ReportOption;
 *     BYTE Partial;
 *     BYTE Reserved[2];
 * }
 * }
 */
public class _DEVICE_DSM_REPORT_ZONES_PARAMETERS {

    _DEVICE_DSM_REPORT_ZONES_PARAMETERS() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("Size"),
        winapi.C_CHAR.withName("ReportOption"),
        winapi.C_CHAR.withName("Partial"),
        MemoryLayout.sequenceLayout(2, winapi.C_CHAR).withName("Reserved")
    ).withName("_DEVICE_DSM_REPORT_ZONES_PARAMETERS");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
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

    private static final long Size$OFFSET = 0;

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

    private static final OfByte ReportOption$LAYOUT = (OfByte)$LAYOUT.select(groupElement("ReportOption"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE ReportOption
     * }
     */
    public static final OfByte ReportOption$layout() {
        return ReportOption$LAYOUT;
    }

    private static final long ReportOption$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE ReportOption
     * }
     */
    public static final long ReportOption$offset() {
        return ReportOption$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE ReportOption
     * }
     */
    public static byte ReportOption(MemorySegment struct) {
        return struct.get(ReportOption$LAYOUT, ReportOption$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE ReportOption
     * }
     */
    public static void ReportOption(MemorySegment struct, byte fieldValue) {
        struct.set(ReportOption$LAYOUT, ReportOption$OFFSET, fieldValue);
    }

    private static final OfByte Partial$LAYOUT = (OfByte)$LAYOUT.select(groupElement("Partial"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Partial
     * }
     */
    public static final OfByte Partial$layout() {
        return Partial$LAYOUT;
    }

    private static final long Partial$OFFSET = 5;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Partial
     * }
     */
    public static final long Partial$offset() {
        return Partial$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Partial
     * }
     */
    public static byte Partial(MemorySegment struct) {
        return struct.get(Partial$LAYOUT, Partial$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Partial
     * }
     */
    public static void Partial(MemorySegment struct, byte fieldValue) {
        struct.set(Partial$LAYOUT, Partial$OFFSET, fieldValue);
    }

    private static final SequenceLayout Reserved$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Reserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Reserved[2]
     * }
     */
    public static final SequenceLayout Reserved$layout() {
        return Reserved$LAYOUT;
    }

    private static final long Reserved$OFFSET = 6;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Reserved[2]
     * }
     */
    public static final long Reserved$offset() {
        return Reserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Reserved[2]
     * }
     */
    public static MemorySegment Reserved(MemorySegment struct) {
        return struct.asSlice(Reserved$OFFSET, Reserved$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Reserved[2]
     * }
     */
    public static void Reserved(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Reserved$OFFSET, Reserved$LAYOUT.byteSize());
    }

    private static long[] Reserved$DIMS = { 2 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE Reserved[2]
     * }
     */
    public static long[] Reserved$dimensions() {
        return Reserved$DIMS;
    }
    private static final VarHandle Reserved$ELEM_HANDLE = Reserved$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE Reserved[2]
     * }
     */
    public static byte Reserved(MemorySegment struct, long index0) {
        return (byte)Reserved$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE Reserved[2]
     * }
     */
    public static void Reserved(MemorySegment struct, long index0, byte fieldValue) {
        Reserved$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

