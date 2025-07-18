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
 * struct _SYSTEM_POWER_SOURCE_STATE {
 *     SYSTEM_BATTERY_STATE BatteryState;
 *     DWORD InstantaneousPeakPower;
 *     DWORD InstantaneousPeakPeriod;
 *     DWORD SustainablePeakPower;
 *     DWORD SustainablePeakPeriod;
 *     DWORD PeakPower;
 *     DWORD MaxOutputPower;
 *     DWORD MaxInputPower;
 *     LONG BatteryRateInCurrent;
 *     DWORD BatteryVoltage;
 * }
 * }
 */
public class _SYSTEM_POWER_SOURCE_STATE {

    _SYSTEM_POWER_SOURCE_STATE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        SYSTEM_BATTERY_STATE.layout().withName("BatteryState"),
        winapi.C_LONG.withName("InstantaneousPeakPower"),
        winapi.C_LONG.withName("InstantaneousPeakPeriod"),
        winapi.C_LONG.withName("SustainablePeakPower"),
        winapi.C_LONG.withName("SustainablePeakPeriod"),
        winapi.C_LONG.withName("PeakPower"),
        winapi.C_LONG.withName("MaxOutputPower"),
        winapi.C_LONG.withName("MaxInputPower"),
        winapi.C_LONG.withName("BatteryRateInCurrent"),
        winapi.C_LONG.withName("BatteryVoltage")
    ).withName("_SYSTEM_POWER_SOURCE_STATE");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout BatteryState$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("BatteryState"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SYSTEM_BATTERY_STATE BatteryState
     * }
     */
    public static final GroupLayout BatteryState$layout() {
        return BatteryState$LAYOUT;
    }

    private static final long BatteryState$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SYSTEM_BATTERY_STATE BatteryState
     * }
     */
    public static final long BatteryState$offset() {
        return BatteryState$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SYSTEM_BATTERY_STATE BatteryState
     * }
     */
    public static MemorySegment BatteryState(MemorySegment struct) {
        return struct.asSlice(BatteryState$OFFSET, BatteryState$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SYSTEM_BATTERY_STATE BatteryState
     * }
     */
    public static void BatteryState(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, BatteryState$OFFSET, BatteryState$LAYOUT.byteSize());
    }

    private static final OfInt InstantaneousPeakPower$LAYOUT = (OfInt)$LAYOUT.select(groupElement("InstantaneousPeakPower"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD InstantaneousPeakPower
     * }
     */
    public static final OfInt InstantaneousPeakPower$layout() {
        return InstantaneousPeakPower$LAYOUT;
    }

    private static final long InstantaneousPeakPower$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD InstantaneousPeakPower
     * }
     */
    public static final long InstantaneousPeakPower$offset() {
        return InstantaneousPeakPower$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD InstantaneousPeakPower
     * }
     */
    public static int InstantaneousPeakPower(MemorySegment struct) {
        return struct.get(InstantaneousPeakPower$LAYOUT, InstantaneousPeakPower$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD InstantaneousPeakPower
     * }
     */
    public static void InstantaneousPeakPower(MemorySegment struct, int fieldValue) {
        struct.set(InstantaneousPeakPower$LAYOUT, InstantaneousPeakPower$OFFSET, fieldValue);
    }

    private static final OfInt InstantaneousPeakPeriod$LAYOUT = (OfInt)$LAYOUT.select(groupElement("InstantaneousPeakPeriod"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD InstantaneousPeakPeriod
     * }
     */
    public static final OfInt InstantaneousPeakPeriod$layout() {
        return InstantaneousPeakPeriod$LAYOUT;
    }

    private static final long InstantaneousPeakPeriod$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD InstantaneousPeakPeriod
     * }
     */
    public static final long InstantaneousPeakPeriod$offset() {
        return InstantaneousPeakPeriod$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD InstantaneousPeakPeriod
     * }
     */
    public static int InstantaneousPeakPeriod(MemorySegment struct) {
        return struct.get(InstantaneousPeakPeriod$LAYOUT, InstantaneousPeakPeriod$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD InstantaneousPeakPeriod
     * }
     */
    public static void InstantaneousPeakPeriod(MemorySegment struct, int fieldValue) {
        struct.set(InstantaneousPeakPeriod$LAYOUT, InstantaneousPeakPeriod$OFFSET, fieldValue);
    }

    private static final OfInt SustainablePeakPower$LAYOUT = (OfInt)$LAYOUT.select(groupElement("SustainablePeakPower"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD SustainablePeakPower
     * }
     */
    public static final OfInt SustainablePeakPower$layout() {
        return SustainablePeakPower$LAYOUT;
    }

    private static final long SustainablePeakPower$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD SustainablePeakPower
     * }
     */
    public static final long SustainablePeakPower$offset() {
        return SustainablePeakPower$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD SustainablePeakPower
     * }
     */
    public static int SustainablePeakPower(MemorySegment struct) {
        return struct.get(SustainablePeakPower$LAYOUT, SustainablePeakPower$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD SustainablePeakPower
     * }
     */
    public static void SustainablePeakPower(MemorySegment struct, int fieldValue) {
        struct.set(SustainablePeakPower$LAYOUT, SustainablePeakPower$OFFSET, fieldValue);
    }

    private static final OfInt SustainablePeakPeriod$LAYOUT = (OfInt)$LAYOUT.select(groupElement("SustainablePeakPeriod"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD SustainablePeakPeriod
     * }
     */
    public static final OfInt SustainablePeakPeriod$layout() {
        return SustainablePeakPeriod$LAYOUT;
    }

    private static final long SustainablePeakPeriod$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD SustainablePeakPeriod
     * }
     */
    public static final long SustainablePeakPeriod$offset() {
        return SustainablePeakPeriod$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD SustainablePeakPeriod
     * }
     */
    public static int SustainablePeakPeriod(MemorySegment struct) {
        return struct.get(SustainablePeakPeriod$LAYOUT, SustainablePeakPeriod$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD SustainablePeakPeriod
     * }
     */
    public static void SustainablePeakPeriod(MemorySegment struct, int fieldValue) {
        struct.set(SustainablePeakPeriod$LAYOUT, SustainablePeakPeriod$OFFSET, fieldValue);
    }

    private static final OfInt PeakPower$LAYOUT = (OfInt)$LAYOUT.select(groupElement("PeakPower"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD PeakPower
     * }
     */
    public static final OfInt PeakPower$layout() {
        return PeakPower$LAYOUT;
    }

    private static final long PeakPower$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD PeakPower
     * }
     */
    public static final long PeakPower$offset() {
        return PeakPower$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD PeakPower
     * }
     */
    public static int PeakPower(MemorySegment struct) {
        return struct.get(PeakPower$LAYOUT, PeakPower$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD PeakPower
     * }
     */
    public static void PeakPower(MemorySegment struct, int fieldValue) {
        struct.set(PeakPower$LAYOUT, PeakPower$OFFSET, fieldValue);
    }

    private static final OfInt MaxOutputPower$LAYOUT = (OfInt)$LAYOUT.select(groupElement("MaxOutputPower"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD MaxOutputPower
     * }
     */
    public static final OfInt MaxOutputPower$layout() {
        return MaxOutputPower$LAYOUT;
    }

    private static final long MaxOutputPower$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD MaxOutputPower
     * }
     */
    public static final long MaxOutputPower$offset() {
        return MaxOutputPower$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD MaxOutputPower
     * }
     */
    public static int MaxOutputPower(MemorySegment struct) {
        return struct.get(MaxOutputPower$LAYOUT, MaxOutputPower$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD MaxOutputPower
     * }
     */
    public static void MaxOutputPower(MemorySegment struct, int fieldValue) {
        struct.set(MaxOutputPower$LAYOUT, MaxOutputPower$OFFSET, fieldValue);
    }

    private static final OfInt MaxInputPower$LAYOUT = (OfInt)$LAYOUT.select(groupElement("MaxInputPower"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD MaxInputPower
     * }
     */
    public static final OfInt MaxInputPower$layout() {
        return MaxInputPower$LAYOUT;
    }

    private static final long MaxInputPower$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD MaxInputPower
     * }
     */
    public static final long MaxInputPower$offset() {
        return MaxInputPower$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD MaxInputPower
     * }
     */
    public static int MaxInputPower(MemorySegment struct) {
        return struct.get(MaxInputPower$LAYOUT, MaxInputPower$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD MaxInputPower
     * }
     */
    public static void MaxInputPower(MemorySegment struct, int fieldValue) {
        struct.set(MaxInputPower$LAYOUT, MaxInputPower$OFFSET, fieldValue);
    }

    private static final OfInt BatteryRateInCurrent$LAYOUT = (OfInt)$LAYOUT.select(groupElement("BatteryRateInCurrent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG BatteryRateInCurrent
     * }
     */
    public static final OfInt BatteryRateInCurrent$layout() {
        return BatteryRateInCurrent$LAYOUT;
    }

    private static final long BatteryRateInCurrent$OFFSET = 60;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG BatteryRateInCurrent
     * }
     */
    public static final long BatteryRateInCurrent$offset() {
        return BatteryRateInCurrent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG BatteryRateInCurrent
     * }
     */
    public static int BatteryRateInCurrent(MemorySegment struct) {
        return struct.get(BatteryRateInCurrent$LAYOUT, BatteryRateInCurrent$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG BatteryRateInCurrent
     * }
     */
    public static void BatteryRateInCurrent(MemorySegment struct, int fieldValue) {
        struct.set(BatteryRateInCurrent$LAYOUT, BatteryRateInCurrent$OFFSET, fieldValue);
    }

    private static final OfInt BatteryVoltage$LAYOUT = (OfInt)$LAYOUT.select(groupElement("BatteryVoltage"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD BatteryVoltage
     * }
     */
    public static final OfInt BatteryVoltage$layout() {
        return BatteryVoltage$LAYOUT;
    }

    private static final long BatteryVoltage$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD BatteryVoltage
     * }
     */
    public static final long BatteryVoltage$offset() {
        return BatteryVoltage$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD BatteryVoltage
     * }
     */
    public static int BatteryVoltage(MemorySegment struct) {
        return struct.get(BatteryVoltage$LAYOUT, BatteryVoltage$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD BatteryVoltage
     * }
     */
    public static void BatteryVoltage(MemorySegment struct, int fieldValue) {
        struct.set(BatteryVoltage$LAYOUT, BatteryVoltage$OFFSET, fieldValue);
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

