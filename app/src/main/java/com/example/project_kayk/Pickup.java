package com.example.project_kayk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pickup extends AppCompatActivity implements View.OnClickListener {
    public CardView pick1,pick2,pick3,pick4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pickup);
        pick1=(CardView)findViewById(R.id.pickbakery1);
        pick2=(CardView)findViewById(R.id.pickbakery2);
        pick3=(CardView)findViewById(R.id.pickbakery3);
        pick4=(CardView)findViewById(R.id.pickbakery4);
        pick1.setOnClickListener(this);
        pick2.setOnClickListener(this);
        pick3.setOnClickListener(this);
        pick4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()){
            case R.id.pickbakery1:
                i = new Intent(this, option_screen.class);
                startActivity(i);
                break;
            case R.id.pickbakery2:
                i = new Intent(this, option_screen.class);
                startActivity(i);
                break;
            case R.id.pickbakery3:
                i = new Intent(this, option_screen.class);
                startActivity(i);
                break;
            case R.id.pickbakery4:
                i = new Intent(this, option_screen.class);
                startActivity(i);
                break;

        }
    }
}