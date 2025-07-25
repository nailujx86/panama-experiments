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
 * struct _CERT_STORE_PROV_INFO {
 *     DWORD cbSize;
 *     DWORD cStoreProvFunc;
 *     void **rgpvStoreProvFunc;
 *     HCERTSTOREPROV hStoreProv;
 *     DWORD dwStoreProvFlags;
 *     HCRYPTOIDFUNCADDR hStoreProvFuncAddr2;
 * }
 * }
 */
public class _CERT_STORE_PROV_INFO {

    _CERT_STORE_PROV_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("cbSize"),
        winapi.C_LONG.withName("cStoreProvFunc"),
        winapi.C_POINTER.withName("rgpvStoreProvFunc"),
        winapi.C_POINTER.withName("hStoreProv"),
        winapi.C_LONG.withName("dwStoreProvFlags"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("hStoreProvFuncAddr2")
    ).withName("_CERT_STORE_PROV_INFO");

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

    private static final OfInt cStoreProvFunc$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cStoreProvFunc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cStoreProvFunc
     * }
     */
    public static final OfInt cStoreProvFunc$layout() {
        return cStoreProvFunc$LAYOUT;
    }

    private static final long cStoreProvFunc$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cStoreProvFunc
     * }
     */
    public static final long cStoreProvFunc$offset() {
        return cStoreProvFunc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cStoreProvFunc
     * }
     */
    public static int cStoreProvFunc(MemorySegment struct) {
        return struct.get(cStoreProvFunc$LAYOUT, cStoreProvFunc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cStoreProvFunc
     * }
     */
    public static void cStoreProvFunc(MemorySegment struct, int fieldValue) {
        struct.set(cStoreProvFunc$LAYOUT, cStoreProvFunc$OFFSET, fieldValue);
    }

    private static final AddressLayout rgpvStoreProvFunc$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rgpvStoreProvFunc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void **rgpvStoreProvFunc
     * }
     */
    public static final AddressLayout rgpvStoreProvFunc$layout() {
        return rgpvStoreProvFunc$LAYOUT;
    }

    private static final long rgpvStoreProvFunc$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void **rgpvStoreProvFunc
     * }
     */
    public static final long rgpvStoreProvFunc$offset() {
        return rgpvStoreProvFunc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void **rgpvStoreProvFunc
     * }
     */
    public static MemorySegment rgpvStoreProvFunc(MemorySegment struct) {
        return struct.get(rgpvStoreProvFunc$LAYOUT, rgpvStoreProvFunc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void **rgpvStoreProvFunc
     * }
     */
    public static void rgpvStoreProvFunc(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rgpvStoreProvFunc$LAYOUT, rgpvStoreProvFunc$OFFSET, fieldValue);
    }

    private static final AddressLayout hStoreProv$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hStoreProv"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HCERTSTOREPROV hStoreProv
     * }
     */
    public static final AddressLayout hStoreProv$layout() {
        return hStoreProv$LAYOUT;
    }

    private static final long hStoreProv$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HCERTSTOREPROV hStoreProv
     * }
     */
    public static final long hStoreProv$offset() {
        return hStoreProv$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HCERTSTOREPROV hStoreProv
     * }
     */
    public static MemorySegment hStoreProv(MemorySegment struct) {
        return struct.get(hStoreProv$LAYOUT, hStoreProv$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HCERTSTOREPROV hStoreProv
     * }
     */
    public static void hStoreProv(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hStoreProv$LAYOUT, hStoreProv$OFFSET, fieldValue);
    }

    private static final OfInt dwStoreProvFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwStoreProvFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwStoreProvFlags
     * }
     */
    public static final OfInt dwStoreProvFlags$layout() {
        return dwStoreProvFlags$LAYOUT;
    }

    private static final long dwStoreProvFlags$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwStoreProvFlags
     * }
     */
    public static final long dwStoreProvFlags$offset() {
        return dwStoreProvFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwStoreProvFlags
     * }
     */
    public static int dwStoreProvFlags(MemorySegment struct) {
        return struct.get(dwStoreProvFlags$LAYOUT, dwStoreProvFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwStoreProvFlags
     * }
     */
    public static void dwStoreProvFlags(MemorySegment struct, int fieldValue) {
        struct.set(dwStoreProvFlags$LAYOUT, dwStoreProvFlags$OFFSET, fieldValue);
    }

    private static final AddressLayout hStoreProvFuncAddr2$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hStoreProvFuncAddr2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HCRYPTOIDFUNCADDR hStoreProvFuncAddr2
     * }
     */
    public static final AddressLayout hStoreProvFuncAddr2$layout() {
        return hStoreProvFuncAddr2$LAYOUT;
    }

    private static final long hStoreProvFuncAddr2$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HCRYPTOIDFUNCADDR hStoreProvFuncAddr2
     * }
     */
    public static final long hStoreProvFuncAddr2$offset() {
        return hStoreProvFuncAddr2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HCRYPTOIDFUNCADDR hStoreProvFuncAddr2
     * }
     */
    public static MemorySegment hStoreProvFuncAddr2(MemorySegment struct) {
        return struct.get(hStoreProvFuncAddr2$LAYOUT, hStoreProvFuncAddr2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HCRYPTOIDFUNCADDR hStoreProvFuncAddr2
     * }
     */
    public static void hStoreProvFuncAddr2(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hStoreProvFuncAddr2$LAYOUT, hStoreProvFuncAddr2$OFFSET, fieldValue);
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

