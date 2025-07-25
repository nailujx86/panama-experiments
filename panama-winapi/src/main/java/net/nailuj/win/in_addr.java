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
 * struct in_addr {
 *     union {
 *         struct {
 *             UCHAR s_b1;
 *             UCHAR s_b2;
 *             UCHAR s_b3;
 *             UCHAR s_b4;
 *         } S_un_b;
 *         struct {
 *             USHORT s_w1;
 *             USHORT s_w2;
 *         } S_un_w;
 *         ULONG S_addr;
 *     } S_un;
 * }
 * }
 */
public class in_addr {

    in_addr() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        in_addr.S_un.layout().withName("S_un")
    ).withName("in_addr");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    /**
     * {@snippet lang=c :
     * union {
     *     struct {
     *         UCHAR s_b1;
     *         UCHAR s_b2;
     *         UCHAR s_b3;
     *         UCHAR s_b4;
     *     } S_un_b;
     *     struct {
     *         USHORT s_w1;
     *         USHORT s_w2;
     *     } S_un_w;
     *     ULONG S_addr;
     * }
     * }
     */
    public static class S_un {

        S_un() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
            in_addr.S_un.S_un_b.layout().withName("S_un_b"),
            in_addr.S_un.S_un_w.layout().withName("S_un_w"),
            winapi.C_LONG.withName("S_addr")
        ).withName("$anon$26:9");

        /**
         * The layout of this union
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        /**
         * {@snippet lang=c :
         * struct {
         *     UCHAR s_b1;
         *     UCHAR s_b2;
         *     UCHAR s_b3;
         *     UCHAR s_b4;
         * }
         * }
         */
        public static class S_un_b {

            S_un_b() {
                // Should not be called directly
            }

            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
                winapi.C_CHAR.withName("s_b1"),
                winapi.C_CHAR.withName("s_b2"),
                winapi.C_CHAR.withName("s_b3"),
                winapi.C_CHAR.withName("s_b4")
            ).withName("$anon$27:17");

            /**
             * The layout of this struct
             */
            public static final GroupLayout layout() {
                return $LAYOUT;
            }

            private static final OfByte s_b1$LAYOUT = (OfByte)$LAYOUT.select(groupElement("s_b1"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * UCHAR s_b1
             * }
             */
            public static final OfByte s_b1$layout() {
                return s_b1$LAYOUT;
            }

            private static final long s_b1$OFFSET = 0;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * UCHAR s_b1
             * }
             */
            public static final long s_b1$offset() {
                return s_b1$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * UCHAR s_b1
             * }
             */
            public static byte s_b1(MemorySegment struct) {
                return struct.get(s_b1$LAYOUT, s_b1$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * UCHAR s_b1
             * }
             */
            public static void s_b1(MemorySegment struct, byte fieldValue) {
                struct.set(s_b1$LAYOUT, s_b1$OFFSET, fieldValue);
            }

            private static final OfByte s_b2$LAYOUT = (OfByte)$LAYOUT.select(groupElement("s_b2"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * UCHAR s_b2
             * }
             */
            public static final OfByte s_b2$layout() {
                return s_b2$LAYOUT;
            }

            private static final long s_b2$OFFSET = 1;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * UCHAR s_b2
             * }
             */
            public static final long s_b2$offset() {
                return s_b2$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * UCHAR s_b2
             * }
             */
            public static byte s_b2(MemorySegment struct) {
                return struct.get(s_b2$LAYOUT, s_b2$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * UCHAR s_b2
             * }
             */
            public static void s_b2(MemorySegment struct, byte fieldValue) {
                struct.set(s_b2$LAYOUT, s_b2$OFFSET, fieldValue);
            }

            private static final OfByte s_b3$LAYOUT = (OfByte)$LAYOUT.select(groupElement("s_b3"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * UCHAR s_b3
             * }
             */
            public static final OfByte s_b3$layout() {
                return s_b3$LAYOUT;
            }

            private static final long s_b3$OFFSET = 2;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * UCHAR s_b3
             * }
             */
            public static final long s_b3$offset() {
                return s_b3$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * UCHAR s_b3
             * }
             */
            public static byte s_b3(MemorySegment struct) {
                return struct.get(s_b3$LAYOUT, s_b3$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * UCHAR s_b3
             * }
             */
            public static void s_b3(MemorySegment struct, byte fieldValue) {
                struct.set(s_b3$LAYOUT, s_b3$OFFSET, fieldValue);
            }

            private static final OfByte s_b4$LAYOUT = (OfByte)$LAYOUT.select(groupElement("s_b4"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * UCHAR s_b4
             * }
             */
            public static final OfByte s_b4$layout() {
                return s_b4$LAYOUT;
            }

            private static final long s_b4$OFFSET = 3;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * UCHAR s_b4
             * }
             */
            public static final long s_b4$offset() {
                return s_b4$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * UCHAR s_b4
             * }
             */
            public static byte s_b4(MemorySegment struct) {
                return struct.get(s_b4$LAYOUT, s_b4$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * UCHAR s_b4
             * }
             */
            public static void s_b4(MemorySegment struct, byte fieldValue) {
                struct.set(s_b4$LAYOUT, s_b4$OFFSET, fieldValue);
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

        private static final GroupLayout S_un_b$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("S_un_b"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * struct {
         *     UCHAR s_b1;
         *     UCHAR s_b2;
         *     UCHAR s_b3;
         *     UCHAR s_b4;
         * } S_un_b
         * }
         */
        public static final GroupLayout S_un_b$layout() {
            return S_un_b$LAYOUT;
        }

        private static final long S_un_b$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * struct {
         *     UCHAR s_b1;
         *     UCHAR s_b2;
         *     UCHAR s_b3;
         *     UCHAR s_b4;
         * } S_un_b
         * }
         */
        public static final long S_un_b$offset() {
            return S_un_b$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * struct {
         *     UCHAR s_b1;
         *     UCHAR s_b2;
         *     UCHAR s_b3;
         *     UCHAR s_b4;
         * } S_un_b
         * }
         */
        public static MemorySegment S_un_b(MemorySegment union) {
            return union.asSlice(S_un_b$OFFSET, S_un_b$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * struct {
         *     UCHAR s_b1;
         *     UCHAR s_b2;
         *     UCHAR s_b3;
         *     UCHAR s_b4;
         * } S_un_b
         * }
         */
        public static void S_un_b(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, S_un_b$OFFSET, S_un_b$LAYOUT.byteSize());
        }

        /**
         * {@snippet lang=c :
         * struct {
         *     USHORT s_w1;
         *     USHORT s_w2;
         * }
         * }
         */
        public static class S_un_w {

            S_un_w() {
                // Should not be called directly
            }

            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
                winapi.C_SHORT.withName("s_w1"),
                winapi.C_SHORT.withName("s_w2")
            ).withName("$anon$28:17");

            /**
             * The layout of this struct
             */
            public static final GroupLayout layout() {
                return $LAYOUT;
            }

            private static final OfShort s_w1$LAYOUT = (OfShort)$LAYOUT.select(groupElement("s_w1"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * USHORT s_w1
             * }
             */
            public static final OfShort s_w1$layout() {
                return s_w1$LAYOUT;
            }

            private static final long s_w1$OFFSET = 0;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * USHORT s_w1
             * }
             */
            public static final long s_w1$offset() {
                return s_w1$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * USHORT s_w1
             * }
             */
            public static short s_w1(MemorySegment struct) {
                return struct.get(s_w1$LAYOUT, s_w1$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * USHORT s_w1
             * }
             */
            public static void s_w1(MemorySegment struct, short fieldValue) {
                struct.set(s_w1$LAYOUT, s_w1$OFFSET, fieldValue);
            }

            private static final OfShort s_w2$LAYOUT = (OfShort)$LAYOUT.select(groupElement("s_w2"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * USHORT s_w2
             * }
             */
            public static final OfShort s_w2$layout() {
                return s_w2$LAYOUT;
            }

            private static final long s_w2$OFFSET = 2;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * USHORT s_w2
             * }
             */
            public static final long s_w2$offset() {
                return s_w2$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * USHORT s_w2
             * }
             */
            public static short s_w2(MemorySegment struct) {
                return struct.get(s_w2$LAYOUT, s_w2$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * USHORT s_w2
             * }
             */
            public static void s_w2(MemorySegment struct, short fieldValue) {
                struct.set(s_w2$LAYOUT, s_w2$OFFSET, fieldValue);
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

        private static final GroupLayout S_un_w$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("S_un_w"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * struct {
         *     USHORT s_w1;
         *     USHORT s_w2;
         * } S_un_w
         * }
         */
        public static final GroupLayout S_un_w$layout() {
            return S_un_w$LAYOUT;
        }

        private static final long S_un_w$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * struct {
         *     USHORT s_w1;
         *     USHORT s_w2;
         * } S_un_w
         * }
         */
        public static final long S_un_w$offset() {
            return S_un_w$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * struct {
         *     USHORT s_w1;
         *     USHORT s_w2;
         * } S_un_w
         * }
         */
        public static MemorySegment S_un_w(MemorySegment union) {
            return union.asSlice(S_un_w$OFFSET, S_un_w$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * struct {
         *     USHORT s_w1;
         *     USHORT s_w2;
         * } S_un_w
         * }
         */
        public static void S_un_w(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, S_un_w$OFFSET, S_un_w$LAYOUT.byteSize());
        }

        private static final OfInt S_addr$LAYOUT = (OfInt)$LAYOUT.select(groupElement("S_addr"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * ULONG S_addr
         * }
         */
        public static final OfInt S_addr$layout() {
            return S_addr$LAYOUT;
        }

        private static final long S_addr$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * ULONG S_addr
         * }
         */
        public static final long S_addr$offset() {
            return S_addr$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * ULONG S_addr
         * }
         */
        public static int S_addr(MemorySegment union) {
            return union.get(S_addr$LAYOUT, S_addr$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * ULONG S_addr
         * }
         */
        public static void S_addr(MemorySegment union, int fieldValue) {
            union.set(S_addr$LAYOUT, S_addr$OFFSET, fieldValue);
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

    private static final GroupLayout S_un$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("S_un"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * union {
     *     struct {
     *         UCHAR s_b1;
     *         UCHAR s_b2;
     *         UCHAR s_b3;
     *         UCHAR s_b4;
     *     } S_un_b;
     *     struct {
     *         USHORT s_w1;
     *         USHORT s_w2;
     *     } S_un_w;
     *     ULONG S_addr;
     * } S_un
     * }
     */
    public static final GroupLayout S_un$layout() {
        return S_un$LAYOUT;
    }

    private static final long S_un$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * union {
     *     struct {
     *         UCHAR s_b1;
     *         UCHAR s_b2;
     *         UCHAR s_b3;
     *         UCHAR s_b4;
     *     } S_un_b;
     *     struct {
     *         USHORT s_w1;
     *         USHORT s_w2;
     *     } S_un_w;
     *     ULONG S_addr;
     * } S_un
     * }
     */
    public static final long S_un$offset() {
        return S_un$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * union {
     *     struct {
     *         UCHAR s_b1;
     *         UCHAR s_b2;
     *         UCHAR s_b3;
     *         UCHAR s_b4;
     *     } S_un_b;
     *     struct {
     *         USHORT s_w1;
     *         USHORT s_w2;
     *     } S_un_w;
     *     ULONG S_addr;
     * } S_un
     * }
     */
    public static MemorySegment S_un(MemorySegment struct) {
        return struct.asSlice(S_un$OFFSET, S_un$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * union {
     *     struct {
     *         UCHAR s_b1;
     *         UCHAR s_b2;
     *         UCHAR s_b3;
     *         UCHAR s_b4;
     *     } S_un_b;
     *     struct {
     *         USHORT s_w1;
     *         USHORT s_w2;
     *     } S_un_w;
     *     ULONG S_addr;
     * } S_un
     * }
     */
    public static void S_un(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, S_un$OFFSET, S_un$LAYOUT.byteSize());
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

