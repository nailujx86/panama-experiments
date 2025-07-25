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
 * typedef struct _IMAGE_POLICY_METADATA {
 *     BYTE Version;
 *     BYTE Reserved0[7];
 *     ULONGLONG ApplicationId;
 *     IMAGE_POLICY_ENTRY Policies[];
 * } IMAGE_POLICY_METADATA
 * }
 */
public class IMAGE_POLICY_METADATA extends _IMAGE_POLICY_METADATA {

    IMAGE_POLICY_METADATA() {
        // Should not be called directly
    }
}

