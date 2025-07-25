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
 * typedef struct _MODEMSETTINGS {
 *     DWORD dwActualSize;
 *     DWORD dwRequiredSize;
 *     DWORD dwDevSpecificOffset;
 *     DWORD dwDevSpecificSize;
 *     DWORD dwCallSetupFailTimer;
 *     DWORD dwInactivityTimeout;
 *     DWORD dwSpeakerVolume;
 *     DWORD dwSpeakerMode;
 *     DWORD dwPreferredModemOptions;
 *     DWORD dwNegotiatedModemOptions;
 *     DWORD dwNegotiatedDCERate;
 *     BYTE abVariablePortion[1];
 * } MODEMSETTINGS
 * }
 */
public class MODEMSETTINGS extends _MODEMSETTINGS {

    MODEMSETTINGS() {
        // Should not be called directly
    }
}

