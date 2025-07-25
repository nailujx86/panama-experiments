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
 * struct _OLESTREAMVTBL {
 *     DWORD (*Get)(LPOLESTREAM, void *, DWORD) __attribute__((stdcall));
 *     DWORD (*Put)(LPOLESTREAM, const void *, DWORD) __attribute__((stdcall));
 * }
 * }
 */
public class _OLESTREAMVTBL {

    _OLESTREAMVTBL() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_POINTER.withName("Get"),
        winapi.C_POINTER.withName("Put")
    ).withName("_OLESTREAMVTBL");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    /**
     * {@snippet lang=c :
     * DWORD (*Get)(LPOLESTREAM, void *, DWORD) __attribute__((stdcall))
     * }
     */
    public static class Get {

        Get() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, MemorySegment _x1, int _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            winapi.C_LONG,
            winapi.C_POINTER,
            winapi.C_POINTER,
            winapi.C_LONG
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = winapi.upcallHandle(Get.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(Get.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, int _x2) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout Get$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("Get"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD (*Get)(LPOLESTREAM, void *, DWORD) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout Get$layout() {
        return Get$LAYOUT;
    }

    private static final long Get$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD (*Get)(LPOLESTREAM, void *, DWORD) __attribute__((stdcall))
     * }
     */
    public static final long Get$offset() {
        return Get$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD (*Get)(LPOLESTREAM, void *, DWORD) __attribute__((stdcall))
     * }
     */
    public static MemorySegment Get(MemorySegment struct) {
        return struct.get(Get$LAYOUT, Get$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD (*Get)(LPOLESTREAM, void *, DWORD) __attribute__((stdcall))
     * }
     */
    public static void Get(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Get$LAYOUT, Get$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * DWORD (*Put)(LPOLESTREAM, const void *, DWORD) __attribute__((stdcall))
     * }
     */
    public static class Put {

        Put() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, MemorySegment _x1, int _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            winapi.C_LONG,
            winapi.C_POINTER,
            winapi.C_POINTER,
            winapi.C_LONG
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = winapi.upcallHandle(Put.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(Put.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, int _x2) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout Put$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("Put"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD (*Put)(LPOLESTREAM, const void *, DWORD) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout Put$layout() {
        return Put$LAYOUT;
    }

    private static final long Put$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD (*Put)(LPOLESTREAM, const void *, DWORD) __attribute__((stdcall))
     * }
     */
    public static final long Put$offset() {
        return Put$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD (*Put)(LPOLESTREAM, const void *, DWORD) __attribute__((stdcall))
     * }
     */
    public static MemorySegment Put(MemorySegment struct) {
        return struct.get(Put$LAYOUT, Put$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD (*Put)(LPOLESTREAM, const void *, DWORD) __attribute__((stdcall))
     * }
     */
    public static void Put(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Put$LAYOUT, Put$OFFSET, fieldValue);
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

