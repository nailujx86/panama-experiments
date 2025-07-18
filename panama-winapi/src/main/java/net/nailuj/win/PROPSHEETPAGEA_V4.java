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
 * typedef struct _PROPSHEETPAGEA {
 *     DWORD dwSize;
 *     DWORD dwFlags;
 *     HINSTANCE hInstance;
 *     union {
 *         LPCSTR pszTemplate;
 *         PROPSHEETPAGE_RESOURCE pResource;
 *     };
 *     union {
 *         HICON hIcon;
 *         LPCSTR pszIcon;
 *     };
 *     LPCSTR pszTitle;
 *     DLGPROC pfnDlgProc;
 *     LPARAM lParam;
 *     LPFNPSPCALLBACKA pfnCallback;
 *     UINT *pcRefParent;
 *     LPCSTR pszHeaderTitle;
 *     LPCSTR pszHeaderSubTitle;
 *     HANDLE hActCtx;
 *     union {
 *         HBITMAP hbmHeader;
 *         LPCSTR pszbmHeader;
 *     };
 * } PROPSHEETPAGEA_V4
 * }
 */
public class PROPSHEETPAGEA_V4 extends _PROPSHEETPAGEA {

    PROPSHEETPAGEA_V4() {
        // Should not be called directly
    }
}

