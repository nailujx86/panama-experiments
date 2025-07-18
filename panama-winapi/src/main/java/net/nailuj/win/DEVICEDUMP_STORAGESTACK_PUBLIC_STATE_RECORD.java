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
 * typedef struct _DEVICEDUMP_STORAGESTACK_PUBLIC_STATE_RECORD {
 *     BYTE Cdb[16];
 *     BYTE Command[16];
 *     DWORDLONG StartTime;
 *     DWORDLONG EndTime;
 *     DWORD OperationStatus;
 *     DWORD OperationError;
 *     union {
 *         struct {
 *             DWORD dwReserved;
 *         } ExternalStack;
 *         struct {
 *             DWORD dwAtaPortSpecific;
 *         } AtaPort;
 *         struct {
 *             DWORD SrbTag;
 *         } StorPort;
 *     } StackSpecific;
 * } DEVICEDUMP_STORAGESTACK_PUBLIC_STATE_RECORD
 * }
 */
public class DEVICEDUMP_STORAGESTACK_PUBLIC_STATE_RECORD extends _DEVICEDUMP_STORAGESTACK_PUBLIC_STATE_RECORD {

    DEVICEDUMP_STORAGESTACK_PUBLIC_STATE_RECORD() {
        // Should not be called directly
    }
}

