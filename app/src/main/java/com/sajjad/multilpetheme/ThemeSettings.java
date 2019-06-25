package com.sajjad.multilpetheme;

import android.content.Context;
import android.content.SharedPreferences;

class ThemeSettings {
    private Context context;
    private final String RES_ID = "resId";
    private SharedPreferences preferences;

    ThemeSettings(Context context) {
        this.context = context;
    }

    void SaveTheme(int resId) {
        preferences = getPreferences();
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(RES_ID, resId).apply();
    }

    int GetThemeId() {
        preferences = getPreferences();
        return preferences.getInt(RES_ID, 0);
    }

    private SharedPreferences getPreferences() {
        return context.getSharedPreferences("myTheme", Context.MODE_PRIVATE);
    }
}