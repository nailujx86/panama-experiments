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
 * struct ISurrogateServiceVtbl {
 *     HRESULT (*QueryInterface)(ISurrogateService *, const IID *const, void **) __attribute__((stdcall));
 *     ULONG (*AddRef)(ISurrogateService *) __attribute__((stdcall));
 *     ULONG (*Release)(ISurrogateService *) __attribute__((stdcall));
 *     HRESULT (*Init)(ISurrogateService *, const GUID *const, IProcessLock *, BOOL *) __attribute__((stdcall));
 *     HRESULT (*ApplicationLaunch)(ISurrogateService *, const GUID *const, ApplicationType) __attribute__((stdcall));
 *     HRESULT (*ApplicationFree)(ISurrogateService *, const GUID *const) __attribute__((stdcall));
 *     HRESULT (*CatalogRefresh)(ISurrogateService *, ULONG) __attribute__((stdcall));
 *     HRESULT (*ProcessShutdown)(ISurrogateService *, ShutdownType) __attribute__((stdcall));
 * }
 * }
 */
public class ISurrogateServiceVtbl {

    ISurrogateServiceVtbl() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_POINTER.withName("QueryInterface"),
        winapi.C_POINTER.withName("AddRef"),
        winapi.C_POINTER.withName("Release"),
        winapi.C_POINTER.withName("Init"),
        winapi.C_POINTER.withName("ApplicationLaunch"),
        winapi.C_POINTER.withName("ApplicationFree"),
        winapi.C_POINTER.withName("CatalogRefresh"),
        winapi.C_POINTER.withName("ProcessShutdown")
    ).withName("ISurrogateServiceVtbl");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(ISurrogateService *, const IID *const, void **) __attribute__((stdcall))
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
     * HRESULT (*QueryInterface)(ISurrogateService *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout QueryInterface$layout() {
        return QueryInterface$LAYOUT;
    }

    private static final long QueryInterface$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(ISurrogateService *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static final long QueryInterface$offset() {
        return QueryInterface$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(ISurrogateService *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static MemorySegment QueryInterface(MemorySegment struct) {
        return struct.get(QueryInterface$LAYOUT, QueryInterface$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(ISurrogateService *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static void QueryInterface(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(QueryInterface$LAYOUT, QueryInterface$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * ULONG (*AddRef)(ISurrogateService *) __attribute__((stdcall))
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
     * ULONG (*AddRef)(ISurrogateService *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout AddRef$layout() {
        return AddRef$LAYOUT;
    }

    private static final long AddRef$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG (*AddRef)(ISurrogateService *) __attribute__((stdcall))
     * }
     */
    public static final long AddRef$offset() {
        return AddRef$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG (*AddRef)(ISurrogateService *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment AddRef(MemorySegment struct) {
        return struct.get(AddRef$LAYOUT, AddRef$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG (*AddRef)(ISurrogateService *) __attribute__((stdcall))
     * }
     */
    public static void AddRef(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(AddRef$LAYOUT, AddRef$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * ULONG (*Release)(ISurrogateService *) __attribute__((stdcall))
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
     * ULONG (*Release)(ISurrogateService *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout Release$layout() {
        return Release$LAYOUT;
    }

    private static final long Release$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG (*Release)(ISurrogateService *) __attribute__((stdcall))
     * }
     */
    public static final long Release$offset() {
        return Release$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG (*Release)(ISurrogateService *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment Release(MemorySegment struct) {
        return struct.get(Release$LAYOUT, Release$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG (*Release)(ISurrogateService *) __attribute__((stdcall))
     * }
     */
    public static void Release(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Release$LAYOUT, Release$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*Init)(ISurrogateService *, const GUID *const, IProcessLock *, BOOL *) __attribute__((stdcall))
     * }
     */
    public static class Init {

        Init() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, MemorySegment _x3);
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

        private static final MethodHandle UP$MH = winapi.upcallHandle(Init.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(Init.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2, MemorySegment _x3) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout Init$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("Init"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*Init)(ISurrogateService *, const GUID *const, IProcessLock *, BOOL *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout Init$layout() {
        return Init$LAYOUT;
    }

    private static final long Init$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*Init)(ISurrogateService *, const GUID *const, IProcessLock *, BOOL *) __attribute__((stdcall))
     * }
     */
    public static final long Init$offset() {
        return Init$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*Init)(ISurrogateService *, const GUID *const, IProcessLock *, BOOL *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment Init(MemorySegment struct) {
        return struct.get(Init$LAYOUT, Init$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*Init)(ISurrogateService *, const GUID *const, IProcessLock *, BOOL *) __attribute__((stdcall))
     * }
     */
    public static void Init(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Init$LAYOUT, Init$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*ApplicationLaunch)(ISurrogateService *, const GUID *const, ApplicationType) __attribute__((stdcall))
     * }
     */
    public static class ApplicationLaunch {

        ApplicationLaunch() {
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
            winapi.C_INT
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = winapi.upcallHandle(ApplicationLaunch.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(ApplicationLaunch.Function fi, Arena arena) {
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

    private static final AddressLayout ApplicationLaunch$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("ApplicationLaunch"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*ApplicationLaunch)(ISurrogateService *, const GUID *const, ApplicationType) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout ApplicationLaunch$layout() {
        return ApplicationLaunch$LAYOUT;
    }

    private static final long ApplicationLaunch$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*ApplicationLaunch)(ISurrogateService *, const GUID *const, ApplicationType) __attribute__((stdcall))
     * }
     */
    public static final long ApplicationLaunch$offset() {
        return ApplicationLaunch$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*ApplicationLaunch)(ISurrogateService *, const GUID *const, ApplicationType) __attribute__((stdcall))
     * }
     */
    public static MemorySegment ApplicationLaunch(MemorySegment struct) {
        return struct.get(ApplicationLaunch$LAYOUT, ApplicationLaunch$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*ApplicationLaunch)(ISurrogateService *, const GUID *const, ApplicationType) __attribute__((stdcall))
     * }
     */
    public static void ApplicationLaunch(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ApplicationLaunch$LAYOUT, ApplicationLaunch$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*ApplicationFree)(ISurrogateService *, const GUID *const) __attribute__((stdcall))
     * }
     */
    public static class ApplicationFree {

        ApplicationFree() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, MemorySegment _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
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

        private static final MethodHandle UP$MH = winapi.upcallHandle(ApplicationFree.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(ApplicationFree.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout ApplicationFree$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("ApplicationFree"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*ApplicationFree)(ISurrogateService *, const GUID *const) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout ApplicationFree$layout() {
        return ApplicationFree$LAYOUT;
    }

    private static final long ApplicationFree$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*ApplicationFree)(ISurrogateService *, const GUID *const) __attribute__((stdcall))
     * }
     */
    public static final long ApplicationFree$offset() {
        return ApplicationFree$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*ApplicationFree)(ISurrogateService *, const GUID *const) __attribute__((stdcall))
     * }
     */
    public static MemorySegment ApplicationFree(MemorySegment struct) {
        return struct.get(ApplicationFree$LAYOUT, ApplicationFree$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*ApplicationFree)(ISurrogateService *, const GUID *const) __attribute__((stdcall))
     * }
     */
    public static void ApplicationFree(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ApplicationFree$LAYOUT, ApplicationFree$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*CatalogRefresh)(ISurrogateService *, ULONG) __attribute__((stdcall))
     * }
     */
    public static class CatalogRefresh {

        CatalogRefresh() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, int _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            winapi.C_LONG,
            winapi.C_POINTER,
            winapi.C_LONG
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = winapi.upcallHandle(CatalogRefresh.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(CatalogRefresh.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout CatalogRefresh$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("CatalogRefresh"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*CatalogRefresh)(ISurrogateService *, ULONG) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout CatalogRefresh$layout() {
        return CatalogRefresh$LAYOUT;
    }

    private static final long CatalogRefresh$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*CatalogRefresh)(ISurrogateService *, ULONG) __attribute__((stdcall))
     * }
     */
    public static final long CatalogRefresh$offset() {
        return CatalogRefresh$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*CatalogRefresh)(ISurrogateService *, ULONG) __attribute__((stdcall))
     * }
     */
    public static MemorySegment CatalogRefresh(MemorySegment struct) {
        return struct.get(CatalogRefresh$LAYOUT, CatalogRefresh$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*CatalogRefresh)(ISurrogateService *, ULONG) __attribute__((stdcall))
     * }
     */
    public static void CatalogRefresh(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(CatalogRefresh$LAYOUT, CatalogRefresh$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*ProcessShutdown)(ISurrogateService *, ShutdownType) __attribute__((stdcall))
     * }
     */
    public static class ProcessShutdown {

        ProcessShutdown() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, int _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            winapi.C_LONG,
            winapi.C_POINTER,
            winapi.C_INT
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = winapi.upcallHandle(ProcessShutdown.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(ProcessShutdown.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout ProcessShutdown$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("ProcessShutdown"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*ProcessShutdown)(ISurrogateService *, ShutdownType) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout ProcessShutdown$layout() {
        return ProcessShutdown$LAYOUT;
    }

    private static final long ProcessShutdown$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*ProcessShutdown)(ISurrogateService *, ShutdownType) __attribute__((stdcall))
     * }
     */
    public static final long ProcessShutdown$offset() {
        return ProcessShutdown$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*ProcessShutdown)(ISurrogateService *, ShutdownType) __attribute__((stdcall))
     * }
     */
    public static MemorySegment ProcessShutdown(MemorySegment struct) {
        return struct.get(ProcessShutdown$LAYOUT, ProcessShutdown$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*ProcessShutdown)(ISurrogateService *, ShutdownType) __attribute__((stdcall))
     * }
     */
    public static void ProcessShutdown(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ProcessShutdown$LAYOUT, ProcessShutdown$OFFSET, fieldValue);
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

