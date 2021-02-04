package com.app.sample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import static com.app.sample.MainActivity.EXTRA1;

public class Activity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // Call parent function onCreate in class Activity
        setContentView(R.layout.activity_2); // View displayed on Activity2 creation, use the activity_2.xml file containing the graphical elements

        TextView hello = findViewById(R.id.textActivity2); // Get the id of TextView called textActivity2 in the xml activity_2.xml
        String extra = getIntent().getStringExtra(EXTRA1); // Get the value of the Tag EXTRA1
        hello.setText(extra); // Set the text in the TextView
    }
}