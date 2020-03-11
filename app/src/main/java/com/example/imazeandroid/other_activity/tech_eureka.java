package com.example.imazeandroid.other_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.os.Bundle;
import android.widget.TextView;

import com.example.imazeandroid.R;

public class tech_eureka extends AppCompatActivity {
TextView t1;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech_eureka);

        t1=findViewById(R.id.description);
        t1.setText("IMAZE\\'20 is back with the ultimate event for the project competition, \"Tech Eureka-Concurs of Innovation\".\\n\n" +
                "        It is a platform for all third and fourth-year engineering students to showcase their creativity and hard work.\\n\n" +
                "        It is an unmissable experience for the students to put up their projects and have their talent be paid off by getting the chance to win spectacular prizes.\\n\n" +
                "        The event calls forth all the students to present them with a chance to experience the thrill of getting their ideas acknowledged and be called revolutionizing innovators.\\n");
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
        }
    }
}
