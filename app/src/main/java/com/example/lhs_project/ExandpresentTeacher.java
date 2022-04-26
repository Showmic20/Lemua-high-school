package com.example.lhs_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ExandpresentTeacher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exandpresent_teacher);
    }

    public void bortomanteacher(View view) {
Intent it = new Intent(ExandpresentTeacher.this,all_teacher_profile.class);
startActivity(it);

    }
}