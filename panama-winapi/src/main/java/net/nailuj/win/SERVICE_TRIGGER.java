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
 * typedef struct _SERVICE_TRIGGER {
 *     DWORD dwTriggerType;
 *     DWORD dwAction;
 *     GUID *pTriggerSubtype;
 *     DWORD cDataItems;
 *     PSERVICE_TRIGGER_SPECIFIC_DATA_ITEM pDataItems;
 * } SERVICE_TRIGGER
 * }
 */
public class SERVICE_TRIGGER extends _SERVICE_TRIGGER {

    SERVICE_TRIGGER() {
        // Should not be called directly
    }
}

