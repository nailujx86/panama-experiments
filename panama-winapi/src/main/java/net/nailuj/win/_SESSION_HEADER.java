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
 * struct _SESSION_HEADER {
 *     UCHAR sess_name;
 *     UCHAR num_sess;
 *     UCHAR rcv_dg_outstanding;
 *     UCHAR rcv_any_outstanding;
 * }
 * }
 */
public class _SESSION_HEADER {

    _SESSION_HEADER() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_CHAR.withName("sess_name"),
        winapi.C_CHAR.withName("num_sess"),
        winapi.C_CHAR.withName("rcv_dg_outstanding"),
        winapi.C_CHAR.withName("rcv_any_outstanding")
    ).withName("_SESSION_HEADER");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfByte sess_name$LAYOUT = (OfByte)$LAYOUT.select(groupElement("sess_name"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UCHAR sess_name
     * }
     */
    public static final OfByte sess_name$layout() {
        return sess_name$LAYOUT;
    }

    private static final long sess_name$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UCHAR sess_name
     * }
     */
    public static final long sess_name$offset() {
        return sess_name$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UCHAR sess_name
     * }
     */
    public static byte sess_name(MemorySegment struct) {
        return struct.get(sess_name$LAYOUT, sess_name$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UCHAR sess_name
     * }
     */
    public static void sess_name(MemorySegment struct, byte fieldValue) {
        struct.set(sess_name$LAYOUT, sess_name$OFFSET, fieldValue);
    }

    private static final OfByte num_sess$LAYOUT = (OfByte)$LAYOUT.select(groupElement("num_sess"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UCHAR num_sess
     * }
     */
    public static final OfByte num_sess$layout() {
        return num_sess$LAYOUT;
    }

    private static final long num_sess$OFFSET = 1;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UCHAR num_sess
     * }
     */
    public static final long num_sess$offset() {
        return num_sess$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UCHAR num_sess
     * }
     */
    public static byte num_sess(MemorySegment struct) {
        return struct.get(num_sess$LAYOUT, num_sess$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UCHAR num_sess
     * }
     */
    public static void num_sess(MemorySegment struct, byte fieldValue) {
        struct.set(num_sess$LAYOUT, num_sess$OFFSET, fieldValue);
    }

    private static final OfByte rcv_dg_outstanding$LAYOUT = (OfByte)$LAYOUT.select(groupElement("rcv_dg_outstanding"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UCHAR rcv_dg_outstanding
     * }
     */
    public static final OfByte rcv_dg_outstanding$layout() {
        return rcv_dg_outstanding$LAYOUT;
    }

    private static final long rcv_dg_outstanding$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UCHAR rcv_dg_outstanding
     * }
     */
    public static final long rcv_dg_outstanding$offset() {
        return rcv_dg_outstanding$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UCHAR rcv_dg_outstanding
     * }
     */
    public static byte rcv_dg_outstanding(MemorySegment struct) {
        return struct.get(rcv_dg_outstanding$LAYOUT, rcv_dg_outstanding$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UCHAR rcv_dg_outstanding
     * }
     */
    public static void rcv_dg_outstanding(MemorySegment struct, byte fieldValue) {
        struct.set(rcv_dg_outstanding$LAYOUT, rcv_dg_outstanding$OFFSET, fieldValue);
    }

    private static final OfByte rcv_any_outstanding$LAYOUT = (OfByte)$LAYOUT.select(groupElement("rcv_any_outstanding"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UCHAR rcv_any_outstanding
     * }
     */
    public static final OfByte rcv_any_outstanding$layout() {
        return rcv_any_outstanding$LAYOUT;
    }

    private static final long rcv_any_outstanding$OFFSET = 3;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UCHAR rcv_any_outstanding
     * }
     */
    public static final long rcv_any_outstanding$offset() {
        return rcv_any_outstanding$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UCHAR rcv_any_outstanding
     * }
     */
    public static byte rcv_any_outstanding(MemorySegment struct) {
        return struct.get(rcv_any_outstanding$LAYOUT, rcv_any_outstanding$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UCHAR rcv_any_outstanding
     * }
     */
    public static void rcv_any_outstanding(MemorySegment struct, byte fieldValue) {
        struct.set(rcv_any_outstanding$LAYOUT, rcv_any_outstanding$OFFSET, fieldValue);
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

