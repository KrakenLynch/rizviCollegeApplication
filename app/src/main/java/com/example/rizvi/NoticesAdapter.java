package com.example.rizvi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NoticesAdapter extends RecyclerView.Adapter<NoticesAdapter.CustomViewHolder> {

    private Context context;
    private List<NoticesModel> noticesModelList;

    public NoticesAdapter(Context context, List<NoticesModel> noticesModelList) {
        this.context = context;
        this.noticesModelList = noticesModelList;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.notices_recycler_item, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.title.setText(noticesModelList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return noticesModelList.size();
    }

    public static class CustomViewHolder extends RecyclerView.ViewHolder {

        TextView title;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.tvNoticeTitle);
        }
    }

}
