package com.example.rizvi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.gigamole.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    private ViewFlipper v_flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView myDrawer = (NavigationView) findViewById(R.id.nav_view);
        setupDrawerContent(myDrawer);

        //Image Flipper
        int images[] = {R.drawable.jashrizvi1, R.drawable.jashrizvi2, R.drawable.jashrizvi3, R.drawable.jashrizvi4,
                R.drawable.jashrizvi5, R.drawable.jashrizvi6, R.drawable.jashrizvi7};
        v_flipper = findViewById(R.id.v_flipper);
        for (int image : images) {
            flipperImage(image);
        }


    }


    public void flipperImage(int image) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);
        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(7000); //7sec
        v_flipper.setAutoStart(true);
        //animation
        v_flipper.setInAnimation(this, android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }

    public void selectItemSelect(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.about_us:
                Intent intent = new Intent(MainActivity.this, About_us.class);
                startActivity(intent);
                break;
            case R.id.Academics:
                Intent intent_acad = new Intent(MainActivity.this, Academics.class);
                startActivity(intent_acad);
                break;
            case R.id.Staff:
                Intent intent_staff = new Intent(MainActivity.this, Staff.class);
                startActivity(intent_staff);
                break;
            case R.id.Campus:
                Intent intent_camp = new Intent(MainActivity.this, Campus_Life.class);
                startActivity(intent_camp);
                break;
            case R.id.Admission:
                Intent intent_Add = new Intent(MainActivity.this, Admission.class);
                startActivity(intent_Add);
                break;
            case R.id.RePub:
                Intent intent_repub = new Intent(MainActivity.this, R_and_P.class);
                startActivity(intent_repub);
                break;
            case R.id.Sports:
                Intent intent_sports = new Intent(MainActivity.this, Sports.class);
                startActivity(intent_sports);
                break;
            case R.id.IQAC:
                Intent intent_iqac = new Intent(MainActivity.this, IQAC.class);
                startActivity(intent_iqac);
                break;
            case R.id.Alumni:
                Intent intent_alumni = new Intent(MainActivity.this, Alumni.class);
                startActivity(intent_alumni);
                break;
        }

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                selectItemSelect(menuItem);
                return false;
            }
        });
    }
}


