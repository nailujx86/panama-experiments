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
 * struct _FILE_STREAM_INFO {
 *     DWORD NextEntryOffset;
 *     DWORD StreamNameLength;
 *     LARGE_INTEGER StreamSize;
 *     LARGE_INTEGER StreamAllocationSize;
 *     WCHAR StreamName[1];
 * }
 * }
 */
public class _FILE_STREAM_INFO {

    _FILE_STREAM_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("NextEntryOffset"),
        winapi.C_LONG.withName("StreamNameLength"),
        _LARGE_INTEGER.layout().withName("StreamSize"),
        _LARGE_INTEGER.layout().withName("StreamAllocationSize"),
        MemoryLayout.sequenceLayout(1, winapi.C_SHORT).withName("StreamName"),
        MemoryLayout.paddingLayout(6)
    ).withName("_FILE_STREAM_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt NextEntryOffset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("NextEntryOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD NextEntryOffset
     * }
     */
    public static final OfInt NextEntryOffset$layout() {
        return NextEntryOffset$LAYOUT;
    }

    private static final long NextEntryOffset$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD NextEntryOffset
     * }
     */
    public static final long NextEntryOffset$offset() {
        return NextEntryOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD NextEntryOffset
     * }
     */
    public static int NextEntryOffset(MemorySegment struct) {
        return struct.get(NextEntryOffset$LAYOUT, NextEntryOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD NextEntryOffset
     * }
     */
    public static void NextEntryOffset(MemorySegment struct, int fieldValue) {
        struct.set(NextEntryOffset$LAYOUT, NextEntryOffset$OFFSET, fieldValue);
    }

    private static final OfInt StreamNameLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("StreamNameLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD StreamNameLength
     * }
     */
    public static final OfInt StreamNameLength$layout() {
        return StreamNameLength$LAYOUT;
    }

    private static final long StreamNameLength$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD StreamNameLength
     * }
     */
    public static final long StreamNameLength$offset() {
        return StreamNameLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD StreamNameLength
     * }
     */
    public static int StreamNameLength(MemorySegment struct) {
        return struct.get(StreamNameLength$LAYOUT, StreamNameLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD StreamNameLength
     * }
     */
    public static void StreamNameLength(MemorySegment struct, int fieldValue) {
        struct.set(StreamNameLength$LAYOUT, StreamNameLength$OFFSET, fieldValue);
    }

    private static final GroupLayout StreamSize$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("StreamSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER StreamSize
     * }
     */
    public static final GroupLayout StreamSize$layout() {
        return StreamSize$LAYOUT;
    }

    private static final long StreamSize$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER StreamSize
     * }
     */
    public static final long StreamSize$offset() {
        return StreamSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER StreamSize
     * }
     */
    public static MemorySegment StreamSize(MemorySegment struct) {
        return struct.asSlice(StreamSize$OFFSET, StreamSize$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER StreamSize
     * }
     */
    public static void StreamSize(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, StreamSize$OFFSET, StreamSize$LAYOUT.byteSize());
    }

    private static final GroupLayout StreamAllocationSize$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("StreamAllocationSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER StreamAllocationSize
     * }
     */
    public static final GroupLayout StreamAllocationSize$layout() {
        return StreamAllocationSize$LAYOUT;
    }

    private static final long StreamAllocationSize$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER StreamAllocationSize
     * }
     */
    public static final long StreamAllocationSize$offset() {
        return StreamAllocationSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER StreamAllocationSize
     * }
     */
    public static MemorySegment StreamAllocationSize(MemorySegment struct) {
        return struct.asSlice(StreamAllocationSize$OFFSET, StreamAllocationSize$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER StreamAllocationSize
     * }
     */
    public static void StreamAllocationSize(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, StreamAllocationSize$OFFSET, StreamAllocationSize$LAYOUT.byteSize());
    }

    private static final SequenceLayout StreamName$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("StreamName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WCHAR StreamName[1]
     * }
     */
    public static final SequenceLayout StreamName$layout() {
        return StreamName$LAYOUT;
    }

    private static final long StreamName$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WCHAR StreamName[1]
     * }
     */
    public static final long StreamName$offset() {
        return StreamName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WCHAR StreamName[1]
     * }
     */
    public static MemorySegment StreamName(MemorySegment struct) {
        return struct.asSlice(StreamName$OFFSET, StreamName$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WCHAR StreamName[1]
     * }
     */
    public static void StreamName(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, StreamName$OFFSET, StreamName$LAYOUT.byteSize());
    }

    private static long[] StreamName$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * WCHAR StreamName[1]
     * }
     */
    public static long[] StreamName$dimensions() {
        return StreamName$DIMS;
    }
    private static final VarHandle StreamName$ELEM_HANDLE = StreamName$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * WCHAR StreamName[1]
     * }
     */
    public static short StreamName(MemorySegment struct, long index0) {
        return (short)StreamName$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * WCHAR StreamName[1]
     * }
     */
    public static void StreamName(MemorySegment struct, long index0, short fieldValue) {
        StreamName$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

