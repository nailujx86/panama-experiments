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
 * typedef struct _PROCESS_MITIGATION_SEHOP_POLICY {
 *     union {
 *         DWORD Flags;
 *         struct {
 *             DWORD EnableSehop : 1;
 *             DWORD ReservedFlags : 31;
 *         };
 *     };
 * } PROCESS_MITIGATION_SEHOP_POLICY
 * }
 */
public class PROCESS_MITIGATION_SEHOP_POLICY extends _PROCESS_MITIGATION_SEHOP_POLICY {

    PROCESS_MITIGATION_SEHOP_POLICY() {
        // Should not be called directly
    }
}

