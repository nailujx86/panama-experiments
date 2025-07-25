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
 * struct tagRAWHID {
 *     DWORD dwSizeHid;
 *     DWORD dwCount;
 *     BYTE bRawData[1];
 * }
 * }
 */
public class tagRAWHID {

    tagRAWHID() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("dwSizeHid"),
        winapi.C_LONG.withName("dwCount"),
        MemoryLayout.sequenceLayout(1, winapi.C_CHAR).withName("bRawData"),
        MemoryLayout.paddingLayout(3)
    ).withName("tagRAWHID");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwSizeHid$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwSizeHid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwSizeHid
     * }
     */
    public static final OfInt dwSizeHid$layout() {
        return dwSizeHid$LAYOUT;
    }

    private static final long dwSizeHid$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwSizeHid
     * }
     */
    public static final long dwSizeHid$offset() {
        return dwSizeHid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwSizeHid
     * }
     */
    public static int dwSizeHid(MemorySegment struct) {
        return struct.get(dwSizeHid$LAYOUT, dwSizeHid$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwSizeHid
     * }
     */
    public static void dwSizeHid(MemorySegment struct, int fieldValue) {
        struct.set(dwSizeHid$LAYOUT, dwSizeHid$OFFSET, fieldValue);
    }

    private static final OfInt dwCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwCount
     * }
     */
    public static final OfInt dwCount$layout() {
        return dwCount$LAYOUT;
    }

    private static final long dwCount$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwCount
     * }
     */
    public static final long dwCount$offset() {
        return dwCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwCount
     * }
     */
    public static int dwCount(MemorySegment struct) {
        return struct.get(dwCount$LAYOUT, dwCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwCount
     * }
     */
    public static void dwCount(MemorySegment struct, int fieldValue) {
        struct.set(dwCount$LAYOUT, dwCount$OFFSET, fieldValue);
    }

    private static final SequenceLayout bRawData$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("bRawData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE bRawData[1]
     * }
     */
    public static final SequenceLayout bRawData$layout() {
        return bRawData$LAYOUT;
    }

    private static final long bRawData$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE bRawData[1]
     * }
     */
    public static final long bRawData$offset() {
        return bRawData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE bRawData[1]
     * }
     */
    public static MemorySegment bRawData(MemorySegment struct) {
        return struct.asSlice(bRawData$OFFSET, bRawData$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE bRawData[1]
     * }
     */
    public static void bRawData(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, bRawData$OFFSET, bRawData$LAYOUT.byteSize());
    }

    private static long[] bRawData$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE bRawData[1]
     * }
     */
    public static long[] bRawData$dimensions() {
        return bRawData$DIMS;
    }
    private static final VarHandle bRawData$ELEM_HANDLE = bRawData$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE bRawData[1]
     * }
     */
    public static byte bRawData(MemorySegment struct, long index0) {
        return (byte)bRawData$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE bRawData[1]
     * }
     */
    public static void bRawData(MemorySegment struct, long index0, byte fieldValue) {
        bRawData$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

