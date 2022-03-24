package com.fourcade7.java_recyclerview;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DotaAdapter extends RecyclerView.Adapter<DotaAdapter.DotaViewHolder> {

    Context context;
    ArrayList<Dota> dotaArrayList;

    public DotaAdapter(Context context, ArrayList<Dota> dotaArrayList) {
        this.context = context;
        this.dotaArrayList = dotaArrayList;
    }

    @NonNull
    @Override
    public DotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.dota_layout,parent,false);
        return new DotaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DotaViewHolder holder, int position) {

        holder.imageView.setImageResource(dotaArrayList.get(position).getImagehero());
        if (position%2==1){
            holder.imageView.getLayoutParams().height= 320;
        }else {
            holder.imageView.getLayoutParams().height= 520;
        }
        holder.textView.setText(dotaArrayList.get(position).getNamehero());
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(context,MainActivity2.class);
                intent.putExtra("img",dotaArrayList.get(position).getImagehero());
                intent.putExtra("name",dotaArrayList.get(position).getNamehero());
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return dotaArrayList.size();
    }

    public class DotaViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;
        LinearLayout layout;

        public DotaViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageview1);
            textView=itemView.findViewById(R.id.textview1);
            layout=itemView.findViewById(R.id.linearlayout1);
        }
    }
}
