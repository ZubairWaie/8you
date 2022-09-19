package com.example.a8you;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Profile extends AppCompatActivity {

    public Button editButton;
    public TextView username, weight, height, age, gender, bmi;
    User.genderEnum genderData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        setDetails();
        // Initialize and assign variable
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);

        // Set Home selected
        bottomNavigationView.setSelectedItemId(R.id.about);

        // Perform item selected listener
        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId())
                {
                    case R.id.dashboard:
                        startActivity(new Intent(getApplicationContext(),HistoryActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.about:
                        return true;
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(),Home.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
//
//        Button testBtn = (Button)findViewById(R.id.testBtn);
//
//        testBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent a = new Intent(Profile.this, Home.class);
//                startActivity(a);
//            }
//        });

        editButton = (Button) findViewById(R.id.goToEdit);
        editButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(Profile.this, profileEdit.class);
                startActivity(e);
            }
        });



    }

    private void setDetails(){
//        username = (TextView) findViewById(R.id.username);
//        weight = (TextView) findViewById(R.id.weight);
//        height = (TextView) findViewById(R.id.height);
//        age = (TextView) findViewById(R.id.age);
//        gender = (TextView) findViewById(R.id.gender);
//        bmi = (TextView) findViewById(R.id.bmi);
//
//        User user = new User();
//        username.setText(user.username);
//        weight.setText(user.weight);
//        height.setText(user.height);
//        age.setText(user.age);
//        gender.setText(String.valueOf(genderData));
//        bmi.setText((int) user.setBmi());
    }
}