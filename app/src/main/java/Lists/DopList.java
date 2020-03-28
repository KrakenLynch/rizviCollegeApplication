package Lists;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rizvi.R;

public class DopList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dop_list);

        final Button DPChem_button = (Button) findViewById(R.id.DP_Chem_list);
        final Button DPZool_button = (Button) findViewById(R.id.DP_Zool_list);
        final Button DPCom_button = (Button) findViewById(R.id.DP_Com_list);
        final Button DPBot_button = (Button) findViewById(R.id.DP_Bot_list);

        DPChem_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DPChemIntent = new Intent(DopList.this, DpChemDetails.class);
                DopList.this.startActivity(DPChemIntent);
            }
        });

        DPZool_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent JCArtsIntent = new Intent(DopList.this, DpZoolDetails.class);
                DopList.this.startActivity(JCArtsIntent);
            }
        });

        DPCom_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent JCArtsIntent = new Intent(DopList.this, DpComDetails.class);
                DopList.this.startActivity(JCArtsIntent);
            }
        });

        DPBot_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent JCArtsIntent = new Intent(DopList.this, DpBotDetais.class);
                DopList.this.startActivity(JCArtsIntent);
            }
        });

    }
}
