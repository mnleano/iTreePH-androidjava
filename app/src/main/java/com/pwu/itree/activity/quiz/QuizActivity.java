package com.pwu.itree.activity.quiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.ImageView;

import com.pwu.itree.R;
import com.pwu.itree.activity.BaseActivity;
import com.pwu.itree.data.DatabaseQueries;
import com.pwu.itree.data.EZSharedPreferences;
import com.pwu.itree.model.Tree;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;

public class QuizActivity extends BaseActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.ivTree)
    ImageView ivTree;
    @BindViews({R.id.btnOption1, R.id.btnOption2, R.id.btnOption3, R.id.btnOption4})
    List<Button> btnOptions;

    private Random randomizer;
    private List<Tree> trees; // known as SubTrees;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (EZSharedPreferences.isNightModeEnabled(this))
            setTheme(R.style.DarkTheme);

        setContentView(R.layout.activity_quiz);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar, true);
        setTitle("Quiz");

        startGame();
    }

    private void startGame(){

        randomizer = new Random();
        int familyType = randomizer.nextInt(15);
        trees = DatabaseQueries.getSubTrees(this, familyType);
        Collections.shuffle(trees);

        
    }
}
