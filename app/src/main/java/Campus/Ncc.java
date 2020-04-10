package Campus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rizvi.R;

public class Ncc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ncc);

        final Button Register =(Button) findViewById(R.id.Ncc_Report_btn);

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Register_intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://s3.ap-south-1.amazonaws.com/redox-live/2017/Sep/29/7oB4WMRFUOFM8P9qMYrP.pdf"));
                startActivity(Register_intent);
            }
        });
    }
}
