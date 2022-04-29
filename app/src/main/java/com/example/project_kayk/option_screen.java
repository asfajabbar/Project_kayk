package com.example.project_kayk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class option_screen extends AppCompatActivity implements View.OnClickListener  {

    public CardView opt1,opt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_screen);
        opt1=findViewById(R.id.see_menu_option);
        opt2=findViewById(R.id.custom_option);
        opt1.setOnClickListener(this);
        opt2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.see_menu_option:
                i = new Intent(this, Delivery.class);
                startActivity(i);
                break;
            case R.id.custom_option:
                i = new Intent(this, Delivery.class);
                startActivity(i);
                break;
        }}}