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
 * struct tagOBJECTDESCRIPTOR {
 *     ULONG cbSize;
 *     CLSID clsid;
 *     DWORD dwDrawAspect;
 *     SIZEL sizel;
 *     POINTL pointl;
 *     DWORD dwStatus;
 *     DWORD dwFullUserTypeName;
 *     DWORD dwSrcOfCopy;
 * }
 * }
 */
public class tagOBJECTDESCRIPTOR {

    tagOBJECTDESCRIPTOR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("cbSize"),
        _GUID.layout().withName("clsid"),
        winapi.C_LONG.withName("dwDrawAspect"),
        tagSIZE.layout().withName("sizel"),
        _POINTL.layout().withName("pointl"),
        winapi.C_LONG.withName("dwStatus"),
        winapi.C_LONG.withName("dwFullUserTypeName"),
        winapi.C_LONG.withName("dwSrcOfCopy")
    ).withName("tagOBJECTDESCRIPTOR");

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
     * ULONG cbSize
     * }
     */
    public static final OfInt cbSize$layout() {
        return cbSize$LAYOUT;
    }

    private static final long cbSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG cbSize
     * }
     */
    public static final long cbSize$offset() {
        return cbSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG cbSize
     * }
     */
    public static int cbSize(MemorySegment struct) {
        return struct.get(cbSize$LAYOUT, cbSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG cbSize
     * }
     */
    public static void cbSize(MemorySegment struct, int fieldValue) {
        struct.set(cbSize$LAYOUT, cbSize$OFFSET, fieldValue);
    }

    private static final GroupLayout clsid$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("clsid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CLSID clsid
     * }
     */
    public static final GroupLayout clsid$layout() {
        return clsid$LAYOUT;
    }

    private static final long clsid$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CLSID clsid
     * }
     */
    public static final long clsid$offset() {
        return clsid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CLSID clsid
     * }
     */
    public static MemorySegment clsid(MemorySegment struct) {
        return struct.asSlice(clsid$OFFSET, clsid$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CLSID clsid
     * }
     */
    public static void clsid(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, clsid$OFFSET, clsid$LAYOUT.byteSize());
    }

    private static final OfInt dwDrawAspect$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwDrawAspect"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwDrawAspect
     * }
     */
    public static final OfInt dwDrawAspect$layout() {
        return dwDrawAspect$LAYOUT;
    }

    private static final long dwDrawAspect$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwDrawAspect
     * }
     */
    public static final long dwDrawAspect$offset() {
        return dwDrawAspect$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwDrawAspect
     * }
     */
    public static int dwDrawAspect(MemorySegment struct) {
        return struct.get(dwDrawAspect$LAYOUT, dwDrawAspect$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwDrawAspect
     * }
     */
    public static void dwDrawAspect(MemorySegment struct, int fieldValue) {
        struct.set(dwDrawAspect$LAYOUT, dwDrawAspect$OFFSET, fieldValue);
    }

    private static final GroupLayout sizel$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("sizel"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SIZEL sizel
     * }
     */
    public static final GroupLayout sizel$layout() {
        return sizel$LAYOUT;
    }

    private static final long sizel$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SIZEL sizel
     * }
     */
    public static final long sizel$offset() {
        return sizel$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SIZEL sizel
     * }
     */
    public static MemorySegment sizel(MemorySegment struct) {
        return struct.asSlice(sizel$OFFSET, sizel$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SIZEL sizel
     * }
     */
    public static void sizel(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, sizel$OFFSET, sizel$LAYOUT.byteSize());
    }

    private static final GroupLayout pointl$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("pointl"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * POINTL pointl
     * }
     */
    public static final GroupLayout pointl$layout() {
        return pointl$LAYOUT;
    }

    private static final long pointl$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * POINTL pointl
     * }
     */
    public static final long pointl$offset() {
        return pointl$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * POINTL pointl
     * }
     */
    public static MemorySegment pointl(MemorySegment struct) {
        return struct.asSlice(pointl$OFFSET, pointl$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * POINTL pointl
     * }
     */
    public static void pointl(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, pointl$OFFSET, pointl$LAYOUT.byteSize());
    }

    private static final OfInt dwStatus$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwStatus"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwStatus
     * }
     */
    public static final OfInt dwStatus$layout() {
        return dwStatus$LAYOUT;
    }

    private static final long dwStatus$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwStatus
     * }
     */
    public static final long dwStatus$offset() {
        return dwStatus$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwStatus
     * }
     */
    public static int dwStatus(MemorySegment struct) {
        return struct.get(dwStatus$LAYOUT, dwStatus$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwStatus
     * }
     */
    public static void dwStatus(MemorySegment struct, int fieldValue) {
        struct.set(dwStatus$LAYOUT, dwStatus$OFFSET, fieldValue);
    }

    private static final OfInt dwFullUserTypeName$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwFullUserTypeName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwFullUserTypeName
     * }
     */
    public static final OfInt dwFullUserTypeName$layout() {
        return dwFullUserTypeName$LAYOUT;
    }

    private static final long dwFullUserTypeName$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwFullUserTypeName
     * }
     */
    public static final long dwFullUserTypeName$offset() {
        return dwFullUserTypeName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwFullUserTypeName
     * }
     */
    public static int dwFullUserTypeName(MemorySegment struct) {
        return struct.get(dwFullUserTypeName$LAYOUT, dwFullUserTypeName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwFullUserTypeName
     * }
     */
    public static void dwFullUserTypeName(MemorySegment struct, int fieldValue) {
        struct.set(dwFullUserTypeName$LAYOUT, dwFullUserTypeName$OFFSET, fieldValue);
    }

    private static final OfInt dwSrcOfCopy$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwSrcOfCopy"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwSrcOfCopy
     * }
     */
    public static final OfInt dwSrcOfCopy$layout() {
        return dwSrcOfCopy$LAYOUT;
    }

    private static final long dwSrcOfCopy$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwSrcOfCopy
     * }
     */
    public static final long dwSrcOfCopy$offset() {
        return dwSrcOfCopy$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwSrcOfCopy
     * }
     */
    public static int dwSrcOfCopy(MemorySegment struct) {
        return struct.get(dwSrcOfCopy$LAYOUT, dwSrcOfCopy$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwSrcOfCopy
     * }
     */
    public static void dwSrcOfCopy(MemorySegment struct, int fieldValue) {
        struct.set(dwSrcOfCopy$LAYOUT, dwSrcOfCopy$OFFSET, fieldValue);
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

