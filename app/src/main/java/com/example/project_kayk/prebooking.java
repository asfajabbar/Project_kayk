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

public class prebooking extends AppCompatActivity implements View.OnClickListener{
    public CardView prebook1,prebook2,prebook3;
    DrawerLayout dLayout;
    NavigationView navigationView;
    ImageView menu;
    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prebooking);
        prebook1 = (CardView) findViewById(R.id.prebook1);
        prebook2 = (CardView) findViewById(R.id.prebook2);
        prebook3 = (CardView) findViewById(R.id.prebook3);
        navigationView = findViewById(R.id.navigation);
        dLayout = findViewById(R.id.drawer_layout);
        menu = findViewById(R.id.nav_icon);
        prebook1.setOnClickListener(this);
        prebook2.setOnClickListener(this);
        prebook3.setOnClickListener(this);
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
                        Intent i = new Intent(prebooking.this, profile_fragment.class);
                        startActivity(i);
                        break;
                    case R.id.orders:
                        i = new Intent(prebooking.this, orders_fragment.class);
                        startActivity(i);
                        break;
                    case R.id.addresses:
                        i = new Intent(prebooking.this, addresses_fragment.class);
                        startActivity(i);
                        break;
                    case R.id.feedback:
                        i = new Intent(prebooking.this, feedback_fragment.class);
                        startActivity(i);
                        break;
                    case R.id.about_us:
                        i = new Intent(prebooking.this, aboutus_fragment.class);
                        startActivity(i);
                    case R.id.help:
                        i = new Intent(prebooking.this, help_fragment.class);
                        startActivity(i);
                        break;
                    case R.id.logout:
                        i = new Intent(prebooking.this, logout_fragment.class);
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
            case R.id.prebook1:
                i = new Intent(this, Layers_Menu.class);
                startActivity(i);
                break;
            case R.id.prebook2:
                i = new Intent(this, MiniTreats_Menu.class);
                startActivity(i);
                break;
            case R.id.prebook3:
                i = new Intent(this, BaskinRobins_Menu.class);
                startActivity(i);
                break;
        }

    }
}