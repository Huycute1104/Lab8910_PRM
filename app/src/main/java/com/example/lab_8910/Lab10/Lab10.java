package com.example.lab_8910.Lab10;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.lab_8910.Lab10.API.Activity.API;
import com.example.lab_8910.Lab9.Lab9;
import com.example.lab_8910.Lab9.RoomDatabase.RoomDatabase;
import com.example.lab_8910.R;

public class Lab10 extends AppCompatActivity {

    Button api;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lab10);
        api = findViewById(R.id.api);
        api.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lab10.this, API.class);
                startActivity(intent);
            }
        });
    }
}