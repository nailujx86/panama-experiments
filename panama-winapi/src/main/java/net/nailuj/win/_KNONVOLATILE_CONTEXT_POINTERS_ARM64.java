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
 * struct _KNONVOLATILE_CONTEXT_POINTERS_ARM64 {
 *     PDWORD64 X19;
 *     PDWORD64 X20;
 *     PDWORD64 X21;
 *     PDWORD64 X22;
 *     PDWORD64 X23;
 *     PDWORD64 X24;
 *     PDWORD64 X25;
 *     PDWORD64 X26;
 *     PDWORD64 X27;
 *     PDWORD64 X28;
 *     PDWORD64 Fp;
 *     PDWORD64 Lr;
 *     PDWORD64 D8;
 *     PDWORD64 D9;
 *     PDWORD64 D10;
 *     PDWORD64 D11;
 *     PDWORD64 D12;
 *     PDWORD64 D13;
 *     PDWORD64 D14;
 *     PDWORD64 D15;
 * }
 * }
 */
public class _KNONVOLATILE_CONTEXT_POINTERS_ARM64 {

    _KNONVOLATILE_CONTEXT_POINTERS_ARM64() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_POINTER.withName("X19"),
        winapi.C_POINTER.withName("X20"),
        winapi.C_POINTER.withName("X21"),
        winapi.C_POINTER.withName("X22"),
        winapi.C_POINTER.withName("X23"),
        winapi.C_POINTER.withName("X24"),
        winapi.C_POINTER.withName("X25"),
        winapi.C_POINTER.withName("X26"),
        winapi.C_POINTER.withName("X27"),
        winapi.C_POINTER.withName("X28"),
        winapi.C_POINTER.withName("Fp"),
        winapi.C_POINTER.withName("Lr"),
        winapi.C_POINTER.withName("D8"),
        winapi.C_POINTER.withName("D9"),
        winapi.C_POINTER.withName("D10"),
        winapi.C_POINTER.withName("D11"),
        winapi.C_POINTER.withName("D12"),
        winapi.C_POINTER.withName("D13"),
        winapi.C_POINTER.withName("D14"),
        winapi.C_POINTER.withName("D15")
    ).withName("_KNONVOLATILE_CONTEXT_POINTERS_ARM64");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout X19$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("X19"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PDWORD64 X19
     * }
     */
    public static final AddressLayout X19$layout() {
        return X19$LAYOUT;
    }

    private static final long X19$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PDWORD64 X19
     * }
     */
    public static final long X19$offset() {
        return X19$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PDWORD64 X19
     * }
     */
    public static MemorySegment X19(MemorySegment struct) {
        return struct.get(X19$LAYOUT, X19$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PDWORD64 X19
     * }
     */
    public static void X19(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(X19$LAYOUT, X19$OFFSET, fieldValue);
    }

    private static final AddressLayout X20$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("X20"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PDWORD64 X20
     * }
     */
    public static final AddressLayout X20$layout() {
        return X20$LAYOUT;
    }

    private static final long X20$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PDWORD64 X20
     * }
     */
    public static final long X20$offset() {
        return X20$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PDWORD64 X20
     * }
     */
    public static MemorySegment X20(MemorySegment struct) {
        return struct.get(X20$LAYOUT, X20$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PDWORD64 X20
     * }
     */
    public static void X20(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(X20$LAYOUT, X20$OFFSET, fieldValue);
    }

    private static final AddressLayout X21$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("X21"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PDWORD64 X21
     * }
     */
    public static final AddressLayout X21$layout() {
        return X21$LAYOUT;
    }

    private static final long X21$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PDWORD64 X21
     * }
     */
    public static final long X21$offset() {
        return X21$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PDWORD64 X21
     * }
     */
    public static MemorySegment X21(MemorySegment struct) {
        return struct.get(X21$LAYOUT, X21$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PDWORD64 X21
     * }
     */
    public static void X21(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(X21$LAYOUT, X21$OFFSET, fieldValue);
    }

    private static final AddressLayout X22$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("X22"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PDWORD64 X22
     * }
     */
    public static final AddressLayout X22$layout() {
        return X22$LAYOUT;
    }

    private static final long X22$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PDWORD64 X22
     * }
     */
    public static final long X22$offset() {
        return X22$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PDWORD64 X22
     * }
     */
    public static MemorySegment X22(MemorySegment struct) {
        return struct.get(X22$LAYOUT, X22$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PDWORD64 X22
     * }
     */
    public static void X22(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(X22$LAYOUT, X22$OFFSET, fieldValue);
    }

    private static final AddressLayout X23$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("X23"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PDWORD64 X23
     * }
     */
    public static final AddressLayout X23$layout() {
        return X23$LAYOUT;
    }

    private static final long X23$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PDWORD64 X23
     * }
     */
    public static final long X23$offset() {
        return X23$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PDWORD64 X23
     * }
     */
    public static MemorySegment X23(MemorySegment struct) {
        return struct.get(X23$LAYOUT, X23$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PDWORD64 X23
     * }
     */
    public static void X23(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(X23$LAYOUT, X23$OFFSET, fieldValue);
    }

    private static final AddressLayout X24$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("X24"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PDWORD64 X24
     * }
     */
    public static final AddressLayout X24$layout() {
        return X24$LAYOUT;
    }

    private static final long X24$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PDWORD64 X24
     * }
     */
    public static final long X24$offset() {
        return X24$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PDWORD64 X24
     * }
     */
    public static MemorySegment X24(MemorySegment struct) {
        return struct.get(X24$LAYOUT, X24$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PDWORD64 X24
     * }
     */
    public static void X24(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(X24$LAYOUT, X24$OFFSET, fieldValue);
    }

    private static final AddressLayout X25$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("X25"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PDWORD64 X25
     * }
     */
    public static final AddressLayout X25$layout() {
        return X25$LAYOUT;
    }

    private static final long X25$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PDWORD64 X25
     * }
     */
    public static final long X25$offset() {
        return X25$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PDWORD64 X25
     * }
     */
    public static MemorySegment X25(MemorySegment struct) {
        return struct.get(X25$LAYOUT, X25$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PDWORD64 X25
     * }
     */
    public static void X25(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(X25$LAYOUT, X25$OFFSET, fieldValue);
    }

    private static final AddressLayout X26$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("X26"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PDWORD64 X26
     * }
     */
    public static final AddressLayout X26$layout() {
        return X26$LAYOUT;
    }

    private static final long X26$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PDWORD64 X26
     * }
     */
    public static final long X26$offset() {
        return X26$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PDWORD64 X26
     * }
     */
    public static MemorySegment X26(MemorySegment struct) {
        return struct.get(X26$LAYOUT, X26$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PDWORD64 X26
     * }
     */
    public static void X26(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(X26$LAYOUT, X26$OFFSET, fieldValue);
    }

    private static final AddressLayout X27$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("X27"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PDWORD64 X27
     * }
     */
    public static final AddressLayout X27$layout() {
        return X27$LAYOUT;
    }

    private static final long X27$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PDWORD64 X27
     * }
     */
    public static final long X27$offset() {
        return X27$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PDWORD64 X27
     * }
     */
    public static MemorySegment X27(MemorySegment struct) {
        return struct.get(X27$LAYOUT, X27$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PDWORD64 X27
     * }
     */
    public static void X27(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(X27$LAYOUT, X27$OFFSET, fieldValue);
    }

    private static final AddressLayout X28$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("X28"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PDWORD64 X28
     * }
     */
    public static final AddressLayout X28$layout() {
        return X28$LAYOUT;
    }

    private static final long X28$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PDWORD64 X28
     * }
     */
    public static final long X28$offset() {
        return X28$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PDWORD64 X28
     * }
     */
    public static MemorySegment X28(MemorySegment struct) {
        return struct.get(X28$LAYOUT, X28$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PDWORD64 X28
     * }
     */
    public static void X28(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(X28$LAYOUT, X28$OFFSET, fieldValue);
    }

    private static final AddressLayout Fp$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("Fp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PDWORD64 Fp
     * }
     */
    public static final AddressLayout Fp$layout() {
        return Fp$LAYOUT;
    }

    private static final long Fp$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PDWORD64 Fp
     * }
     */
    public static final long Fp$offset() {
        return Fp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PDWORD64 Fp
     * }
     */
    public static MemorySegment Fp(MemorySegment struct) {
        return struct.get(Fp$LAYOUT, Fp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PDWORD64 Fp
     * }
     */
    public static void Fp(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Fp$LAYOUT, Fp$OFFSET, fieldValue);
    }

    private static final AddressLayout Lr$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("Lr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PDWORD64 Lr
     * }
     */
    public static final AddressLayout Lr$layout() {
        return Lr$LAYOUT;
    }

    private static final long Lr$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PDWORD64 Lr
     * }
     */
    public static final long Lr$offset() {
        return Lr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PDWORD64 Lr
     * }
     */
    public static MemorySegment Lr(MemorySegment struct) {
        return struct.get(Lr$LAYOUT, Lr$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PDWORD64 Lr
     * }
     */
    public static void Lr(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Lr$LAYOUT, Lr$OFFSET, fieldValue);
    }

    private static final AddressLayout D8$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("D8"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PDWORD64 D8
     * }
     */
    public static final AddressLayout D8$layout() {
        return D8$LAYOUT;
    }

    private static final long D8$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PDWORD64 D8
     * }
     */
    public static final long D8$offset() {
        return D8$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PDWORD64 D8
     * }
     */
    public static MemorySegment D8(MemorySegment struct) {
        return struct.get(D8$LAYOUT, D8$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PDWORD64 D8
     * }
     */
    public static void D8(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(D8$LAYOUT, D8$OFFSET, fieldValue);
    }

    private static final AddressLayout D9$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("D9"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PDWORD64 D9
     * }
     */
    public static final AddressLayout D9$layout() {
        return D9$LAYOUT;
    }

    private static final long D9$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PDWORD64 D9
     * }
     */
    public static final long D9$offset() {
        return D9$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PDWORD64 D9
     * }
     */
    public static MemorySegment D9(MemorySegment struct) {
        return struct.get(D9$LAYOUT, D9$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PDWORD64 D9
     * }
     */
    public static void D9(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(D9$LAYOUT, D9$OFFSET, fieldValue);
    }

    private static final AddressLayout D10$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("D10"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PDWORD64 D10
     * }
     */
    public static final AddressLayout D10$layout() {
        return D10$LAYOUT;
    }

    private static final long D10$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PDWORD64 D10
     * }
     */
    public static final long D10$offset() {
        return D10$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PDWORD64 D10
     * }
     */
    public static MemorySegment D10(MemorySegment struct) {
        return struct.get(D10$LAYOUT, D10$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PDWORD64 D10
     * }
     */
    public static void D10(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(D10$LAYOUT, D10$OFFSET, fieldValue);
    }

    private static final AddressLayout D11$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("D11"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PDWORD64 D11
     * }
     */
    public static final AddressLayout D11$layout() {
        return D11$LAYOUT;
    }

    private static final long D11$OFFSET = 120;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PDWORD64 D11
     * }
     */
    public static final long D11$offset() {
        return D11$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PDWORD64 D11
     * }
     */
    public static MemorySegment D11(MemorySegment struct) {
        return struct.get(D11$LAYOUT, D11$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PDWORD64 D11
     * }
     */
    public static void D11(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(D11$LAYOUT, D11$OFFSET, fieldValue);
    }

    private static final AddressLayout D12$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("D12"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PDWORD64 D12
     * }
     */
    public static final AddressLayout D12$layout() {
        return D12$LAYOUT;
    }

    private static final long D12$OFFSET = 128;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PDWORD64 D12
     * }
     */
    public static final long D12$offset() {
        return D12$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PDWORD64 D12
     * }
     */
    public static MemorySegment D12(MemorySegment struct) {
        return struct.get(D12$LAYOUT, D12$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PDWORD64 D12
     * }
     */
    public static void D12(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(D12$LAYOUT, D12$OFFSET, fieldValue);
    }

    private static final AddressLayout D13$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("D13"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PDWORD64 D13
     * }
     */
    public static final AddressLayout D13$layout() {
        return D13$LAYOUT;
    }

    private static final long D13$OFFSET = 136;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PDWORD64 D13
     * }
     */
    public static final long D13$offset() {
        return D13$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PDWORD64 D13
     * }
     */
    public static MemorySegment D13(MemorySegment struct) {
        return struct.get(D13$LAYOUT, D13$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PDWORD64 D13
     * }
     */
    public static void D13(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(D13$LAYOUT, D13$OFFSET, fieldValue);
    }

    private static final AddressLayout D14$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("D14"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PDWORD64 D14
     * }
     */
    public static final AddressLayout D14$layout() {
        return D14$LAYOUT;
    }

    private static final long D14$OFFSET = 144;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PDWORD64 D14
     * }
     */
    public static final long D14$offset() {
        return D14$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PDWORD64 D14
     * }
     */
    public static MemorySegment D14(MemorySegment struct) {
        return struct.get(D14$LAYOUT, D14$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PDWORD64 D14
     * }
     */
    public static void D14(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(D14$LAYOUT, D14$OFFSET, fieldValue);
    }

    private static final AddressLayout D15$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("D15"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PDWORD64 D15
     * }
     */
    public static final AddressLayout D15$layout() {
        return D15$LAYOUT;
    }

    private static final long D15$OFFSET = 152;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PDWORD64 D15
     * }
     */
    public static final long D15$offset() {
        return D15$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PDWORD64 D15
     * }
     */
    public static MemorySegment D15(MemorySegment struct) {
        return struct.get(D15$LAYOUT, D15$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PDWORD64 D15
     * }
     */
    public static void D15(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(D15$LAYOUT, D15$OFFSET, fieldValue);
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

