package com.pwu.itree.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.pwu.itree.utils.FontStyle;


@SuppressLint("AppCompatCustomView")
public class TextViewLightItalic extends TextView {

    public TextViewLightItalic(Context context) {
        super(context);
        setTypeface(FontStyle.lightItalic(context));
    }

    public TextViewLightItalic(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(FontStyle.lightItalic(context));
    }

    public TextViewLightItalic(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(FontStyle.lightItalic(context));
    }

}