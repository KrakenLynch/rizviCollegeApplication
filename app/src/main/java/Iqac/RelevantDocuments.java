package Iqac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.rizvi.R;

public class RelevantDocuments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relevant_documents);

        final Spinner Arts_spinner = (Spinner) findViewById(R.id.Arts_Spinner);
        final Spinner Science_spinner = (Spinner) findViewById(R.id.Science_Spinner);
        final Spinner IT_spinner = (Spinner) findViewById(R.id.IT_Spinner);
        final Spinner Commerce_spinner = (Spinner) findViewById(R.id.Commerce_Spinner);

        //Commerce Spinner
        ArrayAdapter<String> Commerce_Adapter = new ArrayAdapter<String>(RelevantDocuments.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Commerce_spinner_list));
        Commerce_Adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        Commerce_spinner.setAdapter(Commerce_Adapter);
        Commerce_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 1) {
                    Intent Commerce_intent1 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://www.rizvicollege.edu.in/pdf/related-document/ACCOUNTANCY%20PROGRAMM%20OUTCOMES.pdf"));
                    startActivity(Commerce_intent1);
                } else if (position == 2) {
                    Intent Commerce_intent2 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://www.rizvicollege.edu.in/pdf/related-document/LAW%20PROGRAMM%20OUTCOMES.pdf"));
                    startActivity(Commerce_intent2);
                } else if (position == 3) {
                    Intent Commerce_intent3 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://www.rizvicollege.edu.in/pdf/related-document/Commerce.pdf"));
                    startActivity(Commerce_intent3);
                } else if (position == 4) {
                    Intent Commerce_intent4 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://www.rizvicollege.edu.in/pdf/related-document/FoundationCourse.pdf"));
                    startActivity(Commerce_intent4);
                } else if (position == 5) {
                    Intent Commerce_intent5 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://www.rizvicollege.edu.in/pdf/related-document/BMS.pdf"));
                    startActivity(Commerce_intent5);
                } else if (position == 6) {
                    Intent Commerce_intent6 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://www.rizvicollege.edu.in/pdf/related-document/BCom(AccountsandFinance).pdf"));
                    startActivity(Commerce_intent6);
                } else if (position == 7) {
                    Intent Commerce_intent7 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://www.rizvicollege.edu.in/pdf/related-document/BCom(BankingandInsurance).pdf"));
                    startActivity(Commerce_intent7);
                } else if (position == 8) {
                    Intent Commerce_intent8 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://www.rizvicollege.edu.in/pdf/related-document/Outcome_EVS.pdf"));
                    startActivity(Commerce_intent8);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        //IT Spinner
        ArrayAdapter<String> IT_Adapter = new ArrayAdapter<String>(RelevantDocuments.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.IT_spinner_list));
        IT_Adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        IT_spinner.setAdapter(IT_Adapter);
        IT_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 1) {
                    Intent IT_intent1 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://www.rizvicollege.edu.in/pdf/related-document/ITPROGRAMMOUTCOMES.pdf"));
                    startActivity(IT_intent1);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //Science Spinner
        ArrayAdapter<String> Science_Adapter = new ArrayAdapter<String>(RelevantDocuments.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Science_spinner_list));
        Science_Adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        Science_spinner.setAdapter(Science_Adapter);
        Science_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 1) {
                    Intent Science_intent1 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://www.rizvicollege.edu.in/pdf/related-document/PHYSICS%20PROGRAMM%20OUTCOMES.pdf"));
                    startActivity(Science_intent1);
                } else if (position == 2) {
                    Intent Science_intent2 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://www.rizvicollege.edu.in/pdf/related-document/BOTANY%20PROGRAMM%20OUTCOMES.pdf"));
                    startActivity(Science_intent2);
                } else if (position == 3) {
                    Intent Science_intent3 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://www.rizvicollege.edu.in/pdf/related-document/ZOOLOGY%20PROGRAMM%20OUTCOMES.pdf"));
                    startActivity(Science_intent3);
                } else if (position == 4) {
                    Intent Science_intent4 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://www.rizvicollege.edu.in/pdf/related-document/Chemistry.pdf"));
                    startActivity(Science_intent4);
                } else if (position == 5) {
                    Intent Science_intent5 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://www.rizvicollege.edu.in/pdf/related-document/Outcome_Mathmatics.pdf"));
                    startActivity(Science_intent5);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        //Arts Spinner
        ArrayAdapter<String> Arts_Adapter = new ArrayAdapter<String>(RelevantDocuments.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Arts_spinner_list));
        Arts_Adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        Arts_spinner.setAdapter(Arts_Adapter);
        Arts_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 1) {
                    Intent arts_intent1 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://www.rizvicollege.edu.in/pdf/related-document/ECONOMICS%20PROGRAMM%20OUTCOMES.pdf"));
                    startActivity(arts_intent1);
                } else if (position == 2) {
                    Intent arts_intent2 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://www.rizvicollege.edu.in/pdf/related-document/ECONOMICS%20PROGRAMM%20OUTCOMES.pdf"));
                    startActivity(arts_intent2);
                } else if (position == 3) {
                    Intent arts_intent3 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://www.rizvicollege.edu.in/pdf/related-document/ENGLISH%20PROGRAMM%20OUTCOMES.pdf"));
                    startActivity(arts_intent3);
                } else if (position == 4) {
                    Intent arts_intent4 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://www.rizvicollege.edu.in/pdf/related-document/Urdu.pdf"));
                    startActivity(arts_intent4);
                } else if (position == 5) {
                    Intent arts_intent5 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://www.rizvicollege.edu.in/pdf/related-document/MassMedia.pdf"));
                    startActivity(arts_intent5);
                } else if (position == 6) {
                    Intent arts_intent6 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://www.rizvicollege.edu.in/pdf/related-document/Hindi.pdf"));
                    startActivity(arts_intent6);
                } else if (position == 7) {
                    Intent arts_intent7 = new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://www.rizvicollege.edu.in/pdf/related-document/Outcome_Philosophy.pdf"));
                    startActivity(arts_intent7);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
