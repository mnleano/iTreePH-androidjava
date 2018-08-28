package com.pwu.itree.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.pwu.itree.R;
import com.pwu.itree.activity.Tree;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FamilyTreesAdapter extends RecyclerView.Adapter<FamilyTreesAdapter.ViewHolder> {

    List<Tree> trees;
    OnItemClickListener listener;

    public FamilyTreesAdapter(List<Tree> trees, OnItemClickListener listener) {
        this.trees = trees;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_family_trees, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Tree tree = trees.get(position);

        holder.tvTree.setText(tree.getScientificName());
        holder.ivTree.setImageResource(tree.getDrawable());
        holder.container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClick(tree.getId());
            }
        });
    }

    @Override
    public int getItemCount() {
        return trees.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.container)
        CardView container;
        @BindView(R.id.tvTree)
        TextView tvTree;
        @BindView(R.id.ivTree)
        ImageView ivTree;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    public interface OnItemClickListener {
        void onItemClick(int id);
    }
}
