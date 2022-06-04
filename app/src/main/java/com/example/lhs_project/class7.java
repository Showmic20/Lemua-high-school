package com.example.lhs_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class class7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class7);
    }

    public void agoback(View view) {finish();
    }

    public void class7booklist(View view) {
        Intent  it = new Intent(class7.this,sevenbooklist.class);
        startActivity(it);
    }

    public void routine7(View view) {
        Intent intent = new Intent(class7.this ,sevenroutine.class);
        startActivity(intent);
    }
}