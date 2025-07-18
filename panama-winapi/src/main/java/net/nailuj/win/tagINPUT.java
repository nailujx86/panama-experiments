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
 * struct tagINPUT {
 *     DWORD type;
 *     union {
 *         MOUSEINPUT mi;
 *         KEYBDINPUT ki;
 *         HARDWAREINPUT hi;
 *     };
 * }
 * }
 */
public class tagINPUT {

    tagINPUT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("type"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.unionLayout(
            tagMOUSEINPUT.layout().withName("mi"),
            tagKEYBDINPUT.layout().withName("ki"),
            tagHARDWAREINPUT.layout().withName("hi")
        ).withName("$anon$6145:5")
    ).withName("tagINPUT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD type
     * }
     */
    public static final OfInt type$layout() {
        return type$LAYOUT;
    }

    private static final long type$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD type
     * }
     */
    public static final long type$offset() {
        return type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD type
     * }
     */
    public static int type(MemorySegment struct) {
        return struct.get(type$LAYOUT, type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD type
     * }
     */
    public static void type(MemorySegment struct, int fieldValue) {
        struct.set(type$LAYOUT, type$OFFSET, fieldValue);
    }

    private static final GroupLayout mi$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$6145:5"), groupElement("mi"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * MOUSEINPUT mi
     * }
     */
    public static final GroupLayout mi$layout() {
        return mi$LAYOUT;
    }

    private static final long mi$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * MOUSEINPUT mi
     * }
     */
    public static final long mi$offset() {
        return mi$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * MOUSEINPUT mi
     * }
     */
    public static MemorySegment mi(MemorySegment struct) {
        return struct.asSlice(mi$OFFSET, mi$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * MOUSEINPUT mi
     * }
     */
    public static void mi(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, mi$OFFSET, mi$LAYOUT.byteSize());
    }

    private static final GroupLayout ki$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$6145:5"), groupElement("ki"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * KEYBDINPUT ki
     * }
     */
    public static final GroupLayout ki$layout() {
        return ki$LAYOUT;
    }

    private static final long ki$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * KEYBDINPUT ki
     * }
     */
    public static final long ki$offset() {
        return ki$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * KEYBDINPUT ki
     * }
     */
    public static MemorySegment ki(MemorySegment struct) {
        return struct.asSlice(ki$OFFSET, ki$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * KEYBDINPUT ki
     * }
     */
    public static void ki(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ki$OFFSET, ki$LAYOUT.byteSize());
    }

    private static final GroupLayout hi$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("$anon$6145:5"), groupElement("hi"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HARDWAREINPUT hi
     * }
     */
    public static final GroupLayout hi$layout() {
        return hi$LAYOUT;
    }

    private static final long hi$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HARDWAREINPUT hi
     * }
     */
    public static final long hi$offset() {
        return hi$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HARDWAREINPUT hi
     * }
     */
    public static MemorySegment hi(MemorySegment struct) {
        return struct.asSlice(hi$OFFSET, hi$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HARDWAREINPUT hi
     * }
     */
    public static void hi(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, hi$OFFSET, hi$LAYOUT.byteSize());
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

