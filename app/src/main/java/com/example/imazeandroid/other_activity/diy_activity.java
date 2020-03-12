package com.example.imazeandroid.other_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.os.Bundle;
import android.widget.TextView;

import com.example.imazeandroid.R;

public class diy_activity extends AppCompatActivity {
TextView t1;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diy);

        t1=findViewById(R.id.description);
        t1.setText("\tWhat's a budding engineer who doesn't apply what he/she learns. \"Do It Yourself\" gives the young school kids a chance to experience the engineers' way.\n\n" +
                "\tIMAZE'20 makes this possible by organizing various hands-on sessions that will let the kids experience the theories, that they would have only read about.\n\n" +
                "\tThis event focuses on bringing out the skills hidden in the students and lets them enjoy the real engineering way, of creating and innovating the society.");
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
        }
    }
}
