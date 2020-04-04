package Iqac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.rizvi.R;

public class MinOfMeeting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_min_of_meeting);

        final TextView Link1 = (TextView) findViewById(R.id.MMLink1);
        final TextView Link2 = (TextView) findViewById(R.id.MMLink2);
        final TextView Link3 = (TextView) findViewById(R.id.MMLink3);
        final TextView Link4 = (TextView) findViewById(R.id.MMLink4);

        Link1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link1_intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/pdf/minutes/Minuts%20of%20Meeting0001.pdf"));
                startActivity(link1_intent);
            }
        });

        Link2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link2_intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/pdf/minutes/Minuts%20of%20Meeting0002.pdf"));
                startActivity(link2_intent);
            }
        });

        Link3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link3_intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/pdf/minutes/Minuts%20of%20Meeting0003.pdf"));
                startActivity(link3_intent);
            }
        });

        Link4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link4_intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/pdf/minutes/Minuts%20of%20Meeting0004.pdf"));
                startActivity(link4_intent);
            }
        });
    }
}
