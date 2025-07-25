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
 * struct _DISPATCHER_CONTEXT_ARM64 {
 *     ULONG_PTR ControlPc;
 *     ULONG_PTR ImageBase;
 *     PARM64_RUNTIME_FUNCTION FunctionEntry;
 *     ULONG_PTR EstablisherFrame;
 *     ULONG_PTR TargetPc;
 *     PARM64_NT_CONTEXT ContextRecord;
 *     PEXCEPTION_ROUTINE LanguageHandler;
 *     PVOID HandlerData;
 *     struct _UNWIND_HISTORY_TABLE *HistoryTable;
 *     DWORD ScopeIndex;
 *     BOOLEAN ControlPcIsUnwound;
 *     PBYTE NonVolatileRegisters;
 * }
 * }
 */
public class _DISPATCHER_CONTEXT_ARM64 {

    _DISPATCHER_CONTEXT_ARM64() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG_LONG.withName("ControlPc"),
        winapi.C_LONG_LONG.withName("ImageBase"),
        winapi.C_POINTER.withName("FunctionEntry"),
        winapi.C_LONG_LONG.withName("EstablisherFrame"),
        winapi.C_LONG_LONG.withName("TargetPc"),
        winapi.C_POINTER.withName("ContextRecord"),
        winapi.C_POINTER.withName("LanguageHandler"),
        winapi.C_POINTER.withName("HandlerData"),
        winapi.C_POINTER.withName("HistoryTable"),
        winapi.C_LONG.withName("ScopeIndex"),
        winapi.C_CHAR.withName("ControlPcIsUnwound"),
        MemoryLayout.paddingLayout(3),
        winapi.C_POINTER.withName("NonVolatileRegisters")
    ).withName("_DISPATCHER_CONTEXT_ARM64");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfLong ControlPc$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ControlPc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG_PTR ControlPc
     * }
     */
    public static final OfLong ControlPc$layout() {
        return ControlPc$LAYOUT;
    }

    private static final long ControlPc$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG_PTR ControlPc
     * }
     */
    public static final long ControlPc$offset() {
        return ControlPc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG_PTR ControlPc
     * }
     */
    public static long ControlPc(MemorySegment struct) {
        return struct.get(ControlPc$LAYOUT, ControlPc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG_PTR ControlPc
     * }
     */
    public static void ControlPc(MemorySegment struct, long fieldValue) {
        struct.set(ControlPc$LAYOUT, ControlPc$OFFSET, fieldValue);
    }

    private static final OfLong ImageBase$LAYOUT = (OfLong)$LAYOUT.select(groupElement("ImageBase"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG_PTR ImageBase
     * }
     */
    public static final OfLong ImageBase$layout() {
        return ImageBase$LAYOUT;
    }

    private static final long ImageBase$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG_PTR ImageBase
     * }
     */
    public static final long ImageBase$offset() {
        return ImageBase$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG_PTR ImageBase
     * }
     */
    public static long ImageBase(MemorySegment struct) {
        return struct.get(ImageBase$LAYOUT, ImageBase$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG_PTR ImageBase
     * }
     */
    public static void ImageBase(MemorySegment struct, long fieldValue) {
        struct.set(ImageBase$LAYOUT, ImageBase$OFFSET, fieldValue);
    }

    private static final AddressLayout FunctionEntry$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("FunctionEntry"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PARM64_RUNTIME_FUNCTION FunctionEntry
     * }
     */
    public static final AddressLayout FunctionEntry$layout() {
        return FunctionEntry$LAYOUT;
    }

    private static final long FunctionEntry$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PARM64_RUNTIME_FUNCTION FunctionEntry
     * }
     */
    public static final long FunctionEntry$offset() {
        return FunctionEntry$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PARM64_RUNTIME_FUNCTION FunctionEntry
     * }
     */
    public static MemorySegment FunctionEntry(MemorySegment struct) {
        return struct.get(FunctionEntry$LAYOUT, FunctionEntry$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PARM64_RUNTIME_FUNCTION FunctionEntry
     * }
     */
    public static void FunctionEntry(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(FunctionEntry$LAYOUT, FunctionEntry$OFFSET, fieldValue);
    }

    private static final OfLong EstablisherFrame$LAYOUT = (OfLong)$LAYOUT.select(groupElement("EstablisherFrame"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG_PTR EstablisherFrame
     * }
     */
    public static final OfLong EstablisherFrame$layout() {
        return EstablisherFrame$LAYOUT;
    }

    private static final long EstablisherFrame$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG_PTR EstablisherFrame
     * }
     */
    public static final long EstablisherFrame$offset() {
        return EstablisherFrame$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG_PTR EstablisherFrame
     * }
     */
    public static long EstablisherFrame(MemorySegment struct) {
        return struct.get(EstablisherFrame$LAYOUT, EstablisherFrame$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG_PTR EstablisherFrame
     * }
     */
    public static void EstablisherFrame(MemorySegment struct, long fieldValue) {
        struct.set(EstablisherFrame$LAYOUT, EstablisherFrame$OFFSET, fieldValue);
    }

    private static final OfLong TargetPc$LAYOUT = (OfLong)$LAYOUT.select(groupElement("TargetPc"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG_PTR TargetPc
     * }
     */
    public static final OfLong TargetPc$layout() {
        return TargetPc$LAYOUT;
    }

    private static final long TargetPc$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG_PTR TargetPc
     * }
     */
    public static final long TargetPc$offset() {
        return TargetPc$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG_PTR TargetPc
     * }
     */
    public static long TargetPc(MemorySegment struct) {
        return struct.get(TargetPc$LAYOUT, TargetPc$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG_PTR TargetPc
     * }
     */
    public static void TargetPc(MemorySegment struct, long fieldValue) {
        struct.set(TargetPc$LAYOUT, TargetPc$OFFSET, fieldValue);
    }

    private static final AddressLayout ContextRecord$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("ContextRecord"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PARM64_NT_CONTEXT ContextRecord
     * }
     */
    public static final AddressLayout ContextRecord$layout() {
        return ContextRecord$LAYOUT;
    }

    private static final long ContextRecord$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PARM64_NT_CONTEXT ContextRecord
     * }
     */
    public static final long ContextRecord$offset() {
        return ContextRecord$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PARM64_NT_CONTEXT ContextRecord
     * }
     */
    public static MemorySegment ContextRecord(MemorySegment struct) {
        return struct.get(ContextRecord$LAYOUT, ContextRecord$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PARM64_NT_CONTEXT ContextRecord
     * }
     */
    public static void ContextRecord(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ContextRecord$LAYOUT, ContextRecord$OFFSET, fieldValue);
    }

    private static final AddressLayout LanguageHandler$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("LanguageHandler"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PEXCEPTION_ROUTINE LanguageHandler
     * }
     */
    public static final AddressLayout LanguageHandler$layout() {
        return LanguageHandler$LAYOUT;
    }

    private static final long LanguageHandler$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PEXCEPTION_ROUTINE LanguageHandler
     * }
     */
    public static final long LanguageHandler$offset() {
        return LanguageHandler$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PEXCEPTION_ROUTINE LanguageHandler
     * }
     */
    public static MemorySegment LanguageHandler(MemorySegment struct) {
        return struct.get(LanguageHandler$LAYOUT, LanguageHandler$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PEXCEPTION_ROUTINE LanguageHandler
     * }
     */
    public static void LanguageHandler(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(LanguageHandler$LAYOUT, LanguageHandler$OFFSET, fieldValue);
    }

    private static final AddressLayout HandlerData$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("HandlerData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PVOID HandlerData
     * }
     */
    public static final AddressLayout HandlerData$layout() {
        return HandlerData$LAYOUT;
    }

    private static final long HandlerData$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PVOID HandlerData
     * }
     */
    public static final long HandlerData$offset() {
        return HandlerData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PVOID HandlerData
     * }
     */
    public static MemorySegment HandlerData(MemorySegment struct) {
        return struct.get(HandlerData$LAYOUT, HandlerData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PVOID HandlerData
     * }
     */
    public static void HandlerData(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(HandlerData$LAYOUT, HandlerData$OFFSET, fieldValue);
    }

    private static final AddressLayout HistoryTable$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("HistoryTable"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct _UNWIND_HISTORY_TABLE *HistoryTable
     * }
     */
    public static final AddressLayout HistoryTable$layout() {
        return HistoryTable$LAYOUT;
    }

    private static final long HistoryTable$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct _UNWIND_HISTORY_TABLE *HistoryTable
     * }
     */
    public static final long HistoryTable$offset() {
        return HistoryTable$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct _UNWIND_HISTORY_TABLE *HistoryTable
     * }
     */
    public static MemorySegment HistoryTable(MemorySegment struct) {
        return struct.get(HistoryTable$LAYOUT, HistoryTable$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct _UNWIND_HISTORY_TABLE *HistoryTable
     * }
     */
    public static void HistoryTable(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(HistoryTable$LAYOUT, HistoryTable$OFFSET, fieldValue);
    }

    private static final OfInt ScopeIndex$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ScopeIndex"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD ScopeIndex
     * }
     */
    public static final OfInt ScopeIndex$layout() {
        return ScopeIndex$LAYOUT;
    }

    private static final long ScopeIndex$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD ScopeIndex
     * }
     */
    public static final long ScopeIndex$offset() {
        return ScopeIndex$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD ScopeIndex
     * }
     */
    public static int ScopeIndex(MemorySegment struct) {
        return struct.get(ScopeIndex$LAYOUT, ScopeIndex$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD ScopeIndex
     * }
     */
    public static void ScopeIndex(MemorySegment struct, int fieldValue) {
        struct.set(ScopeIndex$LAYOUT, ScopeIndex$OFFSET, fieldValue);
    }

    private static final OfByte ControlPcIsUnwound$LAYOUT = (OfByte)$LAYOUT.select(groupElement("ControlPcIsUnwound"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOLEAN ControlPcIsUnwound
     * }
     */
    public static final OfByte ControlPcIsUnwound$layout() {
        return ControlPcIsUnwound$LAYOUT;
    }

    private static final long ControlPcIsUnwound$OFFSET = 76;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOLEAN ControlPcIsUnwound
     * }
     */
    public static final long ControlPcIsUnwound$offset() {
        return ControlPcIsUnwound$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOLEAN ControlPcIsUnwound
     * }
     */
    public static byte ControlPcIsUnwound(MemorySegment struct) {
        return struct.get(ControlPcIsUnwound$LAYOUT, ControlPcIsUnwound$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOLEAN ControlPcIsUnwound
     * }
     */
    public static void ControlPcIsUnwound(MemorySegment struct, byte fieldValue) {
        struct.set(ControlPcIsUnwound$LAYOUT, ControlPcIsUnwound$OFFSET, fieldValue);
    }

    private static final AddressLayout NonVolatileRegisters$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("NonVolatileRegisters"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PBYTE NonVolatileRegisters
     * }
     */
    public static final AddressLayout NonVolatileRegisters$layout() {
        return NonVolatileRegisters$LAYOUT;
    }

    private static final long NonVolatileRegisters$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PBYTE NonVolatileRegisters
     * }
     */
    public static final long NonVolatileRegisters$offset() {
        return NonVolatileRegisters$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PBYTE NonVolatileRegisters
     * }
     */
    public static MemorySegment NonVolatileRegisters(MemorySegment struct) {
        return struct.get(NonVolatileRegisters$LAYOUT, NonVolatileRegisters$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PBYTE NonVolatileRegisters
     * }
     */
    public static void NonVolatileRegisters(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(NonVolatileRegisters$LAYOUT, NonVolatileRegisters$OFFSET, fieldValue);
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

