package Lists;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.rizvi.R;

public class AdminProspectus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_prospectus);

        final ImageButton Main_prop_btn = (ImageButton) findViewById(R.id.Main_prospectus_btn);
        final ImageButton Self_prop_btn = (ImageButton) findViewById(R.id.Self_prospectus_btn);

        Main_prop_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent TIntent= new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/static/rizvi/dist/images/alumni/pdf/prospects/main-brochure.pdf"));
                startActivity(TIntent);
            }
        });

        Self_prop_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent NTIntent= new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/static/rizvi/dist/images/alumni/pdf/prospects/self-finance-brochure.pdf "));
                startActivity(NTIntent);
            }
        });
    }
}
