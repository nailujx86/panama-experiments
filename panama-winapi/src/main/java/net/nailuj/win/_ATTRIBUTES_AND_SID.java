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
 * struct _ATTRIBUTES_AND_SID {
 *     UINT32 Attributes;
 *     DWORD SidStart;
 * }
 * }
 */
public class _ATTRIBUTES_AND_SID {

    _ATTRIBUTES_AND_SID() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_INT.withName("Attributes"),
        winapi.C_LONG.withName("SidStart")
    ).withName("_ATTRIBUTES_AND_SID");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Attributes$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Attributes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT32 Attributes
     * }
     */
    public static final OfInt Attributes$layout() {
        return Attributes$LAYOUT;
    }

    private static final long Attributes$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT32 Attributes
     * }
     */
    public static final long Attributes$offset() {
        return Attributes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT32 Attributes
     * }
     */
    public static int Attributes(MemorySegment struct) {
        return struct.get(Attributes$LAYOUT, Attributes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT32 Attributes
     * }
     */
    public static void Attributes(MemorySegment struct, int fieldValue) {
        struct.set(Attributes$LAYOUT, Attributes$OFFSET, fieldValue);
    }

    private static final OfInt SidStart$LAYOUT = (OfInt)$LAYOUT.select(groupElement("SidStart"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD SidStart
     * }
     */
    public static final OfInt SidStart$layout() {
        return SidStart$LAYOUT;
    }

    private static final long SidStart$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD SidStart
     * }
     */
    public static final long SidStart$offset() {
        return SidStart$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD SidStart
     * }
     */
    public static int SidStart(MemorySegment struct) {
        return struct.get(SidStart$LAYOUT, SidStart$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD SidStart
     * }
     */
    public static void SidStart(MemorySegment struct, int fieldValue) {
        struct.set(SidStart$LAYOUT, SidStart$OFFSET, fieldValue);
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

