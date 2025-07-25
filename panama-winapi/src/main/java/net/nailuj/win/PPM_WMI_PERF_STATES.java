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
 *     DWORD Count;
 *     DWORD MaxFrequency;
 *     DWORD CurrentState;
 *     DWORD MaxPerfState;
 *     DWORD MinPerfState;
 *     DWORD LowestPerfState;
 *     DWORD ThermalConstraint;
 *     BYTE BusyAdjThreshold;
 *     BYTE PolicyType;
 *     BYTE Type;
 *     BYTE Reserved;
 *     DWORD TimerInterval;
 *     DWORD64 TargetProcessors;
 *     DWORD PStateHandler;
 *     DWORD PStateContext;
 *     DWORD TStateHandler;
 *     DWORD TStateContext;
 *     DWORD FeedbackHandler;
 *     DWORD Reserved1;
 *     DWORD64 Reserved2;
 *     PPM_WMI_PERF_STATE State[1];
 * }
 * }
 */
public class PPM_WMI_PERF_STATES {

    PPM_WMI_PERF_STATES() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("Count"),
        winapi.C_LONG.withName("MaxFrequency"),
        winapi.C_LONG.withName("CurrentState"),
        winapi.C_LONG.withName("MaxPerfState"),
        winapi.C_LONG.withName("MinPerfState"),
        winapi.C_LONG.withName("LowestPerfState"),
        winapi.C_LONG.withName("ThermalConstraint"),
        winapi.C_CHAR.withName("BusyAdjThreshold"),
        winapi.C_CHAR.withName("PolicyType"),
        winapi.C_CHAR.withName("Type"),
        winapi.C_CHAR.withName("Reserved"),
        winapi.C_LONG.withName("TimerInterval"),
        MemoryLayout.paddingLayout(4),
        winapi.C_LONG_LONG.withName("TargetProcessors"),
        winapi.C_LONG.withName("PStateHandler"),
        winapi.C_LONG.withName("PStateContext"),
        winapi.C_LONG.withName("TStateHandler"),
        winapi.C_LONG.withName("TStateContext"),
        winapi.C_LONG.withName("FeedbackHandler"),
        winapi.C_LONG.withName("Reserved1"),
        winapi.C_LONG_LONG.withName("Reserved2"),
        MemoryLayout.sequenceLayout(1, PPM_WMI_PERF_STATE.layout()).withName("State")
    ).withName("$anon$18629:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Count$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Count"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Count
     * }
     */
    public static final OfInt Count$layout() {
        return Count$LAYOUT;
    }

    private static final long Count$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Count
     * }
     */
    public static final long Count$offset() {
        return Count$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Count
     * }
     */
    public static int Count(MemorySegment struct) {
        return struct.get(Count$LAYOUT, Count$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Count
     * }
     */
    public static void Count(MemorySegment struct, int fieldValue) {
        struct.set(Count$LAYOUT, Count$OFFSET, fieldValue);
    }

    private static final OfInt MaxFrequency$LAYOUT = (OfInt)$LAYOUT.select(groupElement("MaxFrequency"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD MaxFrequency
     * }
     */
    public static final OfInt MaxFrequency$layout() {
        return MaxFrequency$LAYOUT;
    }

    private static final long MaxFrequency$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD MaxFrequency
     * }
     */
    public static final long MaxFrequency$offset() {
        return MaxFrequency$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD MaxFrequency
     * }
     */
    public static int MaxFrequency(MemorySegment struct) {
        return struct.get(MaxFrequency$LAYOUT, MaxFrequency$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD MaxFrequency
     * }
     */
    public static void MaxFrequency(MemorySegment struct, int fieldValue) {
        struct.set(MaxFrequency$LAYOUT, MaxFrequency$OFFSET, fieldValue);
    }

    private static final OfInt CurrentState$LAYOUT = (OfInt)$LAYOUT.select(groupElement("CurrentState"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD CurrentState
     * }
     */
    public static final OfInt CurrentState$layout() {
        return CurrentState$LAYOUT;
    }

    private static final long CurrentState$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD CurrentState
     * }
     */
    public static final long CurrentState$offset() {
        return CurrentState$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD CurrentState
     * }
     */
    public static int CurrentState(MemorySegment struct) {
        return struct.get(CurrentState$LAYOUT, CurrentState$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD CurrentState
     * }
     */
    public static void CurrentState(MemorySegment struct, int fieldValue) {
        struct.set(CurrentState$LAYOUT, CurrentState$OFFSET, fieldValue);
    }

    private static final OfInt MaxPerfState$LAYOUT = (OfInt)$LAYOUT.select(groupElement("MaxPerfState"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD MaxPerfState
     * }
     */
    public static final OfInt MaxPerfState$layout() {
        return MaxPerfState$LAYOUT;
    }

    private static final long MaxPerfState$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD MaxPerfState
     * }
     */
    public static final long MaxPerfState$offset() {
        return MaxPerfState$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD MaxPerfState
     * }
     */
    public static int MaxPerfState(MemorySegment struct) {
        return struct.get(MaxPerfState$LAYOUT, MaxPerfState$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD MaxPerfState
     * }
     */
    public static void MaxPerfState(MemorySegment struct, int fieldValue) {
        struct.set(MaxPerfState$LAYOUT, MaxPerfState$OFFSET, fieldValue);
    }

    private static final OfInt MinPerfState$LAYOUT = (OfInt)$LAYOUT.select(groupElement("MinPerfState"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD MinPerfState
     * }
     */
    public static final OfInt MinPerfState$layout() {
        return MinPerfState$LAYOUT;
    }

    private static final long MinPerfState$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD MinPerfState
     * }
     */
    public static final long MinPerfState$offset() {
        return MinPerfState$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD MinPerfState
     * }
     */
    public static int MinPerfState(MemorySegment struct) {
        return struct.get(MinPerfState$LAYOUT, MinPerfState$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD MinPerfState
     * }
     */
    public static void MinPerfState(MemorySegment struct, int fieldValue) {
        struct.set(MinPerfState$LAYOUT, MinPerfState$OFFSET, fieldValue);
    }

    private static final OfInt LowestPerfState$LAYOUT = (OfInt)$LAYOUT.select(groupElement("LowestPerfState"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD LowestPerfState
     * }
     */
    public static final OfInt LowestPerfState$layout() {
        return LowestPerfState$LAYOUT;
    }

    private static final long LowestPerfState$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD LowestPerfState
     * }
     */
    public static final long LowestPerfState$offset() {
        return LowestPerfState$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD LowestPerfState
     * }
     */
    public static int LowestPerfState(MemorySegment struct) {
        return struct.get(LowestPerfState$LAYOUT, LowestPerfState$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD LowestPerfState
     * }
     */
    public static void LowestPerfState(MemorySegment struct, int fieldValue) {
        struct.set(LowestPerfState$LAYOUT, LowestPerfState$OFFSET, fieldValue);
    }

    private static final OfInt ThermalConstraint$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ThermalConstraint"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ThermalConstraint
     * }
     */
    public static final OfInt ThermalConstraint$layout() {
        return ThermalConstraint$LAYOUT;
    }

    private static final long ThermalConstraint$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ThermalConstraint
     * }
     */
    public static final long ThermalConstraint$offset() {
        return ThermalConstraint$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ThermalConstraint
     * }
     */
    public static int ThermalConstraint(MemorySegment struct) {
        return struct.get(ThermalConstraint$LAYOUT, ThermalConstraint$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ThermalConstraint
     * }
     */
    public static void ThermalConstraint(MemorySegment struct, int fieldValue) {
        struct.set(ThermalConstraint$LAYOUT, ThermalConstraint$OFFSET, fieldValue);
    }

    private static final OfByte BusyAdjThreshold$LAYOUT = (OfByte)$LAYOUT.select(groupElement("BusyAdjThreshold"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE BusyAdjThreshold
     * }
     */
    public static final OfByte BusyAdjThreshold$layout() {
        return BusyAdjThreshold$LAYOUT;
    }

    private static final long BusyAdjThreshold$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE BusyAdjThreshold
     * }
     */
    public static final long BusyAdjThreshold$offset() {
        return BusyAdjThreshold$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE BusyAdjThreshold
     * }
     */
    public static byte BusyAdjThreshold(MemorySegment struct) {
        return struct.get(BusyAdjThreshold$LAYOUT, BusyAdjThreshold$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE BusyAdjThreshold
     * }
     */
    public static void BusyAdjThreshold(MemorySegment struct, byte fieldValue) {
        struct.set(BusyAdjThreshold$LAYOUT, BusyAdjThreshold$OFFSET, fieldValue);
    }

    private static final OfByte PolicyType$LAYOUT = (OfByte)$LAYOUT.select(groupElement("PolicyType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE PolicyType
     * }
     */
    public static final OfByte PolicyType$layout() {
        return PolicyType$LAYOUT;
    }

    private static final long PolicyType$OFFSET = 29;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE PolicyType
     * }
     */
    public static final long PolicyType$offset() {
        return PolicyType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE PolicyType
     * }
     */
    public static byte PolicyType(MemorySegment struct) {
        return struct.get(PolicyType$LAYOUT, PolicyType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE PolicyType
     * }
     */
    public static void PolicyType(MemorySegment struct, byte fieldValue) {
        struct.set(PolicyType$LAYOUT, PolicyType$OFFSET, fieldValue);
    }

    private static final OfByte Type$LAYOUT = (OfByte)$LAYOUT.select(groupElement("Type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Type
     * }
     */
    public static final OfByte Type$layout() {
        return Type$LAYOUT;
    }

    private static final long Type$OFFSET = 30;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Type
     * }
     */
    public static final long Type$offset() {
        return Type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Type
     * }
     */
    public static byte Type(MemorySegment struct) {
        return struct.get(Type$LAYOUT, Type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Type
     * }
     */
    public static void Type(MemorySegment struct, byte fieldValue) {
        struct.set(Type$LAYOUT, Type$OFFSET, fieldValue);
    }

    private static final OfByte Reserved$LAYOUT = (OfByte)$LAYOUT.select(groupElement("Reserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Reserved
     * }
     */
    public static final OfByte Reserved$layout() {
        return Reserved$LAYOUT;
    }

    private static final long Reserved$OFFSET = 31;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Reserved
     * }
     */
    public static final long Reserved$offset() {
        return Reserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Reserved
     * }
     */
    public static byte Reserved(MemorySegment struct) {
        return struct.get(Reserved$LAYOUT, Reserved$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Reserved
     * }
     */
    public static void Reserved(MemorySegment struct, byte fieldValue) {
        struct.set(Reserved$LAYOUT, Reserved$OFFSET, fieldValue);
    }

    private static final OfInt TimerInterval$LAYOUT = (OfInt)$LAYOUT.select(groupElement("TimerInterval"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD TimerInterval
     * }
     */
    public static final OfInt TimerInterval$layout() {
        return TimerInterval$LAYOUT;
    }

    private static final long TimerInterval$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD TimerInterval
     * }
     */
    public static final long TimerInterval$offset() {
        return TimerInterval$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD TimerInterval
     * }
     */
    public static int TimerInterval(MemorySegment struct) {
        return struct.get(TimerInterval$LAYOUT, TimerInterval$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD TimerInterval
     * }
     */
    public static void TimerInterval(MemorySegment struct, int fieldValue) {
        struct.set(TimerInterval$LAYOUT, TimerInterval$OFFSET, fieldValue);
    }

    private static final OfLong TargetProcessors$LAYOUT = (OfLong)$LAYOUT.select(groupElement("TargetProcessors"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD64 TargetProcessors
     * }
     */
    public static final OfLong TargetProcessors$layout() {
        return TargetProcessors$LAYOUT;
    }

    private static final long TargetProcessors$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD64 TargetProcessors
     * }
     */
    public static final long TargetProcessors$offset() {
        return TargetProcessors$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD64 TargetProcessors
     * }
     */
    public static long TargetProcessors(MemorySegment struct) {
        return struct.get(TargetProcessors$LAYOUT, TargetProcessors$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD64 TargetProcessors
     * }
     */
    public static void TargetProcessors(MemorySegment struct, long fieldValue) {
        struct.set(TargetProcessors$LAYOUT, TargetProcessors$OFFSET, fieldValue);
    }

    private static final OfInt PStateHandler$LAYOUT = (OfInt)$LAYOUT.select(groupElement("PStateHandler"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD PStateHandler
     * }
     */
    public static final OfInt PStateHandler$layout() {
        return PStateHandler$LAYOUT;
    }

    private static final long PStateHandler$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD PStateHandler
     * }
     */
    public static final long PStateHandler$offset() {
        return PStateHandler$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD PStateHandler
     * }
     */
    public static int PStateHandler(MemorySegment struct) {
        return struct.get(PStateHandler$LAYOUT, PStateHandler$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD PStateHandler
     * }
     */
    public static void PStateHandler(MemorySegment struct, int fieldValue) {
        struct.set(PStateHandler$LAYOUT, PStateHandler$OFFSET, fieldValue);
    }

    private static final OfInt PStateContext$LAYOUT = (OfInt)$LAYOUT.select(groupElement("PStateContext"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD PStateContext
     * }
     */
    public static final OfInt PStateContext$layout() {
        return PStateContext$LAYOUT;
    }

    private static final long PStateContext$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD PStateContext
     * }
     */
    public static final long PStateContext$offset() {
        return PStateContext$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD PStateContext
     * }
     */
    public static int PStateContext(MemorySegment struct) {
        return struct.get(PStateContext$LAYOUT, PStateContext$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD PStateContext
     * }
     */
    public static void PStateContext(MemorySegment struct, int fieldValue) {
        struct.set(PStateContext$LAYOUT, PStateContext$OFFSET, fieldValue);
    }

    private static final OfInt TStateHandler$LAYOUT = (OfInt)$LAYOUT.select(groupElement("TStateHandler"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD TStateHandler
     * }
     */
    public static final OfInt TStateHandler$layout() {
        return TStateHandler$LAYOUT;
    }

    private static final long TStateHandler$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD TStateHandler
     * }
     */
    public static final long TStateHandler$offset() {
        return TStateHandler$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD TStateHandler
     * }
     */
    public static int TStateHandler(MemorySegment struct) {
        return struct.get(TStateHandler$LAYOUT, TStateHandler$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD TStateHandler
     * }
     */
    public static void TStateHandler(MemorySegment struct, int fieldValue) {
        struct.set(TStateHandler$LAYOUT, TStateHandler$OFFSET, fieldValue);
    }

    private static final OfInt TStateContext$LAYOUT = (OfInt)$LAYOUT.select(groupElement("TStateContext"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD TStateContext
     * }
     */
    public static final OfInt TStateContext$layout() {
        return TStateContext$LAYOUT;
    }

    private static final long TStateContext$OFFSET = 60;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD TStateContext
     * }
     */
    public static final long TStateContext$offset() {
        return TStateContext$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD TStateContext
     * }
     */
    public static int TStateContext(MemorySegment struct) {
        return struct.get(TStateContext$LAYOUT, TStateContext$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD TStateContext
     * }
     */
    public static void TStateContext(MemorySegment struct, int fieldValue) {
        struct.set(TStateContext$LAYOUT, TStateContext$OFFSET, fieldValue);
    }

    private static final OfInt FeedbackHandler$LAYOUT = (OfInt)$LAYOUT.select(groupElement("FeedbackHandler"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD FeedbackHandler
     * }
     */
    public static final OfInt FeedbackHandler$layout() {
        return FeedbackHandler$LAYOUT;
    }

    private static final long FeedbackHandler$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD FeedbackHandler
     * }
     */
    public static final long FeedbackHandler$offset() {
        return FeedbackHandler$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD FeedbackHandler
     * }
     */
    public static int FeedbackHandler(MemorySegment struct) {
        return struct.get(FeedbackHandler$LAYOUT, FeedbackHandler$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD FeedbackHandler
     * }
     */
    public static void FeedbackHandler(MemorySegment struct, int fieldValue) {
        struct.set(FeedbackHandler$LAYOUT, FeedbackHandler$OFFSET, fieldValue);
    }

    private static final OfInt Reserved1$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Reserved1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Reserved1
     * }
     */
    public static final OfInt Reserved1$layout() {
        return Reserved1$LAYOUT;
    }

    private static final long Reserved1$OFFSET = 68;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Reserved1
     * }
     */
    public static final long Reserved1$offset() {
        return Reserved1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Reserved1
     * }
     */
    public static int Reserved1(MemorySegment struct) {
        return struct.get(Reserved1$LAYOUT, Reserved1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Reserved1
     * }
     */
    public static void Reserved1(MemorySegment struct, int fieldValue) {
        struct.set(Reserved1$LAYOUT, Reserved1$OFFSET, fieldValue);
    }

    private static final OfLong Reserved2$LAYOUT = (OfLong)$LAYOUT.select(groupElement("Reserved2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD64 Reserved2
     * }
     */
    public static final OfLong Reserved2$layout() {
        return Reserved2$LAYOUT;
    }

    private static final long Reserved2$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD64 Reserved2
     * }
     */
    public static final long Reserved2$offset() {
        return Reserved2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD64 Reserved2
     * }
     */
    public static long Reserved2(MemorySegment struct) {
        return struct.get(Reserved2$LAYOUT, Reserved2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD64 Reserved2
     * }
     */
    public static void Reserved2(MemorySegment struct, long fieldValue) {
        struct.set(Reserved2$LAYOUT, Reserved2$OFFSET, fieldValue);
    }

    private static final SequenceLayout State$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("State"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PPM_WMI_PERF_STATE State[1]
     * }
     */
    public static final SequenceLayout State$layout() {
        return State$LAYOUT;
    }

    private static final long State$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PPM_WMI_PERF_STATE State[1]
     * }
     */
    public static final long State$offset() {
        return State$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PPM_WMI_PERF_STATE State[1]
     * }
     */
    public static MemorySegment State(MemorySegment struct) {
        return struct.asSlice(State$OFFSET, State$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PPM_WMI_PERF_STATE State[1]
     * }
     */
    public static void State(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, State$OFFSET, State$LAYOUT.byteSize());
    }

    private static long[] State$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * PPM_WMI_PERF_STATE State[1]
     * }
     */
    public static long[] State$dimensions() {
        return State$DIMS;
    }
    private static final MethodHandle State$ELEM_HANDLE = State$LAYOUT.sliceHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * PPM_WMI_PERF_STATE State[1]
     * }
     */
    public static MemorySegment State(MemorySegment struct, long index0) {
        try {
            return (MemorySegment)State$ELEM_HANDLE.invokeExact(struct, 0L, index0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * PPM_WMI_PERF_STATE State[1]
     * }
     */
    public static void State(MemorySegment struct, long index0, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, State(struct, index0), 0L, PPM_WMI_PERF_STATE.layout().byteSize());
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

