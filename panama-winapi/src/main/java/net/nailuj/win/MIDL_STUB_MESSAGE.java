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
 * typedef struct _MIDL_STUB_MESSAGE {
 *     PRPC_MESSAGE RpcMsg;
 *     unsigned char *Buffer;
 *     unsigned char *BufferStart;
 *     unsigned char *BufferEnd;
 *     unsigned char *BufferMark;
 *     unsigned long BufferLength;
 *     unsigned long MemorySize;
 *     unsigned char *Memory;
 *     unsigned char IsClient;
 *     unsigned char Pad;
 *     unsigned short uFlags2;
 *     int ReuseBuffer;
 *     struct NDR_ALLOC_ALL_NODES_CONTEXT *pAllocAllNodesContext;
 *     struct NDR_POINTER_QUEUE_STATE *pPointerQueueState;
 *     int IgnoreEmbeddedPointers;
 *     unsigned char *PointerBufferMark;
 *     unsigned char CorrDespIncrement;
 *     unsigned char uFlags;
 *     unsigned short UniquePtrCount;
 *     ULONG_PTR MaxCount;
 *     unsigned long Offset;
 *     unsigned long ActualCount;
 *     void *(*pfnAllocate)(size_t) __attribute__((stdcall));
 *     void (*pfnFree)(void *) __attribute__((stdcall));
 *     unsigned char *StackTop;
 *     unsigned char *pPresentedType;
 *     unsigned char *pTransmitType;
 *     handle_t SavedHandle;
 *     const struct _MIDL_STUB_DESC *StubDesc;
 *     struct _FULL_PTR_XLAT_TABLES *FullPtrXlatTables;
 *     unsigned long FullPtrRefId;
 *     unsigned long PointerLength;
 *     int fInDontFree : 1;
 *     int fDontCallFreeInst : 1;
 *     int fUnused1 : 1;
 *     int fHasReturn : 1;
 *     int fHasExtensions : 1;
 *     int fHasNewCorrDesc : 1;
 *     int fIsIn : 1;
 *     int fIsOut : 1;
 *     int fIsOicf : 1;
 *     int fBufferValid : 1;
 *     int fHasMemoryValidateCallback : 1;
 *     int fInFree : 1;
 *     int fNeedMCCP : 1;
 *     int fUnused2 : 3;
 *     int fUnused3 : 16;
 *     unsigned long dwDestContext;
 *     void *pvDestContext;
 *     NDR_SCONTEXT *SavedContextHandles;
 *     long ParamNumber;
 *     struct IRpcChannelBuffer *pRpcChannelBuffer;
 *     PARRAY_INFO pArrayInfo;
 *     unsigned long *SizePtrCountArray;
 *     unsigned long *SizePtrOffsetArray;
 *     unsigned long *SizePtrLengthArray;
 *     void *pArgQueue;
 *     unsigned long dwStubPhase;
 *     void *LowStackMark;
 *     PNDR_ASYNC_MESSAGE pAsyncMsg;
 *     PNDR_CORRELATION_INFO pCorrInfo;
 *     unsigned char *pCorrMemory;
 *     void *pMemoryList;
 *     INT_PTR pCSInfo;
 *     unsigned char *ConformanceMark;
 *     unsigned char *VarianceMark;
 *     INT_PTR Unused;
 *     struct _NDR_PROC_CONTEXT *pContext;
 *     void *ContextHandleHash;
 *     void *pUserMarshalList;
 *     unsigned char *pFullPtrFormat;
 *     INT_PTR Reserved51_4;
 *     INT_PTR Reserved51_5;
 * } MIDL_STUB_MESSAGE
 * }
 */
public class MIDL_STUB_MESSAGE extends _MIDL_STUB_MESSAGE {

    MIDL_STUB_MESSAGE() {
        // Should not be called directly
    }
}

