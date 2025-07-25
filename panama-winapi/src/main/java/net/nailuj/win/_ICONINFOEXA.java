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
 * struct _ICONINFOEXA {
 *     DWORD cbSize;
 *     BOOL fIcon;
 *     DWORD xHotspot;
 *     DWORD yHotspot;
 *     HBITMAP hbmMask;
 *     HBITMAP hbmColor;
 *     WORD wResID;
 *     CHAR szModName[260];
 *     CHAR szResName[260];
 * }
 * }
 */
public class _ICONINFOEXA {

    _ICONINFOEXA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("cbSize"),
        winapi.C_INT.withName("fIcon"),
        winapi.C_LONG.withName("xHotspot"),
        winapi.C_LONG.withName("yHotspot"),
        winapi.C_POINTER.withName("hbmMask"),
        winapi.C_POINTER.withName("hbmColor"),
        winapi.C_SHORT.withName("wResID"),
        MemoryLayout.sequenceLayout(260, winapi.C_CHAR).withName("szModName"),
        MemoryLayout.sequenceLayout(260, winapi.C_CHAR).withName("szResName"),
        MemoryLayout.paddingLayout(6)
    ).withName("_ICONINFOEXA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cbSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static final OfInt cbSize$layout() {
        return cbSize$LAYOUT;
    }

    private static final long cbSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static final long cbSize$offset() {
        return cbSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static int cbSize(MemorySegment struct) {
        return struct.get(cbSize$LAYOUT, cbSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static void cbSize(MemorySegment struct, int fieldValue) {
        struct.set(cbSize$LAYOUT, cbSize$OFFSET, fieldValue);
    }

    private static final OfInt fIcon$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fIcon"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOL fIcon
     * }
     */
    public static final OfInt fIcon$layout() {
        return fIcon$LAYOUT;
    }

    private static final long fIcon$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOL fIcon
     * }
     */
    public static final long fIcon$offset() {
        return fIcon$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOL fIcon
     * }
     */
    public static int fIcon(MemorySegment struct) {
        return struct.get(fIcon$LAYOUT, fIcon$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOL fIcon
     * }
     */
    public static void fIcon(MemorySegment struct, int fieldValue) {
        struct.set(fIcon$LAYOUT, fIcon$OFFSET, fieldValue);
    }

    private static final OfInt xHotspot$LAYOUT = (OfInt)$LAYOUT.select(groupElement("xHotspot"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD xHotspot
     * }
     */
    public static final OfInt xHotspot$layout() {
        return xHotspot$LAYOUT;
    }

    private static final long xHotspot$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD xHotspot
     * }
     */
    public static final long xHotspot$offset() {
        return xHotspot$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD xHotspot
     * }
     */
    public static int xHotspot(MemorySegment struct) {
        return struct.get(xHotspot$LAYOUT, xHotspot$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD xHotspot
     * }
     */
    public static void xHotspot(MemorySegment struct, int fieldValue) {
        struct.set(xHotspot$LAYOUT, xHotspot$OFFSET, fieldValue);
    }

    private static final OfInt yHotspot$LAYOUT = (OfInt)$LAYOUT.select(groupElement("yHotspot"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD yHotspot
     * }
     */
    public static final OfInt yHotspot$layout() {
        return yHotspot$LAYOUT;
    }

    private static final long yHotspot$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD yHotspot
     * }
     */
    public static final long yHotspot$offset() {
        return yHotspot$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD yHotspot
     * }
     */
    public static int yHotspot(MemorySegment struct) {
        return struct.get(yHotspot$LAYOUT, yHotspot$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD yHotspot
     * }
     */
    public static void yHotspot(MemorySegment struct, int fieldValue) {
        struct.set(yHotspot$LAYOUT, yHotspot$OFFSET, fieldValue);
    }

    private static final AddressLayout hbmMask$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hbmMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HBITMAP hbmMask
     * }
     */
    public static final AddressLayout hbmMask$layout() {
        return hbmMask$LAYOUT;
    }

    private static final long hbmMask$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HBITMAP hbmMask
     * }
     */
    public static final long hbmMask$offset() {
        return hbmMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HBITMAP hbmMask
     * }
     */
    public static MemorySegment hbmMask(MemorySegment struct) {
        return struct.get(hbmMask$LAYOUT, hbmMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HBITMAP hbmMask
     * }
     */
    public static void hbmMask(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hbmMask$LAYOUT, hbmMask$OFFSET, fieldValue);
    }

    private static final AddressLayout hbmColor$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hbmColor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HBITMAP hbmColor
     * }
     */
    public static final AddressLayout hbmColor$layout() {
        return hbmColor$LAYOUT;
    }

    private static final long hbmColor$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HBITMAP hbmColor
     * }
     */
    public static final long hbmColor$offset() {
        return hbmColor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HBITMAP hbmColor
     * }
     */
    public static MemorySegment hbmColor(MemorySegment struct) {
        return struct.get(hbmColor$LAYOUT, hbmColor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HBITMAP hbmColor
     * }
     */
    public static void hbmColor(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hbmColor$LAYOUT, hbmColor$OFFSET, fieldValue);
    }

    private static final OfShort wResID$LAYOUT = (OfShort)$LAYOUT.select(groupElement("wResID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD wResID
     * }
     */
    public static final OfShort wResID$layout() {
        return wResID$LAYOUT;
    }

    private static final long wResID$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD wResID
     * }
     */
    public static final long wResID$offset() {
        return wResID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD wResID
     * }
     */
    public static short wResID(MemorySegment struct) {
        return struct.get(wResID$LAYOUT, wResID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD wResID
     * }
     */
    public static void wResID(MemorySegment struct, short fieldValue) {
        struct.set(wResID$LAYOUT, wResID$OFFSET, fieldValue);
    }

    private static final SequenceLayout szModName$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("szModName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CHAR szModName[260]
     * }
     */
    public static final SequenceLayout szModName$layout() {
        return szModName$LAYOUT;
    }

    private static final long szModName$OFFSET = 34;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CHAR szModName[260]
     * }
     */
    public static final long szModName$offset() {
        return szModName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CHAR szModName[260]
     * }
     */
    public static MemorySegment szModName(MemorySegment struct) {
        return struct.asSlice(szModName$OFFSET, szModName$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CHAR szModName[260]
     * }
     */
    public static void szModName(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, szModName$OFFSET, szModName$LAYOUT.byteSize());
    }

    private static long[] szModName$DIMS = { 260 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * CHAR szModName[260]
     * }
     */
    public static long[] szModName$dimensions() {
        return szModName$DIMS;
    }
    private static final VarHandle szModName$ELEM_HANDLE = szModName$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * CHAR szModName[260]
     * }
     */
    public static byte szModName(MemorySegment struct, long index0) {
        return (byte)szModName$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * CHAR szModName[260]
     * }
     */
    public static void szModName(MemorySegment struct, long index0, byte fieldValue) {
        szModName$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout szResName$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("szResName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CHAR szResName[260]
     * }
     */
    public static final SequenceLayout szResName$layout() {
        return szResName$LAYOUT;
    }

    private static final long szResName$OFFSET = 294;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CHAR szResName[260]
     * }
     */
    public static final long szResName$offset() {
        return szResName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CHAR szResName[260]
     * }
     */
    public static MemorySegment szResName(MemorySegment struct) {
        return struct.asSlice(szResName$OFFSET, szResName$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CHAR szResName[260]
     * }
     */
    public static void szResName(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, szResName$OFFSET, szResName$LAYOUT.byteSize());
    }

    private static long[] szResName$DIMS = { 260 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * CHAR szResName[260]
     * }
     */
    public static long[] szResName$dimensions() {
        return szResName$DIMS;
    }
    private static final VarHandle szResName$ELEM_HANDLE = szResName$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * CHAR szResName[260]
     * }
     */
    public static byte szResName(MemorySegment struct, long index0) {
        return (byte)szResName$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * CHAR szResName[260]
     * }
     */
    public static void szResName(MemorySegment struct, long index0, byte fieldValue) {
        szResName$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

