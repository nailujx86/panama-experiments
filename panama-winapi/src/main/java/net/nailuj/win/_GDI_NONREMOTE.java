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
 * struct _GDI_NONREMOTE {
 *     LONG fContext;
 *     union __MIDL_IWinTypes_0002 {
 *         LONG hInproc;
 *         DWORD_BLOB *hRemote;
 *     } u;
 * }
 * }
 */
public class _GDI_NONREMOTE {

    _GDI_NONREMOTE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("fContext"),
        MemoryLayout.paddingLayout(4),
        _GDI_NONREMOTE.__MIDL_IWinTypes_0002.layout().withName("u")
    ).withName("_GDI_NONREMOTE");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt fContext$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fContext"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG fContext
     * }
     */
    public static final OfInt fContext$layout() {
        return fContext$LAYOUT;
    }

    private static final long fContext$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG fContext
     * }
     */
    public static final long fContext$offset() {
        return fContext$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG fContext
     * }
     */
    public static int fContext(MemorySegment struct) {
        return struct.get(fContext$LAYOUT, fContext$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG fContext
     * }
     */
    public static void fContext(MemorySegment struct, int fieldValue) {
        struct.set(fContext$LAYOUT, fContext$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * union __MIDL_IWinTypes_0002 {
     *     LONG hInproc;
     *     DWORD_BLOB *hRemote;
     * }
     * }
     */
    public static class __MIDL_IWinTypes_0002 {

        __MIDL_IWinTypes_0002() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
            winapi.C_LONG.withName("hInproc"),
            winapi.C_POINTER.withName("hRemote")
        ).withName("__MIDL_IWinTypes_0002");

        /**
         * The layout of this union
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final OfInt hInproc$LAYOUT = (OfInt)$LAYOUT.select(groupElement("hInproc"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * LONG hInproc
         * }
         */
        public static final OfInt hInproc$layout() {
            return hInproc$LAYOUT;
        }

        private static final long hInproc$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * LONG hInproc
         * }
         */
        public static final long hInproc$offset() {
            return hInproc$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * LONG hInproc
         * }
         */
        public static int hInproc(MemorySegment union) {
            return union.get(hInproc$LAYOUT, hInproc$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * LONG hInproc
         * }
         */
        public static void hInproc(MemorySegment union, int fieldValue) {
            union.set(hInproc$LAYOUT, hInproc$OFFSET, fieldValue);
        }

        private static final AddressLayout hRemote$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hRemote"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * DWORD_BLOB *hRemote
         * }
         */
        public static final AddressLayout hRemote$layout() {
            return hRemote$LAYOUT;
        }

        private static final long hRemote$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * DWORD_BLOB *hRemote
         * }
         */
        public static final long hRemote$offset() {
            return hRemote$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * DWORD_BLOB *hRemote
         * }
         */
        public static MemorySegment hRemote(MemorySegment union) {
            return union.get(hRemote$LAYOUT, hRemote$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * DWORD_BLOB *hRemote
         * }
         */
        public static void hRemote(MemorySegment union, MemorySegment fieldValue) {
            union.set(hRemote$LAYOUT, hRemote$OFFSET, fieldValue);
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
     * union __MIDL_IWinTypes_0002 u
     * }
     */
    public static final GroupLayout u$layout() {
        return u$LAYOUT;
    }

    private static final long u$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * union __MIDL_IWinTypes_0002 u
     * }
     */
    public static final long u$offset() {
        return u$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * union __MIDL_IWinTypes_0002 u
     * }
     */
    public static MemorySegment u(MemorySegment struct) {
        return struct.asSlice(u$OFFSET, u$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * union __MIDL_IWinTypes_0002 u
     * }
     */
    public static void u(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, u$OFFSET, u$LAYOUT.byteSize());
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

