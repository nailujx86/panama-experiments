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
 * typedef struct _GROUP_RELATIONSHIP {
 *     WORD MaximumGroupCount;
 *     WORD ActiveGroupCount;
 *     BYTE Reserved[20];
 *     PROCESSOR_GROUP_INFO GroupInfo[1];
 * } GROUP_RELATIONSHIP
 * }
 */
public class GROUP_RELATIONSHIP extends _GROUP_RELATIONSHIP {

    GROUP_RELATIONSHIP() {
        // Should not be called directly
    }
}

