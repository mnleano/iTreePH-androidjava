package com.pwu.itree.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.pwu.itree.R;

public class SplashScreenV2Activity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_splashscreen_v2);

//        DatabaseQueries.testDB(this);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreenV2Activity.this, MenuActivity.class));
                finish();
            }
        }, 1000);
    }
}
