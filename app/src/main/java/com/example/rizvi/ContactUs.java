package com.example.rizvi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ContactUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        final TextView Link = (TextView) findViewById(R.id.Contact_Link);
        final ImageButton Fb = (ImageButton) findViewById(R.id.FaceBook_btn);
        final ImageButton Twitter = (ImageButton) findViewById(R.id.Twitter_btn);
        final ImageButton YT = (ImageButton) findViewById(R.id.Youtube_btn);
        final ImageButton Insta = (ImageButton) findViewById(R.id.Instagram_btn);

        Link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Link_intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/index.html"));
                startActivity(Link_intent);
            }
        });

        Fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Link_intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.facebook.com/collegerizvi/"));
                startActivity(Link_intent);
            }
        });

        Twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Link_intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://twitter.com/college_rizvi?s=08"));
                startActivity(Link_intent);
            }
        });

        YT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Link_intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/channel/UCEWuoAYsALOh6yO9bdjjfQw"));
                startActivity(Link_intent);
            }
        });

        Insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Link_intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.instagram.com/rizvicollegeascofficial/?hl=en"));
                startActivity(Link_intent);
            }
        });
    }
}
