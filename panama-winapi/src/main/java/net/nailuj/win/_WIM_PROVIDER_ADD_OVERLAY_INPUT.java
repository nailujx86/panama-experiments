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
 * struct _WIM_PROVIDER_ADD_OVERLAY_INPUT {
 *     DWORD WimType;
 *     DWORD WimIndex;
 *     DWORD WimFileNameOffset;
 *     DWORD WimFileNameLength;
 * }
 * }
 */
public class _WIM_PROVIDER_ADD_OVERLAY_INPUT {

    _WIM_PROVIDER_ADD_OVERLAY_INPUT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("WimType"),
        winapi.C_LONG.withName("WimIndex"),
        winapi.C_LONG.withName("WimFileNameOffset"),
        winapi.C_LONG.withName("WimFileNameLength")
    ).withName("_WIM_PROVIDER_ADD_OVERLAY_INPUT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt WimType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("WimType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD WimType
     * }
     */
    public static final OfInt WimType$layout() {
        return WimType$LAYOUT;
    }

    private static final long WimType$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD WimType
     * }
     */
    public static final long WimType$offset() {
        return WimType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD WimType
     * }
     */
    public static int WimType(MemorySegment struct) {
        return struct.get(WimType$LAYOUT, WimType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD WimType
     * }
     */
    public static void WimType(MemorySegment struct, int fieldValue) {
        struct.set(WimType$LAYOUT, WimType$OFFSET, fieldValue);
    }

    private static final OfInt WimIndex$LAYOUT = (OfInt)$LAYOUT.select(groupElement("WimIndex"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD WimIndex
     * }
     */
    public static final OfInt WimIndex$layout() {
        return WimIndex$LAYOUT;
    }

    private static final long WimIndex$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD WimIndex
     * }
     */
    public static final long WimIndex$offset() {
        return WimIndex$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD WimIndex
     * }
     */
    public static int WimIndex(MemorySegment struct) {
        return struct.get(WimIndex$LAYOUT, WimIndex$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD WimIndex
     * }
     */
    public static void WimIndex(MemorySegment struct, int fieldValue) {
        struct.set(WimIndex$LAYOUT, WimIndex$OFFSET, fieldValue);
    }

    private static final OfInt WimFileNameOffset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("WimFileNameOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD WimFileNameOffset
     * }
     */
    public static final OfInt WimFileNameOffset$layout() {
        return WimFileNameOffset$LAYOUT;
    }

    private static final long WimFileNameOffset$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD WimFileNameOffset
     * }
     */
    public static final long WimFileNameOffset$offset() {
        return WimFileNameOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD WimFileNameOffset
     * }
     */
    public static int WimFileNameOffset(MemorySegment struct) {
        return struct.get(WimFileNameOffset$LAYOUT, WimFileNameOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD WimFileNameOffset
     * }
     */
    public static void WimFileNameOffset(MemorySegment struct, int fieldValue) {
        struct.set(WimFileNameOffset$LAYOUT, WimFileNameOffset$OFFSET, fieldValue);
    }

    private static final OfInt WimFileNameLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("WimFileNameLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD WimFileNameLength
     * }
     */
    public static final OfInt WimFileNameLength$layout() {
        return WimFileNameLength$LAYOUT;
    }

    private static final long WimFileNameLength$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD WimFileNameLength
     * }
     */
    public static final long WimFileNameLength$offset() {
        return WimFileNameLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD WimFileNameLength
     * }
     */
    public static int WimFileNameLength(MemorySegment struct) {
        return struct.get(WimFileNameLength$LAYOUT, WimFileNameLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD WimFileNameLength
     * }
     */
    public static void WimFileNameLength(MemorySegment struct, int fieldValue) {
        struct.set(WimFileNameLength$LAYOUT, WimFileNameLength$OFFSET, fieldValue);
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

