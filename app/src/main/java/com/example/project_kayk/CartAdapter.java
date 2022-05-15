package com.example.project_kayk;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.project_kayk.model.CartModel;

import java.util.List;

public class CartAdapter extends ArrayAdapter {
    private Activity mContext;
    List<cart_set_get> cartList;
    public CartAdapter(@NonNull Activity context, List<cart_set_get> cartList ) {
        super(context, R.layout.cart_list_item, cartList);
        this.cartList= cartList;
        this.mContext = context;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater= mContext.getLayoutInflater();
        View v = inflater. inflate(R.layout.cart_list_item, null, true);
        TextView txt_Name= (TextView) v.findViewById(R.id.name);
        TextView txt_Price= (TextView) v.findViewById(R.id.price);
        TextView txt_quantity= (TextView) v.findViewById(R.id.quantity);
        TextView txt_key= (TextView) v.findViewById(R.id.key);

        //cart
        cart_set_get cart= cartList.get(position);
        //cart setters
        txt_key.setText((cart.getKey()));
        txt_Name.setText(cart.getName());
        txt_Price.setText((cart.getTotalPrice()));
        txt_quantity.setText(cart.getQuantity());
        return v;
    }
}
