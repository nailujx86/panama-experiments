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
 * typedef struct _SCM_PD_FIRMWARE_INFO {
 *     DWORD Version;
 *     DWORD Size;
 *     BYTE ActiveSlot;
 *     BYTE NextActiveSlot;
 *     BYTE SlotCount;
 *     SCM_PD_FIRMWARE_SLOT_INFO Slots[1];
 * } SCM_PD_FIRMWARE_INFO
 * }
 */
public class SCM_PD_FIRMWARE_INFO extends _SCM_PD_FIRMWARE_INFO {

    SCM_PD_FIRMWARE_INFO() {
        // Should not be called directly
    }
}

