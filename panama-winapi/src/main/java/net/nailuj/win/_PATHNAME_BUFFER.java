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
 * struct _PATHNAME_BUFFER {
 *     DWORD PathNameLength;
 *     WCHAR Name[1];
 * }
 * }
 */
public class _PATHNAME_BUFFER {

    _PATHNAME_BUFFER() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("PathNameLength"),
        MemoryLayout.sequenceLayout(1, winapi.C_SHORT).withName("Name"),
        MemoryLayout.paddingLayout(2)
    ).withName("_PATHNAME_BUFFER");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt PathNameLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("PathNameLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD PathNameLength
     * }
     */
    public static final OfInt PathNameLength$layout() {
        return PathNameLength$LAYOUT;
    }

    private static final long PathNameLength$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD PathNameLength
     * }
     */
    public static final long PathNameLength$offset() {
        return PathNameLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD PathNameLength
     * }
     */
    public static int PathNameLength(MemorySegment struct) {
        return struct.get(PathNameLength$LAYOUT, PathNameLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD PathNameLength
     * }
     */
    public static void PathNameLength(MemorySegment struct, int fieldValue) {
        struct.set(PathNameLength$LAYOUT, PathNameLength$OFFSET, fieldValue);
    }

    private static final SequenceLayout Name$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Name"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WCHAR Name[1]
     * }
     */
    public static final SequenceLayout Name$layout() {
        return Name$LAYOUT;
    }

    private static final long Name$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WCHAR Name[1]
     * }
     */
    public static final long Name$offset() {
        return Name$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WCHAR Name[1]
     * }
     */
    public static MemorySegment Name(MemorySegment struct) {
        return struct.asSlice(Name$OFFSET, Name$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WCHAR Name[1]
     * }
     */
    public static void Name(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Name$OFFSET, Name$LAYOUT.byteSize());
    }

    private static long[] Name$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * WCHAR Name[1]
     * }
     */
    public static long[] Name$dimensions() {
        return Name$DIMS;
    }
    private static final VarHandle Name$ELEM_HANDLE = Name$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * WCHAR Name[1]
     * }
     */
    public static short Name(MemorySegment struct, long index0) {
        return (short)Name$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * WCHAR Name[1]
     * }
     */
    public static void Name(MemorySegment struct, long index0, short fieldValue) {
        Name$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

