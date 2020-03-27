package Lists;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rizvi.R;

public class JuniorList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_junior_list);

        final Button Arts_button = (Button) findViewById(R.id.Jr_Arts_list);
        final Button Science_button = (Button) findViewById(R.id.Jr_Science_list);
        final Button Commerce_button = (Button) findViewById(R.id.Jr_Commerce_list);
        final Button mcvc_button = (Button) findViewById(R.id.Jr_mcvc_list);

        Arts_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent JCArtsIntent = new Intent(JuniorList.this, JrArtsDetails.class);
                JuniorList.this.startActivity(JCArtsIntent);
            }
        });

        Science_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent JCScienceIntent = new Intent(JuniorList.this, JrScienceDetails.class);
                JuniorList.this.startActivity(JCScienceIntent);
            }
        });

        Commerce_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent JCCommerceIntent = new Intent(JuniorList.this, JrCommerceDetails.class);
                JuniorList.this.startActivity(JCCommerceIntent);
            }
        });

        mcvc_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent JCmcvcIntent = new Intent(JuniorList.this, JrMcvcDetails.class);
                JuniorList.this.startActivity(JCmcvcIntent);
            }
        });


    }
}
