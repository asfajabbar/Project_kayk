package com.example.project_kayk.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project_kayk.Customise_Frag;
import com.example.project_kayk.R;
import com.example.project_kayk.model.CakeProperties;
import com.example.project_kayk.utils.SingletonClass;

import java.util.List;

public class NestedAdapter extends RecyclerView.Adapter<NestedAdapter.NestedViewHolder> {

    private List<String> mList;
    Context context;
    String property;

    public NestedAdapter(Context context, List<String> mList, String property)
    {
        this.context = context;
        this.mList = mList;
        this.property = property;
    }
    @NonNull
    @Override
    public NestedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.nested_item , parent , false);
        return new NestedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NestedViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.mTv.setText(mList.get(position));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (property)
                {
                    case "size":
                    {
//                        SingletonClass.price = SingletonClass.price + 100;
                        SingletonClass.cakeProperties.setSize(mList.get(position));
                        break;
                    }
                    case "layer":
                    {
//                        SingletonClass.price = SingletonClass.price + 100;
                        SingletonClass.cakeProperties.setLayers(mList.get(position));
                        break;
                    }
                    case "sponge":
                    {
                        SingletonClass.price = SingletonClass.price + 100;
                        SingletonClass.cakeProperties.setSponge(mList.get(position));
                        break;
                    }
                    case "filling":
                    {
                        SingletonClass.price = SingletonClass.price + 100;
                        SingletonClass.cakeProperties.setFilling(mList.get(position));
                        break;
                    }
                    case "icing":
                    {
                        SingletonClass.price = SingletonClass.price + 100;
                        SingletonClass.cakeProperties.setIcing(mList.get(position));
                        break;
                    }
                    case "garnish":
                    {
                        SingletonClass.price = SingletonClass.price + 100;
                        SingletonClass.cakeProperties.setGarnish(mList.get(position));
                        break;
                    }
                    case "tier":
                    {
                        SingletonClass.price = SingletonClass.price + 100;
                        SingletonClass.cakeProperties.setTiers(mList.get(position));
                        break;
                    }
                }

                for (CakeProperties cake : SingletonClass.getPropertiesOneLayer()) {
                    if (
                            cake.getLayers().equals(SingletonClass.cakeProperties.getLayers())
                            && cake.getSponge().equals(SingletonClass.cakeProperties.getSponge())
                            && cake.getFilling().equals(SingletonClass.cakeProperties.getFilling())
                            && cake.getIcing().equals(SingletonClass.cakeProperties.getIcing())
                            && cake.getGarnish().equals(SingletonClass.cakeProperties.getGarnish())
                            && cake.getTiers().equals(SingletonClass.cakeProperties.getTiers())

                    )
                    {
                        ((Customise_Frag) context).setImage(cake.getLayers()+"/"+cake.getImage()+".png");
                        Log.e("propertycake", cake.getLayers()+"/"+cake.getImage()+".png");
                        break;
                    }
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class NestedViewHolder extends RecyclerView.ViewHolder{
        private TextView mTv;
        public NestedViewHolder(@NonNull View itemView) {
            super(itemView);
            mTv = itemView.findViewById(R.id.nestedItemTv);
        }
    }
}
