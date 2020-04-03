package Lists;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.rizvi.R;

public class SelfProspectous extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_prospectous);

        final TextView Link1 = (TextView) findViewById(R.id.SP_Link1);
        final TextView Link2 = (TextView) findViewById(R.id.SP_Link2);
        final TextView Link3 = (TextView) findViewById(R.id.SP_Link3);
        final TextView Link4 = (TextView) findViewById(R.id.SP_Link4);

        Link1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Link1_intent= new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/pdf/11th%20admission%20Schedule%20(minority%20and%20online).pdf"));
                startActivity(Link1_intent);
            }
        });

        Link2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Link2_intent= new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://rizvi.digitaledu.in/"));
                startActivity(Link2_intent);
            }
        });

        Link3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Link3_intent= new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizviasc.eadmissions.co.in/cgi-sys/suspendedpage.cgi"));
                startActivity(Link3_intent);
            }
        });

        Link4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Link4_intent= new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/pdf/admission-guidelines-2019-20.pdf"));
                startActivity(Link4_intent);
            }
        });
    }
}
