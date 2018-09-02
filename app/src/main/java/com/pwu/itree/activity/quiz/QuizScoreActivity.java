package com.pwu.itree.activity.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import com.pwu.itree.R;
import com.pwu.itree.activity.BaseActivity;
import com.pwu.itree.adapter.ScoreAdapter;
import com.pwu.itree.data.DatabaseQueries;
import com.pwu.itree.data.EZSharedPreferences;
import com.pwu.itree.model.GameScore;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class QuizScoreActivity extends BaseActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.list)
    ListView list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (EZSharedPreferences.isNightModeEnabled(this))
            setTheme(R.style.DarkTheme);

        setContentView(R.layout.activity_quiz_score);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar, true);
        setTitle("High Score");

        QuizType quizType = (QuizType) getIntent().getExtras().getSerializable("QuizType");
        List<GameScore> scoreList = DatabaseQueries.getHighScore(this, quizType.getType());
        ScoreAdapter adapter = new ScoreAdapter(this, scoreList);
        list.setAdapter(adapter);
    }
}
