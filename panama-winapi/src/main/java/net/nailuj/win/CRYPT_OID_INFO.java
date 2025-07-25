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
 * typedef struct _CRYPT_OID_INFO {
 *     DWORD cbSize;
 *     LPCSTR pszOID;
 *     LPCWSTR pwszName;
 *     DWORD dwGroupId;
 *     union {
 *         DWORD dwValue;
 *         ALG_ID Algid;
 *         DWORD dwLength;
 *     };
 *     CRYPT_DATA_BLOB ExtraInfo;
 * } CRYPT_OID_INFO
 * }
 */
public class CRYPT_OID_INFO extends _CRYPT_OID_INFO {

    CRYPT_OID_INFO() {
        // Should not be called directly
    }
}

