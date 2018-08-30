package com.pwu.itree.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.pwu.itree.R;
import com.pwu.itree.model.GameScore;

import java.util.List;

public class ScoreAdapter extends BaseAdapter {

    Context ctx;
    List<GameScore> scores;

    public ScoreAdapter(Context ctx, List<GameScore> scores) {
        this.ctx = ctx;
        this.scores = scores;
    }

    @Override
    public int getCount() {
        return scores.size();
    }

    @Override
    public Object getItem(int i) {
        return scores.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null)
            view = LayoutInflater.from(ctx).inflate(R.layout.row_score, viewGroup, false);

        GameScore score = scores.get(i);
        ((TextView) view.findViewById(R.id.tvName)).setText(score.getName());
        ((TextView) view.findViewById(R.id.tvScore)).setText(String.valueOf(score.getScore()));
        return view;
    }
}
