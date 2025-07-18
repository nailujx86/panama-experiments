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
 * struct _WOW64_FLOATING_SAVE_AREA {
 *     DWORD ControlWord;
 *     DWORD StatusWord;
 *     DWORD TagWord;
 *     DWORD ErrorOffset;
 *     DWORD ErrorSelector;
 *     DWORD DataOffset;
 *     DWORD DataSelector;
 *     BYTE RegisterArea[80];
 *     DWORD Cr0NpxState;
 * }
 * }
 */
public class _WOW64_FLOATING_SAVE_AREA {

    _WOW64_FLOATING_SAVE_AREA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("ControlWord"),
        winapi.C_LONG.withName("StatusWord"),
        winapi.C_LONG.withName("TagWord"),
        winapi.C_LONG.withName("ErrorOffset"),
        winapi.C_LONG.withName("ErrorSelector"),
        winapi.C_LONG.withName("DataOffset"),
        winapi.C_LONG.withName("DataSelector"),
        MemoryLayout.sequenceLayout(80, winapi.C_CHAR).withName("RegisterArea"),
        winapi.C_LONG.withName("Cr0NpxState")
    ).withName("_WOW64_FLOATING_SAVE_AREA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt ControlWord$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ControlWord"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ControlWord
     * }
     */
    public static final OfInt ControlWord$layout() {
        return ControlWord$LAYOUT;
    }

    private static final long ControlWord$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ControlWord
     * }
     */
    public static final long ControlWord$offset() {
        return ControlWord$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ControlWord
     * }
     */
    public static int ControlWord(MemorySegment struct) {
        return struct.get(ControlWord$LAYOUT, ControlWord$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ControlWord
     * }
     */
    public static void ControlWord(MemorySegment struct, int fieldValue) {
        struct.set(ControlWord$LAYOUT, ControlWord$OFFSET, fieldValue);
    }

    private static final OfInt StatusWord$LAYOUT = (OfInt)$LAYOUT.select(groupElement("StatusWord"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD StatusWord
     * }
     */
    public static final OfInt StatusWord$layout() {
        return StatusWord$LAYOUT;
    }

    private static final long StatusWord$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD StatusWord
     * }
     */
    public static final long StatusWord$offset() {
        return StatusWord$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD StatusWord
     * }
     */
    public static int StatusWord(MemorySegment struct) {
        return struct.get(StatusWord$LAYOUT, StatusWord$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD StatusWord
     * }
     */
    public static void StatusWord(MemorySegment struct, int fieldValue) {
        struct.set(StatusWord$LAYOUT, StatusWord$OFFSET, fieldValue);
    }

    private static final OfInt TagWord$LAYOUT = (OfInt)$LAYOUT.select(groupElement("TagWord"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD TagWord
     * }
     */
    public static final OfInt TagWord$layout() {
        return TagWord$LAYOUT;
    }

    private static final long TagWord$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD TagWord
     * }
     */
    public static final long TagWord$offset() {
        return TagWord$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD TagWord
     * }
     */
    public static int TagWord(MemorySegment struct) {
        return struct.get(TagWord$LAYOUT, TagWord$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD TagWord
     * }
     */
    public static void TagWord(MemorySegment struct, int fieldValue) {
        struct.set(TagWord$LAYOUT, TagWord$OFFSET, fieldValue);
    }

    private static final OfInt ErrorOffset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ErrorOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ErrorOffset
     * }
     */
    public static final OfInt ErrorOffset$layout() {
        return ErrorOffset$LAYOUT;
    }

    private static final long ErrorOffset$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ErrorOffset
     * }
     */
    public static final long ErrorOffset$offset() {
        return ErrorOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ErrorOffset
     * }
     */
    public static int ErrorOffset(MemorySegment struct) {
        return struct.get(ErrorOffset$LAYOUT, ErrorOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ErrorOffset
     * }
     */
    public static void ErrorOffset(MemorySegment struct, int fieldValue) {
        struct.set(ErrorOffset$LAYOUT, ErrorOffset$OFFSET, fieldValue);
    }

    private static final OfInt ErrorSelector$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ErrorSelector"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ErrorSelector
     * }
     */
    public static final OfInt ErrorSelector$layout() {
        return ErrorSelector$LAYOUT;
    }

    private static final long ErrorSelector$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ErrorSelector
     * }
     */
    public static final long ErrorSelector$offset() {
        return ErrorSelector$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ErrorSelector
     * }
     */
    public static int ErrorSelector(MemorySegment struct) {
        return struct.get(ErrorSelector$LAYOUT, ErrorSelector$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ErrorSelector
     * }
     */
    public static void ErrorSelector(MemorySegment struct, int fieldValue) {
        struct.set(ErrorSelector$LAYOUT, ErrorSelector$OFFSET, fieldValue);
    }

    private static final OfInt DataOffset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("DataOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD DataOffset
     * }
     */
    public static final OfInt DataOffset$layout() {
        return DataOffset$LAYOUT;
    }

    private static final long DataOffset$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD DataOffset
     * }
     */
    public static final long DataOffset$offset() {
        return DataOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD DataOffset
     * }
     */
    public static int DataOffset(MemorySegment struct) {
        return struct.get(DataOffset$LAYOUT, DataOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD DataOffset
     * }
     */
    public static void DataOffset(MemorySegment struct, int fieldValue) {
        struct.set(DataOffset$LAYOUT, DataOffset$OFFSET, fieldValue);
    }

    private static final OfInt DataSelector$LAYOUT = (OfInt)$LAYOUT.select(groupElement("DataSelector"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD DataSelector
     * }
     */
    public static final OfInt DataSelector$layout() {
        return DataSelector$LAYOUT;
    }

    private static final long DataSelector$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD DataSelector
     * }
     */
    public static final long DataSelector$offset() {
        return DataSelector$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD DataSelector
     * }
     */
    public static int DataSelector(MemorySegment struct) {
        return struct.get(DataSelector$LAYOUT, DataSelector$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD DataSelector
     * }
     */
    public static void DataSelector(MemorySegment struct, int fieldValue) {
        struct.set(DataSelector$LAYOUT, DataSelector$OFFSET, fieldValue);
    }

    private static final SequenceLayout RegisterArea$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("RegisterArea"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE RegisterArea[80]
     * }
     */
    public static final SequenceLayout RegisterArea$layout() {
        return RegisterArea$LAYOUT;
    }

    private static final long RegisterArea$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE RegisterArea[80]
     * }
     */
    public static final long RegisterArea$offset() {
        return RegisterArea$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE RegisterArea[80]
     * }
     */
    public static MemorySegment RegisterArea(MemorySegment struct) {
        return struct.asSlice(RegisterArea$OFFSET, RegisterArea$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE RegisterArea[80]
     * }
     */
    public static void RegisterArea(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, RegisterArea$OFFSET, RegisterArea$LAYOUT.byteSize());
    }

    private static long[] RegisterArea$DIMS = { 80 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE RegisterArea[80]
     * }
     */
    public static long[] RegisterArea$dimensions() {
        return RegisterArea$DIMS;
    }
    private static final VarHandle RegisterArea$ELEM_HANDLE = RegisterArea$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE RegisterArea[80]
     * }
     */
    public static byte RegisterArea(MemorySegment struct, long index0) {
        return (byte)RegisterArea$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE RegisterArea[80]
     * }
     */
    public static void RegisterArea(MemorySegment struct, long index0, byte fieldValue) {
        RegisterArea$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfInt Cr0NpxState$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Cr0NpxState"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Cr0NpxState
     * }
     */
    public static final OfInt Cr0NpxState$layout() {
        return Cr0NpxState$LAYOUT;
    }

    private static final long Cr0NpxState$OFFSET = 108;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Cr0NpxState
     * }
     */
    public static final long Cr0NpxState$offset() {
        return Cr0NpxState$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Cr0NpxState
     * }
     */
    public static int Cr0NpxState(MemorySegment struct) {
        return struct.get(Cr0NpxState$LAYOUT, Cr0NpxState$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Cr0NpxState
     * }
     */
    public static void Cr0NpxState(MemorySegment struct, int fieldValue) {
        struct.set(Cr0NpxState$LAYOUT, Cr0NpxState$OFFSET, fieldValue);
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

