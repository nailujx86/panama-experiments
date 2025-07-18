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
 * typedef struct _FILE_COMPRESSION_INFO {
 *     LARGE_INTEGER CompressedFileSize;
 *     WORD CompressionFormat;
 *     UCHAR CompressionUnitShift;
 *     UCHAR ChunkShift;
 *     UCHAR ClusterShift;
 *     UCHAR Reserved[3];
 * } FILE_COMPRESSION_INFO
 * }
 */
public class FILE_COMPRESSION_INFO extends _FILE_COMPRESSION_INFO {

    FILE_COMPRESSION_INFO() {
        // Should not be called directly
    }
}

