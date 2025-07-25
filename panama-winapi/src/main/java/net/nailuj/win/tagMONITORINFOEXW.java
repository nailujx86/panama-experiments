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
 * struct tagMONITORINFOEXW {
 *     WCHAR szDevice[32];
 * }
 * }
 */
public class tagMONITORINFOEXW {

    tagMONITORINFOEXW() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.paddingLayout(40),
        MemoryLayout.sequenceLayout(32, winapi.C_SHORT).withName("szDevice")
    ).withName("tagMONITORINFOEXW");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final SequenceLayout szDevice$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("szDevice"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WCHAR szDevice[32]
     * }
     */
    public static final SequenceLayout szDevice$layout() {
        return szDevice$LAYOUT;
    }

    private static final long szDevice$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WCHAR szDevice[32]
     * }
     */
    public static final long szDevice$offset() {
        return szDevice$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WCHAR szDevice[32]
     * }
     */
    public static MemorySegment szDevice(MemorySegment struct) {
        return struct.asSlice(szDevice$OFFSET, szDevice$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WCHAR szDevice[32]
     * }
     */
    public static void szDevice(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, szDevice$OFFSET, szDevice$LAYOUT.byteSize());
    }

    private static long[] szDevice$DIMS = { 32 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * WCHAR szDevice[32]
     * }
     */
    public static long[] szDevice$dimensions() {
        return szDevice$DIMS;
    }
    private static final VarHandle szDevice$ELEM_HANDLE = szDevice$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * WCHAR szDevice[32]
     * }
     */
    public static short szDevice(MemorySegment struct, long index0) {
        return (short)szDevice$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * WCHAR szDevice[32]
     * }
     */
    public static void szDevice(MemorySegment struct, long index0, short fieldValue) {
        szDevice$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

