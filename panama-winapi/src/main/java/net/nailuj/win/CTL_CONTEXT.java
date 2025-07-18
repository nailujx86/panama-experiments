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
 * typedef struct _CTL_CONTEXT {
 *     DWORD dwMsgAndCertEncodingType;
 *     BYTE *pbCtlEncoded;
 *     DWORD cbCtlEncoded;
 *     PCTL_INFO pCtlInfo;
 *     HCERTSTORE hCertStore;
 *     HCRYPTMSG hCryptMsg;
 *     BYTE *pbCtlContent;
 *     DWORD cbCtlContent;
 * } CTL_CONTEXT
 * }
 */
public class CTL_CONTEXT extends _CTL_CONTEXT {

    CTL_CONTEXT() {
        // Should not be called directly
    }
}

