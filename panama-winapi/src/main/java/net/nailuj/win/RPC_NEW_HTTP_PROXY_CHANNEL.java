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
 * typedef RPC_STATUS (*RPC_NEW_HTTP_PROXY_CHANNEL)(RPC_HTTP_REDIRECTOR_STAGE, RPC_WSTR, RPC_WSTR, RPC_WSTR, RPC_WSTR, void *, void *, void *, void *, unsigned long, RPC_WSTR *, RPC_WSTR *) __attribute__((stdcall))
 * }
 */
public class RPC_NEW_HTTP_PROXY_CHANNEL {

    RPC_NEW_HTTP_PROXY_CHANNEL() {
        // Should not be called directly
    }

    /**
     * The function pointer signature, expressed as a functional interface
     */
    public interface Function {
        int apply(int RedirectorStage, MemorySegment ServerName, MemorySegment ServerPort, MemorySegment RemoteUser, MemorySegment AuthType, MemorySegment ResourceUuid, MemorySegment SessionId, MemorySegment Interface, MemorySegment Reserved, int Flags, MemorySegment NewServerName, MemorySegment NewServerPort);
    }

    private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
        winapi.C_LONG,
        winapi.C_INT,
        winapi.C_POINTER,
        winapi.C_POINTER,
        winapi.C_POINTER,
        winapi.C_POINTER,
        winapi.C_POINTER,
        winapi.C_POINTER,
        winapi.C_POINTER,
        winapi.C_POINTER,
        winapi.C_LONG,
        winapi.C_POINTER,
        winapi.C_POINTER
    );

    /**
     * The descriptor of this function pointer
     */
    public static FunctionDescriptor descriptor() {
        return $DESC;
    }

    private static final MethodHandle UP$MH = winapi.upcallHandle(RPC_NEW_HTTP_PROXY_CHANNEL.Function.class, "apply", $DESC);

    /**
     * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
     * The lifetime of the returned segment is managed by {@code arena}
     */
    public static MemorySegment allocate(RPC_NEW_HTTP_PROXY_CHANNEL.Function fi, Arena arena) {
        return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
    }

    private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

    /**
     * Invoke the upcall stub {@code funcPtr}, with given parameters
     */
    public static int invoke(MemorySegment funcPtr,int RedirectorStage, MemorySegment ServerName, MemorySegment ServerPort, MemorySegment RemoteUser, MemorySegment AuthType, MemorySegment ResourceUuid, MemorySegment SessionId, MemorySegment Interface, MemorySegment Reserved, int Flags, MemorySegment NewServerName, MemorySegment NewServerPort) {
        try {
            return (int) DOWN$MH.invokeExact(funcPtr, RedirectorStage, ServerName, ServerPort, RemoteUser, AuthType, ResourceUuid, SessionId, Interface, Reserved, Flags, NewServerName, NewServerPort);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}

