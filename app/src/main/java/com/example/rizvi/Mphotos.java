package com.example.rizvi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mphotos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mphotos);

        final Button MPhotosDetails =(Button) findViewById(R.id.Mphotos_MoreImage_Button);

        MPhotosDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MPhotoDetails_intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/marathon2020.html#group13-1"));
                startActivity(MPhotoDetails_intent);
            }
        });
    }
}
