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
 * typedef struct tagPOINTER_TOUCH_INFO {
 *     POINTER_INFO pointerInfo;
 *     TOUCH_FLAGS touchFlags;
 *     TOUCH_MASK touchMask;
 *     RECT rcContact;
 *     RECT rcContactRaw;
 *     UINT32 orientation;
 *     UINT32 pressure;
 * } POINTER_TOUCH_INFO
 * }
 */
public class POINTER_TOUCH_INFO extends tagPOINTER_TOUCH_INFO {

    POINTER_TOUCH_INFO() {
        // Should not be called directly
    }
}

