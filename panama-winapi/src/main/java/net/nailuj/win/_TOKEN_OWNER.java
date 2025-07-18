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
 * struct _TOKEN_OWNER {
 *     PSID Owner;
 * }
 * }
 */
public class _TOKEN_OWNER {

    _TOKEN_OWNER() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_POINTER.withName("Owner")
    ).withName("_TOKEN_OWNER");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout Owner$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("Owner"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PSID Owner
     * }
     */
    public static final AddressLayout Owner$layout() {
        return Owner$LAYOUT;
    }

    private static final long Owner$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PSID Owner
     * }
     */
    public static final long Owner$offset() {
        return Owner$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PSID Owner
     * }
     */
    public static MemorySegment Owner(MemorySegment struct) {
        return struct.get(Owner$LAYOUT, Owner$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PSID Owner
     * }
     */
    public static void Owner(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Owner$LAYOUT, Owner$OFFSET, fieldValue);
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

