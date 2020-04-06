package Lists;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.rizvi.R;

import Adapters.InfrastructureAdapter;
import Campus.JashneRizvi;

public class FamousAlumni extends AppCompatActivity {

    private RecyclerView recyclerView;
    private int[] images;
    private String[] labels;
    private String[] url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_famous_alumni);

        recyclerView = findViewById(R.id.FamousAlumni_RecyclerView);
        images = new int[]{R.drawable.poojabhatt,R.drawable.shashan_shah, R.drawable.amjad_khan, R.drawable.rehman_khan,R.drawable.daya,R.drawable.zareen_khan,
        R.drawable.waseem_jaffer, R.drawable.rohit_sharma,R.drawable.ajinkya_rahane,R.drawable.dhawal_kul};
        labels = new String[]{"Pooja Bhatt","Shashan Shah","Seemab Amjad Khan", "Rehman Khan", "Dayanand Shetty","Zareen Khan","Waseem Jaffer","Rohit Sharma",
        "Ajinkya Rahane","Dhawal Kulkarni"};
        url = new String[]{"https://en.wikipedia.org/wiki/Pooja_Bhatt","https://www.filmibeat.com/celebs/shashant-shah.html","","https://en.wikipedia.org/wiki/Rehman_Khan",
        "https://en.wikipedia.org/wiki/Dayanand_Shetty","https://en.wikipedia.org/wiki/Zareen_Khan","https://en.wikipedia.org/wiki/Wasim_Jaffer","https://en.wikipedia.org/wiki/Rohit_Sharma",
        "https://en.wikipedia.org/wiki/Ajinkya_Rahane","https://en.wikipedia.org/wiki/Dhawal_Kulkarni"};

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(FamousAlumni.this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        InfrastructureAdapter infrastructureAdapter = new InfrastructureAdapter(FamousAlumni.this, images, labels, url);
        recyclerView.setAdapter(infrastructureAdapter);
    }
}
