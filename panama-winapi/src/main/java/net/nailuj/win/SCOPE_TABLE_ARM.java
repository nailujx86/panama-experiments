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
 * typedef struct _SCOPE_TABLE_ARM {
 *     DWORD Count;
 *     struct {
 *         DWORD BeginAddress;
 *         DWORD EndAddress;
 *         DWORD HandlerAddress;
 *         DWORD JumpTarget;
 *     } ScopeRecord[1];
 * } SCOPE_TABLE_ARM
 * }
 */
public class SCOPE_TABLE_ARM extends _SCOPE_TABLE_ARM {

    SCOPE_TABLE_ARM() {
        // Should not be called directly
    }
}

