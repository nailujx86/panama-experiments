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
 * struct _PRIVKEYVER3 {
 *     DWORD magic;
 *     DWORD bitlenP;
 *     DWORD bitlenQ;
 *     DWORD bitlenJ;
 *     DWORD bitlenX;
 *     DSSSEED DSSSeed;
 * }
 * }
 */
public class _PRIVKEYVER3 {

    _PRIVKEYVER3() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("magic"),
        winapi.C_LONG.withName("bitlenP"),
        winapi.C_LONG.withName("bitlenQ"),
        winapi.C_LONG.withName("bitlenJ"),
        winapi.C_LONG.withName("bitlenX"),
        _DSSSEED.layout().withName("DSSSeed")
    ).withName("_PRIVKEYVER3");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt magic$LAYOUT = (OfInt)$LAYOUT.select(groupElement("magic"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD magic
     * }
     */
    public static final OfInt magic$layout() {
        return magic$LAYOUT;
    }

    private static final long magic$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD magic
     * }
     */
    public static final long magic$offset() {
        return magic$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD magic
     * }
     */
    public static int magic(MemorySegment struct) {
        return struct.get(magic$LAYOUT, magic$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD magic
     * }
     */
    public static void magic(MemorySegment struct, int fieldValue) {
        struct.set(magic$LAYOUT, magic$OFFSET, fieldValue);
    }

    private static final OfInt bitlenP$LAYOUT = (OfInt)$LAYOUT.select(groupElement("bitlenP"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD bitlenP
     * }
     */
    public static final OfInt bitlenP$layout() {
        return bitlenP$LAYOUT;
    }

    private static final long bitlenP$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD bitlenP
     * }
     */
    public static final long bitlenP$offset() {
        return bitlenP$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD bitlenP
     * }
     */
    public static int bitlenP(MemorySegment struct) {
        return struct.get(bitlenP$LAYOUT, bitlenP$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD bitlenP
     * }
     */
    public static void bitlenP(MemorySegment struct, int fieldValue) {
        struct.set(bitlenP$LAYOUT, bitlenP$OFFSET, fieldValue);
    }

    private static final OfInt bitlenQ$LAYOUT = (OfInt)$LAYOUT.select(groupElement("bitlenQ"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD bitlenQ
     * }
     */
    public static final OfInt bitlenQ$layout() {
        return bitlenQ$LAYOUT;
    }

    private static final long bitlenQ$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD bitlenQ
     * }
     */
    public static final long bitlenQ$offset() {
        return bitlenQ$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD bitlenQ
     * }
     */
    public static int bitlenQ(MemorySegment struct) {
        return struct.get(bitlenQ$LAYOUT, bitlenQ$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD bitlenQ
     * }
     */
    public static void bitlenQ(MemorySegment struct, int fieldValue) {
        struct.set(bitlenQ$LAYOUT, bitlenQ$OFFSET, fieldValue);
    }

    private static final OfInt bitlenJ$LAYOUT = (OfInt)$LAYOUT.select(groupElement("bitlenJ"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD bitlenJ
     * }
     */
    public static final OfInt bitlenJ$layout() {
        return bitlenJ$LAYOUT;
    }

    private static final long bitlenJ$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD bitlenJ
     * }
     */
    public static final long bitlenJ$offset() {
        return bitlenJ$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD bitlenJ
     * }
     */
    public static int bitlenJ(MemorySegment struct) {
        return struct.get(bitlenJ$LAYOUT, bitlenJ$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD bitlenJ
     * }
     */
    public static void bitlenJ(MemorySegment struct, int fieldValue) {
        struct.set(bitlenJ$LAYOUT, bitlenJ$OFFSET, fieldValue);
    }

    private static final OfInt bitlenX$LAYOUT = (OfInt)$LAYOUT.select(groupElement("bitlenX"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD bitlenX
     * }
     */
    public static final OfInt bitlenX$layout() {
        return bitlenX$LAYOUT;
    }

    private static final long bitlenX$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD bitlenX
     * }
     */
    public static final long bitlenX$offset() {
        return bitlenX$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD bitlenX
     * }
     */
    public static int bitlenX(MemorySegment struct) {
        return struct.get(bitlenX$LAYOUT, bitlenX$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD bitlenX
     * }
     */
    public static void bitlenX(MemorySegment struct, int fieldValue) {
        struct.set(bitlenX$LAYOUT, bitlenX$OFFSET, fieldValue);
    }

    private static final GroupLayout DSSSeed$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("DSSSeed"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DSSSEED DSSSeed
     * }
     */
    public static final GroupLayout DSSSeed$layout() {
        return DSSSeed$LAYOUT;
    }

    private static final long DSSSeed$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DSSSEED DSSSeed
     * }
     */
    public static final long DSSSeed$offset() {
        return DSSSeed$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DSSSEED DSSSeed
     * }
     */
    public static MemorySegment DSSSeed(MemorySegment struct) {
        return struct.asSlice(DSSSeed$OFFSET, DSSSeed$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DSSSEED DSSSeed
     * }
     */
    public static void DSSSeed(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, DSSSeed$OFFSET, DSSSeed$LAYOUT.byteSize());
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

