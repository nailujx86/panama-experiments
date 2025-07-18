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
 * struct _CERT_CONTEXT {
 *     DWORD dwCertEncodingType;
 *     BYTE *pbCertEncoded;
 *     DWORD cbCertEncoded;
 *     PCERT_INFO pCertInfo;
 *     HCERTSTORE hCertStore;
 * }
 * }
 */
public class _CERT_CONTEXT {

    _CERT_CONTEXT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("dwCertEncodingType"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("pbCertEncoded"),
        winapi.C_LONG.withName("cbCertEncoded"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("pCertInfo"),
        winapi.C_POINTER.withName("hCertStore")
    ).withName("_CERT_CONTEXT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwCertEncodingType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwCertEncodingType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwCertEncodingType
     * }
     */
    public static final OfInt dwCertEncodingType$layout() {
        return dwCertEncodingType$LAYOUT;
    }

    private static final long dwCertEncodingType$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwCertEncodingType
     * }
     */
    public static final long dwCertEncodingType$offset() {
        return dwCertEncodingType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwCertEncodingType
     * }
     */
    public static int dwCertEncodingType(MemorySegment struct) {
        return struct.get(dwCertEncodingType$LAYOUT, dwCertEncodingType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwCertEncodingType
     * }
     */
    public static void dwCertEncodingType(MemorySegment struct, int fieldValue) {
        struct.set(dwCertEncodingType$LAYOUT, dwCertEncodingType$OFFSET, fieldValue);
    }

    private static final AddressLayout pbCertEncoded$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pbCertEncoded"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE *pbCertEncoded
     * }
     */
    public static final AddressLayout pbCertEncoded$layout() {
        return pbCertEncoded$LAYOUT;
    }

    private static final long pbCertEncoded$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE *pbCertEncoded
     * }
     */
    public static final long pbCertEncoded$offset() {
        return pbCertEncoded$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE *pbCertEncoded
     * }
     */
    public static MemorySegment pbCertEncoded(MemorySegment struct) {
        return struct.get(pbCertEncoded$LAYOUT, pbCertEncoded$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE *pbCertEncoded
     * }
     */
    public static void pbCertEncoded(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pbCertEncoded$LAYOUT, pbCertEncoded$OFFSET, fieldValue);
    }

    private static final OfInt cbCertEncoded$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbCertEncoded"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbCertEncoded
     * }
     */
    public static final OfInt cbCertEncoded$layout() {
        return cbCertEncoded$LAYOUT;
    }

    private static final long cbCertEncoded$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbCertEncoded
     * }
     */
    public static final long cbCertEncoded$offset() {
        return cbCertEncoded$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbCertEncoded
     * }
     */
    public static int cbCertEncoded(MemorySegment struct) {
        return struct.get(cbCertEncoded$LAYOUT, cbCertEncoded$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbCertEncoded
     * }
     */
    public static void cbCertEncoded(MemorySegment struct, int fieldValue) {
        struct.set(cbCertEncoded$LAYOUT, cbCertEncoded$OFFSET, fieldValue);
    }

    private static final AddressLayout pCertInfo$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pCertInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCERT_INFO pCertInfo
     * }
     */
    public static final AddressLayout pCertInfo$layout() {
        return pCertInfo$LAYOUT;
    }

    private static final long pCertInfo$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCERT_INFO pCertInfo
     * }
     */
    public static final long pCertInfo$offset() {
        return pCertInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCERT_INFO pCertInfo
     * }
     */
    public static MemorySegment pCertInfo(MemorySegment struct) {
        return struct.get(pCertInfo$LAYOUT, pCertInfo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCERT_INFO pCertInfo
     * }
     */
    public static void pCertInfo(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pCertInfo$LAYOUT, pCertInfo$OFFSET, fieldValue);
    }

    private static final AddressLayout hCertStore$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hCertStore"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HCERTSTORE hCertStore
     * }
     */
    public static final AddressLayout hCertStore$layout() {
        return hCertStore$LAYOUT;
    }

    private static final long hCertStore$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HCERTSTORE hCertStore
     * }
     */
    public static final long hCertStore$offset() {
        return hCertStore$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HCERTSTORE hCertStore
     * }
     */
    public static MemorySegment hCertStore(MemorySegment struct) {
        return struct.get(hCertStore$LAYOUT, hCertStore$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HCERTSTORE hCertStore
     * }
     */
    public static void hCertStore(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hCertStore$LAYOUT, hCertStore$OFFSET, fieldValue);
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

