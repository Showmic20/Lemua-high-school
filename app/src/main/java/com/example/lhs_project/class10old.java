package com.example.lhs_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class class10old extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class10old);
    }



    public void old10(View view) {
        Toast.makeText(getApplication(),"৯ম শ্রেনীর বই ডাউনলোড করুন",Toast.LENGTH_SHORT).show();
    }

}