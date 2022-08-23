package com.example.a8you;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    TextView RLogin;
    Button registerUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        RLogin = (TextView) findViewById(R.id.RLogIn);
        registerUser = (Button) findViewById(R.id.registerUser);

        RLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent RL = new Intent(Register.this, Login.class);
                startActivity(RL);
            }
        });

        registerUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent RU = new Intent(Register.this, Login.class);
                startActivity(RU);
            }
        });
    }
}