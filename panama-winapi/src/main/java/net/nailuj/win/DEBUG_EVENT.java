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
 * typedef struct _DEBUG_EVENT {
 *     DWORD dwDebugEventCode;
 *     DWORD dwProcessId;
 *     DWORD dwThreadId;
 *     union {
 *         EXCEPTION_DEBUG_INFO Exception;
 *         CREATE_THREAD_DEBUG_INFO CreateThread;
 *         CREATE_PROCESS_DEBUG_INFO CreateProcessInfo;
 *         EXIT_THREAD_DEBUG_INFO ExitThread;
 *         EXIT_PROCESS_DEBUG_INFO ExitProcess;
 *         LOAD_DLL_DEBUG_INFO LoadDll;
 *         UNLOAD_DLL_DEBUG_INFO UnloadDll;
 *         OUTPUT_DEBUG_STRING_INFO DebugString;
 *         RIP_INFO RipInfo;
 *     } u;
 * } DEBUG_EVENT
 * }
 */
public class DEBUG_EVENT extends _DEBUG_EVENT {

    DEBUG_EVENT() {
        // Should not be called directly
    }
}

