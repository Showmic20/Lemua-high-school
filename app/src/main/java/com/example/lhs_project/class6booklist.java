package com.example.lhs_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class class6booklist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class6booklist);
    }

    public void agoback(View view) {finish();
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("")));
    }

    public void bangla1(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1n0L7veA_kGa9GsF9vyCUo14yZXoVfZ5m")));
    }

    public void bangla2(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1o97sg-_Z1EA2diaJQIT-F4d7qAWX4jKV")));
    }

    public void english1(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=19Qnu9xABrV3q_JtBvGa4Jv5WX9_sHGLp")));
    }

    public void english2(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1L0vBJEoJRZLQtfCSMj1bpGlyfS1JfQAq")));
    }

    public void math(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=15TNsZYlVmy92hRcH6rgmGMXg9xtDy2rL")));
    }

    public void science(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=11sED9NrDCJ1fp3NTl_CBQ67tyMVzin9l")));
    }

    public void ict(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1Ko-OOHYyZ-bfPn2Uihi7j_7EZ2uJNpfB")));
    }

    public void saririk(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1J61J_wraY5IK3fGYOyHl7-9XCEW3AWFp")));
    }

    public void krishi(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1aK6huU8JxorHPoQOvAg4e8IYZDeLsF96")));
    }

    public void kormo(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1U3T42ihDWNRKDiN4J59XP3Tz4S8KFlMm")));
    }

    public void graystho(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=10p6DyBNiVQIaVTkfAncExmnYkwdRnr9N")));
    }

    public void hindu(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=18Ij8mwaJOK_jRv25qp3Ysj4DY-YEF2mv")));
    }

    public void islam(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1qVVaj0LTe5BJRXnoTrP5ZIpT2NFbsVnU")));
    }

    public void bisso(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=18Dd3PQ4Gu6wCyUs42SzMeFxDSZpBb2lN")));
    }

    public void anandopath(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1rV2_BTSieVUPlSE6C4Mdl1px89HlZ2Hn")));
    }

    public void nigrosthi(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1jdXLn_lhTuTqQeUXKXhiFcwTErgAyRyT")));
    }
}