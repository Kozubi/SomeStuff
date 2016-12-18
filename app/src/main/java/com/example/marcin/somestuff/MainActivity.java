
package com.example.marcin.somestuff;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.provider.MediaStore;
import android.speech.tts.TextToSpeech;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;
import java.util.Random;

import static android.speech.tts.TextToSpeech.*;

public class MainActivity extends AppCompatActivity {

    static int COUNTER = 0;
    TextView myText;
    TextToSpeech tts;
    LinearLayout mainLayout;
    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        mainGrid = (GridLayout) findViewById(R.id.main_grid);

        showToast("onCreate");

        Random rnd = new Random(9);
        rnd.nextInt();

        myText = (TextView) findViewById(R.id.txt1);
        mainLayout = (LinearLayout) findViewById(R.id.main);
        WebView webView = (WebView) findViewById(R.id.webView2);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://jw.org");



//        addStuff();
//        myText.setText(COUNTER);


    }



    public void changeText(int text){
        String newTxt = String.valueOf(text);
        Log.i("Counter", String.valueOf(COUNTER));
        myText.setText(newTxt);
        addStuff();
    }

    @Override
    protected void onStart() {
        super.onStart();
        showToast("onStart");

    }

    @Override
    protected void onPause() {
        super.onPause();
        showToast("onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        showToast("onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        showToast("onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showToast("onStop");
        Log.i("INFO", "onSTOP");


    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        showToast("onDestroy");
    }

    public void showToast(String text){
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode){
            case (KeyEvent.KEYCODE_VOLUME_DOWN):


            case (KeyEvent.KEYCODE_VOLUME_UP):
                COUNTER ++;
                changeText(COUNTER);
                break;

        }
        return true;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void resetCounter(View view){
        COUNTER = 0;
        changeText(COUNTER);

    }

    public void addStuff()
    {
//        mainLayout.addView(View.inflate(getApplicationContext(), R.layout.guziczek, null));
        MyLayout myl = new MyLayout(getApplicationContext(), null);
        mainLayout.addView(myl);
    }

    @Override
    public void onBackPressed() {
        finish();
    }

}
