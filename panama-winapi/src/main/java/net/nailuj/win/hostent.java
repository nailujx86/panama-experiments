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
 * struct hostent {
 *     char *h_name;
 *     char **h_aliases;
 *     short h_addrtype;
 *     short h_length;
 *     char **h_addr_list;
 * }
 * }
 */
public class hostent {

    hostent() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_POINTER.withName("h_name"),
        winapi.C_POINTER.withName("h_aliases"),
        winapi.C_SHORT.withName("h_addrtype"),
        winapi.C_SHORT.withName("h_length"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("h_addr_list")
    ).withName("hostent");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout h_name$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("h_name"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char *h_name
     * }
     */
    public static final AddressLayout h_name$layout() {
        return h_name$LAYOUT;
    }

    private static final long h_name$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char *h_name
     * }
     */
    public static final long h_name$offset() {
        return h_name$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char *h_name
     * }
     */
    public static MemorySegment h_name(MemorySegment struct) {
        return struct.get(h_name$LAYOUT, h_name$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char *h_name
     * }
     */
    public static void h_name(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(h_name$LAYOUT, h_name$OFFSET, fieldValue);
    }

    private static final AddressLayout h_aliases$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("h_aliases"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char **h_aliases
     * }
     */
    public static final AddressLayout h_aliases$layout() {
        return h_aliases$LAYOUT;
    }

    private static final long h_aliases$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char **h_aliases
     * }
     */
    public static final long h_aliases$offset() {
        return h_aliases$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char **h_aliases
     * }
     */
    public static MemorySegment h_aliases(MemorySegment struct) {
        return struct.get(h_aliases$LAYOUT, h_aliases$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char **h_aliases
     * }
     */
    public static void h_aliases(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(h_aliases$LAYOUT, h_aliases$OFFSET, fieldValue);
    }

    private static final OfShort h_addrtype$LAYOUT = (OfShort)$LAYOUT.select(groupElement("h_addrtype"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * short h_addrtype
     * }
     */
    public static final OfShort h_addrtype$layout() {
        return h_addrtype$LAYOUT;
    }

    private static final long h_addrtype$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * short h_addrtype
     * }
     */
    public static final long h_addrtype$offset() {
        return h_addrtype$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * short h_addrtype
     * }
     */
    public static short h_addrtype(MemorySegment struct) {
        return struct.get(h_addrtype$LAYOUT, h_addrtype$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * short h_addrtype
     * }
     */
    public static void h_addrtype(MemorySegment struct, short fieldValue) {
        struct.set(h_addrtype$LAYOUT, h_addrtype$OFFSET, fieldValue);
    }

    private static final OfShort h_length$LAYOUT = (OfShort)$LAYOUT.select(groupElement("h_length"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * short h_length
     * }
     */
    public static final OfShort h_length$layout() {
        return h_length$LAYOUT;
    }

    private static final long h_length$OFFSET = 18;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * short h_length
     * }
     */
    public static final long h_length$offset() {
        return h_length$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * short h_length
     * }
     */
    public static short h_length(MemorySegment struct) {
        return struct.get(h_length$LAYOUT, h_length$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * short h_length
     * }
     */
    public static void h_length(MemorySegment struct, short fieldValue) {
        struct.set(h_length$LAYOUT, h_length$OFFSET, fieldValue);
    }

    private static final AddressLayout h_addr_list$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("h_addr_list"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char **h_addr_list
     * }
     */
    public static final AddressLayout h_addr_list$layout() {
        return h_addr_list$LAYOUT;
    }

    private static final long h_addr_list$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char **h_addr_list
     * }
     */
    public static final long h_addr_list$offset() {
        return h_addr_list$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char **h_addr_list
     * }
     */
    public static MemorySegment h_addr_list(MemorySegment struct) {
        return struct.get(h_addr_list$LAYOUT, h_addr_list$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char **h_addr_list
     * }
     */
    public static void h_addr_list(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(h_addr_list$LAYOUT, h_addr_list$OFFSET, fieldValue);
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

