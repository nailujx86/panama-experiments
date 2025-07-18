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
 * struct __MIDL___MIDL_itf_wtypes_0000_0001_0001 {
 *     DWORD tyspec;
 *     union __MIDL___MIDL_itf_wtypes_0000_0001_0005 {
 *         CLSID clsid;
 *         LPOLESTR pFileExt;
 *         LPOLESTR pMimeType;
 *         LPOLESTR pProgId;
 *         LPOLESTR pFileName;
 *         struct {
 *             LPOLESTR pPackageName;
 *             GUID PolicyId;
 *         } ByName;
 *         struct {
 *             GUID ObjectId;
 *             GUID PolicyId;
 *         } ByObjectId;
 *     } tagged_union;
 * }
 * }
 */
public class __MIDL___MIDL_itf_wtypes_0000_0001_0001 {

    __MIDL___MIDL_itf_wtypes_0000_0001_0001() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        winapi.C_LONG.withName("tyspec"),
        MemoryLayout.paddingLayout(4),
        __MIDL___MIDL_itf_wtypes_0000_0001_0001.__MIDL___MIDL_itf_wtypes_0000_0001_0005.layout().withName("tagged_union")
    ).withName("__MIDL___MIDL_itf_wtypes_0000_0001_0001");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt tyspec$LAYOUT = (OfInt)$LAYOUT.select(groupElement("tyspec"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * DWORD tyspec
     * }
     */
    public static final OfInt tyspec$layout() {
        return tyspec$LAYOUT;
    }

    private static final long tyspec$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * DWORD tyspec
     * }
     */
    public static final long tyspec$offset() {
        return tyspec$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * DWORD tyspec
     * }
     */
    public static int tyspec(MemorySegment struct) {
        return struct.get(tyspec$LAYOUT, tyspec$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * DWORD tyspec
     * }
     */
    public static void tyspec(MemorySegment struct, int fieldValue) {
        struct.set(tyspec$LAYOUT, tyspec$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * union __MIDL___MIDL_itf_wtypes_0000_0001_0005 {
     *     CLSID clsid;
     *     LPOLESTR pFileExt;
     *     LPOLESTR pMimeType;
     *     LPOLESTR pProgId;
     *     LPOLESTR pFileName;
     *     struct {
     *         LPOLESTR pPackageName;
     *         GUID PolicyId;
     *     } ByName;
     *     struct {
     *         GUID ObjectId;
     *         GUID PolicyId;
     *     } ByObjectId;
     * }
     * }
     */
    public static class __MIDL___MIDL_itf_wtypes_0000_0001_0005 {

        __MIDL___MIDL_itf_wtypes_0000_0001_0005() {
            // Should not be called directly
        }

        private static final GroupLayout $LAYOUT = MemoryLayout.unionLayout(
            _GUID.layout().withName("clsid"),
            winapi.C_POINTER.withName("pFileExt"),
            winapi.C_POINTER.withName("pMimeType"),
            winapi.C_POINTER.withName("pProgId"),
            winapi.C_POINTER.withName("pFileName"),
            __MIDL___MIDL_itf_wtypes_0000_0001_0001.__MIDL___MIDL_itf_wtypes_0000_0001_0005.ByName.layout().withName("ByName"),
            __MIDL___MIDL_itf_wtypes_0000_0001_0001.__MIDL___MIDL_itf_wtypes_0000_0001_0005.ByObjectId.layout().withName("ByObjectId")
        ).withName("__MIDL___MIDL_itf_wtypes_0000_0001_0005");

        /**
         * The layout of this union
         */
        public static final GroupLayout layout() {
            return $LAYOUT;
        }

        private static final GroupLayout clsid$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("clsid"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * CLSID clsid
         * }
         */
        public static final GroupLayout clsid$layout() {
            return clsid$LAYOUT;
        }

        private static final long clsid$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * CLSID clsid
         * }
         */
        public static final long clsid$offset() {
            return clsid$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * CLSID clsid
         * }
         */
        public static MemorySegment clsid(MemorySegment union) {
            return union.asSlice(clsid$OFFSET, clsid$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * CLSID clsid
         * }
         */
        public static void clsid(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, clsid$OFFSET, clsid$LAYOUT.byteSize());
        }

        private static final AddressLayout pFileExt$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pFileExt"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * LPOLESTR pFileExt
         * }
         */
        public static final AddressLayout pFileExt$layout() {
            return pFileExt$LAYOUT;
        }

        private static final long pFileExt$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * LPOLESTR pFileExt
         * }
         */
        public static final long pFileExt$offset() {
            return pFileExt$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * LPOLESTR pFileExt
         * }
         */
        public static MemorySegment pFileExt(MemorySegment union) {
            return union.get(pFileExt$LAYOUT, pFileExt$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * LPOLESTR pFileExt
         * }
         */
        public static void pFileExt(MemorySegment union, MemorySegment fieldValue) {
            union.set(pFileExt$LAYOUT, pFileExt$OFFSET, fieldValue);
        }

        private static final AddressLayout pMimeType$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pMimeType"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * LPOLESTR pMimeType
         * }
         */
        public static final AddressLayout pMimeType$layout() {
            return pMimeType$LAYOUT;
        }

        private static final long pMimeType$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * LPOLESTR pMimeType
         * }
         */
        public static final long pMimeType$offset() {
            return pMimeType$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * LPOLESTR pMimeType
         * }
         */
        public static MemorySegment pMimeType(MemorySegment union) {
            return union.get(pMimeType$LAYOUT, pMimeType$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * LPOLESTR pMimeType
         * }
         */
        public static void pMimeType(MemorySegment union, MemorySegment fieldValue) {
            union.set(pMimeType$LAYOUT, pMimeType$OFFSET, fieldValue);
        }

        private static final AddressLayout pProgId$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pProgId"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * LPOLESTR pProgId
         * }
         */
        public static final AddressLayout pProgId$layout() {
            return pProgId$LAYOUT;
        }

        private static final long pProgId$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * LPOLESTR pProgId
         * }
         */
        public static final long pProgId$offset() {
            return pProgId$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * LPOLESTR pProgId
         * }
         */
        public static MemorySegment pProgId(MemorySegment union) {
            return union.get(pProgId$LAYOUT, pProgId$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * LPOLESTR pProgId
         * }
         */
        public static void pProgId(MemorySegment union, MemorySegment fieldValue) {
            union.set(pProgId$LAYOUT, pProgId$OFFSET, fieldValue);
        }

        private static final AddressLayout pFileName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pFileName"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * LPOLESTR pFileName
         * }
         */
        public static final AddressLayout pFileName$layout() {
            return pFileName$LAYOUT;
        }

        private static final long pFileName$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * LPOLESTR pFileName
         * }
         */
        public static final long pFileName$offset() {
            return pFileName$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * LPOLESTR pFileName
         * }
         */
        public static MemorySegment pFileName(MemorySegment union) {
            return union.get(pFileName$LAYOUT, pFileName$OFFSET);
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * LPOLESTR pFileName
         * }
         */
        public static void pFileName(MemorySegment union, MemorySegment fieldValue) {
            union.set(pFileName$LAYOUT, pFileName$OFFSET, fieldValue);
        }

        /**
         * {@snippet lang=c :
         * struct {
         *     LPOLESTR pPackageName;
         *     GUID PolicyId;
         * }
         * }
         */
        public static class ByName {

            ByName() {
                // Should not be called directly
            }

            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
                winapi.C_POINTER.withName("pPackageName"),
                _GUID.layout().withName("PolicyId")
            ).withName("$anon$938:24");

            /**
             * The layout of this struct
             */
            public static final GroupLayout layout() {
                return $LAYOUT;
            }

            private static final AddressLayout pPackageName$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("pPackageName"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * LPOLESTR pPackageName
             * }
             */
            public static final AddressLayout pPackageName$layout() {
                return pPackageName$LAYOUT;
            }

            private static final long pPackageName$OFFSET = 0;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * LPOLESTR pPackageName
             * }
             */
            public static final long pPackageName$offset() {
                return pPackageName$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * LPOLESTR pPackageName
             * }
             */
            public static MemorySegment pPackageName(MemorySegment struct) {
                return struct.get(pPackageName$LAYOUT, pPackageName$OFFSET);
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * LPOLESTR pPackageName
             * }
             */
            public static void pPackageName(MemorySegment struct, MemorySegment fieldValue) {
                struct.set(pPackageName$LAYOUT, pPackageName$OFFSET, fieldValue);
            }

            private static final GroupLayout PolicyId$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("PolicyId"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * GUID PolicyId
             * }
             */
            public static final GroupLayout PolicyId$layout() {
                return PolicyId$LAYOUT;
            }

            private static final long PolicyId$OFFSET = 8;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * GUID PolicyId
             * }
             */
            public static final long PolicyId$offset() {
                return PolicyId$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * GUID PolicyId
             * }
             */
            public static MemorySegment PolicyId(MemorySegment struct) {
                return struct.asSlice(PolicyId$OFFSET, PolicyId$LAYOUT.byteSize());
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * GUID PolicyId
             * }
             */
            public static void PolicyId(MemorySegment struct, MemorySegment fieldValue) {
                MemorySegment.copy(fieldValue, 0L, struct, PolicyId$OFFSET, PolicyId$LAYOUT.byteSize());
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

        private static final GroupLayout ByName$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ByName"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * struct {
         *     LPOLESTR pPackageName;
         *     GUID PolicyId;
         * } ByName
         * }
         */
        public static final GroupLayout ByName$layout() {
            return ByName$LAYOUT;
        }

        private static final long ByName$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * struct {
         *     LPOLESTR pPackageName;
         *     GUID PolicyId;
         * } ByName
         * }
         */
        public static final long ByName$offset() {
            return ByName$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * struct {
         *     LPOLESTR pPackageName;
         *     GUID PolicyId;
         * } ByName
         * }
         */
        public static MemorySegment ByName(MemorySegment union) {
            return union.asSlice(ByName$OFFSET, ByName$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * struct {
         *     LPOLESTR pPackageName;
         *     GUID PolicyId;
         * } ByName
         * }
         */
        public static void ByName(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, ByName$OFFSET, ByName$LAYOUT.byteSize());
        }

        /**
         * {@snippet lang=c :
         * struct {
         *     GUID ObjectId;
         *     GUID PolicyId;
         * }
         * }
         */
        public static class ByObjectId {

            ByObjectId() {
                // Should not be called directly
            }

            private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
                _GUID.layout().withName("ObjectId"),
                _GUID.layout().withName("PolicyId")
            ).withName("$anon$943:24");

            /**
             * The layout of this struct
             */
            public static final GroupLayout layout() {
                return $LAYOUT;
            }

            private static final GroupLayout ObjectId$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ObjectId"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * GUID ObjectId
             * }
             */
            public static final GroupLayout ObjectId$layout() {
                return ObjectId$LAYOUT;
            }

            private static final long ObjectId$OFFSET = 0;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * GUID ObjectId
             * }
             */
            public static final long ObjectId$offset() {
                return ObjectId$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * GUID ObjectId
             * }
             */
            public static MemorySegment ObjectId(MemorySegment struct) {
                return struct.asSlice(ObjectId$OFFSET, ObjectId$LAYOUT.byteSize());
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * GUID ObjectId
             * }
             */
            public static void ObjectId(MemorySegment struct, MemorySegment fieldValue) {
                MemorySegment.copy(fieldValue, 0L, struct, ObjectId$OFFSET, ObjectId$LAYOUT.byteSize());
            }

            private static final GroupLayout PolicyId$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("PolicyId"));

            /**
             * Layout for field:
             * {@snippet lang=c :
             * GUID PolicyId
             * }
             */
            public static final GroupLayout PolicyId$layout() {
                return PolicyId$LAYOUT;
            }

            private static final long PolicyId$OFFSET = 16;

            /**
             * Offset for field:
             * {@snippet lang=c :
             * GUID PolicyId
             * }
             */
            public static final long PolicyId$offset() {
                return PolicyId$OFFSET;
            }

            /**
             * Getter for field:
             * {@snippet lang=c :
             * GUID PolicyId
             * }
             */
            public static MemorySegment PolicyId(MemorySegment struct) {
                return struct.asSlice(PolicyId$OFFSET, PolicyId$LAYOUT.byteSize());
            }

            /**
             * Setter for field:
             * {@snippet lang=c :
             * GUID PolicyId
             * }
             */
            public static void PolicyId(MemorySegment struct, MemorySegment fieldValue) {
                MemorySegment.copy(fieldValue, 0L, struct, PolicyId$OFFSET, PolicyId$LAYOUT.byteSize());
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

        private static final GroupLayout ByObjectId$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("ByObjectId"));

        /**
         * Layout for field:
         * {@snippet lang=c :
         * struct {
         *     GUID ObjectId;
         *     GUID PolicyId;
         * } ByObjectId
         * }
         */
        public static final GroupLayout ByObjectId$layout() {
            return ByObjectId$LAYOUT;
        }

        private static final long ByObjectId$OFFSET = 0;

        /**
         * Offset for field:
         * {@snippet lang=c :
         * struct {
         *     GUID ObjectId;
         *     GUID PolicyId;
         * } ByObjectId
         * }
         */
        public static final long ByObjectId$offset() {
            return ByObjectId$OFFSET;
        }

        /**
         * Getter for field:
         * {@snippet lang=c :
         * struct {
         *     GUID ObjectId;
         *     GUID PolicyId;
         * } ByObjectId
         * }
         */
        public static MemorySegment ByObjectId(MemorySegment union) {
            return union.asSlice(ByObjectId$OFFSET, ByObjectId$LAYOUT.byteSize());
        }

        /**
         * Setter for field:
         * {@snippet lang=c :
         * struct {
         *     GUID ObjectId;
         *     GUID PolicyId;
         * } ByObjectId
         * }
         */
        public static void ByObjectId(MemorySegment union, MemorySegment fieldValue) {
            MemorySegment.copy(fieldValue, 0L, union, ByObjectId$OFFSET, ByObjectId$LAYOUT.byteSize());
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

    private static final GroupLayout tagged_union$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("tagged_union"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * union __MIDL___MIDL_itf_wtypes_0000_0001_0005 tagged_union
     * }
     */
    public static final GroupLayout tagged_union$layout() {
        return tagged_union$LAYOUT;
    }

    private static final long tagged_union$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * union __MIDL___MIDL_itf_wtypes_0000_0001_0005 tagged_union
     * }
     */
    public static final long tagged_union$offset() {
        return tagged_union$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * union __MIDL___MIDL_itf_wtypes_0000_0001_0005 tagged_union
     * }
     */
    public static MemorySegment tagged_union(MemorySegment struct) {
        return struct.asSlice(tagged_union$OFFSET, tagged_union$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * union __MIDL___MIDL_itf_wtypes_0000_0001_0005 tagged_union
     * }
     */
    public static void tagged_union(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, tagged_union$OFFSET, tagged_union$LAYOUT.byteSize());
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

