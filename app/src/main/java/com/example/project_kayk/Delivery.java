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

public class Delivery extends AppCompatActivity implements View.OnClickListener {
    public CardView bakery1,bakery2,bakery3,bakery4;
    DrawerLayout dLayout;
    NavigationView navigationView;
    ImageView menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery);
        //getSupportActionBar().hide();
        bakery1 = (CardView) findViewById(R.id.bakery1);
        bakery2 = (CardView) findViewById(R.id.bakery2);
        bakery3 = (CardView) findViewById(R.id.bakery3);
        bakery4 = (CardView) findViewById(R.id.bakery4);
        navigationView = findViewById(R.id.navigation);
        dLayout = findViewById(R.id.drawer_layout);
        menu = findViewById(R.id.nav_icon);
        bakery1.setOnClickListener(this);
        bakery2.setOnClickListener(this);
        bakery3.setOnClickListener(this);
        bakery4.setOnClickListener(this);
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
                        Intent i = new Intent(Delivery.this, profile_fragment.class);
                        startActivity(i);
                        break;
                    case R.id.orders:
                        i = new Intent(Delivery.this, orders_fragment.class);
                        startActivity(i);
                        break;
                    case R.id.addresses:
                        i = new Intent(Delivery.this, addresses_fragment.class);
                        startActivity(i);
                        break;
                    case R.id.feedback:
                        i = new Intent(Delivery.this, feedback_fragment.class);
                        startActivity(i);
                        break;
                    case R.id.about_us:
                        i = new Intent(Delivery.this, aboutus_fragment.class);
                        startActivity(i);
                    case R.id.help:
                        i = new Intent(Delivery.this, help_fragment.class);
                        startActivity(i);
                        break;
                    case R.id.logout:
                        i = new Intent(Delivery.this, logout_fragment.class);
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
            case R.id.bakery1:
                i = new Intent(this, Layers_Menu.class);
                startActivity(i);
                break;
            case R.id.bakery2:
                i = new Intent(this, Malmo_Menu.class);
                startActivity(i);
                break;
            case R.id.bakery3:
                i = new Intent(this, Baba_Menu.class);
                startActivity(i);
                break;
            case R.id.bakery4:
                i = new Intent(this, Karamel_Menu.class);
                startActivity(i);
                break;

        }

    }
}