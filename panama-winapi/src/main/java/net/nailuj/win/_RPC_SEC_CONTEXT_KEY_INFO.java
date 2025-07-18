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
 * struct _RPC_SEC_CONTEXT_KEY_INFO {
 *     unsigned long EncryptAlgorithm;
 *     unsigned long KeySize;
 *     unsigned long SignatureAlgorithm;
 * }
 * }
 */
public class _RPC_SEC_CONTEXT_KEY_INFO {

    _RPC_SEC_CONTEXT_KEY_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("EncryptAlgorithm"),
        winapi.C_LONG.withName("KeySize"),
        winapi.C_LONG.withName("SignatureAlgorithm")
    ).withName("_RPC_SEC_CONTEXT_KEY_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt EncryptAlgorithm$LAYOUT = (OfInt)$LAYOUT.select(groupElement("EncryptAlgorithm"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long EncryptAlgorithm
     * }
     */
    public static final OfInt EncryptAlgorithm$layout() {
        return EncryptAlgorithm$LAYOUT;
    }

    private static final long EncryptAlgorithm$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long EncryptAlgorithm
     * }
     */
    public static final long EncryptAlgorithm$offset() {
        return EncryptAlgorithm$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long EncryptAlgorithm
     * }
     */
    public static int EncryptAlgorithm(MemorySegment struct) {
        return struct.get(EncryptAlgorithm$LAYOUT, EncryptAlgorithm$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long EncryptAlgorithm
     * }
     */
    public static void EncryptAlgorithm(MemorySegment struct, int fieldValue) {
        struct.set(EncryptAlgorithm$LAYOUT, EncryptAlgorithm$OFFSET, fieldValue);
    }

    private static final OfInt KeySize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("KeySize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long KeySize
     * }
     */
    public static final OfInt KeySize$layout() {
        return KeySize$LAYOUT;
    }

    private static final long KeySize$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long KeySize
     * }
     */
    public static final long KeySize$offset() {
        return KeySize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long KeySize
     * }
     */
    public static int KeySize(MemorySegment struct) {
        return struct.get(KeySize$LAYOUT, KeySize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long KeySize
     * }
     */
    public static void KeySize(MemorySegment struct, int fieldValue) {
        struct.set(KeySize$LAYOUT, KeySize$OFFSET, fieldValue);
    }

    private static final OfInt SignatureAlgorithm$LAYOUT = (OfInt)$LAYOUT.select(groupElement("SignatureAlgorithm"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long SignatureAlgorithm
     * }
     */
    public static final OfInt SignatureAlgorithm$layout() {
        return SignatureAlgorithm$LAYOUT;
    }

    private static final long SignatureAlgorithm$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long SignatureAlgorithm
     * }
     */
    public static final long SignatureAlgorithm$offset() {
        return SignatureAlgorithm$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long SignatureAlgorithm
     * }
     */
    public static int SignatureAlgorithm(MemorySegment struct) {
        return struct.get(SignatureAlgorithm$LAYOUT, SignatureAlgorithm$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long SignatureAlgorithm
     * }
     */
    public static void SignatureAlgorithm(MemorySegment struct, int fieldValue) {
        struct.set(SignatureAlgorithm$LAYOUT, SignatureAlgorithm$OFFSET, fieldValue);
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

