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
 * typedef struct _DEVICE_DATA_SET_SCRUB_EX_OUTPUT {
 *     DWORDLONG BytesProcessed;
 *     DWORDLONG BytesRepaired;
 *     DWORDLONG BytesFailed;
 *     DEVICE_DSM_RANGE ParityExtent;
 *     DWORDLONG BytesScrubbed;
 * } DEVICE_DSM_SCRUB_OUTPUT2
 * }
 */
public class DEVICE_DSM_SCRUB_OUTPUT2 extends _DEVICE_DATA_SET_SCRUB_EX_OUTPUT {

    DEVICE_DSM_SCRUB_OUTPUT2() {
        // Should not be called directly
    }
}

