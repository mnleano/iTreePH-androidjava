package com.pwu.itree.activity.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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
    @BindView(R.id.tvTitle)
    TextView tvTitle;
    @BindView(R.id.btnHighScore)
    Button btnHighScore;

    private QuizType quizType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (EZSharedPreferences.isNightModeEnabled(this))
            setTheme(R.style.DarkTheme);

        setContentView(R.layout.activity_quiz_menu);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar, true);
        setTitle("Quiz");

        initData();
    }

    private void initData() {

        quizType = null;
        if (getIntent().getExtras() != null)
            quizType = (QuizType) getIntent().getExtras().getSerializable("QuizType");

        tvTitle.setText(quizType.getTitle());


    }

    @OnClick({R.id.btnStart, R.id.btnHighScore})
    public void onViewClicked(View view) {

        Bundle extras = new Bundle();
        extras.putSerializable("QuizType", quizType);

        switch (view.getId()) {
            case R.id.btnStart:
                startActivity(new Intent(QuizMenuActivity.this, QuizActivity.class).putExtras(extras));
                break;
            case R.id.btnHighScore:
                startActivity(new Intent(QuizMenuActivity.this, QuizScoreActivity.class).putExtras(extras));
                break;
        }
    }
}
