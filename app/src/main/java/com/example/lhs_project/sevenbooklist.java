package com.example.lhs_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class sevenbooklist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sevenbooklist);
    }

    public void agoback(View view) {finish();
    }
    public void bangla1(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1dqZB9qmrd8c63DJN9McjHZhSZuTLnA-h"))); }

    public void bangla2(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1-ehthy8_V8W2p1HFfZiHumcxjXJM7DNP"))); }

    public void english1(View view) {

        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1VAamLGfZsido46So5-_CZZRPr3BxkJcQ")));}

    public void english2(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1L9Eh-hMU3kyYJtw1XcVhE5MDEJFgXga1")));    }

    public void math(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=14U6yHDbIc0zo4_7UJCGUYimMG7K7lfJJ")));}

    public void science(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1siRNZHOZgG_eWtdCgQsGM3b_nAMkbt7w")));}

    public void ict(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1NTBuINKvJEPrYj-3rY-GfdWxUrOX8hTy")));}

    public void saririk(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=11F8IGJuw5XN5zuCHuX9CDwV9Z5vq-Vws")));}

    public void krishi(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=14mB7btgK0iZgF3hcg3I1zX1oNey3g7m0")));}

    public void kormo(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1flMFI6ey9fadcKeYNTQ5CCf1SRAdty4f")));    }

    public void graystho(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1ciHGU5ESiZkfT7RWZtDB-lB_0OyK3TPe")));}

    public void hindu(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1AgBXy0nlxJsVUzwVO7upWbs1bfUlhb9L")));}

    public void islam(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1RHm0JjUuW0uI6IzrU_9xIvYDrnpZPVmk")));}

    public void bisso(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1ty_IUq0Pkca5kshCzOU0xRMMtT9p6oEL")));}

    public void anandopath(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1xlKZ6HELOSoKcL4F-jWIfzpVprAyabi0")));}

    public void nigrosthi(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1LzMhDGFDqGRIGkBvrOCPdra7LouRKhuC")));}

    public void carukaru(View view) {
        startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://drive.google.com/open?id=1v1iKz5p4DYXsRW-KJYbFurqkLOGngU3f")));}
}
