package Lists;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.rizvi.R;

public class AboutDeveloper extends AppCompatActivity {

    ImageButton Fb,Insta,Twitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_developer);

        Fb = findViewById(R.id.AD_FaceBook_btn);
        Insta = findViewById(R.id.AD_Instagram_btn);
        Twitter = findViewById(R.id.AD_Twitter_btn);

        Fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fb_intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.facebook.com/danish.sayed.180"));
                startActivity(fb_intent);
            }
        });

        Insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent In_intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.instagram.com/dannzsz/"));
                startActivity(In_intent);
            }
        });

        Twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent T_intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://twitter.com/DastageerSayed"));
                startActivity(T_intent);
            }
        });

    }

}
