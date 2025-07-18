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
 * typedef DWORD (OUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK)(HANDLE, PVOID, PDWORD, PRUNTIME_FUNCTION *)
 * }
 */
public class OUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK {

    OUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        int apply(MemorySegment Process_, MemorySegment TableAddress, MemorySegment Entries, MemorySegment Functions);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        winapi.C_LONG,
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

    private static final MethodHandle UP$MH = winapi.upcallHandle(OUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(OUT_OF_PROCESS_FUNCTION_TABLE_CALLBACK.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static int invoke(MemorySegment funcPtr,MemorySegment Process_, MemorySegment TableAddress, MemorySegment Entries, MemorySegment Functions) {
        try {
            return (int) DOWN$MH.invokeExact(funcPtr, Process_, TableAddress, Entries, Functions);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

