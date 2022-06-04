package com.example.lhs_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class fullscreen11 extends AppCompatActivity {

    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen21);
        iv= findViewById(R.id.iamge_view1);
        Intent it= getIntent();
        int position = it.getExtras().getInt("id");
        imageadapter11 imageAdapter = new imageadapter11(this);
        iv.setImageResource(imageAdapter.imagerArray[position]);
    }
}