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
 * struct _CERT_CHAIN_POLICY_STATUS {
 *     DWORD cbSize;
 *     DWORD dwError;
 *     LONG lChainIndex;
 *     LONG lElementIndex;
 *     void *pvExtraPolicyStatus;
 * }
 * }
 */
public class _CERT_CHAIN_POLICY_STATUS {

    _CERT_CHAIN_POLICY_STATUS() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("cbSize"),
        winapi.C_LONG.withName("dwError"),
        winapi.C_LONG.withName("lChainIndex"),
        winapi.C_LONG.withName("lElementIndex"),
        winapi.C_POINTER.withName("pvExtraPolicyStatus")
    ).withName("_CERT_CHAIN_POLICY_STATUS");

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

    private static final OfInt dwError$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwError"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwError
     * }
     */
    public static final OfInt dwError$layout() {
        return dwError$LAYOUT;
    }

    private static final long dwError$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwError
     * }
     */
    public static final long dwError$offset() {
        return dwError$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwError
     * }
     */
    public static int dwError(MemorySegment struct) {
        return struct.get(dwError$LAYOUT, dwError$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwError
     * }
     */
    public static void dwError(MemorySegment struct, int fieldValue) {
        struct.set(dwError$LAYOUT, dwError$OFFSET, fieldValue);
    }

    private static final OfInt lChainIndex$LAYOUT = (OfInt)$LAYOUT.select(groupElement("lChainIndex"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG lChainIndex
     * }
     */
    public static final OfInt lChainIndex$layout() {
        return lChainIndex$LAYOUT;
    }

    private static final long lChainIndex$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG lChainIndex
     * }
     */
    public static final long lChainIndex$offset() {
        return lChainIndex$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG lChainIndex
     * }
     */
    public static int lChainIndex(MemorySegment struct) {
        return struct.get(lChainIndex$LAYOUT, lChainIndex$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG lChainIndex
     * }
     */
    public static void lChainIndex(MemorySegment struct, int fieldValue) {
        struct.set(lChainIndex$LAYOUT, lChainIndex$OFFSET, fieldValue);
    }

    private static final OfInt lElementIndex$LAYOUT = (OfInt)$LAYOUT.select(groupElement("lElementIndex"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG lElementIndex
     * }
     */
    public static final OfInt lElementIndex$layout() {
        return lElementIndex$LAYOUT;
    }

    private static final long lElementIndex$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG lElementIndex
     * }
     */
    public static final long lElementIndex$offset() {
        return lElementIndex$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG lElementIndex
     * }
     */
    public static int lElementIndex(MemorySegment struct) {
        return struct.get(lElementIndex$LAYOUT, lElementIndex$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG lElementIndex
     * }
     */
    public static void lElementIndex(MemorySegment struct, int fieldValue) {
        struct.set(lElementIndex$LAYOUT, lElementIndex$OFFSET, fieldValue);
    }

    private static final AddressLayout pvExtraPolicyStatus$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pvExtraPolicyStatus"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *pvExtraPolicyStatus
     * }
     */
    public static final AddressLayout pvExtraPolicyStatus$layout() {
        return pvExtraPolicyStatus$LAYOUT;
    }

    private static final long pvExtraPolicyStatus$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *pvExtraPolicyStatus
     * }
     */
    public static final long pvExtraPolicyStatus$offset() {
        return pvExtraPolicyStatus$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *pvExtraPolicyStatus
     * }
     */
    public static MemorySegment pvExtraPolicyStatus(MemorySegment struct) {
        return struct.get(pvExtraPolicyStatus$LAYOUT, pvExtraPolicyStatus$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *pvExtraPolicyStatus
     * }
     */
    public static void pvExtraPolicyStatus(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pvExtraPolicyStatus$LAYOUT, pvExtraPolicyStatus$OFFSET, fieldValue);
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

