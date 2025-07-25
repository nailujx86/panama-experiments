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
 * struct _SCM_PD_RUNTIME_FW_ACTIVATION_INFO {
 *     DWORD Version;
 *     DWORD Size;
 *     SCM_PD_LAST_FW_ACTIVATION_STATUS LastFirmwareActivationStatus;
 *     SCM_PD_FIRMWARE_ACTIVATION_STATE FirmwareActivationState;
 * }
 * }
 */
public class _SCM_PD_RUNTIME_FW_ACTIVATION_INFO {

    _SCM_PD_RUNTIME_FW_ACTIVATION_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("Version"),
        winapi.C_LONG.withName("Size"),
        winapi.C_INT.withName("LastFirmwareActivationStatus"),
        winapi.C_INT.withName("FirmwareActivationState")
    ).withName("_SCM_PD_RUNTIME_FW_ACTIVATION_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Version$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Version"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static final OfInt Version$layout() {
        return Version$LAYOUT;
    }

    private static final long Version$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static final long Version$offset() {
        return Version$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static int Version(MemorySegment struct) {
        return struct.get(Version$LAYOUT, Version$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Version
     * }
     */
    public static void Version(MemorySegment struct, int fieldValue) {
        struct.set(Version$LAYOUT, Version$OFFSET, fieldValue);
    }

    private static final OfInt Size$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Size"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static final OfInt Size$layout() {
        return Size$LAYOUT;
    }

    private static final long Size$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static final long Size$offset() {
        return Size$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static int Size(MemorySegment struct) {
        return struct.get(Size$LAYOUT, Size$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Size
     * }
     */
    public static void Size(MemorySegment struct, int fieldValue) {
        struct.set(Size$LAYOUT, Size$OFFSET, fieldValue);
    }

    private static final OfInt LastFirmwareActivationStatus$LAYOUT = (OfInt)$LAYOUT.select(groupElement("LastFirmwareActivationStatus"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SCM_PD_LAST_FW_ACTIVATION_STATUS LastFirmwareActivationStatus
     * }
     */
    public static final OfInt LastFirmwareActivationStatus$layout() {
        return LastFirmwareActivationStatus$LAYOUT;
    }

    private static final long LastFirmwareActivationStatus$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SCM_PD_LAST_FW_ACTIVATION_STATUS LastFirmwareActivationStatus
     * }
     */
    public static final long LastFirmwareActivationStatus$offset() {
        return LastFirmwareActivationStatus$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SCM_PD_LAST_FW_ACTIVATION_STATUS LastFirmwareActivationStatus
     * }
     */
    public static int LastFirmwareActivationStatus(MemorySegment struct) {
        return struct.get(LastFirmwareActivationStatus$LAYOUT, LastFirmwareActivationStatus$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SCM_PD_LAST_FW_ACTIVATION_STATUS LastFirmwareActivationStatus
     * }
     */
    public static void LastFirmwareActivationStatus(MemorySegment struct, int fieldValue) {
        struct.set(LastFirmwareActivationStatus$LAYOUT, LastFirmwareActivationStatus$OFFSET, fieldValue);
    }

    private static final OfInt FirmwareActivationState$LAYOUT = (OfInt)$LAYOUT.select(groupElement("FirmwareActivationState"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SCM_PD_FIRMWARE_ACTIVATION_STATE FirmwareActivationState
     * }
     */
    public static final OfInt FirmwareActivationState$layout() {
        return FirmwareActivationState$LAYOUT;
    }

    private static final long FirmwareActivationState$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SCM_PD_FIRMWARE_ACTIVATION_STATE FirmwareActivationState
     * }
     */
    public static final long FirmwareActivationState$offset() {
        return FirmwareActivationState$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SCM_PD_FIRMWARE_ACTIVATION_STATE FirmwareActivationState
     * }
     */
    public static int FirmwareActivationState(MemorySegment struct) {
        return struct.get(FirmwareActivationState$LAYOUT, FirmwareActivationState$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SCM_PD_FIRMWARE_ACTIVATION_STATE FirmwareActivationState
     * }
     */
    public static void FirmwareActivationState(MemorySegment struct, int fieldValue) {
        struct.set(FirmwareActivationState$LAYOUT, FirmwareActivationState$OFFSET, fieldValue);
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

