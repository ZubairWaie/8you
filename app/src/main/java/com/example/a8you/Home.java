package com.example.a8you;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Home extends AppCompatActivity {

    Button exersiceBtn, dietBtn, meditationBtn, trophyBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        exersiceBtn = (Button) findViewById(R.id.exercise);
        exersiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(Home.this, Exercise.class);
                startActivity(e);
            }
        });

        dietBtn = (Button) findViewById(R.id.diet);
        dietBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(Home.this, Diet.class);
                startActivity(d);
            }
        });

        meditationBtn = (Button) findViewById(R.id.meditation);
        meditationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(Home.this, Meditation.class);
                startActivity(m);
            }
        });

        trophyBtn = (Button) findViewById(R.id.trophy);
        trophyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent t = new Intent(Home.this, Trophy.class);
                startActivity(t);
            }
        });

    }
}