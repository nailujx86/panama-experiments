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
 * typedef struct tagJOYCAPS2W {
 *     WORD wMid;
 *     WORD wPid;
 *     WCHAR szPname[32];
 *     UINT wXmin;
 *     UINT wXmax;
 *     UINT wYmin;
 *     UINT wYmax;
 *     UINT wZmin;
 *     UINT wZmax;
 *     UINT wNumButtons;
 *     UINT wPeriodMin;
 *     UINT wPeriodMax;
 *     UINT wRmin;
 *     UINT wRmax;
 *     UINT wUmin;
 *     UINT wUmax;
 *     UINT wVmin;
 *     UINT wVmax;
 *     UINT wCaps;
 *     UINT wMaxAxes;
 *     UINT wNumAxes;
 *     UINT wMaxButtons;
 *     WCHAR szRegKey[32];
 *     WCHAR szOEMVxD[260];
 *     GUID ManufacturerGuid;
 *     GUID ProductGuid;
 *     GUID NameGuid;
 * } JOYCAPS2W
 * }
 */
public class JOYCAPS2W extends tagJOYCAPS2W {

    JOYCAPS2W() {
        // Should not be called directly
    }
}

