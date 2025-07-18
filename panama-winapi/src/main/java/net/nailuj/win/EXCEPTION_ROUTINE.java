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
 * typedef EXCEPTION_DISPOSITION (EXCEPTION_ROUTINE)(struct _EXCEPTION_RECORD {
 *     DWORD ExceptionCode;
 *     DWORD ExceptionFlags;
 *     struct _EXCEPTION_RECORD *ExceptionRecord;
 *     PVOID ExceptionAddress;
 *     DWORD NumberParameters;
 *     ULONG_PTR ExceptionInformation[15];
 * } *, PVOID, struct _CONTEXT {
 *     DWORD64 P1Home;
 *     DWORD64 P2Home;
 *     DWORD64 P3Home;
 *     DWORD64 P4Home;
 *     DWORD64 P5Home;
 *     DWORD64 P6Home;
 *     DWORD ContextFlags;
 *     DWORD MxCsr;
 *     WORD SegCs;
 *     WORD SegDs;
 *     WORD SegEs;
 *     WORD SegFs;
 *     WORD SegGs;
 *     WORD SegSs;
 *     DWORD EFlags;
 *     DWORD64 Dr0;
 *     DWORD64 Dr1;
 *     DWORD64 Dr2;
 *     DWORD64 Dr3;
 *     DWORD64 Dr6;
 *     DWORD64 Dr7;
 *     DWORD64 Rax;
 *     DWORD64 Rcx;
 *     DWORD64 Rdx;
 *     DWORD64 Rbx;
 *     DWORD64 Rsp;
 *     DWORD64 Rbp;
 *     DWORD64 Rsi;
 *     DWORD64 Rdi;
 *     DWORD64 R8;
 *     DWORD64 R9;
 *     DWORD64 R10;
 *     DWORD64 R11;
 *     DWORD64 R12;
 *     DWORD64 R13;
 *     DWORD64 R14;
 *     DWORD64 R15;
 *     DWORD64 Rip;
 *     union {
 *         XMM_SAVE_AREA32 FltSave;
 *         struct {
 *             M128A Header[2];
 *             M128A Legacy[8];
 *             M128A Xmm0;
 *             M128A Xmm1;
 *             M128A Xmm2;
 *             M128A Xmm3;
 *             M128A Xmm4;
 *             M128A Xmm5;
 *             M128A Xmm6;
 *             M128A Xmm7;
 *             M128A Xmm8;
 *             M128A Xmm9;
 *             M128A Xmm10;
 *             M128A Xmm11;
 *             M128A Xmm12;
 *             M128A Xmm13;
 *             M128A Xmm14;
 *             M128A Xmm15;
 *         };
 *     };
 *     M128A VectorRegister[26];
 *     DWORD64 VectorControl;
 *     DWORD64 DebugControl;
 *     DWORD64 LastBranchToRip;
 *     DWORD64 LastBranchFromRip;
 *     DWORD64 LastExceptionToRip;
 *     DWORD64 LastExceptionFromRip;
 * } *, PVOID) __attribute__((stdcall))
 * }
 */
public class EXCEPTION_ROUTINE {

    EXCEPTION_ROUTINE() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        int apply(MemorySegment ExceptionRecord, MemorySegment EstablisherFrame, MemorySegment ContextRecord, MemorySegment DispatcherContext);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        winapi.C_INT,
        winapi.C_POINTER,
        winapi.C_POINTER,
        winapi.C_POINTER,
        winapi.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = winapi.upcallHandle(EXCEPTION_ROUTINE.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(EXCEPTION_ROUTINE.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static int invoke(MemorySegment funcPtr,MemorySegment ExceptionRecord, MemorySegment EstablisherFrame, MemorySegment ContextRecord, MemorySegment DispatcherContext) {
        try {
            return (int) DOWN$MH.invokeExact(funcPtr, ExceptionRecord, EstablisherFrame, ContextRecord, DispatcherContext);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

