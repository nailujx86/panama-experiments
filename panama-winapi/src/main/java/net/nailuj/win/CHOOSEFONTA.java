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
 * typedef struct tagCHOOSEFONTA {
 *     DWORD lStructSize;
 *     HWND hwndOwner;
 *     HDC hDC;
 *     LPLOGFONTA lpLogFont;
 *     INT iPointSize;
 *     DWORD Flags;
 *     COLORREF rgbColors;
 *     LPARAM lCustData;
 *     LPCFHOOKPROC lpfnHook;
 *     LPCSTR lpTemplateName;
 *     HINSTANCE hInstance;
 *     LPSTR lpszStyle;
 *     WORD nFontType;
 *     WORD ___MISSING_ALIGNMENT__;
 *     INT nSizeMin;
 *     INT nSizeMax;
 * } CHOOSEFONTA
 * }
 */
public class CHOOSEFONTA extends tagCHOOSEFONTA {

    CHOOSEFONTA() {
        // Should not be called directly
    }
}

