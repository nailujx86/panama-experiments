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
 * typedef struct _CERT_CREATE_CONTEXT_PARA {
 *     DWORD cbSize;
 *     PFN_CRYPT_FREE pfnFree;
 *     void *pvFree;
 *     PFN_CERT_CREATE_CONTEXT_SORT_FUNC pfnSort;
 *     void *pvSort;
 * } CERT_CREATE_CONTEXT_PARA
 * }
 */
public class CERT_CREATE_CONTEXT_PARA extends _CERT_CREATE_CONTEXT_PARA {

    CERT_CREATE_CONTEXT_PARA() {
        // Should not be called directly
    }
}

