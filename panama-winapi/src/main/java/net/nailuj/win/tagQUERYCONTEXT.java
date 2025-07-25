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
 * struct tagQUERYCONTEXT {
 *     DWORD dwContext;
 *     CSPLATFORM Platform;
 *     LCID Locale;
 *     DWORD dwVersionHi;
 *     DWORD dwVersionLo;
 * }
 * }
 */
public class tagQUERYCONTEXT {

    tagQUERYCONTEXT() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("dwContext"),
        tagCSPLATFORM.layout().withName("Platform"),
        winapi.C_LONG.withName("Locale"),
        winapi.C_LONG.withName("dwVersionHi"),
        winapi.C_LONG.withName("dwVersionLo")
    ).withName("tagQUERYCONTEXT");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwContext$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwContext"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwContext
     * }
     */
    public static final OfInt dwContext$layout() {
        return dwContext$LAYOUT;
    }

    private static final long dwContext$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwContext
     * }
     */
    public static final long dwContext$offset() {
        return dwContext$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwContext
     * }
     */
    public static int dwContext(MemorySegment struct) {
        return struct.get(dwContext$LAYOUT, dwContext$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwContext
     * }
     */
    public static void dwContext(MemorySegment struct, int fieldValue) {
        struct.set(dwContext$LAYOUT, dwContext$OFFSET, fieldValue);
    }

    private static final GroupLayout Platform$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Platform"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * CSPLATFORM Platform
     * }
     */
    public static final GroupLayout Platform$layout() {
        return Platform$LAYOUT;
    }

    private static final long Platform$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * CSPLATFORM Platform
     * }
     */
    public static final long Platform$offset() {
        return Platform$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * CSPLATFORM Platform
     * }
     */
    public static MemorySegment Platform(MemorySegment struct) {
        return struct.asSlice(Platform$OFFSET, Platform$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * CSPLATFORM Platform
     * }
     */
    public static void Platform(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Platform$OFFSET, Platform$LAYOUT.byteSize());
    }

    private static final OfInt Locale$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Locale"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LCID Locale
     * }
     */
    public static final OfInt Locale$layout() {
        return Locale$LAYOUT;
    }

    private static final long Locale$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LCID Locale
     * }
     */
    public static final long Locale$offset() {
        return Locale$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LCID Locale
     * }
     */
    public static int Locale(MemorySegment struct) {
        return struct.get(Locale$LAYOUT, Locale$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LCID Locale
     * }
     */
    public static void Locale(MemorySegment struct, int fieldValue) {
        struct.set(Locale$LAYOUT, Locale$OFFSET, fieldValue);
    }

    private static final OfInt dwVersionHi$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwVersionHi"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwVersionHi
     * }
     */
    public static final OfInt dwVersionHi$layout() {
        return dwVersionHi$LAYOUT;
    }

    private static final long dwVersionHi$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwVersionHi
     * }
     */
    public static final long dwVersionHi$offset() {
        return dwVersionHi$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwVersionHi
     * }
     */
    public static int dwVersionHi(MemorySegment struct) {
        return struct.get(dwVersionHi$LAYOUT, dwVersionHi$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwVersionHi
     * }
     */
    public static void dwVersionHi(MemorySegment struct, int fieldValue) {
        struct.set(dwVersionHi$LAYOUT, dwVersionHi$OFFSET, fieldValue);
    }

    private static final OfInt dwVersionLo$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwVersionLo"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwVersionLo
     * }
     */
    public static final OfInt dwVersionLo$layout() {
        return dwVersionLo$LAYOUT;
    }

    private static final long dwVersionLo$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwVersionLo
     * }
     */
    public static final long dwVersionLo$offset() {
        return dwVersionLo$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwVersionLo
     * }
     */
    public static int dwVersionLo(MemorySegment struct) {
        return struct.get(dwVersionLo$LAYOUT, dwVersionLo$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwVersionLo
     * }
     */
    public static void dwVersionLo(MemorySegment struct, int fieldValue) {
        struct.set(dwVersionLo$LAYOUT, dwVersionLo$OFFSET, fieldValue);
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

