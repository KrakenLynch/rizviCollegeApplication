package Lists;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rizvi.R;

public class MasterList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master_list);

        final Button MSc_button = (Button) findViewById(R.id.MC_MSc_list);
        final Button MCom_button = (Button) findViewById(R.id.MC_MCom_list);

        MSc_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent JCArtsIntent = new Intent(MasterList.this, MScDetails.class);
                MasterList.this.startActivity(JCArtsIntent);
            }
        });

        MCom_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Mcom_Intent= new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/mcom.html"));
                startActivity(Mcom_Intent);
            }
        });
    }
}
