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
 * struct tagCREATESTRUCTA {
 *     LPVOID lpCreateParams;
 *     HINSTANCE hInstance;
 *     HMENU hMenu;
 *     HWND hwndParent;
 *     int cy;
 *     int cx;
 *     int y;
 *     int x;
 *     LONG style;
 *     LPCSTR lpszName;
 *     LPCSTR lpszClass;
 *     DWORD dwExStyle;
 * }
 * }
 */
public class tagCREATESTRUCTA {

    tagCREATESTRUCTA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_POINTER.withName("lpCreateParams"),
        winapi.C_POINTER.withName("hInstance"),
        winapi.C_POINTER.withName("hMenu"),
        winapi.C_POINTER.withName("hwndParent"),
        winapi.C_INT.withName("cy"),
        winapi.C_INT.withName("cx"),
        winapi.C_INT.withName("y"),
        winapi.C_INT.withName("x"),
        winapi.C_LONG.withName("style"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("lpszName"),
        winapi.C_POINTER.withName("lpszClass"),
        winapi.C_LONG.withName("dwExStyle"),
        MemoryLayout.paddingLayout(4)
    ).withName("tagCREATESTRUCTA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final AddressLayout lpCreateParams$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpCreateParams"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPVOID lpCreateParams
     * }
     */
    public static final AddressLayout lpCreateParams$layout() {
        return lpCreateParams$LAYOUT;
    }

    private static final long lpCreateParams$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPVOID lpCreateParams
     * }
     */
    public static final long lpCreateParams$offset() {
        return lpCreateParams$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPVOID lpCreateParams
     * }
     */
    public static MemorySegment lpCreateParams(MemorySegment struct) {
        return struct.get(lpCreateParams$LAYOUT, lpCreateParams$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPVOID lpCreateParams
     * }
     */
    public static void lpCreateParams(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpCreateParams$LAYOUT, lpCreateParams$OFFSET, fieldValue);
    }

    private static final AddressLayout hInstance$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hInstance"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HINSTANCE hInstance
     * }
     */
    public static final AddressLayout hInstance$layout() {
        return hInstance$LAYOUT;
    }

    private static final long hInstance$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HINSTANCE hInstance
     * }
     */
    public static final long hInstance$offset() {
        return hInstance$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HINSTANCE hInstance
     * }
     */
    public static MemorySegment hInstance(MemorySegment struct) {
        return struct.get(hInstance$LAYOUT, hInstance$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HINSTANCE hInstance
     * }
     */
    public static void hInstance(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hInstance$LAYOUT, hInstance$OFFSET, fieldValue);
    }

    private static final AddressLayout hMenu$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hMenu"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HMENU hMenu
     * }
     */
    public static final AddressLayout hMenu$layout() {
        return hMenu$LAYOUT;
    }

    private static final long hMenu$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HMENU hMenu
     * }
     */
    public static final long hMenu$offset() {
        return hMenu$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HMENU hMenu
     * }
     */
    public static MemorySegment hMenu(MemorySegment struct) {
        return struct.get(hMenu$LAYOUT, hMenu$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HMENU hMenu
     * }
     */
    public static void hMenu(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hMenu$LAYOUT, hMenu$OFFSET, fieldValue);
    }

    private static final AddressLayout hwndParent$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hwndParent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HWND hwndParent
     * }
     */
    public static final AddressLayout hwndParent$layout() {
        return hwndParent$LAYOUT;
    }

    private static final long hwndParent$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HWND hwndParent
     * }
     */
    public static final long hwndParent$offset() {
        return hwndParent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HWND hwndParent
     * }
     */
    public static MemorySegment hwndParent(MemorySegment struct) {
        return struct.get(hwndParent$LAYOUT, hwndParent$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HWND hwndParent
     * }
     */
    public static void hwndParent(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hwndParent$LAYOUT, hwndParent$OFFSET, fieldValue);
    }

    private static final OfInt cy$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cy"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int cy
     * }
     */
    public static final OfInt cy$layout() {
        return cy$LAYOUT;
    }

    private static final long cy$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int cy
     * }
     */
    public static final long cy$offset() {
        return cy$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int cy
     * }
     */
    public static int cy(MemorySegment struct) {
        return struct.get(cy$LAYOUT, cy$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int cy
     * }
     */
    public static void cy(MemorySegment struct, int fieldValue) {
        struct.set(cy$LAYOUT, cy$OFFSET, fieldValue);
    }

    private static final OfInt cx$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cx"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int cx
     * }
     */
    public static final OfInt cx$layout() {
        return cx$LAYOUT;
    }

    private static final long cx$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int cx
     * }
     */
    public static final long cx$offset() {
        return cx$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int cx
     * }
     */
    public static int cx(MemorySegment struct) {
        return struct.get(cx$LAYOUT, cx$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int cx
     * }
     */
    public static void cx(MemorySegment struct, int fieldValue) {
        struct.set(cx$LAYOUT, cx$OFFSET, fieldValue);
    }

    private static final OfInt y$LAYOUT = (OfInt)$LAYOUT.select(groupElement("y"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static final OfInt y$layout() {
        return y$LAYOUT;
    }

    private static final long y$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static final long y$offset() {
        return y$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static int y(MemorySegment struct) {
        return struct.get(y$LAYOUT, y$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static void y(MemorySegment struct, int fieldValue) {
        struct.set(y$LAYOUT, y$OFFSET, fieldValue);
    }

    private static final OfInt x$LAYOUT = (OfInt)$LAYOUT.select(groupElement("x"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static final OfInt x$layout() {
        return x$LAYOUT;
    }

    private static final long x$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static final long x$offset() {
        return x$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static int x(MemorySegment struct) {
        return struct.get(x$LAYOUT, x$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static void x(MemorySegment struct, int fieldValue) {
        struct.set(x$LAYOUT, x$OFFSET, fieldValue);
    }

    private static final OfInt style$LAYOUT = (OfInt)$LAYOUT.select(groupElement("style"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG style
     * }
     */
    public static final OfInt style$layout() {
        return style$LAYOUT;
    }

    private static final long style$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG style
     * }
     */
    public static final long style$offset() {
        return style$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG style
     * }
     */
    public static int style(MemorySegment struct) {
        return struct.get(style$LAYOUT, style$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG style
     * }
     */
    public static void style(MemorySegment struct, int fieldValue) {
        struct.set(style$LAYOUT, style$OFFSET, fieldValue);
    }

    private static final AddressLayout lpszName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpszName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCSTR lpszName
     * }
     */
    public static final AddressLayout lpszName$layout() {
        return lpszName$LAYOUT;
    }

    private static final long lpszName$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCSTR lpszName
     * }
     */
    public static final long lpszName$offset() {
        return lpszName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCSTR lpszName
     * }
     */
    public static MemorySegment lpszName(MemorySegment struct) {
        return struct.get(lpszName$LAYOUT, lpszName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCSTR lpszName
     * }
     */
    public static void lpszName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpszName$LAYOUT, lpszName$OFFSET, fieldValue);
    }

    private static final AddressLayout lpszClass$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpszClass"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCSTR lpszClass
     * }
     */
    public static final AddressLayout lpszClass$layout() {
        return lpszClass$LAYOUT;
    }

    private static final long lpszClass$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCSTR lpszClass
     * }
     */
    public static final long lpszClass$offset() {
        return lpszClass$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCSTR lpszClass
     * }
     */
    public static MemorySegment lpszClass(MemorySegment struct) {
        return struct.get(lpszClass$LAYOUT, lpszClass$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCSTR lpszClass
     * }
     */
    public static void lpszClass(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpszClass$LAYOUT, lpszClass$OFFSET, fieldValue);
    }

    private static final OfInt dwExStyle$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwExStyle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwExStyle
     * }
     */
    public static final OfInt dwExStyle$layout() {
        return dwExStyle$LAYOUT;
    }

    private static final long dwExStyle$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwExStyle
     * }
     */
    public static final long dwExStyle$offset() {
        return dwExStyle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwExStyle
     * }
     */
    public static int dwExStyle(MemorySegment struct) {
        return struct.get(dwExStyle$LAYOUT, dwExStyle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwExStyle
     * }
     */
    public static void dwExStyle(MemorySegment struct, int fieldValue) {
        struct.set(dwExStyle$LAYOUT, dwExStyle$OFFSET, fieldValue);
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

