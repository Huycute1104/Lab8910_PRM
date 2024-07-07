package com.example.lab_8910.Lab9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.lab_8910.Lab9.SQLite.SQLite;
import com.example.lab_8910.R;

public class Lab9 extends AppCompatActivity {
    Button sqlite, roomDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lab9);

        sqlite = findViewById(R.id.sqlite);
        roomDatabase = findViewById(R.id.room);

        sqlite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lab9.this, SQLite.class);
                startActivity(intent);
            }
        });

        roomDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lab9.this, RoomDatabase.class);
                startActivity(intent);
            }
        });

    }
}