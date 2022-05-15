package com.example.project_kayk.menu_fragments;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.project_kayk.CartAdapter;
import com.example.project_kayk.R;
import com.example.project_kayk.cart_set_get;
import com.example.project_kayk.home_screen;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class orders_fragment extends AppCompatActivity{
    ImageButton closebtn;
    ListView myListView2;
    List<cart_set_get> cartList;
    DatabaseReference cart_ref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders_fragment);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //getSupportActionBar().hide();

        myListView2= findViewById(R.id.myListView2);
        cartList= new ArrayList<>();
        cart_ref= FirebaseDatabase.getInstance().getReference("Cart");
        cart_ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                // cartList.clear();
                for(DataSnapshot cart_data: dataSnapshot.getChildren())
                {
                    cart_set_get cart= cart_data.getValue(cart_set_get.class);
                    cartList.add(cart);
                }
                CartAdapter cadapter = new CartAdapter(orders_fragment.this, cartList);
                myListView2.setAdapter(cadapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        closebtn= findViewById(R.id.close_btn);
        closebtn.setOnClickListener((view) ->
        {
            Intent intent = new Intent(orders_fragment.this, home_screen.class);
            startActivity(intent);
        } );
    }
}