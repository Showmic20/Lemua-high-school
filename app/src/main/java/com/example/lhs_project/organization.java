package com.example.lhs_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class organization extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organization);
    }

    public void agoback(View view) {
        finish();
    }

    public void rover(View view) {
        Intent intent = new Intent(organization.this,scout.class);
        startActivity(intent);
    }

    public void red(View view) {
        Intent intent = new Intent(organization.this,redcresent.class);
        startActivity(intent);
    }

    public void debateclub(View view) {
        Intent intent = new Intent(organization.this,debateclub.class);
        startActivity(intent);
    }
}