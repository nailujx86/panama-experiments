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
 * struct netent {
 *     char *n_name;
 *     char **n_aliases;
 *     short n_addrtype;
 *     u_long n_net;
 * }
 * }
 */
public class netent {

    netent() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_POINTER.withName("n_name"),
        winapi.C_POINTER.withName("n_aliases"),
        winapi.C_SHORT.withName("n_addrtype"),
        MemoryLayout.paddingLayout(2),
        winapi.C_LONG.withName("n_net")
    ).withName("netent");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout n_name$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("n_name"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char *n_name
     * }
     */
    public static final AddressLayout n_name$layout() {
        return n_name$LAYOUT;
    }

    private static final long n_name$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char *n_name
     * }
     */
    public static final long n_name$offset() {
        return n_name$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char *n_name
     * }
     */
    public static MemorySegment n_name(MemorySegment struct) {
        return struct.get(n_name$LAYOUT, n_name$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char *n_name
     * }
     */
    public static void n_name(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(n_name$LAYOUT, n_name$OFFSET, fieldValue);
    }

    private static final AddressLayout n_aliases$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("n_aliases"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char **n_aliases
     * }
     */
    public static final AddressLayout n_aliases$layout() {
        return n_aliases$LAYOUT;
    }

    private static final long n_aliases$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char **n_aliases
     * }
     */
    public static final long n_aliases$offset() {
        return n_aliases$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char **n_aliases
     * }
     */
    public static MemorySegment n_aliases(MemorySegment struct) {
        return struct.get(n_aliases$LAYOUT, n_aliases$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char **n_aliases
     * }
     */
    public static void n_aliases(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(n_aliases$LAYOUT, n_aliases$OFFSET, fieldValue);
    }

    private static final OfShort n_addrtype$LAYOUT = (OfShort)$LAYOUT.select(groupElement("n_addrtype"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * short n_addrtype
     * }
     */
    public static final OfShort n_addrtype$layout() {
        return n_addrtype$LAYOUT;
    }

    private static final long n_addrtype$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * short n_addrtype
     * }
     */
    public static final long n_addrtype$offset() {
        return n_addrtype$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * short n_addrtype
     * }
     */
    public static short n_addrtype(MemorySegment struct) {
        return struct.get(n_addrtype$LAYOUT, n_addrtype$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * short n_addrtype
     * }
     */
    public static void n_addrtype(MemorySegment struct, short fieldValue) {
        struct.set(n_addrtype$LAYOUT, n_addrtype$OFFSET, fieldValue);
    }

    private static final OfInt n_net$LAYOUT = (OfInt)$LAYOUT.select(groupElement("n_net"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * u_long n_net
     * }
     */
    public static final OfInt n_net$layout() {
        return n_net$LAYOUT;
    }

    private static final long n_net$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * u_long n_net
     * }
     */
    public static final long n_net$offset() {
        return n_net$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * u_long n_net
     * }
     */
    public static int n_net(MemorySegment struct) {
        return struct.get(n_net$LAYOUT, n_net$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * u_long n_net
     * }
     */
    public static void n_net(MemorySegment struct, int fieldValue) {
        struct.set(n_net$LAYOUT, n_net$OFFSET, fieldValue);
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

