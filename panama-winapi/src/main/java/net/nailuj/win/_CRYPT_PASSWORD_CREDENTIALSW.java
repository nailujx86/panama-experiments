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
 * struct _CRYPT_PASSWORD_CREDENTIALSW {
 *     DWORD cbSize;
 *     LPWSTR pszUsername;
 *     LPWSTR pszPassword;
 * }
 * }
 */
public class _CRYPT_PASSWORD_CREDENTIALSW {

    _CRYPT_PASSWORD_CREDENTIALSW() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("cbSize"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("pszUsername"),
        winapi.C_POINTER.withName("pszPassword")
    ).withName("_CRYPT_PASSWORD_CREDENTIALSW");

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

    private static final AddressLayout pszUsername$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pszUsername"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR pszUsername
     * }
     */
    public static final AddressLayout pszUsername$layout() {
        return pszUsername$LAYOUT;
    }

    private static final long pszUsername$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR pszUsername
     * }
     */
    public static final long pszUsername$offset() {
        return pszUsername$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR pszUsername
     * }
     */
    public static MemorySegment pszUsername(MemorySegment struct) {
        return struct.get(pszUsername$LAYOUT, pszUsername$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR pszUsername
     * }
     */
    public static void pszUsername(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pszUsername$LAYOUT, pszUsername$OFFSET, fieldValue);
    }

    private static final AddressLayout pszPassword$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pszPassword"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR pszPassword
     * }
     */
    public static final AddressLayout pszPassword$layout() {
        return pszPassword$LAYOUT;
    }

    private static final long pszPassword$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR pszPassword
     * }
     */
    public static final long pszPassword$offset() {
        return pszPassword$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR pszPassword
     * }
     */
    public static MemorySegment pszPassword(MemorySegment struct) {
        return struct.get(pszPassword$LAYOUT, pszPassword$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR pszPassword
     * }
     */
    public static void pszPassword(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pszPassword$LAYOUT, pszPassword$OFFSET, fieldValue);
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

