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

import com.example.project_kayk.R;
import com.example.project_kayk.home_screen;

public class orders_fragment extends AppCompatActivity{
    ImageButton closebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders_fragment);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        closebtn= findViewById(R.id.close_btn);
        closebtn.setOnClickListener((view) ->
        {

            Intent intent = new Intent(orders_fragment.this, home_screen.class);
            startActivity(intent);
        } );
    }
}