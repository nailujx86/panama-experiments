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
 * struct servent {
 *     char *s_name;
 *     char **s_aliases;
 *     char *s_proto;
 *     short s_port;
 * }
 * }
 */
public class servent {

    servent() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_POINTER.withName("s_name"),
        winapi.C_POINTER.withName("s_aliases"),
        winapi.C_POINTER.withName("s_proto"),
        winapi.C_SHORT.withName("s_port"),
        MemoryLayout.paddingLayout(6)
    ).withName("servent");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout s_name$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("s_name"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char *s_name
     * }
     */
    public static final AddressLayout s_name$layout() {
        return s_name$LAYOUT;
    }

    private static final long s_name$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char *s_name
     * }
     */
    public static final long s_name$offset() {
        return s_name$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char *s_name
     * }
     */
    public static MemorySegment s_name(MemorySegment struct) {
        return struct.get(s_name$LAYOUT, s_name$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char *s_name
     * }
     */
    public static void s_name(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(s_name$LAYOUT, s_name$OFFSET, fieldValue);
    }

    private static final AddressLayout s_aliases$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("s_aliases"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char **s_aliases
     * }
     */
    public static final AddressLayout s_aliases$layout() {
        return s_aliases$LAYOUT;
    }

    private static final long s_aliases$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char **s_aliases
     * }
     */
    public static final long s_aliases$offset() {
        return s_aliases$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char **s_aliases
     * }
     */
    public static MemorySegment s_aliases(MemorySegment struct) {
        return struct.get(s_aliases$LAYOUT, s_aliases$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char **s_aliases
     * }
     */
    public static void s_aliases(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(s_aliases$LAYOUT, s_aliases$OFFSET, fieldValue);
    }

    private static final AddressLayout s_proto$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("s_proto"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char *s_proto
     * }
     */
    public static final AddressLayout s_proto$layout() {
        return s_proto$LAYOUT;
    }

    private static final long s_proto$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char *s_proto
     * }
     */
    public static final long s_proto$offset() {
        return s_proto$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char *s_proto
     * }
     */
    public static MemorySegment s_proto(MemorySegment struct) {
        return struct.get(s_proto$LAYOUT, s_proto$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char *s_proto
     * }
     */
    public static void s_proto(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(s_proto$LAYOUT, s_proto$OFFSET, fieldValue);
    }

    private static final OfShort s_port$LAYOUT = (OfShort)$LAYOUT.select(groupElement("s_port"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * short s_port
     * }
     */
    public static final OfShort s_port$layout() {
        return s_port$LAYOUT;
    }

    private static final long s_port$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * short s_port
     * }
     */
    public static final long s_port$offset() {
        return s_port$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * short s_port
     * }
     */
    public static short s_port(MemorySegment struct) {
        return struct.get(s_port$LAYOUT, s_port$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * short s_port
     * }
     */
    public static void s_port(MemorySegment struct, short fieldValue) {
        struct.set(s_port$LAYOUT, s_port$OFFSET, fieldValue);
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

