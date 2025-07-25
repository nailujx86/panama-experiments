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
 * typedef struct _UMS_SCHEDULER_STARTUP_INFO {
 *     ULONG UmsVersion;
 *     PUMS_COMPLETION_LIST CompletionList;
 *     PUMS_SCHEDULER_ENTRY_POINT SchedulerProc;
 *     PVOID SchedulerParam;
 * } UMS_SCHEDULER_STARTUP_INFO
 * }
 */
public class UMS_SCHEDULER_STARTUP_INFO extends _UMS_SCHEDULER_STARTUP_INFO {

    UMS_SCHEDULER_STARTUP_INFO() {
        // Should not be called directly
    }
}

