package com.pwu.itree;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class ITreeApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/great-vibes.otf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
