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
 * struct _tagHIT_LOGGING_INFO {
 *     DWORD dwStructSize;
 *     LPSTR lpszLoggedUrlName;
 *     SYSTEMTIME StartTime;
 *     SYSTEMTIME EndTime;
 *     LPSTR lpszExtendedInfo;
 * }
 * }
 */
public class _tagHIT_LOGGING_INFO {

    _tagHIT_LOGGING_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("dwStructSize"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("lpszLoggedUrlName"),
        _SYSTEMTIME.layout().withName("StartTime"),
        _SYSTEMTIME.layout().withName("EndTime"),
        winapi.C_POINTER.withName("lpszExtendedInfo")
    ).withName("_tagHIT_LOGGING_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwStructSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwStructSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwStructSize
     * }
     */
    public static final OfInt dwStructSize$layout() {
        return dwStructSize$LAYOUT;
    }

    private static final long dwStructSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwStructSize
     * }
     */
    public static final long dwStructSize$offset() {
        return dwStructSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwStructSize
     * }
     */
    public static int dwStructSize(MemorySegment struct) {
        return struct.get(dwStructSize$LAYOUT, dwStructSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwStructSize
     * }
     */
    public static void dwStructSize(MemorySegment struct, int fieldValue) {
        struct.set(dwStructSize$LAYOUT, dwStructSize$OFFSET, fieldValue);
    }

    private static final AddressLayout lpszLoggedUrlName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpszLoggedUrlName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPSTR lpszLoggedUrlName
     * }
     */
    public static final AddressLayout lpszLoggedUrlName$layout() {
        return lpszLoggedUrlName$LAYOUT;
    }

    private static final long lpszLoggedUrlName$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPSTR lpszLoggedUrlName
     * }
     */
    public static final long lpszLoggedUrlName$offset() {
        return lpszLoggedUrlName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPSTR lpszLoggedUrlName
     * }
     */
    public static MemorySegment lpszLoggedUrlName(MemorySegment struct) {
        return struct.get(lpszLoggedUrlName$LAYOUT, lpszLoggedUrlName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPSTR lpszLoggedUrlName
     * }
     */
    public static void lpszLoggedUrlName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpszLoggedUrlName$LAYOUT, lpszLoggedUrlName$OFFSET, fieldValue);
    }

    private static final GroupLayout StartTime$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("StartTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SYSTEMTIME StartTime
     * }
     */
    public static final GroupLayout StartTime$layout() {
        return StartTime$LAYOUT;
    }

    private static final long StartTime$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SYSTEMTIME StartTime
     * }
     */
    public static final long StartTime$offset() {
        return StartTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SYSTEMTIME StartTime
     * }
     */
    public static MemorySegment StartTime(MemorySegment struct) {
        return struct.asSlice(StartTime$OFFSET, StartTime$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SYSTEMTIME StartTime
     * }
     */
    public static void StartTime(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, StartTime$OFFSET, StartTime$LAYOUT.byteSize());
    }

    private static final GroupLayout EndTime$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("EndTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SYSTEMTIME EndTime
     * }
     */
    public static final GroupLayout EndTime$layout() {
        return EndTime$LAYOUT;
    }

    private static final long EndTime$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SYSTEMTIME EndTime
     * }
     */
    public static final long EndTime$offset() {
        return EndTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SYSTEMTIME EndTime
     * }
     */
    public static MemorySegment EndTime(MemorySegment struct) {
        return struct.asSlice(EndTime$OFFSET, EndTime$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SYSTEMTIME EndTime
     * }
     */
    public static void EndTime(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, EndTime$OFFSET, EndTime$LAYOUT.byteSize());
    }

    private static final AddressLayout lpszExtendedInfo$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpszExtendedInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPSTR lpszExtendedInfo
     * }
     */
    public static final AddressLayout lpszExtendedInfo$layout() {
        return lpszExtendedInfo$LAYOUT;
    }

    private static final long lpszExtendedInfo$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPSTR lpszExtendedInfo
     * }
     */
    public static final long lpszExtendedInfo$offset() {
        return lpszExtendedInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPSTR lpszExtendedInfo
     * }
     */
    public static MemorySegment lpszExtendedInfo(MemorySegment struct) {
        return struct.get(lpszExtendedInfo$LAYOUT, lpszExtendedInfo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPSTR lpszExtendedInfo
     * }
     */
    public static void lpszExtendedInfo(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpszExtendedInfo$LAYOUT, lpszExtendedInfo$OFFSET, fieldValue);
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

