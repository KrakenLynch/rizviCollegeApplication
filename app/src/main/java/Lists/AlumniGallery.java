package Lists;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rizvi.R;

public class AlumniGallery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumni_gallery);

        final Button Image1 =(Button) findViewById(R.id.Alumni_Gallery1_Button);
        final Button Image2 =(Button) findViewById(R.id.Alumni_Gallery2_Button);

        Image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ALPhotoDetails_intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/alumni-gallery.html#group13-1"));
                startActivity(ALPhotoDetails_intent);
            }
        });

        Image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ALMPhotoDetails_intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/alumni-gallery.html#group12-1"));
                startActivity(ALMPhotoDetails_intent);
            }
        });
    }
}
