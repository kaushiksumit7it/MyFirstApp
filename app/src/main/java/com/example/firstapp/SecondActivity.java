package com.example.firstapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    Button btn_go_to_pre;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //References (Press Ctrl + D to duplicate and Alt + Enter to show quick fixes for errors)-
        btn_go_to_pre = findViewById(R.id.btn_goToPreviousActivity);

        //OnClickListener for btn_go_to_pre-
        btn_go_to_pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent to previous (MainActivity) activity
                startActivity(new Intent(SecondActivity.this, MainActivity.class));
            }
        });

    }
}