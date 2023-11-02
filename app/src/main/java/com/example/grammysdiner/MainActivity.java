package com.example.grammysdiner;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int delayMillis = 3000; // 3000 milliseconds (3 seconds) delay

        new Handler().postDelayed(() -> {
            // Create an Intent to start the second activity
            Intent intent = new Intent(MainActivity.this, OnboardingActivity.class);
            startActivity(intent);
            finish(); // Optionally, you can finish the current activity
        }, delayMillis);
    }
}
