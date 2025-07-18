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
 * struct tagRPC_CALL_ATTRIBUTES_V3_A {
 *     unsigned int Version;
 *     unsigned long Flags;
 *     unsigned long ServerPrincipalNameBufferLength;
 *     unsigned char *ServerPrincipalName;
 *     unsigned long ClientPrincipalNameBufferLength;
 *     unsigned char *ClientPrincipalName;
 *     unsigned long AuthenticationLevel;
 *     unsigned long AuthenticationService;
 *     BOOL NullSession;
 *     BOOL KernelModeCaller;
 *     unsigned long ProtocolSequence;
 *     unsigned long IsClientLocal;
 *     HANDLE ClientPID;
 *     unsigned long CallStatus;
 *     RpcCallType CallType;
 *     RPC_CALL_LOCAL_ADDRESS_V1 *CallLocalAddress;
 *     unsigned short OpNum;
 *     UUID InterfaceUuid;
 *     unsigned long ClientIdentifierBufferLength;
 *     unsigned char *ClientIdentifier;
 * }
 * }
 */
public class tagRPC_CALL_ATTRIBUTES_V3_A {

    tagRPC_CALL_ATTRIBUTES_V3_A() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_INT.withName("Version"),
        winapi.C_LONG.withName("Flags"),
        winapi.C_LONG.withName("ServerPrincipalNameBufferLength"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("ServerPrincipalName"),
        winapi.C_LONG.withName("ClientPrincipalNameBufferLength"),
        MemoryLayout.paddingLayout(4),
        winapi.C_POINTER.withName("ClientPrincipalName"),
        winapi.C_LONG.withName("AuthenticationLevel"),
        winapi.C_LONG.withName("AuthenticationService"),
        winapi.C_INT.withName("NullSession"),
        winapi.C_INT.withName("KernelModeCaller"),
        winapi.C_LONG.withName("ProtocolSequence"),
        winapi.C_LONG.withName("IsClientLocal"),
        winapi.C_POINTER.withName("ClientPID"),
        winapi.C_LONG.withName("CallStatus"),
        winapi.C_INT.withName("CallType"),
        winapi.C_POINTER.withName("CallLocalAddress"),
        winapi.C_SHORT.withName("OpNum"),
        MemoryLayout.paddingLayout(2),
        _GUID.layout().withName("InterfaceUuid"),
        winapi.C_LONG.withName("ClientIdentifierBufferLength"),
        winapi.C_POINTER.withName("ClientIdentifier")
    ).withName("tagRPC_CALL_ATTRIBUTES_V3_A");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt Version$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Version"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int Version
     * }
     */
    public static final OfInt Version$layout() {
        return Version$LAYOUT;
    }

    private static final long Version$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int Version
     * }
     */
    public static final long Version$offset() {
        return Version$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int Version
     * }
     */
    public static int Version(MemorySegment struct) {
        return struct.get(Version$LAYOUT, Version$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int Version
     * }
     */
    public static void Version(MemorySegment struct, int fieldValue) {
        struct.set(Version$LAYOUT, Version$OFFSET, fieldValue);
    }

    private static final OfInt Flags$LAYOUT = (OfInt)$LAYOUT.select(groupElement("Flags"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long Flags
     * }
     */
    public static final OfInt Flags$layout() {
        return Flags$LAYOUT;
    }

    private static final long Flags$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long Flags
     * }
     */
    public static final long Flags$offset() {
        return Flags$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long Flags
     * }
     */
    public static int Flags(MemorySegment struct) {
        return struct.get(Flags$LAYOUT, Flags$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long Flags
     * }
     */
    public static void Flags(MemorySegment struct, int fieldValue) {
        struct.set(Flags$LAYOUT, Flags$OFFSET, fieldValue);
    }

    private static final OfInt ServerPrincipalNameBufferLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ServerPrincipalNameBufferLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long ServerPrincipalNameBufferLength
     * }
     */
    public static final OfInt ServerPrincipalNameBufferLength$layout() {
        return ServerPrincipalNameBufferLength$LAYOUT;
    }

    private static final long ServerPrincipalNameBufferLength$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long ServerPrincipalNameBufferLength
     * }
     */
    public static final long ServerPrincipalNameBufferLength$offset() {
        return ServerPrincipalNameBufferLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long ServerPrincipalNameBufferLength
     * }
     */
    public static int ServerPrincipalNameBufferLength(MemorySegment struct) {
        return struct.get(ServerPrincipalNameBufferLength$LAYOUT, ServerPrincipalNameBufferLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long ServerPrincipalNameBufferLength
     * }
     */
    public static void ServerPrincipalNameBufferLength(MemorySegment struct, int fieldValue) {
        struct.set(ServerPrincipalNameBufferLength$LAYOUT, ServerPrincipalNameBufferLength$OFFSET, fieldValue);
    }

    private static final AddressLayout ServerPrincipalName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("ServerPrincipalName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned char *ServerPrincipalName
     * }
     */
    public static final AddressLayout ServerPrincipalName$layout() {
        return ServerPrincipalName$LAYOUT;
    }

    private static final long ServerPrincipalName$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned char *ServerPrincipalName
     * }
     */
    public static final long ServerPrincipalName$offset() {
        return ServerPrincipalName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned char *ServerPrincipalName
     * }
     */
    public static MemorySegment ServerPrincipalName(MemorySegment struct) {
        return struct.get(ServerPrincipalName$LAYOUT, ServerPrincipalName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned char *ServerPrincipalName
     * }
     */
    public static void ServerPrincipalName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ServerPrincipalName$LAYOUT, ServerPrincipalName$OFFSET, fieldValue);
    }

    private static final OfInt ClientPrincipalNameBufferLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ClientPrincipalNameBufferLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long ClientPrincipalNameBufferLength
     * }
     */
    public static final OfInt ClientPrincipalNameBufferLength$layout() {
        return ClientPrincipalNameBufferLength$LAYOUT;
    }

    private static final long ClientPrincipalNameBufferLength$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long ClientPrincipalNameBufferLength
     * }
     */
    public static final long ClientPrincipalNameBufferLength$offset() {
        return ClientPrincipalNameBufferLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long ClientPrincipalNameBufferLength
     * }
     */
    public static int ClientPrincipalNameBufferLength(MemorySegment struct) {
        return struct.get(ClientPrincipalNameBufferLength$LAYOUT, ClientPrincipalNameBufferLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long ClientPrincipalNameBufferLength
     * }
     */
    public static void ClientPrincipalNameBufferLength(MemorySegment struct, int fieldValue) {
        struct.set(ClientPrincipalNameBufferLength$LAYOUT, ClientPrincipalNameBufferLength$OFFSET, fieldValue);
    }

    private static final AddressLayout ClientPrincipalName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("ClientPrincipalName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned char *ClientPrincipalName
     * }
     */
    public static final AddressLayout ClientPrincipalName$layout() {
        return ClientPrincipalName$LAYOUT;
    }

    private static final long ClientPrincipalName$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned char *ClientPrincipalName
     * }
     */
    public static final long ClientPrincipalName$offset() {
        return ClientPrincipalName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned char *ClientPrincipalName
     * }
     */
    public static MemorySegment ClientPrincipalName(MemorySegment struct) {
        return struct.get(ClientPrincipalName$LAYOUT, ClientPrincipalName$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned char *ClientPrincipalName
     * }
     */
    public static void ClientPrincipalName(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ClientPrincipalName$LAYOUT, ClientPrincipalName$OFFSET, fieldValue);
    }

    private static final OfInt AuthenticationLevel$LAYOUT = (OfInt)$LAYOUT.select(groupElement("AuthenticationLevel"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long AuthenticationLevel
     * }
     */
    public static final OfInt AuthenticationLevel$layout() {
        return AuthenticationLevel$LAYOUT;
    }

    private static final long AuthenticationLevel$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long AuthenticationLevel
     * }
     */
    public static final long AuthenticationLevel$offset() {
        return AuthenticationLevel$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long AuthenticationLevel
     * }
     */
    public static int AuthenticationLevel(MemorySegment struct) {
        return struct.get(AuthenticationLevel$LAYOUT, AuthenticationLevel$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long AuthenticationLevel
     * }
     */
    public static void AuthenticationLevel(MemorySegment struct, int fieldValue) {
        struct.set(AuthenticationLevel$LAYOUT, AuthenticationLevel$OFFSET, fieldValue);
    }

    private static final OfInt AuthenticationService$LAYOUT = (OfInt)$LAYOUT.select(groupElement("AuthenticationService"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long AuthenticationService
     * }
     */
    public static final OfInt AuthenticationService$layout() {
        return AuthenticationService$LAYOUT;
    }

    private static final long AuthenticationService$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long AuthenticationService
     * }
     */
    public static final long AuthenticationService$offset() {
        return AuthenticationService$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long AuthenticationService
     * }
     */
    public static int AuthenticationService(MemorySegment struct) {
        return struct.get(AuthenticationService$LAYOUT, AuthenticationService$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long AuthenticationService
     * }
     */
    public static void AuthenticationService(MemorySegment struct, int fieldValue) {
        struct.set(AuthenticationService$LAYOUT, AuthenticationService$OFFSET, fieldValue);
    }

    private static final OfInt NullSession$LAYOUT = (OfInt)$LAYOUT.select(groupElement("NullSession"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOL NullSession
     * }
     */
    public static final OfInt NullSession$layout() {
        return NullSession$LAYOUT;
    }

    private static final long NullSession$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOL NullSession
     * }
     */
    public static final long NullSession$offset() {
        return NullSession$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOL NullSession
     * }
     */
    public static int NullSession(MemorySegment struct) {
        return struct.get(NullSession$LAYOUT, NullSession$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOL NullSession
     * }
     */
    public static void NullSession(MemorySegment struct, int fieldValue) {
        struct.set(NullSession$LAYOUT, NullSession$OFFSET, fieldValue);
    }

    private static final OfInt KernelModeCaller$LAYOUT = (OfInt)$LAYOUT.select(groupElement("KernelModeCaller"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BOOL KernelModeCaller
     * }
     */
    public static final OfInt KernelModeCaller$layout() {
        return KernelModeCaller$LAYOUT;
    }

    private static final long KernelModeCaller$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BOOL KernelModeCaller
     * }
     */
    public static final long KernelModeCaller$offset() {
        return KernelModeCaller$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BOOL KernelModeCaller
     * }
     */
    public static int KernelModeCaller(MemorySegment struct) {
        return struct.get(KernelModeCaller$LAYOUT, KernelModeCaller$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BOOL KernelModeCaller
     * }
     */
    public static void KernelModeCaller(MemorySegment struct, int fieldValue) {
        struct.set(KernelModeCaller$LAYOUT, KernelModeCaller$OFFSET, fieldValue);
    }

    private static final OfInt ProtocolSequence$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ProtocolSequence"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long ProtocolSequence
     * }
     */
    public static final OfInt ProtocolSequence$layout() {
        return ProtocolSequence$LAYOUT;
    }

    private static final long ProtocolSequence$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long ProtocolSequence
     * }
     */
    public static final long ProtocolSequence$offset() {
        return ProtocolSequence$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long ProtocolSequence
     * }
     */
    public static int ProtocolSequence(MemorySegment struct) {
        return struct.get(ProtocolSequence$LAYOUT, ProtocolSequence$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long ProtocolSequence
     * }
     */
    public static void ProtocolSequence(MemorySegment struct, int fieldValue) {
        struct.set(ProtocolSequence$LAYOUT, ProtocolSequence$OFFSET, fieldValue);
    }

    private static final OfInt IsClientLocal$LAYOUT = (OfInt)$LAYOUT.select(groupElement("IsClientLocal"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long IsClientLocal
     * }
     */
    public static final OfInt IsClientLocal$layout() {
        return IsClientLocal$LAYOUT;
    }

    private static final long IsClientLocal$OFFSET = 60;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long IsClientLocal
     * }
     */
    public static final long IsClientLocal$offset() {
        return IsClientLocal$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long IsClientLocal
     * }
     */
    public static int IsClientLocal(MemorySegment struct) {
        return struct.get(IsClientLocal$LAYOUT, IsClientLocal$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long IsClientLocal
     * }
     */
    public static void IsClientLocal(MemorySegment struct, int fieldValue) {
        struct.set(IsClientLocal$LAYOUT, IsClientLocal$OFFSET, fieldValue);
    }

    private static final AddressLayout ClientPID$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("ClientPID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * HANDLE ClientPID
     * }
     */
    public static final AddressLayout ClientPID$layout() {
        return ClientPID$LAYOUT;
    }

    private static final long ClientPID$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * HANDLE ClientPID
     * }
     */
    public static final long ClientPID$offset() {
        return ClientPID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * HANDLE ClientPID
     * }
     */
    public static MemorySegment ClientPID(MemorySegment struct) {
        return struct.get(ClientPID$LAYOUT, ClientPID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * HANDLE ClientPID
     * }
     */
    public static void ClientPID(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ClientPID$LAYOUT, ClientPID$OFFSET, fieldValue);
    }

    private static final OfInt CallStatus$LAYOUT = (OfInt)$LAYOUT.select(groupElement("CallStatus"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long CallStatus
     * }
     */
    public static final OfInt CallStatus$layout() {
        return CallStatus$LAYOUT;
    }

    private static final long CallStatus$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long CallStatus
     * }
     */
    public static final long CallStatus$offset() {
        return CallStatus$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long CallStatus
     * }
     */
    public static int CallStatus(MemorySegment struct) {
        return struct.get(CallStatus$LAYOUT, CallStatus$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long CallStatus
     * }
     */
    public static void CallStatus(MemorySegment struct, int fieldValue) {
        struct.set(CallStatus$LAYOUT, CallStatus$OFFSET, fieldValue);
    }

    private static final OfInt CallType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("CallType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RpcCallType CallType
     * }
     */
    public static final OfInt CallType$layout() {
        return CallType$LAYOUT;
    }

    private static final long CallType$OFFSET = 76;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RpcCallType CallType
     * }
     */
    public static final long CallType$offset() {
        return CallType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RpcCallType CallType
     * }
     */
    public static int CallType(MemorySegment struct) {
        return struct.get(CallType$LAYOUT, CallType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RpcCallType CallType
     * }
     */
    public static void CallType(MemorySegment struct, int fieldValue) {
        struct.set(CallType$LAYOUT, CallType$OFFSET, fieldValue);
    }

    private static final AddressLayout CallLocalAddress$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("CallLocalAddress"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * RPC_CALL_LOCAL_ADDRESS_V1 *CallLocalAddress
     * }
     */
    public static final AddressLayout CallLocalAddress$layout() {
        return CallLocalAddress$LAYOUT;
    }

    private static final long CallLocalAddress$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * RPC_CALL_LOCAL_ADDRESS_V1 *CallLocalAddress
     * }
     */
    public static final long CallLocalAddress$offset() {
        return CallLocalAddress$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * RPC_CALL_LOCAL_ADDRESS_V1 *CallLocalAddress
     * }
     */
    public static MemorySegment CallLocalAddress(MemorySegment struct) {
        return struct.get(CallLocalAddress$LAYOUT, CallLocalAddress$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * RPC_CALL_LOCAL_ADDRESS_V1 *CallLocalAddress
     * }
     */
    public static void CallLocalAddress(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(CallLocalAddress$LAYOUT, CallLocalAddress$OFFSET, fieldValue);
    }

    private static final OfShort OpNum$LAYOUT = (OfShort)$LAYOUT.select(groupElement("OpNum"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned short OpNum
     * }
     */
    public static final OfShort OpNum$layout() {
        return OpNum$LAYOUT;
    }

    private static final long OpNum$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned short OpNum
     * }
     */
    public static final long OpNum$offset() {
        return OpNum$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned short OpNum
     * }
     */
    public static short OpNum(MemorySegment struct) {
        return struct.get(OpNum$LAYOUT, OpNum$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned short OpNum
     * }
     */
    public static void OpNum(MemorySegment struct, short fieldValue) {
        struct.set(OpNum$LAYOUT, OpNum$OFFSET, fieldValue);
    }

    private static final GroupLayout InterfaceUuid$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("InterfaceUuid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * UUID InterfaceUuid
     * }
     */
    public static final GroupLayout InterfaceUuid$layout() {
        return InterfaceUuid$LAYOUT;
    }

    private static final long InterfaceUuid$OFFSET = 92;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * UUID InterfaceUuid
     * }
     */
    public static final long InterfaceUuid$offset() {
        return InterfaceUuid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * UUID InterfaceUuid
     * }
     */
    public static MemorySegment InterfaceUuid(MemorySegment struct) {
        return struct.asSlice(InterfaceUuid$OFFSET, InterfaceUuid$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * UUID InterfaceUuid
     * }
     */
    public static void InterfaceUuid(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, InterfaceUuid$OFFSET, InterfaceUuid$LAYOUT.byteSize());
    }

    private static final OfInt ClientIdentifierBufferLength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("ClientIdentifierBufferLength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long ClientIdentifierBufferLength
     * }
     */
    public static final OfInt ClientIdentifierBufferLength$layout() {
        return ClientIdentifierBufferLength$LAYOUT;
    }

    private static final long ClientIdentifierBufferLength$OFFSET = 108;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long ClientIdentifierBufferLength
     * }
     */
    public static final long ClientIdentifierBufferLength$offset() {
        return ClientIdentifierBufferLength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long ClientIdentifierBufferLength
     * }
     */
    public static int ClientIdentifierBufferLength(MemorySegment struct) {
        return struct.get(ClientIdentifierBufferLength$LAYOUT, ClientIdentifierBufferLength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long ClientIdentifierBufferLength
     * }
     */
    public static void ClientIdentifierBufferLength(MemorySegment struct, int fieldValue) {
        struct.set(ClientIdentifierBufferLength$LAYOUT, ClientIdentifierBufferLength$OFFSET, fieldValue);
    }

    private static final AddressLayout ClientIdentifier$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("ClientIdentifier"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned char *ClientIdentifier
     * }
     */
    public static final AddressLayout ClientIdentifier$layout() {
        return ClientIdentifier$LAYOUT;
    }

    private static final long ClientIdentifier$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned char *ClientIdentifier
     * }
     */
    public static final long ClientIdentifier$offset() {
        return ClientIdentifier$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned char *ClientIdentifier
     * }
     */
    public static MemorySegment ClientIdentifier(MemorySegment struct) {
        return struct.get(ClientIdentifier$LAYOUT, ClientIdentifier$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned char *ClientIdentifier
     * }
     */
    public static void ClientIdentifier(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(ClientIdentifier$LAYOUT, ClientIdentifier$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction} (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

