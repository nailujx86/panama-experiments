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
 * struct _CERT_AUTHORITY_KEY_ID_INFO {
 *     CRYPT_DATA_BLOB KeyId;
 *     CERT_NAME_BLOB CertIssuer;
 *     CRYPT_INTEGER_BLOB CertSerialNumber;
 * }
 * }
 */
public class _CERT_AUTHORITY_KEY_ID_INFO {

    _CERT_AUTHORITY_KEY_ID_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _CRYPTOAPI_BLOB.layout().withName("KeyId"),
        _CRYPTOAPI_BLOB.layout().withName("CertIssuer"),
        _CRYPTOAPI_BLOB.layout().withName("CertSerialNumber")
    ).withName("_CERT_AUTHORITY_KEY_ID_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout KeyId$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("KeyId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_DATA_BLOB KeyId
     * }
     */
    public static final GroupLayout KeyId$layout() {
        return KeyId$LAYOUT;
    }

    private static final long KeyId$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_DATA_BLOB KeyId
     * }
     */
    public static final long KeyId$offset() {
        return KeyId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_DATA_BLOB KeyId
     * }
     */
    public static MemorySegment KeyId(MemorySegment struct) {
        return struct.asSlice(KeyId$OFFSET, KeyId$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_DATA_BLOB KeyId
     * }
     */
    public static void KeyId(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, KeyId$OFFSET, KeyId$LAYOUT.byteSize());
    }

    private static final GroupLayout CertIssuer$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("CertIssuer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CERT_NAME_BLOB CertIssuer
     * }
     */
    public static final GroupLayout CertIssuer$layout() {
        return CertIssuer$LAYOUT;
    }

    private static final long CertIssuer$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CERT_NAME_BLOB CertIssuer
     * }
     */
    public static final long CertIssuer$offset() {
        return CertIssuer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CERT_NAME_BLOB CertIssuer
     * }
     */
    public static MemorySegment CertIssuer(MemorySegment struct) {
        return struct.asSlice(CertIssuer$OFFSET, CertIssuer$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CERT_NAME_BLOB CertIssuer
     * }
     */
    public static void CertIssuer(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, CertIssuer$OFFSET, CertIssuer$LAYOUT.byteSize());
    }

    private static final GroupLayout CertSerialNumber$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("CertSerialNumber"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_INTEGER_BLOB CertSerialNumber
     * }
     */
    public static final GroupLayout CertSerialNumber$layout() {
        return CertSerialNumber$LAYOUT;
    }

    private static final long CertSerialNumber$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_INTEGER_BLOB CertSerialNumber
     * }
     */
    public static final long CertSerialNumber$offset() {
        return CertSerialNumber$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_INTEGER_BLOB CertSerialNumber
     * }
     */
    public static MemorySegment CertSerialNumber(MemorySegment struct) {
        return struct.asSlice(CertSerialNumber$OFFSET, CertSerialNumber$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_INTEGER_BLOB CertSerialNumber
     * }
     */
    public static void CertSerialNumber(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, CertSerialNumber$OFFSET, CertSerialNumber$LAYOUT.byteSize());
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

