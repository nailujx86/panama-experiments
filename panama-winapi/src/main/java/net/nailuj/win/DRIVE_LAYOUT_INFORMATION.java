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
 * typedef struct _DRIVE_LAYOUT_INFORMATION {
 *     DWORD PartitionCount;
 *     DWORD Signature;
 *     PARTITION_INFORMATION PartitionEntry[1];
 * } DRIVE_LAYOUT_INFORMATION
 * }
 */
public class DRIVE_LAYOUT_INFORMATION extends _DRIVE_LAYOUT_INFORMATION {

    DRIVE_LAYOUT_INFORMATION() {
        // Should not be called directly
    }
}

