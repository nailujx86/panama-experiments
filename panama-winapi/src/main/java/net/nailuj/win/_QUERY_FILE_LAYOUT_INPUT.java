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
 * struct _QUERY_FILE_LAYOUT_INPUT {
 *     union {
 *         DWORD FilterEntryCount;
 *         DWORD NumberOfPairs;
 *     };
 *     DWORD Flags;
 *     QUERY_FILE_LAYOUT_FILTER_TYPE FilterType;
 *     DWORD Reserved;
 *     union {
 *         CLUSTER_RANGE ClusterRanges[1];
 *         FILE_REFERENCE_RANGE FileReferenceRanges[1];
 *         STORAGE_RESERVE_ID StorageReserveIds[1];
 *     } Filter;
 * }
 * }
 */
public class _QUERY_FILE_LAYOUT_INPUT {

    _QUERY_FILE_LAYOUT_INPUT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            winapi.C_LONG.withName("FilterEntryCount"),
            winapi.C_LONG.withName("NumberOfPairs")
        ).withName("$anon$15609:5"),
        winapi.C_LONG.withName("Flags"),
        winapi.C_INT.withName("FilterType"),
        winapi.C_LONG.withName("Reserved"),
        _QUERY_FILE_LAYOUT_INPUT.Filter.layout().withName("Filter")
    ).withName("_QUERY_FILE_LAYOUT_INPUT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt FilterEntryCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("$anon$15609:5"), groupElement("FilterEntryCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD FilterEntryCount
     * }
     */
    public static final OfInt FilterEntryCount$layout() {
        return FilterEntryCount$LAYOUT;
    }

    private static final long FilterEntryCount$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD FilterEntryCount
     * }
     */
    public static final long FilterEntryCount$offset() {
        return FilterEntryCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD FilterEntryCount
     * }
     */
    public static int FilterEntryCount(MemorySegment struct) {
        return struct.get(FilterEntryCount$LAYOUT, FilterEntryCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD FilterEntryCount
     * }
     */
    public static void FilterEntryCount(MemorySegment struct, int fieldValue) {
        struct.set(FilterEntryCount$LAYOUT, FilterEntryCount$OFFSET, fieldValue);
    }

    private static final OfInt NumberOfPairs$LAYOUT = (OfInt)$LAYOUT.select(groupElement("$anon$15609:5"), groupElement("NumberOfPairs"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD NumberOfPairs
     * }
     */
    public static final OfInt NumberOfPairs$layout() {
        return NumberOfPairs$LAYOUT;
    }

    private static final long NumberOfPairs$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD NumberOfPairs
     * }
     */
    public static final long NumberOfPairs$offset() {
        return NumberOfPairs$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD NumberOfPairs
     * }
     */
    public static int NumberOfPairs(MemorySegment struct) {
        return struct.get(NumberOfPairs$LAYOUT, NumberOfPairs$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD NumberOfPairs
     * }
     */
    public static void NumberOfPairs(MemorySegment struct, int fieldValue) {
        struct.set(NumberOfPairs$LAYOUT, NumberOfPairs$OFFSET, fieldValue);
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

    private static final long Flags$OFFSET = 4;

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

    private static final OfInt FilterType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("FilterType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * QUERY_FILE_LAYOUT_FILTER_TYPE FilterType
     * }
     */
    public static final OfInt FilterType$layout() {
        return FilterType$LAYOUT;
    }

    private static final long FilterType$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * QUERY_FILE_LAYOUT_FILTER_TYPE FilterType
     * }
     */
    public static final long FilterType$offset() {
        return FilterType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * QUERY_FILE_LAYOUT_FILTER_TYPE FilterType
     * }
     */
    public static int FilterType(MemorySegment struct) {
        return struct.get(FilterType$LAYOUT, FilterType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * QUERY_FILE_LAYOUT_FILTER_TYPE FilterType
     * }
     */
    public static void FilterType(MemorySegment struct, int fieldValue) {
        struct.set(FilterType$LAYOUT, FilterType$OFFSET, fieldValue);
    }

    private static final OfInt Reserved$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Reserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Reserved
     * }
     */
    public static final OfInt Reserved$layout() {
        return Reserved$LAYOUT;
    }

    private static final long Reserved$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Reserved
     * }
     */
    public static final long Reserved$offset() {
        return Reserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Reserved
     * }
     */
    public static int Reserved(MemorySegment struct) {
        return struct.get(Reserved$LAYOUT, Reserved$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Reserved
     * }
     */
    public static void Reserved(MemorySegment struct, int fieldValue) {
        struct.set(Reserved$LAYOUT, Reserved$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * union {
     *     CLUSTER_RANGE ClusterRanges[1];
     *     FILE_REFERENCE_RANGE FileReferenceRanges[1];
     *     STORAGE_RESERVE_ID StorageReserveIds[1];
     * }
     * }
     */
    public static class Filter {

        Filter() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
            MemoryLayout.sequenceLayout(1, _CLUSTER_RANGE.layout()).withName("ClusterRanges"),
            MemoryLayout.sequenceLayout(1, _FILE_REFERENCE_RANGE.layout()).withName("FileReferenceRanges"),
            MemoryLayout.sequenceLayout(1, winapi.C_INT).withName("StorageReserveIds")
        ).withName("$anon$15636:5");

        /**
         * The layout of this union
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final SequenceLayout ClusterRanges$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("ClusterRanges"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * CLUSTER_RANGE ClusterRanges[1]
         * }
         */
        public static final SequenceLayout ClusterRanges$layout() {
            return ClusterRanges$LAYOUT;
        }

        private static final long ClusterRanges$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * CLUSTER_RANGE ClusterRanges[1]
         * }
         */
        public static final long ClusterRanges$offset() {
            return ClusterRanges$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * CLUSTER_RANGE ClusterRanges[1]
         * }
         */
        public static MemorySegment ClusterRanges(MemorySegment union) {
            return union.asSlice(ClusterRanges$OFFSET, ClusterRanges$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * CLUSTER_RANGE ClusterRanges[1]
         * }
         */
        public static void ClusterRanges(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, ClusterRanges$OFFSET, ClusterRanges$LAYOUT.byteSize());
        }

        private static long[] ClusterRanges$DIMS = { 1 };

        /**
         * Dimensions for array field:
         * {@snippet lang=c :
         * CLUSTER_RANGE ClusterRanges[1]
         * }
         */
        public static long[] ClusterRanges$dimensions() {
            return ClusterRanges$DIMS;
        }
        private static final MethodHandle ClusterRanges$ELEM_HANDLE = ClusterRanges$LAYOUT.sliceHandle(sequenceElement());

        /**
         * Indexed getter for field:
         * {@snippet lang=c :
         * CLUSTER_RANGE ClusterRanges[1]
         * }
         */
        public static MemorySegment ClusterRanges(MemorySegment union, long index0) {
            try {
                return (MemorySegment)ClusterRanges$ELEM_HANDLE.invokeExact(union, 0L, index0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }

        /**
         * Indexed setter for field:
         * {@snippet lang=c :
         * CLUSTER_RANGE ClusterRanges[1]
         * }
         */
        public static void ClusterRanges(MemorySegment union, long index0, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, ClusterRanges(union, index0), 0L, _CLUSTER_RANGE.layout().byteSize());
        }

        private static final SequenceLayout FileReferenceRanges$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("FileReferenceRanges"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * FILE_REFERENCE_RANGE FileReferenceRanges[1]
         * }
         */
        public static final SequenceLayout FileReferenceRanges$layout() {
            return FileReferenceRanges$LAYOUT;
        }

        private static final long FileReferenceRanges$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * FILE_REFERENCE_RANGE FileReferenceRanges[1]
         * }
         */
        public static final long FileReferenceRanges$offset() {
            return FileReferenceRanges$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * FILE_REFERENCE_RANGE FileReferenceRanges[1]
         * }
         */
        public static MemorySegment FileReferenceRanges(MemorySegment union) {
            return union.asSlice(FileReferenceRanges$OFFSET, FileReferenceRanges$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * FILE_REFERENCE_RANGE FileReferenceRanges[1]
         * }
         */
        public static void FileReferenceRanges(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, FileReferenceRanges$OFFSET, FileReferenceRanges$LAYOUT.byteSize());
        }

        private static long[] FileReferenceRanges$DIMS = { 1 };

        /**
         * Dimensions for array field:
         * {@snippet lang=c :
         * FILE_REFERENCE_RANGE FileReferenceRanges[1]
         * }
         */
        public static long[] FileReferenceRanges$dimensions() {
            return FileReferenceRanges$DIMS;
        }
        private static final MethodHandle FileReferenceRanges$ELEM_HANDLE = FileReferenceRanges$LAYOUT.sliceHandle(sequenceElement());

        /**
         * Indexed getter for field:
         * {@snippet lang=c :
         * FILE_REFERENCE_RANGE FileReferenceRanges[1]
         * }
         */
        public static MemorySegment FileReferenceRanges(MemorySegment union, long index0) {
            try {
                return (MemorySegment)FileReferenceRanges$ELEM_HANDLE.invokeExact(union, 0L, index0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }

        /**
         * Indexed setter for field:
         * {@snippet lang=c :
         * FILE_REFERENCE_RANGE FileReferenceRanges[1]
         * }
         */
        public static void FileReferenceRanges(MemorySegment union, long index0, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, FileReferenceRanges(union, index0), 0L, _FILE_REFERENCE_RANGE.layout().byteSize());
        }

        private static final SequenceLayout StorageReserveIds$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("StorageReserveIds"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * STORAGE_RESERVE_ID StorageReserveIds[1]
         * }
         */
        public static final SequenceLayout StorageReserveIds$layout() {
            return StorageReserveIds$LAYOUT;
        }

        private static final long StorageReserveIds$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * STORAGE_RESERVE_ID StorageReserveIds[1]
         * }
         */
        public static final long StorageReserveIds$offset() {
            return StorageReserveIds$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * STORAGE_RESERVE_ID StorageReserveIds[1]
         * }
         */
        public static MemorySegment StorageReserveIds(MemorySegment union) {
            return union.asSlice(StorageReserveIds$OFFSET, StorageReserveIds$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * STORAGE_RESERVE_ID StorageReserveIds[1]
         * }
         */
        public static void StorageReserveIds(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, StorageReserveIds$OFFSET, StorageReserveIds$LAYOUT.byteSize());
        }

        private static long[] StorageReserveIds$DIMS = { 1 };

        /**
         * Dimensions for array field:
         * {@snippet lang=c :
         * STORAGE_RESERVE_ID StorageReserveIds[1]
         * }
         */
        public static long[] StorageReserveIds$dimensions() {
            return StorageReserveIds$DIMS;
        }
        private static final VarHandle StorageReserveIds$ELEM_HANDLE = StorageReserveIds$LAYOUT.varHandle(sequenceElement());

        /**
         * Indexed getter for field:
         * {@snippet lang=c :
         * STORAGE_RESERVE_ID StorageReserveIds[1]
         * }
         */
        public static int StorageReserveIds(MemorySegment union, long index0) {
            return (int)StorageReserveIds$ELEM_HANDLE.get(union, 0L, index0);
        }

        /**
         * Indexed setter for field:
         * {@snippet lang=c :
         * STORAGE_RESERVE_ID StorageReserveIds[1]
         * }
         */
        public static void StorageReserveIds(MemorySegment union, long index0, int fieldValue) {
            StorageReserveIds$ELEM_HANDLE.set(union, 0L, index0, fieldValue);
        }

        /**
         * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
         * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
         */
        public static MemorySegment asSlice(MemorySegment array, long index) {
            return array.asSlice(layout().byteSize() * index);
        }

        /**
         * The size (in bytes) of this union
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

    private static final GroupLayout Filter$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Filter"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * union {
     *     CLUSTER_RANGE ClusterRanges[1];
     *     FILE_REFERENCE_RANGE FileReferenceRanges[1];
     *     STORAGE_RESERVE_ID StorageReserveIds[1];
     * } Filter
     * }
     */
    public static final GroupLayout Filter$layout() {
        return Filter$LAYOUT;
    }

    private static final long Filter$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * union {
     *     CLUSTER_RANGE ClusterRanges[1];
     *     FILE_REFERENCE_RANGE FileReferenceRanges[1];
     *     STORAGE_RESERVE_ID StorageReserveIds[1];
     * } Filter
     * }
     */
    public static final long Filter$offset() {
        return Filter$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * union {
     *     CLUSTER_RANGE ClusterRanges[1];
     *     FILE_REFERENCE_RANGE FileReferenceRanges[1];
     *     STORAGE_RESERVE_ID StorageReserveIds[1];
     * } Filter
     * }
     */
    public static MemorySegment Filter(MemorySegment struct) {
        return struct.asSlice(Filter$OFFSET, Filter$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * union {
     *     CLUSTER_RANGE ClusterRanges[1];
     *     FILE_REFERENCE_RANGE FileReferenceRanges[1];
     *     STORAGE_RESERVE_ID StorageReserveIds[1];
     * } Filter
     * }
     */
    public static void Filter(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Filter$OFFSET, Filter$LAYOUT.byteSize());
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

