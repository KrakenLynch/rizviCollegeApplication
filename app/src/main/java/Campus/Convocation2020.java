package Campus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rizvi.CampusLife;
import com.example.rizvi.R;

public class Convocation2020 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convocation2020);

        final Button CBAL_button = (Button) findViewById(R.id.Convo_BA_btn);
        final Button CBComL_button = (Button) findViewById(R.id.Convo_BCom_btn);
        final Button CBMM_button = (Button) findViewById(R.id.Convo_BMM_btn);
        final Button CBMS_button = (Button) findViewById(R.id.Convo_BMS_btn);
        final Button CBSc_button = (Button) findViewById(R.id.Convo_BSc_btn);
        final Button CMCom_button = (Button) findViewById(R.id.Convo_MCom_btn);
        final Button CR_button = (Button) findViewById(R.id.Convo_RConvo_btn);
        final Button CTL_button = (Button) findViewById(R.id.Convo_Toppers_btn);
        final Button CCG_button = (Button) findViewById(R.id.Convo_Growns_btn);

        CBAL_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CBAL_Intent= new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/pdf/convo/BA.pdf"));
                startActivity(CBAL_Intent);
            }
        });

        CBComL_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CBCom_Intent= new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/pdf/convo/BCom.pdf"));
                startActivity(CBCom_Intent);
            }
        });

        CBMM_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CBMM_Intent= new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/pdf/convo/BMM.pdf"));
                startActivity(CBMM_Intent);
            }
        });

        CBMS_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CBMS_Intent= new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/pdf/convo/BMS.pdf"));
                startActivity(CBMS_Intent);
            }
        });

        CBSc_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CBSc_Intent= new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/pdf/convo/BSc.pdf"));
                startActivity(CBSc_Intent);
            }
        });

        CMCom_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CMCom_Intent= new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/pdf/convo/MCom.pdf"));
                startActivity(CMCom_Intent);
            }
        });

        CR_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CR_Intent= new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLScutKGkhWCkquiOlchKW4QIN_ovZEA-lp_Zoe_M5MmQUTX12Q/viewform"));
                startActivity(CR_Intent);
            }
        });

        CTL_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CTL_Intent= new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/pdf/convo/topperslist.pdf"));
                startActivity(CTL_Intent);
            }
        });

        CCG_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CCG_Intent= new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/pdf/convo/Room%20Allotment%20for%20Gowns.pdf"));
                startActivity(CCG_Intent);
            }
        });
    }
}
