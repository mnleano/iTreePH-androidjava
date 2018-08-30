package com.pwu.itree.activity.tree;

import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.pwu.itree.R;
import com.pwu.itree.activity.BaseActivity;
import com.pwu.itree.builder.DialogBuilder;
import com.pwu.itree.model.Tree;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;

public class SingleTreeActivity extends BaseActivity {

    Tree subTree = null;

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.ivTree)
    ImageView ivTree;
    @BindView(R.id.tvScientificName)
    TextView tvScientificName;
    @BindView(R.id.text)
    TextView text;

    @BindViews({R.id.btnDescription, R.id.btnHabitat, R.id.btnHorticulture, R.id.btnOtherUsage})
    List<Button> btnTabs;

    @Override
    protected void onResume() {
        super.onResume();

        setContentView(R.layout.activity_single_tree);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar, true);
        initData();
    }

    private void initData() {
        if (getIntent().getExtras() != null)
            subTree = getIntent().getExtras().getParcelable("SubTree");

        if (subTree != null) {
            setTitle(subTree.getCommonName());
            ivTree.setImageResource(subTree.getDrawable());
            tvScientificName.setText(subTree.getScientificName());

            final List<String> infos = new ArrayList<>();
            infos.add(subTree.getDescription());
            infos.add(subTree.getHabitat());
            infos.add(subTree.getCultivationDetails());
            infos.add(subTree.getOtherUsage());

            text.setText(infos.get(0));

            for (int i = 0; i < btnTabs.size(); i++) {
                final int index = i;

                btnTabs.get(i).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        view.setBackgroundResource(R.drawable.background_button_selected);
                        text.setText(infos.get(index));
                        resetViews(index);
                    }
                });
            }

            ivTree.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    DialogBuilder.showImagePreviewDialog(SingleTreeActivity.this, subTree.getDrawable());
                }
            });
        }
    }

    private void resetViews(int index) {

        for (int i = 0; i < btnTabs.size(); i++)
            if (i != index)
                btnTabs.get(i).setBackgroundResource(R.drawable.background_button_default);

    }


}
