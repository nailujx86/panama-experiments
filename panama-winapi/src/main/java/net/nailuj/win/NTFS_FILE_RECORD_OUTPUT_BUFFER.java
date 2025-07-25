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
 *     LARGE_INTEGER FileReferenceNumber;
 *     DWORD FileRecordLength;
 *     BYTE FileRecordBuffer[1];
 * }
 * }
 */
public class NTFS_FILE_RECORD_OUTPUT_BUFFER {

    NTFS_FILE_RECORD_OUTPUT_BUFFER() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _LARGE_INTEGER.layout().withName("FileReferenceNumber"),
        winapi.C_LONG.withName("FileRecordLength"),
        MemoryLayout.sequenceLayout(1, winapi.C_CHAR).withName("FileRecordBuffer"),
        MemoryLayout.paddingLayout(3)
    ).withName("$anon$11813:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout FileReferenceNumber$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("FileReferenceNumber"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER FileReferenceNumber
     * }
     */
    public static final GroupLayout FileReferenceNumber$layout() {
        return FileReferenceNumber$LAYOUT;
    }

    private static final long FileReferenceNumber$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER FileReferenceNumber
     * }
     */
    public static final long FileReferenceNumber$offset() {
        return FileReferenceNumber$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER FileReferenceNumber
     * }
     */
    public static MemorySegment FileReferenceNumber(MemorySegment struct) {
        return struct.asSlice(FileReferenceNumber$OFFSET, FileReferenceNumber$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER FileReferenceNumber
     * }
     */
    public static void FileReferenceNumber(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, FileReferenceNumber$OFFSET, FileReferenceNumber$LAYOUT.byteSize());
    }

    private static final OfInt FileRecordLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("FileRecordLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD FileRecordLength
     * }
     */
    public static final OfInt FileRecordLength$layout() {
        return FileRecordLength$LAYOUT;
    }

    private static final long FileRecordLength$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD FileRecordLength
     * }
     */
    public static final long FileRecordLength$offset() {
        return FileRecordLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD FileRecordLength
     * }
     */
    public static int FileRecordLength(MemorySegment struct) {
        return struct.get(FileRecordLength$LAYOUT, FileRecordLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD FileRecordLength
     * }
     */
    public static void FileRecordLength(MemorySegment struct, int fieldValue) {
        struct.set(FileRecordLength$LAYOUT, FileRecordLength$OFFSET, fieldValue);
    }

    private static final SequenceLayout FileRecordBuffer$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("FileRecordBuffer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE FileRecordBuffer[1]
     * }
     */
    public static final SequenceLayout FileRecordBuffer$layout() {
        return FileRecordBuffer$LAYOUT;
    }

    private static final long FileRecordBuffer$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE FileRecordBuffer[1]
     * }
     */
    public static final long FileRecordBuffer$offset() {
        return FileRecordBuffer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE FileRecordBuffer[1]
     * }
     */
    public static MemorySegment FileRecordBuffer(MemorySegment struct) {
        return struct.asSlice(FileRecordBuffer$OFFSET, FileRecordBuffer$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE FileRecordBuffer[1]
     * }
     */
    public static void FileRecordBuffer(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, FileRecordBuffer$OFFSET, FileRecordBuffer$LAYOUT.byteSize());
    }

    private static long[] FileRecordBuffer$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE FileRecordBuffer[1]
     * }
     */
    public static long[] FileRecordBuffer$dimensions() {
        return FileRecordBuffer$DIMS;
    }
    private static final VarHandle FileRecordBuffer$ELEM_HANDLE = FileRecordBuffer$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE FileRecordBuffer[1]
     * }
     */
    public static byte FileRecordBuffer(MemorySegment struct, long index0) {
        return (byte)FileRecordBuffer$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE FileRecordBuffer[1]
     * }
     */
    public static void FileRecordBuffer(MemorySegment struct, long index0, byte fieldValue) {
        FileRecordBuffer$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

