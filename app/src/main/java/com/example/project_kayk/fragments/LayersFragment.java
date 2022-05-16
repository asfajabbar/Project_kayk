package com.example.project_kayk.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.project_kayk.adapter.NestedAdapter;
import com.example.project_kayk.R;

import java.util.ArrayList;
import java.util.List;

public class LayersFragment extends Fragment {

    public LayersFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cake_properties, container, false);

        init(view);

        return view;

    }

    private void init(View view) {
        TextView titleTextView = view.findViewById(R.id.title);
        RecyclerView cakePropertiesRecyclerview = view.findViewById(R.id.recylerview);

        titleTextView.setText("Layers");

        cakePropertiesRecyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        cakePropertiesRecyclerview.setAdapter(new NestedAdapter(getActivity(), getPropertiesList(), "layer"));

    }

    public List<String> getPropertiesList()
    {

        List<String> layersList = new ArrayList<>(); //layers
        layersList.add("One");
        layersList.add("Two");

        return layersList;

    }

}