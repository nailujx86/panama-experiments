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
 * struct _SE_TOKEN_USER {
 *     union {
 *         TOKEN_USER TokenUser;
 *         SID_AND_ATTRIBUTES User;
 *     };
 *     union {
 *         SID Sid;
 *         BYTE Buffer[68];
 *     };
 * }
 * }
 */
public class _SE_TOKEN_USER {

    _SE_TOKEN_USER() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.unionLayout(
            _TOKEN_USER.layout().withName("TokenUser"),
            _SID_AND_ATTRIBUTES.layout().withName("User")
        ).withName("$anon$12098:5"),
        MemoryLayout.unionLayout(
            _SID.layout().withName("Sid"),
            MemoryLayout.sequenceLayout(68, winapi.C_CHAR).withName("Buffer")
        ).withName("$anon$12103:5"),
        MemoryLayout.paddingLayout(4)
    ).withName("_SE_TOKEN_USER");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout TokenUser$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$12098:5"), groupElement("TokenUser"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * TOKEN_USER TokenUser
     * }
     */
    public static final GroupLayout TokenUser$layout() {
        return TokenUser$LAYOUT;
    }

    private static final long TokenUser$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * TOKEN_USER TokenUser
     * }
     */
    public static final long TokenUser$offset() {
        return TokenUser$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * TOKEN_USER TokenUser
     * }
     */
    public static MemorySegment TokenUser(MemorySegment struct) {
        return struct.asSlice(TokenUser$OFFSET, TokenUser$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * TOKEN_USER TokenUser
     * }
     */
    public static void TokenUser(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, TokenUser$OFFSET, TokenUser$LAYOUT.byteSize());
    }

    private static final GroupLayout User$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$12098:5"), groupElement("User"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SID_AND_ATTRIBUTES User
     * }
     */
    public static final GroupLayout User$layout() {
        return User$LAYOUT;
    }

    private static final long User$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SID_AND_ATTRIBUTES User
     * }
     */
    public static final long User$offset() {
        return User$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SID_AND_ATTRIBUTES User
     * }
     */
    public static MemorySegment User(MemorySegment struct) {
        return struct.asSlice(User$OFFSET, User$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SID_AND_ATTRIBUTES User
     * }
     */
    public static void User(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, User$OFFSET, User$LAYOUT.byteSize());
    }

    private static final GroupLayout Sid$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$12103:5"), groupElement("Sid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SID Sid
     * }
     */
    public static final GroupLayout Sid$layout() {
        return Sid$LAYOUT;
    }

    private static final long Sid$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SID Sid
     * }
     */
    public static final long Sid$offset() {
        return Sid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SID Sid
     * }
     */
    public static MemorySegment Sid(MemorySegment struct) {
        return struct.asSlice(Sid$OFFSET, Sid$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SID Sid
     * }
     */
    public static void Sid(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Sid$OFFSET, Sid$LAYOUT.byteSize());
    }

    private static final SequenceLayout Buffer$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("$anon$12103:5"), groupElement("Buffer"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Buffer[68]
     * }
     */
    public static final SequenceLayout Buffer$layout() {
        return Buffer$LAYOUT;
    }

    private static final long Buffer$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Buffer[68]
     * }
     */
    public static final long Buffer$offset() {
        return Buffer$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Buffer[68]
     * }
     */
    public static MemorySegment Buffer(MemorySegment struct) {
        return struct.asSlice(Buffer$OFFSET, Buffer$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Buffer[68]
     * }
     */
    public static void Buffer(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Buffer$OFFSET, Buffer$LAYOUT.byteSize());
    }

    private static long[] Buffer$DIMS = { 68 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * BYTE Buffer[68]
     * }
     */
    public static long[] Buffer$dimensions() {
        return Buffer$DIMS;
    }
    private static final VarHandle Buffer$ELEM_HANDLE = Buffer$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * BYTE Buffer[68]
     * }
     */
    public static byte Buffer(MemorySegment struct, long index0) {
        return (byte)Buffer$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * BYTE Buffer[68]
     * }
     */
    public static void Buffer(MemorySegment struct, long index0, byte fieldValue) {
        Buffer$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

