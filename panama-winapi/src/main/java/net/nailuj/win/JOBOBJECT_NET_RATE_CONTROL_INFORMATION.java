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
 * struct JOBOBJECT_NET_RATE_CONTROL_INFORMATION {
 *     DWORD64 MaxBandwidth;
 *     JOB_OBJECT_NET_RATE_CONTROL_FLAGS ControlFlags;
 *     BYTE DscpTag;
 * }
 * }
 */
public class JOBOBJECT_NET_RATE_CONTROL_INFORMATION {

    JOBOBJECT_NET_RATE_CONTROL_INFORMATION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG_LONG.withName("MaxBandwidth"),
        winapi.C_INT.withName("ControlFlags"),
        winapi.C_CHAR.withName("DscpTag"),
        MemoryLayout.paddingLayout(3)
    ).withName("JOBOBJECT_NET_RATE_CONTROL_INFORMATION");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong MaxBandwidth$LAYOUT = (OfLong)$LAYOUT.select(groupElement("MaxBandwidth"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD64 MaxBandwidth
     * }
     */
    public static final OfLong MaxBandwidth$layout() {
        return MaxBandwidth$LAYOUT;
    }

    private static final long MaxBandwidth$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD64 MaxBandwidth
     * }
     */
    public static final long MaxBandwidth$offset() {
        return MaxBandwidth$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD64 MaxBandwidth
     * }
     */
    public static long MaxBandwidth(MemorySegment struct) {
        return struct.get(MaxBandwidth$LAYOUT, MaxBandwidth$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD64 MaxBandwidth
     * }
     */
    public static void MaxBandwidth(MemorySegment struct, long fieldValue) {
        struct.set(MaxBandwidth$LAYOUT, MaxBandwidth$OFFSET, fieldValue);
    }

    private static final OfInt ControlFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ControlFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * JOB_OBJECT_NET_RATE_CONTROL_FLAGS ControlFlags
     * }
     */
    public static final OfInt ControlFlags$layout() {
        return ControlFlags$LAYOUT;
    }

    private static final long ControlFlags$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * JOB_OBJECT_NET_RATE_CONTROL_FLAGS ControlFlags
     * }
     */
    public static final long ControlFlags$offset() {
        return ControlFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * JOB_OBJECT_NET_RATE_CONTROL_FLAGS ControlFlags
     * }
     */
    public static int ControlFlags(MemorySegment struct) {
        return struct.get(ControlFlags$LAYOUT, ControlFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * JOB_OBJECT_NET_RATE_CONTROL_FLAGS ControlFlags
     * }
     */
    public static void ControlFlags(MemorySegment struct, int fieldValue) {
        struct.set(ControlFlags$LAYOUT, ControlFlags$OFFSET, fieldValue);
    }

    private static final OfByte DscpTag$LAYOUT = (OfByte)$LAYOUT.select(groupElement("DscpTag"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE DscpTag
     * }
     */
    public static final OfByte DscpTag$layout() {
        return DscpTag$LAYOUT;
    }

    private static final long DscpTag$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE DscpTag
     * }
     */
    public static final long DscpTag$offset() {
        return DscpTag$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE DscpTag
     * }
     */
    public static byte DscpTag(MemorySegment struct) {
        return struct.get(DscpTag$LAYOUT, DscpTag$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE DscpTag
     * }
     */
    public static void DscpTag(MemorySegment struct, byte fieldValue) {
        struct.set(DscpTag$LAYOUT, DscpTag$OFFSET, fieldValue);
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

