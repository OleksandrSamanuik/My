package com.example.threeactivitiesdemo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnFirst = findViewById(R.id.btnFirst);
        Button btnSecond = findViewById(R.id.btnSecond);

        btnFirst.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FirstActivity.class);
            startActivity(intent);
        });

        btnSecond.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        });
    }
}