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
 * typedef struct _ADAPTER_STATUS {
 *     UCHAR adapter_address[6];
 *     UCHAR rev_major;
 *     UCHAR reserved0;
 *     UCHAR adapter_type;
 *     UCHAR rev_minor;
 *     WORD duration;
 *     WORD frmr_recv;
 *     WORD frmr_xmit;
 *     WORD iframe_recv_err;
 *     WORD xmit_aborts;
 *     DWORD xmit_success;
 *     DWORD recv_success;
 *     WORD iframe_xmit_err;
 *     WORD recv_buff_unavail;
 *     WORD t1_timeouts;
 *     WORD ti_timeouts;
 *     DWORD reserved1;
 *     WORD free_ncbs;
 *     WORD max_cfg_ncbs;
 *     WORD max_ncbs;
 *     WORD xmit_buf_unavail;
 *     WORD max_dgram_size;
 *     WORD pending_sess;
 *     WORD max_cfg_sess;
 *     WORD max_sess;
 *     WORD max_sess_pkt_size;
 *     WORD name_count;
 * } ADAPTER_STATUS
 * }
 */
public class ADAPTER_STATUS extends _ADAPTER_STATUS {

    ADAPTER_STATUS() {
        // Should not be called directly
    }
}

