package com.infinitysensei.testwallpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        ImageView image = (ImageView) findViewById(R.id.imageView);
        Animation hyperspaceJump = AnimationUtils.loadAnimation(this, R.anim.ball);
        image.startAnimation(hyperspaceJump);
    }
}