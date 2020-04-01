package Campus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.rizvi.R;

import Adapters.InfrastructureAdapter;

public class JashneRizvi extends AppCompatActivity {

    private RecyclerView recyclerView;
    private int[] images;
    private String[] labels;
    private String[] url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jashne_rizvi);

        recyclerView = findViewById(R.id.Jashne_Rizvi_RecyclerView);
        images = new int[]{R.drawable.inuagration_ceremony, R.drawable.russian_night, R.drawable.fashion_show, R.drawable.musical_fusion,
                R.drawable.creativity_18jan, R.drawable.creativity_19jan, R.drawable.creativity_20jan};
        labels = new String[]{"Inaugration Celebration", "Indo Russian Night", "Fashion Show Night", "Musical Fusion Night","Creatives on 18th Jan 2020",
                "Creatives on 19th Jan 2020","Creatives on 20th Jan 2020"};
        url = new String[]{"http://www.rizvicollege.edu.in/jashn-e-rizvi-2020.html#group13-1",
                "http://www.rizvicollege.edu.in/jashn-e-rizvi-2020.html#group13-21", "http://www.rizvicollege.edu.in/jashn-e-rizvi-2020.html#group13-47",
                "http://www.rizvicollege.edu.in/jashn-e-rizvi-2020.html#group13-64","http://www.rizvicollege.edu.in/jashn-e-rizvi-2020.html#group13-81",
        "http://www.rizvicollege.edu.in/jashn-e-rizvi-2020.html#group12-1","http://www.rizvicollege.edu.in/jashn-e-rizvi-2020.html#group11-1"};

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(JashneRizvi.this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        InfrastructureAdapter infrastructureAdapter = new InfrastructureAdapter(JashneRizvi.this, images, labels, url);
        recyclerView.setAdapter(infrastructureAdapter);


    }
}
