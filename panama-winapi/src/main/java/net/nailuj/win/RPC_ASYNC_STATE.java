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
 * typedef struct _RPC_ASYNC_STATE {
 *     unsigned int Size;
 *     unsigned long Signature;
 *     long Lock;
 *     unsigned long Flags;
 *     void *StubInfo;
 *     void *UserInfo;
 *     void *RuntimeInfo;
 *     RPC_ASYNC_EVENT Event;
 *     RPC_NOTIFICATION_TYPES NotificationType;
 *     RPC_ASYNC_NOTIFICATION_INFO u;
 *     LONG_PTR Reserved[4];
 * } RPC_ASYNC_STATE
 * }
 */
public class RPC_ASYNC_STATE extends _RPC_ASYNC_STATE {

    RPC_ASYNC_STATE() {
        // Should not be called directly
    }
}

