package com.example.rizvi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

import Lists.AboutDeveloper;

public class Settings extends AppCompatActivity {

    FirebaseAuth fAuth;
    TextView logout,Dev;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        fAuth = FirebaseAuth.getInstance();
        logout = findViewById(R.id.Logout_text);
        Dev = findViewById(R.id.Abt_developer);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder confirmLogout = new AlertDialog.Builder(v.getContext());
                confirmLogout.setTitle("Do you want to Logout?");

                confirmLogout.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        FirebaseAuth.getInstance().signOut();
                        startActivity(new Intent(getApplication(),MainActivity.class));
                        finish();
                    }
                });

                confirmLogout.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                confirmLogout.create().show();

            }
        });

        Dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), AboutDeveloper.class));
            }
        });


    }
}
