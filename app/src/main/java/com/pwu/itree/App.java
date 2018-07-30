package com.pwu.itree;

import android.app.Application;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class App extends Application {
    public static final String TAG = "App";
    private boolean isNightModeEnabled = false;

    private static App mInstance = null;

    @Override
    public void onCreate() {
        super.onCreate();

        mInstance = this;

        SharedPreferences mPrefs = PreferenceManager.getDefaultSharedPreferences(this);
        this.isNightModeEnabled = mPrefs.getBoolean("NIGHT_MODE", false);
    }

    public static App getInstance() {
        return mInstance;
    }

    public boolean isNightModeEnabled() {
        return isNightModeEnabled;
    }

    public void setIsNightModeEnabled(boolean isNightModeEnabled) {
        this.isNightModeEnabled = isNightModeEnabled;
    }
}
