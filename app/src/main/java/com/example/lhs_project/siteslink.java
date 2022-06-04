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
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://www.facebook.com/profile.php?id=100014859541059")));
    }


    public void youtubelink(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://www.youtube.com/c/LemuaOnlineSchool")));
    }

    public void instituteresult(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://eboardresults.com/v2/home")));
    }

    public void result(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.educationboardresults.gov.bd/")));
    }

    public void xiadmission(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://www.xiclassadmission.gov.bd/")));
    }

    public void technicaladmission(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("http://btebadmission.gov.bd/website/")));
    }

    public void goruplink(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://www.facebook.com/groups/231794134771154")));
    }

    public void agoback(View view) {finish();
    }
}