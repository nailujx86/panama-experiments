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
 * typedef struct _STORAGE_READ_CAPACITY {
 *     DWORD Version;
 *     DWORD Size;
 *     DWORD BlockLength;
 *     LARGE_INTEGER NumberOfBlocks;
 *     LARGE_INTEGER DiskLength;
 * } STORAGE_READ_CAPACITY
 * }
 */
public class STORAGE_READ_CAPACITY extends _STORAGE_READ_CAPACITY {

    STORAGE_READ_CAPACITY() {
        // Should not be called directly
    }
}

