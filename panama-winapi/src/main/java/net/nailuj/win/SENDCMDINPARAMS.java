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
 * typedef struct _SENDCMDINPARAMS {
 *     DWORD cBufferSize;
 *     IDEREGS irDriveRegs;
 *     BYTE bDriveNumber;
 *     BYTE bReserved[3];
 *     DWORD dwReserved[4];
 *     BYTE bBuffer[1];
 * } SENDCMDINPARAMS
 * }
 */
public class SENDCMDINPARAMS extends _SENDCMDINPARAMS {

    SENDCMDINPARAMS() {
        // Should not be called directly
    }
}

