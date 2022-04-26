package com.example.lhs_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class headmaster extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_headmaster);





    }

    public void praktonheadmaster(View view) {
        Intent intent = new Intent(headmaster.this,teachersprofile.class);
        startActivity(intent);
    }
}