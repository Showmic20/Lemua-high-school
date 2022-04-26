package com.example.lhs_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class siteslink extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siteslink);
    }

    public void shikkhaboard(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.dshe.gov.bd/")));
    }

    public void cumillaboard(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://comillaboard.portal.gov.bd/")));
    }

    public void fblink(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse(" https://www.facebook.com/profile.php?id=100014859541059")));
    }


    public void youtubelink(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://www.youtube.com/c/LemuaOnlineSchool")));
    }
}