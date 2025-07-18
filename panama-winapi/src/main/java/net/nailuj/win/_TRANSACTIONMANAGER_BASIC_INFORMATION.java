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
 * struct _TRANSACTIONMANAGER_BASIC_INFORMATION {
 *     GUID TmIdentity;
 *     LARGE_INTEGER VirtualClock;
 * }
 * }
 */
public class _TRANSACTIONMANAGER_BASIC_INFORMATION {

    _TRANSACTIONMANAGER_BASIC_INFORMATION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GUID.layout().withName("TmIdentity"),
        _LARGE_INTEGER.layout().withName("VirtualClock")
    ).withName("_TRANSACTIONMANAGER_BASIC_INFORMATION");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout TmIdentity$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("TmIdentity"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GUID TmIdentity
     * }
     */
    public static final GroupLayout TmIdentity$layout() {
        return TmIdentity$LAYOUT;
    }

    private static final long TmIdentity$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GUID TmIdentity
     * }
     */
    public static final long TmIdentity$offset() {
        return TmIdentity$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GUID TmIdentity
     * }
     */
    public static MemorySegment TmIdentity(MemorySegment struct) {
        return struct.asSlice(TmIdentity$OFFSET, TmIdentity$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GUID TmIdentity
     * }
     */
    public static void TmIdentity(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, TmIdentity$OFFSET, TmIdentity$LAYOUT.byteSize());
    }

    private static final GroupLayout VirtualClock$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("VirtualClock"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER VirtualClock
     * }
     */
    public static final GroupLayout VirtualClock$layout() {
        return VirtualClock$LAYOUT;
    }

    private static final long VirtualClock$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER VirtualClock
     * }
     */
    public static final long VirtualClock$offset() {
        return VirtualClock$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER VirtualClock
     * }
     */
    public static MemorySegment VirtualClock(MemorySegment struct) {
        return struct.asSlice(VirtualClock$OFFSET, VirtualClock$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER VirtualClock
     * }
     */
    public static void VirtualClock(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, VirtualClock$OFFSET, VirtualClock$LAYOUT.byteSize());
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

