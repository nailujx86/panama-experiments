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
 * struct _CMSG_RECIPIENT_ENCRYPTED_KEY_ENCODE_INFO {
 *     DWORD cbSize;
 *     CRYPT_BIT_BLOB RecipientPublicKey;
 *     CERT_ID RecipientId;
 *     FILETIME Date;
 *     PCRYPT_ATTRIBUTE_TYPE_VALUE pOtherAttr;
 * }
 * }
 */
public class _CMSG_RECIPIENT_ENCRYPTED_KEY_ENCODE_INFO {

    _CMSG_RECIPIENT_ENCRYPTED_KEY_ENCODE_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("cbSize"),
        MemoryLayout.paddingLayout(4),
        _CRYPT_BIT_BLOB.layout().withName("RecipientPublicKey"),
        _CERT_ID.layout().withName("RecipientId"),
        _FILETIME.layout().withName("Date"),
        winapi.C_POINTER.withName("pOtherAttr")
    ).withName("_CMSG_RECIPIENT_ENCRYPTED_KEY_ENCODE_INFO");

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

    private static final GroupLayout RecipientPublicKey$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("RecipientPublicKey"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_BIT_BLOB RecipientPublicKey
     * }
     */
    public static final GroupLayout RecipientPublicKey$layout() {
        return RecipientPublicKey$LAYOUT;
    }

    private static final long RecipientPublicKey$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_BIT_BLOB RecipientPublicKey
     * }
     */
    public static final long RecipientPublicKey$offset() {
        return RecipientPublicKey$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_BIT_BLOB RecipientPublicKey
     * }
     */
    public static MemorySegment RecipientPublicKey(MemorySegment struct) {
        return struct.asSlice(RecipientPublicKey$OFFSET, RecipientPublicKey$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_BIT_BLOB RecipientPublicKey
     * }
     */
    public static void RecipientPublicKey(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, RecipientPublicKey$OFFSET, RecipientPublicKey$LAYOUT.byteSize());
    }

    private static final GroupLayout RecipientId$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("RecipientId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CERT_ID RecipientId
     * }
     */
    public static final GroupLayout RecipientId$layout() {
        return RecipientId$LAYOUT;
    }

    private static final long RecipientId$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CERT_ID RecipientId
     * }
     */
    public static final long RecipientId$offset() {
        return RecipientId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CERT_ID RecipientId
     * }
     */
    public static MemorySegment RecipientId(MemorySegment struct) {
        return struct.asSlice(RecipientId$OFFSET, RecipientId$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CERT_ID RecipientId
     * }
     */
    public static void RecipientId(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, RecipientId$OFFSET, RecipientId$LAYOUT.byteSize());
    }

    private static final GroupLayout Date$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Date"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FILETIME Date
     * }
     */
    public static final GroupLayout Date$layout() {
        return Date$LAYOUT;
    }

    private static final long Date$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FILETIME Date
     * }
     */
    public static final long Date$offset() {
        return Date$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FILETIME Date
     * }
     */
    public static MemorySegment Date(MemorySegment struct) {
        return struct.asSlice(Date$OFFSET, Date$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FILETIME Date
     * }
     */
    public static void Date(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Date$OFFSET, Date$LAYOUT.byteSize());
    }

    private static final AddressLayout pOtherAttr$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pOtherAttr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCRYPT_ATTRIBUTE_TYPE_VALUE pOtherAttr
     * }
     */
    public static final AddressLayout pOtherAttr$layout() {
        return pOtherAttr$LAYOUT;
    }

    private static final long pOtherAttr$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCRYPT_ATTRIBUTE_TYPE_VALUE pOtherAttr
     * }
     */
    public static final long pOtherAttr$offset() {
        return pOtherAttr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCRYPT_ATTRIBUTE_TYPE_VALUE pOtherAttr
     * }
     */
    public static MemorySegment pOtherAttr(MemorySegment struct) {
        return struct.get(pOtherAttr$LAYOUT, pOtherAttr$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCRYPT_ATTRIBUTE_TYPE_VALUE pOtherAttr
     * }
     */
    public static void pOtherAttr(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pOtherAttr$LAYOUT, pOtherAttr$OFFSET, fieldValue);
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

