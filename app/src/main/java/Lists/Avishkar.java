package Lists;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.rizvi.R;

public class Avishkar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avishkar);

        final TextView Link = (TextView) findViewById(R.id.Avishkar_Link);

        Link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://redox-live.s3.ap-south-1.amazonaws.com/2017/Nov/13/Dpn3PI1nr7s79HgG48fR.pdf"));
                startActivity(intent);
            }
        });
    }
}
