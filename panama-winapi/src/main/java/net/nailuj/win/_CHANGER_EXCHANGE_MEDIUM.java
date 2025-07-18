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
 * struct _CHANGER_EXCHANGE_MEDIUM {
 *     CHANGER_ELEMENT Transport;
 *     CHANGER_ELEMENT Source;
 *     CHANGER_ELEMENT Destination1;
 *     CHANGER_ELEMENT Destination2;
 *     BOOLEAN Flip1;
 *     BOOLEAN Flip2;
 * }
 * }
 */
public class _CHANGER_EXCHANGE_MEDIUM {

    _CHANGER_EXCHANGE_MEDIUM() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _CHANGER_ELEMENT.layout().withName("Transport"),
        _CHANGER_ELEMENT.layout().withName("Source"),
        _CHANGER_ELEMENT.layout().withName("Destination1"),
        _CHANGER_ELEMENT.layout().withName("Destination2"),
        winapi.C_CHAR.withName("Flip1"),
        winapi.C_CHAR.withName("Flip2"),
        MemoryLayout.paddingLayout(2)
    ).withName("_CHANGER_EXCHANGE_MEDIUM");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout Transport$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Transport"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CHANGER_ELEMENT Transport
     * }
     */
    public static final GroupLayout Transport$layout() {
        return Transport$LAYOUT;
    }

    private static final long Transport$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CHANGER_ELEMENT Transport
     * }
     */
    public static final long Transport$offset() {
        return Transport$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CHANGER_ELEMENT Transport
     * }
     */
    public static MemorySegment Transport(MemorySegment struct) {
        return struct.asSlice(Transport$OFFSET, Transport$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CHANGER_ELEMENT Transport
     * }
     */
    public static void Transport(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Transport$OFFSET, Transport$LAYOUT.byteSize());
    }

    private static final GroupLayout Source$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Source"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CHANGER_ELEMENT Source
     * }
     */
    public static final GroupLayout Source$layout() {
        return Source$LAYOUT;
    }

    private static final long Source$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CHANGER_ELEMENT Source
     * }
     */
    public static final long Source$offset() {
        return Source$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CHANGER_ELEMENT Source
     * }
     */
    public static MemorySegment Source(MemorySegment struct) {
        return struct.asSlice(Source$OFFSET, Source$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CHANGER_ELEMENT Source
     * }
     */
    public static void Source(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Source$OFFSET, Source$LAYOUT.byteSize());
    }

    private static final GroupLayout Destination1$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Destination1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CHANGER_ELEMENT Destination1
     * }
     */
    public static final GroupLayout Destination1$layout() {
        return Destination1$LAYOUT;
    }

    private static final long Destination1$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CHANGER_ELEMENT Destination1
     * }
     */
    public static final long Destination1$offset() {
        return Destination1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CHANGER_ELEMENT Destination1
     * }
     */
    public static MemorySegment Destination1(MemorySegment struct) {
        return struct.asSlice(Destination1$OFFSET, Destination1$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CHANGER_ELEMENT Destination1
     * }
     */
    public static void Destination1(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Destination1$OFFSET, Destination1$LAYOUT.byteSize());
    }

    private static final GroupLayout Destination2$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Destination2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CHANGER_ELEMENT Destination2
     * }
     */
    public static final GroupLayout Destination2$layout() {
        return Destination2$LAYOUT;
    }

    private static final long Destination2$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CHANGER_ELEMENT Destination2
     * }
     */
    public static final long Destination2$offset() {
        return Destination2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CHANGER_ELEMENT Destination2
     * }
     */
    public static MemorySegment Destination2(MemorySegment struct) {
        return struct.asSlice(Destination2$OFFSET, Destination2$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CHANGER_ELEMENT Destination2
     * }
     */
    public static void Destination2(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Destination2$OFFSET, Destination2$LAYOUT.byteSize());
    }

    private static final OfByte Flip1$LAYOUT = (OfByte)$LAYOUT.select(groupElement("Flip1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN Flip1
     * }
     */
    public static final OfByte Flip1$layout() {
        return Flip1$LAYOUT;
    }

    private static final long Flip1$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN Flip1
     * }
     */
    public static final long Flip1$offset() {
        return Flip1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN Flip1
     * }
     */
    public static byte Flip1(MemorySegment struct) {
        return struct.get(Flip1$LAYOUT, Flip1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN Flip1
     * }
     */
    public static void Flip1(MemorySegment struct, byte fieldValue) {
        struct.set(Flip1$LAYOUT, Flip1$OFFSET, fieldValue);
    }

    private static final OfByte Flip2$LAYOUT = (OfByte)$LAYOUT.select(groupElement("Flip2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN Flip2
     * }
     */
    public static final OfByte Flip2$layout() {
        return Flip2$LAYOUT;
    }

    private static final long Flip2$OFFSET = 33;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN Flip2
     * }
     */
    public static final long Flip2$offset() {
        return Flip2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN Flip2
     * }
     */
    public static byte Flip2(MemorySegment struct) {
        return struct.get(Flip2$LAYOUT, Flip2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN Flip2
     * }
     */
    public static void Flip2(MemorySegment struct, byte fieldValue) {
        struct.set(Flip2$LAYOUT, Flip2$OFFSET, fieldValue);
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

