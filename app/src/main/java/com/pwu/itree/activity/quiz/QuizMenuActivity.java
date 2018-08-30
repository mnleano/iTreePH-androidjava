package com.pwu.itree.activity.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.pwu.itree.R;
import com.pwu.itree.activity.BaseActivity;
import com.pwu.itree.data.EZSharedPreferences;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class QuizMenuActivity extends BaseActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.btnStart)
    Button btnStart;
    @BindView(R.id.btnHighScore)
    Button btnHighScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (EZSharedPreferences.isNightModeEnabled(this))
            setTheme(R.style.DarkTheme);

        setContentView(R.layout.activity_quiz_menu);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar, true);
        setTitle("Quiz");
    }

    @OnClick({R.id.btnStart, R.id.btnHighScore})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnStart:
                startActivity(new Intent(QuizMenuActivity.this, QuizActivity.class));
                break;
            case R.id.btnHighScore:
                break;
        }
    }
}
