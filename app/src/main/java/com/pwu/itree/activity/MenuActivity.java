package com.pwu.itree.activity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.pwu.itree.R;
import com.pwu.itree.builder.DialogBuilder;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MenuActivity extends BaseActivity {

    @BindView(R.id.ivTree)
    ImageView ivTree;
    @BindView(R.id.center)
    View center;
    @BindView(R.id.ivQuiz)
    ImageView ivQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);

//        startTrivia();
    }

    private void startTrivia() {

        View v = LayoutInflater.from(this).inflate(R.layout.dialog_treevia, null);
//        Dialog dialog = new Dialog(this);
//        dialog.setContentView(v);
//        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//        dialog.show();

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(v);

        AlertDialog dialog = builder.create();
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();

    }

    @OnClick({R.id.ivTree, R.id.ivQuiz})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ivTree:
                startActivity(new Intent(this, TreesActivity.class));
                break;
            case R.id.ivQuiz:
                break;
        }
    }

    @Override
    public void onBackPressed() {
        DialogBuilder.showExitDialog(this);
    }
}
