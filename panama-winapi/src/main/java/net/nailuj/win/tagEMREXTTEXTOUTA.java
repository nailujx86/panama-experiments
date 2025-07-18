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
 * struct tagEMREXTTEXTOUTA {
 *     EMR emr;
 *     RECTL rclBounds;
 *     DWORD iGraphicsMode;
 *     FLOAT exScale;
 *     FLOAT eyScale;
 *     EMRTEXT emrtext;
 * }
 * }
 */
public class tagEMREXTTEXTOUTA {

    tagEMREXTTEXTOUTA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        tagEMR.layout().withName("emr"),
        _RECTL.layout().withName("rclBounds"),
        winapi.C_LONG.withName("iGraphicsMode"),
        winapi.C_FLOAT.withName("exScale"),
        winapi.C_FLOAT.withName("eyScale"),
        tagEMRTEXT.layout().withName("emrtext")
    ).withName("tagEMREXTTEXTOUTA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout emr$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("emr"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * EMR emr
     * }
     */
    public static final GroupLayout emr$layout() {
        return emr$LAYOUT;
    }

    private static final long emr$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * EMR emr
     * }
     */
    public static final long emr$offset() {
        return emr$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * EMR emr
     * }
     */
    public static MemorySegment emr(MemorySegment struct) {
        return struct.asSlice(emr$OFFSET, emr$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * EMR emr
     * }
     */
    public static void emr(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, emr$OFFSET, emr$LAYOUT.byteSize());
    }

    private static final GroupLayout rclBounds$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("rclBounds"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RECTL rclBounds
     * }
     */
    public static final GroupLayout rclBounds$layout() {
        return rclBounds$LAYOUT;
    }

    private static final long rclBounds$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RECTL rclBounds
     * }
     */
    public static final long rclBounds$offset() {
        return rclBounds$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RECTL rclBounds
     * }
     */
    public static MemorySegment rclBounds(MemorySegment struct) {
        return struct.asSlice(rclBounds$OFFSET, rclBounds$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RECTL rclBounds
     * }
     */
    public static void rclBounds(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, rclBounds$OFFSET, rclBounds$LAYOUT.byteSize());
    }

    private static final OfInt iGraphicsMode$LAYOUT = (OfInt)$LAYOUT.select(groupElement("iGraphicsMode"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD iGraphicsMode
     * }
     */
    public static final OfInt iGraphicsMode$layout() {
        return iGraphicsMode$LAYOUT;
    }

    private static final long iGraphicsMode$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD iGraphicsMode
     * }
     */
    public static final long iGraphicsMode$offset() {
        return iGraphicsMode$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD iGraphicsMode
     * }
     */
    public static int iGraphicsMode(MemorySegment struct) {
        return struct.get(iGraphicsMode$LAYOUT, iGraphicsMode$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD iGraphicsMode
     * }
     */
    public static void iGraphicsMode(MemorySegment struct, int fieldValue) {
        struct.set(iGraphicsMode$LAYOUT, iGraphicsMode$OFFSET, fieldValue);
    }

    private static final OfFloat exScale$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("exScale"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FLOAT exScale
     * }
     */
    public static final OfFloat exScale$layout() {
        return exScale$LAYOUT;
    }

    private static final long exScale$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FLOAT exScale
     * }
     */
    public static final long exScale$offset() {
        return exScale$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FLOAT exScale
     * }
     */
    public static float exScale(MemorySegment struct) {
        return struct.get(exScale$LAYOUT, exScale$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FLOAT exScale
     * }
     */
    public static void exScale(MemorySegment struct, float fieldValue) {
        struct.set(exScale$LAYOUT, exScale$OFFSET, fieldValue);
    }

    private static final OfFloat eyScale$LAYOUT = (OfFloat)$LAYOUT.select(groupElement("eyScale"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * FLOAT eyScale
     * }
     */
    public static final OfFloat eyScale$layout() {
        return eyScale$LAYOUT;
    }

    private static final long eyScale$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * FLOAT eyScale
     * }
     */
    public static final long eyScale$offset() {
        return eyScale$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * FLOAT eyScale
     * }
     */
    public static float eyScale(MemorySegment struct) {
        return struct.get(eyScale$LAYOUT, eyScale$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * FLOAT eyScale
     * }
     */
    public static void eyScale(MemorySegment struct, float fieldValue) {
        struct.set(eyScale$LAYOUT, eyScale$OFFSET, fieldValue);
    }

    private static final GroupLayout emrtext$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("emrtext"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * EMRTEXT emrtext
     * }
     */
    public static final GroupLayout emrtext$layout() {
        return emrtext$LAYOUT;
    }

    private static final long emrtext$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * EMRTEXT emrtext
     * }
     */
    public static final long emrtext$offset() {
        return emrtext$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * EMRTEXT emrtext
     * }
     */
    public static MemorySegment emrtext(MemorySegment struct) {
        return struct.asSlice(emrtext$OFFSET, emrtext$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * EMRTEXT emrtext
     * }
     */
    public static void emrtext(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, emrtext$OFFSET, emrtext$LAYOUT.byteSize());
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

