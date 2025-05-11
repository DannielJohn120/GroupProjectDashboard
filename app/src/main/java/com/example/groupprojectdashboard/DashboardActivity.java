package com.example.groupprojectdashboard; // Replace with your actual package name

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class DashboardActivity extends AppCompatActivity {

    ImageButton btnForm, btnProfile, btnSettings, btnHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard); // Make sure the XML file is named activity_dashboard.xml

        // Connect buttons to their IDs
        btnForm = findViewById(R.id.btnForm);
        btnProfile = findViewById(R.id.btnProfile);
        btnSettings = findViewById(R.id.btnSettings);
        btnHelp = findViewById(R.id.btnHelp);

        // Button 1: Go to FormActivity
        btnForm.setOnClickListener(v -> {
            Intent intent = new Intent(DashboardActivity.this, TransferActivity.class);
            startActivity(intent);
        });

        // Button 2: Go to ProfileActivity (you can create this later)
        btnProfile.setOnClickListener(v -> {
            Intent intent = new Intent(DashboardActivity.this, BorrowActivity.class);
            startActivity(intent);
        });

        // Button 3: Go to SettingsActivity (you can create this later)
        btnSettings.setOnClickListener(v -> {
            Intent intent = new Intent(DashboardActivity.this, PendingActivity.class);
            startActivity(intent);
        });

        // Button 4: Go to HelpActivity (you can create this later)
        btnHelp.setOnClickListener(v -> {
            Intent intent = new Intent(DashboardActivity.this, ApproveActivity.class);
            startActivity(intent);
        });
    }
}
