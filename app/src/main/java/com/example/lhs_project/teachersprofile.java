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

public class teachersprofile extends AppCompatActivity {
    CardView cardView;
    Dialog dialog;
    TextView textView;
    private static final int Request_call = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teachersprofile);


    }

    public void onclick(View view) {
        harekrishnaopendialog();
    }
public void harekrishnamakecall(){

    Toast.makeText(getApplication(), "wait a secound", Toast.LENGTH_SHORT).show();
    Intent intent = new Intent(Intent.ACTION_CALL);
    intent.setData(Uri.parse("tel:01818779141"));
    startActivity(intent);

}
    private void harekrishnaopendialog() {
        dialog.setContentView(R.layout.activity_popup1);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Transparent)));
        ImageView imageView = dialog.findViewById(R.id.imageview1);
        CardView callcardview = dialog.findViewById(R.id.callcardview);
        CardView facebookcardview = dialog.findViewById(R.id.fbcv);
        callcardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ContextCompat.checkSelfPermission(teachersprofile.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
               harekrishnamakecall();
                } else {
                    harekishnacallbutton();
                }
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.setContentView(R.layout.harekrishnapopupimage);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Transparent)));
                dialog.show();

            }
        });
        facebookcardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://www.facebook.com/harekrishna.das.52056223")));
            }
        });
        dialog.show();

    }

     void harekishnacallbutton() {

        if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.CALL_PHONE)) {
            new AlertDialog.Builder(this)
                    .setTitle("Permission")
                    .setMessage("Please allow this permission other wise you can't make call")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ActivityCompat.requestPermissions(teachersprofile.this, new String[]{Manifest.permission.CALL_PHONE}, Request_call);

                        }
                    }).setNegativeButton("CENCEL", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            }).create().show();
        } else {
            ActivityCompat.requestPermissions(teachersprofile.this, new String[]{Manifest.permission.CALL_PHONE}, Request_call);

        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == Request_call) {
           // String number = textView.getText().toString();
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                Toast.makeText(getApplication(), " Now you can call him", Toast.LENGTH_SHORT).show();


            } else {
                Toast.makeText(getApplication(), "permission denied", Toast.LENGTH_SHORT).show();
            }

        }
    }

    public void goback(View view) {finish();
    }
}