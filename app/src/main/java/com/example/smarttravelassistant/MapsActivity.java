package com.example.smarttravelassistant;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MapsActivity extends AppCompatActivity {

    Button btnBack = findViewById(R.id.btnBack);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        btnBack.setOnClickListener(view -> {
            finish();  // Go back to the previous screen
        });
    }
}

