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
 * typedef struct _CRYPTNET_URL_CACHE_RESPONSE_INFO {
 *     DWORD cbSize;
 *     WORD wResponseType;
 *     WORD wResponseFlags;
 *     FILETIME LastModifiedTime;
 *     DWORD dwMaxAge;
 *     LPCWSTR pwszETag;
 *     DWORD dwProxyId;
 * } CRYPTNET_URL_CACHE_RESPONSE_INFO
 * }
 */
public class CRYPTNET_URL_CACHE_RESPONSE_INFO extends _CRYPTNET_URL_CACHE_RESPONSE_INFO {

    CRYPTNET_URL_CACHE_RESPONSE_INFO() {
        // Should not be called directly
    }
}

