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
 * typedef struct _JOBOBJECT_CPU_RATE_CONTROL_INFORMATION {
 *     DWORD ControlFlags;
 *     union {
 *         DWORD CpuRate;
 *         DWORD Weight;
 *         struct {
 *             WORD MinRate;
 *             WORD MaxRate;
 *         };
 *     };
 * } JOBOBJECT_CPU_RATE_CONTROL_INFORMATION
 * }
 */
public class JOBOBJECT_CPU_RATE_CONTROL_INFORMATION extends _JOBOBJECT_CPU_RATE_CONTROL_INFORMATION {

    JOBOBJECT_CPU_RATE_CONTROL_INFORMATION() {
        // Should not be called directly
    }
}

