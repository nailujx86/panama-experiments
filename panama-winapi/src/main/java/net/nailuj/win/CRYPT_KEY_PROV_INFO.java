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
 * typedef struct _CRYPT_KEY_PROV_INFO {
 *     LPWSTR pwszContainerName;
 *     LPWSTR pwszProvName;
 *     DWORD dwProvType;
 *     DWORD dwFlags;
 *     DWORD cProvParam;
 *     PCRYPT_KEY_PROV_PARAM rgProvParam;
 *     DWORD dwKeySpec;
 * } CRYPT_KEY_PROV_INFO
 * }
 */
public class CRYPT_KEY_PROV_INFO extends _CRYPT_KEY_PROV_INFO {

    CRYPT_KEY_PROV_INFO() {
        // Should not be called directly
    }
}

