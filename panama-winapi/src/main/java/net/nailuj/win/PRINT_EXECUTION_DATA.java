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
 * struct {
 *     PRINT_EXECUTION_CONTEXT context;
 *     DWORD clientAppPID;
 * }
 * }
 */
public class PRINT_EXECUTION_DATA {

    PRINT_EXECUTION_DATA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_INT.withName("context"),
        winapi.C_LONG.withName("clientAppPID")
    ).withName("$anon$3815:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt context$LAYOUT = (OfInt)$LAYOUT.select(groupElement("context"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * PRINT_EXECUTION_CONTEXT context
     * }
     */
    public static final OfInt context$layout() {
        return context$LAYOUT;
    }

    private static final long context$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * PRINT_EXECUTION_CONTEXT context
     * }
     */
    public static final long context$offset() {
        return context$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * PRINT_EXECUTION_CONTEXT context
     * }
     */
    public static int context(MemorySegment struct) {
        return struct.get(context$LAYOUT, context$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * PRINT_EXECUTION_CONTEXT context
     * }
     */
    public static void context(MemorySegment struct, int fieldValue) {
        struct.set(context$LAYOUT, context$OFFSET, fieldValue);
    }

    private static final OfInt clientAppPID$LAYOUT = (OfInt)$LAYOUT.select(groupElement("clientAppPID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD clientAppPID
     * }
     */
    public static final OfInt clientAppPID$layout() {
        return clientAppPID$LAYOUT;
    }

    private static final long clientAppPID$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD clientAppPID
     * }
     */
    public static final long clientAppPID$offset() {
        return clientAppPID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD clientAppPID
     * }
     */
    public static int clientAppPID(MemorySegment struct) {
        return struct.get(clientAppPID$LAYOUT, clientAppPID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD clientAppPID
     * }
     */
    public static void clientAppPID(MemorySegment struct, int fieldValue) {
        struct.set(clientAppPID$LAYOUT, clientAppPID$OFFSET, fieldValue);
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

