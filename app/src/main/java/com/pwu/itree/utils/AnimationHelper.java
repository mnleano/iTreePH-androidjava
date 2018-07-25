package com.pwu.itree.utils;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;

import com.pwu.itree.R;

/**
 * Created by mleano on 2/10/2016.
 */
public class AnimationHelper {

    private Animation anim;
    private Context ctx;


    public AnimationHelper(Context ctx) {
        this.ctx = ctx;
    }

    private Animation getAnimation(int animRes) {
        return AnimationUtils.loadAnimation(ctx, animRes);
    }

    private void startAnimation(View v){
        v.startAnimation(anim);
    }

    private void startAnimationSet(View v, Animation anim){
        v.startAnimation(anim);
    }
    // - - - - - - - - - - - - - - - -

    public void zoomIn(View view) {
        anim = AnimationUtils.loadAnimation(ctx, R.anim.shake);
        view.startAnimation(anim);
    }

    public void zoomOut(View view) {

        anim = AnimationUtils.loadAnimation(ctx, R.anim.zoom_out);
        view.startAnimation(anim);

    }

    public void fadeIn(View view) {

        anim = AnimationUtils.loadAnimation(ctx, R.anim.fade_in);
        view.startAnimation(anim);
    }

    public void fadeIn(View view, final AnimationListener listener) {
        anim = getAnimation(R.anim.fade_in);
        anim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                listener.onAnimationEnd();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        startAnimation(view);
    }

    public void hybrid(View view){
        AnimationSet set = new AnimationSet(false);
        set.addAnimation(getAnimation(R.anim.fade_in));
        set.addAnimation(getAnimation(R.anim.slide_left));
        startAnimationSet(view, set);
    }

    public void fadeOut(View view) {

        anim = AnimationUtils.loadAnimation(ctx, R.anim.fade_out);
        view.startAnimation(anim);
    }

    public void slideUp(View view) {

        anim = AnimationUtils.loadAnimation(ctx, R.anim.slide_up);
        view.startAnimation(anim);
    }

    public void slideDown(View view) {

        anim = AnimationUtils.loadAnimation(ctx, R.anim.slide_down);
        view.startAnimation(anim);
    }

    public void clockwise(View view) {
        anim = AnimationUtils.loadAnimation(ctx, R.anim.clockwise);
        view.startAnimation(anim);
    }

    public void counter(View view) {
        anim = AnimationUtils.loadAnimation(ctx, R.anim.counter_clockwise);
        view.startAnimation(anim);
    }

    public interface AnimationListener {
        void onAnimationEnd();
    }

}
