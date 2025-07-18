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
 * struct _QUOTA_LIMITS_EX {
 *     SIZE_T PagedPoolLimit;
 *     SIZE_T NonPagedPoolLimit;
 *     SIZE_T MinimumWorkingSetSize;
 *     SIZE_T MaximumWorkingSetSize;
 *     SIZE_T PagefileLimit;
 *     LARGE_INTEGER TimeLimit;
 *     SIZE_T WorkingSetLimit;
 *     SIZE_T Reserved2;
 *     SIZE_T Reserved3;
 *     SIZE_T Reserved4;
 *     DWORD Flags;
 *     RATE_QUOTA_LIMIT CpuRateLimit;
 * }
 * }
 */
public class _QUOTA_LIMITS_EX {

    _QUOTA_LIMITS_EX() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG_LONG.withName("PagedPoolLimit"),
        winapi.C_LONG_LONG.withName("NonPagedPoolLimit"),
        winapi.C_LONG_LONG.withName("MinimumWorkingSetSize"),
        winapi.C_LONG_LONG.withName("MaximumWorkingSetSize"),
        winapi.C_LONG_LONG.withName("PagefileLimit"),
        _LARGE_INTEGER.layout().withName("TimeLimit"),
        winapi.C_LONG_LONG.withName("WorkingSetLimit"),
        winapi.C_LONG_LONG.withName("Reserved2"),
        winapi.C_LONG_LONG.withName("Reserved3"),
        winapi.C_LONG_LONG.withName("Reserved4"),
        winapi.C_LONG.withName("Flags"),
        _RATE_QUOTA_LIMIT.layout().withName("CpuRateLimit")
    ).withName("_QUOTA_LIMITS_EX");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong PagedPoolLimit$LAYOUT = (OfLong)$LAYOUT.select(groupElement("PagedPoolLimit"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SIZE_T PagedPoolLimit
     * }
     */
    public static final OfLong PagedPoolLimit$layout() {
        return PagedPoolLimit$LAYOUT;
    }

    private static final long PagedPoolLimit$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SIZE_T PagedPoolLimit
     * }
     */
    public static final long PagedPoolLimit$offset() {
        return PagedPoolLimit$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SIZE_T PagedPoolLimit
     * }
     */
    public static long PagedPoolLimit(MemorySegment struct) {
        return struct.get(PagedPoolLimit$LAYOUT, PagedPoolLimit$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SIZE_T PagedPoolLimit
     * }
     */
    public static void PagedPoolLimit(MemorySegment struct, long fieldValue) {
        struct.set(PagedPoolLimit$LAYOUT, PagedPoolLimit$OFFSET, fieldValue);
    }

    private static final OfLong NonPagedPoolLimit$LAYOUT = (OfLong)$LAYOUT.select(groupElement("NonPagedPoolLimit"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SIZE_T NonPagedPoolLimit
     * }
     */
    public static final OfLong NonPagedPoolLimit$layout() {
        return NonPagedPoolLimit$LAYOUT;
    }

    private static final long NonPagedPoolLimit$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SIZE_T NonPagedPoolLimit
     * }
     */
    public static final long NonPagedPoolLimit$offset() {
        return NonPagedPoolLimit$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SIZE_T NonPagedPoolLimit
     * }
     */
    public static long NonPagedPoolLimit(MemorySegment struct) {
        return struct.get(NonPagedPoolLimit$LAYOUT, NonPagedPoolLimit$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SIZE_T NonPagedPoolLimit
     * }
     */
    public static void NonPagedPoolLimit(MemorySegment struct, long fieldValue) {
        struct.set(NonPagedPoolLimit$LAYOUT, NonPagedPoolLimit$OFFSET, fieldValue);
    }

    private static final OfLong MinimumWorkingSetSize$LAYOUT = (OfLong)$LAYOUT.select(groupElement("MinimumWorkingSetSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SIZE_T MinimumWorkingSetSize
     * }
     */
    public static final OfLong MinimumWorkingSetSize$layout() {
        return MinimumWorkingSetSize$LAYOUT;
    }

    private static final long MinimumWorkingSetSize$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SIZE_T MinimumWorkingSetSize
     * }
     */
    public static final long MinimumWorkingSetSize$offset() {
        return MinimumWorkingSetSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SIZE_T MinimumWorkingSetSize
     * }
     */
    public static long MinimumWorkingSetSize(MemorySegment struct) {
        return struct.get(MinimumWorkingSetSize$LAYOUT, MinimumWorkingSetSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SIZE_T MinimumWorkingSetSize
     * }
     */
    public static void MinimumWorkingSetSize(MemorySegment struct, long fieldValue) {
        struct.set(MinimumWorkingSetSize$LAYOUT, MinimumWorkingSetSize$OFFSET, fieldValue);
    }

    private static final OfLong MaximumWorkingSetSize$LAYOUT = (OfLong)$LAYOUT.select(groupElement("MaximumWorkingSetSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SIZE_T MaximumWorkingSetSize
     * }
     */
    public static final OfLong MaximumWorkingSetSize$layout() {
        return MaximumWorkingSetSize$LAYOUT;
    }

    private static final long MaximumWorkingSetSize$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SIZE_T MaximumWorkingSetSize
     * }
     */
    public static final long MaximumWorkingSetSize$offset() {
        return MaximumWorkingSetSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SIZE_T MaximumWorkingSetSize
     * }
     */
    public static long MaximumWorkingSetSize(MemorySegment struct) {
        return struct.get(MaximumWorkingSetSize$LAYOUT, MaximumWorkingSetSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SIZE_T MaximumWorkingSetSize
     * }
     */
    public static void MaximumWorkingSetSize(MemorySegment struct, long fieldValue) {
        struct.set(MaximumWorkingSetSize$LAYOUT, MaximumWorkingSetSize$OFFSET, fieldValue);
    }

    private static final OfLong PagefileLimit$LAYOUT = (OfLong)$LAYOUT.select(groupElement("PagefileLimit"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SIZE_T PagefileLimit
     * }
     */
    public static final OfLong PagefileLimit$layout() {
        return PagefileLimit$LAYOUT;
    }

    private static final long PagefileLimit$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SIZE_T PagefileLimit
     * }
     */
    public static final long PagefileLimit$offset() {
        return PagefileLimit$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SIZE_T PagefileLimit
     * }
     */
    public static long PagefileLimit(MemorySegment struct) {
        return struct.get(PagefileLimit$LAYOUT, PagefileLimit$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SIZE_T PagefileLimit
     * }
     */
    public static void PagefileLimit(MemorySegment struct, long fieldValue) {
        struct.set(PagefileLimit$LAYOUT, PagefileLimit$OFFSET, fieldValue);
    }

    private static final GroupLayout TimeLimit$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("TimeLimit"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER TimeLimit
     * }
     */
    public static final GroupLayout TimeLimit$layout() {
        return TimeLimit$LAYOUT;
    }

    private static final long TimeLimit$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER TimeLimit
     * }
     */
    public static final long TimeLimit$offset() {
        return TimeLimit$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER TimeLimit
     * }
     */
    public static MemorySegment TimeLimit(MemorySegment struct) {
        return struct.asSlice(TimeLimit$OFFSET, TimeLimit$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER TimeLimit
     * }
     */
    public static void TimeLimit(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, TimeLimit$OFFSET, TimeLimit$LAYOUT.byteSize());
    }

    private static final OfLong WorkingSetLimit$LAYOUT = (OfLong)$LAYOUT.select(groupElement("WorkingSetLimit"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SIZE_T WorkingSetLimit
     * }
     */
    public static final OfLong WorkingSetLimit$layout() {
        return WorkingSetLimit$LAYOUT;
    }

    private static final long WorkingSetLimit$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SIZE_T WorkingSetLimit
     * }
     */
    public static final long WorkingSetLimit$offset() {
        return WorkingSetLimit$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SIZE_T WorkingSetLimit
     * }
     */
    public static long WorkingSetLimit(MemorySegment struct) {
        return struct.get(WorkingSetLimit$LAYOUT, WorkingSetLimit$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SIZE_T WorkingSetLimit
     * }
     */
    public static void WorkingSetLimit(MemorySegment struct, long fieldValue) {
        struct.set(WorkingSetLimit$LAYOUT, WorkingSetLimit$OFFSET, fieldValue);
    }

    private static final OfLong Reserved2$LAYOUT = (OfLong)$LAYOUT.select(groupElement("Reserved2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SIZE_T Reserved2
     * }
     */
    public static final OfLong Reserved2$layout() {
        return Reserved2$LAYOUT;
    }

    private static final long Reserved2$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SIZE_T Reserved2
     * }
     */
    public static final long Reserved2$offset() {
        return Reserved2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SIZE_T Reserved2
     * }
     */
    public static long Reserved2(MemorySegment struct) {
        return struct.get(Reserved2$LAYOUT, Reserved2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SIZE_T Reserved2
     * }
     */
    public static void Reserved2(MemorySegment struct, long fieldValue) {
        struct.set(Reserved2$LAYOUT, Reserved2$OFFSET, fieldValue);
    }

    private static final OfLong Reserved3$LAYOUT = (OfLong)$LAYOUT.select(groupElement("Reserved3"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SIZE_T Reserved3
     * }
     */
    public static final OfLong Reserved3$layout() {
        return Reserved3$LAYOUT;
    }

    private static final long Reserved3$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SIZE_T Reserved3
     * }
     */
    public static final long Reserved3$offset() {
        return Reserved3$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SIZE_T Reserved3
     * }
     */
    public static long Reserved3(MemorySegment struct) {
        return struct.get(Reserved3$LAYOUT, Reserved3$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SIZE_T Reserved3
     * }
     */
    public static void Reserved3(MemorySegment struct, long fieldValue) {
        struct.set(Reserved3$LAYOUT, Reserved3$OFFSET, fieldValue);
    }

    private static final OfLong Reserved4$LAYOUT = (OfLong)$LAYOUT.select(groupElement("Reserved4"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SIZE_T Reserved4
     * }
     */
    public static final OfLong Reserved4$layout() {
        return Reserved4$LAYOUT;
    }

    private static final long Reserved4$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SIZE_T Reserved4
     * }
     */
    public static final long Reserved4$offset() {
        return Reserved4$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SIZE_T Reserved4
     * }
     */
    public static long Reserved4(MemorySegment struct) {
        return struct.get(Reserved4$LAYOUT, Reserved4$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SIZE_T Reserved4
     * }
     */
    public static void Reserved4(MemorySegment struct, long fieldValue) {
        struct.set(Reserved4$LAYOUT, Reserved4$OFFSET, fieldValue);
    }

    private static final OfInt Flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static final OfInt Flags$layout() {
        return Flags$LAYOUT;
    }

    private static final long Flags$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static final long Flags$offset() {
        return Flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static int Flags(MemorySegment struct) {
        return struct.get(Flags$LAYOUT, Flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static void Flags(MemorySegment struct, int fieldValue) {
        struct.set(Flags$LAYOUT, Flags$OFFSET, fieldValue);
    }

    private static final GroupLayout CpuRateLimit$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("CpuRateLimit"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RATE_QUOTA_LIMIT CpuRateLimit
     * }
     */
    public static final GroupLayout CpuRateLimit$layout() {
        return CpuRateLimit$LAYOUT;
    }

    private static final long CpuRateLimit$OFFSET = 84;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RATE_QUOTA_LIMIT CpuRateLimit
     * }
     */
    public static final long CpuRateLimit$offset() {
        return CpuRateLimit$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RATE_QUOTA_LIMIT CpuRateLimit
     * }
     */
    public static MemorySegment CpuRateLimit(MemorySegment struct) {
        return struct.asSlice(CpuRateLimit$OFFSET, CpuRateLimit$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RATE_QUOTA_LIMIT CpuRateLimit
     * }
     */
    public static void CpuRateLimit(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, CpuRateLimit$OFFSET, CpuRateLimit$LAYOUT.byteSize());
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

