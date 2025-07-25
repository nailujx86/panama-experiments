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
 * struct tagUPDATELAYEREDWINDOWINFO {
 *     DWORD cbSize;
 *     HDC hdcDst;
 *     const POINT *pptDst;
 *     const SIZE *psize;
 *     HDC hdcSrc;
 *     const POINT *pptSrc;
 *     COLORREF crKey;
 *     const BLENDFUNCTION *pblend;
 *     DWORD dwFlags;
 *     const RECT *prcDirty;
 * }
 * }
 */
public class tagUPDATELAYEREDWINDOWINFO {

    tagUPDATELAYEREDWINDOWINFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("cbSize"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("hdcDst"),
        winapi.C_POINTER.withName("pptDst"),
        winapi.C_POINTER.withName("psize"),
        winapi.C_POINTER.withName("hdcSrc"),
        winapi.C_POINTER.withName("pptSrc"),
        winapi.C_LONG.withName("crKey"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("pblend"),
        winapi.C_LONG.withName("dwFlags"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("prcDirty")
    ).withName("tagUPDATELAYEREDWINDOWINFO");

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

    private static final AddressLayout hdcDst$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hdcDst"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HDC hdcDst
     * }
     */
    public static final AddressLayout hdcDst$layout() {
        return hdcDst$LAYOUT;
    }

    private static final long hdcDst$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HDC hdcDst
     * }
     */
    public static final long hdcDst$offset() {
        return hdcDst$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HDC hdcDst
     * }
     */
    public static MemorySegment hdcDst(MemorySegment struct) {
        return struct.get(hdcDst$LAYOUT, hdcDst$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HDC hdcDst
     * }
     */
    public static void hdcDst(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hdcDst$LAYOUT, hdcDst$OFFSET, fieldValue);
    }

    private static final AddressLayout pptDst$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pptDst"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const POINT *pptDst
     * }
     */
    public static final AddressLayout pptDst$layout() {
        return pptDst$LAYOUT;
    }

    private static final long pptDst$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const POINT *pptDst
     * }
     */
    public static final long pptDst$offset() {
        return pptDst$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const POINT *pptDst
     * }
     */
    public static MemorySegment pptDst(MemorySegment struct) {
        return struct.get(pptDst$LAYOUT, pptDst$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const POINT *pptDst
     * }
     */
    public static void pptDst(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pptDst$LAYOUT, pptDst$OFFSET, fieldValue);
    }

    private static final AddressLayout psize$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("psize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const SIZE *psize
     * }
     */
    public static final AddressLayout psize$layout() {
        return psize$LAYOUT;
    }

    private static final long psize$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const SIZE *psize
     * }
     */
    public static final long psize$offset() {
        return psize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const SIZE *psize
     * }
     */
    public static MemorySegment psize(MemorySegment struct) {
        return struct.get(psize$LAYOUT, psize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const SIZE *psize
     * }
     */
    public static void psize(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(psize$LAYOUT, psize$OFFSET, fieldValue);
    }

    private static final AddressLayout hdcSrc$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hdcSrc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HDC hdcSrc
     * }
     */
    public static final AddressLayout hdcSrc$layout() {
        return hdcSrc$LAYOUT;
    }

    private static final long hdcSrc$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HDC hdcSrc
     * }
     */
    public static final long hdcSrc$offset() {
        return hdcSrc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HDC hdcSrc
     * }
     */
    public static MemorySegment hdcSrc(MemorySegment struct) {
        return struct.get(hdcSrc$LAYOUT, hdcSrc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HDC hdcSrc
     * }
     */
    public static void hdcSrc(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hdcSrc$LAYOUT, hdcSrc$OFFSET, fieldValue);
    }

    private static final AddressLayout pptSrc$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pptSrc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const POINT *pptSrc
     * }
     */
    public static final AddressLayout pptSrc$layout() {
        return pptSrc$LAYOUT;
    }

    private static final long pptSrc$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const POINT *pptSrc
     * }
     */
    public static final long pptSrc$offset() {
        return pptSrc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const POINT *pptSrc
     * }
     */
    public static MemorySegment pptSrc(MemorySegment struct) {
        return struct.get(pptSrc$LAYOUT, pptSrc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const POINT *pptSrc
     * }
     */
    public static void pptSrc(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pptSrc$LAYOUT, pptSrc$OFFSET, fieldValue);
    }

    private static final OfInt crKey$LAYOUT = (OfInt)$LAYOUT.select(groupElement("crKey"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * COLORREF crKey
     * }
     */
    public static final OfInt crKey$layout() {
        return crKey$LAYOUT;
    }

    private static final long crKey$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * COLORREF crKey
     * }
     */
    public static final long crKey$offset() {
        return crKey$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * COLORREF crKey
     * }
     */
    public static int crKey(MemorySegment struct) {
        return struct.get(crKey$LAYOUT, crKey$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * COLORREF crKey
     * }
     */
    public static void crKey(MemorySegment struct, int fieldValue) {
        struct.set(crKey$LAYOUT, crKey$OFFSET, fieldValue);
    }

    private static final AddressLayout pblend$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pblend"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const BLENDFUNCTION *pblend
     * }
     */
    public static final AddressLayout pblend$layout() {
        return pblend$LAYOUT;
    }

    private static final long pblend$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const BLENDFUNCTION *pblend
     * }
     */
    public static final long pblend$offset() {
        return pblend$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const BLENDFUNCTION *pblend
     * }
     */
    public static MemorySegment pblend(MemorySegment struct) {
        return struct.get(pblend$LAYOUT, pblend$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const BLENDFUNCTION *pblend
     * }
     */
    public static void pblend(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pblend$LAYOUT, pblend$OFFSET, fieldValue);
    }

    private static final OfInt dwFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwFlags
     * }
     */
    public static final OfInt dwFlags$layout() {
        return dwFlags$LAYOUT;
    }

    private static final long dwFlags$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwFlags
     * }
     */
    public static final long dwFlags$offset() {
        return dwFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwFlags
     * }
     */
    public static int dwFlags(MemorySegment struct) {
        return struct.get(dwFlags$LAYOUT, dwFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwFlags
     * }
     */
    public static void dwFlags(MemorySegment struct, int fieldValue) {
        struct.set(dwFlags$LAYOUT, dwFlags$OFFSET, fieldValue);
    }

    private static final AddressLayout prcDirty$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("prcDirty"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const RECT *prcDirty
     * }
     */
    public static final AddressLayout prcDirty$layout() {
        return prcDirty$LAYOUT;
    }

    private static final long prcDirty$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const RECT *prcDirty
     * }
     */
    public static final long prcDirty$offset() {
        return prcDirty$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const RECT *prcDirty
     * }
     */
    public static MemorySegment prcDirty(MemorySegment struct) {
        return struct.get(prcDirty$LAYOUT, prcDirty$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const RECT *prcDirty
     * }
     */
    public static void prcDirty(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(prcDirty$LAYOUT, prcDirty$OFFSET, fieldValue);
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

