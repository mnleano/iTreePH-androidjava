package com.pwu.itree.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.pwu.itree.R;
import com.pwu.itree.builder.DialogBuilder;
import com.pwu.itree.data.DatabaseHelper;
import com.pwu.itree.widgets.TextViewMed;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FamilyTreeActivity extends BaseActivity {
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.ivTree)
    ImageView ivTree;
    @BindView(R.id.tvCommonName)
    TextViewMed tvCommonName;
    @BindView(R.id.tvDescription)
    TextView tvDescription;

    int familyType;
    Tree tree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_tree);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar, true);

        initData();

    }

    private void initData() {

        familyType = getIntent().getIntExtra("familyType", 0);
        tree = DatabaseHelper.getFamilyTree(this, familyType);

        setTitle(tree.getScientificName());
        ivTree.setImageResource(tree.getDrawable());
        tvCommonName.setText(tree.getScientificName());
        tvDescription.setText(tree.getDescription());

    }

    @OnClick(R.id.ivTree)
    public void onViewClicked() {

        DialogBuilder.showImagePreviewDialog(this, tree.getDrawable());
    }
}
