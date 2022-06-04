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

                                                                  /*brojogopal start*/
    public void borojoonclikc(View view) {
        borjopoendioalot();
    }

    public void borjomakecall() {

        Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:+8801819724072"));
        startActivity(intent);

    }

    private void borjopoendioalot() {
        dialog.setContentView(R.layout.activity_brojogopal_popup);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Transparent)));;
        CardView brojoccard = dialog.findViewById(R.id.brojocallcard);
        CardView borjofcard = dialog.findViewById(R.id.borjofbcard);
        CardView brojoscard = dialog.findViewById(R.id.brojosmscard);
        brojoccard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ContextCompat.checkSelfPermission(all_teacher_profile.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                    borjomakecall();
                } else {
                    brojocallbutton();
                }
            }
        });

        brojoscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("smsto:8801819724072");
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra("sms_body", "Hello Sir, ");
                startActivity(intent);
            }
        });
        borjofcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(),"দুঃখিত, কোন ফেসবুক একাউন্ট খুঁজে পাওয়া যায় নি",Toast.LENGTH_SHORT).show();

            }
        });
        dialog.show();

    }

    private void brojocallbutton() {

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
    }                         /*brojogoapal end*/


                                                                   /*jasim start*/
    public void jasimonclick(View view) {
        jasimopendialog();
    }

    public void jasimmakecall() {

        Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:+01811327477"));
        startActivity(intent);

    }

    private void jasimopendialog() {
        dialog.setContentView(R.layout.activity_jasim_popup);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Transparent)));

        CardView jasimccard = dialog.findViewById(R.id.jasimcallcard);
        CardView jasimfcard = dialog.findViewById(R.id.jasimfbcard);
        CardView jasimscard = dialog.findViewById(R.id.jasimsmscard);
        jasimccard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ContextCompat.checkSelfPermission(all_teacher_profile.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                    jasimmakecall();
                } else {
                    jasimcallbuttom();
                }
            }
        });

        jasimscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("smsto:8801811327477");
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra("sms_body", "Hello Sir, ");
                startActivity(intent);
            }
        });
        jasimfcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(),"দুঃখিত, কোন ফেসবুক একাউন্ট খুঁজে পাওয়া যায় নি",Toast.LENGTH_SHORT).show();

            }
        });
        dialog.show();

    }

    private void jasimcallbuttom() {

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
    }                         /*jasim end*/


                                                                  /*gopal start*/
    public void gopalonclick(View view) {
        gopalopendialog();
    }

    public void gopalmakecall() {

        Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:+8801819801504"));
        startActivity(intent);

    }

    private void gopalopendialog() {
        dialog.setContentView(R.layout.activity_gopal_popup);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Transparent)));

        CardView gopalccard = dialog.findViewById(R.id.gopalcallcard);
        CardView gopalfcard = dialog.findViewById(R.id.gopalfbcard);
        CardView gopalscard = dialog.findViewById(R.id.gopalsmscard);
        gopalccard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ContextCompat.checkSelfPermission(all_teacher_profile.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                    gopalmakecall();
                } else {
                    gopalcallbutton();
                }
            }
        });

        gopalscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("smsto:+8801819801504");
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra("sms_body", "Hello Sir, ");
                startActivity(intent);
            }
        });
        gopalfcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://www.facebook.com/bhowmik.gopal.73")));

            }
        });
        dialog.show();

    }

    private void gopalcallbutton() {

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
    }                         /*gopal end*/


                                                                    /*kamal start*/
    public void kamalonclick(View view) {
        kamamlopendialog();
    }

    public void kamalmakecall() {

        Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:+8801715779269"));
        startActivity(intent);

    }

    private void kamamlopendialog() {
        dialog.setContentView(R.layout.activity_kamal_popup);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Transparent)));

        CardView kamalccard = dialog.findViewById(R.id.kamalcallcard);
        CardView kamalfcard = dialog.findViewById(R.id.kamalfbcard);
        CardView kamalscard = dialog.findViewById(R.id.kamalsmscard);
        kamalfcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ContextCompat.checkSelfPermission(all_teacher_profile.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                    kamalmakecall();
                } else {
                    kamalcallbutton();
                }
            }
        });

        kamalscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("smsto:8801715779269");
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra("sms_body", "Hello Sir, ");
                startActivity(intent);
            }
        });
        kamalfcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(),"দুঃখিত, কোন ফেসবুক একাউন্ট খুঁজে পাওয়া যায় নি",Toast.LENGTH_SHORT).show();

            }
        });
        dialog.show();

    }

    private void kamalcallbutton() {

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
    }                         /*kamal end*/


                                                                 /*hujur start*/
    public void hujuronclikc(View view) {
        hujuropendialog();
    }

    public void hujurmakecall() {

        Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:+8801814338836"));
        startActivity(intent);

    }

    private void hujuropendialog() {
        dialog.setContentView(R.layout.activity_hujru_popup);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Transparent)));

        CardView yousufccard = dialog.findViewById(R.id.hujurcallcard);
        CardView yousuffcard = dialog.findViewById(R.id.hujurfbcard);
        CardView yousufscard = dialog.findViewById(R.id.hujursmscard);
        yousufccard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ContextCompat.checkSelfPermission(all_teacher_profile.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                    hujurmakecall();
                } else {
                    hujurcallbuttom();
                }
            }
        });

        yousufscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("smsto:+8801814338836");
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra("sms_body", "Hello Sir, ");
                startActivity(intent);
            }
        });
        yousuffcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(),"দুঃখিত, কোন ফেসবুক একাউন্ট খুঁজে পাওয়া যায় নি",Toast.LENGTH_SHORT).show();

            }
        });
        dialog.show();

    }

    private void hujurcallbuttom() {

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
    }                         /*hujur end*/

                                                             /*karmur nahar start*/
    public void kamrunonclikc(View view) {
        kamrunopendiaplog();
    }

    public void kamruncakecall() {

        Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:+8801818755162"));
        startActivity(intent);

    }

    private void kamrunopendiaplog() {
        dialog.setContentView(R.layout.activity_karnurnahar_popup);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Transparent)));

        CardView kamrunccard = dialog.findViewById(R.id.kamruncallcard);
        CardView kamrunfcard = dialog.findViewById(R.id.kamrunfbcard);
        CardView kamrunscard = dialog.findViewById(R.id.kamrunsmscardd);
        kamrunccard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ContextCompat.checkSelfPermission(all_teacher_profile.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                    kamruncakecall();
                } else {
                    kamruncallbutton();
                }
            }
        });
;
        kamrunscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("smsto:+8801818755162");
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra("sms_body", "Hello Sir, ");
                startActivity(intent);
            }
        });
        kamrunfcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(),"দুঃখিত, কোন ফেসবুক একাউন্ট খুঁজে পাওয়া যায় নি",Toast.LENGTH_SHORT).show();

            }
        });
        dialog.show();

    }

    private void kamruncallbutton() {

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
    }                         /*karmur nahar end*/

                                                                    /*sikha start*/
    public void sikhaonclick(View view) {
        sikahopendialog();
    }

    public void sikhamakecall() {

        Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:+8801838626257"));
        startActivity(intent);

    }

    private void sikahopendialog() {
        dialog.setContentView(R.layout.activity_sikha_popup);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Transparent)));

        CardView sikhacard = dialog.findViewById(R.id.sikhacallcard);
        CardView sikhafcard=dialog.findViewById(R.id.sikhafbcard);
        CardView sikhascard = dialog.findViewById(R.id.sikhasmscard);
        sikhacard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ContextCompat.checkSelfPermission(all_teacher_profile.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                    sikhamakecall();
                } else {
                    sikhacallbutton();
                }
            }
        });
;
        sikhascard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("smsto:+8801838626257");
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra("sms_body", "Hello Sir, ");
                startActivity(intent);
            }
        });
        sikhafcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(),"দুঃখিত, কোন ফেসবুক একাউন্ট খুঁজে পাওয়া যায় নি",Toast.LENGTH_SHORT).show();
            }
        });
        dialog.show();

    }

    private void sikhacallbutton() {

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
    }                              /*sikha end*/


                                                                     /*firoza start*/
    public void firozaonclikc(View view) {
        firozaopendialog();
    }

    public void firozamakecall() {

        Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:+8801836033783"));
        startActivity(intent);

    }

    private void firozaopendialog() {
        dialog.setContentView(R.layout.activity_firoza_popup);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Transparent)));

        CardView firozaccard = dialog.findViewById(R.id. firozacallcard);
        CardView firozafcard = dialog.findViewById(R.id.firozafbcard);
        CardView firozascard = dialog.findViewById(R.id.firozsmscard);
        firozaccard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ContextCompat.checkSelfPermission(all_teacher_profile.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                    firozamakecall();
                } else {
                    firozacallbutton();
                }
            }
        });

        firozascard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("smsto:+8801836033783");
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra("sms_body", "Hello Sir, ");
                startActivity(intent);
            }
        });
        firozafcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://www.facebook.com/profile.php?id=100032972268528")));
            }
        });
        dialog.show();

    }

    private void firozacallbutton() {

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
    }                              /*firoza end*/


                                                                   /*yousuf start*/
    public void yausufonclick(View view) {
        ictyousufpendialog();
    }

    public void ictyousufmakecall() {

        Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
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

        Ictyousufsms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
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
    }                              /*yousuf end*/


                                                                        /*kashem start*/
    public void kashemconclick(View view) {
        kashempendialog();
    }

    public void kashemmakecall() {

        Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:8801812613611"));
        startActivity(intent);

    }

    private void kashempendialog() {
        dialog.setContentView(R.layout.activity_abulkashem_popup);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Transparent)));

        CardView kashemcard = dialog.findViewById(R.id.kashemcallcard);
        CardView kashemscard = dialog.findViewById(R.id.kashemsmscard);
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
        kashemscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("smsto:+8801812613611");
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra("sms_body", "Hello Sir, ");
                startActivity(intent);
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
    }                                /*kashem end*/


                                                                       /*ismail start*/
    public void ismailonclick(View view) {
         ismailopendialog();
    }

    public void ismailmakecall() {

        Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:+8801816071478"));
        startActivity(intent);

    }

    private void ismailopendialog() {
        dialog.setContentView(R.layout.activity_ismail_popup);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Transparent)));

        CardView ismailccard = dialog.findViewById(R.id.ismailcallcard);
        CardView ismailfcard = dialog.findViewById(R.id.isamilfbcard);
        CardView ismailscard = dialog.findViewById(R.id.isamilsmscard);
        ismailccard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ContextCompat.checkSelfPermission(all_teacher_profile.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                    ismailmakecall();
                } else {
                    ismailcallbutton();
                }
            }
        });

        ismailscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("smsto:+8801816071478");
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra("sms_body", "Hello Sir, ");
                startActivity(intent);
            }
        });
        ismailfcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://web.facebook.com/profile.php?id=100008436455922")));
            }
        });
        dialog.show();

    }

    private void ismailcallbutton() {

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
    }                              /*ismail end*/


                                                                       /*prodip start*/
    public void pordiponclick(View view) {
        pordippopendialog();
    }

    public void prodipmakecall() {

        Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:+8801812353417"));
        startActivity(intent);

    }

    private void pordippopendialog() {
        dialog.setContentView(R.layout.activity_prodip_popup);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Transparent)));

        CardView prodipccard = dialog.findViewById(R.id.prodipcallcard);
        CardView prodipfcard = dialog.findViewById(R.id.prodipfbcard);
        CardView prodipscard = dialog.findViewById(R.id.prodipsmscard);
        prodipccard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ContextCompat.checkSelfPermission(all_teacher_profile.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                    prodipmakecall();
                } else {
                    prodipcallbutton();
                }
            }
        });

        prodipscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("smsto:+8801812353417");
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra("sms_body", "Hello Sir, ");
                startActivity(intent);
            }
        });
        prodipfcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://www.facebook.com/pradip.chandradas.144")));
            }
        });
        dialog.show();

    }

    private void prodipcallbutton() {

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
    }                              /*prodip end*/


                                                                       /*najim start*/
    public void najimonclikc(View view) {
        najimopendialog();
    }

    public void najimmakecall() {

        Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:+8801820703011"));
        startActivity(intent);

    }

    private void najimopendialog() {
        dialog.setContentView(R.layout.activity_nijam_popup);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Transparent)));

        CardView nijamccard = dialog.findViewById(R.id.nijamcallcard);
        CardView nijamfcard = dialog.findViewById(R.id.nijamfbcard);
        CardView nijamscard = dialog.findViewById(R.id.nijamsmscard);
        nijamccard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ContextCompat.checkSelfPermission(all_teacher_profile.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                    najimmakecall();
                } else {
                    najimcallbutton();
                }
            }
        });

        nijamscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("smsto:+8801820703011");
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra("sms_body", "Hello Sir, ");
                startActivity(intent);
            }
        });
         nijamfcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://web.facebook.com/profile.php?id=100053760241164")));
            }
        });
        dialog.show();

    }

    private void najimcallbutton() {

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
    }                              /*najim end*/


                                                           /*borhan start*/
    public void borhanonclick(View view) {
        borhanopendialog();
    }

    public void borhanmakecall() {

        Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:+8801575091186"));
        startActivity(intent);

    }

    private void borhanopendialog() {
        dialog.setContentView(R.layout.activity_borhan_popup);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Transparent)));

        CardView borhanccard = dialog.findViewById(R.id.borhancallcard);
        CardView borhanfcard = dialog.findViewById(R.id.borhanfbcard);
        CardView borhanscard = dialog.findViewById(R.id.borhansmscard);
        borhanccard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ContextCompat.checkSelfPermission(all_teacher_profile.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                    borhanmakecall();
                } else {
                    borhancallbutton();
                }
            }
        });

        borhanscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplication(), "একটু অপেক্ষা করুন", Toast.LENGTH_SHORT).show();
                Uri uri = Uri.parse("smsto:+8801575091186");
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra("sms_body", "Hello Sir, ");
                startActivity(intent);
            }
        });
        borhanfcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://web.facebook.com/profile.php?id=100069725202690")));
            }
        });
        dialog.show();

    }

    private void borhancallbutton() {

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
    }                              /*borhan end*/
    @Override
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