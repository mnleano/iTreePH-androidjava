package com.pwu.itree.activity;

import android.content.Intent;
import android.os.Bundle;

import com.pwu.itree.R;

public class SplashScreenV2Activity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen_v2);


        startActivity(new Intent(SplashScreenV2Activity.this, MainActivity.class));

//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//
//                startActivity(new Intent(SplashScreenV2Activity.this, MainActivity.class));
//            }
//        }, 2000);
    }
}
