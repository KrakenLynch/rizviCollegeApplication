package Campus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rizvi.Mphotos;
import com.example.rizvi.R;

public class Marathon2020 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marathon2020);

        final Button MPhotos =(Button) findViewById(R.id.MPhotos_btn);
        final Button MRegister = (Button) findViewById(R.id.Marathon_RegisterLink_btn);

        MPhotos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Mphotos_intent = new Intent(Marathon2020.this, Mphotos.class);
                startActivity(Mphotos_intent);
            }
        });

        MRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MRegister_intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.townscript.com/e/rizvi-cancer-awareness-marathon-2020"));
                startActivity(MRegister_intent);
            }
        });

    }
}
