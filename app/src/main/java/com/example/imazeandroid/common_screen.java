package com.example.imazeandroid;

import android.app.ProgressDialog;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.VideoView;

import java.util.List;

public class common_screen extends AppCompatActivity {

    ProgressDialog p;
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

        LoadData loadData = new LoadData();
        loadData.execute();


    }
    private class LoadData extends AsyncTask{
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            p = new ProgressDialog(common_screen.this);
            p.setMessage("Loading Data ...");
            p.setIndeterminate(false);
            p.setCancelable(false);
            p.show();
        }

        @Override
        protected Event doInBackground(Object[] objects) {
            SpreadSheetApi spreadSheetApi = new SpreadSheetApi(getApplicationContext(), "1vVa_nPyQEbVtdDL6zdnWZ8pgxBnGQhqFNuIxfUOCJ04");
            Event event = spreadSheetApi.getSheet();
            return event;
        }

        @Override
        protected void onPostExecute(Object o) {
            p.hide();
            Event event = (Event) o;
            Log.d("spreadsheet",event.getEvent_description());
            super.onPostExecute(o);
        }
    }
}
