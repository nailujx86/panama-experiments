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
 * struct _DOC_INFO_1A {
 *     LPSTR pDocName;
 *     LPSTR pOutputFile;
 *     LPSTR pDatatype;
 * }
 * }
 */
public class _DOC_INFO_1A {

    _DOC_INFO_1A() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_POINTER.withName("pDocName"),
        winapi.C_POINTER.withName("pOutputFile"),
        winapi.C_POINTER.withName("pDatatype")
    ).withName("_DOC_INFO_1A");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout pDocName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pDocName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPSTR pDocName
     * }
     */
    public static final AddressLayout pDocName$layout() {
        return pDocName$LAYOUT;
    }

    private static final long pDocName$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPSTR pDocName
     * }
     */
    public static final long pDocName$offset() {
        return pDocName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPSTR pDocName
     * }
     */
    public static MemorySegment pDocName(MemorySegment struct) {
        return struct.get(pDocName$LAYOUT, pDocName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPSTR pDocName
     * }
     */
    public static void pDocName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pDocName$LAYOUT, pDocName$OFFSET, fieldValue);
    }

    private static final AddressLayout pOutputFile$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pOutputFile"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPSTR pOutputFile
     * }
     */
    public static final AddressLayout pOutputFile$layout() {
        return pOutputFile$LAYOUT;
    }

    private static final long pOutputFile$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPSTR pOutputFile
     * }
     */
    public static final long pOutputFile$offset() {
        return pOutputFile$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPSTR pOutputFile
     * }
     */
    public static MemorySegment pOutputFile(MemorySegment struct) {
        return struct.get(pOutputFile$LAYOUT, pOutputFile$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPSTR pOutputFile
     * }
     */
    public static void pOutputFile(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pOutputFile$LAYOUT, pOutputFile$OFFSET, fieldValue);
    }

    private static final AddressLayout pDatatype$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pDatatype"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPSTR pDatatype
     * }
     */
    public static final AddressLayout pDatatype$layout() {
        return pDatatype$LAYOUT;
    }

    private static final long pDatatype$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPSTR pDatatype
     * }
     */
    public static final long pDatatype$offset() {
        return pDatatype$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPSTR pDatatype
     * }
     */
    public static MemorySegment pDatatype(MemorySegment struct) {
        return struct.get(pDatatype$LAYOUT, pDatatype$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPSTR pDatatype
     * }
     */
    public static void pDatatype(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pDatatype$LAYOUT, pDatatype$OFFSET, fieldValue);
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

