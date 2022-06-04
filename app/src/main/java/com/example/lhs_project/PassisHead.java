package com.example.lhs_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PassisHead extends AppCompatActivity {

    Dialog dialog;

    private static final int Request_call = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passis_head);

        dialog = new Dialog(this);


    }

    /* অরুন  start*/
    public void asispresentonclick(View view) {
        arundialog();
    }

    public void arun() {

        Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:+8801817130460"));
        startActivity(intent);

    }

    private void arundialog() {
        dialog.setContentView(R.layout.activity_arunpopup);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Transparent)));
        ImageView arunimageview = dialog.findViewById(R.id.arunimage);
        CardView aruncallcard = dialog.findViewById(R.id.aruncallcard);
        CardView arunfbcard = dialog.findViewById(R.id.arunfbcard);
        CardView arunsmscard = dialog.findViewById(R.id.arunsmscard);
        aruncallcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ContextCompat.checkSelfPermission(PassisHead.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                    arun();
                } else {
                    aruncallbutton();
                }
            }
        });

        arunsmscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("smsto:8801817130460");
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra("sms_body", "Hello Sir, ");
                startActivity(intent);
            }
        });
        arunfbcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), "দুঃখিত কোন ফেসবুক একাউন্ট নেই", Toast.LENGTH_SHORT).show();
            }
        });
        dialog.show();

    }

    private void aruncallbutton() {

        if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.CALL_PHONE)) {
            new AlertDialog.Builder(this)
                    .setTitle("Permission")
                    .setMessage("Please allow this permission other wise you can't make call")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ActivityCompat.requestPermissions(PassisHead.this, new String[]{Manifest.permission.CALL_PHONE}, Request_call);

                        }
                    }).setNegativeButton("CENCEL", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            }).create().show();
        } else {
            ActivityCompat.requestPermissions(PassisHead.this, new String[]{Manifest.permission.CALL_PHONE}, Request_call);

        }
    } /*shaed end*/

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == Request_call) {
            // String number = textView.getText().toString();
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                Toast.makeText(getApplication(), "আপনি এখন কল করতে পারেন", Toast.LENGTH_SHORT).show();


            } else {
                Toast.makeText(getApplication(), "permission denied", Toast.LENGTH_SHORT).show();
            }

        }
    }

    public void goback(View view) {finish();
    }
}