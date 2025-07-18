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
 * struct _ENCLAVE_INIT_INFO_VBS_BASIC {
 *     BYTE FamilyId[16];
 *     BYTE ImageId[16];
 *     ULONGLONG EnclaveSize;
 *     DWORD EnclaveSvn;
 *     DWORD Reserved;
 *     union {
 *         HANDLE SignatureInfoHandle;
 *         ULONGLONG Unused;
 *     };
 * }
 * }
 */
public class _ENCLAVE_INIT_INFO_VBS_BASIC {

    _ENCLAVE_INIT_INFO_VBS_BASIC() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.sequenceLayout(16, winapi.C_CHAR).withName("FamilyId"),
        MemoryLayout.sequenceLayout(16, winapi.C_CHAR).withName("ImageId"),
        winapi.C_LONG_LONG.withName("EnclaveSize"),
        winapi.C_LONG.withName("EnclaveSvn"),
        winapi.C_LONG.withName("Reserved"),
        MemoryLayout.unionLayout(
            winapi.C_POINTER.withName("SignatureInfoHandle"),
            winapi.C_LONG_LONG.withName("Unused")
        ).withName("$anon$14764:5")
    ).withName("_ENCLAVE_INIT_INFO_VBS_BASIC");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final SequenceLayout FamilyId$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("FamilyId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE FamilyId[16]
     * }
     */
    public static final SequenceLayout FamilyId$layout() {
        return FamilyId$LAYOUT;
    }

    private static final long FamilyId$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE FamilyId[16]
     * }
     */
    public static final long FamilyId$offset() {
        return FamilyId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE FamilyId[16]
     * }
     */
    public static MemorySegment FamilyId(MemorySegment struct) {
        return struct.asSlice(FamilyId$OFFSET, FamilyId$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE FamilyId[16]
     * }
     */
    public static void FamilyId(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, FamilyId$OFFSET, FamilyId$LAYOUT.byteSize());
    }

    private static long[] FamilyId$DIMS = { 16 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE FamilyId[16]
     * }
     */
    public static long[] FamilyId$dimensions() {
        return FamilyId$DIMS;
    }
    private static final VarHandle FamilyId$ELEM_HANDLE = FamilyId$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE FamilyId[16]
     * }
     */
    public static byte FamilyId(MemorySegment struct, long index0) {
        return (byte)FamilyId$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE FamilyId[16]
     * }
     */
    public static void FamilyId(MemorySegment struct, long index0, byte fieldValue) {
        FamilyId$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout ImageId$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("ImageId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE ImageId[16]
     * }
     */
    public static final SequenceLayout ImageId$layout() {
        return ImageId$LAYOUT;
    }

    private static final long ImageId$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE ImageId[16]
     * }
     */
    public static final long ImageId$offset() {
        return ImageId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE ImageId[16]
     * }
     */
    public static MemorySegment ImageId(MemorySegment struct) {
        return struct.asSlice(ImageId$OFFSET, ImageId$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE ImageId[16]
     * }
     */
    public static void ImageId(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ImageId$OFFSET, ImageId$LAYOUT.byteSize());
    }

    private static long[] ImageId$DIMS = { 16 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE ImageId[16]
     * }
     */
    public static long[] ImageId$dimensions() {
        return ImageId$DIMS;
    }
    private static final VarHandle ImageId$ELEM_HANDLE = ImageId$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE ImageId[16]
     * }
     */
    public static byte ImageId(MemorySegment struct, long index0) {
        return (byte)ImageId$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE ImageId[16]
     * }
     */
    public static void ImageId(MemorySegment struct, long index0, byte fieldValue) {
        ImageId$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final OfLong EnclaveSize$LAYOUT = (OfLong)$LAYOUT.select(groupElement("EnclaveSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONGLONG EnclaveSize
     * }
     */
    public static final OfLong EnclaveSize$layout() {
        return EnclaveSize$LAYOUT;
    }

    private static final long EnclaveSize$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONGLONG EnclaveSize
     * }
     */
    public static final long EnclaveSize$offset() {
        return EnclaveSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONGLONG EnclaveSize
     * }
     */
    public static long EnclaveSize(MemorySegment struct) {
        return struct.get(EnclaveSize$LAYOUT, EnclaveSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONGLONG EnclaveSize
     * }
     */
    public static void EnclaveSize(MemorySegment struct, long fieldValue) {
        struct.set(EnclaveSize$LAYOUT, EnclaveSize$OFFSET, fieldValue);
    }

    private static final OfInt EnclaveSvn$LAYOUT = (OfInt)$LAYOUT.select(groupElement("EnclaveSvn"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD EnclaveSvn
     * }
     */
    public static final OfInt EnclaveSvn$layout() {
        return EnclaveSvn$LAYOUT;
    }

    private static final long EnclaveSvn$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD EnclaveSvn
     * }
     */
    public static final long EnclaveSvn$offset() {
        return EnclaveSvn$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD EnclaveSvn
     * }
     */
    public static int EnclaveSvn(MemorySegment struct) {
        return struct.get(EnclaveSvn$LAYOUT, EnclaveSvn$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD EnclaveSvn
     * }
     */
    public static void EnclaveSvn(MemorySegment struct, int fieldValue) {
        struct.set(EnclaveSvn$LAYOUT, EnclaveSvn$OFFSET, fieldValue);
    }

    private static final OfInt Reserved$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Reserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Reserved
     * }
     */
    public static final OfInt Reserved$layout() {
        return Reserved$LAYOUT;
    }

    private static final long Reserved$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Reserved
     * }
     */
    public static final long Reserved$offset() {
        return Reserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Reserved
     * }
     */
    public static int Reserved(MemorySegment struct) {
        return struct.get(Reserved$LAYOUT, Reserved$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Reserved
     * }
     */
    public static void Reserved(MemorySegment struct, int fieldValue) {
        struct.set(Reserved$LAYOUT, Reserved$OFFSET, fieldValue);
    }

    private static final AddressLayout SignatureInfoHandle$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("$anon$14764:5"), groupElement("SignatureInfoHandle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HANDLE SignatureInfoHandle
     * }
     */
    public static final AddressLayout SignatureInfoHandle$layout() {
        return SignatureInfoHandle$LAYOUT;
    }

    private static final long SignatureInfoHandle$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HANDLE SignatureInfoHandle
     * }
     */
    public static final long SignatureInfoHandle$offset() {
        return SignatureInfoHandle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HANDLE SignatureInfoHandle
     * }
     */
    public static MemorySegment SignatureInfoHandle(MemorySegment struct) {
        return struct.get(SignatureInfoHandle$LAYOUT, SignatureInfoHandle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HANDLE SignatureInfoHandle
     * }
     */
    public static void SignatureInfoHandle(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(SignatureInfoHandle$LAYOUT, SignatureInfoHandle$OFFSET, fieldValue);
    }

    private static final OfLong Unused$LAYOUT = (OfLong)$LAYOUT.select(groupElement("$anon$14764:5"), groupElement("Unused"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONGLONG Unused
     * }
     */
    public static final OfLong Unused$layout() {
        return Unused$LAYOUT;
    }

    private static final long Unused$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONGLONG Unused
     * }
     */
    public static final long Unused$offset() {
        return Unused$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONGLONG Unused
     * }
     */
    public static long Unused(MemorySegment struct) {
        return struct.get(Unused$LAYOUT, Unused$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONGLONG Unused
     * }
     */
    public static void Unused(MemorySegment struct, long fieldValue) {
        struct.set(Unused$LAYOUT, Unused$OFFSET, fieldValue);
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

