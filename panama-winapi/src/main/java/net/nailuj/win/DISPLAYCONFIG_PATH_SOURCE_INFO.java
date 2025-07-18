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
 * struct DISPLAYCONFIG_PATH_SOURCE_INFO {
 *     LUID adapterId;
 *     UINT32 id;
 *     union {
 *         UINT32 modeInfoIdx;
 *         struct {
 *             UINT32 cloneGroupId : 16;
 *             UINT32 sourceModeInfoIdx : 16;
 *         };
 *     };
 *     UINT32 statusFlags;
 * }
 * }
 */
public class DISPLAYCONFIG_PATH_SOURCE_INFO {

    DISPLAYCONFIG_PATH_SOURCE_INFO() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _LUID.layout().withName("adapterId"),
        winapi.C_INT.withName("id"),
        MemoryLayout.unionLayout(
            winapi.C_INT.withName("modeInfoIdx"),
            MemoryLayout.structLayout(
                MemoryLayout.paddingLayout(4)
            ).withName("$anon$2957:9")
        ).withName("$anon$2954:5"),
        winapi.C_INT.withName("statusFlags")
    ).withName("DISPLAYCONFIG_PATH_SOURCE_INFO");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout adapterId$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("adapterId"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LUID adapterId
     * }
     */
    public static final GroupLayout adapterId$layout() {
        return adapterId$LAYOUT;
    }

    private static final long adapterId$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LUID adapterId
     * }
     */
    public static final long adapterId$offset() {
        return adapterId$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LUID adapterId
     * }
     */
    public static MemorySegment adapterId(MemorySegment struct) {
        return struct.asSlice(adapterId$OFFSET, adapterId$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LUID adapterId
     * }
     */
    public static void adapterId(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, adapterId$OFFSET, adapterId$LAYOUT.byteSize());
    }

    private static final OfInt id$LAYOUT = (OfInt)$LAYOUT.select(groupElement("id"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT32 id
     * }
     */
    public static final OfInt id$layout() {
        return id$LAYOUT;
    }

    private static final long id$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT32 id
     * }
     */
    public static final long id$offset() {
        return id$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT32 id
     * }
     */
    public static int id(MemorySegment struct) {
        return struct.get(id$LAYOUT, id$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT32 id
     * }
     */
    public static void id(MemorySegment struct, int fieldValue) {
        struct.set(id$LAYOUT, id$OFFSET, fieldValue);
    }

    private static final OfInt modeInfoIdx$LAYOUT = (OfInt)$LAYOUT.select(groupElement("$anon$2954:5"), groupElement("modeInfoIdx"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT32 modeInfoIdx
     * }
     */
    public static final OfInt modeInfoIdx$layout() {
        return modeInfoIdx$LAYOUT;
    }

    private static final long modeInfoIdx$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT32 modeInfoIdx
     * }
     */
    public static final long modeInfoIdx$offset() {
        return modeInfoIdx$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT32 modeInfoIdx
     * }
     */
    public static int modeInfoIdx(MemorySegment struct) {
        return struct.get(modeInfoIdx$LAYOUT, modeInfoIdx$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT32 modeInfoIdx
     * }
     */
    public static void modeInfoIdx(MemorySegment struct, int fieldValue) {
        struct.set(modeInfoIdx$LAYOUT, modeInfoIdx$OFFSET, fieldValue);
    }

    private static final OfInt statusFlags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("statusFlags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UINT32 statusFlags
     * }
     */
    public static final OfInt statusFlags$layout() {
        return statusFlags$LAYOUT;
    }

    private static final long statusFlags$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UINT32 statusFlags
     * }
     */
    public static final long statusFlags$offset() {
        return statusFlags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UINT32 statusFlags
     * }
     */
    public static int statusFlags(MemorySegment struct) {
        return struct.get(statusFlags$LAYOUT, statusFlags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UINT32 statusFlags
     * }
     */
    public static void statusFlags(MemorySegment struct, int fieldValue) {
        struct.set(statusFlags$LAYOUT, statusFlags$OFFSET, fieldValue);
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

