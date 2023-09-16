package com.example.pomodoro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageButton;

public class StopWatch extends AppCompatActivity {

    private Chronometer mChronometer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop_watch);

        mChronometer = (Chronometer) findViewById(R.id.chronometer);

        ImageButton backmain = (ImageButton) findViewById(R.id.back);
        Button startwatch = (Button) findViewById(R.id.start_watch);
        Button stopwatch = (Button) findViewById(R.id.stop_watch);
        Button resetwatch = (Button) findViewById(R.id.reset_watch);

        backmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });

        startwatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mChronometer.setBase(SystemClock.elapsedRealtime());
                mChronometer.start();

            }
        });

        stopwatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mChronometer.stop();

            }
        });

        resetwatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mChronometer.stop();
                mChronometer.setBase(SystemClock.elapsedRealtime());

            }
        });

    }
}
