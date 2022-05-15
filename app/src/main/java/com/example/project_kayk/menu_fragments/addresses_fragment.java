package com.example.project_kayk.menu_fragments;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.project_kayk.ListAdapter;
import com.example.project_kayk.R;
import com.example.project_kayk.add_set_get;
import com.example.project_kayk.home_screen;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class addresses_fragment extends AppCompatActivity{
    ImageButton closebtn;
    ListView myListView;
    List<add_set_get> addList;

    DatabaseReference add_ref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addresses_fragment);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //getSupportActionBar().hide();
        myListView= findViewById(R.id.myListView);
        addList= new ArrayList<>();
        add_ref= FirebaseDatabase.getInstance().getReference("Addresses");
        add_ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                addList.clear();
                for(DataSnapshot add_data: dataSnapshot.getChildren())
                {
                    add_set_get add= add_data.getValue(add_set_get.class);
                    addList.add(add);
                }
                ListAdapter adapter = new ListAdapter(addresses_fragment.this, addList);
                myListView.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });




        closebtn= findViewById(R.id.close_btn);
        closebtn.setOnClickListener((view) ->
        {

            Intent intent = new Intent(addresses_fragment.this, home_screen.class);
            startActivity(intent);
        } );
    }
}