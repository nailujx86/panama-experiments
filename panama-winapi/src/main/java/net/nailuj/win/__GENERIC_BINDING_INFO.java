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
 * struct __GENERIC_BINDING_INFO {
 *     void *pObj;
 *     unsigned int Size;
 *     GENERIC_BINDING_ROUTINE pfnBind;
 *     GENERIC_UNBIND_ROUTINE pfnUnbind;
 * }
 * }
 */
public class __GENERIC_BINDING_INFO {

    __GENERIC_BINDING_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_POINTER.withName("pObj"),
        winapi.C_INT.withName("Size"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("pfnBind"),
        winapi.C_POINTER.withName("pfnUnbind")
    ).withName("__GENERIC_BINDING_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout pObj$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pObj"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *pObj
     * }
     */
    public static final AddressLayout pObj$layout() {
        return pObj$LAYOUT;
    }

    private static final long pObj$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *pObj
     * }
     */
    public static final long pObj$offset() {
        return pObj$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *pObj
     * }
     */
    public static MemorySegment pObj(MemorySegment struct) {
        return struct.get(pObj$LAYOUT, pObj$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *pObj
     * }
     */
    public static void pObj(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pObj$LAYOUT, pObj$OFFSET, fieldValue);
    }

    private static final OfInt Size$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int Size
     * }
     */
    public static final OfInt Size$layout() {
        return Size$LAYOUT;
    }

    private static final long Size$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int Size
     * }
     */
    public static final long Size$offset() {
        return Size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int Size
     * }
     */
    public static int Size(MemorySegment struct) {
        return struct.get(Size$LAYOUT, Size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int Size
     * }
     */
    public static void Size(MemorySegment struct, int fieldValue) {
        struct.set(Size$LAYOUT, Size$OFFSET, fieldValue);
    }

    private static final AddressLayout pfnBind$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pfnBind"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GENERIC_BINDING_ROUTINE pfnBind
     * }
     */
    public static final AddressLayout pfnBind$layout() {
        return pfnBind$LAYOUT;
    }

    private static final long pfnBind$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GENERIC_BINDING_ROUTINE pfnBind
     * }
     */
    public static final long pfnBind$offset() {
        return pfnBind$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GENERIC_BINDING_ROUTINE pfnBind
     * }
     */
    public static MemorySegment pfnBind(MemorySegment struct) {
        return struct.get(pfnBind$LAYOUT, pfnBind$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GENERIC_BINDING_ROUTINE pfnBind
     * }
     */
    public static void pfnBind(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pfnBind$LAYOUT, pfnBind$OFFSET, fieldValue);
    }

    private static final AddressLayout pfnUnbind$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pfnUnbind"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GENERIC_UNBIND_ROUTINE pfnUnbind
     * }
     */
    public static final AddressLayout pfnUnbind$layout() {
        return pfnUnbind$LAYOUT;
    }

    private static final long pfnUnbind$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GENERIC_UNBIND_ROUTINE pfnUnbind
     * }
     */
    public static final long pfnUnbind$offset() {
        return pfnUnbind$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GENERIC_UNBIND_ROUTINE pfnUnbind
     * }
     */
    public static MemorySegment pfnUnbind(MemorySegment struct) {
        return struct.get(pfnUnbind$LAYOUT, pfnUnbind$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GENERIC_UNBIND_ROUTINE pfnUnbind
     * }
     */
    public static void pfnUnbind(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pfnUnbind$LAYOUT, pfnUnbind$OFFSET, fieldValue);
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

