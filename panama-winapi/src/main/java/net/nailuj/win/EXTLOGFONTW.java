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
 * typedef struct tagEXTLOGFONTW {
 *     LOGFONTW elfLogFont;
 *     WCHAR elfFullName[64];
 *     WCHAR elfStyle[32];
 *     DWORD elfVersion;
 *     DWORD elfStyleSize;
 *     DWORD elfMatch;
 *     DWORD elfReserved;
 *     BYTE elfVendorId[4];
 *     DWORD elfCulture;
 *     PANOSE elfPanose;
 * } EXTLOGFONTW
 * }
 */
public class EXTLOGFONTW extends tagEXTLOGFONTW {

    EXTLOGFONTW() {
        // Should not be called directly
    }
}

