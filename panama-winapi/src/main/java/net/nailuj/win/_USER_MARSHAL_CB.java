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
 * struct _USER_MARSHAL_CB {
 *     unsigned long Flags;
 *     PMIDL_STUB_MESSAGE pStubMsg;
 *     PFORMAT_STRING pReserve;
 *     unsigned long Signature;
 *     USER_MARSHAL_CB_TYPE CBType;
 *     PFORMAT_STRING pFormat;
 *     PFORMAT_STRING pTypeFormat;
 * }
 * }
 */
public class _USER_MARSHAL_CB {

    _USER_MARSHAL_CB() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("Flags"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("pStubMsg"),
        winapi.C_POINTER.withName("pReserve"),
        winapi.C_LONG.withName("Signature"),
        winapi.C_INT.withName("CBType"),
        winapi.C_POINTER.withName("pFormat"),
        winapi.C_POINTER.withName("pTypeFormat")
    ).withName("_USER_MARSHAL_CB");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long Flags
     * }
     */
    public static final OfInt Flags$layout() {
        return Flags$LAYOUT;
    }

    private static final long Flags$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long Flags
     * }
     */
    public static final long Flags$offset() {
        return Flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long Flags
     * }
     */
    public static int Flags(MemorySegment struct) {
        return struct.get(Flags$LAYOUT, Flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long Flags
     * }
     */
    public static void Flags(MemorySegment struct, int fieldValue) {
        struct.set(Flags$LAYOUT, Flags$OFFSET, fieldValue);
    }

    private static final AddressLayout pStubMsg$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pStubMsg"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PMIDL_STUB_MESSAGE pStubMsg
     * }
     */
    public static final AddressLayout pStubMsg$layout() {
        return pStubMsg$LAYOUT;
    }

    private static final long pStubMsg$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PMIDL_STUB_MESSAGE pStubMsg
     * }
     */
    public static final long pStubMsg$offset() {
        return pStubMsg$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PMIDL_STUB_MESSAGE pStubMsg
     * }
     */
    public static MemorySegment pStubMsg(MemorySegment struct) {
        return struct.get(pStubMsg$LAYOUT, pStubMsg$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PMIDL_STUB_MESSAGE pStubMsg
     * }
     */
    public static void pStubMsg(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pStubMsg$LAYOUT, pStubMsg$OFFSET, fieldValue);
    }

    private static final AddressLayout pReserve$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pReserve"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PFORMAT_STRING pReserve
     * }
     */
    public static final AddressLayout pReserve$layout() {
        return pReserve$LAYOUT;
    }

    private static final long pReserve$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PFORMAT_STRING pReserve
     * }
     */
    public static final long pReserve$offset() {
        return pReserve$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PFORMAT_STRING pReserve
     * }
     */
    public static MemorySegment pReserve(MemorySegment struct) {
        return struct.get(pReserve$LAYOUT, pReserve$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PFORMAT_STRING pReserve
     * }
     */
    public static void pReserve(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pReserve$LAYOUT, pReserve$OFFSET, fieldValue);
    }

    private static final OfInt Signature$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Signature"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long Signature
     * }
     */
    public static final OfInt Signature$layout() {
        return Signature$LAYOUT;
    }

    private static final long Signature$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long Signature
     * }
     */
    public static final long Signature$offset() {
        return Signature$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long Signature
     * }
     */
    public static int Signature(MemorySegment struct) {
        return struct.get(Signature$LAYOUT, Signature$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long Signature
     * }
     */
    public static void Signature(MemorySegment struct, int fieldValue) {
        struct.set(Signature$LAYOUT, Signature$OFFSET, fieldValue);
    }

    private static final OfInt CBType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("CBType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * USER_MARSHAL_CB_TYPE CBType
     * }
     */
    public static final OfInt CBType$layout() {
        return CBType$LAYOUT;
    }

    private static final long CBType$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * USER_MARSHAL_CB_TYPE CBType
     * }
     */
    public static final long CBType$offset() {
        return CBType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * USER_MARSHAL_CB_TYPE CBType
     * }
     */
    public static int CBType(MemorySegment struct) {
        return struct.get(CBType$LAYOUT, CBType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * USER_MARSHAL_CB_TYPE CBType
     * }
     */
    public static void CBType(MemorySegment struct, int fieldValue) {
        struct.set(CBType$LAYOUT, CBType$OFFSET, fieldValue);
    }

    private static final AddressLayout pFormat$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pFormat"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PFORMAT_STRING pFormat
     * }
     */
    public static final AddressLayout pFormat$layout() {
        return pFormat$LAYOUT;
    }

    private static final long pFormat$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PFORMAT_STRING pFormat
     * }
     */
    public static final long pFormat$offset() {
        return pFormat$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PFORMAT_STRING pFormat
     * }
     */
    public static MemorySegment pFormat(MemorySegment struct) {
        return struct.get(pFormat$LAYOUT, pFormat$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PFORMAT_STRING pFormat
     * }
     */
    public static void pFormat(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pFormat$LAYOUT, pFormat$OFFSET, fieldValue);
    }

    private static final AddressLayout pTypeFormat$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pTypeFormat"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PFORMAT_STRING pTypeFormat
     * }
     */
    public static final AddressLayout pTypeFormat$layout() {
        return pTypeFormat$LAYOUT;
    }

    private static final long pTypeFormat$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PFORMAT_STRING pTypeFormat
     * }
     */
    public static final long pTypeFormat$offset() {
        return pTypeFormat$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PFORMAT_STRING pTypeFormat
     * }
     */
    public static MemorySegment pTypeFormat(MemorySegment struct) {
        return struct.get(pTypeFormat$LAYOUT, pTypeFormat$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PFORMAT_STRING pTypeFormat
     * }
     */
    public static void pTypeFormat(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pTypeFormat$LAYOUT, pTypeFormat$OFFSET, fieldValue);
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

