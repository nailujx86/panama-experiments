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
 * struct _IMAGE_SEPARATE_DEBUG_HEADER {
 *     WORD Signature;
 *     WORD Flags;
 *     WORD Machine;
 *     WORD Characteristics;
 *     DWORD TimeDateStamp;
 *     DWORD CheckSum;
 *     DWORD ImageBase;
 *     DWORD SizeOfImage;
 *     DWORD NumberOfSections;
 *     DWORD ExportedNamesSize;
 *     DWORD DebugDirectorySize;
 *     DWORD SectionAlignment;
 *     DWORD Reserved[2];
 * }
 * }
 */
public class _IMAGE_SEPARATE_DEBUG_HEADER {

    _IMAGE_SEPARATE_DEBUG_HEADER() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_SHORT.withName("Signature"),
        winapi.C_SHORT.withName("Flags"),
        winapi.C_SHORT.withName("Machine"),
        winapi.C_SHORT.withName("Characteristics"),
        winapi.C_LONG.withName("TimeDateStamp"),
        winapi.C_LONG.withName("CheckSum"),
        winapi.C_LONG.withName("ImageBase"),
        winapi.C_LONG.withName("SizeOfImage"),
        winapi.C_LONG.withName("NumberOfSections"),
        winapi.C_LONG.withName("ExportedNamesSize"),
        winapi.C_LONG.withName("DebugDirectorySize"),
        winapi.C_LONG.withName("SectionAlignment"),
        MemoryLayout.sequenceLayout(2, winapi.C_LONG).withName("Reserved")
    ).withName("_IMAGE_SEPARATE_DEBUG_HEADER");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort Signature$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Signature"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD Signature
     * }
     */
    public static final OfShort Signature$layout() {
        return Signature$LAYOUT;
    }

    private static final long Signature$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD Signature
     * }
     */
    public static final long Signature$offset() {
        return Signature$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD Signature
     * }
     */
    public static short Signature(MemorySegment struct) {
        return struct.get(Signature$LAYOUT, Signature$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD Signature
     * }
     */
    public static void Signature(MemorySegment struct, short fieldValue) {
        struct.set(Signature$LAYOUT, Signature$OFFSET, fieldValue);
    }

    private static final OfShort Flags$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD Flags
     * }
     */
    public static final OfShort Flags$layout() {
        return Flags$LAYOUT;
    }

    private static final long Flags$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD Flags
     * }
     */
    public static final long Flags$offset() {
        return Flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD Flags
     * }
     */
    public static short Flags(MemorySegment struct) {
        return struct.get(Flags$LAYOUT, Flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD Flags
     * }
     */
    public static void Flags(MemorySegment struct, short fieldValue) {
        struct.set(Flags$LAYOUT, Flags$OFFSET, fieldValue);
    }

    private static final OfShort Machine$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Machine"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD Machine
     * }
     */
    public static final OfShort Machine$layout() {
        return Machine$LAYOUT;
    }

    private static final long Machine$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD Machine
     * }
     */
    public static final long Machine$offset() {
        return Machine$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD Machine
     * }
     */
    public static short Machine(MemorySegment struct) {
        return struct.get(Machine$LAYOUT, Machine$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD Machine
     * }
     */
    public static void Machine(MemorySegment struct, short fieldValue) {
        struct.set(Machine$LAYOUT, Machine$OFFSET, fieldValue);
    }

    private static final OfShort Characteristics$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Characteristics"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD Characteristics
     * }
     */
    public static final OfShort Characteristics$layout() {
        return Characteristics$LAYOUT;
    }

    private static final long Characteristics$OFFSET = 6;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD Characteristics
     * }
     */
    public static final long Characteristics$offset() {
        return Characteristics$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD Characteristics
     * }
     */
    public static short Characteristics(MemorySegment struct) {
        return struct.get(Characteristics$LAYOUT, Characteristics$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD Characteristics
     * }
     */
    public static void Characteristics(MemorySegment struct, short fieldValue) {
        struct.set(Characteristics$LAYOUT, Characteristics$OFFSET, fieldValue);
    }

    private static final OfInt TimeDateStamp$LAYOUT = (OfInt)$LAYOUT.select(groupElement("TimeDateStamp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD TimeDateStamp
     * }
     */
    public static final OfInt TimeDateStamp$layout() {
        return TimeDateStamp$LAYOUT;
    }

    private static final long TimeDateStamp$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD TimeDateStamp
     * }
     */
    public static final long TimeDateStamp$offset() {
        return TimeDateStamp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD TimeDateStamp
     * }
     */
    public static int TimeDateStamp(MemorySegment struct) {
        return struct.get(TimeDateStamp$LAYOUT, TimeDateStamp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD TimeDateStamp
     * }
     */
    public static void TimeDateStamp(MemorySegment struct, int fieldValue) {
        struct.set(TimeDateStamp$LAYOUT, TimeDateStamp$OFFSET, fieldValue);
    }

    private static final OfInt CheckSum$LAYOUT = (OfInt)$LAYOUT.select(groupElement("CheckSum"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD CheckSum
     * }
     */
    public static final OfInt CheckSum$layout() {
        return CheckSum$LAYOUT;
    }

    private static final long CheckSum$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD CheckSum
     * }
     */
    public static final long CheckSum$offset() {
        return CheckSum$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD CheckSum
     * }
     */
    public static int CheckSum(MemorySegment struct) {
        return struct.get(CheckSum$LAYOUT, CheckSum$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD CheckSum
     * }
     */
    public static void CheckSum(MemorySegment struct, int fieldValue) {
        struct.set(CheckSum$LAYOUT, CheckSum$OFFSET, fieldValue);
    }

    private static final OfInt ImageBase$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ImageBase"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ImageBase
     * }
     */
    public static final OfInt ImageBase$layout() {
        return ImageBase$LAYOUT;
    }

    private static final long ImageBase$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ImageBase
     * }
     */
    public static final long ImageBase$offset() {
        return ImageBase$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ImageBase
     * }
     */
    public static int ImageBase(MemorySegment struct) {
        return struct.get(ImageBase$LAYOUT, ImageBase$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ImageBase
     * }
     */
    public static void ImageBase(MemorySegment struct, int fieldValue) {
        struct.set(ImageBase$LAYOUT, ImageBase$OFFSET, fieldValue);
    }

    private static final OfInt SizeOfImage$LAYOUT = (OfInt)$LAYOUT.select(groupElement("SizeOfImage"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD SizeOfImage
     * }
     */
    public static final OfInt SizeOfImage$layout() {
        return SizeOfImage$LAYOUT;
    }

    private static final long SizeOfImage$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD SizeOfImage
     * }
     */
    public static final long SizeOfImage$offset() {
        return SizeOfImage$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD SizeOfImage
     * }
     */
    public static int SizeOfImage(MemorySegment struct) {
        return struct.get(SizeOfImage$LAYOUT, SizeOfImage$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD SizeOfImage
     * }
     */
    public static void SizeOfImage(MemorySegment struct, int fieldValue) {
        struct.set(SizeOfImage$LAYOUT, SizeOfImage$OFFSET, fieldValue);
    }

    private static final OfInt NumberOfSections$LAYOUT = (OfInt)$LAYOUT.select(groupElement("NumberOfSections"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD NumberOfSections
     * }
     */
    public static final OfInt NumberOfSections$layout() {
        return NumberOfSections$LAYOUT;
    }

    private static final long NumberOfSections$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD NumberOfSections
     * }
     */
    public static final long NumberOfSections$offset() {
        return NumberOfSections$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD NumberOfSections
     * }
     */
    public static int NumberOfSections(MemorySegment struct) {
        return struct.get(NumberOfSections$LAYOUT, NumberOfSections$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD NumberOfSections
     * }
     */
    public static void NumberOfSections(MemorySegment struct, int fieldValue) {
        struct.set(NumberOfSections$LAYOUT, NumberOfSections$OFFSET, fieldValue);
    }

    private static final OfInt ExportedNamesSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ExportedNamesSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ExportedNamesSize
     * }
     */
    public static final OfInt ExportedNamesSize$layout() {
        return ExportedNamesSize$LAYOUT;
    }

    private static final long ExportedNamesSize$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ExportedNamesSize
     * }
     */
    public static final long ExportedNamesSize$offset() {
        return ExportedNamesSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ExportedNamesSize
     * }
     */
    public static int ExportedNamesSize(MemorySegment struct) {
        return struct.get(ExportedNamesSize$LAYOUT, ExportedNamesSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ExportedNamesSize
     * }
     */
    public static void ExportedNamesSize(MemorySegment struct, int fieldValue) {
        struct.set(ExportedNamesSize$LAYOUT, ExportedNamesSize$OFFSET, fieldValue);
    }

    private static final OfInt DebugDirectorySize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("DebugDirectorySize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD DebugDirectorySize
     * }
     */
    public static final OfInt DebugDirectorySize$layout() {
        return DebugDirectorySize$LAYOUT;
    }

    private static final long DebugDirectorySize$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD DebugDirectorySize
     * }
     */
    public static final long DebugDirectorySize$offset() {
        return DebugDirectorySize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD DebugDirectorySize
     * }
     */
    public static int DebugDirectorySize(MemorySegment struct) {
        return struct.get(DebugDirectorySize$LAYOUT, DebugDirectorySize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD DebugDirectorySize
     * }
     */
    public static void DebugDirectorySize(MemorySegment struct, int fieldValue) {
        struct.set(DebugDirectorySize$LAYOUT, DebugDirectorySize$OFFSET, fieldValue);
    }

    private static final OfInt SectionAlignment$LAYOUT = (OfInt)$LAYOUT.select(groupElement("SectionAlignment"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD SectionAlignment
     * }
     */
    public static final OfInt SectionAlignment$layout() {
        return SectionAlignment$LAYOUT;
    }

    private static final long SectionAlignment$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD SectionAlignment
     * }
     */
    public static final long SectionAlignment$offset() {
        return SectionAlignment$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD SectionAlignment
     * }
     */
    public static int SectionAlignment(MemorySegment struct) {
        return struct.get(SectionAlignment$LAYOUT, SectionAlignment$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD SectionAlignment
     * }
     */
    public static void SectionAlignment(MemorySegment struct, int fieldValue) {
        struct.set(SectionAlignment$LAYOUT, SectionAlignment$OFFSET, fieldValue);
    }

    private static final SequenceLayout Reserved$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Reserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Reserved[2]
     * }
     */
    public static final SequenceLayout Reserved$layout() {
        return Reserved$LAYOUT;
    }

    private static final long Reserved$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Reserved[2]
     * }
     */
    public static final long Reserved$offset() {
        return Reserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Reserved[2]
     * }
     */
    public static MemorySegment Reserved(MemorySegment struct) {
        return struct.asSlice(Reserved$OFFSET, Reserved$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Reserved[2]
     * }
     */
    public static void Reserved(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Reserved$OFFSET, Reserved$LAYOUT.byteSize());
    }

    private static long[] Reserved$DIMS = { 2 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * DWORD Reserved[2]
     * }
     */
    public static long[] Reserved$dimensions() {
        return Reserved$DIMS;
    }
    private static final VarHandle Reserved$ELEM_HANDLE = Reserved$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * DWORD Reserved[2]
     * }
     */
    public static int Reserved(MemorySegment struct, long index0) {
        return (int)Reserved$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * DWORD Reserved[2]
     * }
     */
    public static void Reserved(MemorySegment struct, long index0, int fieldValue) {
        Reserved$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

