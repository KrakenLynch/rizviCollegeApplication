package Lists;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import com.example.rizvi.R;

public class AlumniOverview extends AppCompatActivity {

    private ViewFlipper alumni_flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumni_overview);

        final TextView Link =(TextView) findViewById(R.id.AL_Link1);
        final TextView Link1 =(TextView) findViewById(R.id.AL_Link2);
        final TextView Link2 =(TextView) findViewById(R.id.AL_Link3);
        final TextView Link3 =(TextView) findViewById(R.id.AL_Link4);
        final TextView Link4 =(TextView) findViewById(R.id.AL_Link5);
        final TextView Link5 =(TextView) findViewById(R.id.AL_Link6);

        int images[] = {R.drawable.hof_image1,R.drawable.hof_image2,R.drawable.hof_image3,R.drawable.hof_image4,R.drawable.hof_image5,R.drawable.hof_image6,
                R.drawable.hof_image7,R.drawable.hof_image8,R.drawable.hof_image9,R.drawable.hof_image10,R.drawable.hof_image11};
        alumni_flipper = findViewById(R.id.Alumni_flipper);
        for (int image : images) {
            flipperImage(image);
        }

        Link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlumniOverview.this, AlumniEvents.class);
                startActivity(intent);
            }
        });

        Link1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlumniOverview.this, AlumniEvents.class);
                startActivity(intent);
            }
        });
        Link2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlumniOverview.this, AlumniEvents.class);
                startActivity(intent);
            }
        });
        Link3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlumniOverview.this, AlumniEvents.class);
                startActivity(intent);
            }
        });
        Link4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlumniOverview.this, AlumniEvents.class);
                startActivity(intent);
            }
        });
        Link5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlumniOverview.this, AlumniEvents.class);
                startActivity(intent);
            }
        });
    }

    public void flipperImage(int image) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);
        alumni_flipper.addView(imageView);
        alumni_flipper.setFlipInterval(3000); //7sec
        alumni_flipper.setAutoStart(true);
        //animation
        alumni_flipper.setInAnimation(this, android.R.anim.slide_in_left);
        alumni_flipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }
}
