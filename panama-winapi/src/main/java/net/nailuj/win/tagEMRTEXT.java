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
 * struct tagEMRTEXT {
 *     POINTL ptlReference;
 *     DWORD nChars;
 *     DWORD offString;
 *     DWORD fOptions;
 *     RECTL rcl;
 *     DWORD offDx;
 * }
 * }
 */
public class tagEMRTEXT {

    tagEMRTEXT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _POINTL.layout().withName("ptlReference"),
        winapi.C_LONG.withName("nChars"),
        winapi.C_LONG.withName("offString"),
        winapi.C_LONG.withName("fOptions"),
        _RECTL.layout().withName("rcl"),
        winapi.C_LONG.withName("offDx")
    ).withName("tagEMRTEXT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout ptlReference$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ptlReference"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * POINTL ptlReference
     * }
     */
    public static final GroupLayout ptlReference$layout() {
        return ptlReference$LAYOUT;
    }

    private static final long ptlReference$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * POINTL ptlReference
     * }
     */
    public static final long ptlReference$offset() {
        return ptlReference$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * POINTL ptlReference
     * }
     */
    public static MemorySegment ptlReference(MemorySegment struct) {
        return struct.asSlice(ptlReference$OFFSET, ptlReference$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * POINTL ptlReference
     * }
     */
    public static void ptlReference(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ptlReference$OFFSET, ptlReference$LAYOUT.byteSize());
    }

    private static final OfInt nChars$LAYOUT = (OfInt)$LAYOUT.select(groupElement("nChars"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD nChars
     * }
     */
    public static final OfInt nChars$layout() {
        return nChars$LAYOUT;
    }

    private static final long nChars$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD nChars
     * }
     */
    public static final long nChars$offset() {
        return nChars$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD nChars
     * }
     */
    public static int nChars(MemorySegment struct) {
        return struct.get(nChars$LAYOUT, nChars$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD nChars
     * }
     */
    public static void nChars(MemorySegment struct, int fieldValue) {
        struct.set(nChars$LAYOUT, nChars$OFFSET, fieldValue);
    }

    private static final OfInt offString$LAYOUT = (OfInt)$LAYOUT.select(groupElement("offString"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD offString
     * }
     */
    public static final OfInt offString$layout() {
        return offString$LAYOUT;
    }

    private static final long offString$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD offString
     * }
     */
    public static final long offString$offset() {
        return offString$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD offString
     * }
     */
    public static int offString(MemorySegment struct) {
        return struct.get(offString$LAYOUT, offString$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD offString
     * }
     */
    public static void offString(MemorySegment struct, int fieldValue) {
        struct.set(offString$LAYOUT, offString$OFFSET, fieldValue);
    }

    private static final OfInt fOptions$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fOptions"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD fOptions
     * }
     */
    public static final OfInt fOptions$layout() {
        return fOptions$LAYOUT;
    }

    private static final long fOptions$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD fOptions
     * }
     */
    public static final long fOptions$offset() {
        return fOptions$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD fOptions
     * }
     */
    public static int fOptions(MemorySegment struct) {
        return struct.get(fOptions$LAYOUT, fOptions$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD fOptions
     * }
     */
    public static void fOptions(MemorySegment struct, int fieldValue) {
        struct.set(fOptions$LAYOUT, fOptions$OFFSET, fieldValue);
    }

    private static final GroupLayout rcl$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("rcl"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RECTL rcl
     * }
     */
    public static final GroupLayout rcl$layout() {
        return rcl$LAYOUT;
    }

    private static final long rcl$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RECTL rcl
     * }
     */
    public static final long rcl$offset() {
        return rcl$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RECTL rcl
     * }
     */
    public static MemorySegment rcl(MemorySegment struct) {
        return struct.asSlice(rcl$OFFSET, rcl$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RECTL rcl
     * }
     */
    public static void rcl(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, rcl$OFFSET, rcl$LAYOUT.byteSize());
    }

    private static final OfInt offDx$LAYOUT = (OfInt)$LAYOUT.select(groupElement("offDx"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD offDx
     * }
     */
    public static final OfInt offDx$layout() {
        return offDx$LAYOUT;
    }

    private static final long offDx$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD offDx
     * }
     */
    public static final long offDx$offset() {
        return offDx$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD offDx
     * }
     */
    public static int offDx(MemorySegment struct) {
        return struct.get(offDx$LAYOUT, offDx$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD offDx
     * }
     */
    public static void offDx(MemorySegment struct, int fieldValue) {
        struct.set(offDx$LAYOUT, offDx$OFFSET, fieldValue);
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

