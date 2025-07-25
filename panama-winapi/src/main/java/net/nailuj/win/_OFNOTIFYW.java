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
 * struct _OFNOTIFYW {
 *     NMHDR hdr;
 *     LPOPENFILENAMEW lpOFN;
 *     LPWSTR pszFile;
 * }
 * }
 */
public class _OFNOTIFYW {

    _OFNOTIFYW() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        tagNMHDR.layout().withName("hdr"),
        winapi.C_POINTER.withName("lpOFN"),
        winapi.C_POINTER.withName("pszFile")
    ).withName("_OFNOTIFYW");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout hdr$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("hdr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * NMHDR hdr
     * }
     */
    public static final GroupLayout hdr$layout() {
        return hdr$LAYOUT;
    }

    private static final long hdr$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * NMHDR hdr
     * }
     */
    public static final long hdr$offset() {
        return hdr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * NMHDR hdr
     * }
     */
    public static MemorySegment hdr(MemorySegment struct) {
        return struct.asSlice(hdr$OFFSET, hdr$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * NMHDR hdr
     * }
     */
    public static void hdr(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, hdr$OFFSET, hdr$LAYOUT.byteSize());
    }

    private static final AddressLayout lpOFN$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpOFN"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPOPENFILENAMEW lpOFN
     * }
     */
    public static final AddressLayout lpOFN$layout() {
        return lpOFN$LAYOUT;
    }

    private static final long lpOFN$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPOPENFILENAMEW lpOFN
     * }
     */
    public static final long lpOFN$offset() {
        return lpOFN$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPOPENFILENAMEW lpOFN
     * }
     */
    public static MemorySegment lpOFN(MemorySegment struct) {
        return struct.get(lpOFN$LAYOUT, lpOFN$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPOPENFILENAMEW lpOFN
     * }
     */
    public static void lpOFN(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpOFN$LAYOUT, lpOFN$OFFSET, fieldValue);
    }

    private static final AddressLayout pszFile$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pszFile"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR pszFile
     * }
     */
    public static final AddressLayout pszFile$layout() {
        return pszFile$LAYOUT;
    }

    private static final long pszFile$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR pszFile
     * }
     */
    public static final long pszFile$offset() {
        return pszFile$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR pszFile
     * }
     */
    public static MemorySegment pszFile(MemorySegment struct) {
        return struct.get(pszFile$LAYOUT, pszFile$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR pszFile
     * }
     */
    public static void pszFile(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pszFile$LAYOUT, pszFile$OFFSET, fieldValue);
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

