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
 * typedef struct _CONSOLE_SCREEN_BUFFER_INFOEX {
 *     ULONG cbSize;
 *     COORD dwSize;
 *     COORD dwCursorPosition;
 *     WORD wAttributes;
 *     SMALL_RECT srWindow;
 *     COORD dwMaximumWindowSize;
 *     WORD wPopupAttributes;
 *     BOOL bFullscreenSupported;
 *     COLORREF ColorTable[16];
 * } CONSOLE_SCREEN_BUFFER_INFOEX
 * }
 */
public class CONSOLE_SCREEN_BUFFER_INFOEX extends _CONSOLE_SCREEN_BUFFER_INFOEX {

    CONSOLE_SCREEN_BUFFER_INFOEX() {
        // Should not be called directly
    }
}

