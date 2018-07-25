package com.pwu.itree.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

import com.pwu.itree.utils.FontStyle;


@SuppressLint("AppCompatCustomView")
public class EditTextNeue extends EditText {

    public EditTextNeue(Context context) {
        super(context);
        setTypeface(FontStyle.neue(context));
        setMaxLines(1);
    }

    public EditTextNeue(Context context, AttributeSet attrs) {
        super(context, attrs);
        setTypeface(FontStyle.neue(context));
        setMaxLines(1);
    }

    public EditTextNeue(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(FontStyle.neue(context));
        setMaxLines(1);
    }

}