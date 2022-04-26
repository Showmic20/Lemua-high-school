package com.example.lhs_project;

import androidx.appcompat.app.AppCompatActivity;

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
        Toast.makeText(getApplication(),"৯ম শ্রেনীর বই ডাউনলোড করুন",Toast.LENGTH_SHORT).show();
    }
}