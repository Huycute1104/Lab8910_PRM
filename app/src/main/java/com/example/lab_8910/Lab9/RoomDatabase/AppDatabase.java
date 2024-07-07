package com.example.lab_8910.Lab9.RoomDatabase;


import androidx.room.Database;
import androidx.room.RoomDatabase;
@Database(entities = {Person.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract PersonDao personDao();
}
