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
 * struct _FILE_ATTRIBUTE_TAG_INFO {
 *     DWORD FileAttributes;
 *     DWORD ReparseTag;
 * }
 * }
 */
public class _FILE_ATTRIBUTE_TAG_INFO {

    _FILE_ATTRIBUTE_TAG_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("FileAttributes"),
        winapi.C_LONG.withName("ReparseTag")
    ).withName("_FILE_ATTRIBUTE_TAG_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt FileAttributes$LAYOUT = (OfInt)$LAYOUT.select(groupElement("FileAttributes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD FileAttributes
     * }
     */
    public static final OfInt FileAttributes$layout() {
        return FileAttributes$LAYOUT;
    }

    private static final long FileAttributes$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD FileAttributes
     * }
     */
    public static final long FileAttributes$offset() {
        return FileAttributes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD FileAttributes
     * }
     */
    public static int FileAttributes(MemorySegment struct) {
        return struct.get(FileAttributes$LAYOUT, FileAttributes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD FileAttributes
     * }
     */
    public static void FileAttributes(MemorySegment struct, int fieldValue) {
        struct.set(FileAttributes$LAYOUT, FileAttributes$OFFSET, fieldValue);
    }

    private static final OfInt ReparseTag$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ReparseTag"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ReparseTag
     * }
     */
    public static final OfInt ReparseTag$layout() {
        return ReparseTag$LAYOUT;
    }

    private static final long ReparseTag$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ReparseTag
     * }
     */
    public static final long ReparseTag$offset() {
        return ReparseTag$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ReparseTag
     * }
     */
    public static int ReparseTag(MemorySegment struct) {
        return struct.get(ReparseTag$LAYOUT, ReparseTag$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ReparseTag
     * }
     */
    public static void ReparseTag(MemorySegment struct, int fieldValue) {
        struct.set(ReparseTag$LAYOUT, ReparseTag$OFFSET, fieldValue);
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

