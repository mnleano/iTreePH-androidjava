package com.pwu.itree.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.WindowManager;

import com.pwu.itree.R;
import com.pwu.itree.data.EZSharedPreferences;

public class BaseActivity extends AppCompatActivity {

    private String TAG = "TAG_BaseActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Log.d(TAG, "onCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Log.d(TAG, "onResume");

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        if (EZSharedPreferences.isNightModeEnabled(this)) {
            setTheme(R.style.DarkTheme);
            getWindow().setStatusBarColor(getResources().getColor(R.color.darkColorPrimaryDark));
        }
        else{
            setTheme(R.style.LightTheme);
            getWindow().setStatusBarColor(getResources().getColor(R.color.lightColorPrimaryDark));
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Log.d(TAG, "onPause");
    }

    public void setSupportActionBar(Toolbar toolbar, boolean showAsUp) {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(showAsUp);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void setTheme(boolean isEnabled) {

    }

//    public static void isNightModeEnabled(boolean isEnabled){
//        if(isEnabled)
//            setTheme(R.style.DarkTheme);
//    }
}
