package com.pwu.itree.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.pwu.itree.R;
import com.pwu.itree.data.EZSharedPreferences;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (EZSharedPreferences.isNightModeEnabled(this))
            setTheme(R.style.DarkTheme);

//        if (App.getInstance().isNightModeEnabled)
//            setTheme(R.style.DarkTheme);
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
