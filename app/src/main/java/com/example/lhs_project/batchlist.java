package com.example.lhs_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class batchlist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batchlist);

    }


    public void agobackb(View view) {
        finish();
    }

    public void batch1990(View view) {
        Intent intent = new Intent(batchlist.this,gellary.class);
        startActivity(intent);
    }

    public void batch91(View view) {

    Intent intent = new Intent(batchlist.this,gallery91.class);
    startActivity(intent);}

    public void batch21(View view) {
        Intent intent = new Intent(batchlist.this,gallery21.class);
        startActivity(intent);}

    public void batch20(View view) {

        Intent intent = new Intent(batchlist.this,gallery20.class);
        startActivity(intent);
    }

    public void batch18(View view) {
        Intent intent = new Intent(batchlist.this,gallery19.class); //actually this is batch 18
        startActivity(intent);
    }


    public void batch17(View view) {
        Intent intent = new Intent(batchlist.this,gallery17.class);
        startActivity(intent);

    }

    public void batch16(View view) {
        Intent intent = new Intent(batchlist.this,gallery16.class);
        startActivity(intent);
    }

    public void batch15(View view) {
        Intent intent = new Intent(batchlist.this,gallery15.class);
        startActivity(intent);
    }
    public void batch14(View view) {
        Intent intent = new Intent(batchlist.this,gallery14.class);
        startActivity(intent);
    }
    public void batch13(View view) {
        Intent intent = new Intent(batchlist.this,gallery13.class);
        startActivity(intent);
    }

    public void batch12(View view) {
        Intent intent = new Intent(batchlist.this,gallery12.class);
        startActivity(intent);
    }

    public void batch11(View view) {
        Intent intent = new Intent(batchlist.this,gallery11.class);
        startActivity(intent);
    }

    public void batch10(View view) {
        Intent intent = new Intent(batchlist.this,gallery10.class);
        startActivity(intent);
    }

    public void batch09(View view) {
        Intent intent = new Intent(batchlist.this,gallery09.class);
        startActivity(intent);
    }

    public void batch08(View view) {
        Intent intent = new Intent(batchlist.this,gallery08.class);
        startActivity(intent);
    }

    public void batch07(View view) {
        Intent intent = new Intent(batchlist.this,galley07.class);
        startActivity(intent);
    }

    public void batch06(View view) {
        Intent intent = new Intent(batchlist.this,gallery06.class);
        startActivity(intent);
    }

    public void batch04(View view) {
        Intent intent = new Intent(batchlist.this,gallery04.class);
        startActivity(intent);
    }

    public void batch03(View view) {
        Intent intent = new Intent(batchlist.this,gallery03.class);
        startActivity(intent);
    }

    public void batch02(View view) {
        Intent intent = new Intent(batchlist.this,gallery02.class);
        startActivity(intent);
    }

    public void batch01(View view) {
        Intent intent = new Intent(batchlist.this,gallery01.class);
        startActivity(intent);
    }

    public void batch00(View view) {
        Intent inent = new Intent(batchlist.this,gallery2000.class);
        startActivity(inent);

    }

    public void batch99(View view) {
        Intent inent = new Intent(batchlist.this,gallery99.class);
        startActivity(inent);
    }

    public void batch98(View view) {
        Intent intent = new Intent(batchlist.this,gallery98.class);
        startActivity(intent);
    }

    public void batch97(View view) {
        Intent intent = new Intent(batchlist.this,gallery97.class);
        startActivity(intent);
    }

    public void batch94(View view) {
        Intent intent = new Intent(batchlist.this,gallery94.class);
        startActivity(intent);
    }

    public void batch93(View view) {
        Intent intent = new Intent(batchlist.this,gallery93.class);
        startActivity(intent);
    }
}
