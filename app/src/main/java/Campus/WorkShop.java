package Campus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rizvi.R;

public class WorkShop extends AppCompatActivity {

    final Button button1 = (Button) findViewById(R.id.Work_btn1);
    final Button button2 = (Button) findViewById(R.id.Work_btn2);
    final Button button3 = (Button) findViewById(R.id.Work_btn3);
    final Button button4 = (Button) findViewById(R.id.Work_btn4);
    final Button button5 = (Button) findViewById(R.id.Work_btn5);
    final Button button6 = (Button) findViewById(R.id.Work_btn6);
    final Button button7 = (Button) findViewById(R.id.Work_btn7);
    final Button button8 = (Button) findViewById(R.id.Work_btn8);
    final Button button9 = (Button) findViewById(R.id.Work_btn9);
    final Button button10 = (Button) findViewById(R.id.Work_btn10);
    final Button button11 = (Button) findViewById(R.id.Work_btn11);
    final Button button12 = (Button) findViewById(R.id.Work_btn12);
    final Button button13 = (Button) findViewById(R.id.Work_btn13);
    final Button button14 = (Button) findViewById(R.id.Work_btn14);
    final Button button15 = (Button) findViewById(R.id.Work_btn15);
    final Button button16 = (Button) findViewById(R.id.Work_btn16);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_shop);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/static/rizvi/dist/images/pdf/campus-life/workshop-seminar/rizvi-college-arts-science-commerce-workshop-seminar-chemistry-department.pdf"));
                startActivity(intent1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/static/rizvi/dist/images/pdf/campus-life/workshop-seminar/rizvi-college-arts-science-commerce-workshop-seminar-accountancy-department.pdf"));
                startActivity(intent2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/static/rizvi/dist/images/pdf/campus-life/workshop-seminar/rizvi-college-arts-science-commerce-workshop-seminar-botany-department.pdf"));
                startActivity(intent3);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/static/rizvi/dist/images/pdf/campus-life/workshop-seminar/rizvi-college-arts-science-commerce-workshop-seminar-business-economics-department.pdf"));
                startActivity(intent4);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/static/rizvi/dist/images/pdf/campus-life/workshop-seminar/rizvi-college-arts-science-commerce-workshop-seminar-business-law-department.pdf"));
                startActivity(intent5);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/static/rizvi/dist/images/pdf/campus-life/workshop-seminar/rizvi-college-arts-science-commerce-workshop-seminar-commerce-department.pdf"));
                startActivity(intent6);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/static/rizvi/dist/images/pdf/campus-life/workshop-seminar/rizvi-college-arts-science-commerce-workshop-seminar-economics-department.pdf"));
                startActivity(intent7);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8 = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/static/rizvi/dist/images/pdf/campus-life/workshop-seminar/rizvi-college-arts-science-commerce-workshop-seminar-english-department.pdf"));
                startActivity(intent8);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent9 = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/static/rizvi/dist/images/pdf/campus-life/workshop-seminar/rizvi-college-arts-science-commerce-workshop-seminar-EVS-department.pdf"));
                startActivity(intent9);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent10 = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/static/rizvi/dist/images/pdf/campus-life/workshop-seminar/rizvi-college-arts-science-commerce-workshop-seminar-foundation-course-department.pdf"));
                startActivity(intent10);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent11 = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/static/rizvi/dist/images/pdf/campus-life/workshop-seminar/rizvi-college-arts-science-commerce-workshop-seminar-mathematics-department.pdf"));
                startActivity(intent11);
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent12 = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/static/rizvi/dist/images/pdf/campus-life/workshop-seminar/rizvi-college-arts-science-commerce-workshop-seminar-philosophy-department.pdf"));
                startActivity(intent12);
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent13 = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/static/rizvi/dist/images/pdf/campus-life/workshop-seminar/rizvi-college-arts-science-commerce-workshop-seminar-physics-department.pdf"));
                startActivity(intent13);
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent14 = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/static/rizvi/dist/images/pdf/campus-life/workshop-seminar/rizvi-college-arts-science-commerce-workshop-seminar-sociology-department.pdf"));
                startActivity(intent14);
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent15 = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/static/rizvi/dist/images/pdf/campus-life/workshop-seminar/rizvi-college-arts-science-commerce-workshop-seminar-urdu-department.pdf"));
                startActivity(intent15);
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent16 = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.rizvicollege.edu.in/static/rizvi/dist/images/pdf/campus-life/workshop-seminar/rizvi-college-arts-science-commerce-workshop-seminar-zoology-department.pdf"));
                startActivity(intent16);
            }
        });

    }
}
