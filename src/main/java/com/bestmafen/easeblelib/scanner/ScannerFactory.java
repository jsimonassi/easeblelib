package com.bestmafen.easeblelib.scanner;

import android.os.Build;

/**
 * This class is used to create a {@link EaseScanner} object according to different API level.
 */
public class ScannerFactory {

    public static EaseScanner createScanner() {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            return new ScannerOld();
        } else {
            return new ScannerNew();
        }
    }
}
