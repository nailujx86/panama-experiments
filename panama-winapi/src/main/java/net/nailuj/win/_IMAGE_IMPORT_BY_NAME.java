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
 * struct _IMAGE_IMPORT_BY_NAME {
 *     WORD Hint;
 *     CHAR Name[1];
 * }
 * }
 */
public class _IMAGE_IMPORT_BY_NAME {

    _IMAGE_IMPORT_BY_NAME() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_SHORT.withName("Hint"),
        MemoryLayout.sequenceLayout(1, winapi.C_CHAR).withName("Name"),
        MemoryLayout.paddingLayout(1)
    ).withName("_IMAGE_IMPORT_BY_NAME");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort Hint$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Hint"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD Hint
     * }
     */
    public static final OfShort Hint$layout() {
        return Hint$LAYOUT;
    }

    private static final long Hint$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD Hint
     * }
     */
    public static final long Hint$offset() {
        return Hint$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD Hint
     * }
     */
    public static short Hint(MemorySegment struct) {
        return struct.get(Hint$LAYOUT, Hint$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD Hint
     * }
     */
    public static void Hint(MemorySegment struct, short fieldValue) {
        struct.set(Hint$LAYOUT, Hint$OFFSET, fieldValue);
    }

    private static final SequenceLayout Name$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Name"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CHAR Name[1]
     * }
     */
    public static final SequenceLayout Name$layout() {
        return Name$LAYOUT;
    }

    private static final long Name$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CHAR Name[1]
     * }
     */
    public static final long Name$offset() {
        return Name$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CHAR Name[1]
     * }
     */
    public static MemorySegment Name(MemorySegment struct) {
        return struct.asSlice(Name$OFFSET, Name$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CHAR Name[1]
     * }
     */
    public static void Name(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Name$OFFSET, Name$LAYOUT.byteSize());
    }

    private static long[] Name$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * CHAR Name[1]
     * }
     */
    public static long[] Name$dimensions() {
        return Name$DIMS;
    }
    private static final VarHandle Name$ELEM_HANDLE = Name$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * CHAR Name[1]
     * }
     */
    public static byte Name(MemorySegment struct, long index0) {
        return (byte)Name$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * CHAR Name[1]
     * }
     */
    public static void Name(MemorySegment struct, long index0, byte fieldValue) {
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

