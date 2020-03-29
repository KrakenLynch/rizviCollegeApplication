package Campus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.LinearLayout;

import com.example.rizvi.R;

import java.util.ArrayList;
import java.util.List;

import Adapters.InfrastructureAdapter;
import Models.InfrastructureModel;

public class Infrastructure extends AppCompatActivity {

    private RecyclerView recyclerView;
    private int[] images;
    private String[] labels;
    private String[] url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infrastructure);

        recyclerView = findViewById(R.id.Infrastructure_RecyclerView);
        images = new int[]{R.drawable.chemlab_image, R.drawable.library_infra, R.drawable.computer_lab_infra, R.drawable.sci_lab};
        labels = new String[]{"Bootany and Zoology Lab", "Library", "Computer Lab", "Chemistry Lab"};
        url = new String[]{"http://www.rizvicollege.edu.in/infrastructure.html#group20-1",
                "http://www.librarydrdl.com/photos.html", "http://www.rizvicollege.edu.in/infrastructure.html#group9-1",
                "http://www.rizvicollege.edu.in/infrastructure.html#group8-1"};

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(Infrastructure.this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        InfrastructureAdapter infrastructureAdapter = new InfrastructureAdapter(Infrastructure.this, images, labels, url);
        recyclerView.setAdapter(infrastructureAdapter);


    }
}
