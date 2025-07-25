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
 * struct tagMIXERLINEW {
 *     DWORD cbStruct;
 *     DWORD dwDestination;
 *     DWORD dwSource;
 *     DWORD dwLineID;
 *     DWORD fdwLine;
 *     DWORD_PTR dwUser;
 *     DWORD dwComponentType;
 *     DWORD cChannels;
 *     DWORD cConnections;
 *     DWORD cControls;
 *     WCHAR szShortName[16];
 *     WCHAR szName[64];
 *     struct {
 *         DWORD dwType;
 *         DWORD dwDeviceID;
 *         WORD wMid;
 *         WORD wPid;
 *         MMVERSION vDriverVersion;
 *         WCHAR szPname[32];
 *     } Target;
 * }
 * }
 */
public class tagMIXERLINEW {

    tagMIXERLINEW() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.align(winapi.C_LONG, 1).withName("cbStruct"),
        winapi.align(winapi.C_LONG, 1).withName("dwDestination"),
        winapi.align(winapi.C_LONG, 1).withName("dwSource"),
        winapi.align(winapi.C_LONG, 1).withName("dwLineID"),
        winapi.align(winapi.C_LONG, 1).withName("fdwLine"),
        winapi.align(winapi.C_LONG_LONG, 1).withName("dwUser"),
        winapi.align(winapi.C_LONG, 1).withName("dwComponentType"),
        winapi.align(winapi.C_LONG, 1).withName("cChannels"),
        winapi.align(winapi.C_LONG, 1).withName("cConnections"),
        winapi.align(winapi.C_LONG, 1).withName("cControls"),
        MemoryLayout.sequenceLayout(16, winapi.align(winapi.C_SHORT, 1)).withName("szShortName"),
        MemoryLayout.sequenceLayout(64, winapi.align(winapi.C_SHORT, 1)).withName("szName"),
        tagMIXERLINEW.Target.layout().withName("Target")
    ).withName("tagMIXERLINEW");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt cbStruct$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cbStruct"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cbStruct
     * }
     */
    public static final OfInt cbStruct$layout() {
        return cbStruct$LAYOUT;
    }

    private static final long cbStruct$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cbStruct
     * }
     */
    public static final long cbStruct$offset() {
        return cbStruct$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cbStruct
     * }
     */
    public static int cbStruct(MemorySegment struct) {
        return struct.get(cbStruct$LAYOUT, cbStruct$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cbStruct
     * }
     */
    public static void cbStruct(MemorySegment struct, int fieldValue) {
        struct.set(cbStruct$LAYOUT, cbStruct$OFFSET, fieldValue);
    }

    private static final OfInt dwDestination$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwDestination"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwDestination
     * }
     */
    public static final OfInt dwDestination$layout() {
        return dwDestination$LAYOUT;
    }

    private static final long dwDestination$OFFSET = 4;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwDestination
     * }
     */
    public static final long dwDestination$offset() {
        return dwDestination$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwDestination
     * }
     */
    public static int dwDestination(MemorySegment struct) {
        return struct.get(dwDestination$LAYOUT, dwDestination$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwDestination
     * }
     */
    public static void dwDestination(MemorySegment struct, int fieldValue) {
        struct.set(dwDestination$LAYOUT, dwDestination$OFFSET, fieldValue);
    }

    private static final OfInt dwSource$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwSource"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwSource
     * }
     */
    public static final OfInt dwSource$layout() {
        return dwSource$LAYOUT;
    }

    private static final long dwSource$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwSource
     * }
     */
    public static final long dwSource$offset() {
        return dwSource$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwSource
     * }
     */
    public static int dwSource(MemorySegment struct) {
        return struct.get(dwSource$LAYOUT, dwSource$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwSource
     * }
     */
    public static void dwSource(MemorySegment struct, int fieldValue) {
        struct.set(dwSource$LAYOUT, dwSource$OFFSET, fieldValue);
    }

    private static final OfInt dwLineID$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwLineID"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwLineID
     * }
     */
    public static final OfInt dwLineID$layout() {
        return dwLineID$LAYOUT;
    }

    private static final long dwLineID$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwLineID
     * }
     */
    public static final long dwLineID$offset() {
        return dwLineID$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwLineID
     * }
     */
    public static int dwLineID(MemorySegment struct) {
        return struct.get(dwLineID$LAYOUT, dwLineID$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwLineID
     * }
     */
    public static void dwLineID(MemorySegment struct, int fieldValue) {
        struct.set(dwLineID$LAYOUT, dwLineID$OFFSET, fieldValue);
    }

    private static final OfInt fdwLine$LAYOUT = (OfInt)$LAYOUT.select(groupElement("fdwLine"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD fdwLine
     * }
     */
    public static final OfInt fdwLine$layout() {
        return fdwLine$LAYOUT;
    }

    private static final long fdwLine$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD fdwLine
     * }
     */
    public static final long fdwLine$offset() {
        return fdwLine$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD fdwLine
     * }
     */
    public static int fdwLine(MemorySegment struct) {
        return struct.get(fdwLine$LAYOUT, fdwLine$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD fdwLine
     * }
     */
    public static void fdwLine(MemorySegment struct, int fieldValue) {
        struct.set(fdwLine$LAYOUT, fdwLine$OFFSET, fieldValue);
    }

    private static final OfLong dwUser$LAYOUT = (OfLong)$LAYOUT.select(groupElement("dwUser"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD_PTR dwUser
     * }
     */
    public static final OfLong dwUser$layout() {
        return dwUser$LAYOUT;
    }

    private static final long dwUser$OFFSET = 20;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD_PTR dwUser
     * }
     */
    public static final long dwUser$offset() {
        return dwUser$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD_PTR dwUser
     * }
     */
    public static long dwUser(MemorySegment struct) {
        return struct.get(dwUser$LAYOUT, dwUser$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD_PTR dwUser
     * }
     */
    public static void dwUser(MemorySegment struct, long fieldValue) {
        struct.set(dwUser$LAYOUT, dwUser$OFFSET, fieldValue);
    }

    private static final OfInt dwComponentType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwComponentType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD dwComponentType
     * }
     */
    public static final OfInt dwComponentType$layout() {
        return dwComponentType$LAYOUT;
    }

    private static final long dwComponentType$OFFSET = 28;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD dwComponentType
     * }
     */
    public static final long dwComponentType$offset() {
        return dwComponentType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD dwComponentType
     * }
     */
    public static int dwComponentType(MemorySegment struct) {
        return struct.get(dwComponentType$LAYOUT, dwComponentType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD dwComponentType
     * }
     */
    public static void dwComponentType(MemorySegment struct, int fieldValue) {
        struct.set(dwComponentType$LAYOUT, dwComponentType$OFFSET, fieldValue);
    }

    private static final OfInt cChannels$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cChannels"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cChannels
     * }
     */
    public static final OfInt cChannels$layout() {
        return cChannels$LAYOUT;
    }

    private static final long cChannels$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cChannels
     * }
     */
    public static final long cChannels$offset() {
        return cChannels$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cChannels
     * }
     */
    public static int cChannels(MemorySegment struct) {
        return struct.get(cChannels$LAYOUT, cChannels$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cChannels
     * }
     */
    public static void cChannels(MemorySegment struct, int fieldValue) {
        struct.set(cChannels$LAYOUT, cChannels$OFFSET, fieldValue);
    }

    private static final OfInt cConnections$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cConnections"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cConnections
     * }
     */
    public static final OfInt cConnections$layout() {
        return cConnections$LAYOUT;
    }

    private static final long cConnections$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cConnections
     * }
     */
    public static final long cConnections$offset() {
        return cConnections$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cConnections
     * }
     */
    public static int cConnections(MemorySegment struct) {
        return struct.get(cConnections$LAYOUT, cConnections$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cConnections
     * }
     */
    public static void cConnections(MemorySegment struct, int fieldValue) {
        struct.set(cConnections$LAYOUT, cConnections$OFFSET, fieldValue);
    }

    private static final OfInt cControls$LAYOUT = (OfInt)$LAYOUT.select(groupElement("cControls"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD cControls
     * }
     */
    public static final OfInt cControls$layout() {
        return cControls$LAYOUT;
    }

    private static final long cControls$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD cControls
     * }
     */
    public static final long cControls$offset() {
        return cControls$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD cControls
     * }
     */
    public static int cControls(MemorySegment struct) {
        return struct.get(cControls$LAYOUT, cControls$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD cControls
     * }
     */
    public static void cControls(MemorySegment struct, int fieldValue) {
        struct.set(cControls$LAYOUT, cControls$OFFSET, fieldValue);
    }

    private static final SequenceLayout szShortName$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("szShortName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WCHAR szShortName[16]
     * }
     */
    public static final SequenceLayout szShortName$layout() {
        return szShortName$LAYOUT;
    }

    private static final long szShortName$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WCHAR szShortName[16]
     * }
     */
    public static final long szShortName$offset() {
        return szShortName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WCHAR szShortName[16]
     * }
     */
    public static MemorySegment szShortName(MemorySegment struct) {
        return struct.asSlice(szShortName$OFFSET, szShortName$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WCHAR szShortName[16]
     * }
     */
    public static void szShortName(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, szShortName$OFFSET, szShortName$LAYOUT.byteSize());
    }

    private static long[] szShortName$DIMS = { 16 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * WCHAR szShortName[16]
     * }
     */
    public static long[] szShortName$dimensions() {
        return szShortName$DIMS;
    }
    private static final VarHandle szShortName$ELEM_HANDLE = szShortName$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * WCHAR szShortName[16]
     * }
     */
    public static short szShortName(MemorySegment struct, long index0) {
        return (short)szShortName$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * WCHAR szShortName[16]
     * }
     */
    public static void szShortName(MemorySegment struct, long index0, short fieldValue) {
        szShortName$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    private static final SequenceLayout szName$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("szName"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * WCHAR szName[64]
     * }
     */
    public static final SequenceLayout szName$layout() {
        return szName$LAYOUT;
    }

    private static final long szName$OFFSET = 76;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * WCHAR szName[64]
     * }
     */
    public static final long szName$offset() {
        return szName$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * WCHAR szName[64]
     * }
     */
    public static MemorySegment szName(MemorySegment struct) {
        return struct.asSlice(szName$OFFSET, szName$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * WCHAR szName[64]
     * }
     */
    public static void szName(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, szName$OFFSET, szName$LAYOUT.byteSize());
    }

    private static long[] szName$DIMS = { 64 };

    /**
     * Dimensions for array field:
     * {@snippet lang=c :
     * WCHAR szName[64]
     * }
     */
    public static long[] szName$dimensions() {
        return szName$DIMS;
    }
    private static final VarHandle szName$ELEM_HANDLE = szName$LAYOUT.varHandle(sequenceElement());

    /**
     * Indexed getter for field:
     * {@snippet lang=c :
     * WCHAR szName[64]
     * }
     */
    public static short szName(MemorySegment struct, long index0) {
        return (short)szName$ELEM_HANDLE.get(struct, 0L, index0);
    }

    /**
     * Indexed setter for field:
     * {@snippet lang=c :
     * WCHAR szName[64]
     * }
     */
    public static void szName(MemorySegment struct, long index0, short fieldValue) {
        szName$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * struct {
     *     DWORD dwType;
     *     DWORD dwDeviceID;
     *     WORD wMid;
     *     WORD wPid;
     *     MMVERSION vDriverVersion;
     *     WCHAR szPname[32];
     * }
     * }
     */
    public static class Target {

        Target() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
            winapi.align(winapi.C_LONG, 1).withName("dwType"),
            winapi.align(winapi.C_LONG, 1).withName("dwDeviceID"),
            winapi.align(winapi.C_SHORT, 1).withName("wMid"),
            winapi.align(winapi.C_SHORT, 1).withName("wPid"),
            winapi.align(winapi.C_INT, 1).withName("vDriverVersion"),
            MemoryLayout.sequenceLayout(32, winapi.align(winapi.C_SHORT, 1)).withName("szPname")
        ).withName("$anon$1907:5");

        /**
         * The layout of this struct
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final OfInt dwType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwType"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * DWORD dwType
         * }
         */
        public static final OfInt dwType$layout() {
            return dwType$LAYOUT;
        }

        private static final long dwType$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * DWORD dwType
         * }
         */
        public static final long dwType$offset() {
            return dwType$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * DWORD dwType
         * }
         */
        public static int dwType(MemorySegment struct) {
            return struct.get(dwType$LAYOUT, dwType$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * DWORD dwType
         * }
         */
        public static void dwType(MemorySegment struct, int fieldValue) {
            struct.set(dwType$LAYOUT, dwType$OFFSET, fieldValue);
        }

        private static final OfInt dwDeviceID$LAYOUT = (OfInt)$LAYOUT.select(groupElement("dwDeviceID"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * DWORD dwDeviceID
         * }
         */
        public static final OfInt dwDeviceID$layout() {
            return dwDeviceID$LAYOUT;
        }

        private static final long dwDeviceID$OFFSET = 4;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * DWORD dwDeviceID
         * }
         */
        public static final long dwDeviceID$offset() {
            return dwDeviceID$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * DWORD dwDeviceID
         * }
         */
        public static int dwDeviceID(MemorySegment struct) {
            return struct.get(dwDeviceID$LAYOUT, dwDeviceID$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * DWORD dwDeviceID
         * }
         */
        public static void dwDeviceID(MemorySegment struct, int fieldValue) {
            struct.set(dwDeviceID$LAYOUT, dwDeviceID$OFFSET, fieldValue);
        }

        private static final OfShort wMid$LAYOUT = (OfShort)$LAYOUT.select(groupElement("wMid"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * WORD wMid
         * }
         */
        public static final OfShort wMid$layout() {
            return wMid$LAYOUT;
        }

        private static final long wMid$OFFSET = 8;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * WORD wMid
         * }
         */
        public static final long wMid$offset() {
            return wMid$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * WORD wMid
         * }
         */
        public static short wMid(MemorySegment struct) {
            return struct.get(wMid$LAYOUT, wMid$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * WORD wMid
         * }
         */
        public static void wMid(MemorySegment struct, short fieldValue) {
            struct.set(wMid$LAYOUT, wMid$OFFSET, fieldValue);
        }

        private static final OfShort wPid$LAYOUT = (OfShort)$LAYOUT.select(groupElement("wPid"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * WORD wPid
         * }
         */
        public static final OfShort wPid$layout() {
            return wPid$LAYOUT;
        }

        private static final long wPid$OFFSET = 10;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * WORD wPid
         * }
         */
        public static final long wPid$offset() {
            return wPid$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * WORD wPid
         * }
         */
        public static short wPid(MemorySegment struct) {
            return struct.get(wPid$LAYOUT, wPid$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * WORD wPid
         * }
         */
        public static void wPid(MemorySegment struct, short fieldValue) {
            struct.set(wPid$LAYOUT, wPid$OFFSET, fieldValue);
        }

        private static final OfInt vDriverVersion$LAYOUT = (OfInt)$LAYOUT.select(groupElement("vDriverVersion"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * MMVERSION vDriverVersion
         * }
         */
        public static final OfInt vDriverVersion$layout() {
            return vDriverVersion$LAYOUT;
        }

        private static final long vDriverVersion$OFFSET = 12;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * MMVERSION vDriverVersion
         * }
         */
        public static final long vDriverVersion$offset() {
            return vDriverVersion$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * MMVERSION vDriverVersion
         * }
         */
        public static int vDriverVersion(MemorySegment struct) {
            return struct.get(vDriverVersion$LAYOUT, vDriverVersion$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * MMVERSION vDriverVersion
         * }
         */
        public static void vDriverVersion(MemorySegment struct, int fieldValue) {
            struct.set(vDriverVersion$LAYOUT, vDriverVersion$OFFSET, fieldValue);
        }

        private static final SequenceLayout szPname$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("szPname"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * WCHAR szPname[32]
         * }
         */
        public static final SequenceLayout szPname$layout() {
            return szPname$LAYOUT;
        }

        private static final long szPname$OFFSET = 16;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * WCHAR szPname[32]
         * }
         */
        public static final long szPname$offset() {
            return szPname$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * WCHAR szPname[32]
         * }
         */
        public static MemorySegment szPname(MemorySegment struct) {
            return struct.asSlice(szPname$OFFSET, szPname$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * WCHAR szPname[32]
         * }
         */
        public static void szPname(MemorySegment struct, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, struct, szPname$OFFSET, szPname$LAYOUT.byteSize());
        }

        private static long[] szPname$DIMS = { 32 };

        /**
         * Dimensions for array field:
         * {@snippet lang=c :
         * WCHAR szPname[32]
         * }
         */
        public static long[] szPname$dimensions() {
            return szPname$DIMS;
        }
        private static final VarHandle szPname$ELEM_HANDLE = szPname$LAYOUT.varHandle(sequenceElement());

        /**
         * Indexed getter for field:
         * {@snippet lang=c :
         * WCHAR szPname[32]
         * }
         */
        public static short szPname(MemorySegment struct, long index0) {
            return (short)szPname$ELEM_HANDLE.get(struct, 0L, index0);
        }

        /**
         * Indexed setter for field:
         * {@snippet lang=c :
         * WCHAR szPname[32]
         * }
         */
        public static void szPname(MemorySegment struct, long index0, short fieldValue) {
            szPname$ELEM_HANDLE.set(struct, 0L, index0, fieldValue);
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

    private static final GroupLayout Target$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("Target"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct {
     *     DWORD dwType;
     *     DWORD dwDeviceID;
     *     WORD wMid;
     *     WORD wPid;
     *     MMVERSION vDriverVersion;
     *     WCHAR szPname[32];
     * } Target
     * }
     */
    public static final GroupLayout Target$layout() {
        return Target$LAYOUT;
    }

    private static final long Target$OFFSET = 204;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct {
     *     DWORD dwType;
     *     DWORD dwDeviceID;
     *     WORD wMid;
     *     WORD wPid;
     *     MMVERSION vDriverVersion;
     *     WCHAR szPname[32];
     * } Target
     * }
     */
    public static final long Target$offset() {
        return Target$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct {
     *     DWORD dwType;
     *     DWORD dwDeviceID;
     *     WORD wMid;
     *     WORD wPid;
     *     MMVERSION vDriverVersion;
     *     WCHAR szPname[32];
     * } Target
     * }
     */
    public static MemorySegment Target(MemorySegment struct) {
        return struct.asSlice(Target$OFFSET, Target$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct {
     *     DWORD dwType;
     *     DWORD dwDeviceID;
     *     WORD wMid;
     *     WORD wPid;
     *     MMVERSION vDriverVersion;
     *     WCHAR szPname[32];
     * } Target
     * }
     */
    public static void Target(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, Target$OFFSET, Target$LAYOUT.byteSize());
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

