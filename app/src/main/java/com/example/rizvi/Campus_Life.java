package com.example.rizvi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Campus_Life extends AppCompatActivity {

    List<button> Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campus__life);

        Button = new ArrayList<>();
        Button.add(new button("Infrastructure", "", "", 0));
        Button.add(new button("Committee", "", "", 0));
        Button.add(new button("Convocation Ceremony 2020", "", "", 0));
        Button.add(new button("SRMCA Marathon 2020", "", "", 0));
        Button.add(new button("Jashn-e-Rizvi", "", "", 0));
        Button.add(new button("NCC", "", "", 0));
        Button.add(new button("NSS", "", "", 0));
        Button.add(new button("Academic Calender", "", "", 0));
        Button.add(new button("Library", "", "", 0));
        Button.add(new button("Associations", "", "", 0));
        Button.add(new button("Hall Of Fame", "", "", 0));
        Button.add(new button("Circular", "", "", 0));
        Button.add(new button("Workshop and Seminar", "", "", 0));
        Button.add(new button("Award & Achievements", "", "", 0));
        Button.add(new button("Excursion and Field Trip", "", "", 0));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.campus_recyclerview);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, Button);
        myrv.setLayoutManager(new GridLayoutManager(this, 2));
        myrv.setAdapter(myAdapter);
    }
}
