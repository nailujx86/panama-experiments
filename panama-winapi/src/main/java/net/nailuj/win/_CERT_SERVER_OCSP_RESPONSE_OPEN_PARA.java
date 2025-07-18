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
 * struct _CERT_SERVER_OCSP_RESPONSE_OPEN_PARA {
 *     DWORD cbSize;
 *     DWORD dwFlags;
 *     DWORD *pcbUsedSize;
 *     PWSTR pwszOcspDirectory;
 *     PFN_CERT_SERVER_OCSP_RESPONSE_UPDATE_CALLBACK pfnUpdateCallback;
 *     PVOID pvUpdateCallbackArg;
 * }
 * }
 */
public class _CERT_SERVER_OCSP_RESPONSE_OPEN_PARA {

    _CERT_SERVER_OCSP_RESPONSE_OPEN_PARA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("cbSize"),
        winapi.C_LONG.withName("dwFlags"),
        winapi.C_POINTER.withName("pcbUsedSize"),
        winapi.C_POINTER.withName("pwszOcspDirectory"),
        winapi.C_POINTER.withName("pfnUpdateCallback"),
        winapi.C_POINTER.withName("pvUpdateCallbackArg")
    ).withName("_CERT_SERVER_OCSP_RESPONSE_OPEN_PARA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cbSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static final OfInt cbSize$layout() {
        return cbSize$LAYOUT;
    }

    private static final long cbSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static final long cbSize$offset() {
        return cbSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static int cbSize(MemorySegment struct) {
        return struct.get(cbSize$LAYOUT, cbSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static void cbSize(MemorySegment struct, int fieldValue) {
        struct.set(cbSize$LAYOUT, cbSize$OFFSET, fieldValue);
    }

    private static final OfInt dwFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwFlags
     * }
     */
    public static final OfInt dwFlags$layout() {
        return dwFlags$LAYOUT;
    }

    private static final long dwFlags$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwFlags
     * }
     */
    public static final long dwFlags$offset() {
        return dwFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwFlags
     * }
     */
    public static int dwFlags(MemorySegment struct) {
        return struct.get(dwFlags$LAYOUT, dwFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwFlags
     * }
     */
    public static void dwFlags(MemorySegment struct, int fieldValue) {
        struct.set(dwFlags$LAYOUT, dwFlags$OFFSET, fieldValue);
    }

    private static final AddressLayout pcbUsedSize$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pcbUsedSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD *pcbUsedSize
     * }
     */
    public static final AddressLayout pcbUsedSize$layout() {
        return pcbUsedSize$LAYOUT;
    }

    private static final long pcbUsedSize$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD *pcbUsedSize
     * }
     */
    public static final long pcbUsedSize$offset() {
        return pcbUsedSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD *pcbUsedSize
     * }
     */
    public static MemorySegment pcbUsedSize(MemorySegment struct) {
        return struct.get(pcbUsedSize$LAYOUT, pcbUsedSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD *pcbUsedSize
     * }
     */
    public static void pcbUsedSize(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pcbUsedSize$LAYOUT, pcbUsedSize$OFFSET, fieldValue);
    }

    private static final AddressLayout pwszOcspDirectory$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pwszOcspDirectory"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PWSTR pwszOcspDirectory
     * }
     */
    public static final AddressLayout pwszOcspDirectory$layout() {
        return pwszOcspDirectory$LAYOUT;
    }

    private static final long pwszOcspDirectory$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PWSTR pwszOcspDirectory
     * }
     */
    public static final long pwszOcspDirectory$offset() {
        return pwszOcspDirectory$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PWSTR pwszOcspDirectory
     * }
     */
    public static MemorySegment pwszOcspDirectory(MemorySegment struct) {
        return struct.get(pwszOcspDirectory$LAYOUT, pwszOcspDirectory$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PWSTR pwszOcspDirectory
     * }
     */
    public static void pwszOcspDirectory(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pwszOcspDirectory$LAYOUT, pwszOcspDirectory$OFFSET, fieldValue);
    }

    private static final AddressLayout pfnUpdateCallback$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pfnUpdateCallback"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PFN_CERT_SERVER_OCSP_RESPONSE_UPDATE_CALLBACK pfnUpdateCallback
     * }
     */
    public static final AddressLayout pfnUpdateCallback$layout() {
        return pfnUpdateCallback$LAYOUT;
    }

    private static final long pfnUpdateCallback$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PFN_CERT_SERVER_OCSP_RESPONSE_UPDATE_CALLBACK pfnUpdateCallback
     * }
     */
    public static final long pfnUpdateCallback$offset() {
        return pfnUpdateCallback$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PFN_CERT_SERVER_OCSP_RESPONSE_UPDATE_CALLBACK pfnUpdateCallback
     * }
     */
    public static MemorySegment pfnUpdateCallback(MemorySegment struct) {
        return struct.get(pfnUpdateCallback$LAYOUT, pfnUpdateCallback$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PFN_CERT_SERVER_OCSP_RESPONSE_UPDATE_CALLBACK pfnUpdateCallback
     * }
     */
    public static void pfnUpdateCallback(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pfnUpdateCallback$LAYOUT, pfnUpdateCallback$OFFSET, fieldValue);
    }

    private static final AddressLayout pvUpdateCallbackArg$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pvUpdateCallbackArg"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PVOID pvUpdateCallbackArg
     * }
     */
    public static final AddressLayout pvUpdateCallbackArg$layout() {
        return pvUpdateCallbackArg$LAYOUT;
    }

    private static final long pvUpdateCallbackArg$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PVOID pvUpdateCallbackArg
     * }
     */
    public static final long pvUpdateCallbackArg$offset() {
        return pvUpdateCallbackArg$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PVOID pvUpdateCallbackArg
     * }
     */
    public static MemorySegment pvUpdateCallbackArg(MemorySegment struct) {
        return struct.get(pvUpdateCallbackArg$LAYOUT, pvUpdateCallbackArg$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PVOID pvUpdateCallbackArg
     * }
     */
    public static void pvUpdateCallbackArg(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pvUpdateCallbackArg$LAYOUT, pvUpdateCallbackArg$OFFSET, fieldValue);
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

