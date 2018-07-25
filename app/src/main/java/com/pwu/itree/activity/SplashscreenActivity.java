package com.pwu.itree.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.pwu.itree.R;
import com.pwu.itree.utils.AnimationHelper;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SplashscreenActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_splashscreen);
        ButterKnife.bind(this);

        startActivity(new Intent(this, FamilyTreeActivity.class));
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

//    @OnClick({R.id.ivTree, R.id.btnAboutUs})
//    public void onViewClicked(View view) {
//        switch (view.getId()) {
//            case R.id.ivTree:
//                onTreeClicked();
//                break;
//            case R.id.btnAboutUs:
//                break;
//        }
//    }
//
//    private void onTreeClicked() {
//
//        View v = getLayoutInflater().inflate(R.layout.dialog_tree_information, null);
//        TextView tvClose = v.findViewById(R.id.tvClose);
//
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        builder.setView(v);
//        builder.setCancelable(false);
//        final AlertDialog dialog = builder.create();
//        dialog.show();
//
//        tvClose.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                dialog.dismiss();
//                startActivity(new Intent(getApplicationContext(), MenuActivity.class));
//            }
//        });
//
//
//    }


}
