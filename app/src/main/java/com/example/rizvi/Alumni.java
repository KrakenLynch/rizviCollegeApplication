package com.example.rizvi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Alumni extends AppCompatActivity {
    List<button> Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumni);

        Button = new ArrayList<>();
        Button.add(new button("Alumni Overview", "", "", 0));
        Button.add(new button("Committee", "", "", 0));
        Button.add(new button("Gallery", "", "", 0));
        Button.add(new button("Events", "", "", 0));
        Button.add(new button("Registration", "", "", 0));
        Button.add(new button("Famous Alumni", "", "", 0));
        Button.add(new button("Alumni Speak", "", "", 0));
        Button.add(new button("Feedback", "", "", 0));
        Button.add(new button("Alumni Contact Us", "", "", 0));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.Alumni_recyclerview);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, Button);
        myrv.setLayoutManager(new GridLayoutManager(this, 2));
        myrv.setAdapter(myAdapter);
    }
}
