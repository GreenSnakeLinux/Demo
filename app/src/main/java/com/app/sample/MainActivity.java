package com.app.sample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.DocumentsContract;
import android.widget.Toast;

public class MainActivity extends Activity {

    public static final String EXTRA1 = "extra1";
    int m_demo = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switch (m_demo) {
            case 1:
                Intent myIntent = new Intent(this, Activity2.class);
                myIntent.putExtra(EXTRA1, "Hello activity 2");
                startActivity(myIntent);
                break;

            case 2:
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setType(DocumentsContract.Document.MIME_TYPE_DIR);
                    startActivity(intent);

                    finish();
                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
                }
                break;

            default:
                break;
        }
    }
}