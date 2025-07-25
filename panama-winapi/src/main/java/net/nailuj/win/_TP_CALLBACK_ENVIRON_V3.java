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
 * struct _TP_CALLBACK_ENVIRON_V3 {
 *     TP_VERSION Version;
 *     PTP_POOL Pool;
 *     PTP_CLEANUP_GROUP CleanupGroup;
 *     PTP_CLEANUP_GROUP_CANCEL_CALLBACK CleanupGroupCancelCallback;
 *     PVOID RaceDll;
 *     struct _ACTIVATION_CONTEXT *ActivationContext;
 *     PTP_SIMPLE_CALLBACK FinalizationCallback;
 *     union {
 *         DWORD Flags;
 *         struct {
 *             DWORD LongFunction : 1;
 *             DWORD Persistent : 1;
 *             DWORD Private : 30;
 *         } s;
 *     } u;
 *     TP_CALLBACK_PRIORITY CallbackPriority;
 *     DWORD Size;
 * }
 * }
 */
public class _TP_CALLBACK_ENVIRON_V3 {

    _TP_CALLBACK_ENVIRON_V3() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("Version"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("Pool"),
        winapi.C_POINTER.withName("CleanupGroup"),
        winapi.C_POINTER.withName("CleanupGroupCancelCallback"),
        winapi.C_POINTER.withName("RaceDll"),
        winapi.C_POINTER.withName("ActivationContext"),
        winapi.C_POINTER.withName("FinalizationCallback"),
        _TP_CALLBACK_ENVIRON_V3.u.layout().withName("u"),
        winapi.C_INT.withName("CallbackPriority"),
        winapi.C_LONG.withName("Size"),
        MemoryLayout.paddingLayout(4)
    ).withName("_TP_CALLBACK_ENVIRON_V3");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Version$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Version"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * TP_VERSION Version
     * }
     */
    public static final OfInt Version$layout() {
        return Version$LAYOUT;
    }

    private static final long Version$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * TP_VERSION Version
     * }
     */
    public static final long Version$offset() {
        return Version$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * TP_VERSION Version
     * }
     */
    public static int Version(MemorySegment struct) {
        return struct.get(Version$LAYOUT, Version$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * TP_VERSION Version
     * }
     */
    public static void Version(MemorySegment struct, int fieldValue) {
        struct.set(Version$LAYOUT, Version$OFFSET, fieldValue);
    }

    private static final AddressLayout Pool$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("Pool"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PTP_POOL Pool
     * }
     */
    public static final AddressLayout Pool$layout() {
        return Pool$LAYOUT;
    }

    private static final long Pool$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PTP_POOL Pool
     * }
     */
    public static final long Pool$offset() {
        return Pool$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PTP_POOL Pool
     * }
     */
    public static MemorySegment Pool(MemorySegment struct) {
        return struct.get(Pool$LAYOUT, Pool$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PTP_POOL Pool
     * }
     */
    public static void Pool(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Pool$LAYOUT, Pool$OFFSET, fieldValue);
    }

    private static final AddressLayout CleanupGroup$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("CleanupGroup"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PTP_CLEANUP_GROUP CleanupGroup
     * }
     */
    public static final AddressLayout CleanupGroup$layout() {
        return CleanupGroup$LAYOUT;
    }

    private static final long CleanupGroup$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PTP_CLEANUP_GROUP CleanupGroup
     * }
     */
    public static final long CleanupGroup$offset() {
        return CleanupGroup$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PTP_CLEANUP_GROUP CleanupGroup
     * }
     */
    public static MemorySegment CleanupGroup(MemorySegment struct) {
        return struct.get(CleanupGroup$LAYOUT, CleanupGroup$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PTP_CLEANUP_GROUP CleanupGroup
     * }
     */
    public static void CleanupGroup(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(CleanupGroup$LAYOUT, CleanupGroup$OFFSET, fieldValue);
    }

    private static final AddressLayout CleanupGroupCancelCallback$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("CleanupGroupCancelCallback"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PTP_CLEANUP_GROUP_CANCEL_CALLBACK CleanupGroupCancelCallback
     * }
     */
    public static final AddressLayout CleanupGroupCancelCallback$layout() {
        return CleanupGroupCancelCallback$LAYOUT;
    }

    private static final long CleanupGroupCancelCallback$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PTP_CLEANUP_GROUP_CANCEL_CALLBACK CleanupGroupCancelCallback
     * }
     */
    public static final long CleanupGroupCancelCallback$offset() {
        return CleanupGroupCancelCallback$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PTP_CLEANUP_GROUP_CANCEL_CALLBACK CleanupGroupCancelCallback
     * }
     */
    public static MemorySegment CleanupGroupCancelCallback(MemorySegment struct) {
        return struct.get(CleanupGroupCancelCallback$LAYOUT, CleanupGroupCancelCallback$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PTP_CLEANUP_GROUP_CANCEL_CALLBACK CleanupGroupCancelCallback
     * }
     */
    public static void CleanupGroupCancelCallback(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(CleanupGroupCancelCallback$LAYOUT, CleanupGroupCancelCallback$OFFSET, fieldValue);
    }

    private static final AddressLayout RaceDll$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("RaceDll"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PVOID RaceDll
     * }
     */
    public static final AddressLayout RaceDll$layout() {
        return RaceDll$LAYOUT;
    }

    private static final long RaceDll$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PVOID RaceDll
     * }
     */
    public static final long RaceDll$offset() {
        return RaceDll$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PVOID RaceDll
     * }
     */
    public static MemorySegment RaceDll(MemorySegment struct) {
        return struct.get(RaceDll$LAYOUT, RaceDll$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PVOID RaceDll
     * }
     */
    public static void RaceDll(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(RaceDll$LAYOUT, RaceDll$OFFSET, fieldValue);
    }

    private static final AddressLayout ActivationContext$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("ActivationContext"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct _ACTIVATION_CONTEXT *ActivationContext
     * }
     */
    public static final AddressLayout ActivationContext$layout() {
        return ActivationContext$LAYOUT;
    }

    private static final long ActivationContext$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct _ACTIVATION_CONTEXT *ActivationContext
     * }
     */
    public static final long ActivationContext$offset() {
        return ActivationContext$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct _ACTIVATION_CONTEXT *ActivationContext
     * }
     */
    public static MemorySegment ActivationContext(MemorySegment struct) {
        return struct.get(ActivationContext$LAYOUT, ActivationContext$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct _ACTIVATION_CONTEXT *ActivationContext
     * }
     */
    public static void ActivationContext(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ActivationContext$LAYOUT, ActivationContext$OFFSET, fieldValue);
    }

    private static final AddressLayout FinalizationCallback$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("FinalizationCallback"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PTP_SIMPLE_CALLBACK FinalizationCallback
     * }
     */
    public static final AddressLayout FinalizationCallback$layout() {
        return FinalizationCallback$LAYOUT;
    }

    private static final long FinalizationCallback$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PTP_SIMPLE_CALLBACK FinalizationCallback
     * }
     */
    public static final long FinalizationCallback$offset() {
        return FinalizationCallback$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PTP_SIMPLE_CALLBACK FinalizationCallback
     * }
     */
    public static MemorySegment FinalizationCallback(MemorySegment struct) {
        return struct.get(FinalizationCallback$LAYOUT, FinalizationCallback$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PTP_SIMPLE_CALLBACK FinalizationCallback
     * }
     */
    public static void FinalizationCallback(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(FinalizationCallback$LAYOUT, FinalizationCallback$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * union {
     *     DWORD Flags;
     *     struct {
     *         DWORD LongFunction : 1;
     *         DWORD Persistent : 1;
     *         DWORD Private : 30;
     *     } s;
     * }
     * }
     */
    public static class u {

        u() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
            winapi.C_LONG.withName("Flags"),
            _TP_CALLBACK_ENVIRON_V3.u.s.layout().withName("s")
        ).withName("$anon$25516:5");

        /**
         * The layout of this union
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
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

        private static final long Flags$OFFSET = 0;

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
        public static int Flags(MemorySegment union) {
            return union.get(Flags$LAYOUT, Flags$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * DWORD Flags
         * }
         */
        public static void Flags(MemorySegment union, int fieldValue) {
            union.set(Flags$LAYOUT, Flags$OFFSET, fieldValue);
        }

        /**
         * {@snippet lang=c :
         * struct {
         *     DWORD LongFunction : 1;
         *     DWORD Persistent : 1;
         *     DWORD Private : 30;
         * }
         * }
         */
        public static class s {

            s() {
                // Should not be called directly
            }

            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(4)
            ).withName("$anon$25518:9");

            /**
             * The layout of this struct
             */
            public static final GroupLayout layout() {
                return $LAYOUT;
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

        private static final GroupLayout s$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("s"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * struct {
         *     DWORD LongFunction : 1;
         *     DWORD Persistent : 1;
         *     DWORD Private : 30;
         * } s
         * }
         */
        public static final GroupLayout s$layout() {
            return s$LAYOUT;
        }

        private static final long s$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * struct {
         *     DWORD LongFunction : 1;
         *     DWORD Persistent : 1;
         *     DWORD Private : 30;
         * } s
         * }
         */
        public static final long s$offset() {
            return s$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * struct {
         *     DWORD LongFunction : 1;
         *     DWORD Persistent : 1;
         *     DWORD Private : 30;
         * } s
         * }
         */
        public static MemorySegment s(MemorySegment union) {
            return union.asSlice(s$OFFSET, s$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * struct {
         *     DWORD LongFunction : 1;
         *     DWORD Persistent : 1;
         *     DWORD Private : 30;
         * } s
         * }
         */
        public static void s(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, s$OFFSET, s$LAYOUT.byteSize());
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

    private static final GroupLayout u$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("u"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * union {
     *     DWORD Flags;
     *     struct {
     *         DWORD LongFunction : 1;
     *         DWORD Persistent : 1;
     *         DWORD Private : 30;
     *     } s;
     * } u
     * }
     */
    public static final GroupLayout u$layout() {
        return u$LAYOUT;
    }

    private static final long u$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * union {
     *     DWORD Flags;
     *     struct {
     *         DWORD LongFunction : 1;
     *         DWORD Persistent : 1;
     *         DWORD Private : 30;
     *     } s;
     * } u
     * }
     */
    public static final long u$offset() {
        return u$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * union {
     *     DWORD Flags;
     *     struct {
     *         DWORD LongFunction : 1;
     *         DWORD Persistent : 1;
     *         DWORD Private : 30;
     *     } s;
     * } u
     * }
     */
    public static MemorySegment u(MemorySegment struct) {
        return struct.asSlice(u$OFFSET, u$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * union {
     *     DWORD Flags;
     *     struct {
     *         DWORD LongFunction : 1;
     *         DWORD Persistent : 1;
     *         DWORD Private : 30;
     *     } s;
     * } u
     * }
     */
    public static void u(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, u$OFFSET, u$LAYOUT.byteSize());
    }

    private static final OfInt CallbackPriority$LAYOUT = (OfInt)$LAYOUT.select(groupElement("CallbackPriority"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * TP_CALLBACK_PRIORITY CallbackPriority
     * }
     */
    public static final OfInt CallbackPriority$layout() {
        return CallbackPriority$LAYOUT;
    }

    private static final long CallbackPriority$OFFSET = 60;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * TP_CALLBACK_PRIORITY CallbackPriority
     * }
     */
    public static final long CallbackPriority$offset() {
        return CallbackPriority$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * TP_CALLBACK_PRIORITY CallbackPriority
     * }
     */
    public static int CallbackPriority(MemorySegment struct) {
        return struct.get(CallbackPriority$LAYOUT, CallbackPriority$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * TP_CALLBACK_PRIORITY CallbackPriority
     * }
     */
    public static void CallbackPriority(MemorySegment struct, int fieldValue) {
        struct.set(CallbackPriority$LAYOUT, CallbackPriority$OFFSET, fieldValue);
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

    private static final long Size$OFFSET = 64;

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

