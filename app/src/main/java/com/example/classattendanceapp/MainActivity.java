package com.example.classattendanceapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public static FragmentManager fragmentManager;

    EditText studentID, studentName, Password, Email;

    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();



        if (findViewById(R.id.FragmentContainer) != null) {
            if (savedInstanceState != null) {
                return;
            }

            FragmentTransaction ft = fragmentManager.beginTransaction();
            AttendanceFragment frag = new AttendanceFragment();
            ft.add(R.id.FragmentContainer, frag, null);
            ft.addToBackStack(null);
            ft.commit();
        }
//
        studentID = (EditText) findViewById(R.id.studentID);
        studentName = (EditText) findViewById(R.id.studentName);
//        Password = findViewById(R.id.password);
//        Email = findViewById(R.id.emailField);
        submitButton = (Button)findViewById(R.id.push_button);


    }

    public void addRecord(View view) {

            Intent myActivity = new Intent(this, ConfirmationPage.class);
            startActivity(myActivity);


    }
}
