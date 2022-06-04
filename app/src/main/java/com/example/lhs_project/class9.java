package com.example.lhs_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class class9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class9);
    }



    public void book9(View view) {
        Intent intent = new Intent(class9.this ,booklist9.class);
        startActivity(intent);
    }

    public void routine9(View view) {
        Intent intent = new Intent(class9.this ,nineroutine.class);
        startActivity(intent);
    }

    public void agoback(View view) {finish();
    }


}