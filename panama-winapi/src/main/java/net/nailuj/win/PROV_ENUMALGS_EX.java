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
 * typedef struct _PROV_ENUMALGS_EX {
 *     ALG_ID aiAlgid;
 *     DWORD dwDefaultLen;
 *     DWORD dwMinLen;
 *     DWORD dwMaxLen;
 *     DWORD dwProtocols;
 *     DWORD dwNameLen;
 *     CHAR szName[20];
 *     DWORD dwLongNameLen;
 *     CHAR szLongName[40];
 * } PROV_ENUMALGS_EX
 * }
 */
public class PROV_ENUMALGS_EX extends _PROV_ENUMALGS_EX {

    PROV_ENUMALGS_EX() {
        // Should not be called directly
    }
}

