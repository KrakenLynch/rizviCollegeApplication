package com.example.rizvi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Staff extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff);

        final Button St_Teach_Btn = (Button) findViewById(R.id.Staff_Teaching_btn);
        final Button St_NonTeach_Btn = (Button) findViewById(R.id.Staff_NonTeaching_btn);

        St_Teach_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent TIntent= new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/teaching-staff.html"));
                startActivity(TIntent);
            }
        });

        St_NonTeach_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent NTIntent= new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/non-teaching-staff.html"));
                startActivity(NTIntent);
            }
        });
    }
}