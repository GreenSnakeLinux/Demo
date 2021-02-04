package com.app.sample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.DocumentsContract;
import android.widget.Toast;

public class MainActivity extends Activity {

    public static final String EXTRA1 = "extra1"; // Tag to pass in Intent to retrieve the value
    int m_demo = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // Call parent function onCreate in class Activity
        setContentView(R.layout.activity_main); // View displayed on MainActivity creation, use the activity_main.xml file containing the graphical elements

        switch (m_demo) {
            case 1:
                // Create an Intent to call the class Activity2
                Intent myIntent = new Intent(this, Activity2.class);
                // Pass in parameter the Tag/value used by the class Activity2
                myIntent.putExtra(EXTRA1, "Hello activity 2"); // EXTRA1 is a Tag and can be anything, it will be use Activity2 to get the value.
                startActivity(myIntent); // Start the Activity define in the Intent (Activity2)
                break;

            case 2:
                try {
                    // Create an Intent with the action to perform
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    // It will list all activity that handle the type 'Directory' : Meaning a file manager
                    intent.setType(DocumentsContract.Document.MIME_TYPE_DIR);
                    startActivity(intent); // Start the Activity define in the Intent, if several, the user will choose

                    finish(); // Finish current activity
                } catch (Exception e) {
                    // Catch any exception in case there is no Activity that can handle the managing of directory
                    e.printStackTrace();
                    // Toast: Display a message to the user
                    Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
                }
                break;

            default:
                // Nothing, it will just display the layout activity_main.xml
                break;
        }
    }
}