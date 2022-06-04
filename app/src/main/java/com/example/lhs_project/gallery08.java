package com.example.lhs_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

public class gallery08 extends AppCompatActivity {


    GridView grid_view1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galley07);
        grid_view1=findViewById(R.id.grid_view1);
        grid_view1.setAdapter(new imageadapter07(this));
        grid_view1.setOnItemClickListener(new  AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),fullscreen07.class);
                intent.putExtra("id",position);
                startActivity(intent);
            }
        });
    }
}