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
 * struct _PROCESSOR_POWER_POLICY {
 *     DWORD Revision;
 *     BYTE DynamicThrottle;
 *     BYTE Spare[3];
 *     DWORD DisableCStates : 1;
 *     DWORD Reserved : 31;
 *     DWORD PolicyCount;
 *     PROCESSOR_POWER_POLICY_INFO Policy[3];
 * }
 * }
 */
public class _PROCESSOR_POWER_POLICY {

    _PROCESSOR_POWER_POLICY() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("Revision"),
        winapi.C_CHAR.withName("DynamicThrottle"),
        MemoryLayout.sequenceLayout(3, winapi.C_CHAR).withName("Spare"),
        MemoryLayout.paddingLayout(4),
        winapi.C_LONG.withName("PolicyCount"),
        MemoryLayout.sequenceLayout(3, _PROCESSOR_POWER_POLICY_INFO.layout()).withName("Policy")
    ).withName("_PROCESSOR_POWER_POLICY");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Revision$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Revision"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Revision
     * }
     */
    public static final OfInt Revision$layout() {
        return Revision$LAYOUT;
    }

    private static final long Revision$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Revision
     * }
     */
    public static final long Revision$offset() {
        return Revision$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Revision
     * }
     */
    public static int Revision(MemorySegment struct) {
        return struct.get(Revision$LAYOUT, Revision$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Revision
     * }
     */
    public static void Revision(MemorySegment struct, int fieldValue) {
        struct.set(Revision$LAYOUT, Revision$OFFSET, fieldValue);
    }

    private static final OfByte DynamicThrottle$LAYOUT = (OfByte)$LAYOUT.select(groupElement("DynamicThrottle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE DynamicThrottle
     * }
     */
    public static final OfByte DynamicThrottle$layout() {
        return DynamicThrottle$LAYOUT;
    }

    private static final long DynamicThrottle$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE DynamicThrottle
     * }
     */
    public static final long DynamicThrottle$offset() {
        return DynamicThrottle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE DynamicThrottle
     * }
     */
    public static byte DynamicThrottle(MemorySegment struct) {
        return struct.get(DynamicThrottle$LAYOUT, DynamicThrottle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE DynamicThrottle
     * }
     */
    public static void DynamicThrottle(MemorySegment struct, byte fieldValue) {
        struct.set(DynamicThrottle$LAYOUT, DynamicThrottle$OFFSET, fieldValue);
    }

    private static final SequenceLayout Spare$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Spare"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Spare[3]
     * }
     */
    public static final SequenceLayout Spare$layout() {
        return Spare$LAYOUT;
    }

    private static final long Spare$OFFSET = 5;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Spare[3]
     * }
     */
    public static final long Spare$offset() {
        return Spare$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Spare[3]
     * }
     */
    public static MemorySegment Spare(MemorySegment struct) {
        return struct.asSlice(Spare$OFFSET, Spare$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Spare[3]
     * }
     */
    public static void Spare(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Spare$OFFSET, Spare$LAYOUT.byteSize());
    }

    private static long[] Spare$DIMS = { 3 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE Spare[3]
     * }
     */
    public static long[] Spare$dimensions() {
        return Spare$DIMS;
    }
    private static final VarHandle Spare$ELEM_HANDLE = Spare$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE Spare[3]
     * }
     */
    public static byte Spare(MemorySegment struct, long index0) {
        return (byte)Spare$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE Spare[3]
     * }
     */
    public static void Spare(MemorySegment struct, long index0, byte fieldValue) {
        Spare$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfInt PolicyCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("PolicyCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD PolicyCount
     * }
     */
    public static final OfInt PolicyCount$layout() {
        return PolicyCount$LAYOUT;
    }

    private static final long PolicyCount$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD PolicyCount
     * }
     */
    public static final long PolicyCount$offset() {
        return PolicyCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD PolicyCount
     * }
     */
    public static int PolicyCount(MemorySegment struct) {
        return struct.get(PolicyCount$LAYOUT, PolicyCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD PolicyCount
     * }
     */
    public static void PolicyCount(MemorySegment struct, int fieldValue) {
        struct.set(PolicyCount$LAYOUT, PolicyCount$OFFSET, fieldValue);
    }

    private static final SequenceLayout Policy$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("Policy"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PROCESSOR_POWER_POLICY_INFO Policy[3]
     * }
     */
    public static final SequenceLayout Policy$layout() {
        return Policy$LAYOUT;
    }

    private static final long Policy$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PROCESSOR_POWER_POLICY_INFO Policy[3]
     * }
     */
    public static final long Policy$offset() {
        return Policy$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PROCESSOR_POWER_POLICY_INFO Policy[3]
     * }
     */
    public static MemorySegment Policy(MemorySegment struct) {
        return struct.asSlice(Policy$OFFSET, Policy$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PROCESSOR_POWER_POLICY_INFO Policy[3]
     * }
     */
    public static void Policy(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Policy$OFFSET, Policy$LAYOUT.byteSize());
    }

    private static long[] Policy$DIMS = { 3 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * PROCESSOR_POWER_POLICY_INFO Policy[3]
     * }
     */
    public static long[] Policy$dimensions() {
        return Policy$DIMS;
    }
    private static final MethodHandle Policy$ELEM_HANDLE = Policy$LAYOUT.sliceHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * PROCESSOR_POWER_POLICY_INFO Policy[3]
     * }
     */
    public static MemorySegment Policy(MemorySegment struct, long index0) {
        try {
            return (MemorySegment)Policy$ELEM_HANDLE.invokeExact(struct, 0L, index0);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * PROCESSOR_POWER_POLICY_INFO Policy[3]
     * }
     */
    public static void Policy(MemorySegment struct, long index0, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, Policy(struct, index0), 0L, _PROCESSOR_POWER_POLICY_INFO.layout().byteSize());
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

