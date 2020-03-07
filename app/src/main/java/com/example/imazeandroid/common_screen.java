package com.example.imazeandroid;

import android.media.MediaPlayer;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.VideoView;

public class common_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        String eventTitle=getIntent().getExtras().getString("ev");
        collapsingToolbarLayout.setTitle(eventTitle);
        final VideoView videoView;
        videoView = (VideoView)findViewById(R.id.toolbar_video);

        EventResourceMapper eventResourceMapper = new EventResourceMapper(eventTitle);

        String url = eventResourceMapper.getVideoURL();
        videoView.setVideoPath(url);
        videoView.start();
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });
    }
}
