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
 * typedef struct tagWAVEINCAPS2W {
 *     WORD wMid;
 *     WORD wPid;
 *     MMVERSION vDriverVersion;
 *     WCHAR szPname[32];
 *     DWORD dwFormats;
 *     WORD wChannels;
 *     WORD wReserved1;
 *     GUID ManufacturerGuid;
 *     GUID ProductGuid;
 *     GUID NameGuid;
 * } WAVEINCAPS2W
 * }
 */
public class WAVEINCAPS2W extends tagWAVEINCAPS2W {

    WAVEINCAPS2W() {
        // Should not be called directly
    }
}

