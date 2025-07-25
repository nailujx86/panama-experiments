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
 * struct _TIME_DYNAMIC_ZONE_INFORMATION {
 *     LONG Bias;
 *     WCHAR StandardName[32];
 *     SYSTEMTIME StandardDate;
 *     LONG StandardBias;
 *     WCHAR DaylightName[32];
 *     SYSTEMTIME DaylightDate;
 *     LONG DaylightBias;
 *     WCHAR TimeZoneKeyName[128];
 *     BOOLEAN DynamicDaylightTimeDisabled;
 * }
 * }
 */
public class _TIME_DYNAMIC_ZONE_INFORMATION {

    _TIME_DYNAMIC_ZONE_INFORMATION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("Bias"),
        MemoryLayout.sequenceLayout(32, winapi.C_SHORT).withName("StandardName"),
        _SYSTEMTIME.layout().withName("StandardDate"),
        winapi.C_LONG.withName("StandardBias"),
        MemoryLayout.sequenceLayout(32, winapi.C_SHORT).withName("DaylightName"),
        _SYSTEMTIME.layout().withName("DaylightDate"),
        winapi.C_LONG.withName("DaylightBias"),
        MemoryLayout.sequenceLayout(128, winapi.C_SHORT).withName("TimeZoneKeyName"),
        winapi.C_CHAR.withName("DynamicDaylightTimeDisabled"),
        MemoryLayout.paddingLayout(3)
    ).withName("_TIME_DYNAMIC_ZONE_INFORMATION");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Bias$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Bias"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG Bias
     * }
     */
    public static final OfInt Bias$layout() {
        return Bias$LAYOUT;
    }

    private static final long Bias$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG Bias
     * }
     */
    public static final long Bias$offset() {
        return Bias$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG Bias
     * }
     */
    public static int Bias(MemorySegment struct) {
        return struct.get(Bias$LAYOUT, Bias$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG Bias
     * }
     */
    public static void Bias(MemorySegment struct, int fieldValue) {
        struct.set(Bias$LAYOUT, Bias$OFFSET, fieldValue);
    }

    private static final SequenceLayout StandardName$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("StandardName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WCHAR StandardName[32]
     * }
     */
    public static final SequenceLayout StandardName$layout() {
        return StandardName$LAYOUT;
    }

    private static final long StandardName$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WCHAR StandardName[32]
     * }
     */
    public static final long StandardName$offset() {
        return StandardName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WCHAR StandardName[32]
     * }
     */
    public static MemorySegment StandardName(MemorySegment struct) {
        return struct.asSlice(StandardName$OFFSET, StandardName$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WCHAR StandardName[32]
     * }
     */
    public static void StandardName(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, StandardName$OFFSET, StandardName$LAYOUT.byteSize());
    }

    private static long[] StandardName$DIMS = { 32 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * WCHAR StandardName[32]
     * }
     */
    public static long[] StandardName$dimensions() {
        return StandardName$DIMS;
    }
    private static final VarHandle StandardName$ELEM_HANDLE = StandardName$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * WCHAR StandardName[32]
     * }
     */
    public static short StandardName(MemorySegment struct, long index0) {
        return (short)StandardName$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * WCHAR StandardName[32]
     * }
     */
    public static void StandardName(MemorySegment struct, long index0, short fieldValue) {
        StandardName$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final GroupLayout StandardDate$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("StandardDate"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SYSTEMTIME StandardDate
     * }
     */
    public static final GroupLayout StandardDate$layout() {
        return StandardDate$LAYOUT;
    }

    private static final long StandardDate$OFFSET = 68;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SYSTEMTIME StandardDate
     * }
     */
    public static final long StandardDate$offset() {
        return StandardDate$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SYSTEMTIME StandardDate
     * }
     */
    public static MemorySegment StandardDate(MemorySegment struct) {
        return struct.asSlice(StandardDate$OFFSET, StandardDate$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SYSTEMTIME StandardDate
     * }
     */
    public static void StandardDate(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, StandardDate$OFFSET, StandardDate$LAYOUT.byteSize());
    }

    private static final OfInt StandardBias$LAYOUT = (OfInt)$LAYOUT.select(groupElement("StandardBias"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG StandardBias
     * }
     */
    public static final OfInt StandardBias$layout() {
        return StandardBias$LAYOUT;
    }

    private static final long StandardBias$OFFSET = 84;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG StandardBias
     * }
     */
    public static final long StandardBias$offset() {
        return StandardBias$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG StandardBias
     * }
     */
    public static int StandardBias(MemorySegment struct) {
        return struct.get(StandardBias$LAYOUT, StandardBias$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG StandardBias
     * }
     */
    public static void StandardBias(MemorySegment struct, int fieldValue) {
        struct.set(StandardBias$LAYOUT, StandardBias$OFFSET, fieldValue);
    }

    private static final SequenceLayout DaylightName$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("DaylightName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WCHAR DaylightName[32]
     * }
     */
    public static final SequenceLayout DaylightName$layout() {
        return DaylightName$LAYOUT;
    }

    private static final long DaylightName$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WCHAR DaylightName[32]
     * }
     */
    public static final long DaylightName$offset() {
        return DaylightName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WCHAR DaylightName[32]
     * }
     */
    public static MemorySegment DaylightName(MemorySegment struct) {
        return struct.asSlice(DaylightName$OFFSET, DaylightName$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WCHAR DaylightName[32]
     * }
     */
    public static void DaylightName(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, DaylightName$OFFSET, DaylightName$LAYOUT.byteSize());
    }

    private static long[] DaylightName$DIMS = { 32 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * WCHAR DaylightName[32]
     * }
     */
    public static long[] DaylightName$dimensions() {
        return DaylightName$DIMS;
    }
    private static final VarHandle DaylightName$ELEM_HANDLE = DaylightName$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * WCHAR DaylightName[32]
     * }
     */
    public static short DaylightName(MemorySegment struct, long index0) {
        return (short)DaylightName$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * WCHAR DaylightName[32]
     * }
     */
    public static void DaylightName(MemorySegment struct, long index0, short fieldValue) {
        DaylightName$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final GroupLayout DaylightDate$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("DaylightDate"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SYSTEMTIME DaylightDate
     * }
     */
    public static final GroupLayout DaylightDate$layout() {
        return DaylightDate$LAYOUT;
    }

    private static final long DaylightDate$OFFSET = 152;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SYSTEMTIME DaylightDate
     * }
     */
    public static final long DaylightDate$offset() {
        return DaylightDate$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SYSTEMTIME DaylightDate
     * }
     */
    public static MemorySegment DaylightDate(MemorySegment struct) {
        return struct.asSlice(DaylightDate$OFFSET, DaylightDate$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SYSTEMTIME DaylightDate
     * }
     */
    public static void DaylightDate(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, DaylightDate$OFFSET, DaylightDate$LAYOUT.byteSize());
    }

    private static final OfInt DaylightBias$LAYOUT = (OfInt)$LAYOUT.select(groupElement("DaylightBias"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG DaylightBias
     * }
     */
    public static final OfInt DaylightBias$layout() {
        return DaylightBias$LAYOUT;
    }

    private static final long DaylightBias$OFFSET = 168;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG DaylightBias
     * }
     */
    public static final long DaylightBias$offset() {
        return DaylightBias$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG DaylightBias
     * }
     */
    public static int DaylightBias(MemorySegment struct) {
        return struct.get(DaylightBias$LAYOUT, DaylightBias$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG DaylightBias
     * }
     */
    public static void DaylightBias(MemorySegment struct, int fieldValue) {
        struct.set(DaylightBias$LAYOUT, DaylightBias$OFFSET, fieldValue);
    }

    private static final SequenceLayout TimeZoneKeyName$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("TimeZoneKeyName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WCHAR TimeZoneKeyName[128]
     * }
     */
    public static final SequenceLayout TimeZoneKeyName$layout() {
        return TimeZoneKeyName$LAYOUT;
    }

    private static final long TimeZoneKeyName$OFFSET = 172;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WCHAR TimeZoneKeyName[128]
     * }
     */
    public static final long TimeZoneKeyName$offset() {
        return TimeZoneKeyName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WCHAR TimeZoneKeyName[128]
     * }
     */
    public static MemorySegment TimeZoneKeyName(MemorySegment struct) {
        return struct.asSlice(TimeZoneKeyName$OFFSET, TimeZoneKeyName$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WCHAR TimeZoneKeyName[128]
     * }
     */
    public static void TimeZoneKeyName(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, TimeZoneKeyName$OFFSET, TimeZoneKeyName$LAYOUT.byteSize());
    }

    private static long[] TimeZoneKeyName$DIMS = { 128 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * WCHAR TimeZoneKeyName[128]
     * }
     */
    public static long[] TimeZoneKeyName$dimensions() {
        return TimeZoneKeyName$DIMS;
    }
    private static final VarHandle TimeZoneKeyName$ELEM_HANDLE = TimeZoneKeyName$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * WCHAR TimeZoneKeyName[128]
     * }
     */
    public static short TimeZoneKeyName(MemorySegment struct, long index0) {
        return (short)TimeZoneKeyName$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * WCHAR TimeZoneKeyName[128]
     * }
     */
    public static void TimeZoneKeyName(MemorySegment struct, long index0, short fieldValue) {
        TimeZoneKeyName$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfByte DynamicDaylightTimeDisabled$LAYOUT = (OfByte)$LAYOUT.select(groupElement("DynamicDaylightTimeDisabled"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN DynamicDaylightTimeDisabled
     * }
     */
    public static final OfByte DynamicDaylightTimeDisabled$layout() {
        return DynamicDaylightTimeDisabled$LAYOUT;
    }

    private static final long DynamicDaylightTimeDisabled$OFFSET = 428;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN DynamicDaylightTimeDisabled
     * }
     */
    public static final long DynamicDaylightTimeDisabled$offset() {
        return DynamicDaylightTimeDisabled$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN DynamicDaylightTimeDisabled
     * }
     */
    public static byte DynamicDaylightTimeDisabled(MemorySegment struct) {
        return struct.get(DynamicDaylightTimeDisabled$LAYOUT, DynamicDaylightTimeDisabled$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN DynamicDaylightTimeDisabled
     * }
     */
    public static void DynamicDaylightTimeDisabled(MemorySegment struct, byte fieldValue) {
        struct.set(DynamicDaylightTimeDisabled$LAYOUT, DynamicDaylightTimeDisabled$OFFSET, fieldValue);
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

