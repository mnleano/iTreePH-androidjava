package com.pwu.itree.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

import com.pwu.itree.utils.FontStyle;


/**
 * Created by mykelneds on 15/01/2017.
 */

@SuppressLint("AppCompatCustomView")
public class ButtonLight extends Button {

    public ButtonLight(Context context) {
        super(context);
        setTypeface(FontStyle.helveticaLight(context));
    }

    public ButtonLight(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(FontStyle.helveticaLight(context));
    }

    public ButtonLight(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(FontStyle.helveticaLight(context));
    }

}