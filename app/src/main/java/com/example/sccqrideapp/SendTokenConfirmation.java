package com.example.sccqrideapp;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sccqrideapp.fragments.SendTokenActivity;

public class SendTokenConfirmation extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_token_confirmation);


        Button button = findViewById(R.id.backbtn);
        Button button1 = findViewById(R.id.button);

        button.setOnClickListener(v -> {
            Intent intent = new Intent(SendTokenConfirmation.this, SendTokenActivity.class);
            startActivity(intent);
        });

        button1.setOnClickListener(v -> {
            Intent intent = new Intent(SendTokenConfirmation.this, SendTokenReceipt.class);
            startActivity(intent);
        });
    }
}