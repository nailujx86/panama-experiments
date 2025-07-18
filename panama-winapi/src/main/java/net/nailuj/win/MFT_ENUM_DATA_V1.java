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
 * struct {
 *     DWORDLONG StartFileReferenceNumber;
 *     USN LowUsn;
 *     USN HighUsn;
 *     WORD MinMajorVersion;
 *     WORD MaxMajorVersion;
 * }
 * }
 */
public class MFT_ENUM_DATA_V1 {

    MFT_ENUM_DATA_V1() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG_LONG.withName("StartFileReferenceNumber"),
        winapi.C_LONG_LONG.withName("LowUsn"),
        winapi.C_LONG_LONG.withName("HighUsn"),
        winapi.C_SHORT.withName("MinMajorVersion"),
        winapi.C_SHORT.withName("MaxMajorVersion"),
        MemoryLayout.paddingLayout(4)
    ).withName("$anon$11902:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong StartFileReferenceNumber$LAYOUT = (OfLong)$LAYOUT.select(groupElement("StartFileReferenceNumber"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG StartFileReferenceNumber
     * }
     */
    public static final OfLong StartFileReferenceNumber$layout() {
        return StartFileReferenceNumber$LAYOUT;
    }

    private static final long StartFileReferenceNumber$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG StartFileReferenceNumber
     * }
     */
    public static final long StartFileReferenceNumber$offset() {
        return StartFileReferenceNumber$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG StartFileReferenceNumber
     * }
     */
    public static long StartFileReferenceNumber(MemorySegment struct) {
        return struct.get(StartFileReferenceNumber$LAYOUT, StartFileReferenceNumber$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG StartFileReferenceNumber
     * }
     */
    public static void StartFileReferenceNumber(MemorySegment struct, long fieldValue) {
        struct.set(StartFileReferenceNumber$LAYOUT, StartFileReferenceNumber$OFFSET, fieldValue);
    }

    private static final OfLong LowUsn$LAYOUT = (OfLong)$LAYOUT.select(groupElement("LowUsn"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * USN LowUsn
     * }
     */
    public static final OfLong LowUsn$layout() {
        return LowUsn$LAYOUT;
    }

    private static final long LowUsn$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * USN LowUsn
     * }
     */
    public static final long LowUsn$offset() {
        return LowUsn$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * USN LowUsn
     * }
     */
    public static long LowUsn(MemorySegment struct) {
        return struct.get(LowUsn$LAYOUT, LowUsn$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * USN LowUsn
     * }
     */
    public static void LowUsn(MemorySegment struct, long fieldValue) {
        struct.set(LowUsn$LAYOUT, LowUsn$OFFSET, fieldValue);
    }

    private static final OfLong HighUsn$LAYOUT = (OfLong)$LAYOUT.select(groupElement("HighUsn"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * USN HighUsn
     * }
     */
    public static final OfLong HighUsn$layout() {
        return HighUsn$LAYOUT;
    }

    private static final long HighUsn$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * USN HighUsn
     * }
     */
    public static final long HighUsn$offset() {
        return HighUsn$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * USN HighUsn
     * }
     */
    public static long HighUsn(MemorySegment struct) {
        return struct.get(HighUsn$LAYOUT, HighUsn$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * USN HighUsn
     * }
     */
    public static void HighUsn(MemorySegment struct, long fieldValue) {
        struct.set(HighUsn$LAYOUT, HighUsn$OFFSET, fieldValue);
    }

    private static final OfShort MinMajorVersion$LAYOUT = (OfShort)$LAYOUT.select(groupElement("MinMajorVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD MinMajorVersion
     * }
     */
    public static final OfShort MinMajorVersion$layout() {
        return MinMajorVersion$LAYOUT;
    }

    private static final long MinMajorVersion$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD MinMajorVersion
     * }
     */
    public static final long MinMajorVersion$offset() {
        return MinMajorVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD MinMajorVersion
     * }
     */
    public static short MinMajorVersion(MemorySegment struct) {
        return struct.get(MinMajorVersion$LAYOUT, MinMajorVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD MinMajorVersion
     * }
     */
    public static void MinMajorVersion(MemorySegment struct, short fieldValue) {
        struct.set(MinMajorVersion$LAYOUT, MinMajorVersion$OFFSET, fieldValue);
    }

    private static final OfShort MaxMajorVersion$LAYOUT = (OfShort)$LAYOUT.select(groupElement("MaxMajorVersion"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD MaxMajorVersion
     * }
     */
    public static final OfShort MaxMajorVersion$layout() {
        return MaxMajorVersion$LAYOUT;
    }

    private static final long MaxMajorVersion$OFFSET = 26;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD MaxMajorVersion
     * }
     */
    public static final long MaxMajorVersion$offset() {
        return MaxMajorVersion$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD MaxMajorVersion
     * }
     */
    public static short MaxMajorVersion(MemorySegment struct) {
        return struct.get(MaxMajorVersion$LAYOUT, MaxMajorVersion$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD MaxMajorVersion
     * }
     */
    public static void MaxMajorVersion(MemorySegment struct, short fieldValue) {
        struct.set(MaxMajorVersion$LAYOUT, MaxMajorVersion$OFFSET, fieldValue);
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

