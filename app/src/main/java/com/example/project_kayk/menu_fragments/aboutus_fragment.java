package com.example.project_kayk.menu_fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.project_kayk.Login;
import com.example.project_kayk.R;
import com.example.project_kayk.home_screen;
import com.example.project_kayk.signup;

public class aboutus_fragment extends AppCompatActivity{

    ImageView closebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus_fragment);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        closebtn= findViewById(R.id.close_btn);
       closebtn.setOnClickListener((view) ->
        {
            Intent intent = new Intent(aboutus_fragment.this, home_screen.class);
            startActivity(intent);
        } );
    }
}