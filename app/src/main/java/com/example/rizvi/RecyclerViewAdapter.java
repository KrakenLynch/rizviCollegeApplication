package com.example.rizvi;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private List<button> mData;

    public RecyclerViewAdapter(Context mContext, List<button> mData) {
        this.mContext = mContext;
        this.mData = mData;

    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_box, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.button_label.setText(mData.get(position).getTitle());
        holder.cardView.setOnClickListener(new View.OnClickListener() { //Click Listener
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext, Description_activity.class);
                intent.putExtra("Title", mData.get(position).getTitle());
                intent.putExtra("Description", mData.get(position).getDescription());
                intent.putExtra("Thumbnail", mData.get(position).getThumbnail());
                mContext.startActivity(intent);

                /*Intent intent_acad = new Intent(mContext,Academics.class);
                intent.putExtra("Title", mData.get(position).getTitle());
                mContext.startActivity(intent_acad);*/
            }
        });


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView button_label;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            button_label = (TextView) itemView.findViewById(R.id.button_title_id);
            cardView = (CardView) itemView.findViewById((R.id.button_card));
        }
    }
}
