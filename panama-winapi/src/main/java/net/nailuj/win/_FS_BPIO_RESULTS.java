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
 * struct _FS_BPIO_RESULTS {
 *     DWORD OpStatus;
 *     WORD FailingDriverNameLen;
 *     WCHAR FailingDriverName[32];
 *     WORD FailureReasonLen;
 *     WCHAR FailureReason[128];
 * }
 * }
 */
public class _FS_BPIO_RESULTS {

    _FS_BPIO_RESULTS() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("OpStatus"),
        winapi.C_SHORT.withName("FailingDriverNameLen"),
        MemoryLayout.sequenceLayout(32, winapi.C_SHORT).withName("FailingDriverName"),
        winapi.C_SHORT.withName("FailureReasonLen"),
        MemoryLayout.sequenceLayout(128, winapi.C_SHORT).withName("FailureReason")
    ).withName("_FS_BPIO_RESULTS");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt OpStatus$LAYOUT = (OfInt)$LAYOUT.select(groupElement("OpStatus"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD OpStatus
     * }
     */
    public static final OfInt OpStatus$layout() {
        return OpStatus$LAYOUT;
    }

    private static final long OpStatus$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD OpStatus
     * }
     */
    public static final long OpStatus$offset() {
        return OpStatus$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD OpStatus
     * }
     */
    public static int OpStatus(MemorySegment struct) {
        return struct.get(OpStatus$LAYOUT, OpStatus$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD OpStatus
     * }
     */
    public static void OpStatus(MemorySegment struct, int fieldValue) {
        struct.set(OpStatus$LAYOUT, OpStatus$OFFSET, fieldValue);
    }

    private static final OfShort FailingDriverNameLen$LAYOUT = (OfShort)$LAYOUT.select(groupElement("FailingDriverNameLen"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD FailingDriverNameLen
     * }
     */
    public static final OfShort FailingDriverNameLen$layout() {
        return FailingDriverNameLen$LAYOUT;
    }

    private static final long FailingDriverNameLen$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD FailingDriverNameLen
     * }
     */
    public static final long FailingDriverNameLen$offset() {
        return FailingDriverNameLen$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD FailingDriverNameLen
     * }
     */
    public static short FailingDriverNameLen(MemorySegment struct) {
        return struct.get(FailingDriverNameLen$LAYOUT, FailingDriverNameLen$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD FailingDriverNameLen
     * }
     */
    public static void FailingDriverNameLen(MemorySegment struct, short fieldValue) {
        struct.set(FailingDriverNameLen$LAYOUT, FailingDriverNameLen$OFFSET, fieldValue);
    }

    private static final SequenceLayout FailingDriverName$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("FailingDriverName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WCHAR FailingDriverName[32]
     * }
     */
    public static final SequenceLayout FailingDriverName$layout() {
        return FailingDriverName$LAYOUT;
    }

    private static final long FailingDriverName$OFFSET = 6;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WCHAR FailingDriverName[32]
     * }
     */
    public static final long FailingDriverName$offset() {
        return FailingDriverName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WCHAR FailingDriverName[32]
     * }
     */
    public static MemorySegment FailingDriverName(MemorySegment struct) {
        return struct.asSlice(FailingDriverName$OFFSET, FailingDriverName$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WCHAR FailingDriverName[32]
     * }
     */
    public static void FailingDriverName(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, FailingDriverName$OFFSET, FailingDriverName$LAYOUT.byteSize());
    }

    private static long[] FailingDriverName$DIMS = { 32 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * WCHAR FailingDriverName[32]
     * }
     */
    public static long[] FailingDriverName$dimensions() {
        return FailingDriverName$DIMS;
    }
    private static final VarHandle FailingDriverName$ELEM_HANDLE = FailingDriverName$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * WCHAR FailingDriverName[32]
     * }
     */
    public static short FailingDriverName(MemorySegment struct, long index0) {
        return (short)FailingDriverName$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * WCHAR FailingDriverName[32]
     * }
     */
    public static void FailingDriverName(MemorySegment struct, long index0, short fieldValue) {
        FailingDriverName$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfShort FailureReasonLen$LAYOUT = (OfShort)$LAYOUT.select(groupElement("FailureReasonLen"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD FailureReasonLen
     * }
     */
    public static final OfShort FailureReasonLen$layout() {
        return FailureReasonLen$LAYOUT;
    }

    private static final long FailureReasonLen$OFFSET = 70;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD FailureReasonLen
     * }
     */
    public static final long FailureReasonLen$offset() {
        return FailureReasonLen$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD FailureReasonLen
     * }
     */
    public static short FailureReasonLen(MemorySegment struct) {
        return struct.get(FailureReasonLen$LAYOUT, FailureReasonLen$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD FailureReasonLen
     * }
     */
    public static void FailureReasonLen(MemorySegment struct, short fieldValue) {
        struct.set(FailureReasonLen$LAYOUT, FailureReasonLen$OFFSET, fieldValue);
    }

    private static final SequenceLayout FailureReason$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("FailureReason"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WCHAR FailureReason[128]
     * }
     */
    public static final SequenceLayout FailureReason$layout() {
        return FailureReason$LAYOUT;
    }

    private static final long FailureReason$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WCHAR FailureReason[128]
     * }
     */
    public static final long FailureReason$offset() {
        return FailureReason$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WCHAR FailureReason[128]
     * }
     */
    public static MemorySegment FailureReason(MemorySegment struct) {
        return struct.asSlice(FailureReason$OFFSET, FailureReason$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WCHAR FailureReason[128]
     * }
     */
    public static void FailureReason(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, FailureReason$OFFSET, FailureReason$LAYOUT.byteSize());
    }

    private static long[] FailureReason$DIMS = { 128 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * WCHAR FailureReason[128]
     * }
     */
    public static long[] FailureReason$dimensions() {
        return FailureReason$DIMS;
    }
    private static final VarHandle FailureReason$ELEM_HANDLE = FailureReason$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * WCHAR FailureReason[128]
     * }
     */
    public static short FailureReason(MemorySegment struct, long index0) {
        return (short)FailureReason$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * WCHAR FailureReason[128]
     * }
     */
    public static void FailureReason(MemorySegment struct, long index0, short fieldValue) {
        FailureReason$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

