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
 * typedef struct wavehdr_tag {
 *     LPSTR lpData;
 *     DWORD dwBufferLength;
 *     DWORD dwBytesRecorded;
 *     DWORD_PTR dwUser;
 *     DWORD dwFlags;
 *     DWORD dwLoops;
 *     struct wavehdr_tag *lpNext;
 *     DWORD_PTR reserved;
 * } WAVEHDR
 * }
 */
public class WAVEHDR extends wavehdr_tag {

    WAVEHDR() {
        // Should not be called directly
    }
}

