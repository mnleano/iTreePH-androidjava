package com.pwu.itree.activity.tree;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.pwu.itree.R;
import com.pwu.itree.activity.BaseActivity;
import com.pwu.itree.adapter.FamilyTreesAdapter;
import com.pwu.itree.adapter.SubTreesAdapter;
import com.pwu.itree.data.DatabaseQueries;
import com.pwu.itree.model.Tree;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class TreesV2Activity extends BaseActivity implements FamilyTreesAdapter.OnItemClickListener, SearchView.OnQueryTextListener {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.searchView)
    SearchView searchView;
    @BindView(R.id.rv)
    RecyclerView rv;

    List<Tree> list;
    FamilyTreesAdapter adapter;

    @Override
    protected void onResume() {
        super.onResume();

        setContentView(R.layout.activity_trees_v2);
        ButterKnife.bind(this);

        initToolbar();
        initList();
        initListener();
    }

    private void initToolbar() {

        setSupportActionBar(toolbar, true);
        setTitle("Families");

    }

    private void initList() {
        list = DatabaseQueries.getFamilyTrees(this);
        adapter = new FamilyTreesAdapter(list, this);

        onConfigurationChanged(getResources().getConfiguration());
        checkOrientation();
        rv.setAdapter(adapter);
    }

    private void initListener() {

        searchView.setOnQueryTextListener(this);

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
    public void onItemClick(final int familyType) {
        final Dialog dialog = new Dialog(this);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        List<Tree> trees = DatabaseQueries.getSubTrees(this, familyType);
        SubTreesAdapter adapter = new SubTreesAdapter(trees, new SubTreesAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int id) {
                dialog.dismiss();
                Tree subTree = DatabaseQueries.getSubTree(TreesV2Activity.this, familyType, id);

                Bundle extras = new Bundle();
                extras.putParcelable("SubTree", subTree);

                startActivity(new Intent(TreesV2Activity.this, SingleTreeActivity.class)
                        .putExtras(extras));

            }
        });

        RecyclerView recyclerView = new RecyclerView(this);
        recyclerView.setAdapter(adapter);
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
            recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        else
            recyclerView.setLayoutManager(new LinearLayoutManager(this));

        dialog.setContentView(recyclerView);
        dialog.show();
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        Log.d("TAG_", "onQueryTextSubmit");
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        Log.d("TAG_", "onQueryTextChange");
        List<Tree> newList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getScientificName().toLowerCase().contains(newText))
                newList.add(list.get(i));
        }

        adapter = new FamilyTreesAdapter(newList, this);
        rv.setAdapter(adapter);
        return false;
    }
}
