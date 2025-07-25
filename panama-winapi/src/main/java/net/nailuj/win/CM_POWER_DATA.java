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
 * typedef struct CM_Power_Data_s {
 *     DWORD PD_Size;
 *     DEVICE_POWER_STATE PD_MostRecentPowerState;
 *     DWORD PD_Capabilities;
 *     DWORD PD_D1Latency;
 *     DWORD PD_D2Latency;
 *     DWORD PD_D3Latency;
 *     DEVICE_POWER_STATE PD_PowerStateMapping[7];
 *     SYSTEM_POWER_STATE PD_DeepestSystemWake;
 * } CM_POWER_DATA
 * }
 */
public class CM_POWER_DATA extends CM_Power_Data_s {

    CM_POWER_DATA() {
        // Should not be called directly
    }
}

