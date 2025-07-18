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
 * struct _KTMOBJECT_CURSOR {
 *     GUID LastQuery;
 *     DWORD ObjectIdCount;
 *     GUID ObjectIds[1];
 * }
 * }
 */
public class _KTMOBJECT_CURSOR {

    _KTMOBJECT_CURSOR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GUID.layout().withName("LastQuery"),
        winapi.C_LONG.withName("ObjectIdCount"),
        MemoryLayout.sequenceLayout(1, _GUID.layout()).withName("ObjectIds")
    ).withName("_KTMOBJECT_CURSOR");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout LastQuery$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("LastQuery"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GUID LastQuery
     * }
     */
    public static final GroupLayout LastQuery$layout() {
        return LastQuery$LAYOUT;
    }

    private static final long LastQuery$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GUID LastQuery
     * }
     */
    public static final long LastQuery$offset() {
        return LastQuery$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GUID LastQuery
     * }
     */
    public static MemorySegment LastQuery(MemorySegment struct) {
        return struct.asSlice(LastQuery$OFFSET, LastQuery$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GUID LastQuery
     * }
     */
    public static void LastQuery(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, LastQuery$OFFSET, LastQuery$LAYOUT.byteSize());
    }

    private static final OfInt ObjectIdCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ObjectIdCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ObjectIdCount
     * }
     */
    public static final OfInt ObjectIdCount$layout() {
        return ObjectIdCount$LAYOUT;
    }

    private static final long ObjectIdCount$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ObjectIdCount
     * }
     */
    public static final long ObjectIdCount$offset() {
        return ObjectIdCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ObjectIdCount
     * }
     */
    public static int ObjectIdCount(MemorySegment struct) {
        return struct.get(ObjectIdCount$LAYOUT, ObjectIdCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ObjectIdCount
     * }
     */
    public static void ObjectIdCount(MemorySegment struct, int fieldValue) {
        struct.set(ObjectIdCount$LAYOUT, ObjectIdCount$OFFSET, fieldValue);
    }

    private static final SequenceLayout ObjectIds$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("ObjectIds"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GUID ObjectIds[1]
     * }
     */
    public static final SequenceLayout ObjectIds$layout() {
        return ObjectIds$LAYOUT;
    }

    private static final long ObjectIds$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GUID ObjectIds[1]
     * }
     */
    public static final long ObjectIds$offset() {
        return ObjectIds$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GUID ObjectIds[1]
     * }
     */
    public static MemorySegment ObjectIds(MemorySegment struct) {
        return struct.asSlice(ObjectIds$OFFSET, ObjectIds$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GUID ObjectIds[1]
     * }
     */
    public static void ObjectIds(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ObjectIds$OFFSET, ObjectIds$LAYOUT.byteSize());
    }

    private static long[] ObjectIds$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * GUID ObjectIds[1]
     * }
     */
    public static long[] ObjectIds$dimensions() {
        return ObjectIds$DIMS;
    }
    private static final MethodHandle ObjectIds$ELEM_HANDLE = ObjectIds$LAYOUT.sliceHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * GUID ObjectIds[1]
     * }
     */
    public static MemorySegment ObjectIds(MemorySegment struct, long index0) {
        try {
            return (MemorySegment)ObjectIds$ELEM_HANDLE.invokeExact(struct, 0L, index0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * GUID ObjectIds[1]
     * }
     */
    public static void ObjectIds(MemorySegment struct, long index0, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, ObjectIds(struct, index0), 0L, _GUID.layout().byteSize());
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

