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
 * typedef struct _RPC_BINDING_HANDLE_SECURITY_V1_W {
 *     unsigned long Version;
 *     unsigned short *ServerPrincName;
 *     unsigned long AuthnLevel;
 *     unsigned long AuthnSvc;
 *     SEC_WINNT_AUTH_IDENTITY_W *AuthIdentity;
 *     RPC_SECURITY_QOS *SecurityQos;
 * } RPC_BINDING_HANDLE_SECURITY_V1_W
 * }
 */
public class RPC_BINDING_HANDLE_SECURITY_V1_W extends _RPC_BINDING_HANDLE_SECURITY_V1_W {

    RPC_BINDING_HANDLE_SECURITY_V1_W() {
        // Should not be called directly
    }
}

