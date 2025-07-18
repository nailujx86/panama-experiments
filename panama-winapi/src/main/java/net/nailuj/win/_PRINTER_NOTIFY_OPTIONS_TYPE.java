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
 * struct _PRINTER_NOTIFY_OPTIONS_TYPE {
 *     WORD Type;
 *     WORD Reserved0;
 *     DWORD Reserved1;
 *     DWORD Reserved2;
 *     DWORD Count;
 *     PWORD pFields;
 * }
 * }
 */
public class _PRINTER_NOTIFY_OPTIONS_TYPE {

    _PRINTER_NOTIFY_OPTIONS_TYPE() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_SHORT.withName("Type"),
        winapi.C_SHORT.withName("Reserved0"),
        winapi.C_LONG.withName("Reserved1"),
        winapi.C_LONG.withName("Reserved2"),
        winapi.C_LONG.withName("Count"),
        winapi.C_POINTER.withName("pFields")
    ).withName("_PRINTER_NOTIFY_OPTIONS_TYPE");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfShort Type$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD Type
     * }
     */
    public static final OfShort Type$layout() {
        return Type$LAYOUT;
    }

    private static final long Type$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD Type
     * }
     */
    public static final long Type$offset() {
        return Type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD Type
     * }
     */
    public static short Type(MemorySegment struct) {
        return struct.get(Type$LAYOUT, Type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD Type
     * }
     */
    public static void Type(MemorySegment struct, short fieldValue) {
        struct.set(Type$LAYOUT, Type$OFFSET, fieldValue);
    }

    private static final OfShort Reserved0$LAYOUT = (OfShort)$LAYOUT.select(groupElement("Reserved0"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD Reserved0
     * }
     */
    public static final OfShort Reserved0$layout() {
        return Reserved0$LAYOUT;
    }

    private static final long Reserved0$OFFSET = 2;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD Reserved0
     * }
     */
    public static final long Reserved0$offset() {
        return Reserved0$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD Reserved0
     * }
     */
    public static short Reserved0(MemorySegment struct) {
        return struct.get(Reserved0$LAYOUT, Reserved0$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD Reserved0
     * }
     */
    public static void Reserved0(MemorySegment struct, short fieldValue) {
        struct.set(Reserved0$LAYOUT, Reserved0$OFFSET, fieldValue);
    }

    private static final OfInt Reserved1$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Reserved1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Reserved1
     * }
     */
    public static final OfInt Reserved1$layout() {
        return Reserved1$LAYOUT;
    }

    private static final long Reserved1$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Reserved1
     * }
     */
    public static final long Reserved1$offset() {
        return Reserved1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Reserved1
     * }
     */
    public static int Reserved1(MemorySegment struct) {
        return struct.get(Reserved1$LAYOUT, Reserved1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Reserved1
     * }
     */
    public static void Reserved1(MemorySegment struct, int fieldValue) {
        struct.set(Reserved1$LAYOUT, Reserved1$OFFSET, fieldValue);
    }

    private static final OfInt Reserved2$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Reserved2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Reserved2
     * }
     */
    public static final OfInt Reserved2$layout() {
        return Reserved2$LAYOUT;
    }

    private static final long Reserved2$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Reserved2
     * }
     */
    public static final long Reserved2$offset() {
        return Reserved2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Reserved2
     * }
     */
    public static int Reserved2(MemorySegment struct) {
        return struct.get(Reserved2$LAYOUT, Reserved2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Reserved2
     * }
     */
    public static void Reserved2(MemorySegment struct, int fieldValue) {
        struct.set(Reserved2$LAYOUT, Reserved2$OFFSET, fieldValue);
    }

    private static final OfInt Count$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Count"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Count
     * }
     */
    public static final OfInt Count$layout() {
        return Count$LAYOUT;
    }

    private static final long Count$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Count
     * }
     */
    public static final long Count$offset() {
        return Count$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Count
     * }
     */
    public static int Count(MemorySegment struct) {
        return struct.get(Count$LAYOUT, Count$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Count
     * }
     */
    public static void Count(MemorySegment struct, int fieldValue) {
        struct.set(Count$LAYOUT, Count$OFFSET, fieldValue);
    }

    private static final AddressLayout pFields$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pFields"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PWORD pFields
     * }
     */
    public static final AddressLayout pFields$layout() {
        return pFields$LAYOUT;
    }

    private static final long pFields$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PWORD pFields
     * }
     */
    public static final long pFields$offset() {
        return pFields$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PWORD pFields
     * }
     */
    public static MemorySegment pFields(MemorySegment struct) {
        return struct.get(pFields$LAYOUT, pFields$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PWORD pFields
     * }
     */
    public static void pFields(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(pFields$LAYOUT, pFields$OFFSET, fieldValue);
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

