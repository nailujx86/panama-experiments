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
 * typedef struct _TXFS_ROLLFORWARD_REDO_INFORMATION {
 *     LARGE_INTEGER LastVirtualClock;
 *     DWORDLONG LastRedoLsn;
 *     DWORDLONG HighestRecoveryLsn;
 *     DWORD Flags;
 * } TXFS_ROLLFORWARD_REDO_INFORMATION
 * }
 */
public class TXFS_ROLLFORWARD_REDO_INFORMATION extends _TXFS_ROLLFORWARD_REDO_INFORMATION {

    TXFS_ROLLFORWARD_REDO_INFORMATION() {
        // Should not be called directly
    }
}

