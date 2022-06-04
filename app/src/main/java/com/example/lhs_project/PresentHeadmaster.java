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

public class PresentHeadmaster extends AppCompatActivity {

    CardView cardView;
    Dialog dialog;

    private static final int Request_call = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_present_headmaster);
        cardView = findViewById(R.id.sahedalicard);
        dialog = new Dialog(this);


    }

    /*shaed start*/
    public void presentonclick(View view) {
        shaeddialog();
    }

    public void shaed() {

        Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:+8801816360462"));
        startActivity(intent);

    }

    private void shaeddialog() {
        dialog.setContentView(R.layout.activity_shahedalipopup);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Transparent)));
        ImageView shaedimageview = dialog.findViewById(R.id.shaedimage);
        CardView shaedcallcard = dialog.findViewById(R.id.shaedcallcard);
        CardView shaedfbcard = dialog.findViewById(R.id.shaedfb);
        CardView shaedsmscard = dialog.findViewById(R.id.shaedsmscard);
        shaedcallcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ContextCompat.checkSelfPermission(PresentHeadmaster.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                    shaed();
                } else {
                    shahedcallbutton();
                }
            }
        });
        shaedimageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.setContentView(R.layout.activity_shahedalipopup);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Transparent)));
                dialog.show();

            }
        });
        shaedsmscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), "Wait a second", Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("smsto:01815378646");
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra("sms_body", "Hello Sir, ");
                startActivity(intent);
            }
        });
        shaedfbcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://web.facebook.com/profile.php?id=100077446241299")));
            }
        });
        dialog.show();

    }

    private void shahedcallbutton() {

        if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.CALL_PHONE)) {
            new AlertDialog.Builder(this)
                    .setTitle("Permission")
                    .setMessage("Please allow this permission other wise you can't make call")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ActivityCompat.requestPermissions(PresentHeadmaster.this, new String[]{Manifest.permission.CALL_PHONE}, Request_call);

                        }
                    }).setNegativeButton("CENCEL", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            }).create().show();
        } else {
            ActivityCompat.requestPermissions(PresentHeadmaster.this, new String[]{Manifest.permission.CALL_PHONE}, Request_call);

        }
    } /*shaed end*/

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == Request_call) {
            // String number = textView.getText().toString();
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                Toast.makeText(getApplication(), "আপনি এখন কল করতে পারেন ", Toast.LENGTH_SHORT).show();


            } else {
                Toast.makeText(getApplication(), "permission denied", Toast.LENGTH_SHORT).show();
            }

        }
    }

    public void goback(View view) {finish();
    }
}