package com.example.project_kayk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Delivery extends AppCompatActivity implements View.OnClickListener {
public CardView bakery1,bakery2,bakery3,bakery4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery);
        getSupportActionBar().hide();
        bakery1 = (CardView) findViewById(R.id.bakery1);
        bakery2 = (CardView) findViewById(R.id.bakery2);
        bakery3 = (CardView) findViewById(R.id.bakery3);
        bakery4 = (CardView) findViewById(R.id.bakery4);
        bakery1.setOnClickListener(this);
        bakery2.setOnClickListener(this);
        bakery3.setOnClickListener(this);
        bakery4.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()){
            case R.id.bakery1:
                i = new Intent(this, option_screen.class);
                startActivity(i);
                break;
            case R.id.bakery2:
                i = new Intent(this, option_screen.class);
                startActivity(i);
                break;
            case R.id.bakery3:
                i = new Intent(this, option_screen.class);
                startActivity(i);
                break;
                case R.id.bakery4:
                    i = new Intent(this, option_screen.class);
                    startActivity(i);
                    break;

        }

    }
}