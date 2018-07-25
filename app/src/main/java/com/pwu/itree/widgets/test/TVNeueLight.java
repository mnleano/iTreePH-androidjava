package com.pwu.itree.widgets.test;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.pwu.itree.utils.FontStyle;


/**
 * Created by mykelneds on 15/01/2017.
 */

@SuppressLint("AppCompatCustomView")
public class TVNeueLight extends TextView {

    public TVNeueLight(Context context) {
        super(context);
        setTypeface(FontStyle.neueLight(context));
    }

    public TVNeueLight(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(FontStyle.neueLight(context));
    }

    public TVNeueLight(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(FontStyle.neueLight(context));
    }

}