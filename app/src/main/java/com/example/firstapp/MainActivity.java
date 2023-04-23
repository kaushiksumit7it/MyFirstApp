package com.example.firstapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //3 buttons-
    Button btn_go_to_next, btn_send, btn_delete;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //References (Press Ctrl + D to duplicate and Alt + Enter to show quick fixes for errors)-
        btn_go_to_next = findViewById(R.id.btn_goToNextActivity);
        btn_send = findViewById(R.id.btn_makeToastSend);
        btn_delete = findViewById(R.id.btn_makeToastDelete);

        //OnClickListener for btn_go_to_next-
        btn_go_to_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent to next activity
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });

        //OnClickListener for btn_send-
        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast
                Toast.makeText(MainActivity.this, "Sended! Dummy App but First App", Toast.LENGTH_SHORT).show();
            }
        });

        //OnClickListener for btn_delete-
        btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast
                Toast.makeText(MainActivity.this, "Deleted! Dummy App but First App", Toast.LENGTH_SHORT).show();
            }
        });

    }
}