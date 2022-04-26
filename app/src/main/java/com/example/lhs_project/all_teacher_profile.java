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

public class all_teacher_profile extends AppCompatActivity {
    Dialog dialog;
    private static final int Request_call = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_teacher_profile);

        dialog = new Dialog(this);
    }

    /*yousuf start*/
    public void yausufonclick(View view) {
        ictyousufpendialog();
    }

    public void ictyousufmakecall() {

        Toast.makeText(getApplication(), "wait a secound", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:+8801815378646"));
        startActivity(intent);

    }

    private void ictyousufpendialog() {
        dialog.setContentView(R.layout.activity_ictyausuf_popup);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Transparent)));
        ImageView IctyousufimageView = dialog.findViewById(R.id.ictyousufimage);
        CardView Ictyousufcard = dialog.findViewById(R.id.ictyousufcallcard);
        CardView Ictyousufacebookcard = dialog.findViewById(R.id.ictyousuffb);
        CardView Ictyousufsms = dialog.findViewById(R.id.yousufsmscard);
        Ictyousufcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ContextCompat.checkSelfPermission(all_teacher_profile.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                    ictyousufmakecall();
                } else {
                    ictyousufcallbutton();
                }
            }
        });
        IctyousufimageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.setContentView(R.layout.ictyousufpopupimage);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Transparent)));
                dialog.show();

            }
        });
        Ictyousufsms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), "Wait a secound", Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("smsto:01815378646");
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra("sms_body", "Hello Sir, ");
                startActivity(intent);
            }
        });
        Ictyousufacebookcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://www.facebook.com/profile.php?id=100009681935608&sk=photos")));
            }
        });
        dialog.show();

    }

    private void ictyousufcallbutton() {

        if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.CALL_PHONE)) {
            new AlertDialog.Builder(this)
                    .setTitle("Permission")
                    .setMessage("Please allow this permission other wise you can't make call")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ActivityCompat.requestPermissions(all_teacher_profile.this, new String[]{Manifest.permission.CALL_PHONE}, Request_call);

                        }
                    }).setNegativeButton("CENCEL", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            }).create().show();
        } else {
            ActivityCompat.requestPermissions(all_teacher_profile.this, new String[]{Manifest.permission.CALL_PHONE}, Request_call);

        }
    } /*yousuf end*/

    /*kashem start*/
    public void kashemconclick(View view) {
        kashempendialog();
    }

    public void kashemmakecall() {

        Toast.makeText(getApplication(), "wait a secound", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:01815453555"));
        startActivity(intent);

    }

    private void kashempendialog() {
        dialog.setContentView(R.layout.activity_abulkashem_popup);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Transparent)));
        ImageView kashemimageView = dialog.findViewById(R.id.kashemimage);
        CardView kashemcard = dialog.findViewById(R.id.kashemcallcard);
        CardView kashemfacebookcard = dialog.findViewById(R.id.kashemfb);
        kashemcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ContextCompat.checkSelfPermission(all_teacher_profile.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                    kashemmakecall();
                } else {
                    kashemcallbutton();
                }
            }
        });
        kashemimageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.setContentView(R.layout.kashempopupimage);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Transparent)));
                dialog.show();

            }
        });
        kashemfacebookcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://www.facebook.com/mdabul.kashemrubel")));
            }
        });
        dialog.show();

    }

    private void kashemcallbutton() {

        if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.CALL_PHONE)) {
            new AlertDialog.Builder(this)
                    .setTitle("Permission")
                    .setMessage("Please allow this permission other wise you can't make call")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ActivityCompat.requestPermissions(all_teacher_profile.this, new String[]{Manifest.permission.CALL_PHONE}, Request_call);

                        }
                    }).setNegativeButton("CENCEL", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            }).create().show();
        } else {
            ActivityCompat.requestPermissions(all_teacher_profile.this, new String[]{Manifest.permission.CALL_PHONE}, Request_call);

        }
    }/*kashem end*/

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


}