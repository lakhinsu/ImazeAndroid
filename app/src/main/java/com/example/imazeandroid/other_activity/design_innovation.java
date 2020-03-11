package com.example.imazeandroid.other_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.os.Bundle;
import android.widget.TextView;

import com.example.imazeandroid.R;

public class design_innovation extends AppCompatActivity {
TextView t1;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design_innovation);

        t1=findViewById(R.id.description);
        t1.setText("\tWhat is the point of doing anything if one cannot explore through it all?\n\n" +
                "\tThis maiden event calls up the students to tread on the path of research and provide them with a platform to get experience in presenting the research paper.\n\n" +
                "\tIt calls the young research minds to bring up their treasure of knowledge for the world to appreciate.\n\n" +
                "\tIt is an event to recognize the researchers and their work and provide them with an opportunity to showcase their work.\n");
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
        }
    }
}
