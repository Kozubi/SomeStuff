package com.example.marcin.somestuff;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;

/**
 * Created by marcin on 13.12.2016.
 */

public class MyButton extends Button implements View.OnClickListener {
    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBackgroundResource(R.drawable.button_red);
    }




    @Override
    public void onClick(View v) {
        Button mybtn = (Button) v;
        String selectedText = (String) mybtn.getText();
    }
}
