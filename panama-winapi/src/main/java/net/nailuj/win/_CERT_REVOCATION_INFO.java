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
 * struct _CERT_REVOCATION_INFO {
 *     DWORD cbSize;
 *     DWORD dwRevocationResult;
 *     LPCSTR pszRevocationOid;
 *     LPVOID pvOidSpecificInfo;
 *     BOOL fHasFreshnessTime;
 *     DWORD dwFreshnessTime;
 *     PCERT_REVOCATION_CRL_INFO pCrlInfo;
 * }
 * }
 */
public class _CERT_REVOCATION_INFO {

    _CERT_REVOCATION_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("cbSize"),
        winapi.C_LONG.withName("dwRevocationResult"),
        winapi.C_POINTER.withName("pszRevocationOid"),
        winapi.C_POINTER.withName("pvOidSpecificInfo"),
        winapi.C_INT.withName("fHasFreshnessTime"),
        winapi.C_LONG.withName("dwFreshnessTime"),
        winapi.C_POINTER.withName("pCrlInfo")
    ).withName("_CERT_REVOCATION_INFO");

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

    private static final OfInt dwRevocationResult$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwRevocationResult"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwRevocationResult
     * }
     */
    public static final OfInt dwRevocationResult$layout() {
        return dwRevocationResult$LAYOUT;
    }

    private static final long dwRevocationResult$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwRevocationResult
     * }
     */
    public static final long dwRevocationResult$offset() {
        return dwRevocationResult$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwRevocationResult
     * }
     */
    public static int dwRevocationResult(MemorySegment struct) {
        return struct.get(dwRevocationResult$LAYOUT, dwRevocationResult$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwRevocationResult
     * }
     */
    public static void dwRevocationResult(MemorySegment struct, int fieldValue) {
        struct.set(dwRevocationResult$LAYOUT, dwRevocationResult$OFFSET, fieldValue);
    }

    private static final AddressLayout pszRevocationOid$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pszRevocationOid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCSTR pszRevocationOid
     * }
     */
    public static final AddressLayout pszRevocationOid$layout() {
        return pszRevocationOid$LAYOUT;
    }

    private static final long pszRevocationOid$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCSTR pszRevocationOid
     * }
     */
    public static final long pszRevocationOid$offset() {
        return pszRevocationOid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCSTR pszRevocationOid
     * }
     */
    public static MemorySegment pszRevocationOid(MemorySegment struct) {
        return struct.get(pszRevocationOid$LAYOUT, pszRevocationOid$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCSTR pszRevocationOid
     * }
     */
    public static void pszRevocationOid(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pszRevocationOid$LAYOUT, pszRevocationOid$OFFSET, fieldValue);
    }

    private static final AddressLayout pvOidSpecificInfo$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pvOidSpecificInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPVOID pvOidSpecificInfo
     * }
     */
    public static final AddressLayout pvOidSpecificInfo$layout() {
        return pvOidSpecificInfo$LAYOUT;
    }

    private static final long pvOidSpecificInfo$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPVOID pvOidSpecificInfo
     * }
     */
    public static final long pvOidSpecificInfo$offset() {
        return pvOidSpecificInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPVOID pvOidSpecificInfo
     * }
     */
    public static MemorySegment pvOidSpecificInfo(MemorySegment struct) {
        return struct.get(pvOidSpecificInfo$LAYOUT, pvOidSpecificInfo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPVOID pvOidSpecificInfo
     * }
     */
    public static void pvOidSpecificInfo(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pvOidSpecificInfo$LAYOUT, pvOidSpecificInfo$OFFSET, fieldValue);
    }

    private static final OfInt fHasFreshnessTime$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fHasFreshnessTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOL fHasFreshnessTime
     * }
     */
    public static final OfInt fHasFreshnessTime$layout() {
        return fHasFreshnessTime$LAYOUT;
    }

    private static final long fHasFreshnessTime$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOL fHasFreshnessTime
     * }
     */
    public static final long fHasFreshnessTime$offset() {
        return fHasFreshnessTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOL fHasFreshnessTime
     * }
     */
    public static int fHasFreshnessTime(MemorySegment struct) {
        return struct.get(fHasFreshnessTime$LAYOUT, fHasFreshnessTime$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOL fHasFreshnessTime
     * }
     */
    public static void fHasFreshnessTime(MemorySegment struct, int fieldValue) {
        struct.set(fHasFreshnessTime$LAYOUT, fHasFreshnessTime$OFFSET, fieldValue);
    }

    private static final OfInt dwFreshnessTime$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwFreshnessTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwFreshnessTime
     * }
     */
    public static final OfInt dwFreshnessTime$layout() {
        return dwFreshnessTime$LAYOUT;
    }

    private static final long dwFreshnessTime$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwFreshnessTime
     * }
     */
    public static final long dwFreshnessTime$offset() {
        return dwFreshnessTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwFreshnessTime
     * }
     */
    public static int dwFreshnessTime(MemorySegment struct) {
        return struct.get(dwFreshnessTime$LAYOUT, dwFreshnessTime$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwFreshnessTime
     * }
     */
    public static void dwFreshnessTime(MemorySegment struct, int fieldValue) {
        struct.set(dwFreshnessTime$LAYOUT, dwFreshnessTime$OFFSET, fieldValue);
    }

    private static final AddressLayout pCrlInfo$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pCrlInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCERT_REVOCATION_CRL_INFO pCrlInfo
     * }
     */
    public static final AddressLayout pCrlInfo$layout() {
        return pCrlInfo$LAYOUT;
    }

    private static final long pCrlInfo$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCERT_REVOCATION_CRL_INFO pCrlInfo
     * }
     */
    public static final long pCrlInfo$offset() {
        return pCrlInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCERT_REVOCATION_CRL_INFO pCrlInfo
     * }
     */
    public static MemorySegment pCrlInfo(MemorySegment struct) {
        return struct.get(pCrlInfo$LAYOUT, pCrlInfo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCERT_REVOCATION_CRL_INFO pCrlInfo
     * }
     */
    public static void pCrlInfo(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pCrlInfo$LAYOUT, pCrlInfo$OFFSET, fieldValue);
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

