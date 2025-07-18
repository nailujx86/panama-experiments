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
 * struct {
 *     unsigned long Version;
 *     RPC_IF_HANDLE IfSpec;
 *     UUID *MgrTypeUuid;
 *     void *MgrEpv;
 *     unsigned int Flags;
 *     unsigned int MaxCalls;
 *     unsigned int MaxRpcSize;
 *     RPC_IF_CALLBACK_FN *IfCallback;
 *     UUID_VECTOR *UuidVector;
 *     RPC_WSTR Annotation;
 *     void *SecurityDescriptor;
 * }
 * }
 */
public class RPC_INTERFACE_TEMPLATEW {

    RPC_INTERFACE_TEMPLATEW() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("Version"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("IfSpec"),
        winapi.C_POINTER.withName("MgrTypeUuid"),
        winapi.C_POINTER.withName("MgrEpv"),
        winapi.C_INT.withName("Flags"),
        winapi.C_INT.withName("MaxCalls"),
        winapi.C_INT.withName("MaxRpcSize"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("IfCallback"),
        winapi.C_POINTER.withName("UuidVector"),
        winapi.C_POINTER.withName("Annotation"),
        winapi.C_POINTER.withName("SecurityDescriptor")
    ).withName("$anon$3209:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Version$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Version"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long Version
     * }
     */
    public static final OfInt Version$layout() {
        return Version$LAYOUT;
    }

    private static final long Version$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long Version
     * }
     */
    public static final long Version$offset() {
        return Version$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long Version
     * }
     */
    public static int Version(MemorySegment struct) {
        return struct.get(Version$LAYOUT, Version$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long Version
     * }
     */
    public static void Version(MemorySegment struct, int fieldValue) {
        struct.set(Version$LAYOUT, Version$OFFSET, fieldValue);
    }

    private static final AddressLayout IfSpec$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("IfSpec"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RPC_IF_HANDLE IfSpec
     * }
     */
    public static final AddressLayout IfSpec$layout() {
        return IfSpec$LAYOUT;
    }

    private static final long IfSpec$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RPC_IF_HANDLE IfSpec
     * }
     */
    public static final long IfSpec$offset() {
        return IfSpec$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RPC_IF_HANDLE IfSpec
     * }
     */
    public static MemorySegment IfSpec(MemorySegment struct) {
        return struct.get(IfSpec$LAYOUT, IfSpec$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RPC_IF_HANDLE IfSpec
     * }
     */
    public static void IfSpec(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(IfSpec$LAYOUT, IfSpec$OFFSET, fieldValue);
    }

    private static final AddressLayout MgrTypeUuid$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("MgrTypeUuid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UUID *MgrTypeUuid
     * }
     */
    public static final AddressLayout MgrTypeUuid$layout() {
        return MgrTypeUuid$LAYOUT;
    }

    private static final long MgrTypeUuid$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UUID *MgrTypeUuid
     * }
     */
    public static final long MgrTypeUuid$offset() {
        return MgrTypeUuid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UUID *MgrTypeUuid
     * }
     */
    public static MemorySegment MgrTypeUuid(MemorySegment struct) {
        return struct.get(MgrTypeUuid$LAYOUT, MgrTypeUuid$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UUID *MgrTypeUuid
     * }
     */
    public static void MgrTypeUuid(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(MgrTypeUuid$LAYOUT, MgrTypeUuid$OFFSET, fieldValue);
    }

    private static final AddressLayout MgrEpv$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("MgrEpv"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *MgrEpv
     * }
     */
    public static final AddressLayout MgrEpv$layout() {
        return MgrEpv$LAYOUT;
    }

    private static final long MgrEpv$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *MgrEpv
     * }
     */
    public static final long MgrEpv$offset() {
        return MgrEpv$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *MgrEpv
     * }
     */
    public static MemorySegment MgrEpv(MemorySegment struct) {
        return struct.get(MgrEpv$LAYOUT, MgrEpv$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *MgrEpv
     * }
     */
    public static void MgrEpv(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(MgrEpv$LAYOUT, MgrEpv$OFFSET, fieldValue);
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

    private static final long Flags$OFFSET = 32;

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

    private static final OfInt MaxCalls$LAYOUT = (OfInt)$LAYOUT.select(groupElement("MaxCalls"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int MaxCalls
     * }
     */
    public static final OfInt MaxCalls$layout() {
        return MaxCalls$LAYOUT;
    }

    private static final long MaxCalls$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int MaxCalls
     * }
     */
    public static final long MaxCalls$offset() {
        return MaxCalls$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int MaxCalls
     * }
     */
    public static int MaxCalls(MemorySegment struct) {
        return struct.get(MaxCalls$LAYOUT, MaxCalls$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int MaxCalls
     * }
     */
    public static void MaxCalls(MemorySegment struct, int fieldValue) {
        struct.set(MaxCalls$LAYOUT, MaxCalls$OFFSET, fieldValue);
    }

    private static final OfInt MaxRpcSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("MaxRpcSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int MaxRpcSize
     * }
     */
    public static final OfInt MaxRpcSize$layout() {
        return MaxRpcSize$LAYOUT;
    }

    private static final long MaxRpcSize$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int MaxRpcSize
     * }
     */
    public static final long MaxRpcSize$offset() {
        return MaxRpcSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int MaxRpcSize
     * }
     */
    public static int MaxRpcSize(MemorySegment struct) {
        return struct.get(MaxRpcSize$LAYOUT, MaxRpcSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int MaxRpcSize
     * }
     */
    public static void MaxRpcSize(MemorySegment struct, int fieldValue) {
        struct.set(MaxRpcSize$LAYOUT, MaxRpcSize$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * RPC_IF_CALLBACK_FN *IfCallback
     * }
     */
    public static class IfCallback {

        IfCallback() {
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

        private static final MethodHandle UP$MH = winapi.upcallHandle(IfCallback.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(IfCallback.Function fi, Arena arena) {
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

    private static final AddressLayout IfCallback$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("IfCallback"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RPC_IF_CALLBACK_FN *IfCallback
     * }
     */
    public static final AddressLayout IfCallback$layout() {
        return IfCallback$LAYOUT;
    }

    private static final long IfCallback$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RPC_IF_CALLBACK_FN *IfCallback
     * }
     */
    public static final long IfCallback$offset() {
        return IfCallback$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RPC_IF_CALLBACK_FN *IfCallback
     * }
     */
    public static MemorySegment IfCallback(MemorySegment struct) {
        return struct.get(IfCallback$LAYOUT, IfCallback$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RPC_IF_CALLBACK_FN *IfCallback
     * }
     */
    public static void IfCallback(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(IfCallback$LAYOUT, IfCallback$OFFSET, fieldValue);
    }

    private static final AddressLayout UuidVector$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("UuidVector"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UUID_VECTOR *UuidVector
     * }
     */
    public static final AddressLayout UuidVector$layout() {
        return UuidVector$LAYOUT;
    }

    private static final long UuidVector$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UUID_VECTOR *UuidVector
     * }
     */
    public static final long UuidVector$offset() {
        return UuidVector$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UUID_VECTOR *UuidVector
     * }
     */
    public static MemorySegment UuidVector(MemorySegment struct) {
        return struct.get(UuidVector$LAYOUT, UuidVector$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UUID_VECTOR *UuidVector
     * }
     */
    public static void UuidVector(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(UuidVector$LAYOUT, UuidVector$OFFSET, fieldValue);
    }

    private static final AddressLayout Annotation$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("Annotation"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RPC_WSTR Annotation
     * }
     */
    public static final AddressLayout Annotation$layout() {
        return Annotation$LAYOUT;
    }

    private static final long Annotation$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RPC_WSTR Annotation
     * }
     */
    public static final long Annotation$offset() {
        return Annotation$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RPC_WSTR Annotation
     * }
     */
    public static MemorySegment Annotation(MemorySegment struct) {
        return struct.get(Annotation$LAYOUT, Annotation$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RPC_WSTR Annotation
     * }
     */
    public static void Annotation(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(Annotation$LAYOUT, Annotation$OFFSET, fieldValue);
    }

    private static final AddressLayout SecurityDescriptor$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("SecurityDescriptor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *SecurityDescriptor
     * }
     */
    public static final AddressLayout SecurityDescriptor$layout() {
        return SecurityDescriptor$LAYOUT;
    }

    private static final long SecurityDescriptor$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *SecurityDescriptor
     * }
     */
    public static final long SecurityDescriptor$offset() {
        return SecurityDescriptor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *SecurityDescriptor
     * }
     */
    public static MemorySegment SecurityDescriptor(MemorySegment struct) {
        return struct.get(SecurityDescriptor$LAYOUT, SecurityDescriptor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *SecurityDescriptor
     * }
     */
    public static void SecurityDescriptor(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(SecurityDescriptor$LAYOUT, SecurityDescriptor$OFFSET, fieldValue);
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

