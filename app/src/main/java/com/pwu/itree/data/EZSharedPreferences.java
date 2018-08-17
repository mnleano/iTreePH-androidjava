package com.pwu.itree.data;

import android.content.Context;
import android.content.SharedPreferences;

public class EZSharedPreferences {

    private final static String USER_PREFERENCES = "iTree";

    private final static String KEY_IS_NIGHTMODE_ENABLED = "isNightModeEnabled";

    private static SharedPreferences getSharedPref(Context ctx) {
        return ctx.getSharedPreferences(USER_PREFERENCES, Context.MODE_PRIVATE);
    }

    public static void dropSharedPref(Context ctx) {
        SharedPreferences.Editor editor = getSharedPref(ctx).edit();
        editor.clear();
        editor.apply();
    }

    // G E T T E R

    private static boolean getBoolean(Context ctx, String keyword) {
        return getSharedPref(ctx).getBoolean(keyword, false);
    }

    public static boolean isNightModeEnabled(Context ctx) {
        return getBoolean(ctx, KEY_IS_NIGHTMODE_ENABLED);
    }

    /**************/

    // S E T T E R
    public static void isNightModeEnabled(Context ctx, boolean isEnabled) {
        SharedPreferences.Editor editor = getSharedPref(ctx).edit();
        editor.putBoolean(KEY_IS_NIGHTMODE_ENABLED, isEnabled);
        editor.apply();
    }
}
