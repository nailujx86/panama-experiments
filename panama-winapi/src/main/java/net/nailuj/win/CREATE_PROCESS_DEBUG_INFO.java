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
 * typedef struct _CREATE_PROCESS_DEBUG_INFO {
 *     HANDLE hFile;
 *     HANDLE hProcess;
 *     HANDLE hThread;
 *     LPVOID lpBaseOfImage;
 *     DWORD dwDebugInfoFileOffset;
 *     DWORD nDebugInfoSize;
 *     LPVOID lpThreadLocalBase;
 *     LPTHREAD_START_ROUTINE lpStartAddress;
 *     LPVOID lpImageName;
 *     WORD fUnicode;
 * } CREATE_PROCESS_DEBUG_INFO
 * }
 */
public class CREATE_PROCESS_DEBUG_INFO extends _CREATE_PROCESS_DEBUG_INFO {

    CREATE_PROCESS_DEBUG_INFO() {
        // Should not be called directly
    }
}

