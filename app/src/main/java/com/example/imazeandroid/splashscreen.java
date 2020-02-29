package com.example.imazeandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.VideoView;

public class splashscreen extends AppCompatActivity {
    private VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        videoView = findViewById(R.id.video);
        Uri Vid = Uri.parse("android.resource://"+getOpPackageName()+"/"+R.raw.finalsplash);
        videoView.setVideoURI(Vid);
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                startActivity(new Intent(splashscreen.this, home_activity.class));
                finish();
            }
        });
        videoView.start();
    }
}
