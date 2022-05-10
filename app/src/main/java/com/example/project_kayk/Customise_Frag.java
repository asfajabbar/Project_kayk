package com.example.project_kayk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Customise_Frag extends AppCompatActivity {
    ImageView imageView;
    TextView text;
    private RecyclerView recyclerView;
    private List<DataModel> mList;
    private ItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_customise_frag);
        text=findViewById(R.id.pricetag);
        imageView=findViewById(R.id.cake1);
        recyclerView = findViewById(R.id.main_recyclervie);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        mList = new ArrayList<>();

        //list1
        List<String> nestedList1 = new ArrayList<>();
        nestedList1.add("Small");
        nestedList1.add("Medium");
        nestedList1.add("Large");


        List<String> nestedList2 = new ArrayList<>();
        nestedList2.add("One");
        nestedList2.add("Two");


        List<String> nestedList3 = new ArrayList<>();
        nestedList3.add("Vanilla");
        nestedList3.add("Chocolate");
        nestedList3.add("Strawberry");
        nestedList3.add("RedVelvet");



        List<String> nestedList4 = new ArrayList<>();
        nestedList4.add("Vanilla");
        nestedList4.add("Chocolate");
        nestedList4.add("Strawberry");
        nestedList4.add("Peanut Butter");

        List<String> nestedList5 = new ArrayList<>();
        nestedList5.add("Vanilla");
        nestedList5.add("Chocolate");
        nestedList5.add("Strawberry");


        List<String> nestedList6 = new ArrayList<>();
        nestedList6.add("Chocolate Chips");
        nestedList6.add("Sprinkles");
        nestedList6.add("Strawberries");
        nestedList6.add("Cherries");


        List<String> nestedList7 = new ArrayList<>();
        nestedList7.add("One");
        nestedList7.add("Two");

        mList.add(new DataModel(nestedList1 , "Size"));
        mList.add(new DataModel( nestedList2,"Layers"));
        mList.add(new DataModel( nestedList3,"Sponge"));
        mList.add(new DataModel(nestedList4 ,"Filling"));
        mList.add(new DataModel(nestedList5,"Icing"));
        mList.add(new DataModel(nestedList6,"Garnish"));
        mList.add(new DataModel(nestedList7 ,"Tiers"));
        adapter = new ItemAdapter(mList);
        recyclerView.setAdapter(adapter);
    }

}