package com.pwu.itree.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.pwu.itree.R;
import com.pwu.itree.adapter.FamilyTreesAdapter;
import com.pwu.itree.data.DatabaseQueries;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class TreesV2Activity extends BaseActivity implements FamilyTreesAdapter.OnItemClickListener {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.rv)
    RecyclerView rv;

    List<Tree> list;
    FamilyTreesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trees_v2);
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
        list = DatabaseQueries.getFamilyTrees(this);
        adapter = new FamilyTreesAdapter(list, this);


        onConfigurationChanged(getResources().getConfiguration());

        checkOrientation();
        rv.setAdapter(adapter);
    }

    private void checkOrientation() {
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
            rv.setLayoutManager(new GridLayoutManager(this, 2));
        else
            rv.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE)
            rv.setLayoutManager(new GridLayoutManager(this, 2));
        else
            rv.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onItemClick(int id) {
        startActivity(new Intent(this, FamilyTreeActivity.class).putExtra("familyType", id));
    }
}
