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
 * typedef struct _PROPSHEETHEADERA_V2 {
 *     DWORD dwSize;
 *     DWORD dwFlags;
 *     HWND hwndParent;
 *     HINSTANCE hInstance;
 *     union {
 *         HICON hIcon;
 *         LPCSTR pszIcon;
 *     };
 *     LPCSTR pszCaption;
 *     UINT nPages;
 *     union {
 *         UINT nStartPage;
 *         LPCSTR pStartPage;
 *     };
 *     union {
 *         LPCPROPSHEETPAGEA ppsp;
 *         HPROPSHEETPAGE *phpage;
 *     };
 *     PFNPROPSHEETCALLBACK pfnCallback;
 *     union {
 *         HBITMAP hbmWatermark;
 *         LPCSTR pszbmWatermark;
 *     };
 *     HPALETTE hplWatermark;
 *     union {
 *         HBITMAP hbmHeader;
 *         LPCSTR pszbmHeader;
 *     };
 * } PROPSHEETHEADERA_V2
 * }
 */
public class PROPSHEETHEADERA_V2 extends _PROPSHEETHEADERA_V2 {

    PROPSHEETHEADERA_V2() {
        // Should not be called directly
    }
}

