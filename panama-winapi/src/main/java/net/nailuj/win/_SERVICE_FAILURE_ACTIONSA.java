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
 * struct _SERVICE_FAILURE_ACTIONSA {
 *     DWORD dwResetPeriod;
 *     LPSTR lpRebootMsg;
 *     LPSTR lpCommand;
 *     DWORD cActions;
 *     SC_ACTION *lpsaActions;
 * }
 * }
 */
public class _SERVICE_FAILURE_ACTIONSA {

    _SERVICE_FAILURE_ACTIONSA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("dwResetPeriod"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("lpRebootMsg"),
        winapi.C_POINTER.withName("lpCommand"),
        winapi.C_LONG.withName("cActions"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("lpsaActions")
    ).withName("_SERVICE_FAILURE_ACTIONSA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt dwResetPeriod$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwResetPeriod"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwResetPeriod
     * }
     */
    public static final OfInt dwResetPeriod$layout() {
        return dwResetPeriod$LAYOUT;
    }

    private static final long dwResetPeriod$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwResetPeriod
     * }
     */
    public static final long dwResetPeriod$offset() {
        return dwResetPeriod$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwResetPeriod
     * }
     */
    public static int dwResetPeriod(MemorySegment struct) {
        return struct.get(dwResetPeriod$LAYOUT, dwResetPeriod$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwResetPeriod
     * }
     */
    public static void dwResetPeriod(MemorySegment struct, int fieldValue) {
        struct.set(dwResetPeriod$LAYOUT, dwResetPeriod$OFFSET, fieldValue);
    }

    private static final AddressLayout lpRebootMsg$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpRebootMsg"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPSTR lpRebootMsg
     * }
     */
    public static final AddressLayout lpRebootMsg$layout() {
        return lpRebootMsg$LAYOUT;
    }

    private static final long lpRebootMsg$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPSTR lpRebootMsg
     * }
     */
    public static final long lpRebootMsg$offset() {
        return lpRebootMsg$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPSTR lpRebootMsg
     * }
     */
    public static MemorySegment lpRebootMsg(MemorySegment struct) {
        return struct.get(lpRebootMsg$LAYOUT, lpRebootMsg$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPSTR lpRebootMsg
     * }
     */
    public static void lpRebootMsg(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpRebootMsg$LAYOUT, lpRebootMsg$OFFSET, fieldValue);
    }

    private static final AddressLayout lpCommand$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpCommand"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPSTR lpCommand
     * }
     */
    public static final AddressLayout lpCommand$layout() {
        return lpCommand$LAYOUT;
    }

    private static final long lpCommand$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPSTR lpCommand
     * }
     */
    public static final long lpCommand$offset() {
        return lpCommand$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPSTR lpCommand
     * }
     */
    public static MemorySegment lpCommand(MemorySegment struct) {
        return struct.get(lpCommand$LAYOUT, lpCommand$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPSTR lpCommand
     * }
     */
    public static void lpCommand(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpCommand$LAYOUT, lpCommand$OFFSET, fieldValue);
    }

    private static final OfInt cActions$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cActions"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cActions
     * }
     */
    public static final OfInt cActions$layout() {
        return cActions$LAYOUT;
    }

    private static final long cActions$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cActions
     * }
     */
    public static final long cActions$offset() {
        return cActions$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cActions
     * }
     */
    public static int cActions(MemorySegment struct) {
        return struct.get(cActions$LAYOUT, cActions$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cActions
     * }
     */
    public static void cActions(MemorySegment struct, int fieldValue) {
        struct.set(cActions$LAYOUT, cActions$OFFSET, fieldValue);
    }

    private static final AddressLayout lpsaActions$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpsaActions"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * SC_ACTION *lpsaActions
     * }
     */
    public static final AddressLayout lpsaActions$layout() {
        return lpsaActions$LAYOUT;
    }

    private static final long lpsaActions$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * SC_ACTION *lpsaActions
     * }
     */
    public static final long lpsaActions$offset() {
        return lpsaActions$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * SC_ACTION *lpsaActions
     * }
     */
    public static MemorySegment lpsaActions(MemorySegment struct) {
        return struct.get(lpsaActions$LAYOUT, lpsaActions$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * SC_ACTION *lpsaActions
     * }
     */
    public static void lpsaActions(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpsaActions$LAYOUT, lpsaActions$OFFSET, fieldValue);
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

