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
 * struct _JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION {
 *     DWORD64 IoReadBytesLimit;
 *     DWORD64 IoWriteBytesLimit;
 *     LARGE_INTEGER PerJobUserTimeLimit;
 *     DWORD64 JobMemoryLimit;
 *     JOBOBJECT_RATE_CONTROL_TOLERANCE RateControlTolerance;
 *     JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL RateControlToleranceInterval;
 *     DWORD LimitFlags;
 * }
 * }
 */
public class _JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION {

    _JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG_LONG.withName("IoReadBytesLimit"),
        winapi.C_LONG_LONG.withName("IoWriteBytesLimit"),
        _LARGE_INTEGER.layout().withName("PerJobUserTimeLimit"),
        winapi.C_LONG_LONG.withName("JobMemoryLimit"),
        winapi.C_INT.withName("RateControlTolerance"),
        winapi.C_INT.withName("RateControlToleranceInterval"),
        winapi.C_LONG.withName("LimitFlags"),
        MemoryLayout.paddingLayout(4)
    ).withName("_JOBOBJECT_NOTIFICATION_LIMIT_INFORMATION");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong IoReadBytesLimit$LAYOUT = (OfLong)$LAYOUT.select(groupElement("IoReadBytesLimit"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD64 IoReadBytesLimit
     * }
     */
    public static final OfLong IoReadBytesLimit$layout() {
        return IoReadBytesLimit$LAYOUT;
    }

    private static final long IoReadBytesLimit$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD64 IoReadBytesLimit
     * }
     */
    public static final long IoReadBytesLimit$offset() {
        return IoReadBytesLimit$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD64 IoReadBytesLimit
     * }
     */
    public static long IoReadBytesLimit(MemorySegment struct) {
        return struct.get(IoReadBytesLimit$LAYOUT, IoReadBytesLimit$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD64 IoReadBytesLimit
     * }
     */
    public static void IoReadBytesLimit(MemorySegment struct, long fieldValue) {
        struct.set(IoReadBytesLimit$LAYOUT, IoReadBytesLimit$OFFSET, fieldValue);
    }

    private static final OfLong IoWriteBytesLimit$LAYOUT = (OfLong)$LAYOUT.select(groupElement("IoWriteBytesLimit"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD64 IoWriteBytesLimit
     * }
     */
    public static final OfLong IoWriteBytesLimit$layout() {
        return IoWriteBytesLimit$LAYOUT;
    }

    private static final long IoWriteBytesLimit$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD64 IoWriteBytesLimit
     * }
     */
    public static final long IoWriteBytesLimit$offset() {
        return IoWriteBytesLimit$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD64 IoWriteBytesLimit
     * }
     */
    public static long IoWriteBytesLimit(MemorySegment struct) {
        return struct.get(IoWriteBytesLimit$LAYOUT, IoWriteBytesLimit$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD64 IoWriteBytesLimit
     * }
     */
    public static void IoWriteBytesLimit(MemorySegment struct, long fieldValue) {
        struct.set(IoWriteBytesLimit$LAYOUT, IoWriteBytesLimit$OFFSET, fieldValue);
    }

    private static final GroupLayout PerJobUserTimeLimit$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("PerJobUserTimeLimit"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER PerJobUserTimeLimit
     * }
     */
    public static final GroupLayout PerJobUserTimeLimit$layout() {
        return PerJobUserTimeLimit$LAYOUT;
    }

    private static final long PerJobUserTimeLimit$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER PerJobUserTimeLimit
     * }
     */
    public static final long PerJobUserTimeLimit$offset() {
        return PerJobUserTimeLimit$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER PerJobUserTimeLimit
     * }
     */
    public static MemorySegment PerJobUserTimeLimit(MemorySegment struct) {
        return struct.asSlice(PerJobUserTimeLimit$OFFSET, PerJobUserTimeLimit$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER PerJobUserTimeLimit
     * }
     */
    public static void PerJobUserTimeLimit(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, PerJobUserTimeLimit$OFFSET, PerJobUserTimeLimit$LAYOUT.byteSize());
    }

    private static final OfLong JobMemoryLimit$LAYOUT = (OfLong)$LAYOUT.select(groupElement("JobMemoryLimit"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD64 JobMemoryLimit
     * }
     */
    public static final OfLong JobMemoryLimit$layout() {
        return JobMemoryLimit$LAYOUT;
    }

    private static final long JobMemoryLimit$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD64 JobMemoryLimit
     * }
     */
    public static final long JobMemoryLimit$offset() {
        return JobMemoryLimit$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD64 JobMemoryLimit
     * }
     */
    public static long JobMemoryLimit(MemorySegment struct) {
        return struct.get(JobMemoryLimit$LAYOUT, JobMemoryLimit$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD64 JobMemoryLimit
     * }
     */
    public static void JobMemoryLimit(MemorySegment struct, long fieldValue) {
        struct.set(JobMemoryLimit$LAYOUT, JobMemoryLimit$OFFSET, fieldValue);
    }

    private static final OfInt RateControlTolerance$LAYOUT = (OfInt)$LAYOUT.select(groupElement("RateControlTolerance"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE RateControlTolerance
     * }
     */
    public static final OfInt RateControlTolerance$layout() {
        return RateControlTolerance$LAYOUT;
    }

    private static final long RateControlTolerance$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE RateControlTolerance
     * }
     */
    public static final long RateControlTolerance$offset() {
        return RateControlTolerance$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE RateControlTolerance
     * }
     */
    public static int RateControlTolerance(MemorySegment struct) {
        return struct.get(RateControlTolerance$LAYOUT, RateControlTolerance$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE RateControlTolerance
     * }
     */
    public static void RateControlTolerance(MemorySegment struct, int fieldValue) {
        struct.set(RateControlTolerance$LAYOUT, RateControlTolerance$OFFSET, fieldValue);
    }

    private static final OfInt RateControlToleranceInterval$LAYOUT = (OfInt)$LAYOUT.select(groupElement("RateControlToleranceInterval"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL RateControlToleranceInterval
     * }
     */
    public static final OfInt RateControlToleranceInterval$layout() {
        return RateControlToleranceInterval$LAYOUT;
    }

    private static final long RateControlToleranceInterval$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL RateControlToleranceInterval
     * }
     */
    public static final long RateControlToleranceInterval$offset() {
        return RateControlToleranceInterval$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL RateControlToleranceInterval
     * }
     */
    public static int RateControlToleranceInterval(MemorySegment struct) {
        return struct.get(RateControlToleranceInterval$LAYOUT, RateControlToleranceInterval$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE_INTERVAL RateControlToleranceInterval
     * }
     */
    public static void RateControlToleranceInterval(MemorySegment struct, int fieldValue) {
        struct.set(RateControlToleranceInterval$LAYOUT, RateControlToleranceInterval$OFFSET, fieldValue);
    }

    private static final OfInt LimitFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("LimitFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD LimitFlags
     * }
     */
    public static final OfInt LimitFlags$layout() {
        return LimitFlags$LAYOUT;
    }

    private static final long LimitFlags$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD LimitFlags
     * }
     */
    public static final long LimitFlags$offset() {
        return LimitFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD LimitFlags
     * }
     */
    public static int LimitFlags(MemorySegment struct) {
        return struct.get(LimitFlags$LAYOUT, LimitFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD LimitFlags
     * }
     */
    public static void LimitFlags(MemorySegment struct, int fieldValue) {
        struct.set(LimitFlags$LAYOUT, LimitFlags$OFFSET, fieldValue);
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

