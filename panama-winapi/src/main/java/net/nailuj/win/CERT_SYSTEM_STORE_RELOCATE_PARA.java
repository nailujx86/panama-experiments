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
 * typedef struct _CERT_SYSTEM_STORE_RELOCATE_PARA {
 *     union {
 *         HKEY hKeyBase;
 *         void *pvBase;
 *     };
 *     union {
 *         void *pvSystemStore;
 *         LPCSTR pszSystemStore;
 *         LPCWSTR pwszSystemStore;
 *     };
 * } CERT_SYSTEM_STORE_RELOCATE_PARA
 * }
 */
public class CERT_SYSTEM_STORE_RELOCATE_PARA extends _CERT_SYSTEM_STORE_RELOCATE_PARA {

    CERT_SYSTEM_STORE_RELOCATE_PARA() {
        // Should not be called directly
    }
}

