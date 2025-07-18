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
 * struct {
 *     DWORD NewState;
 *     DWORD OldState;
 *     DWORD64 Processors;
 * }
 * }
 */
public class PPM_IDLESTATE_EVENT {

    PPM_IDLESTATE_EVENT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("NewState"),
        winapi.C_LONG.withName("OldState"),
        winapi.C_LONG_LONG.withName("Processors")
    ).withName("$anon$18848:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt NewState$LAYOUT = (OfInt)$LAYOUT.select(groupElement("NewState"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD NewState
     * }
     */
    public static final OfInt NewState$layout() {
        return NewState$LAYOUT;
    }

    private static final long NewState$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD NewState
     * }
     */
    public static final long NewState$offset() {
        return NewState$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD NewState
     * }
     */
    public static int NewState(MemorySegment struct) {
        return struct.get(NewState$LAYOUT, NewState$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD NewState
     * }
     */
    public static void NewState(MemorySegment struct, int fieldValue) {
        struct.set(NewState$LAYOUT, NewState$OFFSET, fieldValue);
    }

    private static final OfInt OldState$LAYOUT = (OfInt)$LAYOUT.select(groupElement("OldState"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD OldState
     * }
     */
    public static final OfInt OldState$layout() {
        return OldState$LAYOUT;
    }

    private static final long OldState$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD OldState
     * }
     */
    public static final long OldState$offset() {
        return OldState$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD OldState
     * }
     */
    public static int OldState(MemorySegment struct) {
        return struct.get(OldState$LAYOUT, OldState$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD OldState
     * }
     */
    public static void OldState(MemorySegment struct, int fieldValue) {
        struct.set(OldState$LAYOUT, OldState$OFFSET, fieldValue);
    }

    private static final OfLong Processors$LAYOUT = (OfLong)$LAYOUT.select(groupElement("Processors"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD64 Processors
     * }
     */
    public static final OfLong Processors$layout() {
        return Processors$LAYOUT;
    }

    private static final long Processors$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD64 Processors
     * }
     */
    public static final long Processors$offset() {
        return Processors$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD64 Processors
     * }
     */
    public static long Processors(MemorySegment struct) {
        return struct.get(Processors$LAYOUT, Processors$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD64 Processors
     * }
     */
    public static void Processors(MemorySegment struct, long fieldValue) {
        struct.set(Processors$LAYOUT, Processors$OFFSET, fieldValue);
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

