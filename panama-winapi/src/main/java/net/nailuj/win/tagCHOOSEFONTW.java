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
 * struct tagCHOOSEFONTW {
 *     DWORD lStructSize;
 *     HWND hwndOwner;
 *     HDC hDC;
 *     LPLOGFONTW lpLogFont;
 *     INT iPointSize;
 *     DWORD Flags;
 *     COLORREF rgbColors;
 *     LPARAM lCustData;
 *     LPCFHOOKPROC lpfnHook;
 *     LPCWSTR lpTemplateName;
 *     HINSTANCE hInstance;
 *     LPWSTR lpszStyle;
 *     WORD nFontType;
 *     WORD ___MISSING_ALIGNMENT__;
 *     INT nSizeMin;
 *     INT nSizeMax;
 * }
 * }
 */
public class tagCHOOSEFONTW {

    tagCHOOSEFONTW() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("lStructSize"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("hwndOwner"),
        winapi.C_POINTER.withName("hDC"),
        winapi.C_POINTER.withName("lpLogFont"),
        winapi.C_INT.withName("iPointSize"),
        winapi.C_LONG.withName("Flags"),
        winapi.C_LONG.withName("rgbColors"),
        MemoryLayout.paddingLayout(4),
        winapi.C_LONG_LONG.withName("lCustData"),
        winapi.C_POINTER.withName("lpfnHook"),
        winapi.C_POINTER.withName("lpTemplateName"),
        winapi.C_POINTER.withName("hInstance"),
        winapi.C_POINTER.withName("lpszStyle"),
        winapi.C_SHORT.withName("nFontType"),
        winapi.C_SHORT.withName("___MISSING_ALIGNMENT__"),
        winapi.C_INT.withName("nSizeMin"),
        winapi.C_INT.withName("nSizeMax"),
        MemoryLayout.paddingLayout(4)
    ).withName("tagCHOOSEFONTW");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt lStructSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("lStructSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD lStructSize
     * }
     */
    public static final OfInt lStructSize$layout() {
        return lStructSize$LAYOUT;
    }

    private static final long lStructSize$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD lStructSize
     * }
     */
    public static final long lStructSize$offset() {
        return lStructSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD lStructSize
     * }
     */
    public static int lStructSize(MemorySegment struct) {
        return struct.get(lStructSize$LAYOUT, lStructSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD lStructSize
     * }
     */
    public static void lStructSize(MemorySegment struct, int fieldValue) {
        struct.set(lStructSize$LAYOUT, lStructSize$OFFSET, fieldValue);
    }

    private static final AddressLayout hwndOwner$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hwndOwner"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HWND hwndOwner
     * }
     */
    public static final AddressLayout hwndOwner$layout() {
        return hwndOwner$LAYOUT;
    }

    private static final long hwndOwner$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HWND hwndOwner
     * }
     */
    public static final long hwndOwner$offset() {
        return hwndOwner$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HWND hwndOwner
     * }
     */
    public static MemorySegment hwndOwner(MemorySegment struct) {
        return struct.get(hwndOwner$LAYOUT, hwndOwner$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HWND hwndOwner
     * }
     */
    public static void hwndOwner(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hwndOwner$LAYOUT, hwndOwner$OFFSET, fieldValue);
    }

    private static final AddressLayout hDC$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("hDC"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HDC hDC
     * }
     */
    public static final AddressLayout hDC$layout() {
        return hDC$LAYOUT;
    }

    private static final long hDC$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HDC hDC
     * }
     */
    public static final long hDC$offset() {
        return hDC$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HDC hDC
     * }
     */
    public static MemorySegment hDC(MemorySegment struct) {
        return struct.get(hDC$LAYOUT, hDC$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HDC hDC
     * }
     */
    public static void hDC(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(hDC$LAYOUT, hDC$OFFSET, fieldValue);
    }

    private static final AddressLayout lpLogFont$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpLogFont"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPLOGFONTW lpLogFont
     * }
     */
    public static final AddressLayout lpLogFont$layout() {
        return lpLogFont$LAYOUT;
    }

    private static final long lpLogFont$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPLOGFONTW lpLogFont
     * }
     */
    public static final long lpLogFont$offset() {
        return lpLogFont$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPLOGFONTW lpLogFont
     * }
     */
    public static MemorySegment lpLogFont(MemorySegment struct) {
        return struct.get(lpLogFont$LAYOUT, lpLogFont$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPLOGFONTW lpLogFont
     * }
     */
    public static void lpLogFont(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpLogFont$LAYOUT, lpLogFont$OFFSET, fieldValue);
    }

    private static final OfInt iPointSize$LAYOUT = (OfInt)$LAYOUT.select(groupElement("iPointSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * INT iPointSize
     * }
     */
    public static final OfInt iPointSize$layout() {
        return iPointSize$LAYOUT;
    }

    private static final long iPointSize$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * INT iPointSize
     * }
     */
    public static final long iPointSize$offset() {
        return iPointSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * INT iPointSize
     * }
     */
    public static int iPointSize(MemorySegment struct) {
        return struct.get(iPointSize$LAYOUT, iPointSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * INT iPointSize
     * }
     */
    public static void iPointSize(MemorySegment struct, int fieldValue) {
        struct.set(iPointSize$LAYOUT, iPointSize$OFFSET, fieldValue);
    }

    private static final OfInt Flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static final OfInt Flags$layout() {
        return Flags$LAYOUT;
    }

    private static final long Flags$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static final long Flags$offset() {
        return Flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static int Flags(MemorySegment struct) {
        return struct.get(Flags$LAYOUT, Flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD Flags
     * }
     */
    public static void Flags(MemorySegment struct, int fieldValue) {
        struct.set(Flags$LAYOUT, Flags$OFFSET, fieldValue);
    }

    private static final OfInt rgbColors$LAYOUT = (OfInt)$LAYOUT.select(groupElement("rgbColors"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * COLORREF rgbColors
     * }
     */
    public static final OfInt rgbColors$layout() {
        return rgbColors$LAYOUT;
    }

    private static final long rgbColors$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * COLORREF rgbColors
     * }
     */
    public static final long rgbColors$offset() {
        return rgbColors$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * COLORREF rgbColors
     * }
     */
    public static int rgbColors(MemorySegment struct) {
        return struct.get(rgbColors$LAYOUT, rgbColors$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * COLORREF rgbColors
     * }
     */
    public static void rgbColors(MemorySegment struct, int fieldValue) {
        struct.set(rgbColors$LAYOUT, rgbColors$OFFSET, fieldValue);
    }

    private static final OfLong lCustData$LAYOUT = (OfLong)$LAYOUT.select(groupElement("lCustData"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPARAM lCustData
     * }
     */
    public static final OfLong lCustData$layout() {
        return lCustData$LAYOUT;
    }

    private static final long lCustData$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPARAM lCustData
     * }
     */
    public static final long lCustData$offset() {
        return lCustData$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPARAM lCustData
     * }
     */
    public static long lCustData(MemorySegment struct) {
        return struct.get(lCustData$LAYOUT, lCustData$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPARAM lCustData
     * }
     */
    public static void lCustData(MemorySegment struct, long fieldValue) {
        struct.set(lCustData$LAYOUT, lCustData$OFFSET, fieldValue);
    }

    private static final AddressLayout lpfnHook$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpfnHook"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCFHOOKPROC lpfnHook
     * }
     */
    public static final AddressLayout lpfnHook$layout() {
        return lpfnHook$LAYOUT;
    }

    private static final long lpfnHook$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCFHOOKPROC lpfnHook
     * }
     */
    public static final long lpfnHook$offset() {
        return lpfnHook$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCFHOOKPROC lpfnHook
     * }
     */
    public static MemorySegment lpfnHook(MemorySegment struct) {
        return struct.get(lpfnHook$LAYOUT, lpfnHook$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCFHOOKPROC lpfnHook
     * }
     */
    public static void lpfnHook(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpfnHook$LAYOUT, lpfnHook$OFFSET, fieldValue);
    }

    private static final AddressLayout lpTemplateName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpTemplateName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPCWSTR lpTemplateName
     * }
     */
    public static final AddressLayout lpTemplateName$layout() {
        return lpTemplateName$LAYOUT;
    }

    private static final long lpTemplateName$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPCWSTR lpTemplateName
     * }
     */
    public static final long lpTemplateName$offset() {
        return lpTemplateName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPCWSTR lpTemplateName
     * }
     */
    public static MemorySegment lpTemplateName(MemorySegment struct) {
        return struct.get(lpTemplateName$LAYOUT, lpTemplateName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPCWSTR lpTemplateName
     * }
     */
    public static void lpTemplateName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpTemplateName$LAYOUT, lpTemplateName$OFFSET, fieldValue);
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

    private static final long hInstance$OFFSET = 72;

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

    private static final AddressLayout lpszStyle$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lpszStyle"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LPWSTR lpszStyle
     * }
     */
    public static final AddressLayout lpszStyle$layout() {
        return lpszStyle$LAYOUT;
    }

    private static final long lpszStyle$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LPWSTR lpszStyle
     * }
     */
    public static final long lpszStyle$offset() {
        return lpszStyle$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LPWSTR lpszStyle
     * }
     */
    public static MemorySegment lpszStyle(MemorySegment struct) {
        return struct.get(lpszStyle$LAYOUT, lpszStyle$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LPWSTR lpszStyle
     * }
     */
    public static void lpszStyle(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lpszStyle$LAYOUT, lpszStyle$OFFSET, fieldValue);
    }

    private static final OfShort nFontType$LAYOUT = (OfShort)$LAYOUT.select(groupElement("nFontType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD nFontType
     * }
     */
    public static final OfShort nFontType$layout() {
        return nFontType$LAYOUT;
    }

    private static final long nFontType$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD nFontType
     * }
     */
    public static final long nFontType$offset() {
        return nFontType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD nFontType
     * }
     */
    public static short nFontType(MemorySegment struct) {
        return struct.get(nFontType$LAYOUT, nFontType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD nFontType
     * }
     */
    public static void nFontType(MemorySegment struct, short fieldValue) {
        struct.set(nFontType$LAYOUT, nFontType$OFFSET, fieldValue);
    }

    private static final OfShort ___MISSING_ALIGNMENT__$LAYOUT = (OfShort)$LAYOUT.select(groupElement("___MISSING_ALIGNMENT__"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD ___MISSING_ALIGNMENT__
     * }
     */
    public static final OfShort ___MISSING_ALIGNMENT__$layout() {
        return ___MISSING_ALIGNMENT__$LAYOUT;
    }

    private static final long ___MISSING_ALIGNMENT__$OFFSET = 90;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD ___MISSING_ALIGNMENT__
     * }
     */
    public static final long ___MISSING_ALIGNMENT__$offset() {
        return ___MISSING_ALIGNMENT__$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD ___MISSING_ALIGNMENT__
     * }
     */
    public static short ___MISSING_ALIGNMENT__(MemorySegment struct) {
        return struct.get(___MISSING_ALIGNMENT__$LAYOUT, ___MISSING_ALIGNMENT__$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD ___MISSING_ALIGNMENT__
     * }
     */
    public static void ___MISSING_ALIGNMENT__(MemorySegment struct, short fieldValue) {
        struct.set(___MISSING_ALIGNMENT__$LAYOUT, ___MISSING_ALIGNMENT__$OFFSET, fieldValue);
    }

    private static final OfInt nSizeMin$LAYOUT = (OfInt)$LAYOUT.select(groupElement("nSizeMin"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * INT nSizeMin
     * }
     */
    public static final OfInt nSizeMin$layout() {
        return nSizeMin$LAYOUT;
    }

    private static final long nSizeMin$OFFSET = 92;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * INT nSizeMin
     * }
     */
    public static final long nSizeMin$offset() {
        return nSizeMin$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * INT nSizeMin
     * }
     */
    public static int nSizeMin(MemorySegment struct) {
        return struct.get(nSizeMin$LAYOUT, nSizeMin$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * INT nSizeMin
     * }
     */
    public static void nSizeMin(MemorySegment struct, int fieldValue) {
        struct.set(nSizeMin$LAYOUT, nSizeMin$OFFSET, fieldValue);
    }

    private static final OfInt nSizeMax$LAYOUT = (OfInt)$LAYOUT.select(groupElement("nSizeMax"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * INT nSizeMax
     * }
     */
    public static final OfInt nSizeMax$layout() {
        return nSizeMax$LAYOUT;
    }

    private static final long nSizeMax$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * INT nSizeMax
     * }
     */
    public static final long nSizeMax$offset() {
        return nSizeMax$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * INT nSizeMax
     * }
     */
    public static int nSizeMax(MemorySegment struct) {
        return struct.get(nSizeMax$LAYOUT, nSizeMax$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * INT nSizeMax
     * }
     */
    public static void nSizeMax(MemorySegment struct, int fieldValue) {
        struct.set(nSizeMax$LAYOUT, nSizeMax$OFFSET, fieldValue);
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

