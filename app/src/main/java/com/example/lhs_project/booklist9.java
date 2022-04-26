package com.example.lhs_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class booklist9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booklist9);
        getSupportActionBar().setTitle("Class 9 books");
    }

    public void bangla1st(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/file/d/1dOQAVB6usKCoZ7_4HXYvPq7Eb16ihi1z/view")));
    }
}