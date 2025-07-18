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
 * typedef struct _GET_CHANGER_PARAMETERS {
 *     DWORD Size;
 *     WORD NumberTransportElements;
 *     WORD NumberStorageElements;
 *     WORD NumberCleanerSlots;
 *     WORD NumberIEElements;
 *     WORD NumberDataTransferElements;
 *     WORD NumberOfDoors;
 *     WORD FirstSlotNumber;
 *     WORD FirstDriveNumber;
 *     WORD FirstTransportNumber;
 *     WORD FirstIEPortNumber;
 *     WORD FirstCleanerSlotAddress;
 *     WORD MagazineSize;
 *     DWORD DriveCleanTimeout;
 *     DWORD Features0;
 *     DWORD Features1;
 *     BYTE MoveFromTransport;
 *     BYTE MoveFromSlot;
 *     BYTE MoveFromIePort;
 *     BYTE MoveFromDrive;
 *     BYTE ExchangeFromTransport;
 *     BYTE ExchangeFromSlot;
 *     BYTE ExchangeFromIePort;
 *     BYTE ExchangeFromDrive;
 *     BYTE LockUnlockCapabilities;
 *     BYTE PositionCapabilities;
 *     BYTE Reserved1[2];
 *     DWORD Reserved2[2];
 * } GET_CHANGER_PARAMETERS
 * }
 */
public class GET_CHANGER_PARAMETERS extends _GET_CHANGER_PARAMETERS {

    GET_CHANGER_PARAMETERS() {
        // Should not be called directly
    }
}

