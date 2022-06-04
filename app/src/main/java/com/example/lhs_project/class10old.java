package com.example.lhs_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        Toast.makeText(getApplication(),"৯ম শ্রেনীর বই দেখুন ",Toast.LENGTH_SHORT).show();
    }

    public void agoback(View view) {finish();
    }

    public void class10routine(View view) {
        Intent intent = new Intent(class10old.this ,tenroutine.class);
        startActivity(intent);
    }
}