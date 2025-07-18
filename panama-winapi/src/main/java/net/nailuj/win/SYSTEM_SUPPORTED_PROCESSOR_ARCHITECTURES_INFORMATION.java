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
 * typedef struct _SYSTEM_SUPPORTED_PROCESSOR_ARCHITECTURES_INFORMATION {
 *     DWORD Machine : 16;
 *     DWORD KernelMode : 1;
 *     DWORD UserMode : 1;
 *     DWORD Native : 1;
 *     DWORD Process : 1;
 *     DWORD WoW64Container : 1;
 *     DWORD ReservedZero0 : 11;
 * } SYSTEM_SUPPORTED_PROCESSOR_ARCHITECTURES_INFORMATION
 * }
 */
public class SYSTEM_SUPPORTED_PROCESSOR_ARCHITECTURES_INFORMATION extends _SYSTEM_SUPPORTED_PROCESSOR_ARCHITECTURES_INFORMATION {

    SYSTEM_SUPPORTED_PROCESSOR_ARCHITECTURES_INFORMATION() {
        // Should not be called directly
    }
}

