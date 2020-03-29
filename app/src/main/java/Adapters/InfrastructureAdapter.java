package Adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rizvi.R;

public class InfrastructureAdapter extends RecyclerView.Adapter<InfrastructureAdapter.InfrastructureModel> {

    private Context context;
    private int[] images;
    private String[] labels;
    private String[] urls;



    public InfrastructureAdapter(Context context, int[] images, String[] label, String[] url) {
        this.context = context;
        this.images = images;
        this.urls = url;
        this.labels = label;
    }

    @NonNull
    @Override
    public InfrastructureModel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.infrastructure_recycler_item, parent, false);
        return new InfrastructureModel(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final InfrastructureModel holder, int position) {
        holder.image.setImageResource(images[position]);
        holder.label.setText(labels[position]);
        holder.url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(urls[holder.getAdapterPosition()]));
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    class InfrastructureModel extends RecyclerView.ViewHolder {

        ImageView image;
        TextView label;
        Button url;

        public InfrastructureModel(@NonNull View itemView) {
            super(itemView);

            image = (ImageView) itemView.findViewById(R.id.Iv_Image);
            label = (TextView) itemView.findViewById(R.id.Iv_Lable);
            url = (Button) itemView.findViewById(R.id.Iv_More_Button);
        }
    }
}
