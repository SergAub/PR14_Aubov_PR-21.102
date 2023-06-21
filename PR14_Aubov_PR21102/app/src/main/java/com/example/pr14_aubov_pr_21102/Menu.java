package com.example.pr14_aubov_pr_21102;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void GoToExercise(View view){
        Intent intent = new Intent(this, Exercise.class);
        startActivity(intent);
    }

    public void GoToStatistics(View view){
        Intent intent = new Intent(this, Statistics.class);
        startActivity(intent);
    }
}