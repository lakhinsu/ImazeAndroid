package com.example.imazeandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class common extends AppCompatActivity {
    private TextView event_title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comman);
        event_title=findViewById(R.id.e_title);
        String s=getIntent().getExtras().getString("ev");
        event_title.setText(s);
    }
}
