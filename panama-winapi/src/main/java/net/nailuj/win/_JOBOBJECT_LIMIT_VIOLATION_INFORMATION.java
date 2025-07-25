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
 * struct _JOBOBJECT_LIMIT_VIOLATION_INFORMATION {
 *     DWORD LimitFlags;
 *     DWORD ViolationLimitFlags;
 *     DWORD64 IoReadBytes;
 *     DWORD64 IoReadBytesLimit;
 *     DWORD64 IoWriteBytes;
 *     DWORD64 IoWriteBytesLimit;
 *     LARGE_INTEGER PerJobUserTime;
 *     LARGE_INTEGER PerJobUserTimeLimit;
 *     DWORD64 JobMemory;
 *     DWORD64 JobMemoryLimit;
 *     JOBOBJECT_RATE_CONTROL_TOLERANCE RateControlTolerance;
 *     JOBOBJECT_RATE_CONTROL_TOLERANCE RateControlToleranceLimit;
 * }
 * }
 */
public class _JOBOBJECT_LIMIT_VIOLATION_INFORMATION {

    _JOBOBJECT_LIMIT_VIOLATION_INFORMATION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("LimitFlags"),
        winapi.C_LONG.withName("ViolationLimitFlags"),
        winapi.C_LONG_LONG.withName("IoReadBytes"),
        winapi.C_LONG_LONG.withName("IoReadBytesLimit"),
        winapi.C_LONG_LONG.withName("IoWriteBytes"),
        winapi.C_LONG_LONG.withName("IoWriteBytesLimit"),
        _LARGE_INTEGER.layout().withName("PerJobUserTime"),
        _LARGE_INTEGER.layout().withName("PerJobUserTimeLimit"),
        winapi.C_LONG_LONG.withName("JobMemory"),
        winapi.C_LONG_LONG.withName("JobMemoryLimit"),
        winapi.C_INT.withName("RateControlTolerance"),
        winapi.C_INT.withName("RateControlToleranceLimit")
    ).withName("_JOBOBJECT_LIMIT_VIOLATION_INFORMATION");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
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

    private static final long LimitFlags$OFFSET = 0;

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

    private static final OfInt ViolationLimitFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ViolationLimitFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ViolationLimitFlags
     * }
     */
    public static final OfInt ViolationLimitFlags$layout() {
        return ViolationLimitFlags$LAYOUT;
    }

    private static final long ViolationLimitFlags$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ViolationLimitFlags
     * }
     */
    public static final long ViolationLimitFlags$offset() {
        return ViolationLimitFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ViolationLimitFlags
     * }
     */
    public static int ViolationLimitFlags(MemorySegment struct) {
        return struct.get(ViolationLimitFlags$LAYOUT, ViolationLimitFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ViolationLimitFlags
     * }
     */
    public static void ViolationLimitFlags(MemorySegment struct, int fieldValue) {
        struct.set(ViolationLimitFlags$LAYOUT, ViolationLimitFlags$OFFSET, fieldValue);
    }

    private static final OfLong IoReadBytes$LAYOUT = (OfLong)$LAYOUT.select(groupElement("IoReadBytes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD64 IoReadBytes
     * }
     */
    public static final OfLong IoReadBytes$layout() {
        return IoReadBytes$LAYOUT;
    }

    private static final long IoReadBytes$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD64 IoReadBytes
     * }
     */
    public static final long IoReadBytes$offset() {
        return IoReadBytes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD64 IoReadBytes
     * }
     */
    public static long IoReadBytes(MemorySegment struct) {
        return struct.get(IoReadBytes$LAYOUT, IoReadBytes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD64 IoReadBytes
     * }
     */
    public static void IoReadBytes(MemorySegment struct, long fieldValue) {
        struct.set(IoReadBytes$LAYOUT, IoReadBytes$OFFSET, fieldValue);
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

    private static final long IoReadBytesLimit$OFFSET = 16;

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

    private static final OfLong IoWriteBytes$LAYOUT = (OfLong)$LAYOUT.select(groupElement("IoWriteBytes"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD64 IoWriteBytes
     * }
     */
    public static final OfLong IoWriteBytes$layout() {
        return IoWriteBytes$LAYOUT;
    }

    private static final long IoWriteBytes$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD64 IoWriteBytes
     * }
     */
    public static final long IoWriteBytes$offset() {
        return IoWriteBytes$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD64 IoWriteBytes
     * }
     */
    public static long IoWriteBytes(MemorySegment struct) {
        return struct.get(IoWriteBytes$LAYOUT, IoWriteBytes$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD64 IoWriteBytes
     * }
     */
    public static void IoWriteBytes(MemorySegment struct, long fieldValue) {
        struct.set(IoWriteBytes$LAYOUT, IoWriteBytes$OFFSET, fieldValue);
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

    private static final long IoWriteBytesLimit$OFFSET = 32;

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

    private static final GroupLayout PerJobUserTime$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("PerJobUserTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER PerJobUserTime
     * }
     */
    public static final GroupLayout PerJobUserTime$layout() {
        return PerJobUserTime$LAYOUT;
    }

    private static final long PerJobUserTime$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER PerJobUserTime
     * }
     */
    public static final long PerJobUserTime$offset() {
        return PerJobUserTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER PerJobUserTime
     * }
     */
    public static MemorySegment PerJobUserTime(MemorySegment struct) {
        return struct.asSlice(PerJobUserTime$OFFSET, PerJobUserTime$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER PerJobUserTime
     * }
     */
    public static void PerJobUserTime(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, PerJobUserTime$OFFSET, PerJobUserTime$LAYOUT.byteSize());
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

    private static final long PerJobUserTimeLimit$OFFSET = 48;

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

    private static final OfLong JobMemory$LAYOUT = (OfLong)$LAYOUT.select(groupElement("JobMemory"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD64 JobMemory
     * }
     */
    public static final OfLong JobMemory$layout() {
        return JobMemory$LAYOUT;
    }

    private static final long JobMemory$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD64 JobMemory
     * }
     */
    public static final long JobMemory$offset() {
        return JobMemory$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD64 JobMemory
     * }
     */
    public static long JobMemory(MemorySegment struct) {
        return struct.get(JobMemory$LAYOUT, JobMemory$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD64 JobMemory
     * }
     */
    public static void JobMemory(MemorySegment struct, long fieldValue) {
        struct.set(JobMemory$LAYOUT, JobMemory$OFFSET, fieldValue);
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

    private static final long JobMemoryLimit$OFFSET = 64;

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

    private static final long RateControlTolerance$OFFSET = 72;

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

    private static final OfInt RateControlToleranceLimit$LAYOUT = (OfInt)$LAYOUT.select(groupElement("RateControlToleranceLimit"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE RateControlToleranceLimit
     * }
     */
    public static final OfInt RateControlToleranceLimit$layout() {
        return RateControlToleranceLimit$LAYOUT;
    }

    private static final long RateControlToleranceLimit$OFFSET = 76;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE RateControlToleranceLimit
     * }
     */
    public static final long RateControlToleranceLimit$offset() {
        return RateControlToleranceLimit$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE RateControlToleranceLimit
     * }
     */
    public static int RateControlToleranceLimit(MemorySegment struct) {
        return struct.get(RateControlToleranceLimit$LAYOUT, RateControlToleranceLimit$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * JOBOBJECT_RATE_CONTROL_TOLERANCE RateControlToleranceLimit
     * }
     */
    public static void RateControlToleranceLimit(MemorySegment struct, int fieldValue) {
        struct.set(RateControlToleranceLimit$LAYOUT, RateControlToleranceLimit$OFFSET, fieldValue);
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

