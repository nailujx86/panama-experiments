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
 * struct _STORAGE_COUNTER {
 *     STORAGE_COUNTER_TYPE Type;
 *     union {
 *         struct {
 *             DWORD Week;
 *             DWORD Year;
 *         } ManufactureDate;
 *         DWORDLONG AsUlonglong;
 *     } Value;
 * }
 * }
 */
public class _STORAGE_COUNTER {

    _STORAGE_COUNTER() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_INT.withName("Type"),
        MemoryLayout.paddingLayout(4),
        _STORAGE_COUNTER.Value.layout().withName("Value")
    ).withName("_STORAGE_COUNTER");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * STORAGE_COUNTER_TYPE Type
     * }
     */
    public static final OfInt Type$layout() {
        return Type$LAYOUT;
    }

    private static final long Type$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * STORAGE_COUNTER_TYPE Type
     * }
     */
    public static final long Type$offset() {
        return Type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * STORAGE_COUNTER_TYPE Type
     * }
     */
    public static int Type(MemorySegment struct) {
        return struct.get(Type$LAYOUT, Type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * STORAGE_COUNTER_TYPE Type
     * }
     */
    public static void Type(MemorySegment struct, int fieldValue) {
        struct.set(Type$LAYOUT, Type$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * union {
     *     struct {
     *         DWORD Week;
     *         DWORD Year;
     *     } ManufactureDate;
     *     DWORDLONG AsUlonglong;
     * }
     * }
     */
    public static class Value {

        Value() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
            _STORAGE_COUNTER.Value.ManufactureDate.layout().withName("ManufactureDate"),
            winapi.C_LONG_LONG.withName("AsUlonglong")
        ).withName("$anon$6920:5");

        /**
         * The layout of this union
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        /**
         * {@snippet lang=c :
         * struct {
         *     DWORD Week;
         *     DWORD Year;
         * }
         * }
         */
        public static class ManufactureDate {

            ManufactureDate() {
                // Should not be called directly
            }

            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
                winapi.C_LONG.withName("Week"),
                winapi.C_LONG.withName("Year")
            ).withName("$anon$6922:9");

            /**
             * The layout of this struct
             */
            public static final GroupLayout layout() {
                return $LAYOUT;
            }

            private static final OfInt Week$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Week"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * DWORD Week
             * }
             */
            public static final OfInt Week$layout() {
                return Week$LAYOUT;
            }

            private static final long Week$OFFSET = 0;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * DWORD Week
             * }
             */
            public static final long Week$offset() {
                return Week$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * DWORD Week
             * }
             */
            public static int Week(MemorySegment struct) {
                return struct.get(Week$LAYOUT, Week$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * DWORD Week
             * }
             */
            public static void Week(MemorySegment struct, int fieldValue) {
                struct.set(Week$LAYOUT, Week$OFFSET, fieldValue);
            }

            private static final OfInt Year$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Year"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * DWORD Year
             * }
             */
            public static final OfInt Year$layout() {
                return Year$LAYOUT;
            }

            private static final long Year$OFFSET = 4;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * DWORD Year
             * }
             */
            public static final long Year$offset() {
                return Year$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * DWORD Year
             * }
             */
            public static int Year(MemorySegment struct) {
                return struct.get(Year$LAYOUT, Year$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * DWORD Year
             * }
             */
            public static void Year(MemorySegment struct, int fieldValue) {
                struct.set(Year$LAYOUT, Year$OFFSET, fieldValue);
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

        private static final GroupLayout ManufactureDate$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ManufactureDate"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * struct {
         *     DWORD Week;
         *     DWORD Year;
         * } ManufactureDate
         * }
         */
        public static final GroupLayout ManufactureDate$layout() {
            return ManufactureDate$LAYOUT;
        }

        private static final long ManufactureDate$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * struct {
         *     DWORD Week;
         *     DWORD Year;
         * } ManufactureDate
         * }
         */
        public static final long ManufactureDate$offset() {
            return ManufactureDate$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * struct {
         *     DWORD Week;
         *     DWORD Year;
         * } ManufactureDate
         * }
         */
        public static MemorySegment ManufactureDate(MemorySegment union) {
            return union.asSlice(ManufactureDate$OFFSET, ManufactureDate$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * struct {
         *     DWORD Week;
         *     DWORD Year;
         * } ManufactureDate
         * }
         */
        public static void ManufactureDate(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, ManufactureDate$OFFSET, ManufactureDate$LAYOUT.byteSize());
        }

        private static final OfLong AsUlonglong$LAYOUT = (OfLong)$LAYOUT.select(groupElement("AsUlonglong"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * DWORDLONG AsUlonglong
         * }
         */
        public static final OfLong AsUlonglong$layout() {
            return AsUlonglong$LAYOUT;
        }

        private static final long AsUlonglong$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * DWORDLONG AsUlonglong
         * }
         */
        public static final long AsUlonglong$offset() {
            return AsUlonglong$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * DWORDLONG AsUlonglong
         * }
         */
        public static long AsUlonglong(MemorySegment union) {
            return union.get(AsUlonglong$LAYOUT, AsUlonglong$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * DWORDLONG AsUlonglong
         * }
         */
        public static void AsUlonglong(MemorySegment union, long fieldValue) {
            union.set(AsUlonglong$LAYOUT, AsUlonglong$OFFSET, fieldValue);
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

    private static final GroupLayout Value$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Value"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * union {
     *     struct {
     *         DWORD Week;
     *         DWORD Year;
     *     } ManufactureDate;
     *     DWORDLONG AsUlonglong;
     * } Value
     * }
     */
    public static final GroupLayout Value$layout() {
        return Value$LAYOUT;
    }

    private static final long Value$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * union {
     *     struct {
     *         DWORD Week;
     *         DWORD Year;
     *     } ManufactureDate;
     *     DWORDLONG AsUlonglong;
     * } Value
     * }
     */
    public static final long Value$offset() {
        return Value$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * union {
     *     struct {
     *         DWORD Week;
     *         DWORD Year;
     *     } ManufactureDate;
     *     DWORDLONG AsUlonglong;
     * } Value
     * }
     */
    public static MemorySegment Value(MemorySegment struct) {
        return struct.asSlice(Value$OFFSET, Value$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * union {
     *     struct {
     *         DWORD Week;
     *         DWORD Year;
     *     } ManufactureDate;
     *     DWORDLONG AsUlonglong;
     * } Value
     * }
     */
    public static void Value(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Value$OFFSET, Value$LAYOUT.byteSize());
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

