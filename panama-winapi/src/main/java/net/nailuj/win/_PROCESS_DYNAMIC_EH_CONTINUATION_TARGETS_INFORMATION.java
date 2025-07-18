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
 * struct _PROCESS_DYNAMIC_EH_CONTINUATION_TARGETS_INFORMATION {
 *     WORD NumberOfTargets;
 *     WORD Reserved;
 *     DWORD Reserved2;
 *     PPROCESS_DYNAMIC_EH_CONTINUATION_TARGET Targets;
 * }
 * }
 */
public class _PROCESS_DYNAMIC_EH_CONTINUATION_TARGETS_INFORMATION {

    _PROCESS_DYNAMIC_EH_CONTINUATION_TARGETS_INFORMATION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_SHORT.withName("NumberOfTargets"),
        winapi.C_SHORT.withName("Reserved"),
        winapi.C_LONG.withName("Reserved2"),
        winapi.C_POINTER.withName("Targets")
    ).withName("_PROCESS_DYNAMIC_EH_CONTINUATION_TARGETS_INFORMATION");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort NumberOfTargets$LAYOUT = (OfShort)$LAYOUT.select(groupElement("NumberOfTargets"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD NumberOfTargets
     * }
     */
    public static final OfShort NumberOfTargets$layout() {
        return NumberOfTargets$LAYOUT;
    }

    private static final long NumberOfTargets$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD NumberOfTargets
     * }
     */
    public static final long NumberOfTargets$offset() {
        return NumberOfTargets$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD NumberOfTargets
     * }
     */
    public static short NumberOfTargets(MemorySegment struct) {
        return struct.get(NumberOfTargets$LAYOUT, NumberOfTargets$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD NumberOfTargets
     * }
     */
    public static void NumberOfTargets(MemorySegment struct, short fieldValue) {
        struct.set(NumberOfTargets$LAYOUT, NumberOfTargets$OFFSET, fieldValue);
    }

    private static final OfShort Reserved$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Reserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD Reserved
     * }
     */
    public static final OfShort Reserved$layout() {
        return Reserved$LAYOUT;
    }

    private static final long Reserved$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD Reserved
     * }
     */
    public static final long Reserved$offset() {
        return Reserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD Reserved
     * }
     */
    public static short Reserved(MemorySegment struct) {
        return struct.get(Reserved$LAYOUT, Reserved$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD Reserved
     * }
     */
    public static void Reserved(MemorySegment struct, short fieldValue) {
        struct.set(Reserved$LAYOUT, Reserved$OFFSET, fieldValue);
    }

    private static final OfInt Reserved2$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Reserved2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Reserved2
     * }
     */
    public static final OfInt Reserved2$layout() {
        return Reserved2$LAYOUT;
    }

    private static final long Reserved2$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Reserved2
     * }
     */
    public static final long Reserved2$offset() {
        return Reserved2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Reserved2
     * }
     */
    public static int Reserved2(MemorySegment struct) {
        return struct.get(Reserved2$LAYOUT, Reserved2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Reserved2
     * }
     */
    public static void Reserved2(MemorySegment struct, int fieldValue) {
        struct.set(Reserved2$LAYOUT, Reserved2$OFFSET, fieldValue);
    }

    private static final AddressLayout Targets$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("Targets"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PPROCESS_DYNAMIC_EH_CONTINUATION_TARGET Targets
     * }
     */
    public static final AddressLayout Targets$layout() {
        return Targets$LAYOUT;
    }

    private static final long Targets$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PPROCESS_DYNAMIC_EH_CONTINUATION_TARGET Targets
     * }
     */
    public static final long Targets$offset() {
        return Targets$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PPROCESS_DYNAMIC_EH_CONTINUATION_TARGET Targets
     * }
     */
    public static MemorySegment Targets(MemorySegment struct) {
        return struct.get(Targets$LAYOUT, Targets$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PPROCESS_DYNAMIC_EH_CONTINUATION_TARGET Targets
     * }
     */
    public static void Targets(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Targets$LAYOUT, Targets$OFFSET, fieldValue);
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

