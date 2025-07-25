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
 * struct JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V2 {
 *     LONG64 MaxIops;
 *     LONG64 MaxBandwidth;
 *     LONG64 ReservationIops;
 *     PWSTR VolumeName;
 *     DWORD BaseIoSize;
 *     JOB_OBJECT_IO_RATE_CONTROL_FLAGS ControlFlags;
 *     WORD VolumeNameLength;
 *     LONG64 CriticalReservationIops;
 *     LONG64 ReservationBandwidth;
 *     LONG64 CriticalReservationBandwidth;
 *     LONG64 MaxTimePercent;
 *     LONG64 ReservationTimePercent;
 *     LONG64 CriticalReservationTimePercent;
 * }
 * }
 */
public class JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V2 {

    JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V2() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG_LONG.withName("MaxIops"),
        winapi.C_LONG_LONG.withName("MaxBandwidth"),
        winapi.C_LONG_LONG.withName("ReservationIops"),
        winapi.C_POINTER.withName("VolumeName"),
        winapi.C_LONG.withName("BaseIoSize"),
        winapi.C_INT.withName("ControlFlags"),
        winapi.C_SHORT.withName("VolumeNameLength"),
        MemoryLayout.paddingLayout(6),
        winapi.C_LONG_LONG.withName("CriticalReservationIops"),
        winapi.C_LONG_LONG.withName("ReservationBandwidth"),
        winapi.C_LONG_LONG.withName("CriticalReservationBandwidth"),
        winapi.C_LONG_LONG.withName("MaxTimePercent"),
        winapi.C_LONG_LONG.withName("ReservationTimePercent"),
        winapi.C_LONG_LONG.withName("CriticalReservationTimePercent")
    ).withName("JOBOBJECT_IO_RATE_CONTROL_INFORMATION_NATIVE_V2");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong MaxIops$LAYOUT = (OfLong)$LAYOUT.select(groupElement("MaxIops"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG64 MaxIops
     * }
     */
    public static final OfLong MaxIops$layout() {
        return MaxIops$LAYOUT;
    }

    private static final long MaxIops$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG64 MaxIops
     * }
     */
    public static final long MaxIops$offset() {
        return MaxIops$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG64 MaxIops
     * }
     */
    public static long MaxIops(MemorySegment struct) {
        return struct.get(MaxIops$LAYOUT, MaxIops$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG64 MaxIops
     * }
     */
    public static void MaxIops(MemorySegment struct, long fieldValue) {
        struct.set(MaxIops$LAYOUT, MaxIops$OFFSET, fieldValue);
    }

    private static final OfLong MaxBandwidth$LAYOUT = (OfLong)$LAYOUT.select(groupElement("MaxBandwidth"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG64 MaxBandwidth
     * }
     */
    public static final OfLong MaxBandwidth$layout() {
        return MaxBandwidth$LAYOUT;
    }

    private static final long MaxBandwidth$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG64 MaxBandwidth
     * }
     */
    public static final long MaxBandwidth$offset() {
        return MaxBandwidth$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG64 MaxBandwidth
     * }
     */
    public static long MaxBandwidth(MemorySegment struct) {
        return struct.get(MaxBandwidth$LAYOUT, MaxBandwidth$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG64 MaxBandwidth
     * }
     */
    public static void MaxBandwidth(MemorySegment struct, long fieldValue) {
        struct.set(MaxBandwidth$LAYOUT, MaxBandwidth$OFFSET, fieldValue);
    }

    private static final OfLong ReservationIops$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ReservationIops"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG64 ReservationIops
     * }
     */
    public static final OfLong ReservationIops$layout() {
        return ReservationIops$LAYOUT;
    }

    private static final long ReservationIops$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG64 ReservationIops
     * }
     */
    public static final long ReservationIops$offset() {
        return ReservationIops$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG64 ReservationIops
     * }
     */
    public static long ReservationIops(MemorySegment struct) {
        return struct.get(ReservationIops$LAYOUT, ReservationIops$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG64 ReservationIops
     * }
     */
    public static void ReservationIops(MemorySegment struct, long fieldValue) {
        struct.set(ReservationIops$LAYOUT, ReservationIops$OFFSET, fieldValue);
    }

    private static final AddressLayout VolumeName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("VolumeName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PWSTR VolumeName
     * }
     */
    public static final AddressLayout VolumeName$layout() {
        return VolumeName$LAYOUT;
    }

    private static final long VolumeName$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PWSTR VolumeName
     * }
     */
    public static final long VolumeName$offset() {
        return VolumeName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PWSTR VolumeName
     * }
     */
    public static MemorySegment VolumeName(MemorySegment struct) {
        return struct.get(VolumeName$LAYOUT, VolumeName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PWSTR VolumeName
     * }
     */
    public static void VolumeName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(VolumeName$LAYOUT, VolumeName$OFFSET, fieldValue);
    }

    private static final OfInt BaseIoSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("BaseIoSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD BaseIoSize
     * }
     */
    public static final OfInt BaseIoSize$layout() {
        return BaseIoSize$LAYOUT;
    }

    private static final long BaseIoSize$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD BaseIoSize
     * }
     */
    public static final long BaseIoSize$offset() {
        return BaseIoSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD BaseIoSize
     * }
     */
    public static int BaseIoSize(MemorySegment struct) {
        return struct.get(BaseIoSize$LAYOUT, BaseIoSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD BaseIoSize
     * }
     */
    public static void BaseIoSize(MemorySegment struct, int fieldValue) {
        struct.set(BaseIoSize$LAYOUT, BaseIoSize$OFFSET, fieldValue);
    }

    private static final OfInt ControlFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ControlFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * JOB_OBJECT_IO_RATE_CONTROL_FLAGS ControlFlags
     * }
     */
    public static final OfInt ControlFlags$layout() {
        return ControlFlags$LAYOUT;
    }

    private static final long ControlFlags$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * JOB_OBJECT_IO_RATE_CONTROL_FLAGS ControlFlags
     * }
     */
    public static final long ControlFlags$offset() {
        return ControlFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * JOB_OBJECT_IO_RATE_CONTROL_FLAGS ControlFlags
     * }
     */
    public static int ControlFlags(MemorySegment struct) {
        return struct.get(ControlFlags$LAYOUT, ControlFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * JOB_OBJECT_IO_RATE_CONTROL_FLAGS ControlFlags
     * }
     */
    public static void ControlFlags(MemorySegment struct, int fieldValue) {
        struct.set(ControlFlags$LAYOUT, ControlFlags$OFFSET, fieldValue);
    }

    private static final OfShort VolumeNameLength$LAYOUT = (OfShort)$LAYOUT.select(groupElement("VolumeNameLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD VolumeNameLength
     * }
     */
    public static final OfShort VolumeNameLength$layout() {
        return VolumeNameLength$LAYOUT;
    }

    private static final long VolumeNameLength$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD VolumeNameLength
     * }
     */
    public static final long VolumeNameLength$offset() {
        return VolumeNameLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD VolumeNameLength
     * }
     */
    public static short VolumeNameLength(MemorySegment struct) {
        return struct.get(VolumeNameLength$LAYOUT, VolumeNameLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD VolumeNameLength
     * }
     */
    public static void VolumeNameLength(MemorySegment struct, short fieldValue) {
        struct.set(VolumeNameLength$LAYOUT, VolumeNameLength$OFFSET, fieldValue);
    }

    private static final OfLong CriticalReservationIops$LAYOUT = (OfLong)$LAYOUT.select(groupElement("CriticalReservationIops"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG64 CriticalReservationIops
     * }
     */
    public static final OfLong CriticalReservationIops$layout() {
        return CriticalReservationIops$LAYOUT;
    }

    private static final long CriticalReservationIops$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG64 CriticalReservationIops
     * }
     */
    public static final long CriticalReservationIops$offset() {
        return CriticalReservationIops$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG64 CriticalReservationIops
     * }
     */
    public static long CriticalReservationIops(MemorySegment struct) {
        return struct.get(CriticalReservationIops$LAYOUT, CriticalReservationIops$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG64 CriticalReservationIops
     * }
     */
    public static void CriticalReservationIops(MemorySegment struct, long fieldValue) {
        struct.set(CriticalReservationIops$LAYOUT, CriticalReservationIops$OFFSET, fieldValue);
    }

    private static final OfLong ReservationBandwidth$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ReservationBandwidth"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG64 ReservationBandwidth
     * }
     */
    public static final OfLong ReservationBandwidth$layout() {
        return ReservationBandwidth$LAYOUT;
    }

    private static final long ReservationBandwidth$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG64 ReservationBandwidth
     * }
     */
    public static final long ReservationBandwidth$offset() {
        return ReservationBandwidth$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG64 ReservationBandwidth
     * }
     */
    public static long ReservationBandwidth(MemorySegment struct) {
        return struct.get(ReservationBandwidth$LAYOUT, ReservationBandwidth$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG64 ReservationBandwidth
     * }
     */
    public static void ReservationBandwidth(MemorySegment struct, long fieldValue) {
        struct.set(ReservationBandwidth$LAYOUT, ReservationBandwidth$OFFSET, fieldValue);
    }

    private static final OfLong CriticalReservationBandwidth$LAYOUT = (OfLong)$LAYOUT.select(groupElement("CriticalReservationBandwidth"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG64 CriticalReservationBandwidth
     * }
     */
    public static final OfLong CriticalReservationBandwidth$layout() {
        return CriticalReservationBandwidth$LAYOUT;
    }

    private static final long CriticalReservationBandwidth$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG64 CriticalReservationBandwidth
     * }
     */
    public static final long CriticalReservationBandwidth$offset() {
        return CriticalReservationBandwidth$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG64 CriticalReservationBandwidth
     * }
     */
    public static long CriticalReservationBandwidth(MemorySegment struct) {
        return struct.get(CriticalReservationBandwidth$LAYOUT, CriticalReservationBandwidth$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG64 CriticalReservationBandwidth
     * }
     */
    public static void CriticalReservationBandwidth(MemorySegment struct, long fieldValue) {
        struct.set(CriticalReservationBandwidth$LAYOUT, CriticalReservationBandwidth$OFFSET, fieldValue);
    }

    private static final OfLong MaxTimePercent$LAYOUT = (OfLong)$LAYOUT.select(groupElement("MaxTimePercent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG64 MaxTimePercent
     * }
     */
    public static final OfLong MaxTimePercent$layout() {
        return MaxTimePercent$LAYOUT;
    }

    private static final long MaxTimePercent$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG64 MaxTimePercent
     * }
     */
    public static final long MaxTimePercent$offset() {
        return MaxTimePercent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG64 MaxTimePercent
     * }
     */
    public static long MaxTimePercent(MemorySegment struct) {
        return struct.get(MaxTimePercent$LAYOUT, MaxTimePercent$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG64 MaxTimePercent
     * }
     */
    public static void MaxTimePercent(MemorySegment struct, long fieldValue) {
        struct.set(MaxTimePercent$LAYOUT, MaxTimePercent$OFFSET, fieldValue);
    }

    private static final OfLong ReservationTimePercent$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ReservationTimePercent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG64 ReservationTimePercent
     * }
     */
    public static final OfLong ReservationTimePercent$layout() {
        return ReservationTimePercent$LAYOUT;
    }

    private static final long ReservationTimePercent$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG64 ReservationTimePercent
     * }
     */
    public static final long ReservationTimePercent$offset() {
        return ReservationTimePercent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG64 ReservationTimePercent
     * }
     */
    public static long ReservationTimePercent(MemorySegment struct) {
        return struct.get(ReservationTimePercent$LAYOUT, ReservationTimePercent$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG64 ReservationTimePercent
     * }
     */
    public static void ReservationTimePercent(MemorySegment struct, long fieldValue) {
        struct.set(ReservationTimePercent$LAYOUT, ReservationTimePercent$OFFSET, fieldValue);
    }

    private static final OfLong CriticalReservationTimePercent$LAYOUT = (OfLong)$LAYOUT.select(groupElement("CriticalReservationTimePercent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG64 CriticalReservationTimePercent
     * }
     */
    public static final OfLong CriticalReservationTimePercent$layout() {
        return CriticalReservationTimePercent$LAYOUT;
    }

    private static final long CriticalReservationTimePercent$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG64 CriticalReservationTimePercent
     * }
     */
    public static final long CriticalReservationTimePercent$offset() {
        return CriticalReservationTimePercent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG64 CriticalReservationTimePercent
     * }
     */
    public static long CriticalReservationTimePercent(MemorySegment struct) {
        return struct.get(CriticalReservationTimePercent$LAYOUT, CriticalReservationTimePercent$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG64 CriticalReservationTimePercent
     * }
     */
    public static void CriticalReservationTimePercent(MemorySegment struct, long fieldValue) {
        struct.set(CriticalReservationTimePercent$LAYOUT, CriticalReservationTimePercent$OFFSET, fieldValue);
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

