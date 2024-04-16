package com.example.mytask.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.example.mytask.Domain.Works;
import com.example.mytask.R;

import java.util.ArrayList;

public class MyTaskAdapter extends RecyclerView.Adapter <MyTaskAdapter.viewholder>{
    ArrayList<Works>items;
    Context context;

    public MyTaskAdapter(ArrayList<Works> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public MyTaskAdapter.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context= parent.getContext();
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_best,parent,false);
        return new viewholder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull MyTaskAdapter.viewholder holder, int position) {
holder.titleText.setText(items.get(position).getTitle());
holder.priceText.setText("DA"+ items.get(position).getPrice());
holder.timeText.setText(items.get(position).getTimeValue()+"day");
holder.starText.setText(""+items.get(position).getStar());

Glide.with(context)
        .load(items.get(position).getImagePath())
        .transform(new CenterCrop(),new RoundedCorners(30))
        .into(holder.pic);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        TextView titleText,priceText,starText,timeText;
        ImageView pic;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            titleText=itemView.findViewById(R.id.titleText);
            priceText=itemView.findViewById(R.id.priceText);
            starText=itemView.findViewById(R.id.starText);
            timeText=itemView.findViewById(R.id.timeText);
            pic=itemView.findViewById(R.id.pic);
        }
    }
}
