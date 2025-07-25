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
 * typedef struct _PARTITION_INFORMATION {
 *     LARGE_INTEGER StartingOffset;
 *     LARGE_INTEGER PartitionLength;
 *     DWORD HiddenSectors;
 *     DWORD PartitionNumber;
 *     BYTE PartitionType;
 *     BOOLEAN BootIndicator;
 *     BOOLEAN RecognizedPartition;
 *     BOOLEAN RewritePartition;
 * } PARTITION_INFORMATION
 * }
 */
public class PARTITION_INFORMATION extends _PARTITION_INFORMATION {

    PARTITION_INFORMATION() {
        // Should not be called directly
    }
}

