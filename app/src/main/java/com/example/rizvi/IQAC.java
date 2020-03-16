package com.example.rizvi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class IQAC extends AppCompatActivity {

    List<button> Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_q_a_c);

        Button = new ArrayList<>();
        Button.add(new button("IQAC Committee", "", "", 0));
        Button.add(new button("IQAC Activities", "", "", 0));
        Button.add(new button("Minutes of Meetings", "", "", 0));
        Button.add(new button("Relevant Documents", "", "", 0));
        Button.add(new button("NAAC Reports", "", "", 0));



        RecyclerView myrv = (RecyclerView) findViewById(R.id.IQAC_recyclerview);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, Button);
        myrv.setLayoutManager(new GridLayoutManager(this, 2));
        myrv.setAdapter(myAdapter);
    }
}
