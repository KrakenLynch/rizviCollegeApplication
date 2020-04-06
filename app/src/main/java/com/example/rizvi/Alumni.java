package com.example.rizvi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import Lists.AlumniCommitte;
import Lists.AlumniEvents;
import Lists.AlumniGallery;
import Lists.AlumniOverview;
import Lists.AlumniSpeak;
import Lists.FamousAlumni;

public class Alumni extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumni);

        final Button Overview = (Button) findViewById(R.id.AlumniOverview_btn);
        final Button Committee = (Button) findViewById(R.id.AlumniCommittee_btn);
        final Button Events = (Button) findViewById(R.id.AlumniEvents_btn);
        final Button Gallery = (Button) findViewById(R.id.AlumniGallery_btn);
        final Button FAlumni = (Button) findViewById(R.id.FamousAlumni_btn);
        final Button Speak = (Button) findViewById(R.id.AlumniSpeak_btn);

        Overview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Over_intent = new Intent(Alumni.this, AlumniOverview.class);
                startActivity(Over_intent);
            }
        });

        Committee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Comm_intent = new Intent(Alumni.this, AlumniCommitte.class);
                startActivity(Comm_intent);
            }
        });

        Events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent E_intent = new Intent(Alumni.this, AlumniEvents.class);
                startActivity(E_intent);
            }
        });

        Gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent G_intent = new Intent(Alumni.this, AlumniGallery.class);
                startActivity(G_intent);
            }
        });

        FAlumni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent G_intent = new Intent(Alumni.this, FamousAlumni.class);
                startActivity(G_intent);
            }
        });

        Speak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent G_intent = new Intent(Alumni.this, AlumniSpeak.class);
                startActivity(G_intent);
            }
        });

    }
}
