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
 * struct _CERT_POLICIES_INFO {
 *     DWORD cPolicyInfo;
 *     CERT_POLICY_INFO *rgPolicyInfo;
 * }
 * }
 */
public class _CERT_POLICIES_INFO {

    _CERT_POLICIES_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("cPolicyInfo"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("rgPolicyInfo")
    ).withName("_CERT_POLICIES_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cPolicyInfo$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cPolicyInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cPolicyInfo
     * }
     */
    public static final OfInt cPolicyInfo$layout() {
        return cPolicyInfo$LAYOUT;
    }

    private static final long cPolicyInfo$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cPolicyInfo
     * }
     */
    public static final long cPolicyInfo$offset() {
        return cPolicyInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cPolicyInfo
     * }
     */
    public static int cPolicyInfo(MemorySegment struct) {
        return struct.get(cPolicyInfo$LAYOUT, cPolicyInfo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cPolicyInfo
     * }
     */
    public static void cPolicyInfo(MemorySegment struct, int fieldValue) {
        struct.set(cPolicyInfo$LAYOUT, cPolicyInfo$OFFSET, fieldValue);
    }

    private static final AddressLayout rgPolicyInfo$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("rgPolicyInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CERT_POLICY_INFO *rgPolicyInfo
     * }
     */
    public static final AddressLayout rgPolicyInfo$layout() {
        return rgPolicyInfo$LAYOUT;
    }

    private static final long rgPolicyInfo$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CERT_POLICY_INFO *rgPolicyInfo
     * }
     */
    public static final long rgPolicyInfo$offset() {
        return rgPolicyInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CERT_POLICY_INFO *rgPolicyInfo
     * }
     */
    public static MemorySegment rgPolicyInfo(MemorySegment struct) {
        return struct.get(rgPolicyInfo$LAYOUT, rgPolicyInfo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CERT_POLICY_INFO *rgPolicyInfo
     * }
     */
    public static void rgPolicyInfo(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(rgPolicyInfo$LAYOUT, rgPolicyInfo$OFFSET, fieldValue);
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

