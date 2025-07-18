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
 * struct _SERVERSILO_BASIC_INFORMATION {
 *     DWORD ServiceSessionId;
 *     SERVERSILO_STATE State;
 *     DWORD ExitStatus;
 *     BOOLEAN Reserved;
 *     PVOID ApiSetSchema;
 *     PVOID HostApiSetSchema;
 *     DWORD ContainerBuildNumber;
 *     DWORD HostBuildNumber;
 * }
 * }
 */
public class _SERVERSILO_BASIC_INFORMATION {

    _SERVERSILO_BASIC_INFORMATION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("ServiceSessionId"),
        winapi.C_INT.withName("State"),
        winapi.C_LONG.withName("ExitStatus"),
        winapi.C_CHAR.withName("Reserved"),
        MemoryLayout.paddingLayout(3),
        winapi.C_POINTER.withName("ApiSetSchema"),
        winapi.C_POINTER.withName("HostApiSetSchema"),
        winapi.C_LONG.withName("ContainerBuildNumber"),
        winapi.C_LONG.withName("HostBuildNumber")
    ).withName("_SERVERSILO_BASIC_INFORMATION");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt ServiceSessionId$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ServiceSessionId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ServiceSessionId
     * }
     */
    public static final OfInt ServiceSessionId$layout() {
        return ServiceSessionId$LAYOUT;
    }

    private static final long ServiceSessionId$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ServiceSessionId
     * }
     */
    public static final long ServiceSessionId$offset() {
        return ServiceSessionId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ServiceSessionId
     * }
     */
    public static int ServiceSessionId(MemorySegment struct) {
        return struct.get(ServiceSessionId$LAYOUT, ServiceSessionId$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ServiceSessionId
     * }
     */
    public static void ServiceSessionId(MemorySegment struct, int fieldValue) {
        struct.set(ServiceSessionId$LAYOUT, ServiceSessionId$OFFSET, fieldValue);
    }

    private static final OfInt State$LAYOUT = (OfInt)$LAYOUT.select(groupElement("State"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SERVERSILO_STATE State
     * }
     */
    public static final OfInt State$layout() {
        return State$LAYOUT;
    }

    private static final long State$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SERVERSILO_STATE State
     * }
     */
    public static final long State$offset() {
        return State$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SERVERSILO_STATE State
     * }
     */
    public static int State(MemorySegment struct) {
        return struct.get(State$LAYOUT, State$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SERVERSILO_STATE State
     * }
     */
    public static void State(MemorySegment struct, int fieldValue) {
        struct.set(State$LAYOUT, State$OFFSET, fieldValue);
    }

    private static final OfInt ExitStatus$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ExitStatus"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ExitStatus
     * }
     */
    public static final OfInt ExitStatus$layout() {
        return ExitStatus$LAYOUT;
    }

    private static final long ExitStatus$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ExitStatus
     * }
     */
    public static final long ExitStatus$offset() {
        return ExitStatus$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ExitStatus
     * }
     */
    public static int ExitStatus(MemorySegment struct) {
        return struct.get(ExitStatus$LAYOUT, ExitStatus$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ExitStatus
     * }
     */
    public static void ExitStatus(MemorySegment struct, int fieldValue) {
        struct.set(ExitStatus$LAYOUT, ExitStatus$OFFSET, fieldValue);
    }

    private static final OfByte Reserved$LAYOUT = (OfByte)$LAYOUT.select(groupElement("Reserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN Reserved
     * }
     */
    public static final OfByte Reserved$layout() {
        return Reserved$LAYOUT;
    }

    private static final long Reserved$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN Reserved
     * }
     */
    public static final long Reserved$offset() {
        return Reserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN Reserved
     * }
     */
    public static byte Reserved(MemorySegment struct) {
        return struct.get(Reserved$LAYOUT, Reserved$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN Reserved
     * }
     */
    public static void Reserved(MemorySegment struct, byte fieldValue) {
        struct.set(Reserved$LAYOUT, Reserved$OFFSET, fieldValue);
    }

    private static final AddressLayout ApiSetSchema$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("ApiSetSchema"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PVOID ApiSetSchema
     * }
     */
    public static final AddressLayout ApiSetSchema$layout() {
        return ApiSetSchema$LAYOUT;
    }

    private static final long ApiSetSchema$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PVOID ApiSetSchema
     * }
     */
    public static final long ApiSetSchema$offset() {
        return ApiSetSchema$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PVOID ApiSetSchema
     * }
     */
    public static MemorySegment ApiSetSchema(MemorySegment struct) {
        return struct.get(ApiSetSchema$LAYOUT, ApiSetSchema$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PVOID ApiSetSchema
     * }
     */
    public static void ApiSetSchema(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ApiSetSchema$LAYOUT, ApiSetSchema$OFFSET, fieldValue);
    }

    private static final AddressLayout HostApiSetSchema$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("HostApiSetSchema"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PVOID HostApiSetSchema
     * }
     */
    public static final AddressLayout HostApiSetSchema$layout() {
        return HostApiSetSchema$LAYOUT;
    }

    private static final long HostApiSetSchema$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PVOID HostApiSetSchema
     * }
     */
    public static final long HostApiSetSchema$offset() {
        return HostApiSetSchema$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PVOID HostApiSetSchema
     * }
     */
    public static MemorySegment HostApiSetSchema(MemorySegment struct) {
        return struct.get(HostApiSetSchema$LAYOUT, HostApiSetSchema$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PVOID HostApiSetSchema
     * }
     */
    public static void HostApiSetSchema(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(HostApiSetSchema$LAYOUT, HostApiSetSchema$OFFSET, fieldValue);
    }

    private static final OfInt ContainerBuildNumber$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ContainerBuildNumber"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ContainerBuildNumber
     * }
     */
    public static final OfInt ContainerBuildNumber$layout() {
        return ContainerBuildNumber$LAYOUT;
    }

    private static final long ContainerBuildNumber$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ContainerBuildNumber
     * }
     */
    public static final long ContainerBuildNumber$offset() {
        return ContainerBuildNumber$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ContainerBuildNumber
     * }
     */
    public static int ContainerBuildNumber(MemorySegment struct) {
        return struct.get(ContainerBuildNumber$LAYOUT, ContainerBuildNumber$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ContainerBuildNumber
     * }
     */
    public static void ContainerBuildNumber(MemorySegment struct, int fieldValue) {
        struct.set(ContainerBuildNumber$LAYOUT, ContainerBuildNumber$OFFSET, fieldValue);
    }

    private static final OfInt HostBuildNumber$LAYOUT = (OfInt)$LAYOUT.select(groupElement("HostBuildNumber"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD HostBuildNumber
     * }
     */
    public static final OfInt HostBuildNumber$layout() {
        return HostBuildNumber$LAYOUT;
    }

    private static final long HostBuildNumber$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD HostBuildNumber
     * }
     */
    public static final long HostBuildNumber$offset() {
        return HostBuildNumber$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD HostBuildNumber
     * }
     */
    public static int HostBuildNumber(MemorySegment struct) {
        return struct.get(HostBuildNumber$LAYOUT, HostBuildNumber$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD HostBuildNumber
     * }
     */
    public static void HostBuildNumber(MemorySegment struct, int fieldValue) {
        struct.set(HostBuildNumber$LAYOUT, HostBuildNumber$OFFSET, fieldValue);
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

