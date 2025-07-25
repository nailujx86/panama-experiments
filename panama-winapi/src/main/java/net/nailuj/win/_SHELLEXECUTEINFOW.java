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
 * struct _SHELLEXECUTEINFOW {
 *     DWORD cbSize;
 *     ULONG fMask;
 *     HWND hwnd;
 *     LPCWSTR lpVerb;
 *     LPCWSTR lpFile;
 *     LPCWSTR lpParameters;
 *     LPCWSTR lpDirectory;
 *     int nShow;
 *     HINSTANCE hInstApp;
 *     void *lpIDList;
 *     LPCWSTR lpClass;
 *     HKEY hkeyClass;
 *     DWORD dwHotKey;
 *     union {
 *         HANDLE hIcon;
 *         HANDLE hMonitor;
 *     };
 *     HANDLE hProcess;
 * }
 * }
 */
public class _SHELLEXECUTEINFOW {

    _SHELLEXECUTEINFOW() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("cbSize"),
        winapi.C_LONG.withName("fMask"),
        winapi.C_POINTER.withName("hwnd"),
        winapi.C_POINTER.withName("lpVerb"),
        winapi.C_POINTER.withName("lpFile"),
        winapi.C_POINTER.withName("lpParameters"),
        winapi.C_POINTER.withName("lpDirectory"),
        winapi.C_INT.withName("nShow"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("hInstApp"),
        winapi.C_POINTER.withName("lpIDList"),
        winapi.C_POINTER.withName("lpClass"),
        winapi.C_POINTER.withName("hkeyClass"),
        winapi.C_LONG.withName("dwHotKey"),
        MemoryLayout.paddingLayout(4),
        MemoryLayout.unionLayout(
            winapi.C_POINTER.withName("hIcon"),
            winapi.C_POINTER.withName("hMonitor")
        ).withName("$anon$485:5"),
        winapi.C_POINTER.withName("hProcess")
    ).withName("_SHELLEXECUTEINFOW");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cbSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static final OfInt cbSize$layout() {
        return cbSize$LAYOUT;
    }

    private static final long cbSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static final long cbSize$offset() {
        return cbSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static int cbSize(MemorySegment struct) {
        return struct.get(cbSize$LAYOUT, cbSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbSize
     * }
     */
    public static void cbSize(MemorySegment struct, int fieldValue) {
        struct.set(cbSize$LAYOUT, cbSize$OFFSET, fieldValue);
    }

    private static final OfInt fMask$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fMask"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG fMask
     * }
     */
    public static final OfInt fMask$layout() {
        return fMask$LAYOUT;
    }

    private static final long fMask$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG fMask
     * }
     */
    public static final long fMask$offset() {
        return fMask$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG fMask
     * }
     */
    public static int fMask(MemorySegment struct) {
        return struct.get(fMask$LAYOUT, fMask$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG fMask
     * }
     */
    public static void fMask(MemorySegment struct, int fieldValue) {
        struct.set(fMask$LAYOUT, fMask$OFFSET, fieldValue);
    }

    private static final AddressLayout hwnd$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hwnd"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HWND hwnd
     * }
     */
    public static final AddressLayout hwnd$layout() {
        return hwnd$LAYOUT;
    }

    private static final long hwnd$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HWND hwnd
     * }
     */
    public static final long hwnd$offset() {
        return hwnd$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HWND hwnd
     * }
     */
    public static MemorySegment hwnd(MemorySegment struct) {
        return struct.get(hwnd$LAYOUT, hwnd$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HWND hwnd
     * }
     */
    public static void hwnd(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hwnd$LAYOUT, hwnd$OFFSET, fieldValue);
    }

    private static final AddressLayout lpVerb$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpVerb"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCWSTR lpVerb
     * }
     */
    public static final AddressLayout lpVerb$layout() {
        return lpVerb$LAYOUT;
    }

    private static final long lpVerb$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCWSTR lpVerb
     * }
     */
    public static final long lpVerb$offset() {
        return lpVerb$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCWSTR lpVerb
     * }
     */
    public static MemorySegment lpVerb(MemorySegment struct) {
        return struct.get(lpVerb$LAYOUT, lpVerb$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCWSTR lpVerb
     * }
     */
    public static void lpVerb(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpVerb$LAYOUT, lpVerb$OFFSET, fieldValue);
    }

    private static final AddressLayout lpFile$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpFile"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCWSTR lpFile
     * }
     */
    public static final AddressLayout lpFile$layout() {
        return lpFile$LAYOUT;
    }

    private static final long lpFile$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCWSTR lpFile
     * }
     */
    public static final long lpFile$offset() {
        return lpFile$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCWSTR lpFile
     * }
     */
    public static MemorySegment lpFile(MemorySegment struct) {
        return struct.get(lpFile$LAYOUT, lpFile$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCWSTR lpFile
     * }
     */
    public static void lpFile(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpFile$LAYOUT, lpFile$OFFSET, fieldValue);
    }

    private static final AddressLayout lpParameters$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpParameters"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCWSTR lpParameters
     * }
     */
    public static final AddressLayout lpParameters$layout() {
        return lpParameters$LAYOUT;
    }

    private static final long lpParameters$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCWSTR lpParameters
     * }
     */
    public static final long lpParameters$offset() {
        return lpParameters$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCWSTR lpParameters
     * }
     */
    public static MemorySegment lpParameters(MemorySegment struct) {
        return struct.get(lpParameters$LAYOUT, lpParameters$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCWSTR lpParameters
     * }
     */
    public static void lpParameters(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpParameters$LAYOUT, lpParameters$OFFSET, fieldValue);
    }

    private static final AddressLayout lpDirectory$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpDirectory"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCWSTR lpDirectory
     * }
     */
    public static final AddressLayout lpDirectory$layout() {
        return lpDirectory$LAYOUT;
    }

    private static final long lpDirectory$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCWSTR lpDirectory
     * }
     */
    public static final long lpDirectory$offset() {
        return lpDirectory$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCWSTR lpDirectory
     * }
     */
    public static MemorySegment lpDirectory(MemorySegment struct) {
        return struct.get(lpDirectory$LAYOUT, lpDirectory$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCWSTR lpDirectory
     * }
     */
    public static void lpDirectory(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpDirectory$LAYOUT, lpDirectory$OFFSET, fieldValue);
    }

    private static final OfInt nShow$LAYOUT = (OfInt)$LAYOUT.select(groupElement("nShow"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int nShow
     * }
     */
    public static final OfInt nShow$layout() {
        return nShow$LAYOUT;
    }

    private static final long nShow$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int nShow
     * }
     */
    public static final long nShow$offset() {
        return nShow$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int nShow
     * }
     */
    public static int nShow(MemorySegment struct) {
        return struct.get(nShow$LAYOUT, nShow$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int nShow
     * }
     */
    public static void nShow(MemorySegment struct, int fieldValue) {
        struct.set(nShow$LAYOUT, nShow$OFFSET, fieldValue);
    }

    private static final AddressLayout hInstApp$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hInstApp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HINSTANCE hInstApp
     * }
     */
    public static final AddressLayout hInstApp$layout() {
        return hInstApp$LAYOUT;
    }

    private static final long hInstApp$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HINSTANCE hInstApp
     * }
     */
    public static final long hInstApp$offset() {
        return hInstApp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HINSTANCE hInstApp
     * }
     */
    public static MemorySegment hInstApp(MemorySegment struct) {
        return struct.get(hInstApp$LAYOUT, hInstApp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HINSTANCE hInstApp
     * }
     */
    public static void hInstApp(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hInstApp$LAYOUT, hInstApp$OFFSET, fieldValue);
    }

    private static final AddressLayout lpIDList$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpIDList"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void *lpIDList
     * }
     */
    public static final AddressLayout lpIDList$layout() {
        return lpIDList$LAYOUT;
    }

    private static final long lpIDList$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void *lpIDList
     * }
     */
    public static final long lpIDList$offset() {
        return lpIDList$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void *lpIDList
     * }
     */
    public static MemorySegment lpIDList(MemorySegment struct) {
        return struct.get(lpIDList$LAYOUT, lpIDList$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void *lpIDList
     * }
     */
    public static void lpIDList(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpIDList$LAYOUT, lpIDList$OFFSET, fieldValue);
    }

    private static final AddressLayout lpClass$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpClass"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCWSTR lpClass
     * }
     */
    public static final AddressLayout lpClass$layout() {
        return lpClass$LAYOUT;
    }

    private static final long lpClass$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCWSTR lpClass
     * }
     */
    public static final long lpClass$offset() {
        return lpClass$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCWSTR lpClass
     * }
     */
    public static MemorySegment lpClass(MemorySegment struct) {
        return struct.get(lpClass$LAYOUT, lpClass$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCWSTR lpClass
     * }
     */
    public static void lpClass(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpClass$LAYOUT, lpClass$OFFSET, fieldValue);
    }

    private static final AddressLayout hkeyClass$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hkeyClass"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HKEY hkeyClass
     * }
     */
    public static final AddressLayout hkeyClass$layout() {
        return hkeyClass$LAYOUT;
    }

    private static final long hkeyClass$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HKEY hkeyClass
     * }
     */
    public static final long hkeyClass$offset() {
        return hkeyClass$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HKEY hkeyClass
     * }
     */
    public static MemorySegment hkeyClass(MemorySegment struct) {
        return struct.get(hkeyClass$LAYOUT, hkeyClass$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HKEY hkeyClass
     * }
     */
    public static void hkeyClass(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hkeyClass$LAYOUT, hkeyClass$OFFSET, fieldValue);
    }

    private static final OfInt dwHotKey$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwHotKey"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwHotKey
     * }
     */
    public static final OfInt dwHotKey$layout() {
        return dwHotKey$LAYOUT;
    }

    private static final long dwHotKey$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwHotKey
     * }
     */
    public static final long dwHotKey$offset() {
        return dwHotKey$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwHotKey
     * }
     */
    public static int dwHotKey(MemorySegment struct) {
        return struct.get(dwHotKey$LAYOUT, dwHotKey$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwHotKey
     * }
     */
    public static void dwHotKey(MemorySegment struct, int fieldValue) {
        struct.set(dwHotKey$LAYOUT, dwHotKey$OFFSET, fieldValue);
    }

    private static final AddressLayout hIcon$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("$anon$485:5"), groupElement("hIcon"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HANDLE hIcon
     * }
     */
    public static final AddressLayout hIcon$layout() {
        return hIcon$LAYOUT;
    }

    private static final long hIcon$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HANDLE hIcon
     * }
     */
    public static final long hIcon$offset() {
        return hIcon$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HANDLE hIcon
     * }
     */
    public static MemorySegment hIcon(MemorySegment struct) {
        return struct.get(hIcon$LAYOUT, hIcon$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HANDLE hIcon
     * }
     */
    public static void hIcon(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hIcon$LAYOUT, hIcon$OFFSET, fieldValue);
    }

    private static final AddressLayout hMonitor$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("$anon$485:5"), groupElement("hMonitor"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HANDLE hMonitor
     * }
     */
    public static final AddressLayout hMonitor$layout() {
        return hMonitor$LAYOUT;
    }

    private static final long hMonitor$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HANDLE hMonitor
     * }
     */
    public static final long hMonitor$offset() {
        return hMonitor$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HANDLE hMonitor
     * }
     */
    public static MemorySegment hMonitor(MemorySegment struct) {
        return struct.get(hMonitor$LAYOUT, hMonitor$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HANDLE hMonitor
     * }
     */
    public static void hMonitor(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hMonitor$LAYOUT, hMonitor$OFFSET, fieldValue);
    }

    private static final AddressLayout hProcess$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hProcess"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HANDLE hProcess
     * }
     */
    public static final AddressLayout hProcess$layout() {
        return hProcess$LAYOUT;
    }

    private static final long hProcess$OFFSET = 104;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HANDLE hProcess
     * }
     */
    public static final long hProcess$offset() {
        return hProcess$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HANDLE hProcess
     * }
     */
    public static MemorySegment hProcess(MemorySegment struct) {
        return struct.get(hProcess$LAYOUT, hProcess$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HANDLE hProcess
     * }
     */
    public static void hProcess(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hProcess$LAYOUT, hProcess$OFFSET, fieldValue);
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

