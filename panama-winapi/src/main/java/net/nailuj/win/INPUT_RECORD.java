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
 * typedef struct _INPUT_RECORD {
 *     WORD EventType;
 *     union {
 *         KEY_EVENT_RECORD KeyEvent;
 *         MOUSE_EVENT_RECORD MouseEvent;
 *         WINDOW_BUFFER_SIZE_RECORD WindowBufferSizeEvent;
 *         MENU_EVENT_RECORD MenuEvent;
 *         FOCUS_EVENT_RECORD FocusEvent;
 *     } Event;
 * } INPUT_RECORD
 * }
 */
public class INPUT_RECORD extends _INPUT_RECORD {

    INPUT_RECORD() {
        // Should not be called directly
    }
}

