package com.example.project_kayk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.RenderNode;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.example.project_kayk.HelperClasses.HomeAdapter.MostViewedHelperClass;
import com.example.project_kayk.HelperClasses.HomeAdapter.TopAdapter;
import com.example.project_kayk.HelperClasses.HomeAdapter.TopHelperClass;
import com.example.project_kayk.HelperClasses.HomeAdapter.mostViewedAdapter;
import com.example.project_kayk.menu_fragments.aboutus_fragment;
import com.example.project_kayk.menu_fragments.addresses_fragment;
import com.example.project_kayk.menu_fragments.feedback_fragment;
import com.example.project_kayk.menu_fragments.help_fragment;
import com.example.project_kayk.menu_fragments.logout_fragment;
import com.example.project_kayk.menu_fragments.orders_fragment;
import com.example.project_kayk.menu_fragments.profile_fragment;
import com.google.android.material.navigation.NavigationView;
import java.util.ArrayList;

public class home_screen extends AppCompatActivity implements View.OnClickListener,NavigationView.OnNavigationItemSelectedListener{
     static final float END_SCALE = 0.7f;
     LinearLayout contentView;
    RecyclerView topRecycler,mostviewed_recycler;
    RecyclerView.Adapter adapter,adapter1;
    public CardView card1,card2,card3,card4;
    DrawerLayout dLayout;
    NavigationView navigationView;
    ImageView menu;
    TextView viewAll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //..........................HOOKS..............................................

        card1 = (CardView) findViewById(R.id.card1);
        card2 = (CardView) findViewById(R.id.card2);
        card3 = (CardView) findViewById(R.id.card3);
        card4= (CardView) findViewById(R.id.card4);
        viewAll= findViewById(R.id.view_all);
        topRecycler = findViewById(R.id.top_recycler);
        mostviewed_recycler = findViewById(R.id.viewed_recycler);
        navigationView = findViewById(R.id.navigation);
        dLayout = findViewById(R.id.drawer_layout);
        menu = findViewById(R.id.nav_icon);
        contentView = findViewById(R.id.content);

        //.................................CALLINGFUNCTION.........................................

        topRecycler();
        mostviewed_recycler();
        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener( this);
        navigationView.setCheckedItem(R.id.profile);
        NavigationDrawer();
        animateNavigationDrawer();
       ActionBarDrawerToggle toggle =new ActionBarDrawerToggle(this, dLayout, R.string.navigation_drawer_open,  R.string.navigation_drawer_close);
       toggle.syncState();
       viewAll.setOnClickListener(this);
    }

    //....................................................METHODS........................................

    @SuppressWarnings("StatementWithEmptyBody")
    private void NavigationDrawer() {
        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener( this);
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
    public void onBackPressed() {
        if (dLayout.isDrawerVisible(GravityCompat.START))
            dLayout.closeDrawer(GravityCompat.START);
        else
            super.onBackPressed();
    }


    private void animateNavigationDrawer() {
        dLayout.setScrimColor(getResources().getColor(R.color.babypink));
        dLayout.addDrawerListener(new DrawerLayout.SimpleDrawerListener() {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {

                // Scale the View based on current slide offset
                final float diffScaledOffset = slideOffset * (1 - END_SCALE);
                final float offsetScale = 1 - diffScaledOffset;
                contentView.setScaleX(offsetScale);
                contentView.setScaleY(offsetScale);

                // Translate the View, accounting for the scaled width
                final float xOffset = drawerView.getWidth() * slideOffset;
                final float xOffsetDiff = contentView.getWidth() * diffScaledOffset / 2;
                final float xTranslation = xOffset - xOffsetDiff;
                contentView.setTranslationX(xTranslation);
            }
        });

    }

    private void mostviewed_recycler() {

        mostviewed_recycler.setHasFixedSize(true);
        mostviewed_recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false ));
        ArrayList<MostViewedHelperClass> mostViewed = new ArrayList<>();
        mostViewed.add(new MostViewedHelperClass(R.drawable.minitreats, "Mini treats" ));
        mostViewed.add(new MostViewedHelperClass(R.drawable.jalalsons, "Jalal Sons" ));
        mostViewed.add(new MostViewedHelperClass(R.drawable.layers, "Layers" ));
        adapter1 = new mostViewedAdapter(mostViewed);
        mostviewed_recycler.setAdapter(adapter1);
        GradientDrawable gradient1 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffeff400,0xffaff600});

    }

    private void topRecycler() {

        topRecycler.setHasFixedSize(true);
        topRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false ));
        ArrayList<TopHelperClass> topViewed = new ArrayList<>();
        topViewed.add(new TopHelperClass(R.drawable.minitreats, "Mini treats" ));
        topViewed.add(new TopHelperClass(R.drawable.jalalsons, "Jalal Sons" ));
        topViewed.add(new TopHelperClass(R.drawable.layers, "Layers" ));
        adapter = new TopAdapter(topViewed);
        topRecycler.setAdapter(adapter);
        GradientDrawable gradient1 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffeff400,0xffaff600});

    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()){
            case R.id.card1:
                i = new Intent(this, Delivery.class);
                startActivity(i);
                break;
            case R.id.card2:
                i = new Intent(this,Pickup.class);
                startActivity(i);
                break;
            case R.id.card3:
                i = new Intent(this, prebooking.class);
                startActivity(i);
                break;
            case R.id.card4:
                i = new Intent(this, Delivery.class);
                startActivity(i);
                break;
            case R.id.view_all:
                i = new Intent(this,Delivery.class);
                startActivity(i);
                break;
        }

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId())
        {
            case R.id.profile:
                Intent i = new Intent(home_screen.this,profile_fragment.class);
                startActivity(i);
                break;
            case R.id.orders:
                 i = new Intent(home_screen.this,orders_fragment.class);
                 startActivity(i);
                break;
            case R.id.addresses:
                 i = new Intent(home_screen.this,addresses_fragment.class);
                 startActivity(i);
                break;
            case R.id.feedback:
                 i = new Intent(home_screen.this,feedback_fragment.class);
                 startActivity(i);
                break;
            case R.id.about_us:
                 i = new Intent(home_screen.this,aboutus_fragment.class);
                startActivity(i);
            case R.id.help:
                 i = new Intent(home_screen.this,help_fragment.class);
                 startActivity(i);
                break;
            case R.id.logout:
                i = new Intent(home_screen.this,logout_fragment.class);
                startActivity(i);
                break;
        }
        dLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}