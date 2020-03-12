package com.example.uniway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TourModeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_mode_screen);
    }

    public void startARview(View view){
        Intent intent = new Intent(this, ARViewScreen.class);
        startActivity(intent);
    }
    public void startBack(View view){
        Intent intent = new Intent(this, MenuScreen.class);
        startActivity(intent);
    }
}
