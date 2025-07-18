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
 * typedef struct _DISK_RECORD {
 *     LARGE_INTEGER ByteOffset;
 *     LARGE_INTEGER StartTime;
 *     LARGE_INTEGER EndTime;
 *     PVOID VirtualAddress;
 *     DWORD NumberOfBytes;
 *     BYTE DeviceNumber;
 *     BOOLEAN ReadRequest;
 * } DISK_RECORD
 * }
 */
public class DISK_RECORD extends _DISK_RECORD {

    DISK_RECORD() {
        // Should not be called directly
    }
}

