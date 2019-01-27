package com.example.mediaplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG          = MainActivity.class.getSimpleName();
    public static final int    MEDIA_RES_ID = R.raw.music;

    private TextView      textView;
    private SeekBar       seekBar;
    private ScrollView    scrollView;
    private PlayerAdapter playerAdapter;
    private boolean       userIsSeeking = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeUI();
        initializeSeekBar();
    }

    private void initializeSeekBar() {
        seekBar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    int userSelection = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser){
                    userSelection = progress;
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                userIsSeeking = true;
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                userIsSeeking = false;
                playerAdapter.seekTo(userSelection);
            }
        });
    }

    private void initializeUI() {
        textView = findViewById(R.id.text_debug);
        Button play = findViewById(R.id.button_play);
        Button pause = findViewById(R.id.button_pause);
        Button reset = findViewById(R.id.button_reset);
        seekBar = findViewById(R.id.seekbar_audio);
        scrollView = findViewById(R.id.scroll_container);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerAdapter.play();
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerAdapter.pause();
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerAdapter.reset();
            }
        });
    }
}
