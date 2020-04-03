package com.example.rizvi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import Campus.Assocation;
import Campus.Convocation2020;
import Campus.HallOfFame;
import Campus.Infrastructure;
import Campus.JashneRizvi;
import Campus.Marathon2020;
import Campus.Ncc;
import Campus.WorkShop;

public class CampusLife extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campus_life);

        final Button Infra_button = (Button) findViewById(R.id.CLInfra_btn);
        final Button Committee_button = (Button) findViewById(R.id.CLCommittee_btn);
        final Button Convocation2020_button = (Button) findViewById(R.id.CLConvo_btn);
        final Button Marathon2020_button = (Button) findViewById(R.id.CLMara_btn);
        final Button Jash_Rizvi = (Button) findViewById(R.id.CLJashn_btn);
        final Button NCC_button = (Button) findViewById(R.id.CLNCC_btn);
        final Button NSS_button = (Button) findViewById(R.id.CLNSS_btn);
        final Button Acad_cal_button = (Button) findViewById(R.id.CLAcad_Cal_btn);
        final Button Library_button = (Button) findViewById(R.id.CLLib_btn);
        final Button Assocation_button = (Button) findViewById(R.id.CLAssociations_btn);
        final Button Circular_button = (Button) findViewById(R.id.CLCircular_btn);
        final Button Award_button = (Button) findViewById(R.id.CLAward_btn);
        final Button HOF_button = (Button) findViewById(R.id.CLHF_btn);
        final Button Work_button = (Button) findViewById(R.id.CLWorkshop_btn);
        final Button Excursion_button = (Button) findViewById(R.id.CLExcursion_btn);

        Infra_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Infra_Intent= new Intent(CampusLife.this, Infrastructure.class);
                CampusLife.this.startActivity(Infra_Intent);
            }
        });

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

        Marathon2020_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Mara_Intent= new Intent(CampusLife.this, Marathon2020.class);
                CampusLife.this.startActivity(Mara_Intent);
            }
        });

        Jash_Rizvi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Jashna_Intent =  new Intent(CampusLife.this, JashneRizvi.class);
                startActivity(Jashna_Intent);
            }
        });

        NCC_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent NCC_Intent= new Intent(CampusLife.this, Ncc.class);
                CampusLife.this.startActivity(NCC_Intent);
            }
        });

        NSS_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent NSS_Intent= new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/nss.html"));
                startActivity(NSS_Intent);
            }
        });

        Acad_cal_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Acad_Intent= new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://redox-college.s3.ap-south-1.amazonaws.com/2017/Nov/22/4T5TYmzzSq5k3GS7qivZ.pdf"));
                startActivity(Acad_Intent);
            }
        });

        Library_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Lib_Intent= new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.librarydrdl.com/"));
                startActivity(Lib_Intent);
            }
        });

        Assocation_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Asso_Intent= new Intent(CampusLife.this, Assocation.class);
                CampusLife.this.startActivity(Asso_Intent);
            }
        });

        Circular_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Circ_Intent= new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://redox-college.s3.ap-south-1.amazonaws.com/rizvi/2018/Jan/10/Jb88YoN5fO6QUeT7opcW.pdf"));
                startActivity(Circ_Intent);
            }
        });

        Award_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Award_Intent= new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/achievement.html"));
                startActivity(Award_Intent);
            }
        });

        HOF_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent HOF_Intent= new Intent(CampusLife.this, HallOfFame.class);
                CampusLife.this.startActivity(HOF_Intent);
            }
        });

        Work_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Work_Intent= new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/workshop-and-seminar.html"));
                CampusLife.this.startActivity(Work_Intent);
            }
        });

        Excursion_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Work_Intent=new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/excursion-and-field-trips.html"));
                CampusLife.this.startActivity(Work_Intent);
            }
        });

    }
}
