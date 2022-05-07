package com.example.project_kayk.HelperClasses.HomeAdapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.project_kayk.Delivery;
import com.example.project_kayk.R;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.Collection;

public class TopAdapter extends RecyclerView.Adapter<TopAdapter.ViewHolder>  {
    ArrayList<TopHelperClass> topViewed;
    Context context;


    public TopAdapter(Context context,ArrayList<TopHelperClass> topViewed) {
        this.topViewed = topViewed;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.top_bakeries, parent, false);
        ViewHolder topViewHolder = new ViewHolder(view);
        return topViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TopHelperClass topHelperClass = topViewed.get(position);
        holder.image.setImageResource(topHelperClass.getImage());
        holder.title.setText(topHelperClass.getTitle());
        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Delivery.class);
                intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return topViewed.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image;
        TextView title;

        // RelativeLayout l1;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.mini_treats);
            title = itemView.findViewById(R.id.minitreats_title);
        }
    }
}





