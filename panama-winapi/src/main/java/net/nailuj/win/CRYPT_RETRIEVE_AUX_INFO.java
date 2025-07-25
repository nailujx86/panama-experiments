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
 * typedef struct _CRYPT_RETRIEVE_AUX_INFO {
 *     DWORD cbSize;
 *     FILETIME *pLastSyncTime;
 *     DWORD dwMaxUrlRetrievalByteCount;
 *     PCRYPTNET_URL_CACHE_PRE_FETCH_INFO pPreFetchInfo;
 *     PCRYPTNET_URL_CACHE_FLUSH_INFO pFlushInfo;
 *     PCRYPTNET_URL_CACHE_RESPONSE_INFO *ppResponseInfo;
 *     LPWSTR pwszCacheFileNamePrefix;
 *     LPFILETIME pftCacheResync;
 *     BOOL fProxyCacheRetrieval;
 *     DWORD dwHttpStatusCode;
 *     LPWSTR *ppwszErrorResponseHeaders;
 *     PCRYPT_DATA_BLOB *ppErrorContentBlob;
 * } CRYPT_RETRIEVE_AUX_INFO
 * }
 */
public class CRYPT_RETRIEVE_AUX_INFO extends _CRYPT_RETRIEVE_AUX_INFO {

    CRYPT_RETRIEVE_AUX_INFO() {
        // Should not be called directly
    }
}

