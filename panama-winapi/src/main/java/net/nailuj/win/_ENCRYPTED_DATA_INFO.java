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
 * struct _ENCRYPTED_DATA_INFO {
 *     DWORDLONG StartingFileOffset;
 *     DWORD OutputBufferOffset;
 *     DWORD BytesWithinFileSize;
 *     DWORD BytesWithinValidDataLength;
 *     WORD CompressionFormat;
 *     BYTE DataUnitShift;
 *     BYTE ChunkShift;
 *     BYTE ClusterShift;
 *     BYTE EncryptionFormat;
 *     WORD NumberOfDataBlocks;
 *     DWORD DataBlockSize[1];
 * }
 * }
 */
public class _ENCRYPTED_DATA_INFO {

    _ENCRYPTED_DATA_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG_LONG.withName("StartingFileOffset"),
        winapi.C_LONG.withName("OutputBufferOffset"),
        winapi.C_LONG.withName("BytesWithinFileSize"),
        winapi.C_LONG.withName("BytesWithinValidDataLength"),
        winapi.C_SHORT.withName("CompressionFormat"),
        winapi.C_CHAR.withName("DataUnitShift"),
        winapi.C_CHAR.withName("ChunkShift"),
        winapi.C_CHAR.withName("ClusterShift"),
        winapi.C_CHAR.withName("EncryptionFormat"),
        winapi.C_SHORT.withName("NumberOfDataBlocks"),
        MemoryLayout.sequenceLayout(1, winapi.C_LONG).withName("DataBlockSize")
    ).withName("_ENCRYPTED_DATA_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong StartingFileOffset$LAYOUT = (OfLong)$LAYOUT.select(groupElement("StartingFileOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORDLONG StartingFileOffset
     * }
     */
    public static final OfLong StartingFileOffset$layout() {
        return StartingFileOffset$LAYOUT;
    }

    private static final long StartingFileOffset$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORDLONG StartingFileOffset
     * }
     */
    public static final long StartingFileOffset$offset() {
        return StartingFileOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORDLONG StartingFileOffset
     * }
     */
    public static long StartingFileOffset(MemorySegment struct) {
        return struct.get(StartingFileOffset$LAYOUT, StartingFileOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORDLONG StartingFileOffset
     * }
     */
    public static void StartingFileOffset(MemorySegment struct, long fieldValue) {
        struct.set(StartingFileOffset$LAYOUT, StartingFileOffset$OFFSET, fieldValue);
    }

    private static final OfInt OutputBufferOffset$LAYOUT = (OfInt)$LAYOUT.select(groupElement("OutputBufferOffset"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD OutputBufferOffset
     * }
     */
    public static final OfInt OutputBufferOffset$layout() {
        return OutputBufferOffset$LAYOUT;
    }

    private static final long OutputBufferOffset$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD OutputBufferOffset
     * }
     */
    public static final long OutputBufferOffset$offset() {
        return OutputBufferOffset$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD OutputBufferOffset
     * }
     */
    public static int OutputBufferOffset(MemorySegment struct) {
        return struct.get(OutputBufferOffset$LAYOUT, OutputBufferOffset$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD OutputBufferOffset
     * }
     */
    public static void OutputBufferOffset(MemorySegment struct, int fieldValue) {
        struct.set(OutputBufferOffset$LAYOUT, OutputBufferOffset$OFFSET, fieldValue);
    }

    private static final OfInt BytesWithinFileSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("BytesWithinFileSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD BytesWithinFileSize
     * }
     */
    public static final OfInt BytesWithinFileSize$layout() {
        return BytesWithinFileSize$LAYOUT;
    }

    private static final long BytesWithinFileSize$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD BytesWithinFileSize
     * }
     */
    public static final long BytesWithinFileSize$offset() {
        return BytesWithinFileSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD BytesWithinFileSize
     * }
     */
    public static int BytesWithinFileSize(MemorySegment struct) {
        return struct.get(BytesWithinFileSize$LAYOUT, BytesWithinFileSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD BytesWithinFileSize
     * }
     */
    public static void BytesWithinFileSize(MemorySegment struct, int fieldValue) {
        struct.set(BytesWithinFileSize$LAYOUT, BytesWithinFileSize$OFFSET, fieldValue);
    }

    private static final OfInt BytesWithinValidDataLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("BytesWithinValidDataLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD BytesWithinValidDataLength
     * }
     */
    public static final OfInt BytesWithinValidDataLength$layout() {
        return BytesWithinValidDataLength$LAYOUT;
    }

    private static final long BytesWithinValidDataLength$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD BytesWithinValidDataLength
     * }
     */
    public static final long BytesWithinValidDataLength$offset() {
        return BytesWithinValidDataLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD BytesWithinValidDataLength
     * }
     */
    public static int BytesWithinValidDataLength(MemorySegment struct) {
        return struct.get(BytesWithinValidDataLength$LAYOUT, BytesWithinValidDataLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD BytesWithinValidDataLength
     * }
     */
    public static void BytesWithinValidDataLength(MemorySegment struct, int fieldValue) {
        struct.set(BytesWithinValidDataLength$LAYOUT, BytesWithinValidDataLength$OFFSET, fieldValue);
    }

    private static final OfShort CompressionFormat$LAYOUT = (OfShort)$LAYOUT.select(groupElement("CompressionFormat"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD CompressionFormat
     * }
     */
    public static final OfShort CompressionFormat$layout() {
        return CompressionFormat$LAYOUT;
    }

    private static final long CompressionFormat$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD CompressionFormat
     * }
     */
    public static final long CompressionFormat$offset() {
        return CompressionFormat$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD CompressionFormat
     * }
     */
    public static short CompressionFormat(MemorySegment struct) {
        return struct.get(CompressionFormat$LAYOUT, CompressionFormat$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD CompressionFormat
     * }
     */
    public static void CompressionFormat(MemorySegment struct, short fieldValue) {
        struct.set(CompressionFormat$LAYOUT, CompressionFormat$OFFSET, fieldValue);
    }

    private static final OfByte DataUnitShift$LAYOUT = (OfByte)$LAYOUT.select(groupElement("DataUnitShift"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE DataUnitShift
     * }
     */
    public static final OfByte DataUnitShift$layout() {
        return DataUnitShift$LAYOUT;
    }

    private static final long DataUnitShift$OFFSET = 22;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE DataUnitShift
     * }
     */
    public static final long DataUnitShift$offset() {
        return DataUnitShift$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE DataUnitShift
     * }
     */
    public static byte DataUnitShift(MemorySegment struct) {
        return struct.get(DataUnitShift$LAYOUT, DataUnitShift$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE DataUnitShift
     * }
     */
    public static void DataUnitShift(MemorySegment struct, byte fieldValue) {
        struct.set(DataUnitShift$LAYOUT, DataUnitShift$OFFSET, fieldValue);
    }

    private static final OfByte ChunkShift$LAYOUT = (OfByte)$LAYOUT.select(groupElement("ChunkShift"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE ChunkShift
     * }
     */
    public static final OfByte ChunkShift$layout() {
        return ChunkShift$LAYOUT;
    }

    private static final long ChunkShift$OFFSET = 23;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE ChunkShift
     * }
     */
    public static final long ChunkShift$offset() {
        return ChunkShift$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE ChunkShift
     * }
     */
    public static byte ChunkShift(MemorySegment struct) {
        return struct.get(ChunkShift$LAYOUT, ChunkShift$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE ChunkShift
     * }
     */
    public static void ChunkShift(MemorySegment struct, byte fieldValue) {
        struct.set(ChunkShift$LAYOUT, ChunkShift$OFFSET, fieldValue);
    }

    private static final OfByte ClusterShift$LAYOUT = (OfByte)$LAYOUT.select(groupElement("ClusterShift"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE ClusterShift
     * }
     */
    public static final OfByte ClusterShift$layout() {
        return ClusterShift$LAYOUT;
    }

    private static final long ClusterShift$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE ClusterShift
     * }
     */
    public static final long ClusterShift$offset() {
        return ClusterShift$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE ClusterShift
     * }
     */
    public static byte ClusterShift(MemorySegment struct) {
        return struct.get(ClusterShift$LAYOUT, ClusterShift$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE ClusterShift
     * }
     */
    public static void ClusterShift(MemorySegment struct, byte fieldValue) {
        struct.set(ClusterShift$LAYOUT, ClusterShift$OFFSET, fieldValue);
    }

    private static final OfByte EncryptionFormat$LAYOUT = (OfByte)$LAYOUT.select(groupElement("EncryptionFormat"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE EncryptionFormat
     * }
     */
    public static final OfByte EncryptionFormat$layout() {
        return EncryptionFormat$LAYOUT;
    }

    private static final long EncryptionFormat$OFFSET = 25;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE EncryptionFormat
     * }
     */
    public static final long EncryptionFormat$offset() {
        return EncryptionFormat$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE EncryptionFormat
     * }
     */
    public static byte EncryptionFormat(MemorySegment struct) {
        return struct.get(EncryptionFormat$LAYOUT, EncryptionFormat$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE EncryptionFormat
     * }
     */
    public static void EncryptionFormat(MemorySegment struct, byte fieldValue) {
        struct.set(EncryptionFormat$LAYOUT, EncryptionFormat$OFFSET, fieldValue);
    }

    private static final OfShort NumberOfDataBlocks$LAYOUT = (OfShort)$LAYOUT.select(groupElement("NumberOfDataBlocks"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD NumberOfDataBlocks
     * }
     */
    public static final OfShort NumberOfDataBlocks$layout() {
        return NumberOfDataBlocks$LAYOUT;
    }

    private static final long NumberOfDataBlocks$OFFSET = 26;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD NumberOfDataBlocks
     * }
     */
    public static final long NumberOfDataBlocks$offset() {
        return NumberOfDataBlocks$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD NumberOfDataBlocks
     * }
     */
    public static short NumberOfDataBlocks(MemorySegment struct) {
        return struct.get(NumberOfDataBlocks$LAYOUT, NumberOfDataBlocks$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD NumberOfDataBlocks
     * }
     */
    public static void NumberOfDataBlocks(MemorySegment struct, short fieldValue) {
        struct.set(NumberOfDataBlocks$LAYOUT, NumberOfDataBlocks$OFFSET, fieldValue);
    }

    private static final SequenceLayout DataBlockSize$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("DataBlockSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD DataBlockSize[1]
     * }
     */
    public static final SequenceLayout DataBlockSize$layout() {
        return DataBlockSize$LAYOUT;
    }

    private static final long DataBlockSize$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD DataBlockSize[1]
     * }
     */
    public static final long DataBlockSize$offset() {
        return DataBlockSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD DataBlockSize[1]
     * }
     */
    public static MemorySegment DataBlockSize(MemorySegment struct) {
        return struct.asSlice(DataBlockSize$OFFSET, DataBlockSize$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD DataBlockSize[1]
     * }
     */
    public static void DataBlockSize(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, DataBlockSize$OFFSET, DataBlockSize$LAYOUT.byteSize());
    }

    private static long[] DataBlockSize$DIMS = { 1 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * DWORD DataBlockSize[1]
     * }
     */
    public static long[] DataBlockSize$dimensions() {
        return DataBlockSize$DIMS;
    }
    private static final VarHandle DataBlockSize$ELEM_HANDLE = DataBlockSize$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * DWORD DataBlockSize[1]
     * }
     */
    public static int DataBlockSize(MemorySegment struct, long index0) {
        return (int)DataBlockSize$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * DWORD DataBlockSize[1]
     * }
     */
    public static void DataBlockSize(MemorySegment struct, long index0, int fieldValue) {
        DataBlockSize$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

