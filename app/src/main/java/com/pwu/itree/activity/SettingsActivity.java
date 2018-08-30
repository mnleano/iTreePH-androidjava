package com.pwu.itree.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Switch;

import com.pwu.itree.R;
import com.pwu.itree.data.EZSharedPreferences;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SettingsActivity extends BaseActivity {

    private String TAG = "TAG_SettingsActivity";

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.swNightMode)
    Switch swNightMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
    }

    private void initData() {

        swNightMode.setChecked(EZSharedPreferences.isNightModeEnabled(this));
    }

    private void initListener() {
        swNightMode.setOnCheckedChangeListener(new CheckedChangedListener());
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume");
        super.onResume();

        setContentView(R.layout.activity_settings);
        ButterKnife.bind(this);

        initToolbar();
        initData();
        initListener();
    }

    private void initToolbar() {

        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Settings");
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    private class CheckedChangedListener implements CompoundButton.OnCheckedChangeListener {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            Log.d(TAG, "onCheckChanged: " + b);
            compoundButton.setOnCheckedChangeListener(null);
            EZSharedPreferences.isNightModeEnabled(SettingsActivity.this, b);
            finish();
            startActivity(getIntent());
        }
    }

}
