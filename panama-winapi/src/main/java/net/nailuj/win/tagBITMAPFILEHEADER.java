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
 * struct tagBITMAPFILEHEADER {
 *     WORD bfType;
 *     DWORD bfSize;
 *     WORD bfReserved1;
 *     WORD bfReserved2;
 *     DWORD bfOffBits;
 * }
 * }
 */
public class tagBITMAPFILEHEADER {

    tagBITMAPFILEHEADER() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_SHORT.withName("bfType"),
        winapi.align(winapi.C_LONG, 2).withName("bfSize"),
        winapi.C_SHORT.withName("bfReserved1"),
        winapi.C_SHORT.withName("bfReserved2"),
        winapi.align(winapi.C_LONG, 2).withName("bfOffBits")
    ).withName("tagBITMAPFILEHEADER");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort bfType$LAYOUT = (OfShort)$LAYOUT.select(groupElement("bfType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD bfType
     * }
     */
    public static final OfShort bfType$layout() {
        return bfType$LAYOUT;
    }

    private static final long bfType$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD bfType
     * }
     */
    public static final long bfType$offset() {
        return bfType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD bfType
     * }
     */
    public static short bfType(MemorySegment struct) {
        return struct.get(bfType$LAYOUT, bfType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD bfType
     * }
     */
    public static void bfType(MemorySegment struct, short fieldValue) {
        struct.set(bfType$LAYOUT, bfType$OFFSET, fieldValue);
    }

    private static final OfInt bfSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("bfSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD bfSize
     * }
     */
    public static final OfInt bfSize$layout() {
        return bfSize$LAYOUT;
    }

    private static final long bfSize$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD bfSize
     * }
     */
    public static final long bfSize$offset() {
        return bfSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD bfSize
     * }
     */
    public static int bfSize(MemorySegment struct) {
        return struct.get(bfSize$LAYOUT, bfSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD bfSize
     * }
     */
    public static void bfSize(MemorySegment struct, int fieldValue) {
        struct.set(bfSize$LAYOUT, bfSize$OFFSET, fieldValue);
    }

    private static final OfShort bfReserved1$LAYOUT = (OfShort)$LAYOUT.select(groupElement("bfReserved1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD bfReserved1
     * }
     */
    public static final OfShort bfReserved1$layout() {
        return bfReserved1$LAYOUT;
    }

    private static final long bfReserved1$OFFSET = 6;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD bfReserved1
     * }
     */
    public static final long bfReserved1$offset() {
        return bfReserved1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD bfReserved1
     * }
     */
    public static short bfReserved1(MemorySegment struct) {
        return struct.get(bfReserved1$LAYOUT, bfReserved1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD bfReserved1
     * }
     */
    public static void bfReserved1(MemorySegment struct, short fieldValue) {
        struct.set(bfReserved1$LAYOUT, bfReserved1$OFFSET, fieldValue);
    }

    private static final OfShort bfReserved2$LAYOUT = (OfShort)$LAYOUT.select(groupElement("bfReserved2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD bfReserved2
     * }
     */
    public static final OfShort bfReserved2$layout() {
        return bfReserved2$LAYOUT;
    }

    private static final long bfReserved2$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD bfReserved2
     * }
     */
    public static final long bfReserved2$offset() {
        return bfReserved2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD bfReserved2
     * }
     */
    public static short bfReserved2(MemorySegment struct) {
        return struct.get(bfReserved2$LAYOUT, bfReserved2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD bfReserved2
     * }
     */
    public static void bfReserved2(MemorySegment struct, short fieldValue) {
        struct.set(bfReserved2$LAYOUT, bfReserved2$OFFSET, fieldValue);
    }

    private static final OfInt bfOffBits$LAYOUT = (OfInt)$LAYOUT.select(groupElement("bfOffBits"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD bfOffBits
     * }
     */
    public static final OfInt bfOffBits$layout() {
        return bfOffBits$LAYOUT;
    }

    private static final long bfOffBits$OFFSET = 10;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD bfOffBits
     * }
     */
    public static final long bfOffBits$offset() {
        return bfOffBits$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD bfOffBits
     * }
     */
    public static int bfOffBits(MemorySegment struct) {
        return struct.get(bfOffBits$LAYOUT, bfOffBits$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD bfOffBits
     * }
     */
    public static void bfOffBits(MemorySegment struct, int fieldValue) {
        struct.set(bfOffBits$LAYOUT, bfOffBits$OFFSET, fieldValue);
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

