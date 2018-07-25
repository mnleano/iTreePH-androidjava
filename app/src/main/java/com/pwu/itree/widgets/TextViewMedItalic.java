package com.pwu.itree.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.pwu.itree.utils.FontStyle;


@SuppressLint("AppCompatCustomView")
public class TextViewMedItalic extends TextView {

    public TextViewMedItalic(Context context) {
        super(context);
        setTypeface(FontStyle.mediumItalic(context));
    }

    public TextViewMedItalic(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(FontStyle.mediumItalic(context));
    }

    public TextViewMedItalic(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(FontStyle.mediumItalic(context));
    }

}