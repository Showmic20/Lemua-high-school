package com.example.lhs_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    LottieAnimationView animationView;
    TextView tv,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     setContentView(R.layout.activity_main);

        animationView = findViewById(R.id.lottie);
tv= findViewById(R.id.textid);
tv2=findViewById(R.id.textid2);
tv.animate().translationY(-225).setDuration(2700).setStartDelay(0);
        tv2.animate().translationY(-275).setDuration(3500).setStartDelay(0);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
Intent it = new Intent(MainActivity.this,Home.class);
startActivity(it);
finish();
            }
        },4000);


    }
}