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
 * struct _STORAGE_DEVICE_ID_DESCRIPTOR {
 *     DWORD Version;
 *     DWORD Size;
 *     DWORD NumberOfIdentifiers;
 *     BYTE Identifiers[1];
 * }
 * }
 */
public class _STORAGE_DEVICE_ID_DESCRIPTOR {

    _STORAGE_DEVICE_ID_DESCRIPTOR() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("Version"),
        winapi.C_LONG.withName("Size"),
        winapi.C_LONG.withName("NumberOfIdentifiers"),
        MemoryLayout.sequenceLayout(1, winapi.C_CHAR).withName("Identifiers"),
        MemoryLayout.paddingLayout(3)
    ).withName("_STORAGE_DEVICE_ID_DESCRIPTOR");

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

    private static final OfInt NumberOfIdentifiers$LAYOUT = (OfInt)$LAYOUT.select(groupElement("NumberOfIdentifiers"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD NumberOfIdentifiers
     * }
     */
    public static final OfInt NumberOfIdentifiers$layout() {
        return NumberOfIdentifiers$LAYOUT;
    }

    private static final long NumberOfIdentifiers$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD NumberOfIdentifiers
     * }
     */
    public static final long NumberOfIdentifiers$offset() {
        return NumberOfIdentifiers$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD NumberOfIdentifiers
     * }
     */
    public static int NumberOfIdentifiers(MemorySegment struct) {
        return struct.get(NumberOfIdentifiers$LAYOUT, NumberOfIdentifiers$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD NumberOfIdentifiers
     * }
     */
    public static void NumberOfIdentifiers(MemorySegment struct, int fieldValue) {
        struct.set(NumberOfIdentifiers$LAYOUT, NumberOfIdentifiers$OFFSET, fieldValue);
    }

    private static final SequenceLayout Identifiers$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Identifiers"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Identifiers[1]
     * }
     */
    public static final SequenceLayout Identifiers$layout() {
        return Identifiers$LAYOUT;
    }

    private static final long Identifiers$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Identifiers[1]
     * }
     */
    public static final long Identifiers$offset() {
        return Identifiers$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Identifiers[1]
     * }
     */
    public static MemorySegment Identifiers(MemorySegment struct) {
        return struct.asSlice(Identifiers$OFFSET, Identifiers$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Identifiers[1]
     * }
     */
    public static void Identifiers(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Identifiers$OFFSET, Identifiers$LAYOUT.byteSize());
    }

    private static long[] Identifiers$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE Identifiers[1]
     * }
     */
    public static long[] Identifiers$dimensions() {
        return Identifiers$DIMS;
    }
    private static final VarHandle Identifiers$ELEM_HANDLE = Identifiers$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE Identifiers[1]
     * }
     */
    public static byte Identifiers(MemorySegment struct, long index0) {
        return (byte)Identifiers$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE Identifiers[1]
     * }
     */
    public static void Identifiers(MemorySegment struct, long index0, byte fieldValue) {
        Identifiers$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

