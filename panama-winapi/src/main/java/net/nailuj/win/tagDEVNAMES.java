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
 * struct tagDEVNAMES {
 *     WORD wDriverOffset;
 *     WORD wDeviceOffset;
 *     WORD wOutputOffset;
 *     WORD wDefault;
 * }
 * }
 */
public class tagDEVNAMES {

    tagDEVNAMES() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_SHORT.withName("wDriverOffset"),
        winapi.C_SHORT.withName("wDeviceOffset"),
        winapi.C_SHORT.withName("wOutputOffset"),
        winapi.C_SHORT.withName("wDefault")
    ).withName("tagDEVNAMES");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort wDriverOffset$LAYOUT = (OfShort)$LAYOUT.select(groupElement("wDriverOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD wDriverOffset
     * }
     */
    public static final OfShort wDriverOffset$layout() {
        return wDriverOffset$LAYOUT;
    }

    private static final long wDriverOffset$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD wDriverOffset
     * }
     */
    public static final long wDriverOffset$offset() {
        return wDriverOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD wDriverOffset
     * }
     */
    public static short wDriverOffset(MemorySegment struct) {
        return struct.get(wDriverOffset$LAYOUT, wDriverOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD wDriverOffset
     * }
     */
    public static void wDriverOffset(MemorySegment struct, short fieldValue) {
        struct.set(wDriverOffset$LAYOUT, wDriverOffset$OFFSET, fieldValue);
    }

    private static final OfShort wDeviceOffset$LAYOUT = (OfShort)$LAYOUT.select(groupElement("wDeviceOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD wDeviceOffset
     * }
     */
    public static final OfShort wDeviceOffset$layout() {
        return wDeviceOffset$LAYOUT;
    }

    private static final long wDeviceOffset$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD wDeviceOffset
     * }
     */
    public static final long wDeviceOffset$offset() {
        return wDeviceOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD wDeviceOffset
     * }
     */
    public static short wDeviceOffset(MemorySegment struct) {
        return struct.get(wDeviceOffset$LAYOUT, wDeviceOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD wDeviceOffset
     * }
     */
    public static void wDeviceOffset(MemorySegment struct, short fieldValue) {
        struct.set(wDeviceOffset$LAYOUT, wDeviceOffset$OFFSET, fieldValue);
    }

    private static final OfShort wOutputOffset$LAYOUT = (OfShort)$LAYOUT.select(groupElement("wOutputOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD wOutputOffset
     * }
     */
    public static final OfShort wOutputOffset$layout() {
        return wOutputOffset$LAYOUT;
    }

    private static final long wOutputOffset$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD wOutputOffset
     * }
     */
    public static final long wOutputOffset$offset() {
        return wOutputOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD wOutputOffset
     * }
     */
    public static short wOutputOffset(MemorySegment struct) {
        return struct.get(wOutputOffset$LAYOUT, wOutputOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD wOutputOffset
     * }
     */
    public static void wOutputOffset(MemorySegment struct, short fieldValue) {
        struct.set(wOutputOffset$LAYOUT, wOutputOffset$OFFSET, fieldValue);
    }

    private static final OfShort wDefault$LAYOUT = (OfShort)$LAYOUT.select(groupElement("wDefault"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD wDefault
     * }
     */
    public static final OfShort wDefault$layout() {
        return wDefault$LAYOUT;
    }

    private static final long wDefault$OFFSET = 6;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD wDefault
     * }
     */
    public static final long wDefault$offset() {
        return wDefault$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD wDefault
     * }
     */
    public static short wDefault(MemorySegment struct) {
        return struct.get(wDefault$LAYOUT, wDefault$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD wDefault
     * }
     */
    public static void wDefault(MemorySegment struct, short fieldValue) {
        struct.set(wDefault$LAYOUT, wDefault$OFFSET, fieldValue);
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

