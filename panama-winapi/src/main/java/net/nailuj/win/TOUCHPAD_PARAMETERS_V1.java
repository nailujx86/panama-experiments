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
 * typedef struct TOUCHPAD_PARAMETERS {
 *     UINT versionNumber;
 *     UINT maxSupportedContacts;
 *     LEGACY_TOUCHPAD_FEATURES legacyTouchpadFeatures;
 *     BOOL touchpadPresent : 1;
 *     BOOL legacyTouchpadPresent : 1;
 *     BOOL externalMousePresent : 1;
 *     BOOL touchpadEnabled : 1;
 *     BOOL touchpadActive : 1;
 *     BOOL feedbackSupported : 1;
 *     BOOL clickForceSupported : 1;
 *     BOOL Reserved1 : 25;
 *     BOOL allowActiveWhenMousePresent : 1;
 *     BOOL feedbackEnabled : 1;
 *     BOOL tapEnabled : 1;
 *     BOOL tapAndDragEnabled : 1;
 *     BOOL twoFingerTapEnabled : 1;
 *     BOOL rightClickZoneEnabled : 1;
 *     BOOL mouseAccelSettingHonored : 1;
 *     BOOL panEnabled : 1;
 *     BOOL zoomEnabled : 1;
 *     BOOL scrollDirectionReversed : 1;
 *     BOOL Reserved2 : 22;
 *     TOUCHPAD_SENSITIVITY_LEVEL sensitivityLevel;
 *     UINT cursorSpeed;
 *     UINT feedbackIntensity;
 *     UINT clickForceSensitivity;
 *     UINT rightClickZoneWidth;
 *     UINT rightClickZoneHeight;
 * } TOUCHPAD_PARAMETERS_V1
 * }
 */
public class TOUCHPAD_PARAMETERS_V1 extends TOUCHPAD_PARAMETERS {

    TOUCHPAD_PARAMETERS_V1() {
        // Should not be called directly
    }
}

