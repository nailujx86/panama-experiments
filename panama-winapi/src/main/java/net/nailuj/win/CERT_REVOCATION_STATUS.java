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
 * typedef struct _CERT_REVOCATION_STATUS {
 *     DWORD cbSize;
 *     DWORD dwIndex;
 *     DWORD dwError;
 *     DWORD dwReason;
 *     BOOL fHasFreshnessTime;
 *     DWORD dwFreshnessTime;
 * } CERT_REVOCATION_STATUS
 * }
 */
public class CERT_REVOCATION_STATUS extends _CERT_REVOCATION_STATUS {

    CERT_REVOCATION_STATUS() {
        // Should not be called directly
    }
}

