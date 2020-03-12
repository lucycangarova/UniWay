package com.example.uniway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class ARViewScreen extends AppCompatActivity {

    //create class reference
    VideoView vid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arview_screen);

        vid = (VideoView)findViewById(R.id.videoView3);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.tour_video);
        vid.setVideoURI(uri);
        vid.start();
        vid.setOnPreparedListener (new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

    }

    public void clickOnVideo(View v) {
        Intent intent = new Intent(this, PhotoViewScreen.class);
        startActivity(intent);
    }

    public void startBack(View view){
        Intent intent = new Intent(this, TourModeScreen.class);
        startActivity(intent);
    }
}
