package com.pwu.itree.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pwu.itree.R;
import com.pwu.itree.model.Tree;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SubTreesAdapter extends RecyclerView.Adapter<SubTreesAdapter.ViewHolder> {

    List<Tree> trees;
    OnItemClickListener listener;

    public SubTreesAdapter(List<Tree> trees, OnItemClickListener listener) {
        this.trees = trees;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_sub_trees, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Tree tree = trees.get(position);

        holder.tvCommonName.setText(tree.getCommonName());
        holder.tvScientificName.setText(tree.getScientificName());

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
        @BindView(R.id.tvCommonName)
        TextView tvCommonName;
        @BindView(R.id.tvScientificName)
        TextView tvScientificName;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

    public interface OnItemClickListener {
        void onItemClick(int id);
    }
}
