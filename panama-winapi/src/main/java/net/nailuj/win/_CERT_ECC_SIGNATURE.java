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
 * struct _CERT_ECC_SIGNATURE {
 *     CRYPT_UINT_BLOB r;
 *     CRYPT_UINT_BLOB s;
 * }
 * }
 */
public class _CERT_ECC_SIGNATURE {

    _CERT_ECC_SIGNATURE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _CRYPTOAPI_BLOB.layout().withName("r"),
        _CRYPTOAPI_BLOB.layout().withName("s")
    ).withName("_CERT_ECC_SIGNATURE");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout r$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("r"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_UINT_BLOB r
     * }
     */
    public static final GroupLayout r$layout() {
        return r$LAYOUT;
    }

    private static final long r$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_UINT_BLOB r
     * }
     */
    public static final long r$offset() {
        return r$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_UINT_BLOB r
     * }
     */
    public static MemorySegment r(MemorySegment struct) {
        return struct.asSlice(r$OFFSET, r$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_UINT_BLOB r
     * }
     */
    public static void r(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, r$OFFSET, r$LAYOUT.byteSize());
    }

    private static final GroupLayout s$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("s"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_UINT_BLOB s
     * }
     */
    public static final GroupLayout s$layout() {
        return s$LAYOUT;
    }

    private static final long s$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_UINT_BLOB s
     * }
     */
    public static final long s$offset() {
        return s$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_UINT_BLOB s
     * }
     */
    public static MemorySegment s(MemorySegment struct) {
        return struct.asSlice(s$OFFSET, s$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_UINT_BLOB s
     * }
     */
    public static void s(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, s$OFFSET, s$LAYOUT.byteSize());
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

