package com.pwu.itree.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.pwu.itree.R;
import com.pwu.itree.data.DatabaseHelper;
import com.pwu.itree.data.DatabaseQueries;
import com.pwu.itree.utils.AnimationHelper;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SplashActivity extends AppCompatActivity {
    @BindView(R.id.center)
    View center;
    @BindView(R.id.ivName)
    ImageView ivName;
    @BindView(R.id.ivTree)
    ImageView ivTree;

    AnimationHelper animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);

        DatabaseQueries.testDB(this);
//        startActivity(new Intent(this, FamilyTreeActivity.class));
//        startAnimations();

    }

    private void startAnimations() {

        animation = new AnimationHelper(this);
        animation.fadeIn(ivTree, new AnimationHelper.AnimationListener() {
            @Override
            public void onAnimationEnd() {
                animation.fadeIn(ivName, new AnimationHelper.AnimationListener() {
                    @Override
                    public void onAnimationEnd() {
                        startActivity(new Intent(getApplicationContext(), MenuActivity.class));
                        finish();
                    }
                });
            }
        });
//        animation.hybrid(ivName);

    }
}
