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
 *     USN_RECORD_COMMON_HEADER Header;
 *     FILE_ID_128 FileReferenceNumber;
 *     FILE_ID_128 ParentFileReferenceNumber;
 *     USN Usn;
 *     DWORD Reason;
 *     DWORD SourceInfo;
 *     DWORD RemainingExtents;
 *     WORD NumberOfExtents;
 *     WORD ExtentSize;
 *     USN_RECORD_EXTENT Extents[1];
 * }
 * }
 */
public class USN_RECORD_V4 {

    USN_RECORD_V4() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        USN_RECORD_COMMON_HEADER.layout().withName("Header"),
        _FILE_ID_128.layout().withName("FileReferenceNumber"),
        _FILE_ID_128.layout().withName("ParentFileReferenceNumber"),
        winapi.C_LONG_LONG.withName("Usn"),
        winapi.C_LONG.withName("Reason"),
        winapi.C_LONG.withName("SourceInfo"),
        winapi.C_LONG.withName("RemainingExtents"),
        winapi.C_SHORT.withName("NumberOfExtents"),
        winapi.C_SHORT.withName("ExtentSize"),
        MemoryLayout.sequenceLayout(1, USN_RECORD_EXTENT.layout()).withName("Extents")
    ).withName("$anon$12076:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout Header$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Header"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * USN_RECORD_COMMON_HEADER Header
     * }
     */
    public static final GroupLayout Header$layout() {
        return Header$LAYOUT;
    }

    private static final long Header$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * USN_RECORD_COMMON_HEADER Header
     * }
     */
    public static final long Header$offset() {
        return Header$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * USN_RECORD_COMMON_HEADER Header
     * }
     */
    public static MemorySegment Header(MemorySegment struct) {
        return struct.asSlice(Header$OFFSET, Header$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * USN_RECORD_COMMON_HEADER Header
     * }
     */
    public static void Header(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Header$OFFSET, Header$LAYOUT.byteSize());
    }

    private static final GroupLayout FileReferenceNumber$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("FileReferenceNumber"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FILE_ID_128 FileReferenceNumber
     * }
     */
    public static final GroupLayout FileReferenceNumber$layout() {
        return FileReferenceNumber$LAYOUT;
    }

    private static final long FileReferenceNumber$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FILE_ID_128 FileReferenceNumber
     * }
     */
    public static final long FileReferenceNumber$offset() {
        return FileReferenceNumber$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FILE_ID_128 FileReferenceNumber
     * }
     */
    public static MemorySegment FileReferenceNumber(MemorySegment struct) {
        return struct.asSlice(FileReferenceNumber$OFFSET, FileReferenceNumber$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FILE_ID_128 FileReferenceNumber
     * }
     */
    public static void FileReferenceNumber(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, FileReferenceNumber$OFFSET, FileReferenceNumber$LAYOUT.byteSize());
    }

    private static final GroupLayout ParentFileReferenceNumber$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ParentFileReferenceNumber"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FILE_ID_128 ParentFileReferenceNumber
     * }
     */
    public static final GroupLayout ParentFileReferenceNumber$layout() {
        return ParentFileReferenceNumber$LAYOUT;
    }

    private static final long ParentFileReferenceNumber$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FILE_ID_128 ParentFileReferenceNumber
     * }
     */
    public static final long ParentFileReferenceNumber$offset() {
        return ParentFileReferenceNumber$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FILE_ID_128 ParentFileReferenceNumber
     * }
     */
    public static MemorySegment ParentFileReferenceNumber(MemorySegment struct) {
        return struct.asSlice(ParentFileReferenceNumber$OFFSET, ParentFileReferenceNumber$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FILE_ID_128 ParentFileReferenceNumber
     * }
     */
    public static void ParentFileReferenceNumber(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ParentFileReferenceNumber$OFFSET, ParentFileReferenceNumber$LAYOUT.byteSize());
    }

    private static final OfLong Usn$LAYOUT = (OfLong)$LAYOUT.select(groupElement("Usn"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * USN Usn
     * }
     */
    public static final OfLong Usn$layout() {
        return Usn$LAYOUT;
    }

    private static final long Usn$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * USN Usn
     * }
     */
    public static final long Usn$offset() {
        return Usn$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * USN Usn
     * }
     */
    public static long Usn(MemorySegment struct) {
        return struct.get(Usn$LAYOUT, Usn$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * USN Usn
     * }
     */
    public static void Usn(MemorySegment struct, long fieldValue) {
        struct.set(Usn$LAYOUT, Usn$OFFSET, fieldValue);
    }

    private static final OfInt Reason$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Reason"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Reason
     * }
     */
    public static final OfInt Reason$layout() {
        return Reason$LAYOUT;
    }

    private static final long Reason$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Reason
     * }
     */
    public static final long Reason$offset() {
        return Reason$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Reason
     * }
     */
    public static int Reason(MemorySegment struct) {
        return struct.get(Reason$LAYOUT, Reason$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Reason
     * }
     */
    public static void Reason(MemorySegment struct, int fieldValue) {
        struct.set(Reason$LAYOUT, Reason$OFFSET, fieldValue);
    }

    private static final OfInt SourceInfo$LAYOUT = (OfInt)$LAYOUT.select(groupElement("SourceInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD SourceInfo
     * }
     */
    public static final OfInt SourceInfo$layout() {
        return SourceInfo$LAYOUT;
    }

    private static final long SourceInfo$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD SourceInfo
     * }
     */
    public static final long SourceInfo$offset() {
        return SourceInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD SourceInfo
     * }
     */
    public static int SourceInfo(MemorySegment struct) {
        return struct.get(SourceInfo$LAYOUT, SourceInfo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD SourceInfo
     * }
     */
    public static void SourceInfo(MemorySegment struct, int fieldValue) {
        struct.set(SourceInfo$LAYOUT, SourceInfo$OFFSET, fieldValue);
    }

    private static final OfInt RemainingExtents$LAYOUT = (OfInt)$LAYOUT.select(groupElement("RemainingExtents"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD RemainingExtents
     * }
     */
    public static final OfInt RemainingExtents$layout() {
        return RemainingExtents$LAYOUT;
    }

    private static final long RemainingExtents$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD RemainingExtents
     * }
     */
    public static final long RemainingExtents$offset() {
        return RemainingExtents$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD RemainingExtents
     * }
     */
    public static int RemainingExtents(MemorySegment struct) {
        return struct.get(RemainingExtents$LAYOUT, RemainingExtents$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD RemainingExtents
     * }
     */
    public static void RemainingExtents(MemorySegment struct, int fieldValue) {
        struct.set(RemainingExtents$LAYOUT, RemainingExtents$OFFSET, fieldValue);
    }

    private static final OfShort NumberOfExtents$LAYOUT = (OfShort)$LAYOUT.select(groupElement("NumberOfExtents"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD NumberOfExtents
     * }
     */
    public static final OfShort NumberOfExtents$layout() {
        return NumberOfExtents$LAYOUT;
    }

    private static final long NumberOfExtents$OFFSET = 60;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD NumberOfExtents
     * }
     */
    public static final long NumberOfExtents$offset() {
        return NumberOfExtents$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD NumberOfExtents
     * }
     */
    public static short NumberOfExtents(MemorySegment struct) {
        return struct.get(NumberOfExtents$LAYOUT, NumberOfExtents$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD NumberOfExtents
     * }
     */
    public static void NumberOfExtents(MemorySegment struct, short fieldValue) {
        struct.set(NumberOfExtents$LAYOUT, NumberOfExtents$OFFSET, fieldValue);
    }

    private static final OfShort ExtentSize$LAYOUT = (OfShort)$LAYOUT.select(groupElement("ExtentSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD ExtentSize
     * }
     */
    public static final OfShort ExtentSize$layout() {
        return ExtentSize$LAYOUT;
    }

    private static final long ExtentSize$OFFSET = 62;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD ExtentSize
     * }
     */
    public static final long ExtentSize$offset() {
        return ExtentSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD ExtentSize
     * }
     */
    public static short ExtentSize(MemorySegment struct) {
        return struct.get(ExtentSize$LAYOUT, ExtentSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD ExtentSize
     * }
     */
    public static void ExtentSize(MemorySegment struct, short fieldValue) {
        struct.set(ExtentSize$LAYOUT, ExtentSize$OFFSET, fieldValue);
    }

    private static final SequenceLayout Extents$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Extents"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * USN_RECORD_EXTENT Extents[1]
     * }
     */
    public static final SequenceLayout Extents$layout() {
        return Extents$LAYOUT;
    }

    private static final long Extents$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * USN_RECORD_EXTENT Extents[1]
     * }
     */
    public static final long Extents$offset() {
        return Extents$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * USN_RECORD_EXTENT Extents[1]
     * }
     */
    public static MemorySegment Extents(MemorySegment struct) {
        return struct.asSlice(Extents$OFFSET, Extents$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * USN_RECORD_EXTENT Extents[1]
     * }
     */
    public static void Extents(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Extents$OFFSET, Extents$LAYOUT.byteSize());
    }

    private static long[] Extents$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * USN_RECORD_EXTENT Extents[1]
     * }
     */
    public static long[] Extents$dimensions() {
        return Extents$DIMS;
    }
    private static final MethodHandle Extents$ELEM_HANDLE = Extents$LAYOUT.sliceHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * USN_RECORD_EXTENT Extents[1]
     * }
     */
    public static MemorySegment Extents(MemorySegment struct, long index0) {
        try {
            return (MemorySegment)Extents$ELEM_HANDLE.invokeExact(struct, 0L, index0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * USN_RECORD_EXTENT Extents[1]
     * }
     */
    public static void Extents(MemorySegment struct, long index0, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, Extents(struct, index0), 0L, USN_RECORD_EXTENT.layout().byteSize());
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

