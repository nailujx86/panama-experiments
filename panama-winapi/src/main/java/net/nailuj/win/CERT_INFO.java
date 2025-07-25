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
 * typedef struct _CERT_INFO {
 *     DWORD dwVersion;
 *     CRYPT_INTEGER_BLOB SerialNumber;
 *     CRYPT_ALGORITHM_IDENTIFIER SignatureAlgorithm;
 *     CERT_NAME_BLOB Issuer;
 *     FILETIME NotBefore;
 *     FILETIME NotAfter;
 *     CERT_NAME_BLOB Subject;
 *     CERT_PUBLIC_KEY_INFO SubjectPublicKeyInfo;
 *     CRYPT_BIT_BLOB IssuerUniqueId;
 *     CRYPT_BIT_BLOB SubjectUniqueId;
 *     DWORD cExtension;
 *     PCERT_EXTENSION rgExtension;
 * } CERT_INFO
 * }
 */
public class CERT_INFO extends _CERT_INFO {

    CERT_INFO() {
        // Should not be called directly
    }
}

