package com.example.rizvi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import Lists.Avishkar;
import Lists.ResearchCenter;
import Lists.ResearchPubDetails;

public class ResearchAndPublication extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research_and_publication);

        final Button Rp_Research = (Button) findViewById(R.id.RPPublication_btn);
        final Button MajorMinor = (Button) findViewById(R.id.RPMajorMinor_btn);
        final Button InterJrnl = (Button) findViewById(R.id.RPInternational_btn);
        final Button News = (Button) findViewById(R.id.RPNews_btn);
        final Button RCenter = (Button) findViewById(R.id.RPCenter_btn);
        final Button Avishkar = (Button) findViewById(R.id.RPAvishkar_btn);


        Rp_Research.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RpResearch_intent = new Intent(ResearchAndPublication.this, ResearchPubDetails.class);
                startActivity(RpResearch_intent);
            }
        });

        MajorMinor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MM_intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/major-minor-research.html"));
                startActivity(MM_intent);
            }
        });

        InterJrnl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent IJ_intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://internationaljournalofresearch.co.in/"));
                startActivity(IJ_intent);
            }
        });

        News.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent News_intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://redox-college.s3.ap-south-1.amazonaws.com/2017/Dec/08/iAQFEzev1MDQteCsrrN4.pdf"));
                startActivity(News_intent);
            }
        });

        RCenter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent RCenter_Intent = new Intent(ResearchAndPublication.this, ResearchCenter.class);
                startActivity(RCenter_Intent);
            }
        });

        Avishkar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Avish_Intent = new Intent(ResearchAndPublication.this, Lists.Avishkar.class);
                startActivity(Avish_Intent);
            }
        });
    }
}
