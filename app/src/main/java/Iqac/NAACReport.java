package Iqac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.rizvi.R;

public class NAACReport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n_a_a_c_report);

        final TextView Link1 = (TextView) findViewById(R.id.NAAC_Link1);
        final TextView Link2 = (TextView) findViewById(R.id.NAAC_Link2);
        final TextView Link3 = (TextView) findViewById(R.id.NAAC_Link3);
        final TextView Link4 = (TextView) findViewById(R.id.NAAC_Link4);
        final TextView Link5 = (TextView) findViewById(R.id.NAAC_Link5);
        final TextView Link6 = (TextView) findViewById(R.id.NAAC_Link6);
        final TextView Link7 = (TextView) findViewById(R.id.NAAC_Link7);
        final TextView Link8 = (TextView) findViewById(R.id.NAAC_Link8);

        Link1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link1_intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/sites/default/files/compliance-scerificate.pdf"));
                startActivity(link1_intent);
            }
        });

        Link2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link2_intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/sites/default/files/AQAR-2011-12.pdf"));
                startActivity(link2_intent);
            }
        });

        Link3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link3_intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/sites/default/files/AQAR-2012-13.pdf"));
                startActivity(link3_intent);
            }
        });

        Link4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link4_intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/sites/default/files/AQAR-2013-14.pdf"));
                startActivity(link4_intent);
            }
        });

        Link5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link5_intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/sites/default/files/AQAR-2014-15.pdf"));
                startActivity(link5_intent);
            }
        });

        Link6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link6_intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/sites/default/files/AQAR-2015-16.pdf"));
                startActivity(link6_intent);
            }
        });

        Link7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link7_intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/sites/default/files/AQAR-2016-17.pdf"));
                startActivity(link7_intent);
            }
        });

        Link8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link8_intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/sites/default/files/AQAR-2017-18.pdf"));
                startActivity(link8_intent);
            }
        });
    }
}
