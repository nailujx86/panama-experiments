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
 * typedef struct _GDI_OBJECT {
 *     DWORD ObjectType;
 *     union __MIDL_IAdviseSink_0002 {
 *         wireHBITMAP hBitmap;
 *         wireHPALETTE hPalette;
 *         wireHGLOBAL hGeneric;
 *     } u;
 * } GDI_OBJECT
 * }
 */
public class GDI_OBJECT extends _GDI_OBJECT {

    GDI_OBJECT() {
        // Should not be called directly
    }
}

