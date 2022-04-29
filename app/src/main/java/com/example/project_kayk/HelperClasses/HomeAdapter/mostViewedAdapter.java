package com.example.project_kayk.HelperClasses.HomeAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_kayk.R;

import java.util.ArrayList;

public class mostViewedAdapter extends RecyclerView.Adapter<mostViewedAdapter.ViewHolder> {
    ArrayList<MostViewedHelperClass> mostViewed;

    public mostViewedAdapter(ArrayList<MostViewedHelperClass> mostViewed) {
        this.mostViewed = mostViewed;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.most_viewed,parent,false);
        ViewHolder mostViewHolder = new ViewHolder(view);

        return mostViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       MostViewedHelperClass mostViewedHelperClass = mostViewed.get(position);
        holder.image.setImageResource(mostViewedHelperClass.getImage());
        holder.title.setText(mostViewedHelperClass.getTitle());


    }

    @Override
    public int getItemCount() {
        return mostViewed.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView title;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.layers_image);
            title = itemView.findViewById(R.id.layer_title);


        }
    }


}
