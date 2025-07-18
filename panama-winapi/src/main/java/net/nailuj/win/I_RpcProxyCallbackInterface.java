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
 * typedef struct tagI_RpcProxyCallbackInterface {
 *     I_RpcProxyIsValidMachineFn IsValidMachineFn;
 *     I_RpcProxyGetClientAddressFn GetClientAddressFn;
 *     I_RpcProxyGetConnectionTimeoutFn GetConnectionTimeoutFn;
 *     I_RpcPerformCalloutFn PerformCalloutFn;
 *     I_RpcFreeCalloutStateFn FreeCalloutStateFn;
 *     I_RpcProxyGetClientSessionAndResourceUUID GetClientSessionAndResourceUUIDFn;
 *     I_RpcProxyFilterIfFn ProxyFilterIfFn;
 *     I_RpcProxyUpdatePerfCounterFn RpcProxyUpdatePerfCounterFn;
 *     I_RpcProxyUpdatePerfCounterBackendServerFn RpcProxyUpdatePerfCounterBackendServerFn;
 * } I_RpcProxyCallbackInterface
 * }
 */
public class I_RpcProxyCallbackInterface extends tagI_RpcProxyCallbackInterface {

    I_RpcProxyCallbackInterface() {
        // Should not be called directly
    }
}

