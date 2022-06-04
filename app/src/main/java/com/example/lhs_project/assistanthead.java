package com.example.lhs_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class assistanthead extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assistanthead);
    }

    public void presentassishead(View view) {
        Intent intent = new Intent(assistanthead.this,PassisHead.class);
        startActivity(intent);
    }

    public void agoback(View view) {finish();
    }
}