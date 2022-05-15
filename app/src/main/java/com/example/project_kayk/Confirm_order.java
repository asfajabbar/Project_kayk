package com.example.project_kayk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Confirm_order extends AppCompatActivity {
    EditText address, city, postal;
    Button conbtn;
    Animation topAnim;
    ImageView lock_img;
    TextView confirm_txt;
    DatabaseReference add_ref;
    add_set_get add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_order);
        //getActionBar().hide();
        lock_img = findViewById(R.id.lock);
        confirm_txt = findViewById(R.id.confirmtext);
        address = findViewById(R.id.address);
        city = findViewById(R.id.city);
        postal = findViewById(R.id.postal);
        conbtn = findViewById(R.id.confirmbtn);
        add = new add_set_get();
        add_ref = FirebaseDatabase.getInstance().getReference().child("Addresses");

        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        lock_img.setAnimation(topAnim);

        confirm_txt.setAnimation(topAnim);

        conbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ad = address.getText().toString().trim();
                String c = city.getText().toString().trim();
                String p = postal.getText().toString().trim();
                add.setAddress(address.getText().toString().trim());
                add.setCity(city.getText().toString().trim());
                add.setPostal(postal.getText().toString().trim());
                add_ref.push().setValue(add);
                Toast.makeText(Confirm_order.this, "Order placed ", Toast.LENGTH_SHORT).show();

            }
        });

    }


}