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
 * struct _CHANGER_ELEMENT_LIST {
 *     CHANGER_ELEMENT Element;
 *     DWORD NumberOfElements;
 * }
 * }
 */
public class _CHANGER_ELEMENT_LIST {

    _CHANGER_ELEMENT_LIST() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _CHANGER_ELEMENT.layout().withName("Element"),
        winapi.C_LONG.withName("NumberOfElements")
    ).withName("_CHANGER_ELEMENT_LIST");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout Element$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Element"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CHANGER_ELEMENT Element
     * }
     */
    public static final GroupLayout Element$layout() {
        return Element$LAYOUT;
    }

    private static final long Element$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CHANGER_ELEMENT Element
     * }
     */
    public static final long Element$offset() {
        return Element$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CHANGER_ELEMENT Element
     * }
     */
    public static MemorySegment Element(MemorySegment struct) {
        return struct.asSlice(Element$OFFSET, Element$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CHANGER_ELEMENT Element
     * }
     */
    public static void Element(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Element$OFFSET, Element$LAYOUT.byteSize());
    }

    private static final OfInt NumberOfElements$LAYOUT = (OfInt)$LAYOUT.select(groupElement("NumberOfElements"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD NumberOfElements
     * }
     */
    public static final OfInt NumberOfElements$layout() {
        return NumberOfElements$LAYOUT;
    }

    private static final long NumberOfElements$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD NumberOfElements
     * }
     */
    public static final long NumberOfElements$offset() {
        return NumberOfElements$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD NumberOfElements
     * }
     */
    public static int NumberOfElements(MemorySegment struct) {
        return struct.get(NumberOfElements$LAYOUT, NumberOfElements$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD NumberOfElements
     * }
     */
    public static void NumberOfElements(MemorySegment struct, int fieldValue) {
        struct.set(NumberOfElements$LAYOUT, NumberOfElements$OFFSET, fieldValue);
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

