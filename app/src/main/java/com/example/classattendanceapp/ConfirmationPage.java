package com.example.classattendanceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ConfirmationPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation_page);
    }

    public void addRecord(View view) {
        Intent myActivity = new Intent(this, ConfirmationPage.class);
        startActivity(myActivity);
    }
}
