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
import android.widget.TextView;
import android.widget.VideoView;

import org.w3c.dom.Text;

import java.util.List;

public class common_screen extends AppCompatActivity {

    ProgressDialog p;
    TextView eventInfo;
    String sheetid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        eventInfo = (TextView) findViewById(R.id.eventinfo);
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

        sheetid = eventResourceMapper.getSheetID();


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
            SpreadSheetApi spreadSheetApi = new SpreadSheetApi(getApplicationContext(), sheetid);
            Event event = spreadSheetApi.getSheet();
            return event;
        }

        @Override
        protected void onPostExecute(Object o) {
            p.hide();
            Event event = (Event) o;
            Log.d("spreadsheet",event.getEvent_title());
            String info = "";

            //Add Description
            info += "Description\n\n";
            info += "\t\t\t" + event.getEvent_description();
            info += "\n\n";

            info += "Rounds\n\n";

            //Add Rounds Info
            for(int i=0; i<event.getRounds_info().size();i++){
                info += ("Round " + (i+1) + "\n\n");
                info += ("\t\t\t" + event.getRounds_info().get(i) + "\n\n");
            }
            info += "\n\n";

            //Add Judgement Criteria
            info += "Judgement Criteria\n\n";
            for(int i=0; i<event.getJudgement_criteria().size();i++){
                info += ("Round " + (i+1) + "\n\n");
                info += ("\t\t\t"+event.getJudgement_criteria().get(i) + "\n\n");
            }
            info += "\n\n";

            //Add Team Size
            info += "Team Size\n";
            info += "\t\t\t"+event.getTeam_size();
            info += "\n\n";

            //Add Coordinators info
            info += "Event Coordinators\n";
            for(int i=0;i<event.getCoordinators_info().size();i++){
                info += ("\t\t" + (i+1) + "." + event.getCoordinators_info().get(i) + "\n");
            }

            eventInfo.setText(info);
            super.onPostExecute(o);
        }
    }
}
