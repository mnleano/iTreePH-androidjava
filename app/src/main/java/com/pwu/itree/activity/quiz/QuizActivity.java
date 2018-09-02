package com.pwu.itree.activity.quiz;

import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.pwu.itree.R;
import com.pwu.itree.activity.BaseActivity;
import com.pwu.itree.builder.DialogBuilder;
import com.pwu.itree.data.DatabaseQueries;
import com.pwu.itree.data.EZSharedPreferences;
import com.pwu.itree.model.GameScore;
import com.pwu.itree.model.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;

public class QuizActivity extends BaseActivity {

    String TAG = "TAG_QuizActivity";

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.tvTimer)
    TextView tvTimer;
    @BindView(R.id.ivTree)
    ImageView ivTree;
    @BindView(R.id.tvScore)
    TextView tvScore;
    @BindViews({R.id.btnOption1, R.id.btnOption2, R.id.btnOption3, R.id.btnOption4})
    List<Button> btnOptions;

    private Random randomizer;
    private List<Tree> trees; // known as SubTrees;
    private List<String> treeNames;

    int questionIndex;
    int answerIndex;
    int correctAnswer;

    Tree tree;

    CountDownTimer timer;

    private QuizType quizType;

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

    private void startGame() {

        quizType = (QuizType) getIntent().getExtras().getSerializable("QuizType");

        randomizer = new Random();
        int familyType = randomizer.nextInt(15);
        trees = DatabaseQueries.getSubTrees(this, familyType);
        Collections.shuffle(trees);


        treeNames = new ArrayList<>();
        if (quizType == QuizType.GUESS_COMMON_NAME)
            for (int i = 0; i < trees.size(); i++)
                treeNames.add(trees.get(i).getCommonName());
        else
            for (int i = 0; i < trees.size(); i++)
                treeNames.add(trees.get(i).getScientificName());

        questionIndex = 0;
        correctAnswer = 0;
        initQuestion();
        startTimer();

    }

    private void startTimer() {

        timer = new CountDownTimer(60000, 1000) {

            @Override
            public void onTick(long millis) {
                Log.d("TAG_", "onTick: " + millis);
                String timeRemaining = String.format(Locale.getDefault(), "%02d:%02d",
                        TimeUnit.MILLISECONDS.toMinutes(millis),
                        TimeUnit.MILLISECONDS.toSeconds(millis) -
                                TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis))
                );

                tvTimer.setText(timeRemaining);
            }

            @Override
            public void onFinish() {
                addScoreToDB("Time\'s up)");
            }
        };

        timer.start();

    }

    private void initQuestion() {

        tree = trees.get(questionIndex);
        ivTree.setImageResource(tree.getDrawable());

        answerIndex = randomizer.nextInt(4);

        Log.d(TAG, "Correct answer: " + tree.getCommonName());
        Log.d(TAG, "Answer Index: " + answerIndex);

        final List<String> options = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            if (i == answerIndex)
                options.add(treeNames.get(questionIndex));
            else {
                String option = treeNames.get(randomizer.nextInt(treeNames.size()));
                if (isExist(options, option))
                    while (isExist(options, option))
                        option = treeNames.get(randomizer.nextInt(treeNames.size()));
                options.add(option);
            }
        }

        ButterKnife.Action<Button> buttonAction = new ButterKnife.Action<Button>() {
            @Override
            public void apply(@NonNull Button view, final int index) {
                Log.d(TAG, "Option: " + index + " : " + options.get(index));
                view.setText(options.get(index));
                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        selectAnswer(index);
                    }
                });
            }
        };

        ButterKnife.apply(btnOptions, buttonAction);
        ivTree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogBuilder.showImagePreviewDialog(QuizActivity.this, tree.getDrawable());
            }
        });
    }

    private boolean isExist(List<String> options, String option) {

        for (int i = 0; i < options.size(); i++)
            if (options.get(i).equals(option))
                return true;

        return false;
    }

    private void selectAnswer(int index) {

        if (answerIndex == index) {
            // CORRECT ANSWER;
            Log.d(TAG, "Correct answer");
            correctAnswer++;
            tvScore.setText("Score: " + correctAnswer);

        } else {
            // WRONG ANSWER;
            Log.d(TAG, "Wrong answer");
        }


        questionIndex++;

        if (questionIndex < 15) {

            ivTree.setImageDrawable(null);
//            if (ivTree != null)
//                ((BitmapDrawable) ivTree.getDrawable()).getBitmap().recycle();
            initQuestion();
        } else {
            Log.d(TAG, "Game over:" + correctAnswer);
            addScoreToDB("Game Over");
        }
    }

    private void addScoreToDB(String title) {
        timer.cancel();
        if (correctAnswer > 3) {
            final EditText editText = new EditText(this);
            AlertDialog.Builder builder = DialogBuilder.getBuilder(this);
            builder.setTitle(title);
            builder.setMessage("Congratulations!\nPlease enter your name to add in High score!");
            builder.setView(editText);
            builder.setCancelable(false);
            builder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    String name = editText.getText().toString();
                    if (name.equals(""))
                        editText.setError("Please enter your name");
                    else {
                        DatabaseQueries.addScore(QuizActivity.this, quizType.getType(), new GameScore(name, correctAnswer));
                        dialogInterface.dismiss();
                        finish();
                    }
                }
            }).show();
        } else {

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle(title);
            builder.setMessage("Sorry you don\'t reach the quota to be added in our High Score!");
            builder.setCancelable(false);
            builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                            finish();
                        }
                    }
            ).show();
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ivTree.setImageDrawable(null);
    }
}
