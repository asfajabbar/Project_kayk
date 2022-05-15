package com.example.project_kayk;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.example.project_kayk.menu_fragments.aboutus_fragment;
import com.example.project_kayk.menu_fragments.addresses_fragment;
import com.example.project_kayk.menu_fragments.feedback_fragment;
import com.example.project_kayk.menu_fragments.help_fragment;
import com.example.project_kayk.menu_fragments.logout_fragment;
import com.example.project_kayk.menu_fragments.orders_fragment;
import com.example.project_kayk.menu_fragments.profile_fragment;
import com.google.android.material.navigation.NavigationView;

public class Pickup extends AppCompatActivity implements View.OnClickListener {
    public CardView pick1,pick2,pick3,pick4;
    DrawerLayout dLayout;
    NavigationView navigationView;
    ImageView menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pickup);
        pick1=(CardView)findViewById(R.id.pickbakery1);
        pick2=(CardView)findViewById(R.id.pickbakery2);
        pick3=(CardView)findViewById(R.id.pickbakery3);
        pick4=(CardView)findViewById(R.id.pickbakery4);
        navigationView = findViewById(R.id.navigation);
        dLayout = findViewById(R.id.drawer_layout);
        menu = findViewById(R.id.nav_icon);
        pick1.setOnClickListener(this);
        pick2.setOnClickListener(this);
        pick3.setOnClickListener(this);
        pick4.setOnClickListener(this);
        NavigationDrawer();
        ActionBarDrawerToggle toggle =new ActionBarDrawerToggle(this, dLayout, R.string.navigation_drawer_open,  R.string.navigation_drawer_close);
        toggle.syncState();

    }
    @Override
    public void onBackPressed() {
        if (dLayout.isDrawerVisible(GravityCompat.START))
            dLayout.closeDrawer(GravityCompat.START);
        else
            super.onBackPressed();
    }
    private void NavigationDrawer() {
        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId())
                {
                    case R.id.profile:
                        Intent i = new Intent(Pickup.this, profile_fragment.class);
                        startActivity(i);
                        break;
                    case R.id.orders:
                        i = new Intent(Pickup.this, orders_fragment.class);
                        startActivity(i);
                        break;
                    case R.id.addresses:
                        i = new Intent(Pickup.this, addresses_fragment.class);
                        startActivity(i);
                        break;
                    case R.id.feedback:
                        i = new Intent(Pickup.this, feedback_fragment.class);
                        startActivity(i);
                        break;
                    case R.id.about_us:
                        i = new Intent(Pickup.this, aboutus_fragment.class);
                        startActivity(i);
                    case R.id.help:
                        i = new Intent(Pickup.this, help_fragment.class);
                        startActivity(i);
                        break;
                    case R.id.logout:
                        i = new Intent(Pickup.this, logout_fragment.class);
                        startActivity(i);
                        break;
                }
                dLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });
        navigationView.setCheckedItem(R.id.profile);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (dLayout.isDrawerVisible(GravityCompat.START))
                    dLayout.closeDrawer(GravityCompat.START);
                else dLayout.openDrawer(GravityCompat.START);

            }
        });

    }
    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()){
            case R.id.pickbakery1:
                i = new Intent(this, CakesBakes_Menu.class);
                startActivity(i);
                break;
            case R.id.pickbakery2:
                i = new Intent(this, Jalalsons_Menu.class);
                startActivity(i);
                break;
            case R.id.pickbakery3:
                i = new Intent(this, CakeMystery_Menu.class);
                startActivity(i);
                break;
            case R.id.pickbakery4:
                i = new Intent(this, MiniTreats_Menu.class);
                startActivity(i);
                break;

        }
    }
}