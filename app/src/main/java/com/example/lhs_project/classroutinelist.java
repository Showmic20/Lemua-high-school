package com.example.lhs_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class classroutinelist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classroutinelist);

    }

    public void class9(View view) {
        Intent intent = new Intent(classroutinelist.this ,class9.class);
        startActivity(intent);
    }

    public void classtennew(View view) {
        Intent intent = new Intent(classroutinelist.this ,class10new.class);
        startActivity(intent);
    }

    public void classtenold(View view) {
        Intent intent = new Intent(classroutinelist.this ,class10old.class);
        startActivity(intent);
    }
}