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
 * struct _CERT_REVOCATION_CHAIN_PARA {
 *     DWORD cbSize;
 *     HCERTCHAINENGINE hChainEngine;
 *     HCERTSTORE hAdditionalStore;
 *     DWORD dwChainFlags;
 *     DWORD dwUrlRetrievalTimeout;
 *     LPFILETIME pftCurrentTime;
 *     LPFILETIME pftCacheResync;
 *     DWORD cbMaxUrlRetrievalByteCount;
 * }
 * }
 */
public class _CERT_REVOCATION_CHAIN_PARA {

    _CERT_REVOCATION_CHAIN_PARA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("cbSize"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("hChainEngine"),
        winapi.C_POINTER.withName("hAdditionalStore"),
        winapi.C_LONG.withName("dwChainFlags"),
        winapi.C_LONG.withName("dwUrlRetrievalTimeout"),
        winapi.C_POINTER.withName("pftCurrentTime"),
        winapi.C_POINTER.withName("pftCacheResync"),
        winapi.C_LONG.withName("cbMaxUrlRetrievalByteCount"),
        MemoryLayout.paddingLayout(4)
    ).withName("_CERT_REVOCATION_CHAIN_PARA");

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

    private static final AddressLayout hChainEngine$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hChainEngine"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HCERTCHAINENGINE hChainEngine
     * }
     */
    public static final AddressLayout hChainEngine$layout() {
        return hChainEngine$LAYOUT;
    }

    private static final long hChainEngine$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HCERTCHAINENGINE hChainEngine
     * }
     */
    public static final long hChainEngine$offset() {
        return hChainEngine$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HCERTCHAINENGINE hChainEngine
     * }
     */
    public static MemorySegment hChainEngine(MemorySegment struct) {
        return struct.get(hChainEngine$LAYOUT, hChainEngine$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HCERTCHAINENGINE hChainEngine
     * }
     */
    public static void hChainEngine(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hChainEngine$LAYOUT, hChainEngine$OFFSET, fieldValue);
    }

    private static final AddressLayout hAdditionalStore$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hAdditionalStore"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HCERTSTORE hAdditionalStore
     * }
     */
    public static final AddressLayout hAdditionalStore$layout() {
        return hAdditionalStore$LAYOUT;
    }

    private static final long hAdditionalStore$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HCERTSTORE hAdditionalStore
     * }
     */
    public static final long hAdditionalStore$offset() {
        return hAdditionalStore$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HCERTSTORE hAdditionalStore
     * }
     */
    public static MemorySegment hAdditionalStore(MemorySegment struct) {
        return struct.get(hAdditionalStore$LAYOUT, hAdditionalStore$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HCERTSTORE hAdditionalStore
     * }
     */
    public static void hAdditionalStore(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hAdditionalStore$LAYOUT, hAdditionalStore$OFFSET, fieldValue);
    }

    private static final OfInt dwChainFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwChainFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwChainFlags
     * }
     */
    public static final OfInt dwChainFlags$layout() {
        return dwChainFlags$LAYOUT;
    }

    private static final long dwChainFlags$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwChainFlags
     * }
     */
    public static final long dwChainFlags$offset() {
        return dwChainFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwChainFlags
     * }
     */
    public static int dwChainFlags(MemorySegment struct) {
        return struct.get(dwChainFlags$LAYOUT, dwChainFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwChainFlags
     * }
     */
    public static void dwChainFlags(MemorySegment struct, int fieldValue) {
        struct.set(dwChainFlags$LAYOUT, dwChainFlags$OFFSET, fieldValue);
    }

    private static final OfInt dwUrlRetrievalTimeout$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwUrlRetrievalTimeout"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwUrlRetrievalTimeout
     * }
     */
    public static final OfInt dwUrlRetrievalTimeout$layout() {
        return dwUrlRetrievalTimeout$LAYOUT;
    }

    private static final long dwUrlRetrievalTimeout$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwUrlRetrievalTimeout
     * }
     */
    public static final long dwUrlRetrievalTimeout$offset() {
        return dwUrlRetrievalTimeout$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwUrlRetrievalTimeout
     * }
     */
    public static int dwUrlRetrievalTimeout(MemorySegment struct) {
        return struct.get(dwUrlRetrievalTimeout$LAYOUT, dwUrlRetrievalTimeout$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwUrlRetrievalTimeout
     * }
     */
    public static void dwUrlRetrievalTimeout(MemorySegment struct, int fieldValue) {
        struct.set(dwUrlRetrievalTimeout$LAYOUT, dwUrlRetrievalTimeout$OFFSET, fieldValue);
    }

    private static final AddressLayout pftCurrentTime$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pftCurrentTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPFILETIME pftCurrentTime
     * }
     */
    public static final AddressLayout pftCurrentTime$layout() {
        return pftCurrentTime$LAYOUT;
    }

    private static final long pftCurrentTime$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPFILETIME pftCurrentTime
     * }
     */
    public static final long pftCurrentTime$offset() {
        return pftCurrentTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPFILETIME pftCurrentTime
     * }
     */
    public static MemorySegment pftCurrentTime(MemorySegment struct) {
        return struct.get(pftCurrentTime$LAYOUT, pftCurrentTime$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPFILETIME pftCurrentTime
     * }
     */
    public static void pftCurrentTime(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pftCurrentTime$LAYOUT, pftCurrentTime$OFFSET, fieldValue);
    }

    private static final AddressLayout pftCacheResync$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pftCacheResync"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPFILETIME pftCacheResync
     * }
     */
    public static final AddressLayout pftCacheResync$layout() {
        return pftCacheResync$LAYOUT;
    }

    private static final long pftCacheResync$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPFILETIME pftCacheResync
     * }
     */
    public static final long pftCacheResync$offset() {
        return pftCacheResync$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPFILETIME pftCacheResync
     * }
     */
    public static MemorySegment pftCacheResync(MemorySegment struct) {
        return struct.get(pftCacheResync$LAYOUT, pftCacheResync$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPFILETIME pftCacheResync
     * }
     */
    public static void pftCacheResync(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pftCacheResync$LAYOUT, pftCacheResync$OFFSET, fieldValue);
    }

    private static final OfInt cbMaxUrlRetrievalByteCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbMaxUrlRetrievalByteCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbMaxUrlRetrievalByteCount
     * }
     */
    public static final OfInt cbMaxUrlRetrievalByteCount$layout() {
        return cbMaxUrlRetrievalByteCount$LAYOUT;
    }

    private static final long cbMaxUrlRetrievalByteCount$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbMaxUrlRetrievalByteCount
     * }
     */
    public static final long cbMaxUrlRetrievalByteCount$offset() {
        return cbMaxUrlRetrievalByteCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbMaxUrlRetrievalByteCount
     * }
     */
    public static int cbMaxUrlRetrievalByteCount(MemorySegment struct) {
        return struct.get(cbMaxUrlRetrievalByteCount$LAYOUT, cbMaxUrlRetrievalByteCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbMaxUrlRetrievalByteCount
     * }
     */
    public static void cbMaxUrlRetrievalByteCount(MemorySegment struct, int fieldValue) {
        struct.set(cbMaxUrlRetrievalByteCount$LAYOUT, cbMaxUrlRetrievalByteCount$OFFSET, fieldValue);
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

