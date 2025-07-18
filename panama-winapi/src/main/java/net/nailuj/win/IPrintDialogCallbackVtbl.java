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
 * struct IPrintDialogCallbackVtbl {
 *     HRESULT (*QueryInterface)(IPrintDialogCallback *, const IID *const, void **) __attribute__((stdcall));
 *     ULONG (*AddRef)(IPrintDialogCallback *) __attribute__((stdcall));
 *     ULONG (*Release)(IPrintDialogCallback *) __attribute__((stdcall));
 *     HRESULT (*InitDone)(IPrintDialogCallback *) __attribute__((stdcall));
 *     HRESULT (*SelectionChange)(IPrintDialogCallback *) __attribute__((stdcall));
 *     HRESULT (*HandleMessage)(IPrintDialogCallback *, HWND, UINT, WPARAM, LPARAM, LRESULT *) __attribute__((stdcall));
 * }
 * }
 */
public class IPrintDialogCallbackVtbl {

    IPrintDialogCallbackVtbl() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_POINTER.withName("QueryInterface"),
        winapi.C_POINTER.withName("AddRef"),
        winapi.C_POINTER.withName("Release"),
        winapi.C_POINTER.withName("InitDone"),
        winapi.C_POINTER.withName("SelectionChange"),
        winapi.C_POINTER.withName("HandleMessage")
    ).withName("IPrintDialogCallbackVtbl");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(IPrintDialogCallback *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static class QueryInterface {

        QueryInterface() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            winapi.C_LONG,
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

        private static final MethodHandle UP$MH = winapi.upcallHandle(QueryInterface.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(QueryInterface.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout QueryInterface$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("QueryInterface"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(IPrintDialogCallback *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout QueryInterface$layout() {
        return QueryInterface$LAYOUT;
    }

    private static final long QueryInterface$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(IPrintDialogCallback *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static final long QueryInterface$offset() {
        return QueryInterface$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(IPrintDialogCallback *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static MemorySegment QueryInterface(MemorySegment struct) {
        return struct.get(QueryInterface$LAYOUT, QueryInterface$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(IPrintDialogCallback *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static void QueryInterface(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(QueryInterface$LAYOUT, QueryInterface$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * ULONG (*AddRef)(IPrintDialogCallback *) __attribute__((stdcall))
     * }
     */
    public static class AddRef {

        AddRef() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            winapi.C_LONG,
            winapi.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = winapi.upcallHandle(AddRef.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(AddRef.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout AddRef$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("AddRef"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG (*AddRef)(IPrintDialogCallback *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout AddRef$layout() {
        return AddRef$LAYOUT;
    }

    private static final long AddRef$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG (*AddRef)(IPrintDialogCallback *) __attribute__((stdcall))
     * }
     */
    public static final long AddRef$offset() {
        return AddRef$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG (*AddRef)(IPrintDialogCallback *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment AddRef(MemorySegment struct) {
        return struct.get(AddRef$LAYOUT, AddRef$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG (*AddRef)(IPrintDialogCallback *) __attribute__((stdcall))
     * }
     */
    public static void AddRef(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(AddRef$LAYOUT, AddRef$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * ULONG (*Release)(IPrintDialogCallback *) __attribute__((stdcall))
     * }
     */
    public static class Release {

        Release() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            winapi.C_LONG,
            winapi.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = winapi.upcallHandle(Release.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(Release.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout Release$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("Release"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG (*Release)(IPrintDialogCallback *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout Release$layout() {
        return Release$LAYOUT;
    }

    private static final long Release$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG (*Release)(IPrintDialogCallback *) __attribute__((stdcall))
     * }
     */
    public static final long Release$offset() {
        return Release$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG (*Release)(IPrintDialogCallback *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment Release(MemorySegment struct) {
        return struct.get(Release$LAYOUT, Release$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG (*Release)(IPrintDialogCallback *) __attribute__((stdcall))
     * }
     */
    public static void Release(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Release$LAYOUT, Release$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*InitDone)(IPrintDialogCallback *) __attribute__((stdcall))
     * }
     */
    public static class InitDone {

        InitDone() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            winapi.C_LONG,
            winapi.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = winapi.upcallHandle(InitDone.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(InitDone.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout InitDone$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("InitDone"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*InitDone)(IPrintDialogCallback *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout InitDone$layout() {
        return InitDone$LAYOUT;
    }

    private static final long InitDone$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*InitDone)(IPrintDialogCallback *) __attribute__((stdcall))
     * }
     */
    public static final long InitDone$offset() {
        return InitDone$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*InitDone)(IPrintDialogCallback *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment InitDone(MemorySegment struct) {
        return struct.get(InitDone$LAYOUT, InitDone$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*InitDone)(IPrintDialogCallback *) __attribute__((stdcall))
     * }
     */
    public static void InitDone(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(InitDone$LAYOUT, InitDone$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*SelectionChange)(IPrintDialogCallback *) __attribute__((stdcall))
     * }
     */
    public static class SelectionChange {

        SelectionChange() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            winapi.C_LONG,
            winapi.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = winapi.upcallHandle(SelectionChange.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(SelectionChange.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout SelectionChange$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("SelectionChange"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*SelectionChange)(IPrintDialogCallback *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout SelectionChange$layout() {
        return SelectionChange$LAYOUT;
    }

    private static final long SelectionChange$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*SelectionChange)(IPrintDialogCallback *) __attribute__((stdcall))
     * }
     */
    public static final long SelectionChange$offset() {
        return SelectionChange$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*SelectionChange)(IPrintDialogCallback *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment SelectionChange(MemorySegment struct) {
        return struct.get(SelectionChange$LAYOUT, SelectionChange$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*SelectionChange)(IPrintDialogCallback *) __attribute__((stdcall))
     * }
     */
    public static void SelectionChange(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(SelectionChange$LAYOUT, SelectionChange$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*HandleMessage)(IPrintDialogCallback *, HWND, UINT, WPARAM, LPARAM, LRESULT *) __attribute__((stdcall))
     * }
     */
    public static class HandleMessage {

        HandleMessage() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, MemorySegment _x1, int _x2, long _x3, long _x4, MemorySegment _x5);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            winapi.C_LONG,
            winapi.C_POINTER,
            winapi.C_POINTER,
            winapi.C_INT,
            winapi.C_LONG_LONG,
            winapi.C_LONG_LONG,
            winapi.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = winapi.upcallHandle(HandleMessage.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(HandleMessage.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, int _x2, long _x3, long _x4, MemorySegment _x5) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3, _x4, _x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout HandleMessage$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("HandleMessage"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*HandleMessage)(IPrintDialogCallback *, HWND, UINT, WPARAM, LPARAM, LRESULT *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout HandleMessage$layout() {
        return HandleMessage$LAYOUT;
    }

    private static final long HandleMessage$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*HandleMessage)(IPrintDialogCallback *, HWND, UINT, WPARAM, LPARAM, LRESULT *) __attribute__((stdcall))
     * }
     */
    public static final long HandleMessage$offset() {
        return HandleMessage$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*HandleMessage)(IPrintDialogCallback *, HWND, UINT, WPARAM, LPARAM, LRESULT *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment HandleMessage(MemorySegment struct) {
        return struct.get(HandleMessage$LAYOUT, HandleMessage$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*HandleMessage)(IPrintDialogCallback *, HWND, UINT, WPARAM, LPARAM, LRESULT *) __attribute__((stdcall))
     * }
     */
    public static void HandleMessage(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(HandleMessage$LAYOUT, HandleMessage$OFFSET, fieldValue);
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

