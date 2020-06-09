package com.euit.listinandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProgrammingLanguageAdapter extends RecyclerView.Adapter<ProgrammingLanguageAdapter.RecyclerViewHolder> {

    private String[] programmingLanugaes;
    private String[] programmingLanuagesDetails;
    private Context context;

    public ProgrammingLanguageAdapter(String[] programmingLanugaes, String[] programmingLanuagesDetails, Context context) {
        this.programmingLanugaes = programmingLanugaes;
        this.programmingLanuagesDetails = programmingLanuagesDetails;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.item_list, parent, false);
        return new RecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.tv_title.setText(programmingLanugaes[position]);
        holder.tv_sub_title.setText(programmingLanuagesDetails[position]);
    }

    @Override
    public int getItemCount() {
        return programmingLanugaes.length;
    }

    public class RecyclerViewHolder extends  RecyclerView.ViewHolder{

        public TextView tv_title, tv_sub_title;
        public ImageView imgv_image;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_title = itemView.findViewById(R.id.tv_title);
            tv_sub_title = itemView.findViewById(R.id.tv_sub_title);
            imgv_image = itemView.findViewById(R.id.imgv_image);

        }
    }
}
