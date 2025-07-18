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
 * typedef struct _STARTUPINFOW {
 *     DWORD cb;
 *     LPWSTR lpReserved;
 *     LPWSTR lpDesktop;
 *     LPWSTR lpTitle;
 *     DWORD dwX;
 *     DWORD dwY;
 *     DWORD dwXSize;
 *     DWORD dwYSize;
 *     DWORD dwXCountChars;
 *     DWORD dwYCountChars;
 *     DWORD dwFillAttribute;
 *     DWORD dwFlags;
 *     WORD wShowWindow;
 *     WORD cbReserved2;
 *     LPBYTE lpReserved2;
 *     HANDLE hStdInput;
 *     HANDLE hStdOutput;
 *     HANDLE hStdError;
 * } STARTUPINFOW
 * }
 */
public class STARTUPINFOW extends _STARTUPINFOW {

    STARTUPINFOW() {
        // Should not be called directly
    }
}

