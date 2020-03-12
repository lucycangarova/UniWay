package com.example.uniway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PhotoViewScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_view_screen);
    }

    public void startChallengeView(View view){
        Intent intent = new Intent(this, Challenge1Screen.class);
        startActivity(intent);
    }

    public void startBack(View view){
        Intent intent = new Intent(this, TourModeScreen.class);
        startActivity(intent);
    }
}
