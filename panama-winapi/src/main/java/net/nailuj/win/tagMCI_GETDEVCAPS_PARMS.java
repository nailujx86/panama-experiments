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
 * struct tagMCI_GETDEVCAPS_PARMS {
 *     DWORD_PTR dwCallback;
 *     DWORD dwReturn;
 *     DWORD dwItem;
 * }
 * }
 */
public class tagMCI_GETDEVCAPS_PARMS {

    tagMCI_GETDEVCAPS_PARMS() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.align(winapi.C_LONG_LONG, 1).withName("dwCallback"),
        winapi.align(winapi.C_LONG, 1).withName("dwReturn"),
        winapi.align(winapi.C_LONG, 1).withName("dwItem")
    ).withName("tagMCI_GETDEVCAPS_PARMS");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong dwCallback$LAYOUT = (OfLong)$LAYOUT.select(groupElement("dwCallback"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD_PTR dwCallback
     * }
     */
    public static final OfLong dwCallback$layout() {
        return dwCallback$LAYOUT;
    }

    private static final long dwCallback$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD_PTR dwCallback
     * }
     */
    public static final long dwCallback$offset() {
        return dwCallback$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD_PTR dwCallback
     * }
     */
    public static long dwCallback(MemorySegment struct) {
        return struct.get(dwCallback$LAYOUT, dwCallback$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD_PTR dwCallback
     * }
     */
    public static void dwCallback(MemorySegment struct, long fieldValue) {
        struct.set(dwCallback$LAYOUT, dwCallback$OFFSET, fieldValue);
    }

    private static final OfInt dwReturn$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwReturn"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwReturn
     * }
     */
    public static final OfInt dwReturn$layout() {
        return dwReturn$LAYOUT;
    }

    private static final long dwReturn$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwReturn
     * }
     */
    public static final long dwReturn$offset() {
        return dwReturn$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwReturn
     * }
     */
    public static int dwReturn(MemorySegment struct) {
        return struct.get(dwReturn$LAYOUT, dwReturn$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwReturn
     * }
     */
    public static void dwReturn(MemorySegment struct, int fieldValue) {
        struct.set(dwReturn$LAYOUT, dwReturn$OFFSET, fieldValue);
    }

    private static final OfInt dwItem$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwItem"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwItem
     * }
     */
    public static final OfInt dwItem$layout() {
        return dwItem$LAYOUT;
    }

    private static final long dwItem$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwItem
     * }
     */
    public static final long dwItem$offset() {
        return dwItem$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwItem
     * }
     */
    public static int dwItem(MemorySegment struct) {
        return struct.get(dwItem$LAYOUT, dwItem$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwItem
     * }
     */
    public static void dwItem(MemorySegment struct, int fieldValue) {
        struct.set(dwItem$LAYOUT, dwItem$OFFSET, fieldValue);
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

