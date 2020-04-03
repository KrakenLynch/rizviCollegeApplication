package Lists;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.rizvi.R;

public class ResearchPubDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research_pub_details);

        final TextView RP_Link1 = (TextView) findViewById(R.id.RP_Link1);
        final TextView RP_Link2 = (TextView) findViewById(R.id.RP_Link2);
        final TextView RP_Link3 = (TextView) findViewById(R.id.RP_Link3);

        RP_Link1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Link1_Intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/static/rizvi/dist/images/pdf/research-publication/research/research-publications/rizvi-college-arts-science-commerce-published-in-journal.pdf"));
                startActivity(Link1_Intent);
            }
        });

        RP_Link2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Link2_Intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/static/rizvi/dist/images/pdf/research-publication/research/research-publications/rizvi-college-arts-science-commerce-published-in-conference-proceedings.pdf"));
                startActivity(Link2_Intent);
            }
        });

        RP_Link3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Link3_Intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/static/rizvi/dist/images/pdf/research-publication/research/research-publications/rizvi-college-arts-science-commerce-published-in-papers-in-seminars-conferences.pdf"));
                startActivity(Link3_Intent);
            }
        });
    }
}
