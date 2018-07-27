package com.pwu.itree.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.pwu.itree.R;
import com.pwu.itree.adapter.TreesAdapter;
import com.pwu.itree.data.DatabaseHelper;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TreesActivity extends BaseActivity implements TreesAdapter.OnItemClickListener {


    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.rv)
    RecyclerView rv;

    TreesAdapter adapter;
    List<Tree> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trees);
        ButterKnife.bind(this);

        initToolbar();
        initList();
    }

    private void initToolbar() {

        setSupportActionBar(toolbar, true);
        setTitle("Families");

//        Objects.requireNonNull(getActionBar()).setDisplayHomeAsUpEnabled(true);

    }

    private void initList() {
        list = DatabaseHelper.getFamilyTrees(this);
        adapter = new TreesAdapter(this, list, this);


        onConfigurationChanged(getResources().getConfiguration());

        checkOrientation();
        rv.setAdapter(adapter);
    }

    private void checkOrientation() {
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
            rv.setLayoutManager(new GridLayoutManager(this, 3));
        else
            rv.setLayoutManager(new GridLayoutManager(this, 2));
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE)
            rv.setLayoutManager(new GridLayoutManager(this, 3));
        else
            rv.setLayoutManager(new GridLayoutManager(this, 2));
    }

    @Override
    public void onItemClick(int id) {
        startActivity(new Intent(this, FamilyTreeActivity.class).putExtra("familyType", id));
    }
}
