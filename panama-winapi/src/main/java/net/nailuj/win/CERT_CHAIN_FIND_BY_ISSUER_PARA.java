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
 * typedef struct _CERT_CHAIN_FIND_BY_ISSUER_PARA {
 *     DWORD cbSize;
 *     LPCSTR pszUsageIdentifier;
 *     DWORD dwKeySpec;
 *     DWORD dwAcquirePrivateKeyFlags;
 *     DWORD cIssuer;
 *     CERT_NAME_BLOB *rgIssuer;
 *     PFN_CERT_CHAIN_FIND_BY_ISSUER_CALLBACK pfnFindCallback;
 *     void *pvFindArg;
 * } CERT_CHAIN_FIND_BY_ISSUER_PARA
 * }
 */
public class CERT_CHAIN_FIND_BY_ISSUER_PARA extends _CERT_CHAIN_FIND_BY_ISSUER_PARA {

    CERT_CHAIN_FIND_BY_ISSUER_PARA() {
        // Should not be called directly
    }
}

