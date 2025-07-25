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
 * struct _EXCEPTION_DEBUG_INFO {
 *     EXCEPTION_RECORD ExceptionRecord;
 *     DWORD dwFirstChance;
 * }
 * }
 */
public class _EXCEPTION_DEBUG_INFO {

    _EXCEPTION_DEBUG_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _EXCEPTION_RECORD.layout().withName("ExceptionRecord"),
        winapi.C_LONG.withName("dwFirstChance"),
        MemoryLayout.paddingLayout(4)
    ).withName("_EXCEPTION_DEBUG_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout ExceptionRecord$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ExceptionRecord"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * EXCEPTION_RECORD ExceptionRecord
     * }
     */
    public static final GroupLayout ExceptionRecord$layout() {
        return ExceptionRecord$LAYOUT;
    }

    private static final long ExceptionRecord$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * EXCEPTION_RECORD ExceptionRecord
     * }
     */
    public static final long ExceptionRecord$offset() {
        return ExceptionRecord$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * EXCEPTION_RECORD ExceptionRecord
     * }
     */
    public static MemorySegment ExceptionRecord(MemorySegment struct) {
        return struct.asSlice(ExceptionRecord$OFFSET, ExceptionRecord$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * EXCEPTION_RECORD ExceptionRecord
     * }
     */
    public static void ExceptionRecord(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, ExceptionRecord$OFFSET, ExceptionRecord$LAYOUT.byteSize());
    }

    private static final OfInt dwFirstChance$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwFirstChance"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwFirstChance
     * }
     */
    public static final OfInt dwFirstChance$layout() {
        return dwFirstChance$LAYOUT;
    }

    private static final long dwFirstChance$OFFSET = 152;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwFirstChance
     * }
     */
    public static final long dwFirstChance$offset() {
        return dwFirstChance$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwFirstChance
     * }
     */
    public static int dwFirstChance(MemorySegment struct) {
        return struct.get(dwFirstChance$LAYOUT, dwFirstChance$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwFirstChance
     * }
     */
    public static void dwFirstChance(MemorySegment struct, int fieldValue) {
        struct.set(dwFirstChance$LAYOUT, dwFirstChance$OFFSET, fieldValue);
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

