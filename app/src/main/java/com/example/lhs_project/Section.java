package com.example.lhs_project;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Section extends AppCompatActivity {
Dialog dialog;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section);

        button = findViewById(R.id.abouts);

button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Section.this,science.class);
        startActivity(intent);
    }
});

    }

    public void buisness(View view) {
        Intent intent = new Intent(Section.this,Commarce.class);
        startActivity(intent);
    }

    public void humanities(View view) {
        Intent intent = new Intent(Section.this,arts.class);
        startActivity(intent);
    }

    public void goback(View view) {
        finish();
    }
}