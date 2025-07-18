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
 * typedef struct _CRL_INFO {
 *     DWORD dwVersion;
 *     CRYPT_ALGORITHM_IDENTIFIER SignatureAlgorithm;
 *     CERT_NAME_BLOB Issuer;
 *     FILETIME ThisUpdate;
 *     FILETIME NextUpdate;
 *     DWORD cCRLEntry;
 *     PCRL_ENTRY rgCRLEntry;
 *     DWORD cExtension;
 *     PCERT_EXTENSION rgExtension;
 * } CRL_INFO
 * }
 */
public class CRL_INFO extends _CRL_INFO {

    CRL_INFO() {
        // Should not be called directly
    }
}

