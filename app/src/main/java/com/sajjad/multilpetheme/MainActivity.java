package com.sajjad.multilpetheme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    ThemeSettings themeSettings;
    Toolbar mainToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        themeSettings = new ThemeSettings(this);
        int styleId = themeSettings.GetThemeId();
        if (styleId == 0) {
            setTheme(R.style.AppTheme);
        } else {
            setTheme(styleId);
        }
        setContentView(R.layout.activity_main);
        mainToolbar = findViewById(R.id.main_toolbar);
    }

    public void DarkMode(View view) {
        themeSettings.SaveTheme(R.style.NightMode);
        recreate();
    }

    public void DefaultMode(View view) {
        themeSettings.SaveTheme(R.style.AppTheme);
        recreate();
    }
}