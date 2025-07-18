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
 * struct _FILETIME {
 *     DWORD dwLowDateTime;
 *     DWORD dwHighDateTime;
 * }
 * }
 */
public class _FILETIME {

    _FILETIME() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("dwLowDateTime"),
        winapi.C_LONG.withName("dwHighDateTime")
    ).withName("_FILETIME");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwLowDateTime$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwLowDateTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwLowDateTime
     * }
     */
    public static final OfInt dwLowDateTime$layout() {
        return dwLowDateTime$LAYOUT;
    }

    private static final long dwLowDateTime$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwLowDateTime
     * }
     */
    public static final long dwLowDateTime$offset() {
        return dwLowDateTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwLowDateTime
     * }
     */
    public static int dwLowDateTime(MemorySegment struct) {
        return struct.get(dwLowDateTime$LAYOUT, dwLowDateTime$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwLowDateTime
     * }
     */
    public static void dwLowDateTime(MemorySegment struct, int fieldValue) {
        struct.set(dwLowDateTime$LAYOUT, dwLowDateTime$OFFSET, fieldValue);
    }

    private static final OfInt dwHighDateTime$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwHighDateTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwHighDateTime
     * }
     */
    public static final OfInt dwHighDateTime$layout() {
        return dwHighDateTime$LAYOUT;
    }

    private static final long dwHighDateTime$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwHighDateTime
     * }
     */
    public static final long dwHighDateTime$offset() {
        return dwHighDateTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwHighDateTime
     * }
     */
    public static int dwHighDateTime(MemorySegment struct) {
        return struct.get(dwHighDateTime$LAYOUT, dwHighDateTime$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwHighDateTime
     * }
     */
    public static void dwHighDateTime(MemorySegment struct, int fieldValue) {
        struct.set(dwHighDateTime$LAYOUT, dwHighDateTime$OFFSET, fieldValue);
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

