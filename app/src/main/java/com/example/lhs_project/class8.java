package com.example.lhs_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class class8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class8);
    }

    public void agoback(View view) {finish();
    }

    public void classeightbooklist(View view) {
        Intent it = new Intent(class8.this,eightbooklist.class);
        startActivity(it);
    }

    public void routine8(View view) {
        Intent intent = new Intent(class8.this ,eightroutine.class);
        startActivity(intent);
    }
}