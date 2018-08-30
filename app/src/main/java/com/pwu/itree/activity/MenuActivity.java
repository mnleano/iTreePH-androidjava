package com.pwu.itree.activity;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.pwu.itree.R;
import com.pwu.itree.activity.quiz.QuizMenuActivity;
import com.pwu.itree.activity.tree.TreesV2Activity;
import com.pwu.itree.builder.DialogBuilder;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MenuActivity extends BaseActivity {

    private String TAG = "TAG_MenuActivity";

    @BindView(R.id.center)
    View center;
    @BindView(R.id.trees)
    LinearLayout trees;
    @BindView(R.id.quiz)
    ImageView quiz;
    @BindView(R.id.blurry)
    View blurry;
    @BindView(R.id.settings)
    LinearLayout settings;
    @BindView(R.id.aboutUs)
    LinearLayout aboutUs;
    @BindView(R.id.subMenu)
    LinearLayout subMenu;
    @BindView(R.id.fabMenu)
    ImageView fabMenu;

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");

        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    public void onBackPressed() {
        DialogBuilder.showExitDialog(this);
    }

    @OnClick({R.id.trees, R.id.quiz, R.id.blurry, R.id.settings, R.id.aboutUs, R.id.fabMenu})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.trees:
                startActivity(new Intent(this, TreesV2Activity.class));
                break;
            case R.id.quiz:
                startActivity(new Intent(this, QuizMenuActivity.class));
                break;
            case R.id.blurry:
                hideSubMenu();
                break;
            case R.id.settings:
                startActivity(new Intent(this, SettingsActivity.class));
                hideSubMenu();
                break;
            case R.id.aboutUs:
//                DialogBuilder.themeChangeDialog(this, false);
                hideSubMenu();
                break;
            case R.id.fabMenu:
                onFabClicked();
                break;
        }
    }

    private void onFabClicked() {
        if (subMenu.getVisibility() == View.VISIBLE) {
            hideSubMenu();
        } else {
            showSubMenu();
        }
    }

    private void hideSubMenu() {
        fabMenu.setImageResource(R.drawable.ic_arrow_up);
        subMenu.setVisibility(View.GONE);
        blurry.setVisibility(View.GONE);
    }

    private void showSubMenu() {
        fabMenu.setImageResource(R.drawable.ic_arrow_down);
        subMenu.setVisibility(View.VISIBLE);
        blurry.setVisibility(View.VISIBLE);
    }
}
