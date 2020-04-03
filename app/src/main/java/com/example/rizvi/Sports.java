package com.example.rizvi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sports extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);

        final Button Club = (Button) findViewById(R.id.SportsClub_btn);
        final Button Gallery = (Button) findViewById(R.id.SportsGallery_btn);

        Club.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent club_intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/rizvi-sports.html"));
                startActivity(club_intent);
            }
        });

        Gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Gallery_intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/sports-gallery.html"));
                startActivity(Gallery_intent);
            }
        });
    }
}
