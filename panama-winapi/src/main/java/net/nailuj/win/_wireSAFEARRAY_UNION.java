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
 * struct _wireSAFEARRAY_UNION {
 *     ULONG sfType;
 *     union __MIDL_IOleAutomationTypes_0001 {
 *         SAFEARR_BSTR BstrStr;
 *         SAFEARR_UNKNOWN UnknownStr;
 *         SAFEARR_DISPATCH DispatchStr;
 *         SAFEARR_VARIANT VariantStr;
 *         SAFEARR_BRECORD RecordStr;
 *         SAFEARR_HAVEIID HaveIidStr;
 *         BYTE_SIZEDARR ByteStr;
 *         WORD_SIZEDARR WordStr;
 *         DWORD_SIZEDARR LongStr;
 *         HYPER_SIZEDARR HyperStr;
 *     } u;
 * }
 * }
 */
public class _wireSAFEARRAY_UNION {

    _wireSAFEARRAY_UNION() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("sfType"),
        MemoryLayout.paddingLayout(4),
        _wireSAFEARRAY_UNION.__MIDL_IOleAutomationTypes_0001.layout().withName("u")
    ).withName("_wireSAFEARRAY_UNION");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt sfType$LAYOUT = (OfInt)$LAYOUT.select(groupElement("sfType"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * ULONG sfType
     * }
     */
    public static final OfInt sfType$layout() {
        return sfType$LAYOUT;
    }

    private static final long sfType$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * ULONG sfType
     * }
     */
    public static final long sfType$offset() {
        return sfType$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * ULONG sfType
     * }
     */
    public static int sfType(MemorySegment struct) {
        return struct.get(sfType$LAYOUT, sfType$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * ULONG sfType
     * }
     */
    public static void sfType(MemorySegment struct, int fieldValue) {
        struct.set(sfType$LAYOUT, sfType$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * union __MIDL_IOleAutomationTypes_0001 {
     *     SAFEARR_BSTR BstrStr;
     *     SAFEARR_UNKNOWN UnknownStr;
     *     SAFEARR_DISPATCH DispatchStr;
     *     SAFEARR_VARIANT VariantStr;
     *     SAFEARR_BRECORD RecordStr;
     *     SAFEARR_HAVEIID HaveIidStr;
     *     BYTE_SIZEDARR ByteStr;
     *     WORD_SIZEDARR WordStr;
     *     DWORD_SIZEDARR LongStr;
     *     HYPER_SIZEDARR HyperStr;
     * }
     * }
     */
    public static class __MIDL_IOleAutomationTypes_0001 {

        __MIDL_IOleAutomationTypes_0001() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
            _wireSAFEARR_BSTR.layout().withName("BstrStr"),
            _wireSAFEARR_UNKNOWN.layout().withName("UnknownStr"),
            _wireSAFEARR_DISPATCH.layout().withName("DispatchStr"),
            _wireSAFEARR_VARIANT.layout().withName("VariantStr"),
            _wireSAFEARR_BRECORD.layout().withName("RecordStr"),
            _wireSAFEARR_HAVEIID.layout().withName("HaveIidStr"),
            _BYTE_SIZEDARR.layout().withName("ByteStr"),
            _SHORT_SIZEDARR.layout().withName("WordStr"),
            _LONG_SIZEDARR.layout().withName("LongStr"),
            _HYPER_SIZEDARR.layout().withName("HyperStr")
        ).withName("__MIDL_IOleAutomationTypes_0001");

        /**
         * The layout of this union
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final GroupLayout BstrStr$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("BstrStr"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * SAFEARR_BSTR BstrStr
         * }
         */
        public static final GroupLayout BstrStr$layout() {
            return BstrStr$LAYOUT;
        }

        private static final long BstrStr$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * SAFEARR_BSTR BstrStr
         * }
         */
        public static final long BstrStr$offset() {
            return BstrStr$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * SAFEARR_BSTR BstrStr
         * }
         */
        public static MemorySegment BstrStr(MemorySegment union) {
            return union.asSlice(BstrStr$OFFSET, BstrStr$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * SAFEARR_BSTR BstrStr
         * }
         */
        public static void BstrStr(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, BstrStr$OFFSET, BstrStr$LAYOUT.byteSize());
        }

        private static final GroupLayout UnknownStr$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("UnknownStr"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * SAFEARR_UNKNOWN UnknownStr
         * }
         */
        public static final GroupLayout UnknownStr$layout() {
            return UnknownStr$LAYOUT;
        }

        private static final long UnknownStr$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * SAFEARR_UNKNOWN UnknownStr
         * }
         */
        public static final long UnknownStr$offset() {
            return UnknownStr$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * SAFEARR_UNKNOWN UnknownStr
         * }
         */
        public static MemorySegment UnknownStr(MemorySegment union) {
            return union.asSlice(UnknownStr$OFFSET, UnknownStr$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * SAFEARR_UNKNOWN UnknownStr
         * }
         */
        public static void UnknownStr(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, UnknownStr$OFFSET, UnknownStr$LAYOUT.byteSize());
        }

        private static final GroupLayout DispatchStr$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("DispatchStr"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * SAFEARR_DISPATCH DispatchStr
         * }
         */
        public static final GroupLayout DispatchStr$layout() {
            return DispatchStr$LAYOUT;
        }

        private static final long DispatchStr$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * SAFEARR_DISPATCH DispatchStr
         * }
         */
        public static final long DispatchStr$offset() {
            return DispatchStr$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * SAFEARR_DISPATCH DispatchStr
         * }
         */
        public static MemorySegment DispatchStr(MemorySegment union) {
            return union.asSlice(DispatchStr$OFFSET, DispatchStr$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * SAFEARR_DISPATCH DispatchStr
         * }
         */
        public static void DispatchStr(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, DispatchStr$OFFSET, DispatchStr$LAYOUT.byteSize());
        }

        private static final GroupLayout VariantStr$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("VariantStr"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * SAFEARR_VARIANT VariantStr
         * }
         */
        public static final GroupLayout VariantStr$layout() {
            return VariantStr$LAYOUT;
        }

        private static final long VariantStr$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * SAFEARR_VARIANT VariantStr
         * }
         */
        public static final long VariantStr$offset() {
            return VariantStr$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * SAFEARR_VARIANT VariantStr
         * }
         */
        public static MemorySegment VariantStr(MemorySegment union) {
            return union.asSlice(VariantStr$OFFSET, VariantStr$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * SAFEARR_VARIANT VariantStr
         * }
         */
        public static void VariantStr(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, VariantStr$OFFSET, VariantStr$LAYOUT.byteSize());
        }

        private static final GroupLayout RecordStr$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("RecordStr"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * SAFEARR_BRECORD RecordStr
         * }
         */
        public static final GroupLayout RecordStr$layout() {
            return RecordStr$LAYOUT;
        }

        private static final long RecordStr$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * SAFEARR_BRECORD RecordStr
         * }
         */
        public static final long RecordStr$offset() {
            return RecordStr$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * SAFEARR_BRECORD RecordStr
         * }
         */
        public static MemorySegment RecordStr(MemorySegment union) {
            return union.asSlice(RecordStr$OFFSET, RecordStr$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * SAFEARR_BRECORD RecordStr
         * }
         */
        public static void RecordStr(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, RecordStr$OFFSET, RecordStr$LAYOUT.byteSize());
        }

        private static final GroupLayout HaveIidStr$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("HaveIidStr"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * SAFEARR_HAVEIID HaveIidStr
         * }
         */
        public static final GroupLayout HaveIidStr$layout() {
            return HaveIidStr$LAYOUT;
        }

        private static final long HaveIidStr$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * SAFEARR_HAVEIID HaveIidStr
         * }
         */
        public static final long HaveIidStr$offset() {
            return HaveIidStr$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * SAFEARR_HAVEIID HaveIidStr
         * }
         */
        public static MemorySegment HaveIidStr(MemorySegment union) {
            return union.asSlice(HaveIidStr$OFFSET, HaveIidStr$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * SAFEARR_HAVEIID HaveIidStr
         * }
         */
        public static void HaveIidStr(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, HaveIidStr$OFFSET, HaveIidStr$LAYOUT.byteSize());
        }

        private static final GroupLayout ByteStr$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ByteStr"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * BYTE_SIZEDARR ByteStr
         * }
         */
        public static final GroupLayout ByteStr$layout() {
            return ByteStr$LAYOUT;
        }

        private static final long ByteStr$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * BYTE_SIZEDARR ByteStr
         * }
         */
        public static final long ByteStr$offset() {
            return ByteStr$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * BYTE_SIZEDARR ByteStr
         * }
         */
        public static MemorySegment ByteStr(MemorySegment union) {
            return union.asSlice(ByteStr$OFFSET, ByteStr$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * BYTE_SIZEDARR ByteStr
         * }
         */
        public static void ByteStr(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, ByteStr$OFFSET, ByteStr$LAYOUT.byteSize());
        }

        private static final GroupLayout WordStr$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("WordStr"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * WORD_SIZEDARR WordStr
         * }
         */
        public static final GroupLayout WordStr$layout() {
            return WordStr$LAYOUT;
        }

        private static final long WordStr$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * WORD_SIZEDARR WordStr
         * }
         */
        public static final long WordStr$offset() {
            return WordStr$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * WORD_SIZEDARR WordStr
         * }
         */
        public static MemorySegment WordStr(MemorySegment union) {
            return union.asSlice(WordStr$OFFSET, WordStr$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * WORD_SIZEDARR WordStr
         * }
         */
        public static void WordStr(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, WordStr$OFFSET, WordStr$LAYOUT.byteSize());
        }

        private static final GroupLayout LongStr$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("LongStr"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * DWORD_SIZEDARR LongStr
         * }
         */
        public static final GroupLayout LongStr$layout() {
            return LongStr$LAYOUT;
        }

        private static final long LongStr$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * DWORD_SIZEDARR LongStr
         * }
         */
        public static final long LongStr$offset() {
            return LongStr$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * DWORD_SIZEDARR LongStr
         * }
         */
        public static MemorySegment LongStr(MemorySegment union) {
            return union.asSlice(LongStr$OFFSET, LongStr$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * DWORD_SIZEDARR LongStr
         * }
         */
        public static void LongStr(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, LongStr$OFFSET, LongStr$LAYOUT.byteSize());
        }

        private static final GroupLayout HyperStr$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("HyperStr"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * HYPER_SIZEDARR HyperStr
         * }
         */
        public static final GroupLayout HyperStr$layout() {
            return HyperStr$LAYOUT;
        }

        private static final long HyperStr$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * HYPER_SIZEDARR HyperStr
         * }
         */
        public static final long HyperStr$offset() {
            return HyperStr$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * HYPER_SIZEDARR HyperStr
         * }
         */
        public static MemorySegment HyperStr(MemorySegment union) {
            return union.asSlice(HyperStr$OFFSET, HyperStr$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * HYPER_SIZEDARR HyperStr
         * }
         */
        public static void HyperStr(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, HyperStr$OFFSET, HyperStr$LAYOUT.byteSize());
        }

        /**
         * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
         * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
         */
        public static MemorySegment asSlice(MemorySegment array, long index) {
            return array.asSlice(layout().byteSize() * index);
        }

        /**
         * The size (in bytes) of this union
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

    private static final GroupLayout u$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("u"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * union __MIDL_IOleAutomationTypes_0001 u
     * }
     */
    public static final GroupLayout u$layout() {
        return u$LAYOUT;
    }

    private static final long u$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * union __MIDL_IOleAutomationTypes_0001 u
     * }
     */
    public static final long u$offset() {
        return u$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * union __MIDL_IOleAutomationTypes_0001 u
     * }
     */
    public static MemorySegment u(MemorySegment struct) {
        return struct.asSlice(u$OFFSET, u$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * union __MIDL_IOleAutomationTypes_0001 u
     * }
     */
    public static void u(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, u$OFFSET, u$LAYOUT.byteSize());
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

