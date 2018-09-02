package com.pwu.itree.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.pwu.itree.R;
import com.pwu.itree.activity.quiz.QuizMainMenuActivity;
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


    boolean isShown = false;

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");

        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);

        if (!isShown) {
            isShown = true;
            AlertDialog.Builder builder = DialogBuilder.getBuilder(this);
            builder.setTitle("Tropical Rain Forest Trees in Philippines")
                    .setMessage("The tropical rain forests represent some of the most biologically diverse spots in the entire world. Though endangered by human overdevelopment, there are still areas whose tropical rainforests are presently thriving. The Philippines, an archipelago in Southeast Asia, is one of these regions. There are some general facts about the tropical rain forest that will be helpful in understanding why it is so useful to humans.  The forests typically have year-round warmth as a result of their proximity to the equator, which receives direct rays from the sun.\n" +
                            "There are hundreds of native fauna species that call the Philippines rainforest home, including 185 birds, 100 mammals, 160 reptiles, 76 amphibians and over 65 freshwater fish species. One of the most well-known native Philippine animals is the Philippine Eagle. This is the second largest eagle in the world and faces endangerment, with less than 700 individuals left in the wild. The Tamaraw, a dwarf water buffalo, Philippine Crocodile and the Philippine Tarsier are other well-known native animal that live in the rainforest.\n" +
                            "Like the fauna found in the rainforest, the flora is also very diverse and can only be found in certain places in the Philippines. The many native plant species that make up the Philippines rainforest include gingers, begonias, orchids, palms, dipterocarps, gesneriads and pandans. In particular, orchards and palms make up a lot of the area of rainforests. Out of about 150 different species of pals, two thirds are found nowhere else in the world whilst 70percent of the 1,000 orchard species are native to the Philippines rainforest.\n" +
                            "\nPowered by: http://rainforestpalawan.blogspot.com/ and https://owt-thephilippines.weebly.com/tropical-rainforest.html")
                    .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    }).show();

        }
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
                startActivity(new Intent(this, QuizMainMenuActivity.class));
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
