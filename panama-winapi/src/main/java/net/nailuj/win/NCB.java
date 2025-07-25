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
 * typedef struct _NCB {
 *     UCHAR ncb_command;
 *     UCHAR ncb_retcode;
 *     UCHAR ncb_lsn;
 *     UCHAR ncb_num;
 *     PUCHAR ncb_buffer;
 *     WORD ncb_length;
 *     UCHAR ncb_callname[16];
 *     UCHAR ncb_name[16];
 *     UCHAR ncb_rto;
 *     UCHAR ncb_sto;
 *     void (*ncb_post)(struct _NCB *) __attribute__((stdcall));
 *     UCHAR ncb_lana_num;
 *     UCHAR ncb_cmd_cplt;
 *     UCHAR ncb_reserve[18];
 *     HANDLE ncb_event;
 * } NCB
 * }
 */
public class NCB extends _NCB {

    NCB() {
        // Should not be called directly
    }
}

