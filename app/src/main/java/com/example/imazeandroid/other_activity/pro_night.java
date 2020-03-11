package com.example.imazeandroid.other_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.os.Bundle;
import android.widget.TextView;

import com.example.imazeandroid.R;

import org.w3c.dom.Text;

public class pro_night extends AppCompatActivity {
TextView t1;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro_night);

        t1=findViewById(R.id.description);
        t1.setText("\tMusic, once admitted to the soul becomes a spirit and never dies.\n\n" +
                "\tIMAZE '20 brings you the ultimate captivating fiesta, an electrifying PRO-NIGHT to revel. Hold fast your zestful spirit, swing into some infectious tunes and get ready to witness the dazzling live musical performance.\n\n" +
                "\tSo, don't fail to hit the delightful musical bash on IMAZE eve.\n\n");
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setHomeButtonEnabled(true);
        }
    }
}
