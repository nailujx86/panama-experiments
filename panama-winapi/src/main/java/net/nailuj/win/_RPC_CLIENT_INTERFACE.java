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
 * struct _RPC_CLIENT_INTERFACE {
 *     unsigned int Length;
 *     RPC_SYNTAX_IDENTIFIER InterfaceId;
 *     RPC_SYNTAX_IDENTIFIER TransferSyntax;
 *     PRPC_DISPATCH_TABLE DispatchTable;
 *     unsigned int RpcProtseqEndpointCount;
 *     PRPC_PROTSEQ_ENDPOINT RpcProtseqEndpoint;
 *     ULONG_PTR Reserved;
 *     const void *InterpreterInfo;
 *     unsigned int Flags;
 * }
 * }
 */
public class _RPC_CLIENT_INTERFACE {

    _RPC_CLIENT_INTERFACE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_INT.withName("Length"),
        _RPC_SYNTAX_IDENTIFIER.layout().withName("InterfaceId"),
        _RPC_SYNTAX_IDENTIFIER.layout().withName("TransferSyntax"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("DispatchTable"),
        winapi.C_INT.withName("RpcProtseqEndpointCount"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("RpcProtseqEndpoint"),
        winapi.C_LONG_LONG.withName("Reserved"),
        winapi.C_POINTER.withName("InterpreterInfo"),
        winapi.C_INT.withName("Flags"),
        MemoryLayout.paddingLayout(4)
    ).withName("_RPC_CLIENT_INTERFACE");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Length$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Length"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int Length
     * }
     */
    public static final OfInt Length$layout() {
        return Length$LAYOUT;
    }

    private static final long Length$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int Length
     * }
     */
    public static final long Length$offset() {
        return Length$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int Length
     * }
     */
    public static int Length(MemorySegment struct) {
        return struct.get(Length$LAYOUT, Length$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int Length
     * }
     */
    public static void Length(MemorySegment struct, int fieldValue) {
        struct.set(Length$LAYOUT, Length$OFFSET, fieldValue);
    }

    private static final GroupLayout InterfaceId$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("InterfaceId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RPC_SYNTAX_IDENTIFIER InterfaceId
     * }
     */
    public static final GroupLayout InterfaceId$layout() {
        return InterfaceId$LAYOUT;
    }

    private static final long InterfaceId$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RPC_SYNTAX_IDENTIFIER InterfaceId
     * }
     */
    public static final long InterfaceId$offset() {
        return InterfaceId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RPC_SYNTAX_IDENTIFIER InterfaceId
     * }
     */
    public static MemorySegment InterfaceId(MemorySegment struct) {
        return struct.asSlice(InterfaceId$OFFSET, InterfaceId$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RPC_SYNTAX_IDENTIFIER InterfaceId
     * }
     */
    public static void InterfaceId(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, InterfaceId$OFFSET, InterfaceId$LAYOUT.byteSize());
    }

    private static final GroupLayout TransferSyntax$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("TransferSyntax"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RPC_SYNTAX_IDENTIFIER TransferSyntax
     * }
     */
    public static final GroupLayout TransferSyntax$layout() {
        return TransferSyntax$LAYOUT;
    }

    private static final long TransferSyntax$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RPC_SYNTAX_IDENTIFIER TransferSyntax
     * }
     */
    public static final long TransferSyntax$offset() {
        return TransferSyntax$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RPC_SYNTAX_IDENTIFIER TransferSyntax
     * }
     */
    public static MemorySegment TransferSyntax(MemorySegment struct) {
        return struct.asSlice(TransferSyntax$OFFSET, TransferSyntax$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RPC_SYNTAX_IDENTIFIER TransferSyntax
     * }
     */
    public static void TransferSyntax(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, TransferSyntax$OFFSET, TransferSyntax$LAYOUT.byteSize());
    }

    private static final AddressLayout DispatchTable$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("DispatchTable"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PRPC_DISPATCH_TABLE DispatchTable
     * }
     */
    public static final AddressLayout DispatchTable$layout() {
        return DispatchTable$LAYOUT;
    }

    private static final long DispatchTable$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PRPC_DISPATCH_TABLE DispatchTable
     * }
     */
    public static final long DispatchTable$offset() {
        return DispatchTable$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PRPC_DISPATCH_TABLE DispatchTable
     * }
     */
    public static MemorySegment DispatchTable(MemorySegment struct) {
        return struct.get(DispatchTable$LAYOUT, DispatchTable$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PRPC_DISPATCH_TABLE DispatchTable
     * }
     */
    public static void DispatchTable(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(DispatchTable$LAYOUT, DispatchTable$OFFSET, fieldValue);
    }

    private static final OfInt RpcProtseqEndpointCount$LAYOUT = (OfInt)$LAYOUT.select(groupElement("RpcProtseqEndpointCount"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int RpcProtseqEndpointCount
     * }
     */
    public static final OfInt RpcProtseqEndpointCount$layout() {
        return RpcProtseqEndpointCount$LAYOUT;
    }

    private static final long RpcProtseqEndpointCount$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int RpcProtseqEndpointCount
     * }
     */
    public static final long RpcProtseqEndpointCount$offset() {
        return RpcProtseqEndpointCount$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int RpcProtseqEndpointCount
     * }
     */
    public static int RpcProtseqEndpointCount(MemorySegment struct) {
        return struct.get(RpcProtseqEndpointCount$LAYOUT, RpcProtseqEndpointCount$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int RpcProtseqEndpointCount
     * }
     */
    public static void RpcProtseqEndpointCount(MemorySegment struct, int fieldValue) {
        struct.set(RpcProtseqEndpointCount$LAYOUT, RpcProtseqEndpointCount$OFFSET, fieldValue);
    }

    private static final AddressLayout RpcProtseqEndpoint$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("RpcProtseqEndpoint"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PRPC_PROTSEQ_ENDPOINT RpcProtseqEndpoint
     * }
     */
    public static final AddressLayout RpcProtseqEndpoint$layout() {
        return RpcProtseqEndpoint$LAYOUT;
    }

    private static final long RpcProtseqEndpoint$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PRPC_PROTSEQ_ENDPOINT RpcProtseqEndpoint
     * }
     */
    public static final long RpcProtseqEndpoint$offset() {
        return RpcProtseqEndpoint$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PRPC_PROTSEQ_ENDPOINT RpcProtseqEndpoint
     * }
     */
    public static MemorySegment RpcProtseqEndpoint(MemorySegment struct) {
        return struct.get(RpcProtseqEndpoint$LAYOUT, RpcProtseqEndpoint$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PRPC_PROTSEQ_ENDPOINT RpcProtseqEndpoint
     * }
     */
    public static void RpcProtseqEndpoint(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(RpcProtseqEndpoint$LAYOUT, RpcProtseqEndpoint$OFFSET, fieldValue);
    }

    private static final OfLong Reserved$LAYOUT = (OfLong)$LAYOUT.select(groupElement("Reserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG_PTR Reserved
     * }
     */
    public static final OfLong Reserved$layout() {
        return Reserved$LAYOUT;
    }

    private static final long Reserved$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG_PTR Reserved
     * }
     */
    public static final long Reserved$offset() {
        return Reserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG_PTR Reserved
     * }
     */
    public static long Reserved(MemorySegment struct) {
        return struct.get(Reserved$LAYOUT, Reserved$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG_PTR Reserved
     * }
     */
    public static void Reserved(MemorySegment struct, long fieldValue) {
        struct.set(Reserved$LAYOUT, Reserved$OFFSET, fieldValue);
    }

    private static final AddressLayout InterpreterInfo$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("InterpreterInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * const void *InterpreterInfo
     * }
     */
    public static final AddressLayout InterpreterInfo$layout() {
        return InterpreterInfo$LAYOUT;
    }

    private static final long InterpreterInfo$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * const void *InterpreterInfo
     * }
     */
    public static final long InterpreterInfo$offset() {
        return InterpreterInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * const void *InterpreterInfo
     * }
     */
    public static MemorySegment InterpreterInfo(MemorySegment struct) {
        return struct.get(InterpreterInfo$LAYOUT, InterpreterInfo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * const void *InterpreterInfo
     * }
     */
    public static void InterpreterInfo(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(InterpreterInfo$LAYOUT, InterpreterInfo$OFFSET, fieldValue);
    }

    private static final OfInt Flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int Flags
     * }
     */
    public static final OfInt Flags$layout() {
        return Flags$LAYOUT;
    }

    private static final long Flags$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int Flags
     * }
     */
    public static final long Flags$offset() {
        return Flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int Flags
     * }
     */
    public static int Flags(MemorySegment struct) {
        return struct.get(Flags$LAYOUT, Flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int Flags
     * }
     */
    public static void Flags(MemorySegment struct, int fieldValue) {
        struct.set(Flags$LAYOUT, Flags$OFFSET, fieldValue);
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

