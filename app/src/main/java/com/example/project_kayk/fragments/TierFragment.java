package com.example.project_kayk.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.project_kayk.R;
import com.example.project_kayk.utils.SingletonClass;

public class TierFragment extends Fragment {

    public TierFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragmetn_cake_cost, container, false);

        init(view);

        return view;

    }

    private void init(View view) {

        TextView titleTextView = view.findViewById(R.id.title);
        TextView layer = view.findViewById(R.id.layer);
        TextView title_layer = view.findViewById(R.id.title_layer);
        TextView sponge = view.findViewById(R.id.sponge);
        TextView title_sponge = view.findViewById(R.id.title_sponge);
        TextView filling = view.findViewById(R.id.filling);
        TextView title_filling = view.findViewById(R.id.title_filling);
        TextView icing = view.findViewById(R.id.icing);
        TextView title_icing = view.findViewById(R.id.title_icing);
        TextView garnish = view.findViewById(R.id.garnish);
        TextView title_garnish = view.findViewById(R.id.title_garnish);
        TextView totalPrice = view.findViewById(R.id.totalPrice);

        titleTextView.setText("Price detail of your cake");

        layer.setText(String.valueOf(SingletonClass.layerPrice) + " $");
        sponge.setText(String.valueOf(SingletonClass.spongePrice) + " $");
        filling.setText(String.valueOf(SingletonClass.fillingPrice) + " $");
        icing.setText(String.valueOf(SingletonClass.icingPrice) + " $");
        garnish.setText(String.valueOf(SingletonClass.garnishPrice) + " $");

        title_layer.setText("Layer ("+SingletonClass.cakeProperties.getLayers()+")");
        title_sponge.setText("Sponge ("+SingletonClass.cakeProperties.getSponge()+")");
        title_filling.setText("Filling ("+SingletonClass.cakeProperties.getFilling()+")");
        title_icing.setText("Icing ("+SingletonClass.cakeProperties.getIcing()+")");
        title_garnish.setText("Garnish ("+SingletonClass.cakeProperties.getGarnish()+")");

        totalPrice.setText("Total Price: "+String.valueOf(SingletonClass.layerPrice + SingletonClass.spongePrice + SingletonClass.fillingPrice +
                SingletonClass.icingPrice + SingletonClass.garnishPrice + SingletonClass.tierPrice) + " $");

    }
}