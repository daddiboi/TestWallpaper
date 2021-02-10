package com.infinitysensei.testwallpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class splash extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGTH = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
//zoro
        ImageView image = (ImageView) findViewById(R.id.zoro);
        Animation jump1 = AnimationUtils.loadAnimation(this, R.anim.zoro);
        image.startAnimation(jump1);

//nami

        ImageView image3 = (ImageView) findViewById(R.id.nami);
        Animation jump2 = AnimationUtils.loadAnimation(this, R.anim.nami);
        image3.startAnimation(jump2);
        //luffy
        ImageView image1 = (ImageView) findViewById(R.id.imageView3);
        Animation jump = AnimationUtils.loadAnimation(this, R.anim.luffy);
        image1.startAnimation(jump);


        //splash

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(splash.this,
                        MainActivity.class);
                splash.this.startActivity(mainIntent);
                splash.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}