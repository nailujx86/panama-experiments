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
 * struct _ASSEMBLY_FILE_DETAILED_INFORMATION {
 *     DWORD ulFlags;
 *     DWORD ulFilenameLength;
 *     DWORD ulPathLength;
 *     PCWSTR lpFileName;
 *     PCWSTR lpFilePath;
 * }
 * }
 */
public class _ASSEMBLY_FILE_DETAILED_INFORMATION {

    _ASSEMBLY_FILE_DETAILED_INFORMATION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("ulFlags"),
        winapi.C_LONG.withName("ulFilenameLength"),
        winapi.C_LONG.withName("ulPathLength"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("lpFileName"),
        winapi.C_POINTER.withName("lpFilePath")
    ).withName("_ASSEMBLY_FILE_DETAILED_INFORMATION");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt ulFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ulFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ulFlags
     * }
     */
    public static final OfInt ulFlags$layout() {
        return ulFlags$LAYOUT;
    }

    private static final long ulFlags$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ulFlags
     * }
     */
    public static final long ulFlags$offset() {
        return ulFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ulFlags
     * }
     */
    public static int ulFlags(MemorySegment struct) {
        return struct.get(ulFlags$LAYOUT, ulFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ulFlags
     * }
     */
    public static void ulFlags(MemorySegment struct, int fieldValue) {
        struct.set(ulFlags$LAYOUT, ulFlags$OFFSET, fieldValue);
    }

    private static final OfInt ulFilenameLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ulFilenameLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ulFilenameLength
     * }
     */
    public static final OfInt ulFilenameLength$layout() {
        return ulFilenameLength$LAYOUT;
    }

    private static final long ulFilenameLength$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ulFilenameLength
     * }
     */
    public static final long ulFilenameLength$offset() {
        return ulFilenameLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ulFilenameLength
     * }
     */
    public static int ulFilenameLength(MemorySegment struct) {
        return struct.get(ulFilenameLength$LAYOUT, ulFilenameLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ulFilenameLength
     * }
     */
    public static void ulFilenameLength(MemorySegment struct, int fieldValue) {
        struct.set(ulFilenameLength$LAYOUT, ulFilenameLength$OFFSET, fieldValue);
    }

    private static final OfInt ulPathLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ulPathLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ulPathLength
     * }
     */
    public static final OfInt ulPathLength$layout() {
        return ulPathLength$LAYOUT;
    }

    private static final long ulPathLength$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ulPathLength
     * }
     */
    public static final long ulPathLength$offset() {
        return ulPathLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ulPathLength
     * }
     */
    public static int ulPathLength(MemorySegment struct) {
        return struct.get(ulPathLength$LAYOUT, ulPathLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ulPathLength
     * }
     */
    public static void ulPathLength(MemorySegment struct, int fieldValue) {
        struct.set(ulPathLength$LAYOUT, ulPathLength$OFFSET, fieldValue);
    }

    private static final AddressLayout lpFileName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpFileName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCWSTR lpFileName
     * }
     */
    public static final AddressLayout lpFileName$layout() {
        return lpFileName$LAYOUT;
    }

    private static final long lpFileName$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCWSTR lpFileName
     * }
     */
    public static final long lpFileName$offset() {
        return lpFileName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCWSTR lpFileName
     * }
     */
    public static MemorySegment lpFileName(MemorySegment struct) {
        return struct.get(lpFileName$LAYOUT, lpFileName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCWSTR lpFileName
     * }
     */
    public static void lpFileName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpFileName$LAYOUT, lpFileName$OFFSET, fieldValue);
    }

    private static final AddressLayout lpFilePath$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpFilePath"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PCWSTR lpFilePath
     * }
     */
    public static final AddressLayout lpFilePath$layout() {
        return lpFilePath$LAYOUT;
    }

    private static final long lpFilePath$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PCWSTR lpFilePath
     * }
     */
    public static final long lpFilePath$offset() {
        return lpFilePath$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PCWSTR lpFilePath
     * }
     */
    public static MemorySegment lpFilePath(MemorySegment struct) {
        return struct.get(lpFilePath$LAYOUT, lpFilePath$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PCWSTR lpFilePath
     * }
     */
    public static void lpFilePath(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpFilePath$LAYOUT, lpFilePath$OFFSET, fieldValue);
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

