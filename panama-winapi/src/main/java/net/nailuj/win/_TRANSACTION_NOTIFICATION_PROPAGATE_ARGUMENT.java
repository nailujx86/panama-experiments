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
 * struct _TRANSACTION_NOTIFICATION_PROPAGATE_ARGUMENT {
 *     ULONG PropagationCookie;
 *     GUID UOW;
 *     GUID TmIdentity;
 *     ULONG BufferLength;
 * }
 * }
 */
public class _TRANSACTION_NOTIFICATION_PROPAGATE_ARGUMENT {

    _TRANSACTION_NOTIFICATION_PROPAGATE_ARGUMENT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("PropagationCookie"),
        _GUID.layout().withName("UOW"),
        _GUID.layout().withName("TmIdentity"),
        winapi.C_LONG.withName("BufferLength")
    ).withName("_TRANSACTION_NOTIFICATION_PROPAGATE_ARGUMENT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt PropagationCookie$LAYOUT = (OfInt)$LAYOUT.select(groupElement("PropagationCookie"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG PropagationCookie
     * }
     */
    public static final OfInt PropagationCookie$layout() {
        return PropagationCookie$LAYOUT;
    }

    private static final long PropagationCookie$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG PropagationCookie
     * }
     */
    public static final long PropagationCookie$offset() {
        return PropagationCookie$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG PropagationCookie
     * }
     */
    public static int PropagationCookie(MemorySegment struct) {
        return struct.get(PropagationCookie$LAYOUT, PropagationCookie$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG PropagationCookie
     * }
     */
    public static void PropagationCookie(MemorySegment struct, int fieldValue) {
        struct.set(PropagationCookie$LAYOUT, PropagationCookie$OFFSET, fieldValue);
    }

    private static final GroupLayout UOW$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("UOW"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GUID UOW
     * }
     */
    public static final GroupLayout UOW$layout() {
        return UOW$LAYOUT;
    }

    private static final long UOW$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GUID UOW
     * }
     */
    public static final long UOW$offset() {
        return UOW$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GUID UOW
     * }
     */
    public static MemorySegment UOW(MemorySegment struct) {
        return struct.asSlice(UOW$OFFSET, UOW$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GUID UOW
     * }
     */
    public static void UOW(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, UOW$OFFSET, UOW$LAYOUT.byteSize());
    }

    private static final GroupLayout TmIdentity$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("TmIdentity"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GUID TmIdentity
     * }
     */
    public static final GroupLayout TmIdentity$layout() {
        return TmIdentity$LAYOUT;
    }

    private static final long TmIdentity$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GUID TmIdentity
     * }
     */
    public static final long TmIdentity$offset() {
        return TmIdentity$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GUID TmIdentity
     * }
     */
    public static MemorySegment TmIdentity(MemorySegment struct) {
        return struct.asSlice(TmIdentity$OFFSET, TmIdentity$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GUID TmIdentity
     * }
     */
    public static void TmIdentity(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, TmIdentity$OFFSET, TmIdentity$LAYOUT.byteSize());
    }

    private static final OfInt BufferLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("BufferLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG BufferLength
     * }
     */
    public static final OfInt BufferLength$layout() {
        return BufferLength$LAYOUT;
    }

    private static final long BufferLength$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG BufferLength
     * }
     */
    public static final long BufferLength$offset() {
        return BufferLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG BufferLength
     * }
     */
    public static int BufferLength(MemorySegment struct) {
        return struct.get(BufferLength$LAYOUT, BufferLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG BufferLength
     * }
     */
    public static void BufferLength(MemorySegment struct, int fieldValue) {
        struct.set(BufferLength$LAYOUT, BufferLength$OFFSET, fieldValue);
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

