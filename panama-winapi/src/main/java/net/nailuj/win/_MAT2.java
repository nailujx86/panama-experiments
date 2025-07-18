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
 * struct _MAT2 {
 *     FIXED eM11;
 *     FIXED eM12;
 *     FIXED eM21;
 *     FIXED eM22;
 * }
 * }
 */
public class _MAT2 {

    _MAT2() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _FIXED.layout().withName("eM11"),
        _FIXED.layout().withName("eM12"),
        _FIXED.layout().withName("eM21"),
        _FIXED.layout().withName("eM22")
    ).withName("_MAT2");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout eM11$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("eM11"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FIXED eM11
     * }
     */
    public static final GroupLayout eM11$layout() {
        return eM11$LAYOUT;
    }

    private static final long eM11$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FIXED eM11
     * }
     */
    public static final long eM11$offset() {
        return eM11$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FIXED eM11
     * }
     */
    public static MemorySegment eM11(MemorySegment struct) {
        return struct.asSlice(eM11$OFFSET, eM11$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FIXED eM11
     * }
     */
    public static void eM11(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, eM11$OFFSET, eM11$LAYOUT.byteSize());
    }

    private static final GroupLayout eM12$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("eM12"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FIXED eM12
     * }
     */
    public static final GroupLayout eM12$layout() {
        return eM12$LAYOUT;
    }

    private static final long eM12$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FIXED eM12
     * }
     */
    public static final long eM12$offset() {
        return eM12$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FIXED eM12
     * }
     */
    public static MemorySegment eM12(MemorySegment struct) {
        return struct.asSlice(eM12$OFFSET, eM12$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FIXED eM12
     * }
     */
    public static void eM12(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, eM12$OFFSET, eM12$LAYOUT.byteSize());
    }

    private static final GroupLayout eM21$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("eM21"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FIXED eM21
     * }
     */
    public static final GroupLayout eM21$layout() {
        return eM21$LAYOUT;
    }

    private static final long eM21$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FIXED eM21
     * }
     */
    public static final long eM21$offset() {
        return eM21$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FIXED eM21
     * }
     */
    public static MemorySegment eM21(MemorySegment struct) {
        return struct.asSlice(eM21$OFFSET, eM21$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FIXED eM21
     * }
     */
    public static void eM21(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, eM21$OFFSET, eM21$LAYOUT.byteSize());
    }

    private static final GroupLayout eM22$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("eM22"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FIXED eM22
     * }
     */
    public static final GroupLayout eM22$layout() {
        return eM22$LAYOUT;
    }

    private static final long eM22$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FIXED eM22
     * }
     */
    public static final long eM22$offset() {
        return eM22$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FIXED eM22
     * }
     */
    public static MemorySegment eM22(MemorySegment struct) {
        return struct.asSlice(eM22$OFFSET, eM22$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FIXED eM22
     * }
     */
    public static void eM22(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, eM22$OFFSET, eM22$LAYOUT.byteSize());
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

