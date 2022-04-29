package com.example.project_kayk.HelperClasses.HomeAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.project_kayk.R;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class TopAdapter extends RecyclerView.Adapter<TopAdapter.ViewHolder> {
    ArrayList<TopHelperClass> topViewed;

    public TopAdapter(ArrayList<TopHelperClass> topViewed) {
        this.topViewed = topViewed;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.top_bakeries,parent,false);
        ViewHolder topViewHolder = new ViewHolder(view);
        return topViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TopHelperClass topHelperClass = topViewed.get(position);
        holder.image.setImageResource(topHelperClass.getImage());
        holder.title.setText(topHelperClass.getTitle());

    }

    @Override
    public int getItemCount() {
        return topViewed.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView title;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.mini_treats);
            title = itemView.findViewById(R.id.minitreats_title);

        }
    }



}