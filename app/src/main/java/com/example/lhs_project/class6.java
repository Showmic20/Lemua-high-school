package com.example.lhs_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class class6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class6);
    }

    public void routine6(View view) {
        Intent intent = new Intent(class6.this ,sixroutine.class);
        startActivity(intent);
    }

    public void agoback(View view) {finish();
    }

    public void booklist(View view) {
        Intent it = new Intent(class6.this,class6booklist.class);
        startActivity(it);}
}