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
public class ButtonMed extends Button {

    public ButtonMed(Context context) {
        super(context);
        setTypeface(FontStyle.helveticaMed(context));
    }

    public ButtonMed(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(FontStyle.helveticaMed(context));
    }

    public ButtonMed(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(FontStyle.helveticaMed(context));
    }

}