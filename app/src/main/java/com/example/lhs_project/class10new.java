package com.example.lhs_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class class10new extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class10new);
    }
    public void class10new(View view) {
        Toast.makeText(getApplication(),"৯ম শ্রেনীর বই দেখুন",Toast.LENGTH_SHORT).show();
    }

    public void agoback(View view) {finish();
    }

    public void newtenroutine(View view) {
        Intent intent = new Intent(class10new.this ,newtenroutine.class);
        startActivity(intent);
    }
}