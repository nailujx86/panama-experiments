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
 * typedef struct _SE_TOKEN_USER {
 *     union {
 *         TOKEN_USER TokenUser;
 *         SID_AND_ATTRIBUTES User;
 *     };
 *     union {
 *         SID Sid;
 *         BYTE Buffer[68];
 *     };
 * } SE_TOKEN_USER
 * }
 */
public class SE_TOKEN_USER extends _SE_TOKEN_USER {

    SE_TOKEN_USER() {
        // Should not be called directly
    }
}

