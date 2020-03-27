package com.example.rizvi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import Lists.DegreeList;
import Lists.JuniorList;

public class Academics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academics);

        final Button JCbutton = (Button) findViewById(R.id.JC_btn);
        final Button DGbutton = (Button) findViewById(R.id.Degree_btn);

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

    }
}
