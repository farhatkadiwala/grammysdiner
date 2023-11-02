package com.example.grammysdiner;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;

public class OnboardingActivity extends AppCompatActivity {

    Button buttonHome; // Declare the Button widget

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);

        // Initialize the Button widget by finding the view by ID
        buttonHome = findViewById(R.id.start_button);

        buttonHome.setOnClickListener(v -> {
            // Create an Intent to start the second activity
            Intent intent = new Intent(OnboardingActivity.this, HomeActivity.class);
            startActivity(intent);
        });
    }
}
