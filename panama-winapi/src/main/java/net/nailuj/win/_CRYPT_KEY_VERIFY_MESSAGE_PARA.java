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
 * struct _CRYPT_KEY_VERIFY_MESSAGE_PARA {
 *     DWORD cbSize;
 *     DWORD dwMsgEncodingType;
 *     HCRYPTPROV_LEGACY hCryptProv;
 * }
 * }
 */
public class _CRYPT_KEY_VERIFY_MESSAGE_PARA {

    _CRYPT_KEY_VERIFY_MESSAGE_PARA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("cbSize"),
        winapi.C_LONG.withName("dwMsgEncodingType"),
        winapi.C_LONG_LONG.withName("hCryptProv")
    ).withName("_CRYPT_KEY_VERIFY_MESSAGE_PARA");

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

    private static final OfInt dwMsgEncodingType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwMsgEncodingType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwMsgEncodingType
     * }
     */
    public static final OfInt dwMsgEncodingType$layout() {
        return dwMsgEncodingType$LAYOUT;
    }

    private static final long dwMsgEncodingType$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwMsgEncodingType
     * }
     */
    public static final long dwMsgEncodingType$offset() {
        return dwMsgEncodingType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwMsgEncodingType
     * }
     */
    public static int dwMsgEncodingType(MemorySegment struct) {
        return struct.get(dwMsgEncodingType$LAYOUT, dwMsgEncodingType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwMsgEncodingType
     * }
     */
    public static void dwMsgEncodingType(MemorySegment struct, int fieldValue) {
        struct.set(dwMsgEncodingType$LAYOUT, dwMsgEncodingType$OFFSET, fieldValue);
    }

    private static final OfLong hCryptProv$LAYOUT = (OfLong)$LAYOUT.select(groupElement("hCryptProv"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HCRYPTPROV_LEGACY hCryptProv
     * }
     */
    public static final OfLong hCryptProv$layout() {
        return hCryptProv$LAYOUT;
    }

    private static final long hCryptProv$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HCRYPTPROV_LEGACY hCryptProv
     * }
     */
    public static final long hCryptProv$offset() {
        return hCryptProv$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HCRYPTPROV_LEGACY hCryptProv
     * }
     */
    public static long hCryptProv(MemorySegment struct) {
        return struct.get(hCryptProv$LAYOUT, hCryptProv$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HCRYPTPROV_LEGACY hCryptProv
     * }
     */
    public static void hCryptProv(MemorySegment struct, long fieldValue) {
        struct.set(hCryptProv$LAYOUT, hCryptProv$OFFSET, fieldValue);
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

