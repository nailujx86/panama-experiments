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
 * struct pvalueA {
 *     LPSTR pv_valuename;
 *     int pv_valuelen;
 *     LPVOID pv_value_context;
 *     DWORD pv_type;
 * }
 * }
 */
public class pvalueA {

    pvalueA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_POINTER.withName("pv_valuename"),
        winapi.C_INT.withName("pv_valuelen"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("pv_value_context"),
        winapi.C_LONG.withName("pv_type"),
        MemoryLayout.paddingLayout(4)
    ).withName("pvalueA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout pv_valuename$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pv_valuename"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPSTR pv_valuename
     * }
     */
    public static final AddressLayout pv_valuename$layout() {
        return pv_valuename$LAYOUT;
    }

    private static final long pv_valuename$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPSTR pv_valuename
     * }
     */
    public static final long pv_valuename$offset() {
        return pv_valuename$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPSTR pv_valuename
     * }
     */
    public static MemorySegment pv_valuename(MemorySegment struct) {
        return struct.get(pv_valuename$LAYOUT, pv_valuename$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPSTR pv_valuename
     * }
     */
    public static void pv_valuename(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pv_valuename$LAYOUT, pv_valuename$OFFSET, fieldValue);
    }

    private static final OfInt pv_valuelen$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pv_valuelen"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int pv_valuelen
     * }
     */
    public static final OfInt pv_valuelen$layout() {
        return pv_valuelen$LAYOUT;
    }

    private static final long pv_valuelen$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int pv_valuelen
     * }
     */
    public static final long pv_valuelen$offset() {
        return pv_valuelen$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int pv_valuelen
     * }
     */
    public static int pv_valuelen(MemorySegment struct) {
        return struct.get(pv_valuelen$LAYOUT, pv_valuelen$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int pv_valuelen
     * }
     */
    public static void pv_valuelen(MemorySegment struct, int fieldValue) {
        struct.set(pv_valuelen$LAYOUT, pv_valuelen$OFFSET, fieldValue);
    }

    private static final AddressLayout pv_value_context$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pv_value_context"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPVOID pv_value_context
     * }
     */
    public static final AddressLayout pv_value_context$layout() {
        return pv_value_context$LAYOUT;
    }

    private static final long pv_value_context$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPVOID pv_value_context
     * }
     */
    public static final long pv_value_context$offset() {
        return pv_value_context$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPVOID pv_value_context
     * }
     */
    public static MemorySegment pv_value_context(MemorySegment struct) {
        return struct.get(pv_value_context$LAYOUT, pv_value_context$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPVOID pv_value_context
     * }
     */
    public static void pv_value_context(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pv_value_context$LAYOUT, pv_value_context$OFFSET, fieldValue);
    }

    private static final OfInt pv_type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pv_type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD pv_type
     * }
     */
    public static final OfInt pv_type$layout() {
        return pv_type$LAYOUT;
    }

    private static final long pv_type$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD pv_type
     * }
     */
    public static final long pv_type$offset() {
        return pv_type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD pv_type
     * }
     */
    public static int pv_type(MemorySegment struct) {
        return struct.get(pv_type$LAYOUT, pv_type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD pv_type
     * }
     */
    public static void pv_type(MemorySegment struct, int fieldValue) {
        struct.set(pv_type$LAYOUT, pv_type$OFFSET, fieldValue);
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

