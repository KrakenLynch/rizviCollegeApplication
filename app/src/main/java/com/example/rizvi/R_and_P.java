package com.example.rizvi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class R_and_P extends AppCompatActivity {

    List<button> Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r_and__p);

        Button = new ArrayList<>();
        Button.add(new button("Research", "", "", 0));
        Button.add(new button("Publication", "", "", 0));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.RP_recyclerview);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, Button);
        myrv.setLayoutManager(new GridLayoutManager(this, 2));
        myrv.setAdapter(myAdapter);
    }
}
