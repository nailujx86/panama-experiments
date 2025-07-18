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
 * struct _CRYPT_TIMESTAMP_PARA {
 *     LPCSTR pszTSAPolicyId;
 *     BOOL fRequestCerts;
 *     CRYPT_INTEGER_BLOB Nonce;
 *     DWORD cExtension;
 *     PCERT_EXTENSION rgExtension;
 * }
 * }
 */
public class _CRYPT_TIMESTAMP_PARA {

    _CRYPT_TIMESTAMP_PARA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_POINTER.withName("pszTSAPolicyId"),
        winapi.C_INT.withName("fRequestCerts"),
        MemoryLayout.paddingLayout(4),
        _CRYPTOAPI_BLOB.layout().withName("Nonce"),
        winapi.C_LONG.withName("cExtension"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("rgExtension")
    ).withName("_CRYPT_TIMESTAMP_PARA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout pszTSAPolicyId$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pszTSAPolicyId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCSTR pszTSAPolicyId
     * }
     */
    public static final AddressLayout pszTSAPolicyId$layout() {
        return pszTSAPolicyId$LAYOUT;
    }

    private static final long pszTSAPolicyId$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCSTR pszTSAPolicyId
     * }
     */
    public static final long pszTSAPolicyId$offset() {
        return pszTSAPolicyId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCSTR pszTSAPolicyId
     * }
     */
    public static MemorySegment pszTSAPolicyId(MemorySegment struct) {
        return struct.get(pszTSAPolicyId$LAYOUT, pszTSAPolicyId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCSTR pszTSAPolicyId
     * }
     */
    public static void pszTSAPolicyId(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pszTSAPolicyId$LAYOUT, pszTSAPolicyId$OFFSET, fieldValue);
    }

    private static final OfInt fRequestCerts$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fRequestCerts"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOL fRequestCerts
     * }
     */
    public static final OfInt fRequestCerts$layout() {
        return fRequestCerts$LAYOUT;
    }

    private static final long fRequestCerts$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOL fRequestCerts
     * }
     */
    public static final long fRequestCerts$offset() {
        return fRequestCerts$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOL fRequestCerts
     * }
     */
    public static int fRequestCerts(MemorySegment struct) {
        return struct.get(fRequestCerts$LAYOUT, fRequestCerts$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOL fRequestCerts
     * }
     */
    public static void fRequestCerts(MemorySegment struct, int fieldValue) {
        struct.set(fRequestCerts$LAYOUT, fRequestCerts$OFFSET, fieldValue);
    }

    private static final GroupLayout Nonce$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Nonce"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_INTEGER_BLOB Nonce
     * }
     */
    public static final GroupLayout Nonce$layout() {
        return Nonce$LAYOUT;
    }

    private static final long Nonce$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_INTEGER_BLOB Nonce
     * }
     */
    public static final long Nonce$offset() {
        return Nonce$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_INTEGER_BLOB Nonce
     * }
     */
    public static MemorySegment Nonce(MemorySegment struct) {
        return struct.asSlice(Nonce$OFFSET, Nonce$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_INTEGER_BLOB Nonce
     * }
     */
    public static void Nonce(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Nonce$OFFSET, Nonce$LAYOUT.byteSize());
    }

    private static final OfInt cExtension$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cExtension"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cExtension
     * }
     */
    public static final OfInt cExtension$layout() {
        return cExtension$LAYOUT;
    }

    private static final long cExtension$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cExtension
     * }
     */
    public static final long cExtension$offset() {
        return cExtension$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cExtension
     * }
     */
    public static int cExtension(MemorySegment struct) {
        return struct.get(cExtension$LAYOUT, cExtension$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cExtension
     * }
     */
    public static void cExtension(MemorySegment struct, int fieldValue) {
        struct.set(cExtension$LAYOUT, cExtension$OFFSET, fieldValue);
    }

    private static final AddressLayout rgExtension$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rgExtension"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCERT_EXTENSION rgExtension
     * }
     */
    public static final AddressLayout rgExtension$layout() {
        return rgExtension$LAYOUT;
    }

    private static final long rgExtension$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCERT_EXTENSION rgExtension
     * }
     */
    public static final long rgExtension$offset() {
        return rgExtension$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCERT_EXTENSION rgExtension
     * }
     */
    public static MemorySegment rgExtension(MemorySegment struct) {
        return struct.get(rgExtension$LAYOUT, rgExtension$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCERT_EXTENSION rgExtension
     * }
     */
    public static void rgExtension(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rgExtension$LAYOUT, rgExtension$OFFSET, fieldValue);
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

