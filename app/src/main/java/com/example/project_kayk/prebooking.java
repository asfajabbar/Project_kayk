package com.example.project_kayk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class prebooking extends AppCompatActivity implements View.OnClickListener{
    public CardView prebook1,prebook2,prebook3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prebooking);
        prebook1 = (CardView) findViewById(R.id.prebook1);
        prebook2 = (CardView) findViewById(R.id.prebook2);
        prebook3 = (CardView) findViewById(R.id.prebook3);

        prebook1.setOnClickListener(this);
        prebook2.setOnClickListener(this);
        prebook3.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()){
            case R.id.prebook1:
                i = new Intent(this, option_screen.class);
                startActivity(i);
                break;
            case R.id.prebook2:
                i = new Intent(this, option_screen.class);
                startActivity(i);
                break;
            case R.id.prebook3:
                i = new Intent(this, option_screen.class);
                startActivity(i);
                break;


        }

    }
}
