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
 * struct _ABC {
 *     int abcA;
 *     UINT abcB;
 *     int abcC;
 * }
 * }
 */
public class _ABC {

    _ABC() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_INT.withName("abcA"),
        winapi.C_INT.withName("abcB"),
        winapi.C_INT.withName("abcC")
    ).withName("_ABC");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt abcA$LAYOUT = (OfInt)$LAYOUT.select(groupElement("abcA"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int abcA
     * }
     */
    public static final OfInt abcA$layout() {
        return abcA$LAYOUT;
    }

    private static final long abcA$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int abcA
     * }
     */
    public static final long abcA$offset() {
        return abcA$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int abcA
     * }
     */
    public static int abcA(MemorySegment struct) {
        return struct.get(abcA$LAYOUT, abcA$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int abcA
     * }
     */
    public static void abcA(MemorySegment struct, int fieldValue) {
        struct.set(abcA$LAYOUT, abcA$OFFSET, fieldValue);
    }

    private static final OfInt abcB$LAYOUT = (OfInt)$LAYOUT.select(groupElement("abcB"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT abcB
     * }
     */
    public static final OfInt abcB$layout() {
        return abcB$LAYOUT;
    }

    private static final long abcB$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT abcB
     * }
     */
    public static final long abcB$offset() {
        return abcB$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT abcB
     * }
     */
    public static int abcB(MemorySegment struct) {
        return struct.get(abcB$LAYOUT, abcB$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT abcB
     * }
     */
    public static void abcB(MemorySegment struct, int fieldValue) {
        struct.set(abcB$LAYOUT, abcB$OFFSET, fieldValue);
    }

    private static final OfInt abcC$LAYOUT = (OfInt)$LAYOUT.select(groupElement("abcC"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int abcC
     * }
     */
    public static final OfInt abcC$layout() {
        return abcC$LAYOUT;
    }

    private static final long abcC$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int abcC
     * }
     */
    public static final long abcC$offset() {
        return abcC$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int abcC
     * }
     */
    public static int abcC(MemorySegment struct) {
        return struct.get(abcC$LAYOUT, abcC$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int abcC
     * }
     */
    public static void abcC(MemorySegment struct, int fieldValue) {
        struct.set(abcC$LAYOUT, abcC$OFFSET, fieldValue);
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

