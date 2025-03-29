package com.example.smarttravelassistant;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnPlanner, btnMaps, btnWeather, btnExpenses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize buttons
        btnPlanner = findViewById(R.id.btnPlanner);
        btnMaps = findViewById(R.id.btnMaps);
        btnWeather = findViewById(R.id.btnWeather);
        btnExpenses = findViewById(R.id.btnExpenses);

        // Navigate to Planner Screen
        btnPlanner.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, PlannerActivity.class);
            startActivity(intent);
        });



        // Navigate to Weather Screen
        btnWeather.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, WeatherActivity.class);
            startActivity(intent);
        });

        // Navigate to Expenses Screen
        btnExpenses.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ExpensesActivity.class);
            startActivity(intent);
        });
    }
}
