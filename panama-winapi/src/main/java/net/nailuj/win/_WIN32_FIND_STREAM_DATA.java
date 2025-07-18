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
 * struct _WIN32_FIND_STREAM_DATA {
 *     LARGE_INTEGER StreamSize;
 *     WCHAR cStreamName[296];
 * }
 * }
 */
public class _WIN32_FIND_STREAM_DATA {

    _WIN32_FIND_STREAM_DATA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _LARGE_INTEGER.layout().withName("StreamSize"),
        MemoryLayout.sequenceLayout(296, winapi.C_SHORT).withName("cStreamName")
    ).withName("_WIN32_FIND_STREAM_DATA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
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

    private static final long StreamSize$OFFSET = 0;

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

    private static final SequenceLayout cStreamName$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("cStreamName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WCHAR cStreamName[296]
     * }
     */
    public static final SequenceLayout cStreamName$layout() {
        return cStreamName$LAYOUT;
    }

    private static final long cStreamName$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WCHAR cStreamName[296]
     * }
     */
    public static final long cStreamName$offset() {
        return cStreamName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WCHAR cStreamName[296]
     * }
     */
    public static MemorySegment cStreamName(MemorySegment struct) {
        return struct.asSlice(cStreamName$OFFSET, cStreamName$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WCHAR cStreamName[296]
     * }
     */
    public static void cStreamName(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, cStreamName$OFFSET, cStreamName$LAYOUT.byteSize());
    }

    private static long[] cStreamName$DIMS = { 296 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * WCHAR cStreamName[296]
     * }
     */
    public static long[] cStreamName$dimensions() {
        return cStreamName$DIMS;
    }
    private static final VarHandle cStreamName$ELEM_HANDLE = cStreamName$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * WCHAR cStreamName[296]
     * }
     */
    public static short cStreamName(MemorySegment struct, long index0) {
        return (short)cStreamName$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * WCHAR cStreamName[296]
     * }
     */
    public static void cStreamName(MemorySegment struct, long index0, short fieldValue) {
        cStreamName$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

