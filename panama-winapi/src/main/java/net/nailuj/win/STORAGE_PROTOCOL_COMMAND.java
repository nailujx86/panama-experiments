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
 * typedef struct _STORAGE_PROTOCOL_COMMAND {
 *     DWORD Version;
 *     DWORD Length;
 *     STORAGE_PROTOCOL_TYPE ProtocolType;
 *     DWORD Flags;
 *     DWORD ReturnStatus;
 *     DWORD ErrorCode;
 *     DWORD CommandLength;
 *     DWORD ErrorInfoLength;
 *     DWORD DataToDeviceTransferLength;
 *     DWORD DataFromDeviceTransferLength;
 *     DWORD TimeOutValue;
 *     DWORD ErrorInfoOffset;
 *     DWORD DataToDeviceBufferOffset;
 *     DWORD DataFromDeviceBufferOffset;
 *     DWORD CommandSpecific;
 *     DWORD Reserved0;
 *     DWORD FixedProtocolReturnData;
 *     DWORD FixedProtocolReturnData2;
 *     DWORD Reserved1[2];
 *     BYTE Command[1];
 * } STORAGE_PROTOCOL_COMMAND
 * }
 */
public class STORAGE_PROTOCOL_COMMAND extends _STORAGE_PROTOCOL_COMMAND {

    STORAGE_PROTOCOL_COMMAND() {
        // Should not be called directly
    }
}

