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
 * struct _CTL_VERIFY_USAGE_PARA {
 *     DWORD cbSize;
 *     CRYPT_DATA_BLOB ListIdentifier;
 *     DWORD cCtlStore;
 *     HCERTSTORE *rghCtlStore;
 *     DWORD cSignerStore;
 *     HCERTSTORE *rghSignerStore;
 * }
 * }
 */
public class _CTL_VERIFY_USAGE_PARA {

    _CTL_VERIFY_USAGE_PARA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("cbSize"),
        MemoryLayout.paddingLayout(4),
        _CRYPTOAPI_BLOB.layout().withName("ListIdentifier"),
        winapi.C_LONG.withName("cCtlStore"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("rghCtlStore"),
        winapi.C_LONG.withName("cSignerStore"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("rghSignerStore")
    ).withName("_CTL_VERIFY_USAGE_PARA");

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

    private static final GroupLayout ListIdentifier$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ListIdentifier"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_DATA_BLOB ListIdentifier
     * }
     */
    public static final GroupLayout ListIdentifier$layout() {
        return ListIdentifier$LAYOUT;
    }

    private static final long ListIdentifier$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_DATA_BLOB ListIdentifier
     * }
     */
    public static final long ListIdentifier$offset() {
        return ListIdentifier$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_DATA_BLOB ListIdentifier
     * }
     */
    public static MemorySegment ListIdentifier(MemorySegment struct) {
        return struct.asSlice(ListIdentifier$OFFSET, ListIdentifier$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_DATA_BLOB ListIdentifier
     * }
     */
    public static void ListIdentifier(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ListIdentifier$OFFSET, ListIdentifier$LAYOUT.byteSize());
    }

    private static final OfInt cCtlStore$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cCtlStore"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cCtlStore
     * }
     */
    public static final OfInt cCtlStore$layout() {
        return cCtlStore$LAYOUT;
    }

    private static final long cCtlStore$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cCtlStore
     * }
     */
    public static final long cCtlStore$offset() {
        return cCtlStore$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cCtlStore
     * }
     */
    public static int cCtlStore(MemorySegment struct) {
        return struct.get(cCtlStore$LAYOUT, cCtlStore$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cCtlStore
     * }
     */
    public static void cCtlStore(MemorySegment struct, int fieldValue) {
        struct.set(cCtlStore$LAYOUT, cCtlStore$OFFSET, fieldValue);
    }

    private static final AddressLayout rghCtlStore$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rghCtlStore"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HCERTSTORE *rghCtlStore
     * }
     */
    public static final AddressLayout rghCtlStore$layout() {
        return rghCtlStore$LAYOUT;
    }

    private static final long rghCtlStore$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HCERTSTORE *rghCtlStore
     * }
     */
    public static final long rghCtlStore$offset() {
        return rghCtlStore$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HCERTSTORE *rghCtlStore
     * }
     */
    public static MemorySegment rghCtlStore(MemorySegment struct) {
        return struct.get(rghCtlStore$LAYOUT, rghCtlStore$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HCERTSTORE *rghCtlStore
     * }
     */
    public static void rghCtlStore(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rghCtlStore$LAYOUT, rghCtlStore$OFFSET, fieldValue);
    }

    private static final OfInt cSignerStore$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cSignerStore"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cSignerStore
     * }
     */
    public static final OfInt cSignerStore$layout() {
        return cSignerStore$LAYOUT;
    }

    private static final long cSignerStore$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cSignerStore
     * }
     */
    public static final long cSignerStore$offset() {
        return cSignerStore$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cSignerStore
     * }
     */
    public static int cSignerStore(MemorySegment struct) {
        return struct.get(cSignerStore$LAYOUT, cSignerStore$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cSignerStore
     * }
     */
    public static void cSignerStore(MemorySegment struct, int fieldValue) {
        struct.set(cSignerStore$LAYOUT, cSignerStore$OFFSET, fieldValue);
    }

    private static final AddressLayout rghSignerStore$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rghSignerStore"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HCERTSTORE *rghSignerStore
     * }
     */
    public static final AddressLayout rghSignerStore$layout() {
        return rghSignerStore$LAYOUT;
    }

    private static final long rghSignerStore$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HCERTSTORE *rghSignerStore
     * }
     */
    public static final long rghSignerStore$offset() {
        return rghSignerStore$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HCERTSTORE *rghSignerStore
     * }
     */
    public static MemorySegment rghSignerStore(MemorySegment struct) {
        return struct.get(rghSignerStore$LAYOUT, rghSignerStore$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HCERTSTORE *rghSignerStore
     * }
     */
    public static void rghSignerStore(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rghSignerStore$LAYOUT, rghSignerStore$OFFSET, fieldValue);
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

