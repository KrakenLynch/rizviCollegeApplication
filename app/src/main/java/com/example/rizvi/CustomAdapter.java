package com.example.rizvi;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.List;

import models.GridItem;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    private Context mContext;
    private List<GridItem> mData;

    public CustomAdapter(Context mContext, List<GridItem> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_box, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, final int position) {
        holder.button_label.setText(mData.get(position).getTitle());
        holder.cardView.setOnClickListener(new View.OnClickListener() { //Click Listener
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext, ListActivity.class);
                Bundle args = new Bundle();
                args.putSerializable("ArrayList",(Serializable) mData.get(position).getList());
                intent.putExtra("Bundle", args);
                mContext.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {

        TextView button_label;
        CardView cardView;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);

            button_label = (TextView) itemView.findViewById(R.id.button_title_id);
            cardView = (CardView) itemView.findViewById((R.id.button_card));
        }
    }
}
