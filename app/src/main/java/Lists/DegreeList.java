package Lists;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rizvi.Academics;
import com.example.rizvi.R;

public class DegreeList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_degree_list);

        final Button BA_button = (Button) findViewById(R.id.Dg_BA_list);
        final Button BCom_button = (Button) findViewById(R.id.Dg_BCom_list);
        final Button BSc_button = (Button) findViewById(R.id.Dg_BSc_list);
        final Button BMS_button = (Button) findViewById(R.id.Dg_BMS_list);
        final Button BMM_button = (Button) findViewById(R.id.Dg_BMM_list);
        final Button BBI_button = (Button) findViewById(R.id.Dg_BBI_list);
        final Button BAF_button = (Button) findViewById(R.id.Dg_BAF_list);
        final Button BScIT_button = (Button) findViewById(R.id.Dg_BSc_IT_list);
        final Button BScCS_button = (Button) findViewById(R.id.Dg_BSc_CS_list);

        BA_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BA_Intent= new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/ba.html"));
                startActivity(BA_Intent);
            }
        });

        BCom_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BCom_Intent= new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/bcom.html"));
                startActivity(BCom_Intent);
            }
        });

        BSc_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BSc_Intent= new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/bsc.html"));
                startActivity(BSc_Intent);
            }
        });

        BMS_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BMS_Intent= new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/bms.html"));
                startActivity(BMS_Intent);
            }
        });

        BMM_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BMM_Intent= new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/bmm.html"));
                startActivity(BMM_Intent);
            }
        });

        BBI_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BBI_Intent= new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/bbi.html"));
                startActivity(BBI_Intent);
            }
        });

        BScIT_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BscIT_Intent= new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/bsc-it.html"));
                startActivity(BscIT_Intent);
            }
        });

        BAF_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BAF_Intent= new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/baf.html"));
                startActivity(BAF_Intent);
            }
        });

        BScCS_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BscCs_Intent= new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/bsc-cs.html"));
                startActivity(BscCs_Intent);
            }
        });
    }
}
