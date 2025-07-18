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
 * typedef struct _PERF_OBJECT_TYPE {
 *     DWORD TotalByteLength;
 *     DWORD DefinitionLength;
 *     DWORD HeaderLength;
 *     DWORD ObjectNameTitleIndex;
 *     DWORD ObjectNameTitle;
 *     DWORD ObjectHelpTitleIndex;
 *     DWORD ObjectHelpTitle;
 *     DWORD DetailLevel;
 *     DWORD NumCounters;
 *     LONG DefaultCounter;
 *     LONG NumInstances;
 *     DWORD CodePage;
 *     LARGE_INTEGER PerfTime;
 *     LARGE_INTEGER PerfFreq;
 * } PERF_OBJECT_TYPE
 * }
 */
public class PERF_OBJECT_TYPE extends _PERF_OBJECT_TYPE {

    PERF_OBJECT_TYPE() {
        // Should not be called directly
    }
}

