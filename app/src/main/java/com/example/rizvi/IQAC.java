package com.example.rizvi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import Iqac.IqacActivity;

public class IQAC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_q_a_c);

        final Button Committee = (Button) findViewById(R.id.IQACCommitte_btn);
        final Button Activity = (Button) findViewById(R.id.IQACActivity_btn);

        Committee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Comm_intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/pdf/IQAC%20working%20Committee.pdf"));
                startActivity(Comm_intent);
            }
        });

        Activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Act_intent = new Intent(IQAC.this, IqacActivity.class);
                startActivity(Act_intent);
            }
        });
    }
}
