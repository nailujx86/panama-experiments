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
 * struct _OSVERSIONINFOW {
 *     DWORD dwOSVersionInfoSize;
 *     DWORD dwMajorVersion;
 *     DWORD dwMinorVersion;
 *     DWORD dwBuildNumber;
 *     DWORD dwPlatformId;
 *     WCHAR szCSDVersion[128];
 * }
 * }
 */
public class _OSVERSIONINFOW {

    _OSVERSIONINFOW() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("dwOSVersionInfoSize"),
        winapi.C_LONG.withName("dwMajorVersion"),
        winapi.C_LONG.withName("dwMinorVersion"),
        winapi.C_LONG.withName("dwBuildNumber"),
        winapi.C_LONG.withName("dwPlatformId"),
        MemoryLayout.sequenceLayout(128, winapi.C_SHORT).withName("szCSDVersion")
    ).withName("_OSVERSIONINFOW");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwOSVersionInfoSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwOSVersionInfoSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwOSVersionInfoSize
     * }
     */
    public static final OfInt dwOSVersionInfoSize$layout() {
        return dwOSVersionInfoSize$LAYOUT;
    }

    private static final long dwOSVersionInfoSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwOSVersionInfoSize
     * }
     */
    public static final long dwOSVersionInfoSize$offset() {
        return dwOSVersionInfoSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwOSVersionInfoSize
     * }
     */
    public static int dwOSVersionInfoSize(MemorySegment struct) {
        return struct.get(dwOSVersionInfoSize$LAYOUT, dwOSVersionInfoSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwOSVersionInfoSize
     * }
     */
    public static void dwOSVersionInfoSize(MemorySegment struct, int fieldValue) {
        struct.set(dwOSVersionInfoSize$LAYOUT, dwOSVersionInfoSize$OFFSET, fieldValue);
    }

    private static final OfInt dwMajorVersion$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwMajorVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwMajorVersion
     * }
     */
    public static final OfInt dwMajorVersion$layout() {
        return dwMajorVersion$LAYOUT;
    }

    private static final long dwMajorVersion$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwMajorVersion
     * }
     */
    public static final long dwMajorVersion$offset() {
        return dwMajorVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwMajorVersion
     * }
     */
    public static int dwMajorVersion(MemorySegment struct) {
        return struct.get(dwMajorVersion$LAYOUT, dwMajorVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwMajorVersion
     * }
     */
    public static void dwMajorVersion(MemorySegment struct, int fieldValue) {
        struct.set(dwMajorVersion$LAYOUT, dwMajorVersion$OFFSET, fieldValue);
    }

    private static final OfInt dwMinorVersion$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwMinorVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwMinorVersion
     * }
     */
    public static final OfInt dwMinorVersion$layout() {
        return dwMinorVersion$LAYOUT;
    }

    private static final long dwMinorVersion$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwMinorVersion
     * }
     */
    public static final long dwMinorVersion$offset() {
        return dwMinorVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwMinorVersion
     * }
     */
    public static int dwMinorVersion(MemorySegment struct) {
        return struct.get(dwMinorVersion$LAYOUT, dwMinorVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwMinorVersion
     * }
     */
    public static void dwMinorVersion(MemorySegment struct, int fieldValue) {
        struct.set(dwMinorVersion$LAYOUT, dwMinorVersion$OFFSET, fieldValue);
    }

    private static final OfInt dwBuildNumber$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwBuildNumber"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwBuildNumber
     * }
     */
    public static final OfInt dwBuildNumber$layout() {
        return dwBuildNumber$LAYOUT;
    }

    private static final long dwBuildNumber$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwBuildNumber
     * }
     */
    public static final long dwBuildNumber$offset() {
        return dwBuildNumber$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwBuildNumber
     * }
     */
    public static int dwBuildNumber(MemorySegment struct) {
        return struct.get(dwBuildNumber$LAYOUT, dwBuildNumber$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwBuildNumber
     * }
     */
    public static void dwBuildNumber(MemorySegment struct, int fieldValue) {
        struct.set(dwBuildNumber$LAYOUT, dwBuildNumber$OFFSET, fieldValue);
    }

    private static final OfInt dwPlatformId$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwPlatformId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwPlatformId
     * }
     */
    public static final OfInt dwPlatformId$layout() {
        return dwPlatformId$LAYOUT;
    }

    private static final long dwPlatformId$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwPlatformId
     * }
     */
    public static final long dwPlatformId$offset() {
        return dwPlatformId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwPlatformId
     * }
     */
    public static int dwPlatformId(MemorySegment struct) {
        return struct.get(dwPlatformId$LAYOUT, dwPlatformId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwPlatformId
     * }
     */
    public static void dwPlatformId(MemorySegment struct, int fieldValue) {
        struct.set(dwPlatformId$LAYOUT, dwPlatformId$OFFSET, fieldValue);
    }

    private static final SequenceLayout szCSDVersion$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("szCSDVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WCHAR szCSDVersion[128]
     * }
     */
    public static final SequenceLayout szCSDVersion$layout() {
        return szCSDVersion$LAYOUT;
    }

    private static final long szCSDVersion$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WCHAR szCSDVersion[128]
     * }
     */
    public static final long szCSDVersion$offset() {
        return szCSDVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WCHAR szCSDVersion[128]
     * }
     */
    public static MemorySegment szCSDVersion(MemorySegment struct) {
        return struct.asSlice(szCSDVersion$OFFSET, szCSDVersion$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WCHAR szCSDVersion[128]
     * }
     */
    public static void szCSDVersion(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, szCSDVersion$OFFSET, szCSDVersion$LAYOUT.byteSize());
    }

    private static long[] szCSDVersion$DIMS = { 128 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * WCHAR szCSDVersion[128]
     * }
     */
    public static long[] szCSDVersion$dimensions() {
        return szCSDVersion$DIMS;
    }
    private static final VarHandle szCSDVersion$ELEM_HANDLE = szCSDVersion$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * WCHAR szCSDVersion[128]
     * }
     */
    public static short szCSDVersion(MemorySegment struct, long index0) {
        return (short)szCSDVersion$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * WCHAR szCSDVersion[128]
     * }
     */
    public static void szCSDVersion(MemorySegment struct, long index0, short fieldValue) {
        szCSDVersion$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

