package com.example.lhs_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class fullscreen extends AppCompatActivity {
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);
        iv= findViewById(R.id.iamge_view);
        Intent it= getIntent();
        int position = it.getExtras().getInt("id");
        ImageAdapter imageAdapter = new ImageAdapter(this);
        iv.setImageResource(imageAdapter.imagerArray[position]);
    }
}