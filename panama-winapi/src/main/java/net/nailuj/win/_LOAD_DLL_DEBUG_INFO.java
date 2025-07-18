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
 * struct _LOAD_DLL_DEBUG_INFO {
 *     HANDLE hFile;
 *     LPVOID lpBaseOfDll;
 *     DWORD dwDebugInfoFileOffset;
 *     DWORD nDebugInfoSize;
 *     LPVOID lpImageName;
 *     WORD fUnicode;
 * }
 * }
 */
public class _LOAD_DLL_DEBUG_INFO {

    _LOAD_DLL_DEBUG_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_POINTER.withName("hFile"),
        winapi.C_POINTER.withName("lpBaseOfDll"),
        winapi.C_LONG.withName("dwDebugInfoFileOffset"),
        winapi.C_LONG.withName("nDebugInfoSize"),
        winapi.C_POINTER.withName("lpImageName"),
        winapi.C_SHORT.withName("fUnicode"),
        MemoryLayout.paddingLayout(6)
    ).withName("_LOAD_DLL_DEBUG_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout hFile$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hFile"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HANDLE hFile
     * }
     */
    public static final AddressLayout hFile$layout() {
        return hFile$LAYOUT;
    }

    private static final long hFile$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HANDLE hFile
     * }
     */
    public static final long hFile$offset() {
        return hFile$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HANDLE hFile
     * }
     */
    public static MemorySegment hFile(MemorySegment struct) {
        return struct.get(hFile$LAYOUT, hFile$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HANDLE hFile
     * }
     */
    public static void hFile(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hFile$LAYOUT, hFile$OFFSET, fieldValue);
    }

    private static final AddressLayout lpBaseOfDll$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpBaseOfDll"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPVOID lpBaseOfDll
     * }
     */
    public static final AddressLayout lpBaseOfDll$layout() {
        return lpBaseOfDll$LAYOUT;
    }

    private static final long lpBaseOfDll$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPVOID lpBaseOfDll
     * }
     */
    public static final long lpBaseOfDll$offset() {
        return lpBaseOfDll$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPVOID lpBaseOfDll
     * }
     */
    public static MemorySegment lpBaseOfDll(MemorySegment struct) {
        return struct.get(lpBaseOfDll$LAYOUT, lpBaseOfDll$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPVOID lpBaseOfDll
     * }
     */
    public static void lpBaseOfDll(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpBaseOfDll$LAYOUT, lpBaseOfDll$OFFSET, fieldValue);
    }

    private static final OfInt dwDebugInfoFileOffset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwDebugInfoFileOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwDebugInfoFileOffset
     * }
     */
    public static final OfInt dwDebugInfoFileOffset$layout() {
        return dwDebugInfoFileOffset$LAYOUT;
    }

    private static final long dwDebugInfoFileOffset$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwDebugInfoFileOffset
     * }
     */
    public static final long dwDebugInfoFileOffset$offset() {
        return dwDebugInfoFileOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwDebugInfoFileOffset
     * }
     */
    public static int dwDebugInfoFileOffset(MemorySegment struct) {
        return struct.get(dwDebugInfoFileOffset$LAYOUT, dwDebugInfoFileOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwDebugInfoFileOffset
     * }
     */
    public static void dwDebugInfoFileOffset(MemorySegment struct, int fieldValue) {
        struct.set(dwDebugInfoFileOffset$LAYOUT, dwDebugInfoFileOffset$OFFSET, fieldValue);
    }

    private static final OfInt nDebugInfoSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("nDebugInfoSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD nDebugInfoSize
     * }
     */
    public static final OfInt nDebugInfoSize$layout() {
        return nDebugInfoSize$LAYOUT;
    }

    private static final long nDebugInfoSize$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD nDebugInfoSize
     * }
     */
    public static final long nDebugInfoSize$offset() {
        return nDebugInfoSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD nDebugInfoSize
     * }
     */
    public static int nDebugInfoSize(MemorySegment struct) {
        return struct.get(nDebugInfoSize$LAYOUT, nDebugInfoSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD nDebugInfoSize
     * }
     */
    public static void nDebugInfoSize(MemorySegment struct, int fieldValue) {
        struct.set(nDebugInfoSize$LAYOUT, nDebugInfoSize$OFFSET, fieldValue);
    }

    private static final AddressLayout lpImageName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpImageName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPVOID lpImageName
     * }
     */
    public static final AddressLayout lpImageName$layout() {
        return lpImageName$LAYOUT;
    }

    private static final long lpImageName$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPVOID lpImageName
     * }
     */
    public static final long lpImageName$offset() {
        return lpImageName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPVOID lpImageName
     * }
     */
    public static MemorySegment lpImageName(MemorySegment struct) {
        return struct.get(lpImageName$LAYOUT, lpImageName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPVOID lpImageName
     * }
     */
    public static void lpImageName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpImageName$LAYOUT, lpImageName$OFFSET, fieldValue);
    }

    private static final OfShort fUnicode$LAYOUT = (OfShort)$LAYOUT.select(groupElement("fUnicode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD fUnicode
     * }
     */
    public static final OfShort fUnicode$layout() {
        return fUnicode$LAYOUT;
    }

    private static final long fUnicode$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD fUnicode
     * }
     */
    public static final long fUnicode$offset() {
        return fUnicode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD fUnicode
     * }
     */
    public static short fUnicode(MemorySegment struct) {
        return struct.get(fUnicode$LAYOUT, fUnicode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD fUnicode
     * }
     */
    public static void fUnicode(MemorySegment struct, short fieldValue) {
        struct.set(fUnicode$LAYOUT, fUnicode$OFFSET, fieldValue);
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

