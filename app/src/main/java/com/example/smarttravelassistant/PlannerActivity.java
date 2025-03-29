package com.example.smarttravelassistant;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlannerActivity extends AppCompatActivity {

    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planner);

        btnBack = findViewById(R.id.btnBack);

        // Back to Main Screen
        btnBack.setOnClickListener(view -> {
            finish();
        });
    }
}

