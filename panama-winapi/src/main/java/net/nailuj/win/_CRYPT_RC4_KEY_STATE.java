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
 * struct _CRYPT_RC4_KEY_STATE {
 *     unsigned char Key[16];
 *     unsigned char SBox[256];
 *     unsigned char i;
 *     unsigned char j;
 * }
 * }
 */
public class _CRYPT_RC4_KEY_STATE {

    _CRYPT_RC4_KEY_STATE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(16, winapi.C_CHAR).withName("Key"),
        MemoryLayout.sequenceLayout(256, winapi.C_CHAR).withName("SBox"),
        winapi.C_CHAR.withName("i"),
        winapi.C_CHAR.withName("j")
    ).withName("_CRYPT_RC4_KEY_STATE");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final SequenceLayout Key$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Key"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned char Key[16]
     * }
     */
    public static final SequenceLayout Key$layout() {
        return Key$LAYOUT;
    }

    private static final long Key$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned char Key[16]
     * }
     */
    public static final long Key$offset() {
        return Key$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned char Key[16]
     * }
     */
    public static MemorySegment Key(MemorySegment struct) {
        return struct.asSlice(Key$OFFSET, Key$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned char Key[16]
     * }
     */
    public static void Key(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Key$OFFSET, Key$LAYOUT.byteSize());
    }

    private static long[] Key$DIMS = { 16 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * unsigned char Key[16]
     * }
     */
    public static long[] Key$dimensions() {
        return Key$DIMS;
    }
    private static final VarHandle Key$ELEM_HANDLE = Key$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * unsigned char Key[16]
     * }
     */
    public static byte Key(MemorySegment struct, long index0) {
        return (byte)Key$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * unsigned char Key[16]
     * }
     */
    public static void Key(MemorySegment struct, long index0, byte fieldValue) {
        Key$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout SBox$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("SBox"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned char SBox[256]
     * }
     */
    public static final SequenceLayout SBox$layout() {
        return SBox$LAYOUT;
    }

    private static final long SBox$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned char SBox[256]
     * }
     */
    public static final long SBox$offset() {
        return SBox$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned char SBox[256]
     * }
     */
    public static MemorySegment SBox(MemorySegment struct) {
        return struct.asSlice(SBox$OFFSET, SBox$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned char SBox[256]
     * }
     */
    public static void SBox(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, SBox$OFFSET, SBox$LAYOUT.byteSize());
    }

    private static long[] SBox$DIMS = { 256 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * unsigned char SBox[256]
     * }
     */
    public static long[] SBox$dimensions() {
        return SBox$DIMS;
    }
    private static final VarHandle SBox$ELEM_HANDLE = SBox$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * unsigned char SBox[256]
     * }
     */
    public static byte SBox(MemorySegment struct, long index0) {
        return (byte)SBox$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * unsigned char SBox[256]
     * }
     */
    public static void SBox(MemorySegment struct, long index0, byte fieldValue) {
        SBox$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfByte i$LAYOUT = (OfByte)$LAYOUT.select(groupElement("i"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned char i
     * }
     */
    public static final OfByte i$layout() {
        return i$LAYOUT;
    }

    private static final long i$OFFSET = 272;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned char i
     * }
     */
    public static final long i$offset() {
        return i$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned char i
     * }
     */
    public static byte i(MemorySegment struct) {
        return struct.get(i$LAYOUT, i$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned char i
     * }
     */
    public static void i(MemorySegment struct, byte fieldValue) {
        struct.set(i$LAYOUT, i$OFFSET, fieldValue);
    }

    private static final OfByte j$LAYOUT = (OfByte)$LAYOUT.select(groupElement("j"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned char j
     * }
     */
    public static final OfByte j$layout() {
        return j$LAYOUT;
    }

    private static final long j$OFFSET = 273;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned char j
     * }
     */
    public static final long j$offset() {
        return j$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned char j
     * }
     */
    public static byte j(MemorySegment struct) {
        return struct.get(j$LAYOUT, j$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned char j
     * }
     */
    public static void j(MemorySegment struct, byte fieldValue) {
        struct.set(j$LAYOUT, j$OFFSET, fieldValue);
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

