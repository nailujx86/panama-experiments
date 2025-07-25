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
 * struct _PROCESS_DYNAMIC_EH_CONTINUATION_TARGET {
 *     ULONG_PTR TargetAddress;
 *     ULONG_PTR Flags;
 * }
 * }
 */
public class _PROCESS_DYNAMIC_EH_CONTINUATION_TARGET {

    _PROCESS_DYNAMIC_EH_CONTINUATION_TARGET() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG_LONG.withName("TargetAddress"),
        winapi.C_LONG_LONG.withName("Flags")
    ).withName("_PROCESS_DYNAMIC_EH_CONTINUATION_TARGET");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong TargetAddress$LAYOUT = (OfLong)$LAYOUT.select(groupElement("TargetAddress"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG_PTR TargetAddress
     * }
     */
    public static final OfLong TargetAddress$layout() {
        return TargetAddress$LAYOUT;
    }

    private static final long TargetAddress$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG_PTR TargetAddress
     * }
     */
    public static final long TargetAddress$offset() {
        return TargetAddress$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG_PTR TargetAddress
     * }
     */
    public static long TargetAddress(MemorySegment struct) {
        return struct.get(TargetAddress$LAYOUT, TargetAddress$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG_PTR TargetAddress
     * }
     */
    public static void TargetAddress(MemorySegment struct, long fieldValue) {
        struct.set(TargetAddress$LAYOUT, TargetAddress$OFFSET, fieldValue);
    }

    private static final OfLong Flags$LAYOUT = (OfLong)$LAYOUT.select(groupElement("Flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG_PTR Flags
     * }
     */
    public static final OfLong Flags$layout() {
        return Flags$LAYOUT;
    }

    private static final long Flags$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG_PTR Flags
     * }
     */
    public static final long Flags$offset() {
        return Flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG_PTR Flags
     * }
     */
    public static long Flags(MemorySegment struct) {
        return struct.get(Flags$LAYOUT, Flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG_PTR Flags
     * }
     */
    public static void Flags(MemorySegment struct, long fieldValue) {
        struct.set(Flags$LAYOUT, Flags$OFFSET, fieldValue);
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

