package com.example.marcin.somestuff;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.zip.Inflater;

/**
 * Created by marcin on 08.12.2016.
 */

public class MyLayout extends LinearLayout
{


    public MyLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        inflate(context, R.layout.guziczek, null);
    }
}
