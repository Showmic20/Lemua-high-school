package com.example.lhs_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class eightbooklist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eightbooklist);
    }
    public void agoback(View view) {finish(); }
    public void bangla1(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1LYCHgF0csROBwwP1z0pv0fOTmMtGLKQE"))); }

    public void bangla2(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1OfbpKNEIww609cB5OXeuRs03HlXHm89K"))); }

    public void english1(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1US4ZF6tcF4agIcth114_79XQETP6Hsbz")));}

    public void english2(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1DYpk411h34K6GKPjvq59-fRTpvw32VhA")));    }

    public void math(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=15oO-ygDQeXIyskE8-DlFSqEhu2r6Vmyp")));}

    public void science(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1Yk6-YxcVIQV_UuZLOnTwLyTUQZWOiZPV")));}

    public void ict(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1JHOy05cRGg3dYAa1ygB1g2mEHUqFqCYS")));}

    public void saririk(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1BqA9lSm4vNnW6V3DZ0S5bVCjB5jEcr9H")));}

    public void krishi(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=10N0QCM52NyOZhXR8t_qrRcjufgvsPhQw")));}

    public void kormo(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1cwMCSlb-bdhBUhmEKausu-NEWIhpFop2")));    }

    public void graystho(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1Ud4jhd8iwskJ3DfmWpBedngFDyVBMKz6")));}

    public void hindu(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1sMk4Rr5pH3dvVOpq1261EfYccx95ZKgo")));}

    public void islam(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1YQlaa6rsPxO3EVHZReghh9BQt1lW63-t")));}

    public void bisso(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1htkoe4mAWv5_NedcPUNIWK6NtvGCKm7P")));}

    public void anandopath(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1V0SIQg2nFOCk0uDfMPF0dxsxdNn51OVB")));}
    public void carukaru(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1z-ld8tDD9e1bguacoTnOIwV2IjItmVFg")));}
}