package com.example.project_kayk.HelperClasses.HomeAdapter;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.project_kayk.Delivery;
import com.example.project_kayk.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

public class mostViewedAdapter extends RecyclerView.Adapter<mostViewedAdapter.ViewHolder> {
    ArrayList<MostViewedHelperClass> mostViewed;
    Context context;


    public mostViewedAdapter(Context context, ArrayList<MostViewedHelperClass> mostViewed) {
        this.mostViewed = mostViewed;
        this.context = context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.most_viewed, parent, false);
        ViewHolder mostViewHolder = new ViewHolder(view);
        return mostViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        MostViewedHelperClass mostViewedHelperClass = mostViewed.get(position);
        holder.image.setImageResource(mostViewedHelperClass.getImage());
        holder.title.setText(mostViewedHelperClass.getTitle());
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
        return mostViewed.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView title;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.layers_image);
            title = itemView.findViewById(R.id.layer_title);




        }
    }


}