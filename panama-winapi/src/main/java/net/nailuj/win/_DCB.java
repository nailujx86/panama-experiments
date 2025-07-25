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
 * struct _DCB {
 *     DWORD DCBlength;
 *     DWORD BaudRate;
 *     DWORD fBinary : 1;
 *     DWORD fParity : 1;
 *     DWORD fOutxCtsFlow : 1;
 *     DWORD fOutxDsrFlow : 1;
 *     DWORD fDtrControl : 2;
 *     DWORD fDsrSensitivity : 1;
 *     DWORD fTXContinueOnXoff : 1;
 *     DWORD fOutX : 1;
 *     DWORD fInX : 1;
 *     DWORD fErrorChar : 1;
 *     DWORD fNull : 1;
 *     DWORD fRtsControl : 2;
 *     DWORD fAbortOnError : 1;
 *     DWORD fDummy2 : 17;
 *     WORD wReserved;
 *     WORD XonLim;
 *     WORD XoffLim;
 *     BYTE ByteSize;
 *     BYTE Parity;
 *     BYTE StopBits;
 *     char XonChar;
 *     char XoffChar;
 *     char ErrorChar;
 *     char EofChar;
 *     char EvtChar;
 *     WORD wReserved1;
 * }
 * }
 */
public class _DCB {

    _DCB() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("DCBlength"),
        winapi.C_LONG.withName("BaudRate"),
        MemoryLayout.paddingLayout(4),
        winapi.C_SHORT.withName("wReserved"),
        winapi.C_SHORT.withName("XonLim"),
        winapi.C_SHORT.withName("XoffLim"),
        winapi.C_CHAR.withName("ByteSize"),
        winapi.C_CHAR.withName("Parity"),
        winapi.C_CHAR.withName("StopBits"),
        winapi.C_CHAR.withName("XonChar"),
        winapi.C_CHAR.withName("XoffChar"),
        winapi.C_CHAR.withName("ErrorChar"),
        winapi.C_CHAR.withName("EofChar"),
        winapi.C_CHAR.withName("EvtChar"),
        winapi.C_SHORT.withName("wReserved1")
    ).withName("_DCB");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt DCBlength$LAYOUT = (OfInt)$LAYOUT.select(groupElement("DCBlength"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD DCBlength
     * }
     */
    public static final OfInt DCBlength$layout() {
        return DCBlength$LAYOUT;
    }

    private static final long DCBlength$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD DCBlength
     * }
     */
    public static final long DCBlength$offset() {
        return DCBlength$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD DCBlength
     * }
     */
    public static int DCBlength(MemorySegment struct) {
        return struct.get(DCBlength$LAYOUT, DCBlength$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD DCBlength
     * }
     */
    public static void DCBlength(MemorySegment struct, int fieldValue) {
        struct.set(DCBlength$LAYOUT, DCBlength$OFFSET, fieldValue);
    }

    private static final OfInt BaudRate$LAYOUT = (OfInt)$LAYOUT.select(groupElement("BaudRate"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD BaudRate
     * }
     */
    public static final OfInt BaudRate$layout() {
        return BaudRate$LAYOUT;
    }

    private static final long BaudRate$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD BaudRate
     * }
     */
    public static final long BaudRate$offset() {
        return BaudRate$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD BaudRate
     * }
     */
    public static int BaudRate(MemorySegment struct) {
        return struct.get(BaudRate$LAYOUT, BaudRate$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD BaudRate
     * }
     */
    public static void BaudRate(MemorySegment struct, int fieldValue) {
        struct.set(BaudRate$LAYOUT, BaudRate$OFFSET, fieldValue);
    }

    private static final OfShort wReserved$LAYOUT = (OfShort)$LAYOUT.select(groupElement("wReserved"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD wReserved
     * }
     */
    public static final OfShort wReserved$layout() {
        return wReserved$LAYOUT;
    }

    private static final long wReserved$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD wReserved
     * }
     */
    public static final long wReserved$offset() {
        return wReserved$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD wReserved
     * }
     */
    public static short wReserved(MemorySegment struct) {
        return struct.get(wReserved$LAYOUT, wReserved$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD wReserved
     * }
     */
    public static void wReserved(MemorySegment struct, short fieldValue) {
        struct.set(wReserved$LAYOUT, wReserved$OFFSET, fieldValue);
    }

    private static final OfShort XonLim$LAYOUT = (OfShort)$LAYOUT.select(groupElement("XonLim"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD XonLim
     * }
     */
    public static final OfShort XonLim$layout() {
        return XonLim$LAYOUT;
    }

    private static final long XonLim$OFFSET = 14;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD XonLim
     * }
     */
    public static final long XonLim$offset() {
        return XonLim$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD XonLim
     * }
     */
    public static short XonLim(MemorySegment struct) {
        return struct.get(XonLim$LAYOUT, XonLim$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD XonLim
     * }
     */
    public static void XonLim(MemorySegment struct, short fieldValue) {
        struct.set(XonLim$LAYOUT, XonLim$OFFSET, fieldValue);
    }

    private static final OfShort XoffLim$LAYOUT = (OfShort)$LAYOUT.select(groupElement("XoffLim"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD XoffLim
     * }
     */
    public static final OfShort XoffLim$layout() {
        return XoffLim$LAYOUT;
    }

    private static final long XoffLim$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD XoffLim
     * }
     */
    public static final long XoffLim$offset() {
        return XoffLim$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD XoffLim
     * }
     */
    public static short XoffLim(MemorySegment struct) {
        return struct.get(XoffLim$LAYOUT, XoffLim$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD XoffLim
     * }
     */
    public static void XoffLim(MemorySegment struct, short fieldValue) {
        struct.set(XoffLim$LAYOUT, XoffLim$OFFSET, fieldValue);
    }

    private static final OfByte ByteSize$LAYOUT = (OfByte)$LAYOUT.select(groupElement("ByteSize"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE ByteSize
     * }
     */
    public static final OfByte ByteSize$layout() {
        return ByteSize$LAYOUT;
    }

    private static final long ByteSize$OFFSET = 18;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE ByteSize
     * }
     */
    public static final long ByteSize$offset() {
        return ByteSize$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE ByteSize
     * }
     */
    public static byte ByteSize(MemorySegment struct) {
        return struct.get(ByteSize$LAYOUT, ByteSize$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE ByteSize
     * }
     */
    public static void ByteSize(MemorySegment struct, byte fieldValue) {
        struct.set(ByteSize$LAYOUT, ByteSize$OFFSET, fieldValue);
    }

    private static final OfByte Parity$LAYOUT = (OfByte)$LAYOUT.select(groupElement("Parity"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE Parity
     * }
     */
    public static final OfByte Parity$layout() {
        return Parity$LAYOUT;
    }

    private static final long Parity$OFFSET = 19;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE Parity
     * }
     */
    public static final long Parity$offset() {
        return Parity$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE Parity
     * }
     */
    public static byte Parity(MemorySegment struct) {
        return struct.get(Parity$LAYOUT, Parity$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE Parity
     * }
     */
    public static void Parity(MemorySegment struct, byte fieldValue) {
        struct.set(Parity$LAYOUT, Parity$OFFSET, fieldValue);
    }

    private static final OfByte StopBits$LAYOUT = (OfByte)$LAYOUT.select(groupElement("StopBits"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE StopBits
     * }
     */
    public static final OfByte StopBits$layout() {
        return StopBits$LAYOUT;
    }

    private static final long StopBits$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE StopBits
     * }
     */
    public static final long StopBits$offset() {
        return StopBits$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE StopBits
     * }
     */
    public static byte StopBits(MemorySegment struct) {
        return struct.get(StopBits$LAYOUT, StopBits$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE StopBits
     * }
     */
    public static void StopBits(MemorySegment struct, byte fieldValue) {
        struct.set(StopBits$LAYOUT, StopBits$OFFSET, fieldValue);
    }

    private static final OfByte XonChar$LAYOUT = (OfByte)$LAYOUT.select(groupElement("XonChar"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char XonChar
     * }
     */
    public static final OfByte XonChar$layout() {
        return XonChar$LAYOUT;
    }

    private static final long XonChar$OFFSET = 21;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char XonChar
     * }
     */
    public static final long XonChar$offset() {
        return XonChar$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char XonChar
     * }
     */
    public static byte XonChar(MemorySegment struct) {
        return struct.get(XonChar$LAYOUT, XonChar$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char XonChar
     * }
     */
    public static void XonChar(MemorySegment struct, byte fieldValue) {
        struct.set(XonChar$LAYOUT, XonChar$OFFSET, fieldValue);
    }

    private static final OfByte XoffChar$LAYOUT = (OfByte)$LAYOUT.select(groupElement("XoffChar"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char XoffChar
     * }
     */
    public static final OfByte XoffChar$layout() {
        return XoffChar$LAYOUT;
    }

    private static final long XoffChar$OFFSET = 22;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char XoffChar
     * }
     */
    public static final long XoffChar$offset() {
        return XoffChar$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char XoffChar
     * }
     */
    public static byte XoffChar(MemorySegment struct) {
        return struct.get(XoffChar$LAYOUT, XoffChar$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char XoffChar
     * }
     */
    public static void XoffChar(MemorySegment struct, byte fieldValue) {
        struct.set(XoffChar$LAYOUT, XoffChar$OFFSET, fieldValue);
    }

    private static final OfByte ErrorChar$LAYOUT = (OfByte)$LAYOUT.select(groupElement("ErrorChar"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char ErrorChar
     * }
     */
    public static final OfByte ErrorChar$layout() {
        return ErrorChar$LAYOUT;
    }

    private static final long ErrorChar$OFFSET = 23;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char ErrorChar
     * }
     */
    public static final long ErrorChar$offset() {
        return ErrorChar$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char ErrorChar
     * }
     */
    public static byte ErrorChar(MemorySegment struct) {
        return struct.get(ErrorChar$LAYOUT, ErrorChar$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char ErrorChar
     * }
     */
    public static void ErrorChar(MemorySegment struct, byte fieldValue) {
        struct.set(ErrorChar$LAYOUT, ErrorChar$OFFSET, fieldValue);
    }

    private static final OfByte EofChar$LAYOUT = (OfByte)$LAYOUT.select(groupElement("EofChar"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char EofChar
     * }
     */
    public static final OfByte EofChar$layout() {
        return EofChar$LAYOUT;
    }

    private static final long EofChar$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char EofChar
     * }
     */
    public static final long EofChar$offset() {
        return EofChar$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char EofChar
     * }
     */
    public static byte EofChar(MemorySegment struct) {
        return struct.get(EofChar$LAYOUT, EofChar$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char EofChar
     * }
     */
    public static void EofChar(MemorySegment struct, byte fieldValue) {
        struct.set(EofChar$LAYOUT, EofChar$OFFSET, fieldValue);
    }

    private static final OfByte EvtChar$LAYOUT = (OfByte)$LAYOUT.select(groupElement("EvtChar"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * char EvtChar
     * }
     */
    public static final OfByte EvtChar$layout() {
        return EvtChar$LAYOUT;
    }

    private static final long EvtChar$OFFSET = 25;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * char EvtChar
     * }
     */
    public static final long EvtChar$offset() {
        return EvtChar$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * char EvtChar
     * }
     */
    public static byte EvtChar(MemorySegment struct) {
        return struct.get(EvtChar$LAYOUT, EvtChar$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * char EvtChar
     * }
     */
    public static void EvtChar(MemorySegment struct, byte fieldValue) {
        struct.set(EvtChar$LAYOUT, EvtChar$OFFSET, fieldValue);
    }

    private static final OfShort wReserved1$LAYOUT = (OfShort)$LAYOUT.select(groupElement("wReserved1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WORD wReserved1
     * }
     */
    public static final OfShort wReserved1$layout() {
        return wReserved1$LAYOUT;
    }

    private static final long wReserved1$OFFSET = 26;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WORD wReserved1
     * }
     */
    public static final long wReserved1$offset() {
        return wReserved1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WORD wReserved1
     * }
     */
    public static short wReserved1(MemorySegment struct) {
        return struct.get(wReserved1$LAYOUT, wReserved1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WORD wReserved1
     * }
     */
    public static void wReserved1(MemorySegment struct, short fieldValue) {
        struct.set(wReserved1$LAYOUT, wReserved1$OFFSET, fieldValue);
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

