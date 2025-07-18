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
 * typedef struct _DEVICE_MEDIA_INFO {
 *     union {
 *         struct {
 *             LARGE_INTEGER Cylinders;
 *             STORAGE_MEDIA_TYPE MediaType;
 *             DWORD TracksPerCylinder;
 *             DWORD SectorsPerTrack;
 *             DWORD BytesPerSector;
 *             DWORD NumberMediaSides;
 *             DWORD MediaCharacteristics;
 *         } DiskInfo;
 *         struct {
 *             LARGE_INTEGER Cylinders;
 *             STORAGE_MEDIA_TYPE MediaType;
 *             DWORD TracksPerCylinder;
 *             DWORD SectorsPerTrack;
 *             DWORD BytesPerSector;
 *             DWORD NumberMediaSides;
 *             DWORD MediaCharacteristics;
 *         } RemovableDiskInfo;
 *         struct {
 *             STORAGE_MEDIA_TYPE MediaType;
 *             DWORD MediaCharacteristics;
 *             DWORD CurrentBlockSize;
 *             STORAGE_BUS_TYPE BusType;
 *             union {
 *                 struct {
 *                     BYTE MediumType;
 *                     BYTE DensityCode;
 *                 } ScsiInformation;
 *             } BusSpecificData;
 *         } TapeInfo;
 *     } DeviceSpecific;
 * } DEVICE_MEDIA_INFO
 * }
 */
public class DEVICE_MEDIA_INFO extends _DEVICE_MEDIA_INFO {

    DEVICE_MEDIA_INFO() {
        // Should not be called directly
    }
}

