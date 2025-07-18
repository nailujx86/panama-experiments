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
 * struct _OCSP_SIGNATURE_INFO {
 *     CRYPT_ALGORITHM_IDENTIFIER SignatureAlgorithm;
 *     CRYPT_BIT_BLOB Signature;
 *     DWORD cCertEncoded;
 *     PCERT_BLOB rgCertEncoded;
 * }
 * }
 */
public class _OCSP_SIGNATURE_INFO {

    _OCSP_SIGNATURE_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _CRYPT_ALGORITHM_IDENTIFIER.layout().withName("SignatureAlgorithm"),
        _CRYPT_BIT_BLOB.layout().withName("Signature"),
        winapi.C_LONG.withName("cCertEncoded"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("rgCertEncoded")
    ).withName("_OCSP_SIGNATURE_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout SignatureAlgorithm$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("SignatureAlgorithm"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER SignatureAlgorithm
     * }
     */
    public static final GroupLayout SignatureAlgorithm$layout() {
        return SignatureAlgorithm$LAYOUT;
    }

    private static final long SignatureAlgorithm$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER SignatureAlgorithm
     * }
     */
    public static final long SignatureAlgorithm$offset() {
        return SignatureAlgorithm$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER SignatureAlgorithm
     * }
     */
    public static MemorySegment SignatureAlgorithm(MemorySegment struct) {
        return struct.asSlice(SignatureAlgorithm$OFFSET, SignatureAlgorithm$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER SignatureAlgorithm
     * }
     */
    public static void SignatureAlgorithm(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, SignatureAlgorithm$OFFSET, SignatureAlgorithm$LAYOUT.byteSize());
    }

    private static final GroupLayout Signature$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Signature"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_BIT_BLOB Signature
     * }
     */
    public static final GroupLayout Signature$layout() {
        return Signature$LAYOUT;
    }

    private static final long Signature$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_BIT_BLOB Signature
     * }
     */
    public static final long Signature$offset() {
        return Signature$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_BIT_BLOB Signature
     * }
     */
    public static MemorySegment Signature(MemorySegment struct) {
        return struct.asSlice(Signature$OFFSET, Signature$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_BIT_BLOB Signature
     * }
     */
    public static void Signature(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Signature$OFFSET, Signature$LAYOUT.byteSize());
    }

    private static final OfInt cCertEncoded$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cCertEncoded"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cCertEncoded
     * }
     */
    public static final OfInt cCertEncoded$layout() {
        return cCertEncoded$LAYOUT;
    }

    private static final long cCertEncoded$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cCertEncoded
     * }
     */
    public static final long cCertEncoded$offset() {
        return cCertEncoded$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cCertEncoded
     * }
     */
    public static int cCertEncoded(MemorySegment struct) {
        return struct.get(cCertEncoded$LAYOUT, cCertEncoded$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cCertEncoded
     * }
     */
    public static void cCertEncoded(MemorySegment struct, int fieldValue) {
        struct.set(cCertEncoded$LAYOUT, cCertEncoded$OFFSET, fieldValue);
    }

    private static final AddressLayout rgCertEncoded$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rgCertEncoded"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCERT_BLOB rgCertEncoded
     * }
     */
    public static final AddressLayout rgCertEncoded$layout() {
        return rgCertEncoded$LAYOUT;
    }

    private static final long rgCertEncoded$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCERT_BLOB rgCertEncoded
     * }
     */
    public static final long rgCertEncoded$offset() {
        return rgCertEncoded$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCERT_BLOB rgCertEncoded
     * }
     */
    public static MemorySegment rgCertEncoded(MemorySegment struct) {
        return struct.get(rgCertEncoded$LAYOUT, rgCertEncoded$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCERT_BLOB rgCertEncoded
     * }
     */
    public static void rgCertEncoded(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rgCertEncoded$LAYOUT, rgCertEncoded$OFFSET, fieldValue);
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

