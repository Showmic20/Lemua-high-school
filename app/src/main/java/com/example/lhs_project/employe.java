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
import android.widget.Toast;

public class employe extends AppCompatActivity {
    Dialog dialog;
    private static final int Request_call = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employe);
        dialog = new Dialog(this);
    }
    /*froz start*/
    public void firozonclick(View view) {
        firozopendialog();
    }

    public void firozmakecall() {

        Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:+8801817122044"));
        startActivity(intent);

    }

    private void firozopendialog() {
        dialog.setContentView(R.layout.activity_feroz_popup);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Transparent)));

        CardView firozccard = dialog.findViewById(R.id.firozcallcard);
        CardView firozfcard = dialog.findViewById(R.id.firozfbcard);
        CardView firozscard = dialog.findViewById(R.id.firozsmscard);
        firozccard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ContextCompat.checkSelfPermission(employe.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                    firozmakecall();
                } else {
                    firozcallbbutton();
                }
            }
        });

        firozscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("smsto:+8801817122044");
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra("sms_body", "Hello Sir, ");
                startActivity(intent);
            }
        });
        firozfcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(),"দুঃখিত, কোন ফেসবুক একাউন্ট খুঁজে পাওয়া যায় নি",Toast.LENGTH_SHORT).show();

            }
        });
        dialog.show();

    }

    private void firozcallbbutton() {

        if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.CALL_PHONE)) {
            new AlertDialog.Builder(this)
                    .setTitle("Permission")
                    .setMessage("Please allow this permission other wise you can't make call")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ActivityCompat.requestPermissions(employe.this, new String[]{Manifest.permission.CALL_PHONE}, Request_call);

                        }
                    }).setNegativeButton("CENCEL", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            }).create().show();
        } else {
            ActivityCompat.requestPermissions(employe.this, new String[]{Manifest.permission.CALL_PHONE}, Request_call);

        }
    }                              /*firoz end*/
    /*gias start*/
    public void giasonclick(View view) {
        giasopendialog();
    }

    public void giasmakecallo() {

        Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:+8801865175323"));
        startActivity(intent);

    }

    private void giasopendialog() {
        dialog.setContentView(R.layout.activity_gias_popup);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Transparent)));

        CardView giasccard = dialog.findViewById(R.id.giascallcard);
        CardView giasfcard = dialog.findViewById(R.id.giasfcard);
        CardView giasscard = dialog.findViewById(R.id.giaswscard);
        giasccard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ContextCompat.checkSelfPermission(employe.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                    giasmakecallo();
                } else {
                    giascallbutton();
                }
            }
        });

        giasscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("smsto:+8801865175323");
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra("sms_body", "Hello , ");
                startActivity(intent);
            }
        });
        giasfcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(),"দুঃখিত, কোন ফেসবুক একাউন্ট খুঁজে পাওয়া যায় নি",Toast.LENGTH_SHORT).show();
            }
        });
        dialog.show();

    }

    private void giascallbutton() {

        if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.CALL_PHONE)) {
            new AlertDialog.Builder(this)
                    .setTitle("Permission")
                    .setMessage("Please allow this permission other wise you can't make call")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ActivityCompat.requestPermissions(employe.this, new String[]{Manifest.permission.CALL_PHONE}, Request_call);

                        }
                    }).setNegativeButton("CENCEL", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            }).create().show();
        } else {
            ActivityCompat.requestPermissions(employe.this, new String[]{Manifest.permission.CALL_PHONE}, Request_call);

        }
    }                              /*gias  end*/
    /*ibrahim start*/
    public void ibrahimonclick(View view) {
        ibrahimopendialogue();
    }

    public void ibrahimmakecall() {

        Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:+8801575091186"));
        startActivity(intent);

    }

    private void ibrahimopendialogue() {
        dialog.setContentView(R.layout.activity_ibrahim_popup);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Transparent)));

        CardView ibrahimccard = dialog.findViewById(R.id.ibrahimcallbutton);
        CardView ibrahimfcard = dialog.findViewById(R.id.ibrahimfbcard);
        CardView ibrahimscard = dialog.findViewById(R.id.ibrahimsmscard);
        ibrahimccard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ContextCompat.checkSelfPermission(employe.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                     ibrahimmakecall();
                } else {
                    ibrahimcallbutton();
                }
            }
        });

        ibrahimscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("smsto:+8801575091186");
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra("sms_body", "Hello Sir, ");
                startActivity(intent);
            }
        });
        ibrahimfcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://web.facebook.com/profile.php?id=100035239549983")));
            }
        });
        dialog.show();
    }

    private void ibrahimcallbutton() {

        if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.CALL_PHONE)) {
            new AlertDialog.Builder(this)
                    .setTitle("Permission")
                    .setMessage("Please allow this permission other wise you can't make call")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ActivityCompat.requestPermissions(employe.this, new String[]{Manifest.permission.CALL_PHONE}, Request_call);
                        }
                    }).setNegativeButton("CENCEL", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            }).create().show();
        } else {
            ActivityCompat.requestPermissions(employe.this, new String[]{Manifest.permission.CALL_PHONE}, Request_call);

        }
    }                              /*ibrahim end*/
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == Request_call) {
            // String number = textView.getText().toString();
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(getApplication(), " আপনি এখন কল করতে পারেন", Toast.LENGTH_SHORT).show();

            } else {
                Toast.makeText(getApplication(), "permission denied", Toast.LENGTH_SHORT).show();
            }

        }
    }

    public void agoback(View view) {finish();
    }
}