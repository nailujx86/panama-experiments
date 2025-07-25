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
 * struct tagSERIALIZEDPROPERTYVALUE {
 *     DWORD dwType;
 *     BYTE rgb[1];
 * }
 * }
 */
public class tagSERIALIZEDPROPERTYVALUE {

    tagSERIALIZEDPROPERTYVALUE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("dwType"),
        MemoryLayout.sequenceLayout(1, winapi.C_CHAR).withName("rgb"),
        MemoryLayout.paddingLayout(3)
    ).withName("tagSERIALIZEDPROPERTYVALUE");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwType
     * }
     */
    public static final OfInt dwType$layout() {
        return dwType$LAYOUT;
    }

    private static final long dwType$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwType
     * }
     */
    public static final long dwType$offset() {
        return dwType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwType
     * }
     */
    public static int dwType(MemorySegment struct) {
        return struct.get(dwType$LAYOUT, dwType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwType
     * }
     */
    public static void dwType(MemorySegment struct, int fieldValue) {
        struct.set(dwType$LAYOUT, dwType$OFFSET, fieldValue);
    }

    private static final SequenceLayout rgb$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("rgb"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE rgb[1]
     * }
     */
    public static final SequenceLayout rgb$layout() {
        return rgb$LAYOUT;
    }

    private static final long rgb$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE rgb[1]
     * }
     */
    public static final long rgb$offset() {
        return rgb$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE rgb[1]
     * }
     */
    public static MemorySegment rgb(MemorySegment struct) {
        return struct.asSlice(rgb$OFFSET, rgb$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE rgb[1]
     * }
     */
    public static void rgb(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, rgb$OFFSET, rgb$LAYOUT.byteSize());
    }

    private static long[] rgb$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE rgb[1]
     * }
     */
    public static long[] rgb$dimensions() {
        return rgb$DIMS;
    }
    private static final VarHandle rgb$ELEM_HANDLE = rgb$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE rgb[1]
     * }
     */
    public static byte rgb(MemorySegment struct, long index0) {
        return (byte)rgb$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE rgb[1]
     * }
     */
    public static void rgb(MemorySegment struct, long index0, byte fieldValue) {
        rgb$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

