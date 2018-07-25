package com.pwu.itree.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.pwu.itree.utils.FontStyle;


@SuppressLint("AppCompatCustomView")
public class TextViewMed extends TextView {

    public TextViewMed(Context context) {
        super(context);
        setTypeface(FontStyle.helveticaMed(context));
    }

    public TextViewMed(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(FontStyle.helveticaMed(context));
    }

    public TextViewMed(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(FontStyle.helveticaMed(context));
    }

}