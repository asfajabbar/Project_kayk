package com.example.project_kayk;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

public class ListAdapter extends ArrayAdapter {

    private Activity mContext;
    List<add_set_get> addList;
    public ListAdapter(Activity mContext, List<add_set_get> addList) {
        super(mContext, R.layout.list_item, addList);
        this.mContext = mContext;
        this.addList= addList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater= mContext.getLayoutInflater();
        View listItemView = inflater. inflate(R.layout.list_item, null, true);
        TextView address= listItemView.findViewById(R.id.address);
        TextView city= listItemView.findViewById(R.id.city);
        TextView postal= listItemView.findViewById(R.id.postal);
        // address
        add_set_get add=  addList.get(position);
        //address setters
        address.setText(add.getAddress());
        city.setText(add.getCity());
        postal.setText(add.getPostal());
        return listItemView;
    }
}

