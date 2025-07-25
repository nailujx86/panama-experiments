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
 * struct _TXFS_QUERY_RM_INFORMATION {
 *     DWORD BytesRequired;
 *     DWORDLONG TailLsn;
 *     DWORDLONG CurrentLsn;
 *     DWORDLONG ArchiveTailLsn;
 *     DWORDLONG LogContainerSize;
 *     LARGE_INTEGER HighestVirtualClock;
 *     DWORD LogContainerCount;
 *     DWORD LogContainerCountMax;
 *     DWORD LogContainerCountMin;
 *     DWORD LogGrowthIncrement;
 *     DWORD LogAutoShrinkPercentage;
 *     DWORD Flags;
 *     WORD LoggingMode;
 *     WORD Reserved;
 *     DWORD RmState;
 *     DWORDLONG LogCapacity;
 *     DWORDLONG LogFree;
 *     DWORDLONG TopsSize;
 *     DWORDLONG TopsUsed;
 *     DWORDLONG TransactionCount;
 *     DWORDLONG OnePCCount;
 *     DWORDLONG TwoPCCount;
 *     DWORDLONG NumberLogFileFull;
 *     DWORDLONG OldestTransactionAge;
 *     GUID RMName;
 *     DWORD TmLogPathOffset;
 * }
 * }
 */
public class _TXFS_QUERY_RM_INFORMATION {

    _TXFS_QUERY_RM_INFORMATION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("BytesRequired"),
        MemoryLayout.paddingLayout(4),
        winapi.C_LONG_LONG.withName("TailLsn"),
        winapi.C_LONG_LONG.withName("CurrentLsn"),
        winapi.C_LONG_LONG.withName("ArchiveTailLsn"),
        winapi.C_LONG_LONG.withName("LogContainerSize"),
        _LARGE_INTEGER.layout().withName("HighestVirtualClock"),
        winapi.C_LONG.withName("LogContainerCount"),
        winapi.C_LONG.withName("LogContainerCountMax"),
        winapi.C_LONG.withName("LogContainerCountMin"),
        winapi.C_LONG.withName("LogGrowthIncrement"),
        winapi.C_LONG.withName("LogAutoShrinkPercentage"),
        winapi.C_LONG.withName("Flags"),
        winapi.C_SHORT.withName("LoggingMode"),
        winapi.C_SHORT.withName("Reserved"),
        winapi.C_LONG.withName("RmState"),
        winapi.C_LONG_LONG.withName("LogCapacity"),
        winapi.C_LONG_LONG.withName("LogFree"),
        winapi.C_LONG_LONG.withName("TopsSize"),
        winapi.C_LONG_LONG.withName("TopsUsed"),
        winapi.C_LONG_LONG.withName("TransactionCount"),
        winapi.C_LONG_LONG.withName("OnePCCount"),
        winapi.C_LONG_LONG.withName("TwoPCCount"),
        winapi.C_LONG_LONG.withName("NumberLogFileFull"),
        winapi.C_LONG_LONG.withName("OldestTransactionAge"),
        _GUID.layout().withName("RMName"),
        winapi.C_LONG.withName("TmLogPathOffset"),
        MemoryLayout.paddingLayout(4)
    ).withName("_TXFS_QUERY_RM_INFORMATION");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt BytesRequired$LAYOUT = (OfInt)$LAYOUT.select(groupElement("BytesRequired"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD BytesRequired
     * }
     */
    public static final OfInt BytesRequired$layout() {
        return BytesRequired$LAYOUT;
    }

    private static final long BytesRequired$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD BytesRequired
     * }
     */
    public static final long BytesRequired$offset() {
        return BytesRequired$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD BytesRequired
     * }
     */
    public static int BytesRequired(MemorySegment struct) {
        return struct.get(BytesRequired$LAYOUT, BytesRequired$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD BytesRequired
     * }
     */
    public static void BytesRequired(MemorySegment struct, int fieldValue) {
        struct.set(BytesRequired$LAYOUT, BytesRequired$OFFSET, fieldValue);
    }

    private static final OfLong TailLsn$LAYOUT = (OfLong)$LAYOUT.select(groupElement("TailLsn"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG TailLsn
     * }
     */
    public static final OfLong TailLsn$layout() {
        return TailLsn$LAYOUT;
    }

    private static final long TailLsn$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG TailLsn
     * }
     */
    public static final long TailLsn$offset() {
        return TailLsn$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG TailLsn
     * }
     */
    public static long TailLsn(MemorySegment struct) {
        return struct.get(TailLsn$LAYOUT, TailLsn$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG TailLsn
     * }
     */
    public static void TailLsn(MemorySegment struct, long fieldValue) {
        struct.set(TailLsn$LAYOUT, TailLsn$OFFSET, fieldValue);
    }

    private static final OfLong CurrentLsn$LAYOUT = (OfLong)$LAYOUT.select(groupElement("CurrentLsn"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG CurrentLsn
     * }
     */
    public static final OfLong CurrentLsn$layout() {
        return CurrentLsn$LAYOUT;
    }

    private static final long CurrentLsn$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG CurrentLsn
     * }
     */
    public static final long CurrentLsn$offset() {
        return CurrentLsn$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG CurrentLsn
     * }
     */
    public static long CurrentLsn(MemorySegment struct) {
        return struct.get(CurrentLsn$LAYOUT, CurrentLsn$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG CurrentLsn
     * }
     */
    public static void CurrentLsn(MemorySegment struct, long fieldValue) {
        struct.set(CurrentLsn$LAYOUT, CurrentLsn$OFFSET, fieldValue);
    }

    private static final OfLong ArchiveTailLsn$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ArchiveTailLsn"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG ArchiveTailLsn
     * }
     */
    public static final OfLong ArchiveTailLsn$layout() {
        return ArchiveTailLsn$LAYOUT;
    }

    private static final long ArchiveTailLsn$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG ArchiveTailLsn
     * }
     */
    public static final long ArchiveTailLsn$offset() {
        return ArchiveTailLsn$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG ArchiveTailLsn
     * }
     */
    public static long ArchiveTailLsn(MemorySegment struct) {
        return struct.get(ArchiveTailLsn$LAYOUT, ArchiveTailLsn$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG ArchiveTailLsn
     * }
     */
    public static void ArchiveTailLsn(MemorySegment struct, long fieldValue) {
        struct.set(ArchiveTailLsn$LAYOUT, ArchiveTailLsn$OFFSET, fieldValue);
    }

    private static final OfLong LogContainerSize$LAYOUT = (OfLong)$LAYOUT.select(groupElement("LogContainerSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG LogContainerSize
     * }
     */
    public static final OfLong LogContainerSize$layout() {
        return LogContainerSize$LAYOUT;
    }

    private static final long LogContainerSize$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG LogContainerSize
     * }
     */
    public static final long LogContainerSize$offset() {
        return LogContainerSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG LogContainerSize
     * }
     */
    public static long LogContainerSize(MemorySegment struct) {
        return struct.get(LogContainerSize$LAYOUT, LogContainerSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG LogContainerSize
     * }
     */
    public static void LogContainerSize(MemorySegment struct, long fieldValue) {
        struct.set(LogContainerSize$LAYOUT, LogContainerSize$OFFSET, fieldValue);
    }

    private static final GroupLayout HighestVirtualClock$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("HighestVirtualClock"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LARGE_INTEGER HighestVirtualClock
     * }
     */
    public static final GroupLayout HighestVirtualClock$layout() {
        return HighestVirtualClock$LAYOUT;
    }

    private static final long HighestVirtualClock$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LARGE_INTEGER HighestVirtualClock
     * }
     */
    public static final long HighestVirtualClock$offset() {
        return HighestVirtualClock$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER HighestVirtualClock
     * }
     */
    public static MemorySegment HighestVirtualClock(MemorySegment struct) {
        return struct.asSlice(HighestVirtualClock$OFFSET, HighestVirtualClock$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LARGE_INTEGER HighestVirtualClock
     * }
     */
    public static void HighestVirtualClock(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, HighestVirtualClock$OFFSET, HighestVirtualClock$LAYOUT.byteSize());
    }

    private static final OfInt LogContainerCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("LogContainerCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD LogContainerCount
     * }
     */
    public static final OfInt LogContainerCount$layout() {
        return LogContainerCount$LAYOUT;
    }

    private static final long LogContainerCount$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD LogContainerCount
     * }
     */
    public static final long LogContainerCount$offset() {
        return LogContainerCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD LogContainerCount
     * }
     */
    public static int LogContainerCount(MemorySegment struct) {
        return struct.get(LogContainerCount$LAYOUT, LogContainerCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD LogContainerCount
     * }
     */
    public static void LogContainerCount(MemorySegment struct, int fieldValue) {
        struct.set(LogContainerCount$LAYOUT, LogContainerCount$OFFSET, fieldValue);
    }

    private static final OfInt LogContainerCountMax$LAYOUT = (OfInt)$LAYOUT.select(groupElement("LogContainerCountMax"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD LogContainerCountMax
     * }
     */
    public static final OfInt LogContainerCountMax$layout() {
        return LogContainerCountMax$LAYOUT;
    }

    private static final long LogContainerCountMax$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD LogContainerCountMax
     * }
     */
    public static final long LogContainerCountMax$offset() {
        return LogContainerCountMax$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD LogContainerCountMax
     * }
     */
    public static int LogContainerCountMax(MemorySegment struct) {
        return struct.get(LogContainerCountMax$LAYOUT, LogContainerCountMax$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD LogContainerCountMax
     * }
     */
    public static void LogContainerCountMax(MemorySegment struct, int fieldValue) {
        struct.set(LogContainerCountMax$LAYOUT, LogContainerCountMax$OFFSET, fieldValue);
    }

    private static final OfInt LogContainerCountMin$LAYOUT = (OfInt)$LAYOUT.select(groupElement("LogContainerCountMin"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD LogContainerCountMin
     * }
     */
    public static final OfInt LogContainerCountMin$layout() {
        return LogContainerCountMin$LAYOUT;
    }

    private static final long LogContainerCountMin$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD LogContainerCountMin
     * }
     */
    public static final long LogContainerCountMin$offset() {
        return LogContainerCountMin$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD LogContainerCountMin
     * }
     */
    public static int LogContainerCountMin(MemorySegment struct) {
        return struct.get(LogContainerCountMin$LAYOUT, LogContainerCountMin$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD LogContainerCountMin
     * }
     */
    public static void LogContainerCountMin(MemorySegment struct, int fieldValue) {
        struct.set(LogContainerCountMin$LAYOUT, LogContainerCountMin$OFFSET, fieldValue);
    }

    private static final OfInt LogGrowthIncrement$LAYOUT = (OfInt)$LAYOUT.select(groupElement("LogGrowthIncrement"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD LogGrowthIncrement
     * }
     */
    public static final OfInt LogGrowthIncrement$layout() {
        return LogGrowthIncrement$LAYOUT;
    }

    private static final long LogGrowthIncrement$OFFSET = 60;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD LogGrowthIncrement
     * }
     */
    public static final long LogGrowthIncrement$offset() {
        return LogGrowthIncrement$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD LogGrowthIncrement
     * }
     */
    public static int LogGrowthIncrement(MemorySegment struct) {
        return struct.get(LogGrowthIncrement$LAYOUT, LogGrowthIncrement$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD LogGrowthIncrement
     * }
     */
    public static void LogGrowthIncrement(MemorySegment struct, int fieldValue) {
        struct.set(LogGrowthIncrement$LAYOUT, LogGrowthIncrement$OFFSET, fieldValue);
    }

    private static final OfInt LogAutoShrinkPercentage$LAYOUT = (OfInt)$LAYOUT.select(groupElement("LogAutoShrinkPercentage"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD LogAutoShrinkPercentage
     * }
     */
    public static final OfInt LogAutoShrinkPercentage$layout() {
        return LogAutoShrinkPercentage$LAYOUT;
    }

    private static final long LogAutoShrinkPercentage$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD LogAutoShrinkPercentage
     * }
     */
    public static final long LogAutoShrinkPercentage$offset() {
        return LogAutoShrinkPercentage$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD LogAutoShrinkPercentage
     * }
     */
    public static int LogAutoShrinkPercentage(MemorySegment struct) {
        return struct.get(LogAutoShrinkPercentage$LAYOUT, LogAutoShrinkPercentage$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD LogAutoShrinkPercentage
     * }
     */
    public static void LogAutoShrinkPercentage(MemorySegment struct, int fieldValue) {
        struct.set(LogAutoShrinkPercentage$LAYOUT, LogAutoShrinkPercentage$OFFSET, fieldValue);
    }

    private static final OfInt Flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static final OfInt Flags$layout() {
        return Flags$LAYOUT;
    }

    private static final long Flags$OFFSET = 68;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static final long Flags$offset() {
        return Flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static int Flags(MemorySegment struct) {
        return struct.get(Flags$LAYOUT, Flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static void Flags(MemorySegment struct, int fieldValue) {
        struct.set(Flags$LAYOUT, Flags$OFFSET, fieldValue);
    }

    private static final OfShort LoggingMode$LAYOUT = (OfShort)$LAYOUT.select(groupElement("LoggingMode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD LoggingMode
     * }
     */
    public static final OfShort LoggingMode$layout() {
        return LoggingMode$LAYOUT;
    }

    private static final long LoggingMode$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD LoggingMode
     * }
     */
    public static final long LoggingMode$offset() {
        return LoggingMode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD LoggingMode
     * }
     */
    public static short LoggingMode(MemorySegment struct) {
        return struct.get(LoggingMode$LAYOUT, LoggingMode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD LoggingMode
     * }
     */
    public static void LoggingMode(MemorySegment struct, short fieldValue) {
        struct.set(LoggingMode$LAYOUT, LoggingMode$OFFSET, fieldValue);
    }

    private static final OfShort Reserved$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Reserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD Reserved
     * }
     */
    public static final OfShort Reserved$layout() {
        return Reserved$LAYOUT;
    }

    private static final long Reserved$OFFSET = 74;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD Reserved
     * }
     */
    public static final long Reserved$offset() {
        return Reserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD Reserved
     * }
     */
    public static short Reserved(MemorySegment struct) {
        return struct.get(Reserved$LAYOUT, Reserved$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD Reserved
     * }
     */
    public static void Reserved(MemorySegment struct, short fieldValue) {
        struct.set(Reserved$LAYOUT, Reserved$OFFSET, fieldValue);
    }

    private static final OfInt RmState$LAYOUT = (OfInt)$LAYOUT.select(groupElement("RmState"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD RmState
     * }
     */
    public static final OfInt RmState$layout() {
        return RmState$LAYOUT;
    }

    private static final long RmState$OFFSET = 76;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD RmState
     * }
     */
    public static final long RmState$offset() {
        return RmState$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD RmState
     * }
     */
    public static int RmState(MemorySegment struct) {
        return struct.get(RmState$LAYOUT, RmState$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD RmState
     * }
     */
    public static void RmState(MemorySegment struct, int fieldValue) {
        struct.set(RmState$LAYOUT, RmState$OFFSET, fieldValue);
    }

    private static final OfLong LogCapacity$LAYOUT = (OfLong)$LAYOUT.select(groupElement("LogCapacity"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG LogCapacity
     * }
     */
    public static final OfLong LogCapacity$layout() {
        return LogCapacity$LAYOUT;
    }

    private static final long LogCapacity$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG LogCapacity
     * }
     */
    public static final long LogCapacity$offset() {
        return LogCapacity$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG LogCapacity
     * }
     */
    public static long LogCapacity(MemorySegment struct) {
        return struct.get(LogCapacity$LAYOUT, LogCapacity$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG LogCapacity
     * }
     */
    public static void LogCapacity(MemorySegment struct, long fieldValue) {
        struct.set(LogCapacity$LAYOUT, LogCapacity$OFFSET, fieldValue);
    }

    private static final OfLong LogFree$LAYOUT = (OfLong)$LAYOUT.select(groupElement("LogFree"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG LogFree
     * }
     */
    public static final OfLong LogFree$layout() {
        return LogFree$LAYOUT;
    }

    private static final long LogFree$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG LogFree
     * }
     */
    public static final long LogFree$offset() {
        return LogFree$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG LogFree
     * }
     */
    public static long LogFree(MemorySegment struct) {
        return struct.get(LogFree$LAYOUT, LogFree$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG LogFree
     * }
     */
    public static void LogFree(MemorySegment struct, long fieldValue) {
        struct.set(LogFree$LAYOUT, LogFree$OFFSET, fieldValue);
    }

    private static final OfLong TopsSize$LAYOUT = (OfLong)$LAYOUT.select(groupElement("TopsSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG TopsSize
     * }
     */
    public static final OfLong TopsSize$layout() {
        return TopsSize$LAYOUT;
    }

    private static final long TopsSize$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG TopsSize
     * }
     */
    public static final long TopsSize$offset() {
        return TopsSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG TopsSize
     * }
     */
    public static long TopsSize(MemorySegment struct) {
        return struct.get(TopsSize$LAYOUT, TopsSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG TopsSize
     * }
     */
    public static void TopsSize(MemorySegment struct, long fieldValue) {
        struct.set(TopsSize$LAYOUT, TopsSize$OFFSET, fieldValue);
    }

    private static final OfLong TopsUsed$LAYOUT = (OfLong)$LAYOUT.select(groupElement("TopsUsed"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG TopsUsed
     * }
     */
    public static final OfLong TopsUsed$layout() {
        return TopsUsed$LAYOUT;
    }

    private static final long TopsUsed$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG TopsUsed
     * }
     */
    public static final long TopsUsed$offset() {
        return TopsUsed$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG TopsUsed
     * }
     */
    public static long TopsUsed(MemorySegment struct) {
        return struct.get(TopsUsed$LAYOUT, TopsUsed$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG TopsUsed
     * }
     */
    public static void TopsUsed(MemorySegment struct, long fieldValue) {
        struct.set(TopsUsed$LAYOUT, TopsUsed$OFFSET, fieldValue);
    }

    private static final OfLong TransactionCount$LAYOUT = (OfLong)$LAYOUT.select(groupElement("TransactionCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG TransactionCount
     * }
     */
    public static final OfLong TransactionCount$layout() {
        return TransactionCount$LAYOUT;
    }

    private static final long TransactionCount$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG TransactionCount
     * }
     */
    public static final long TransactionCount$offset() {
        return TransactionCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG TransactionCount
     * }
     */
    public static long TransactionCount(MemorySegment struct) {
        return struct.get(TransactionCount$LAYOUT, TransactionCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG TransactionCount
     * }
     */
    public static void TransactionCount(MemorySegment struct, long fieldValue) {
        struct.set(TransactionCount$LAYOUT, TransactionCount$OFFSET, fieldValue);
    }

    private static final OfLong OnePCCount$LAYOUT = (OfLong)$LAYOUT.select(groupElement("OnePCCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG OnePCCount
     * }
     */
    public static final OfLong OnePCCount$layout() {
        return OnePCCount$LAYOUT;
    }

    private static final long OnePCCount$OFFSET = 120;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG OnePCCount
     * }
     */
    public static final long OnePCCount$offset() {
        return OnePCCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG OnePCCount
     * }
     */
    public static long OnePCCount(MemorySegment struct) {
        return struct.get(OnePCCount$LAYOUT, OnePCCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG OnePCCount
     * }
     */
    public static void OnePCCount(MemorySegment struct, long fieldValue) {
        struct.set(OnePCCount$LAYOUT, OnePCCount$OFFSET, fieldValue);
    }

    private static final OfLong TwoPCCount$LAYOUT = (OfLong)$LAYOUT.select(groupElement("TwoPCCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG TwoPCCount
     * }
     */
    public static final OfLong TwoPCCount$layout() {
        return TwoPCCount$LAYOUT;
    }

    private static final long TwoPCCount$OFFSET = 128;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG TwoPCCount
     * }
     */
    public static final long TwoPCCount$offset() {
        return TwoPCCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG TwoPCCount
     * }
     */
    public static long TwoPCCount(MemorySegment struct) {
        return struct.get(TwoPCCount$LAYOUT, TwoPCCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG TwoPCCount
     * }
     */
    public static void TwoPCCount(MemorySegment struct, long fieldValue) {
        struct.set(TwoPCCount$LAYOUT, TwoPCCount$OFFSET, fieldValue);
    }

    private static final OfLong NumberLogFileFull$LAYOUT = (OfLong)$LAYOUT.select(groupElement("NumberLogFileFull"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG NumberLogFileFull
     * }
     */
    public static final OfLong NumberLogFileFull$layout() {
        return NumberLogFileFull$LAYOUT;
    }

    private static final long NumberLogFileFull$OFFSET = 136;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG NumberLogFileFull
     * }
     */
    public static final long NumberLogFileFull$offset() {
        return NumberLogFileFull$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG NumberLogFileFull
     * }
     */
    public static long NumberLogFileFull(MemorySegment struct) {
        return struct.get(NumberLogFileFull$LAYOUT, NumberLogFileFull$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG NumberLogFileFull
     * }
     */
    public static void NumberLogFileFull(MemorySegment struct, long fieldValue) {
        struct.set(NumberLogFileFull$LAYOUT, NumberLogFileFull$OFFSET, fieldValue);
    }

    private static final OfLong OldestTransactionAge$LAYOUT = (OfLong)$LAYOUT.select(groupElement("OldestTransactionAge"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG OldestTransactionAge
     * }
     */
    public static final OfLong OldestTransactionAge$layout() {
        return OldestTransactionAge$LAYOUT;
    }

    private static final long OldestTransactionAge$OFFSET = 144;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG OldestTransactionAge
     * }
     */
    public static final long OldestTransactionAge$offset() {
        return OldestTransactionAge$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG OldestTransactionAge
     * }
     */
    public static long OldestTransactionAge(MemorySegment struct) {
        return struct.get(OldestTransactionAge$LAYOUT, OldestTransactionAge$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG OldestTransactionAge
     * }
     */
    public static void OldestTransactionAge(MemorySegment struct, long fieldValue) {
        struct.set(OldestTransactionAge$LAYOUT, OldestTransactionAge$OFFSET, fieldValue);
    }

    private static final GroupLayout RMName$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("RMName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GUID RMName
     * }
     */
    public static final GroupLayout RMName$layout() {
        return RMName$LAYOUT;
    }

    private static final long RMName$OFFSET = 152;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GUID RMName
     * }
     */
    public static final long RMName$offset() {
        return RMName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GUID RMName
     * }
     */
    public static MemorySegment RMName(MemorySegment struct) {
        return struct.asSlice(RMName$OFFSET, RMName$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GUID RMName
     * }
     */
    public static void RMName(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, RMName$OFFSET, RMName$LAYOUT.byteSize());
    }

    private static final OfInt TmLogPathOffset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("TmLogPathOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD TmLogPathOffset
     * }
     */
    public static final OfInt TmLogPathOffset$layout() {
        return TmLogPathOffset$LAYOUT;
    }

    private static final long TmLogPathOffset$OFFSET = 168;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD TmLogPathOffset
     * }
     */
    public static final long TmLogPathOffset$offset() {
        return TmLogPathOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD TmLogPathOffset
     * }
     */
    public static int TmLogPathOffset(MemorySegment struct) {
        return struct.get(TmLogPathOffset$LAYOUT, TmLogPathOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD TmLogPathOffset
     * }
     */
    public static void TmLogPathOffset(MemorySegment struct, int fieldValue) {
        struct.set(TmLogPathOffset$LAYOUT, TmLogPathOffset$OFFSET, fieldValue);
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

