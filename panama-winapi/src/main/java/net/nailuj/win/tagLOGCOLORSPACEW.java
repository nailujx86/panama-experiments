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
 * struct tagLOGCOLORSPACEW {
 *     DWORD lcsSignature;
 *     DWORD lcsVersion;
 *     DWORD lcsSize;
 *     LCSCSTYPE lcsCSType;
 *     LCSGAMUTMATCH lcsIntent;
 *     CIEXYZTRIPLE lcsEndpoints;
 *     DWORD lcsGammaRed;
 *     DWORD lcsGammaGreen;
 *     DWORD lcsGammaBlue;
 *     WCHAR lcsFilename[260];
 * }
 * }
 */
public class tagLOGCOLORSPACEW {

    tagLOGCOLORSPACEW() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("lcsSignature"),
        winapi.C_LONG.withName("lcsVersion"),
        winapi.C_LONG.withName("lcsSize"),
        winapi.C_LONG.withName("lcsCSType"),
        winapi.C_LONG.withName("lcsIntent"),
        tagICEXYZTRIPLE.layout().withName("lcsEndpoints"),
        winapi.C_LONG.withName("lcsGammaRed"),
        winapi.C_LONG.withName("lcsGammaGreen"),
        winapi.C_LONG.withName("lcsGammaBlue"),
        MemoryLayout.sequenceLayout(260, winapi.C_SHORT).withName("lcsFilename")
    ).withName("tagLOGCOLORSPACEW");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt lcsSignature$LAYOUT = (OfInt)$LAYOUT.select(groupElement("lcsSignature"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD lcsSignature
     * }
     */
    public static final OfInt lcsSignature$layout() {
        return lcsSignature$LAYOUT;
    }

    private static final long lcsSignature$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD lcsSignature
     * }
     */
    public static final long lcsSignature$offset() {
        return lcsSignature$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD lcsSignature
     * }
     */
    public static int lcsSignature(MemorySegment struct) {
        return struct.get(lcsSignature$LAYOUT, lcsSignature$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD lcsSignature
     * }
     */
    public static void lcsSignature(MemorySegment struct, int fieldValue) {
        struct.set(lcsSignature$LAYOUT, lcsSignature$OFFSET, fieldValue);
    }

    private static final OfInt lcsVersion$LAYOUT = (OfInt)$LAYOUT.select(groupElement("lcsVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD lcsVersion
     * }
     */
    public static final OfInt lcsVersion$layout() {
        return lcsVersion$LAYOUT;
    }

    private static final long lcsVersion$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD lcsVersion
     * }
     */
    public static final long lcsVersion$offset() {
        return lcsVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD lcsVersion
     * }
     */
    public static int lcsVersion(MemorySegment struct) {
        return struct.get(lcsVersion$LAYOUT, lcsVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD lcsVersion
     * }
     */
    public static void lcsVersion(MemorySegment struct, int fieldValue) {
        struct.set(lcsVersion$LAYOUT, lcsVersion$OFFSET, fieldValue);
    }

    private static final OfInt lcsSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("lcsSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD lcsSize
     * }
     */
    public static final OfInt lcsSize$layout() {
        return lcsSize$LAYOUT;
    }

    private static final long lcsSize$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD lcsSize
     * }
     */
    public static final long lcsSize$offset() {
        return lcsSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD lcsSize
     * }
     */
    public static int lcsSize(MemorySegment struct) {
        return struct.get(lcsSize$LAYOUT, lcsSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD lcsSize
     * }
     */
    public static void lcsSize(MemorySegment struct, int fieldValue) {
        struct.set(lcsSize$LAYOUT, lcsSize$OFFSET, fieldValue);
    }

    private static final OfInt lcsCSType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("lcsCSType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LCSCSTYPE lcsCSType
     * }
     */
    public static final OfInt lcsCSType$layout() {
        return lcsCSType$LAYOUT;
    }

    private static final long lcsCSType$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LCSCSTYPE lcsCSType
     * }
     */
    public static final long lcsCSType$offset() {
        return lcsCSType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LCSCSTYPE lcsCSType
     * }
     */
    public static int lcsCSType(MemorySegment struct) {
        return struct.get(lcsCSType$LAYOUT, lcsCSType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LCSCSTYPE lcsCSType
     * }
     */
    public static void lcsCSType(MemorySegment struct, int fieldValue) {
        struct.set(lcsCSType$LAYOUT, lcsCSType$OFFSET, fieldValue);
    }

    private static final OfInt lcsIntent$LAYOUT = (OfInt)$LAYOUT.select(groupElement("lcsIntent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LCSGAMUTMATCH lcsIntent
     * }
     */
    public static final OfInt lcsIntent$layout() {
        return lcsIntent$LAYOUT;
    }

    private static final long lcsIntent$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LCSGAMUTMATCH lcsIntent
     * }
     */
    public static final long lcsIntent$offset() {
        return lcsIntent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LCSGAMUTMATCH lcsIntent
     * }
     */
    public static int lcsIntent(MemorySegment struct) {
        return struct.get(lcsIntent$LAYOUT, lcsIntent$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LCSGAMUTMATCH lcsIntent
     * }
     */
    public static void lcsIntent(MemorySegment struct, int fieldValue) {
        struct.set(lcsIntent$LAYOUT, lcsIntent$OFFSET, fieldValue);
    }

    private static final GroupLayout lcsEndpoints$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("lcsEndpoints"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CIEXYZTRIPLE lcsEndpoints
     * }
     */
    public static final GroupLayout lcsEndpoints$layout() {
        return lcsEndpoints$LAYOUT;
    }

    private static final long lcsEndpoints$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CIEXYZTRIPLE lcsEndpoints
     * }
     */
    public static final long lcsEndpoints$offset() {
        return lcsEndpoints$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CIEXYZTRIPLE lcsEndpoints
     * }
     */
    public static MemorySegment lcsEndpoints(MemorySegment struct) {
        return struct.asSlice(lcsEndpoints$OFFSET, lcsEndpoints$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CIEXYZTRIPLE lcsEndpoints
     * }
     */
    public static void lcsEndpoints(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, lcsEndpoints$OFFSET, lcsEndpoints$LAYOUT.byteSize());
    }

    private static final OfInt lcsGammaRed$LAYOUT = (OfInt)$LAYOUT.select(groupElement("lcsGammaRed"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD lcsGammaRed
     * }
     */
    public static final OfInt lcsGammaRed$layout() {
        return lcsGammaRed$LAYOUT;
    }

    private static final long lcsGammaRed$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD lcsGammaRed
     * }
     */
    public static final long lcsGammaRed$offset() {
        return lcsGammaRed$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD lcsGammaRed
     * }
     */
    public static int lcsGammaRed(MemorySegment struct) {
        return struct.get(lcsGammaRed$LAYOUT, lcsGammaRed$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD lcsGammaRed
     * }
     */
    public static void lcsGammaRed(MemorySegment struct, int fieldValue) {
        struct.set(lcsGammaRed$LAYOUT, lcsGammaRed$OFFSET, fieldValue);
    }

    private static final OfInt lcsGammaGreen$LAYOUT = (OfInt)$LAYOUT.select(groupElement("lcsGammaGreen"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD lcsGammaGreen
     * }
     */
    public static final OfInt lcsGammaGreen$layout() {
        return lcsGammaGreen$LAYOUT;
    }

    private static final long lcsGammaGreen$OFFSET = 60;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD lcsGammaGreen
     * }
     */
    public static final long lcsGammaGreen$offset() {
        return lcsGammaGreen$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD lcsGammaGreen
     * }
     */
    public static int lcsGammaGreen(MemorySegment struct) {
        return struct.get(lcsGammaGreen$LAYOUT, lcsGammaGreen$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD lcsGammaGreen
     * }
     */
    public static void lcsGammaGreen(MemorySegment struct, int fieldValue) {
        struct.set(lcsGammaGreen$LAYOUT, lcsGammaGreen$OFFSET, fieldValue);
    }

    private static final OfInt lcsGammaBlue$LAYOUT = (OfInt)$LAYOUT.select(groupElement("lcsGammaBlue"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD lcsGammaBlue
     * }
     */
    public static final OfInt lcsGammaBlue$layout() {
        return lcsGammaBlue$LAYOUT;
    }

    private static final long lcsGammaBlue$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD lcsGammaBlue
     * }
     */
    public static final long lcsGammaBlue$offset() {
        return lcsGammaBlue$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD lcsGammaBlue
     * }
     */
    public static int lcsGammaBlue(MemorySegment struct) {
        return struct.get(lcsGammaBlue$LAYOUT, lcsGammaBlue$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD lcsGammaBlue
     * }
     */
    public static void lcsGammaBlue(MemorySegment struct, int fieldValue) {
        struct.set(lcsGammaBlue$LAYOUT, lcsGammaBlue$OFFSET, fieldValue);
    }

    private static final SequenceLayout lcsFilename$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("lcsFilename"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WCHAR lcsFilename[260]
     * }
     */
    public static final SequenceLayout lcsFilename$layout() {
        return lcsFilename$LAYOUT;
    }

    private static final long lcsFilename$OFFSET = 68;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WCHAR lcsFilename[260]
     * }
     */
    public static final long lcsFilename$offset() {
        return lcsFilename$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WCHAR lcsFilename[260]
     * }
     */
    public static MemorySegment lcsFilename(MemorySegment struct) {
        return struct.asSlice(lcsFilename$OFFSET, lcsFilename$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WCHAR lcsFilename[260]
     * }
     */
    public static void lcsFilename(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, lcsFilename$OFFSET, lcsFilename$LAYOUT.byteSize());
    }

    private static long[] lcsFilename$DIMS = { 260 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * WCHAR lcsFilename[260]
     * }
     */
    public static long[] lcsFilename$dimensions() {
        return lcsFilename$DIMS;
    }
    private static final VarHandle lcsFilename$ELEM_HANDLE = lcsFilename$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * WCHAR lcsFilename[260]
     * }
     */
    public static short lcsFilename(MemorySegment struct, long index0) {
        return (short)lcsFilename$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * WCHAR lcsFilename[260]
     * }
     */
    public static void lcsFilename(MemorySegment struct, long index0, short fieldValue) {
        lcsFilename$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

