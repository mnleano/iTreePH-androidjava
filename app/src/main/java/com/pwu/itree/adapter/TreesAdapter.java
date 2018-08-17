package com.pwu.itree.adapter;

import android.content.Context;
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

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TreesAdapter extends RecyclerView.Adapter<TreesAdapter.ViewHolder> {

    String TAG = "TAG_TreesAdapter";

    Context ctx;
    List<Tree> list;
    OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(int id);
    }

    public TreesAdapter(Context ctx, List<Tree> list, OnItemClickListener listener) {
        this.ctx = ctx;
        this.list = list;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_trees, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {

        final Tree tree = list.get(position);

        holder.ivTree.setImageResource(tree.getDrawable());

        if (tree.getCommonName().equals("")) {
            holder.tvCommonName.setText(tree.getScientificName());
            holder.tvScientificName.setVisibility(View.GONE);
        } else {
            holder.tvCommonName.setText(tree.getCommonName());
            holder.tvScientificName.setText(tree.getScientificName());
        }
        holder.container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onItemClick(tree.getId());
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.container)
        CardView container;
        @BindView(R.id.ivTree)
        ImageView ivTree;
        @BindView(R.id.tvCommonName)
        TextView tvCommonName;
        @BindView(R.id.tvScientificName)
        TextView tvScientificName;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

//    class ViewHolder {
//        @BindView(R.id.ivTree)
//        ImageView ivTree;
//        @BindView(R.id.tvTreeName)
//        TextView tvTreeName;
//
//        ViewHolder(View view) {
//            ButterKnife.bind(this, view);
//        }
//    }
}
