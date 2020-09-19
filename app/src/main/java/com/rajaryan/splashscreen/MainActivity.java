package com.rajaryan.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    Animation topAnimantion,bottomAnimation,middleAnimation;
    TextView a, slogan;
    private static int SPLASH_TIME_OUT = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animantion);
        slogan = findViewById(R.id.tagLine);
        slogan.setAnimation(bottomAnimation);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent i;
                i = new Intent(MainActivity.this,Home.class);

                startActivity(i);

                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
