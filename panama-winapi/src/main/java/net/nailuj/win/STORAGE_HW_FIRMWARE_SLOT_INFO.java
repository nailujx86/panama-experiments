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
 * typedef struct _STORAGE_HW_FIRMWARE_SLOT_INFO {
 *     DWORD Version;
 *     DWORD Size;
 *     BYTE SlotNumber;
 *     BYTE ReadOnly : 1;
 *     BYTE Reserved0 : 7;
 *     BYTE Reserved1[6];
 *     BYTE Revision[16];
 * } STORAGE_HW_FIRMWARE_SLOT_INFO
 * }
 */
public class STORAGE_HW_FIRMWARE_SLOT_INFO extends _STORAGE_HW_FIRMWARE_SLOT_INFO {

    STORAGE_HW_FIRMWARE_SLOT_INFO() {
        // Should not be called directly
    }
}

