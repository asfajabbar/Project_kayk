package com.example.project_kayk;

import androidx.appcompat.app.AppCompatActivity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.util.Pair;
import android.view.*;
import android.os.*;
import android.view.animation.*;
import android.widget.*;
import java.util.*;



public class MainActivity extends AppCompatActivity {

    Animation topAnim, bottomAnim;
    ImageView splashImage;
    TextView logo, slogan;
    Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        splashImage = findViewById(R.id.splashimage);
        logo = findViewById(R.id.app_name);
        slogan = findViewById(R.id.tagline);
        splashImage.setAnimation(topAnim);
        logo.setAnimation(bottomAnim);
        slogan.setAnimation(bottomAnim);
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);
                finish();
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            }
        }, 4000);

    }
}

