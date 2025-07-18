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
 * struct _CMSG_ENCRYPTED_ENCODE_INFO {
 *     DWORD cbSize;
 *     CRYPT_ALGORITHM_IDENTIFIER ContentEncryptionAlgorithm;
 *     void *pvEncryptionAuxInfo;
 * }
 * }
 */
public class _CMSG_ENCRYPTED_ENCODE_INFO {

    _CMSG_ENCRYPTED_ENCODE_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("cbSize"),
        MemoryLayout.paddingLayout(4),
        _CRYPT_ALGORITHM_IDENTIFIER.layout().withName("ContentEncryptionAlgorithm"),
        winapi.C_POINTER.withName("pvEncryptionAuxInfo")
    ).withName("_CMSG_ENCRYPTED_ENCODE_INFO");

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

    private static final GroupLayout ContentEncryptionAlgorithm$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ContentEncryptionAlgorithm"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER ContentEncryptionAlgorithm
     * }
     */
    public static final GroupLayout ContentEncryptionAlgorithm$layout() {
        return ContentEncryptionAlgorithm$LAYOUT;
    }

    private static final long ContentEncryptionAlgorithm$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER ContentEncryptionAlgorithm
     * }
     */
    public static final long ContentEncryptionAlgorithm$offset() {
        return ContentEncryptionAlgorithm$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER ContentEncryptionAlgorithm
     * }
     */
    public static MemorySegment ContentEncryptionAlgorithm(MemorySegment struct) {
        return struct.asSlice(ContentEncryptionAlgorithm$OFFSET, ContentEncryptionAlgorithm$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CRYPT_ALGORITHM_IDENTIFIER ContentEncryptionAlgorithm
     * }
     */
    public static void ContentEncryptionAlgorithm(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ContentEncryptionAlgorithm$OFFSET, ContentEncryptionAlgorithm$LAYOUT.byteSize());
    }

    private static final AddressLayout pvEncryptionAuxInfo$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pvEncryptionAuxInfo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *pvEncryptionAuxInfo
     * }
     */
    public static final AddressLayout pvEncryptionAuxInfo$layout() {
        return pvEncryptionAuxInfo$LAYOUT;
    }

    private static final long pvEncryptionAuxInfo$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *pvEncryptionAuxInfo
     * }
     */
    public static final long pvEncryptionAuxInfo$offset() {
        return pvEncryptionAuxInfo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *pvEncryptionAuxInfo
     * }
     */
    public static MemorySegment pvEncryptionAuxInfo(MemorySegment struct) {
        return struct.get(pvEncryptionAuxInfo$LAYOUT, pvEncryptionAuxInfo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *pvEncryptionAuxInfo
     * }
     */
    public static void pvEncryptionAuxInfo(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pvEncryptionAuxInfo$LAYOUT, pvEncryptionAuxInfo$OFFSET, fieldValue);
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

