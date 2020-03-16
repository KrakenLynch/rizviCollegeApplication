package com.example.rizvi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Academics extends AppCompatActivity {

    List<button> Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academics);

        Button = new ArrayList<>();
        Button.add(new button("Junior College", "", "", 0));
        Button.add(new button("Degree College", "", "", 0));
        Button.add(new button("Master College", "", "", 0));
        Button.add(new button("Doctorate of Philosophy", "", "", 0));
        Button.add(new button("Certificate Courses", "", "", 0));
        Button.add(new button("Collaboration", "", "", 0));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.Academics_recyclerview);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, Button);
        myrv.setLayoutManager(new GridLayoutManager(this, 2));
        myrv.setAdapter(myAdapter);
    }
}
