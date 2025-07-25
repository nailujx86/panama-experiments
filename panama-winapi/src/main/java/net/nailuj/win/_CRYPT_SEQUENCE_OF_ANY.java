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
 * struct _CRYPT_SEQUENCE_OF_ANY {
 *     DWORD cValue;
 *     PCRYPT_DER_BLOB rgValue;
 * }
 * }
 */
public class _CRYPT_SEQUENCE_OF_ANY {

    _CRYPT_SEQUENCE_OF_ANY() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("cValue"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("rgValue")
    ).withName("_CRYPT_SEQUENCE_OF_ANY");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cValue$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cValue"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cValue
     * }
     */
    public static final OfInt cValue$layout() {
        return cValue$LAYOUT;
    }

    private static final long cValue$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cValue
     * }
     */
    public static final long cValue$offset() {
        return cValue$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cValue
     * }
     */
    public static int cValue(MemorySegment struct) {
        return struct.get(cValue$LAYOUT, cValue$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cValue
     * }
     */
    public static void cValue(MemorySegment struct, int fieldValue) {
        struct.set(cValue$LAYOUT, cValue$OFFSET, fieldValue);
    }

    private static final AddressLayout rgValue$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rgValue"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCRYPT_DER_BLOB rgValue
     * }
     */
    public static final AddressLayout rgValue$layout() {
        return rgValue$LAYOUT;
    }

    private static final long rgValue$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCRYPT_DER_BLOB rgValue
     * }
     */
    public static final long rgValue$offset() {
        return rgValue$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCRYPT_DER_BLOB rgValue
     * }
     */
    public static MemorySegment rgValue(MemorySegment struct) {
        return struct.get(rgValue$LAYOUT, rgValue$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCRYPT_DER_BLOB rgValue
     * }
     */
    public static void rgValue(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rgValue$LAYOUT, rgValue$OFFSET, fieldValue);
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

