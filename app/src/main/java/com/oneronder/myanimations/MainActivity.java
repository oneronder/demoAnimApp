package com.oneronder.myanimations;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Animation.AnimationListener {

    ImageView imageView;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.image);
    }

    public void scaleAnimation(View view) {

        animation = AnimationUtils.loadAnimation(this, R.anim.myanim);
        animation.setAnimationListener(this);
        imageView.startAnimation(animation);
    }

    @Override
    public void onAnimationStart(Animation animation) {
        // Toast.makeText(this, "Animasyon Başladı", Toast.LENGTH_LONG).show();

    }

    @Override
    public void onAnimationEnd(Animation animation) {
       // Toast.makeText(this, "Animasyon Bitti", Toast.LENGTH_LONG).show();

    }

    @Override
    public void onAnimationRepeat(Animation animation) {
       // Toast.makeText(this, "Animasyon Tekrar Ediyor", Toast.LENGTH_LONG).show();

    }


}
