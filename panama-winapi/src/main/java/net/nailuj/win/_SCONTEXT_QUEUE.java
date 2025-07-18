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
 * struct _SCONTEXT_QUEUE {
 *     unsigned long NumberOfObjects;
 *     NDR_SCONTEXT *ArrayOfObjects;
 * }
 * }
 */
public class _SCONTEXT_QUEUE {

    _SCONTEXT_QUEUE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("NumberOfObjects"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("ArrayOfObjects")
    ).withName("_SCONTEXT_QUEUE");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt NumberOfObjects$LAYOUT = (OfInt)$LAYOUT.select(groupElement("NumberOfObjects"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long NumberOfObjects
     * }
     */
    public static final OfInt NumberOfObjects$layout() {
        return NumberOfObjects$LAYOUT;
    }

    private static final long NumberOfObjects$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long NumberOfObjects
     * }
     */
    public static final long NumberOfObjects$offset() {
        return NumberOfObjects$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long NumberOfObjects
     * }
     */
    public static int NumberOfObjects(MemorySegment struct) {
        return struct.get(NumberOfObjects$LAYOUT, NumberOfObjects$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long NumberOfObjects
     * }
     */
    public static void NumberOfObjects(MemorySegment struct, int fieldValue) {
        struct.set(NumberOfObjects$LAYOUT, NumberOfObjects$OFFSET, fieldValue);
    }

    private static final AddressLayout ArrayOfObjects$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("ArrayOfObjects"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * NDR_SCONTEXT *ArrayOfObjects
     * }
     */
    public static final AddressLayout ArrayOfObjects$layout() {
        return ArrayOfObjects$LAYOUT;
    }

    private static final long ArrayOfObjects$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * NDR_SCONTEXT *ArrayOfObjects
     * }
     */
    public static final long ArrayOfObjects$offset() {
        return ArrayOfObjects$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * NDR_SCONTEXT *ArrayOfObjects
     * }
     */
    public static MemorySegment ArrayOfObjects(MemorySegment struct) {
        return struct.get(ArrayOfObjects$LAYOUT, ArrayOfObjects$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * NDR_SCONTEXT *ArrayOfObjects
     * }
     */
    public static void ArrayOfObjects(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ArrayOfObjects$LAYOUT, ArrayOfObjects$OFFSET, fieldValue);
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

