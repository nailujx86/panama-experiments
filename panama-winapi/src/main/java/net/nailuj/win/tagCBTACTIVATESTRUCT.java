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
 * struct tagCBTACTIVATESTRUCT {
 *     BOOL fMouse;
 *     HWND hWndActive;
 * }
 * }
 */
public class tagCBTACTIVATESTRUCT {

    tagCBTACTIVATESTRUCT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_INT.withName("fMouse"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("hWndActive")
    ).withName("tagCBTACTIVATESTRUCT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt fMouse$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fMouse"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOL fMouse
     * }
     */
    public static final OfInt fMouse$layout() {
        return fMouse$LAYOUT;
    }

    private static final long fMouse$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOL fMouse
     * }
     */
    public static final long fMouse$offset() {
        return fMouse$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOL fMouse
     * }
     */
    public static int fMouse(MemorySegment struct) {
        return struct.get(fMouse$LAYOUT, fMouse$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOL fMouse
     * }
     */
    public static void fMouse(MemorySegment struct, int fieldValue) {
        struct.set(fMouse$LAYOUT, fMouse$OFFSET, fieldValue);
    }

    private static final AddressLayout hWndActive$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hWndActive"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HWND hWndActive
     * }
     */
    public static final AddressLayout hWndActive$layout() {
        return hWndActive$LAYOUT;
    }

    private static final long hWndActive$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HWND hWndActive
     * }
     */
    public static final long hWndActive$offset() {
        return hWndActive$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HWND hWndActive
     * }
     */
    public static MemorySegment hWndActive(MemorySegment struct) {
        return struct.get(hWndActive$LAYOUT, hWndActive$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HWND hWndActive
     * }
     */
    public static void hWndActive(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hWndActive$LAYOUT, hWndActive$OFFSET, fieldValue);
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

