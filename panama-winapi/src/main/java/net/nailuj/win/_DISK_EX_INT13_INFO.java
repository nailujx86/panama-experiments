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
 * struct _DISK_EX_INT13_INFO {
 *     WORD ExBufferSize;
 *     WORD ExFlags;
 *     DWORD ExCylinders;
 *     DWORD ExHeads;
 *     DWORD ExSectorsPerTrack;
 *     DWORD64 ExSectorsPerDrive;
 *     WORD ExSectorSize;
 *     WORD ExReserved;
 * }
 * }
 */
public class _DISK_EX_INT13_INFO {

    _DISK_EX_INT13_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_SHORT.withName("ExBufferSize"),
        winapi.C_SHORT.withName("ExFlags"),
        winapi.C_LONG.withName("ExCylinders"),
        winapi.C_LONG.withName("ExHeads"),
        winapi.C_LONG.withName("ExSectorsPerTrack"),
        winapi.C_LONG_LONG.withName("ExSectorsPerDrive"),
        winapi.C_SHORT.withName("ExSectorSize"),
        winapi.C_SHORT.withName("ExReserved"),
        MemoryLayout.paddingLayout(4)
    ).withName("_DISK_EX_INT13_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort ExBufferSize$LAYOUT = (OfShort)$LAYOUT.select(groupElement("ExBufferSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD ExBufferSize
     * }
     */
    public static final OfShort ExBufferSize$layout() {
        return ExBufferSize$LAYOUT;
    }

    private static final long ExBufferSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD ExBufferSize
     * }
     */
    public static final long ExBufferSize$offset() {
        return ExBufferSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD ExBufferSize
     * }
     */
    public static short ExBufferSize(MemorySegment struct) {
        return struct.get(ExBufferSize$LAYOUT, ExBufferSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD ExBufferSize
     * }
     */
    public static void ExBufferSize(MemorySegment struct, short fieldValue) {
        struct.set(ExBufferSize$LAYOUT, ExBufferSize$OFFSET, fieldValue);
    }

    private static final OfShort ExFlags$LAYOUT = (OfShort)$LAYOUT.select(groupElement("ExFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD ExFlags
     * }
     */
    public static final OfShort ExFlags$layout() {
        return ExFlags$LAYOUT;
    }

    private static final long ExFlags$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD ExFlags
     * }
     */
    public static final long ExFlags$offset() {
        return ExFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD ExFlags
     * }
     */
    public static short ExFlags(MemorySegment struct) {
        return struct.get(ExFlags$LAYOUT, ExFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD ExFlags
     * }
     */
    public static void ExFlags(MemorySegment struct, short fieldValue) {
        struct.set(ExFlags$LAYOUT, ExFlags$OFFSET, fieldValue);
    }

    private static final OfInt ExCylinders$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ExCylinders"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ExCylinders
     * }
     */
    public static final OfInt ExCylinders$layout() {
        return ExCylinders$LAYOUT;
    }

    private static final long ExCylinders$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ExCylinders
     * }
     */
    public static final long ExCylinders$offset() {
        return ExCylinders$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ExCylinders
     * }
     */
    public static int ExCylinders(MemorySegment struct) {
        return struct.get(ExCylinders$LAYOUT, ExCylinders$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ExCylinders
     * }
     */
    public static void ExCylinders(MemorySegment struct, int fieldValue) {
        struct.set(ExCylinders$LAYOUT, ExCylinders$OFFSET, fieldValue);
    }

    private static final OfInt ExHeads$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ExHeads"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ExHeads
     * }
     */
    public static final OfInt ExHeads$layout() {
        return ExHeads$LAYOUT;
    }

    private static final long ExHeads$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ExHeads
     * }
     */
    public static final long ExHeads$offset() {
        return ExHeads$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ExHeads
     * }
     */
    public static int ExHeads(MemorySegment struct) {
        return struct.get(ExHeads$LAYOUT, ExHeads$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ExHeads
     * }
     */
    public static void ExHeads(MemorySegment struct, int fieldValue) {
        struct.set(ExHeads$LAYOUT, ExHeads$OFFSET, fieldValue);
    }

    private static final OfInt ExSectorsPerTrack$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ExSectorsPerTrack"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ExSectorsPerTrack
     * }
     */
    public static final OfInt ExSectorsPerTrack$layout() {
        return ExSectorsPerTrack$LAYOUT;
    }

    private static final long ExSectorsPerTrack$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ExSectorsPerTrack
     * }
     */
    public static final long ExSectorsPerTrack$offset() {
        return ExSectorsPerTrack$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ExSectorsPerTrack
     * }
     */
    public static int ExSectorsPerTrack(MemorySegment struct) {
        return struct.get(ExSectorsPerTrack$LAYOUT, ExSectorsPerTrack$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ExSectorsPerTrack
     * }
     */
    public static void ExSectorsPerTrack(MemorySegment struct, int fieldValue) {
        struct.set(ExSectorsPerTrack$LAYOUT, ExSectorsPerTrack$OFFSET, fieldValue);
    }

    private static final OfLong ExSectorsPerDrive$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ExSectorsPerDrive"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD64 ExSectorsPerDrive
     * }
     */
    public static final OfLong ExSectorsPerDrive$layout() {
        return ExSectorsPerDrive$LAYOUT;
    }

    private static final long ExSectorsPerDrive$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD64 ExSectorsPerDrive
     * }
     */
    public static final long ExSectorsPerDrive$offset() {
        return ExSectorsPerDrive$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD64 ExSectorsPerDrive
     * }
     */
    public static long ExSectorsPerDrive(MemorySegment struct) {
        return struct.get(ExSectorsPerDrive$LAYOUT, ExSectorsPerDrive$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD64 ExSectorsPerDrive
     * }
     */
    public static void ExSectorsPerDrive(MemorySegment struct, long fieldValue) {
        struct.set(ExSectorsPerDrive$LAYOUT, ExSectorsPerDrive$OFFSET, fieldValue);
    }

    private static final OfShort ExSectorSize$LAYOUT = (OfShort)$LAYOUT.select(groupElement("ExSectorSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD ExSectorSize
     * }
     */
    public static final OfShort ExSectorSize$layout() {
        return ExSectorSize$LAYOUT;
    }

    private static final long ExSectorSize$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD ExSectorSize
     * }
     */
    public static final long ExSectorSize$offset() {
        return ExSectorSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD ExSectorSize
     * }
     */
    public static short ExSectorSize(MemorySegment struct) {
        return struct.get(ExSectorSize$LAYOUT, ExSectorSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD ExSectorSize
     * }
     */
    public static void ExSectorSize(MemorySegment struct, short fieldValue) {
        struct.set(ExSectorSize$LAYOUT, ExSectorSize$OFFSET, fieldValue);
    }

    private static final OfShort ExReserved$LAYOUT = (OfShort)$LAYOUT.select(groupElement("ExReserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD ExReserved
     * }
     */
    public static final OfShort ExReserved$layout() {
        return ExReserved$LAYOUT;
    }

    private static final long ExReserved$OFFSET = 26;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD ExReserved
     * }
     */
    public static final long ExReserved$offset() {
        return ExReserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD ExReserved
     * }
     */
    public static short ExReserved(MemorySegment struct) {
        return struct.get(ExReserved$LAYOUT, ExReserved$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD ExReserved
     * }
     */
    public static void ExReserved(MemorySegment struct, short fieldValue) {
        struct.set(ExReserved$LAYOUT, ExReserved$OFFSET, fieldValue);
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

