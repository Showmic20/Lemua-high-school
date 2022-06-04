package com.example.lhs_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity {
    private TextView textview1,textview2;
    private Typeface typface1;
    private ViewPager2 viewPager2;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    Dialog dialog;

     LottieAnimationView animationView ;
     LottieAnimationView animationView2 ;

     LottieAnimationView animationView4 ;
     LottieAnimationView animationView5;
    LottieAnimationView animationView6;
    LottieAnimationView animationView7 ;
    LottieAnimationView animationView8;
    LottieAnimationView animationView9 ;
    LottieAnimationView animationView10;
    private Handler slidehandler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        dialog = new Dialog(this);
        setContentView(R.layout.activity_home);
animationView=findViewById(R.id.animation_view);
        animationView2=findViewById(R.id.animation_view2);

        animationView4=findViewById(R.id.animation_view4);
        animationView5=findViewById(R.id.animation_view5);
        animationView6=findViewById(R.id.animation_view6);
        animationView7=findViewById(R.id.animation_view7);
        animationView8=findViewById(R.id.animation_view8);
        animationView9=findViewById(R.id.animation_view9);
        animationView10=findViewById(R.id.animation_view10);

        animationView.isHardwareAccelerated();
        animationView.enableMergePathsForKitKatAndAbove(true);
        animationView2.isHardwareAccelerated();
        animationView2.enableMergePathsForKitKatAndAbove(true);

        animationView4.isHardwareAccelerated();
        animationView4.enableMergePathsForKitKatAndAbove(true);
        animationView5.isHardwareAccelerated();
        animationView5.enableMergePathsForKitKatAndAbove(true);
        animationView6.isHardwareAccelerated();
        animationView6.enableMergePathsForKitKatAndAbove(true);
        animationView7.isHardwareAccelerated();
        animationView7.enableMergePathsForKitKatAndAbove(true);
        animationView8.isHardwareAccelerated();
        animationView8.enableMergePathsForKitKatAndAbove(true);
        animationView9.isHardwareAccelerated();
        animationView9.enableMergePathsForKitKatAndAbove(true);
        animationView10.isHardwareAccelerated();
        animationView10.enableMergePathsForKitKatAndAbove(true);

        getWindow().setStatusBarColor(ContextCompat.getColor(Home.this,R.color.skyblue));
        drawerLayout = findViewById(R.id.Drawer1);
        navigationView = findViewById(R.id.navigation);
        toolbar = findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toogle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigaton_open,R.string.close);
        drawerLayout .addDrawerListener(toogle);
        toogle.syncState();
          viewPager2 = findViewById(R.id.imageviewer);
        List<imageitem> sliderItems = new ArrayList<>();
        sliderItems.add(new imageitem(R.drawable.lhs));
        sliderItems.add(new imageitem(R.drawable.lhs2));
        sliderItems.add(new imageitem(R.drawable.lhs3));
        sliderItems.add(new imageitem(R.drawable.teaches));

        viewPager2.setAdapter(new sliderAdapter(sliderItems,viewPager2));
        viewPager2.setClipToPadding(false);
        viewPager2.setClipChildren(false);
        viewPager2.setOffscreenPageLimit(3);
        viewPager2.getChildAt(0).setOverScrollMode(RecyclerView.OVER_SCROLL_ALWAYS);
        CompositePageTransformer compositePageTransformer = new CompositePageTransformer();
        compositePageTransformer.addTransformer(new MarginPageTransformer(40));
        compositePageTransformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                float r =1-Math.abs(position);
                page.setScaleY(0.55f+r*0.55f);
                page.setScaleX(0.75f+r*0.55f);
//                page.setScaleY(0.85f+r*0.55f);
//                page.setScaleX(0.75f+r*0.55f);

            }
        });
viewPager2.setPageTransformer(compositePageTransformer);
viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
    @Override
    public void onPageSelected(int position) {
        super.onPageSelected(position);
        slidehandler.removeCallbacks(sliderrun);
        slidehandler.postDelayed(sliderrun,3000);
    }
});

navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.menu1){
            dialog.setContentView(R.layout.activity_aboutus);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.Transparent)));
          dialog.show();
            return true;
        }
        if(item.getItemId()==R.id.menu2){
            Toast.makeText(getApplication(),"Share",Toast.LENGTH_SHORT).show();
            Intent it = new Intent(Intent.ACTION_SEND);
            it.setType("text/plain");
            it.putExtra(Intent.EXTRA_SUBJECT ,"Intall this app");
            it.putExtra(Intent.EXTRA_TEXT,"this is very necessary");
            startActivity(Intent.createChooser(it,"hello"));
            return true;
        }
        if(item.getItemId()==R.id.menu3){
            Toast.makeText(getApplication(),"Feedback",Toast.LENGTH_SHORT).show();
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/email");
            i.putExtra(Intent.EXTRA_EMAIL,new String[]{"anikshwomick@gamil.com"});
            i.putExtra(Intent.EXTRA_SUBJECT,"Apps feedback");
            startActivity(i);
            return true;
        }
        if(item.getItemId()==R.id.menu4){
            Toast.makeText(getApplication(),"rate",Toast.LENGTH_SHORT).show();
            Uri uri = Uri.parse("smsto:01827043389");
            Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
            intent.putExtra("sms_body", "Hey");
            startActivity(intent);
            return true;
        }
        return true;
    }
});
    }


 //   @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater menuInflater = getMenuInflater();
//        menuInflater.inflate(R.menu.menubar,menu);
//
//        return super.onCreateOptionsMenu(menu);
//    }


 //   @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        if(item.getItemId()==R.id.menu1){
//            Toast.makeText(getApplication(),"about us",Toast.LENGTH_SHORT).show();
//            return true;
//        }
//         if(item.getItemId()==R.id.menu2){
//            Toast.makeText(getApplication(),"Share",Toast.LENGTH_SHORT).show();
//            return true;
//        }
//        if(item.getItemId()==R.id.menu3){
//            Toast.makeText(getApplication(),"Feedback",Toast.LENGTH_SHORT).show();
//            return true;
//        }
//
//
//        return super.onOptionsItemSelected(item);
//    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setMessage("Are you sure  want to exit ?")
                .setCancelable(false)
                .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
.setNegativeButton("NO",null)
                .show();
    }


    public void headmaster(View view) {
        Intent intent= new Intent(Home.this,headmaster.class);
        startActivity(intent);
    }// head master activity

    public void classlist(View view) {
        Intent intent= new Intent(Home.this,classroutinelist.class);
        startActivity(intent);
    }//class routine activity

    public void importantlink(View view) {
        Intent intent = new Intent(Home.this,siteslink.class);
        startActivity(intent);
    }//site link activity

    public void map(View view) {
        Intent intent = new Intent(this,MapsActivity.class );
        startActivity(intent);
    }

    public void photogellary(View view) {
        Intent intent = new Intent(Home.this,batchlist.class);
        startActivity(intent);
    }

    public void section(View view) {
        Intent intent = new Intent(Home.this,Section.class);
        startActivity(intent);
    }

    public void teacher(View view) {
        Intent it = new Intent(Home.this,ExandpresentTeacher.class);
        startActivity(it);

    }
    private Runnable sliderrun = new Runnable() {
        @Override
        public void run() {
            viewPager2.setCurrentItem(viewPager2.getCurrentItem()+1);
        }
    };

    public void assistantheadmaster(View view) {
        Intent it = new Intent(Home.this,assistanthead.class);
        startActivity(it);
    }

    public void emplye(View view) {
        Intent it = new Intent(Home.this,employe.class);
        startActivity(it);
    }

    public void ogranization(View view) {
        Intent it = new Intent(Home.this,organization.class);
        startActivity(it);
    }
}