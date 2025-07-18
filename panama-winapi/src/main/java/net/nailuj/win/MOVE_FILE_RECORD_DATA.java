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
 *     HANDLE FileHandle;
 *     LARGE_INTEGER SourceFileRecord;
 *     LARGE_INTEGER TargetFileRecord;
 * }
 * }
 */
public class MOVE_FILE_RECORD_DATA {

    MOVE_FILE_RECORD_DATA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_POINTER.withName("FileHandle"),
        _LARGE_INTEGER.layout().withName("SourceFileRecord"),
        _LARGE_INTEGER.layout().withName("TargetFileRecord")
    ).withName("$anon$11838:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout FileHandle$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("FileHandle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HANDLE FileHandle
     * }
     */
    public static final AddressLayout FileHandle$layout() {
        return FileHandle$LAYOUT;
    }

    private static final long FileHandle$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HANDLE FileHandle
     * }
     */
    public static final long FileHandle$offset() {
        return FileHandle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HANDLE FileHandle
     * }
     */
    public static MemorySegment FileHandle(MemorySegment struct) {
        return struct.get(FileHandle$LAYOUT, FileHandle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HANDLE FileHandle
     * }
     */
    public static void FileHandle(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(FileHandle$LAYOUT, FileHandle$OFFSET, fieldValue);
    }

    private static final GroupLayout SourceFileRecord$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("SourceFileRecord"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER SourceFileRecord
     * }
     */
    public static final GroupLayout SourceFileRecord$layout() {
        return SourceFileRecord$LAYOUT;
    }

    private static final long SourceFileRecord$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER SourceFileRecord
     * }
     */
    public static final long SourceFileRecord$offset() {
        return SourceFileRecord$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER SourceFileRecord
     * }
     */
    public static MemorySegment SourceFileRecord(MemorySegment struct) {
        return struct.asSlice(SourceFileRecord$OFFSET, SourceFileRecord$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER SourceFileRecord
     * }
     */
    public static void SourceFileRecord(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, SourceFileRecord$OFFSET, SourceFileRecord$LAYOUT.byteSize());
    }

    private static final GroupLayout TargetFileRecord$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("TargetFileRecord"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER TargetFileRecord
     * }
     */
    public static final GroupLayout TargetFileRecord$layout() {
        return TargetFileRecord$LAYOUT;
    }

    private static final long TargetFileRecord$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER TargetFileRecord
     * }
     */
    public static final long TargetFileRecord$offset() {
        return TargetFileRecord$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER TargetFileRecord
     * }
     */
    public static MemorySegment TargetFileRecord(MemorySegment struct) {
        return struct.asSlice(TargetFileRecord$OFFSET, TargetFileRecord$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER TargetFileRecord
     * }
     */
    public static void TargetFileRecord(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, TargetFileRecord$OFFSET, TargetFileRecord$LAYOUT.byteSize());
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

