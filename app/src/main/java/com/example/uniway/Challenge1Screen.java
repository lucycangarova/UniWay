package com.example.uniway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Challenge1Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge1_screen);
    }

    public void startBack(View view){
        Intent intent = new Intent(this, ChallengesScreen.class);
        startActivity(intent);
    }
}
