package com.example.rizvi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import Campus.Convocation2020;

public class CampusLife extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campus_life);

        final Button Committee_button = (Button) findViewById(R.id.CLCommittee_btn);
        final Button Convocation2020_button = (Button) findViewById(R.id.CLConvo_btn);

        Committee_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BA_Intent= new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/committee.html"));
                startActivity(BA_Intent);
            }
        });

        Convocation2020_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BA_Intent= new Intent(CampusLife.this, Convocation2020.class);
                CampusLife.this.startActivity(BA_Intent);
            }
        });
    }
}
