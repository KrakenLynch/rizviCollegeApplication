package Lists;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.rizvi.Alumni;
import com.example.rizvi.R;

public class AlumniEvents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumni_events);

        final TextView Link1 = (TextView) findViewById(R.id.ALEvents_Link1);
        final TextView Link2 = (TextView) findViewById(R.id.ALEvents_OctLink);
        final TextView Link3 = (TextView) findViewById(R.id.ALEvents_MarchLink);

        Link1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link_intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/pdf/Alumni%20Meet%202018_19.pdf"));
                startActivity(link_intent);
            }
        });

        Link2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link_intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/pdf/Alumni%20Meet%20Oct%202017.pdf"));
                startActivity(link_intent);
            }
        });

        Link3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link_intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/pdf/Alumni%20Meet%20March%202018.pdf"));
                startActivity(link_intent);
            }
        });

    }
}
