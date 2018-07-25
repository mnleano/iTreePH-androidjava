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
public class TVNeueMedium extends TextView {

    public TVNeueMedium(Context context) {
        super(context);
        setTypeface(FontStyle.neueMedium(context));
    }

    public TVNeueMedium(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(FontStyle.neueMedium(context));
    }

    public TVNeueMedium(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(FontStyle.neueMedium(context));
    }

}