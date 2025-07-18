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
 * typedef struct _NUMA_NODE_RELATIONSHIP {
 *     DWORD NodeNumber;
 *     BYTE Reserved[18];
 *     WORD GroupCount;
 *     union {
 *         GROUP_AFFINITY GroupMask;
 *         GROUP_AFFINITY GroupMasks[1];
 *     };
 * } NUMA_NODE_RELATIONSHIP
 * }
 */
public class NUMA_NODE_RELATIONSHIP extends _NUMA_NODE_RELATIONSHIP {

    NUMA_NODE_RELATIONSHIP() {
        // Should not be called directly
    }
}

