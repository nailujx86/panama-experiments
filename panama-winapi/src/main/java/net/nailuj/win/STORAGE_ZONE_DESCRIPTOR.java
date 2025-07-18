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
 * typedef struct _STORAGE_ZONE_DESCRIPTOR {
 *     DWORD Size;
 *     STORAGE_ZONE_TYPES ZoneType;
 *     STORAGE_ZONE_CONDITION ZoneCondition;
 *     BOOLEAN ResetWritePointerRecommend;
 *     BYTE Reserved0[3];
 *     DWORDLONG ZoneSize;
 *     DWORDLONG WritePointerOffset;
 * } STORAGE_ZONE_DESCRIPTOR
 * }
 */
public class STORAGE_ZONE_DESCRIPTOR extends _STORAGE_ZONE_DESCRIPTOR {

    STORAGE_ZONE_DESCRIPTOR() {
        // Should not be called directly
    }
}

