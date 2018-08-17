package com.pwu.itree;

import android.app.Application;

import com.pwu.itree.data.EZSharedPreferences;

public class App extends Application {
    public static final String TAG = "App";

    private static App instance = null;

    public boolean isNightModeEnabled;

    public static App getInstance() {
        return instance;
    }


    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;
        isNightModeEnabled = EZSharedPreferences.isNightModeEnabled(this);
    }


    public void setNightMode(boolean isEnabled) {

        EZSharedPreferences.isNightModeEnabled(this, isEnabled);

        if (isEnabled)
            setTheme(R.style.DarkTheme);
        else
            setTheme(R.style.LightTheme);

    }


}
