package com.example.rizvi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import models.GridItem;
import models.ListItem;

public class ListActivity extends AppCompatActivity {

    private RecyclerView listRecycler;
    private ListAdapter listAdapter;
    private List<ListItem> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

            Intent intent = getIntent();

            Bundle args = intent.getBundleExtra("Bundle");
            list = (List<ListItem>) args.getSerializable("ArrayList");
            Log.d("TAG", "onCreate: " + list.size());

        listRecycler = findViewById(R.id.listRecycler);
        listAdapter = new ListAdapter(this, list);
        listRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        listRecycler.setAdapter(listAdapter);

    }
}
