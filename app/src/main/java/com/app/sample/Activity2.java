package com.app.sample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import static com.app.sample.MainActivity.EXTRA1;

public class Activity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        TextView hello = findViewById(R.id.textActivity2);
        String extra = getIntent().getStringExtra(EXTRA1);
        hello.setText(extra);
    }
}