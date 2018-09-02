package com.pwu.itree.activity.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.pwu.itree.R;
import com.pwu.itree.activity.BaseActivity;
import com.pwu.itree.data.EZSharedPreferences;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class QuizMainMenuActivity extends BaseActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.btnCommon)
    Button btnCommon;
    @BindView(R.id.btnScientific)
    Button btnScientific;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (EZSharedPreferences.isNightModeEnabled(this))
            setTheme(R.style.DarkTheme);

        setContentView(R.layout.activity_quiz_main_menu);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar, true);
        setTitle("Quiz");
    }

    @OnClick({R.id.btnCommon, R.id.btnScientific})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btnCommon: startActivity(QuizType.GUESS_COMMON_NAME);
                break;
            case R.id.btnScientific: startActivity(QuizType.GUESS_SCIENTIFIC_NAME);
                break;
        }
    }

    private void startActivity(QuizType quizType) {
        Bundle extras = new Bundle();
        extras.putSerializable("QuizType", quizType);
        startActivity(new Intent(this, QuizMenuActivity.class).putExtras(extras));
    }
}
