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
 * struct IRunningObjectTableVtbl {
 *     HRESULT (*QueryInterface)(IRunningObjectTable *, const IID *const, void **) __attribute__((stdcall));
 *     ULONG (*AddRef)(IRunningObjectTable *) __attribute__((stdcall));
 *     ULONG (*Release)(IRunningObjectTable *) __attribute__((stdcall));
 *     HRESULT (*Register)(IRunningObjectTable *, DWORD, IUnknown *, IMoniker *, DWORD *) __attribute__((stdcall));
 *     HRESULT (*Revoke)(IRunningObjectTable *, DWORD) __attribute__((stdcall));
 *     HRESULT (*IsRunning)(IRunningObjectTable *, IMoniker *) __attribute__((stdcall));
 *     HRESULT (*GetObjectA)(IRunningObjectTable *, IMoniker *, IUnknown **) __attribute__((stdcall));
 *     HRESULT (*NoteChangeTime)(IRunningObjectTable *, DWORD, FILETIME *) __attribute__((stdcall));
 *     HRESULT (*GetTimeOfLastChange)(IRunningObjectTable *, IMoniker *, FILETIME *) __attribute__((stdcall));
 *     HRESULT (*EnumRunning)(IRunningObjectTable *, IEnumMoniker **) __attribute__((stdcall));
 * }
 * }
 */
public class IRunningObjectTableVtbl {

    IRunningObjectTableVtbl() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_POINTER.withName("QueryInterface"),
        winapi.C_POINTER.withName("AddRef"),
        winapi.C_POINTER.withName("Release"),
        winapi.C_POINTER.withName("Register"),
        winapi.C_POINTER.withName("Revoke"),
        winapi.C_POINTER.withName("IsRunning"),
        winapi.C_POINTER.withName("GetObjectA"),
        winapi.C_POINTER.withName("NoteChangeTime"),
        winapi.C_POINTER.withName("GetTimeOfLastChange"),
        winapi.C_POINTER.withName("EnumRunning")
    ).withName("IRunningObjectTableVtbl");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(IRunningObjectTable *, const IID *const, void **) __attribute__((stdcall))
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
     * HRESULT (*QueryInterface)(IRunningObjectTable *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout QueryInterface$layout() {
        return QueryInterface$LAYOUT;
    }

    private static final long QueryInterface$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(IRunningObjectTable *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static final long QueryInterface$offset() {
        return QueryInterface$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(IRunningObjectTable *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static MemorySegment QueryInterface(MemorySegment struct) {
        return struct.get(QueryInterface$LAYOUT, QueryInterface$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*QueryInterface)(IRunningObjectTable *, const IID *const, void **) __attribute__((stdcall))
     * }
     */
    public static void QueryInterface(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(QueryInterface$LAYOUT, QueryInterface$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * ULONG (*AddRef)(IRunningObjectTable *) __attribute__((stdcall))
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
     * ULONG (*AddRef)(IRunningObjectTable *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout AddRef$layout() {
        return AddRef$LAYOUT;
    }

    private static final long AddRef$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG (*AddRef)(IRunningObjectTable *) __attribute__((stdcall))
     * }
     */
    public static final long AddRef$offset() {
        return AddRef$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG (*AddRef)(IRunningObjectTable *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment AddRef(MemorySegment struct) {
        return struct.get(AddRef$LAYOUT, AddRef$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG (*AddRef)(IRunningObjectTable *) __attribute__((stdcall))
     * }
     */
    public static void AddRef(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(AddRef$LAYOUT, AddRef$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * ULONG (*Release)(IRunningObjectTable *) __attribute__((stdcall))
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
     * ULONG (*Release)(IRunningObjectTable *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout Release$layout() {
        return Release$LAYOUT;
    }

    private static final long Release$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG (*Release)(IRunningObjectTable *) __attribute__((stdcall))
     * }
     */
    public static final long Release$offset() {
        return Release$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG (*Release)(IRunningObjectTable *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment Release(MemorySegment struct) {
        return struct.get(Release$LAYOUT, Release$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG (*Release)(IRunningObjectTable *) __attribute__((stdcall))
     * }
     */
    public static void Release(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Release$LAYOUT, Release$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*Register)(IRunningObjectTable *, DWORD, IUnknown *, IMoniker *, DWORD *) __attribute__((stdcall))
     * }
     */
    public static class Register {

        Register() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, int _x1, MemorySegment _x2, MemorySegment _x3, MemorySegment _x4);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            winapi.C_LONG,
            winapi.C_POINTER,
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

        private static final MethodHandle UP$MH = winapi.upcallHandle(Register.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(Register.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1, MemorySegment _x2, MemorySegment _x3, MemorySegment _x4) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3, _x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout Register$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("Register"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*Register)(IRunningObjectTable *, DWORD, IUnknown *, IMoniker *, DWORD *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout Register$layout() {
        return Register$LAYOUT;
    }

    private static final long Register$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*Register)(IRunningObjectTable *, DWORD, IUnknown *, IMoniker *, DWORD *) __attribute__((stdcall))
     * }
     */
    public static final long Register$offset() {
        return Register$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*Register)(IRunningObjectTable *, DWORD, IUnknown *, IMoniker *, DWORD *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment Register(MemorySegment struct) {
        return struct.get(Register$LAYOUT, Register$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*Register)(IRunningObjectTable *, DWORD, IUnknown *, IMoniker *, DWORD *) __attribute__((stdcall))
     * }
     */
    public static void Register(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Register$LAYOUT, Register$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*Revoke)(IRunningObjectTable *, DWORD) __attribute__((stdcall))
     * }
     */
    public static class Revoke {

        Revoke() {
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

        private static final MethodHandle UP$MH = winapi.upcallHandle(Revoke.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(Revoke.Function fi, Arena arena) {
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

    private static final AddressLayout Revoke$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("Revoke"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*Revoke)(IRunningObjectTable *, DWORD) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout Revoke$layout() {
        return Revoke$LAYOUT;
    }

    private static final long Revoke$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*Revoke)(IRunningObjectTable *, DWORD) __attribute__((stdcall))
     * }
     */
    public static final long Revoke$offset() {
        return Revoke$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*Revoke)(IRunningObjectTable *, DWORD) __attribute__((stdcall))
     * }
     */
    public static MemorySegment Revoke(MemorySegment struct) {
        return struct.get(Revoke$LAYOUT, Revoke$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*Revoke)(IRunningObjectTable *, DWORD) __attribute__((stdcall))
     * }
     */
    public static void Revoke(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Revoke$LAYOUT, Revoke$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*IsRunning)(IRunningObjectTable *, IMoniker *) __attribute__((stdcall))
     * }
     */
    public static class IsRunning {

        IsRunning() {
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

        private static final MethodHandle UP$MH = winapi.upcallHandle(IsRunning.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(IsRunning.Function fi, Arena arena) {
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

    private static final AddressLayout IsRunning$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("IsRunning"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*IsRunning)(IRunningObjectTable *, IMoniker *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout IsRunning$layout() {
        return IsRunning$LAYOUT;
    }

    private static final long IsRunning$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*IsRunning)(IRunningObjectTable *, IMoniker *) __attribute__((stdcall))
     * }
     */
    public static final long IsRunning$offset() {
        return IsRunning$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*IsRunning)(IRunningObjectTable *, IMoniker *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment IsRunning(MemorySegment struct) {
        return struct.get(IsRunning$LAYOUT, IsRunning$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*IsRunning)(IRunningObjectTable *, IMoniker *) __attribute__((stdcall))
     * }
     */
    public static void IsRunning(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(IsRunning$LAYOUT, IsRunning$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*GetObjectA)(IRunningObjectTable *, IMoniker *, IUnknown **) __attribute__((stdcall))
     * }
     */
    public static class GetObjectA {

        GetObjectA() {
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

        private static final MethodHandle UP$MH = winapi.upcallHandle(GetObjectA.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(GetObjectA.Function fi, Arena arena) {
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

    private static final AddressLayout GetObjectA$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("GetObjectA"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*GetObjectA)(IRunningObjectTable *, IMoniker *, IUnknown **) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout GetObjectA$layout() {
        return GetObjectA$LAYOUT;
    }

    private static final long GetObjectA$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*GetObjectA)(IRunningObjectTable *, IMoniker *, IUnknown **) __attribute__((stdcall))
     * }
     */
    public static final long GetObjectA$offset() {
        return GetObjectA$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*GetObjectA)(IRunningObjectTable *, IMoniker *, IUnknown **) __attribute__((stdcall))
     * }
     */
    public static MemorySegment GetObjectA(MemorySegment struct) {
        return struct.get(GetObjectA$LAYOUT, GetObjectA$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*GetObjectA)(IRunningObjectTable *, IMoniker *, IUnknown **) __attribute__((stdcall))
     * }
     */
    public static void GetObjectA(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(GetObjectA$LAYOUT, GetObjectA$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*NoteChangeTime)(IRunningObjectTable *, DWORD, FILETIME *) __attribute__((stdcall))
     * }
     */
    public static class NoteChangeTime {

        NoteChangeTime() {
            // Should not be called directly
        }

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, int _x1, MemorySegment _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            winapi.C_LONG,
            winapi.C_POINTER,
            winapi.C_LONG,
            winapi.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = winapi.upcallHandle(NoteChangeTime.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(NoteChangeTime.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1, MemorySegment _x2) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout NoteChangeTime$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("NoteChangeTime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*NoteChangeTime)(IRunningObjectTable *, DWORD, FILETIME *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout NoteChangeTime$layout() {
        return NoteChangeTime$LAYOUT;
    }

    private static final long NoteChangeTime$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*NoteChangeTime)(IRunningObjectTable *, DWORD, FILETIME *) __attribute__((stdcall))
     * }
     */
    public static final long NoteChangeTime$offset() {
        return NoteChangeTime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*NoteChangeTime)(IRunningObjectTable *, DWORD, FILETIME *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment NoteChangeTime(MemorySegment struct) {
        return struct.get(NoteChangeTime$LAYOUT, NoteChangeTime$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*NoteChangeTime)(IRunningObjectTable *, DWORD, FILETIME *) __attribute__((stdcall))
     * }
     */
    public static void NoteChangeTime(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(NoteChangeTime$LAYOUT, NoteChangeTime$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*GetTimeOfLastChange)(IRunningObjectTable *, IMoniker *, FILETIME *) __attribute__((stdcall))
     * }
     */
    public static class GetTimeOfLastChange {

        GetTimeOfLastChange() {
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

        private static final MethodHandle UP$MH = winapi.upcallHandle(GetTimeOfLastChange.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(GetTimeOfLastChange.Function fi, Arena arena) {
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

    private static final AddressLayout GetTimeOfLastChange$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("GetTimeOfLastChange"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*GetTimeOfLastChange)(IRunningObjectTable *, IMoniker *, FILETIME *) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout GetTimeOfLastChange$layout() {
        return GetTimeOfLastChange$LAYOUT;
    }

    private static final long GetTimeOfLastChange$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*GetTimeOfLastChange)(IRunningObjectTable *, IMoniker *, FILETIME *) __attribute__((stdcall))
     * }
     */
    public static final long GetTimeOfLastChange$offset() {
        return GetTimeOfLastChange$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*GetTimeOfLastChange)(IRunningObjectTable *, IMoniker *, FILETIME *) __attribute__((stdcall))
     * }
     */
    public static MemorySegment GetTimeOfLastChange(MemorySegment struct) {
        return struct.get(GetTimeOfLastChange$LAYOUT, GetTimeOfLastChange$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*GetTimeOfLastChange)(IRunningObjectTable *, IMoniker *, FILETIME *) __attribute__((stdcall))
     * }
     */
    public static void GetTimeOfLastChange(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(GetTimeOfLastChange$LAYOUT, GetTimeOfLastChange$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * HRESULT (*EnumRunning)(IRunningObjectTable *, IEnumMoniker **) __attribute__((stdcall))
     * }
     */
    public static class EnumRunning {

        EnumRunning() {
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

        private static final MethodHandle UP$MH = winapi.upcallHandle(EnumRunning.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(EnumRunning.Function fi, Arena arena) {
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

    private static final AddressLayout EnumRunning$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("EnumRunning"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HRESULT (*EnumRunning)(IRunningObjectTable *, IEnumMoniker **) __attribute__((stdcall))
     * }
     */
    public static final AddressLayout EnumRunning$layout() {
        return EnumRunning$LAYOUT;
    }

    private static final long EnumRunning$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HRESULT (*EnumRunning)(IRunningObjectTable *, IEnumMoniker **) __attribute__((stdcall))
     * }
     */
    public static final long EnumRunning$offset() {
        return EnumRunning$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HRESULT (*EnumRunning)(IRunningObjectTable *, IEnumMoniker **) __attribute__((stdcall))
     * }
     */
    public static MemorySegment EnumRunning(MemorySegment struct) {
        return struct.get(EnumRunning$LAYOUT, EnumRunning$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HRESULT (*EnumRunning)(IRunningObjectTable *, IEnumMoniker **) __attribute__((stdcall))
     * }
     */
    public static void EnumRunning(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(EnumRunning$LAYOUT, EnumRunning$OFFSET, fieldValue);
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

