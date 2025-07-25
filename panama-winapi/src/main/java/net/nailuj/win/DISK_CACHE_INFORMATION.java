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
 * typedef struct _DISK_CACHE_INFORMATION {
 *     BOOLEAN ParametersSavable;
 *     BOOLEAN ReadCacheEnabled;
 *     BOOLEAN WriteCacheEnabled;
 *     DISK_CACHE_RETENTION_PRIORITY ReadRetentionPriority;
 *     DISK_CACHE_RETENTION_PRIORITY WriteRetentionPriority;
 *     WORD DisablePrefetchTransferLength;
 *     BOOLEAN PrefetchScalar;
 *     union {
 *         struct {
 *             WORD Minimum;
 *             WORD Maximum;
 *             WORD MaximumBlocks;
 *         } ScalarPrefetch;
 *         struct {
 *             WORD Minimum;
 *             WORD Maximum;
 *         } BlockPrefetch;
 *     };
 * } DISK_CACHE_INFORMATION
 * }
 */
public class DISK_CACHE_INFORMATION extends _DISK_CACHE_INFORMATION {

    DISK_CACHE_INFORMATION() {
        // Should not be called directly
    }
}

