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
 * typedef struct tagMIDIOUTCAPS2A {
 *     WORD wMid;
 *     WORD wPid;
 *     MMVERSION vDriverVersion;
 *     CHAR szPname[32];
 *     WORD wTechnology;
 *     WORD wVoices;
 *     WORD wNotes;
 *     WORD wChannelMask;
 *     DWORD dwSupport;
 *     GUID ManufacturerGuid;
 *     GUID ProductGuid;
 *     GUID NameGuid;
 * } MIDIOUTCAPS2A
 * }
 */
public class MIDIOUTCAPS2A extends tagMIDIOUTCAPS2A {

    MIDIOUTCAPS2A() {
        // Should not be called directly
    }
}

