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
 * struct _CERT_STRONG_SIGN_SERIALIZED_INFO {
 *     DWORD dwFlags;
 *     LPWSTR pwszCNGSignHashAlgids;
 *     LPWSTR pwszCNGPubKeyMinBitLengths;
 * }
 * }
 */
public class _CERT_STRONG_SIGN_SERIALIZED_INFO {

    _CERT_STRONG_SIGN_SERIALIZED_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("dwFlags"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("pwszCNGSignHashAlgids"),
        winapi.C_POINTER.withName("pwszCNGPubKeyMinBitLengths")
    ).withName("_CERT_STRONG_SIGN_SERIALIZED_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwFlags
     * }
     */
    public static final OfInt dwFlags$layout() {
        return dwFlags$LAYOUT;
    }

    private static final long dwFlags$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwFlags
     * }
     */
    public static final long dwFlags$offset() {
        return dwFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwFlags
     * }
     */
    public static int dwFlags(MemorySegment struct) {
        return struct.get(dwFlags$LAYOUT, dwFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwFlags
     * }
     */
    public static void dwFlags(MemorySegment struct, int fieldValue) {
        struct.set(dwFlags$LAYOUT, dwFlags$OFFSET, fieldValue);
    }

    private static final AddressLayout pwszCNGSignHashAlgids$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pwszCNGSignHashAlgids"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR pwszCNGSignHashAlgids
     * }
     */
    public static final AddressLayout pwszCNGSignHashAlgids$layout() {
        return pwszCNGSignHashAlgids$LAYOUT;
    }

    private static final long pwszCNGSignHashAlgids$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR pwszCNGSignHashAlgids
     * }
     */
    public static final long pwszCNGSignHashAlgids$offset() {
        return pwszCNGSignHashAlgids$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR pwszCNGSignHashAlgids
     * }
     */
    public static MemorySegment pwszCNGSignHashAlgids(MemorySegment struct) {
        return struct.get(pwszCNGSignHashAlgids$LAYOUT, pwszCNGSignHashAlgids$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR pwszCNGSignHashAlgids
     * }
     */
    public static void pwszCNGSignHashAlgids(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pwszCNGSignHashAlgids$LAYOUT, pwszCNGSignHashAlgids$OFFSET, fieldValue);
    }

    private static final AddressLayout pwszCNGPubKeyMinBitLengths$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pwszCNGPubKeyMinBitLengths"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR pwszCNGPubKeyMinBitLengths
     * }
     */
    public static final AddressLayout pwszCNGPubKeyMinBitLengths$layout() {
        return pwszCNGPubKeyMinBitLengths$LAYOUT;
    }

    private static final long pwszCNGPubKeyMinBitLengths$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR pwszCNGPubKeyMinBitLengths
     * }
     */
    public static final long pwszCNGPubKeyMinBitLengths$offset() {
        return pwszCNGPubKeyMinBitLengths$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR pwszCNGPubKeyMinBitLengths
     * }
     */
    public static MemorySegment pwszCNGPubKeyMinBitLengths(MemorySegment struct) {
        return struct.get(pwszCNGPubKeyMinBitLengths$LAYOUT, pwszCNGPubKeyMinBitLengths$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR pwszCNGPubKeyMinBitLengths
     * }
     */
    public static void pwszCNGPubKeyMinBitLengths(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pwszCNGPubKeyMinBitLengths$LAYOUT, pwszCNGPubKeyMinBitLengths$OFFSET, fieldValue);
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

