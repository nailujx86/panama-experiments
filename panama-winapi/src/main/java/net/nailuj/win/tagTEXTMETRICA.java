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
 * struct tagTEXTMETRICA {
 *     LONG tmHeight;
 *     LONG tmAscent;
 *     LONG tmDescent;
 *     LONG tmInternalLeading;
 *     LONG tmExternalLeading;
 *     LONG tmAveCharWidth;
 *     LONG tmMaxCharWidth;
 *     LONG tmWeight;
 *     LONG tmOverhang;
 *     LONG tmDigitizedAspectX;
 *     LONG tmDigitizedAspectY;
 *     BYTE tmFirstChar;
 *     BYTE tmLastChar;
 *     BYTE tmDefaultChar;
 *     BYTE tmBreakChar;
 *     BYTE tmItalic;
 *     BYTE tmUnderlined;
 *     BYTE tmStruckOut;
 *     BYTE tmPitchAndFamily;
 *     BYTE tmCharSet;
 * }
 * }
 */
public class tagTEXTMETRICA {

    tagTEXTMETRICA() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("tmHeight"),
        winapi.C_LONG.withName("tmAscent"),
        winapi.C_LONG.withName("tmDescent"),
        winapi.C_LONG.withName("tmInternalLeading"),
        winapi.C_LONG.withName("tmExternalLeading"),
        winapi.C_LONG.withName("tmAveCharWidth"),
        winapi.C_LONG.withName("tmMaxCharWidth"),
        winapi.C_LONG.withName("tmWeight"),
        winapi.C_LONG.withName("tmOverhang"),
        winapi.C_LONG.withName("tmDigitizedAspectX"),
        winapi.C_LONG.withName("tmDigitizedAspectY"),
        winapi.C_CHAR.withName("tmFirstChar"),
        winapi.C_CHAR.withName("tmLastChar"),
        winapi.C_CHAR.withName("tmDefaultChar"),
        winapi.C_CHAR.withName("tmBreakChar"),
        winapi.C_CHAR.withName("tmItalic"),
        winapi.C_CHAR.withName("tmUnderlined"),
        winapi.C_CHAR.withName("tmStruckOut"),
        winapi.C_CHAR.withName("tmPitchAndFamily"),
        winapi.C_CHAR.withName("tmCharSet"),
        MemoryLayout.paddingLayout(3)
    ).withName("tagTEXTMETRICA");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt tmHeight$LAYOUT = (OfInt)$LAYOUT.select(groupElement("tmHeight"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG tmHeight
     * }
     */
    public static final OfInt tmHeight$layout() {
        return tmHeight$LAYOUT;
    }

    private static final long tmHeight$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG tmHeight
     * }
     */
    public static final long tmHeight$offset() {
        return tmHeight$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG tmHeight
     * }
     */
    public static int tmHeight(MemorySegment struct) {
        return struct.get(tmHeight$LAYOUT, tmHeight$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG tmHeight
     * }
     */
    public static void tmHeight(MemorySegment struct, int fieldValue) {
        struct.set(tmHeight$LAYOUT, tmHeight$OFFSET, fieldValue);
    }

    private static final OfInt tmAscent$LAYOUT = (OfInt)$LAYOUT.select(groupElement("tmAscent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG tmAscent
     * }
     */
    public static final OfInt tmAscent$layout() {
        return tmAscent$LAYOUT;
    }

    private static final long tmAscent$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG tmAscent
     * }
     */
    public static final long tmAscent$offset() {
        return tmAscent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG tmAscent
     * }
     */
    public static int tmAscent(MemorySegment struct) {
        return struct.get(tmAscent$LAYOUT, tmAscent$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG tmAscent
     * }
     */
    public static void tmAscent(MemorySegment struct, int fieldValue) {
        struct.set(tmAscent$LAYOUT, tmAscent$OFFSET, fieldValue);
    }

    private static final OfInt tmDescent$LAYOUT = (OfInt)$LAYOUT.select(groupElement("tmDescent"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG tmDescent
     * }
     */
    public static final OfInt tmDescent$layout() {
        return tmDescent$LAYOUT;
    }

    private static final long tmDescent$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG tmDescent
     * }
     */
    public static final long tmDescent$offset() {
        return tmDescent$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG tmDescent
     * }
     */
    public static int tmDescent(MemorySegment struct) {
        return struct.get(tmDescent$LAYOUT, tmDescent$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG tmDescent
     * }
     */
    public static void tmDescent(MemorySegment struct, int fieldValue) {
        struct.set(tmDescent$LAYOUT, tmDescent$OFFSET, fieldValue);
    }

    private static final OfInt tmInternalLeading$LAYOUT = (OfInt)$LAYOUT.select(groupElement("tmInternalLeading"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG tmInternalLeading
     * }
     */
    public static final OfInt tmInternalLeading$layout() {
        return tmInternalLeading$LAYOUT;
    }

    private static final long tmInternalLeading$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG tmInternalLeading
     * }
     */
    public static final long tmInternalLeading$offset() {
        return tmInternalLeading$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG tmInternalLeading
     * }
     */
    public static int tmInternalLeading(MemorySegment struct) {
        return struct.get(tmInternalLeading$LAYOUT, tmInternalLeading$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG tmInternalLeading
     * }
     */
    public static void tmInternalLeading(MemorySegment struct, int fieldValue) {
        struct.set(tmInternalLeading$LAYOUT, tmInternalLeading$OFFSET, fieldValue);
    }

    private static final OfInt tmExternalLeading$LAYOUT = (OfInt)$LAYOUT.select(groupElement("tmExternalLeading"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG tmExternalLeading
     * }
     */
    public static final OfInt tmExternalLeading$layout() {
        return tmExternalLeading$LAYOUT;
    }

    private static final long tmExternalLeading$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG tmExternalLeading
     * }
     */
    public static final long tmExternalLeading$offset() {
        return tmExternalLeading$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG tmExternalLeading
     * }
     */
    public static int tmExternalLeading(MemorySegment struct) {
        return struct.get(tmExternalLeading$LAYOUT, tmExternalLeading$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG tmExternalLeading
     * }
     */
    public static void tmExternalLeading(MemorySegment struct, int fieldValue) {
        struct.set(tmExternalLeading$LAYOUT, tmExternalLeading$OFFSET, fieldValue);
    }

    private static final OfInt tmAveCharWidth$LAYOUT = (OfInt)$LAYOUT.select(groupElement("tmAveCharWidth"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG tmAveCharWidth
     * }
     */
    public static final OfInt tmAveCharWidth$layout() {
        return tmAveCharWidth$LAYOUT;
    }

    private static final long tmAveCharWidth$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG tmAveCharWidth
     * }
     */
    public static final long tmAveCharWidth$offset() {
        return tmAveCharWidth$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG tmAveCharWidth
     * }
     */
    public static int tmAveCharWidth(MemorySegment struct) {
        return struct.get(tmAveCharWidth$LAYOUT, tmAveCharWidth$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG tmAveCharWidth
     * }
     */
    public static void tmAveCharWidth(MemorySegment struct, int fieldValue) {
        struct.set(tmAveCharWidth$LAYOUT, tmAveCharWidth$OFFSET, fieldValue);
    }

    private static final OfInt tmMaxCharWidth$LAYOUT = (OfInt)$LAYOUT.select(groupElement("tmMaxCharWidth"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG tmMaxCharWidth
     * }
     */
    public static final OfInt tmMaxCharWidth$layout() {
        return tmMaxCharWidth$LAYOUT;
    }

    private static final long tmMaxCharWidth$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG tmMaxCharWidth
     * }
     */
    public static final long tmMaxCharWidth$offset() {
        return tmMaxCharWidth$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG tmMaxCharWidth
     * }
     */
    public static int tmMaxCharWidth(MemorySegment struct) {
        return struct.get(tmMaxCharWidth$LAYOUT, tmMaxCharWidth$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG tmMaxCharWidth
     * }
     */
    public static void tmMaxCharWidth(MemorySegment struct, int fieldValue) {
        struct.set(tmMaxCharWidth$LAYOUT, tmMaxCharWidth$OFFSET, fieldValue);
    }

    private static final OfInt tmWeight$LAYOUT = (OfInt)$LAYOUT.select(groupElement("tmWeight"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG tmWeight
     * }
     */
    public static final OfInt tmWeight$layout() {
        return tmWeight$LAYOUT;
    }

    private static final long tmWeight$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG tmWeight
     * }
     */
    public static final long tmWeight$offset() {
        return tmWeight$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG tmWeight
     * }
     */
    public static int tmWeight(MemorySegment struct) {
        return struct.get(tmWeight$LAYOUT, tmWeight$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG tmWeight
     * }
     */
    public static void tmWeight(MemorySegment struct, int fieldValue) {
        struct.set(tmWeight$LAYOUT, tmWeight$OFFSET, fieldValue);
    }

    private static final OfInt tmOverhang$LAYOUT = (OfInt)$LAYOUT.select(groupElement("tmOverhang"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG tmOverhang
     * }
     */
    public static final OfInt tmOverhang$layout() {
        return tmOverhang$LAYOUT;
    }

    private static final long tmOverhang$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG tmOverhang
     * }
     */
    public static final long tmOverhang$offset() {
        return tmOverhang$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG tmOverhang
     * }
     */
    public static int tmOverhang(MemorySegment struct) {
        return struct.get(tmOverhang$LAYOUT, tmOverhang$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG tmOverhang
     * }
     */
    public static void tmOverhang(MemorySegment struct, int fieldValue) {
        struct.set(tmOverhang$LAYOUT, tmOverhang$OFFSET, fieldValue);
    }

    private static final OfInt tmDigitizedAspectX$LAYOUT = (OfInt)$LAYOUT.select(groupElement("tmDigitizedAspectX"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG tmDigitizedAspectX
     * }
     */
    public static final OfInt tmDigitizedAspectX$layout() {
        return tmDigitizedAspectX$LAYOUT;
    }

    private static final long tmDigitizedAspectX$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG tmDigitizedAspectX
     * }
     */
    public static final long tmDigitizedAspectX$offset() {
        return tmDigitizedAspectX$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG tmDigitizedAspectX
     * }
     */
    public static int tmDigitizedAspectX(MemorySegment struct) {
        return struct.get(tmDigitizedAspectX$LAYOUT, tmDigitizedAspectX$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG tmDigitizedAspectX
     * }
     */
    public static void tmDigitizedAspectX(MemorySegment struct, int fieldValue) {
        struct.set(tmDigitizedAspectX$LAYOUT, tmDigitizedAspectX$OFFSET, fieldValue);
    }

    private static final OfInt tmDigitizedAspectY$LAYOUT = (OfInt)$LAYOUT.select(groupElement("tmDigitizedAspectY"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * LONG tmDigitizedAspectY
     * }
     */
    public static final OfInt tmDigitizedAspectY$layout() {
        return tmDigitizedAspectY$LAYOUT;
    }

    private static final long tmDigitizedAspectY$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * LONG tmDigitizedAspectY
     * }
     */
    public static final long tmDigitizedAspectY$offset() {
        return tmDigitizedAspectY$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * LONG tmDigitizedAspectY
     * }
     */
    public static int tmDigitizedAspectY(MemorySegment struct) {
        return struct.get(tmDigitizedAspectY$LAYOUT, tmDigitizedAspectY$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * LONG tmDigitizedAspectY
     * }
     */
    public static void tmDigitizedAspectY(MemorySegment struct, int fieldValue) {
        struct.set(tmDigitizedAspectY$LAYOUT, tmDigitizedAspectY$OFFSET, fieldValue);
    }

    private static final OfByte tmFirstChar$LAYOUT = (OfByte)$LAYOUT.select(groupElement("tmFirstChar"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE tmFirstChar
     * }
     */
    public static final OfByte tmFirstChar$layout() {
        return tmFirstChar$LAYOUT;
    }

    private static final long tmFirstChar$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE tmFirstChar
     * }
     */
    public static final long tmFirstChar$offset() {
        return tmFirstChar$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE tmFirstChar
     * }
     */
    public static byte tmFirstChar(MemorySegment struct) {
        return struct.get(tmFirstChar$LAYOUT, tmFirstChar$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE tmFirstChar
     * }
     */
    public static void tmFirstChar(MemorySegment struct, byte fieldValue) {
        struct.set(tmFirstChar$LAYOUT, tmFirstChar$OFFSET, fieldValue);
    }

    private static final OfByte tmLastChar$LAYOUT = (OfByte)$LAYOUT.select(groupElement("tmLastChar"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE tmLastChar
     * }
     */
    public static final OfByte tmLastChar$layout() {
        return tmLastChar$LAYOUT;
    }

    private static final long tmLastChar$OFFSET = 45;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE tmLastChar
     * }
     */
    public static final long tmLastChar$offset() {
        return tmLastChar$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE tmLastChar
     * }
     */
    public static byte tmLastChar(MemorySegment struct) {
        return struct.get(tmLastChar$LAYOUT, tmLastChar$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE tmLastChar
     * }
     */
    public static void tmLastChar(MemorySegment struct, byte fieldValue) {
        struct.set(tmLastChar$LAYOUT, tmLastChar$OFFSET, fieldValue);
    }

    private static final OfByte tmDefaultChar$LAYOUT = (OfByte)$LAYOUT.select(groupElement("tmDefaultChar"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE tmDefaultChar
     * }
     */
    public static final OfByte tmDefaultChar$layout() {
        return tmDefaultChar$LAYOUT;
    }

    private static final long tmDefaultChar$OFFSET = 46;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE tmDefaultChar
     * }
     */
    public static final long tmDefaultChar$offset() {
        return tmDefaultChar$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE tmDefaultChar
     * }
     */
    public static byte tmDefaultChar(MemorySegment struct) {
        return struct.get(tmDefaultChar$LAYOUT, tmDefaultChar$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE tmDefaultChar
     * }
     */
    public static void tmDefaultChar(MemorySegment struct, byte fieldValue) {
        struct.set(tmDefaultChar$LAYOUT, tmDefaultChar$OFFSET, fieldValue);
    }

    private static final OfByte tmBreakChar$LAYOUT = (OfByte)$LAYOUT.select(groupElement("tmBreakChar"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE tmBreakChar
     * }
     */
    public static final OfByte tmBreakChar$layout() {
        return tmBreakChar$LAYOUT;
    }

    private static final long tmBreakChar$OFFSET = 47;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE tmBreakChar
     * }
     */
    public static final long tmBreakChar$offset() {
        return tmBreakChar$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE tmBreakChar
     * }
     */
    public static byte tmBreakChar(MemorySegment struct) {
        return struct.get(tmBreakChar$LAYOUT, tmBreakChar$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE tmBreakChar
     * }
     */
    public static void tmBreakChar(MemorySegment struct, byte fieldValue) {
        struct.set(tmBreakChar$LAYOUT, tmBreakChar$OFFSET, fieldValue);
    }

    private static final OfByte tmItalic$LAYOUT = (OfByte)$LAYOUT.select(groupElement("tmItalic"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE tmItalic
     * }
     */
    public static final OfByte tmItalic$layout() {
        return tmItalic$LAYOUT;
    }

    private static final long tmItalic$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE tmItalic
     * }
     */
    public static final long tmItalic$offset() {
        return tmItalic$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE tmItalic
     * }
     */
    public static byte tmItalic(MemorySegment struct) {
        return struct.get(tmItalic$LAYOUT, tmItalic$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE tmItalic
     * }
     */
    public static void tmItalic(MemorySegment struct, byte fieldValue) {
        struct.set(tmItalic$LAYOUT, tmItalic$OFFSET, fieldValue);
    }

    private static final OfByte tmUnderlined$LAYOUT = (OfByte)$LAYOUT.select(groupElement("tmUnderlined"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE tmUnderlined
     * }
     */
    public static final OfByte tmUnderlined$layout() {
        return tmUnderlined$LAYOUT;
    }

    private static final long tmUnderlined$OFFSET = 49;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE tmUnderlined
     * }
     */
    public static final long tmUnderlined$offset() {
        return tmUnderlined$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE tmUnderlined
     * }
     */
    public static byte tmUnderlined(MemorySegment struct) {
        return struct.get(tmUnderlined$LAYOUT, tmUnderlined$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE tmUnderlined
     * }
     */
    public static void tmUnderlined(MemorySegment struct, byte fieldValue) {
        struct.set(tmUnderlined$LAYOUT, tmUnderlined$OFFSET, fieldValue);
    }

    private static final OfByte tmStruckOut$LAYOUT = (OfByte)$LAYOUT.select(groupElement("tmStruckOut"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE tmStruckOut
     * }
     */
    public static final OfByte tmStruckOut$layout() {
        return tmStruckOut$LAYOUT;
    }

    private static final long tmStruckOut$OFFSET = 50;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE tmStruckOut
     * }
     */
    public static final long tmStruckOut$offset() {
        return tmStruckOut$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE tmStruckOut
     * }
     */
    public static byte tmStruckOut(MemorySegment struct) {
        return struct.get(tmStruckOut$LAYOUT, tmStruckOut$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE tmStruckOut
     * }
     */
    public static void tmStruckOut(MemorySegment struct, byte fieldValue) {
        struct.set(tmStruckOut$LAYOUT, tmStruckOut$OFFSET, fieldValue);
    }

    private static final OfByte tmPitchAndFamily$LAYOUT = (OfByte)$LAYOUT.select(groupElement("tmPitchAndFamily"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE tmPitchAndFamily
     * }
     */
    public static final OfByte tmPitchAndFamily$layout() {
        return tmPitchAndFamily$LAYOUT;
    }

    private static final long tmPitchAndFamily$OFFSET = 51;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE tmPitchAndFamily
     * }
     */
    public static final long tmPitchAndFamily$offset() {
        return tmPitchAndFamily$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE tmPitchAndFamily
     * }
     */
    public static byte tmPitchAndFamily(MemorySegment struct) {
        return struct.get(tmPitchAndFamily$LAYOUT, tmPitchAndFamily$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE tmPitchAndFamily
     * }
     */
    public static void tmPitchAndFamily(MemorySegment struct, byte fieldValue) {
        struct.set(tmPitchAndFamily$LAYOUT, tmPitchAndFamily$OFFSET, fieldValue);
    }

    private static final OfByte tmCharSet$LAYOUT = (OfByte)$LAYOUT.select(groupElement("tmCharSet"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * BYTE tmCharSet
     * }
     */
    public static final OfByte tmCharSet$layout() {
        return tmCharSet$LAYOUT;
    }

    private static final long tmCharSet$OFFSET = 52;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * BYTE tmCharSet
     * }
     */
    public static final long tmCharSet$offset() {
        return tmCharSet$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * BYTE tmCharSet
     * }
     */
    public static byte tmCharSet(MemorySegment struct) {
        return struct.get(tmCharSet$LAYOUT, tmCharSet$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * BYTE tmCharSet
     * }
     */
    public static void tmCharSet(MemorySegment struct, byte fieldValue) {
        struct.set(tmCharSet$LAYOUT, tmCharSet$OFFSET, fieldValue);
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

