package com.betomaluje.android.miband;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;

/**
 * Created by betomaluje on 6/26/15.
 */
public class MiBandApplication extends Application {

    private static MiBandApplication context;

    public MiBandApplication() {
        context = this;
    }

    public static Context getContext() {
        return context;
    }

    public static boolean supportsBluetoothLE() {
        return MiBandApplication.getContext().getPackageManager().hasSystemFeature(PackageManager.FEATURE_BLUETOOTH_LE);
    }

}
