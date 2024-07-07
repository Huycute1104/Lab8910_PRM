package com.example.lab_8910;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.lab_8910.Lab10.Lab10;
import com.example.lab_8910.Lab8.Notification;
import com.example.lab_8910.Lab9.Lab9;

public class MainActivity extends AppCompatActivity {
    Button lab8, lab9 , lab10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        lab8 = findViewById(R.id.lab8);
        lab9 = findViewById(R.id.lab9);
        lab10 = findViewById(R.id.lab10);

        lab8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Notification.class);
                startActivity(intent);
            }
        });
        lab9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Lab9.class);
                startActivity(intent);
            }
        });
        lab10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Lab10.class);
                startActivity(intent);
            }
        });
    }
}