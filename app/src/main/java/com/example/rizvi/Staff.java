package com.example.rizvi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Staff extends AppCompatActivity {
    List<button> Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff);

        Button = new ArrayList<>();
        Button.add(new button("Teaching Staff", "", "", 0));
        Button.add(new button("Non Teaching Staff", "", "", 0));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.staff_recyclerview);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, Button);
        myrv.setLayoutManager(new GridLayoutManager(this, 2));
        myrv.setAdapter(myAdapter);
    }
}
