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
 * struct _DISK_HISTOGRAM {
 *     LARGE_INTEGER DiskSize;
 *     LARGE_INTEGER Start;
 *     LARGE_INTEGER End;
 *     LARGE_INTEGER Average;
 *     LARGE_INTEGER AverageRead;
 *     LARGE_INTEGER AverageWrite;
 *     DWORD Granularity;
 *     DWORD Size;
 *     DWORD ReadCount;
 *     DWORD WriteCount;
 *     PHISTOGRAM_BUCKET Histogram;
 * }
 * }
 */
public class _DISK_HISTOGRAM {

    _DISK_HISTOGRAM() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _LARGE_INTEGER.layout().withName("DiskSize"),
        _LARGE_INTEGER.layout().withName("Start"),
        _LARGE_INTEGER.layout().withName("End"),
        _LARGE_INTEGER.layout().withName("Average"),
        _LARGE_INTEGER.layout().withName("AverageRead"),
        _LARGE_INTEGER.layout().withName("AverageWrite"),
        winapi.C_LONG.withName("Granularity"),
        winapi.C_LONG.withName("Size"),
        winapi.C_LONG.withName("ReadCount"),
        winapi.C_LONG.withName("WriteCount"),
        winapi.C_POINTER.withName("Histogram")
    ).withName("_DISK_HISTOGRAM");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout DiskSize$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("DiskSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER DiskSize
     * }
     */
    public static final GroupLayout DiskSize$layout() {
        return DiskSize$LAYOUT;
    }

    private static final long DiskSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER DiskSize
     * }
     */
    public static final long DiskSize$offset() {
        return DiskSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER DiskSize
     * }
     */
    public static MemorySegment DiskSize(MemorySegment struct) {
        return struct.asSlice(DiskSize$OFFSET, DiskSize$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER DiskSize
     * }
     */
    public static void DiskSize(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, DiskSize$OFFSET, DiskSize$LAYOUT.byteSize());
    }

    private static final GroupLayout Start$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Start"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER Start
     * }
     */
    public static final GroupLayout Start$layout() {
        return Start$LAYOUT;
    }

    private static final long Start$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER Start
     * }
     */
    public static final long Start$offset() {
        return Start$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER Start
     * }
     */
    public static MemorySegment Start(MemorySegment struct) {
        return struct.asSlice(Start$OFFSET, Start$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER Start
     * }
     */
    public static void Start(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Start$OFFSET, Start$LAYOUT.byteSize());
    }

    private static final GroupLayout End$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("End"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER End
     * }
     */
    public static final GroupLayout End$layout() {
        return End$LAYOUT;
    }

    private static final long End$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER End
     * }
     */
    public static final long End$offset() {
        return End$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER End
     * }
     */
    public static MemorySegment End(MemorySegment struct) {
        return struct.asSlice(End$OFFSET, End$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER End
     * }
     */
    public static void End(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, End$OFFSET, End$LAYOUT.byteSize());
    }

    private static final GroupLayout Average$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Average"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER Average
     * }
     */
    public static final GroupLayout Average$layout() {
        return Average$LAYOUT;
    }

    private static final long Average$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER Average
     * }
     */
    public static final long Average$offset() {
        return Average$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER Average
     * }
     */
    public static MemorySegment Average(MemorySegment struct) {
        return struct.asSlice(Average$OFFSET, Average$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER Average
     * }
     */
    public static void Average(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Average$OFFSET, Average$LAYOUT.byteSize());
    }

    private static final GroupLayout AverageRead$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("AverageRead"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER AverageRead
     * }
     */
    public static final GroupLayout AverageRead$layout() {
        return AverageRead$LAYOUT;
    }

    private static final long AverageRead$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER AverageRead
     * }
     */
    public static final long AverageRead$offset() {
        return AverageRead$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER AverageRead
     * }
     */
    public static MemorySegment AverageRead(MemorySegment struct) {
        return struct.asSlice(AverageRead$OFFSET, AverageRead$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER AverageRead
     * }
     */
    public static void AverageRead(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, AverageRead$OFFSET, AverageRead$LAYOUT.byteSize());
    }

    private static final GroupLayout AverageWrite$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("AverageWrite"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER AverageWrite
     * }
     */
    public static final GroupLayout AverageWrite$layout() {
        return AverageWrite$LAYOUT;
    }

    private static final long AverageWrite$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER AverageWrite
     * }
     */
    public static final long AverageWrite$offset() {
        return AverageWrite$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER AverageWrite
     * }
     */
    public static MemorySegment AverageWrite(MemorySegment struct) {
        return struct.asSlice(AverageWrite$OFFSET, AverageWrite$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER AverageWrite
     * }
     */
    public static void AverageWrite(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, AverageWrite$OFFSET, AverageWrite$LAYOUT.byteSize());
    }

    private static final OfInt Granularity$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Granularity"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Granularity
     * }
     */
    public static final OfInt Granularity$layout() {
        return Granularity$LAYOUT;
    }

    private static final long Granularity$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Granularity
     * }
     */
    public static final long Granularity$offset() {
        return Granularity$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Granularity
     * }
     */
    public static int Granularity(MemorySegment struct) {
        return struct.get(Granularity$LAYOUT, Granularity$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Granularity
     * }
     */
    public static void Granularity(MemorySegment struct, int fieldValue) {
        struct.set(Granularity$LAYOUT, Granularity$OFFSET, fieldValue);
    }

    private static final OfInt Size$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static final OfInt Size$layout() {
        return Size$LAYOUT;
    }

    private static final long Size$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static final long Size$offset() {
        return Size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static int Size(MemorySegment struct) {
        return struct.get(Size$LAYOUT, Size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static void Size(MemorySegment struct, int fieldValue) {
        struct.set(Size$LAYOUT, Size$OFFSET, fieldValue);
    }

    private static final OfInt ReadCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ReadCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ReadCount
     * }
     */
    public static final OfInt ReadCount$layout() {
        return ReadCount$LAYOUT;
    }

    private static final long ReadCount$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ReadCount
     * }
     */
    public static final long ReadCount$offset() {
        return ReadCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ReadCount
     * }
     */
    public static int ReadCount(MemorySegment struct) {
        return struct.get(ReadCount$LAYOUT, ReadCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ReadCount
     * }
     */
    public static void ReadCount(MemorySegment struct, int fieldValue) {
        struct.set(ReadCount$LAYOUT, ReadCount$OFFSET, fieldValue);
    }

    private static final OfInt WriteCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("WriteCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD WriteCount
     * }
     */
    public static final OfInt WriteCount$layout() {
        return WriteCount$LAYOUT;
    }

    private static final long WriteCount$OFFSET = 60;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD WriteCount
     * }
     */
    public static final long WriteCount$offset() {
        return WriteCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD WriteCount
     * }
     */
    public static int WriteCount(MemorySegment struct) {
        return struct.get(WriteCount$LAYOUT, WriteCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD WriteCount
     * }
     */
    public static void WriteCount(MemorySegment struct, int fieldValue) {
        struct.set(WriteCount$LAYOUT, WriteCount$OFFSET, fieldValue);
    }

    private static final AddressLayout Histogram$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("Histogram"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PHISTOGRAM_BUCKET Histogram
     * }
     */
    public static final AddressLayout Histogram$layout() {
        return Histogram$LAYOUT;
    }

    private static final long Histogram$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PHISTOGRAM_BUCKET Histogram
     * }
     */
    public static final long Histogram$offset() {
        return Histogram$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PHISTOGRAM_BUCKET Histogram
     * }
     */
    public static MemorySegment Histogram(MemorySegment struct) {
        return struct.get(Histogram$LAYOUT, Histogram$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PHISTOGRAM_BUCKET Histogram
     * }
     */
    public static void Histogram(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Histogram$LAYOUT, Histogram$OFFSET, fieldValue);
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

