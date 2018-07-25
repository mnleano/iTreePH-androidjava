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
public class TVNeueUltraLight extends TextView {

    public TVNeueUltraLight(Context context) {
        super(context);
        setTypeface(FontStyle.neueUltraLight(context));
    }

    public TVNeueUltraLight(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(FontStyle.neueUltraLight(context));
    }

    public TVNeueUltraLight(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(FontStyle.neueUltraLight(context));
    }

}