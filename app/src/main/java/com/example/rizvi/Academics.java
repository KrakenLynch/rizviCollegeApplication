package com.example.rizvi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import Lists.CertificateCDetails;
import Lists.Collaborations;
import Lists.DegreeList;
import Lists.DopList;
import Lists.JuniorList;
import Lists.MasterList;

public class Academics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academics);

        final Button JCbutton = (Button) findViewById(R.id.JC_btn);
        final Button DGbutton = (Button) findViewById(R.id.Degree_btn);
        final Button MCbutton = (Button) findViewById(R.id.Master_btn);
        final Button DPbutton = (Button) findViewById(R.id.DOP_btn);
        final Button CCbutton = (Button) findViewById(R.id.Certificate_btn);
        final Button Collbutton = (Button) findViewById(R.id.Collabration_btn);


        JCbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent JCIntent = new Intent(Academics.this, JuniorList.class);
                Academics.this.startActivity(JCIntent);
            }
        });

        DGbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DGIntent = new Intent(Academics.this, DegreeList.class);
                Academics.this.startActivity(DGIntent);
            }
        });

        MCbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MCIntent = new Intent(Academics.this, MasterList.class);
                Academics.this.startActivity(MCIntent);
            }
        });

        DPbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DPIntent = new Intent(Academics.this, DopList.class);
                Academics.this.startActivity(DPIntent);
            }
        });

        CCbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CCIntent = new Intent(Academics.this, CertificateCDetails.class);
                Academics.this.startActivity(CCIntent);
            }
        });

        Collbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CIntent = new Intent(Academics.this, Collaborations.class);
                Academics.this.startActivity(CIntent);
            }
        });



    }
}
