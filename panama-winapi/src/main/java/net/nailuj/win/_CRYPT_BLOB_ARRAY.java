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
 * struct _CRYPT_BLOB_ARRAY {
 *     DWORD cBlob;
 *     PCRYPT_DATA_BLOB rgBlob;
 * }
 * }
 */
public class _CRYPT_BLOB_ARRAY {

    _CRYPT_BLOB_ARRAY() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("cBlob"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("rgBlob")
    ).withName("_CRYPT_BLOB_ARRAY");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cBlob$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cBlob"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cBlob
     * }
     */
    public static final OfInt cBlob$layout() {
        return cBlob$LAYOUT;
    }

    private static final long cBlob$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cBlob
     * }
     */
    public static final long cBlob$offset() {
        return cBlob$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cBlob
     * }
     */
    public static int cBlob(MemorySegment struct) {
        return struct.get(cBlob$LAYOUT, cBlob$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cBlob
     * }
     */
    public static void cBlob(MemorySegment struct, int fieldValue) {
        struct.set(cBlob$LAYOUT, cBlob$OFFSET, fieldValue);
    }

    private static final AddressLayout rgBlob$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rgBlob"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCRYPT_DATA_BLOB rgBlob
     * }
     */
    public static final AddressLayout rgBlob$layout() {
        return rgBlob$LAYOUT;
    }

    private static final long rgBlob$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCRYPT_DATA_BLOB rgBlob
     * }
     */
    public static final long rgBlob$offset() {
        return rgBlob$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCRYPT_DATA_BLOB rgBlob
     * }
     */
    public static MemorySegment rgBlob(MemorySegment struct) {
        return struct.get(rgBlob$LAYOUT, rgBlob$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCRYPT_DATA_BLOB rgBlob
     * }
     */
    public static void rgBlob(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rgBlob$LAYOUT, rgBlob$OFFSET, fieldValue);
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

