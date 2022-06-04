package com.example.lhs_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class fullscreen18 extends AppCompatActivity {

    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen18);
        iv= findViewById(R.id.iamge_view1);
        Intent it= getIntent();
        int position = it.getExtras().getInt("id");
        imageadapter19 imageAdapter = new imageadapter19(this);
        iv.setImageResource(imageAdapter.imagerArray[position]);
    }
}