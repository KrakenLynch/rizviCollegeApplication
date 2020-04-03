package com.example.rizvi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import Lists.AdminProspectus;
import Lists.SelfProspectous;

public class Admission extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admission);

        final Button AdminPros_Btn = (Button) findViewById(R.id.Staff_Teaching_btn);
        final Button AdminOCA_Btn = (Button) findViewById(R.id.Staff_NonTeaching_btn);

        AdminPros_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent APIntent= new Intent(Admission.this, AdminProspectus.class);
                startActivity(APIntent);
            }
        });

        AdminOCA_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent NTIntent= new Intent(Admission.this, SelfProspectous.class);
                startActivity(NTIntent);
            }
        });
    }
}
