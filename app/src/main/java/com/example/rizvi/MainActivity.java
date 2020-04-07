package com.example.rizvi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;
import java.util.List;

import Adapters.NoticesAdapter;
import Models.NoticesModel;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    private ViewFlipper v_flipper;
    private List<NoticesModel> noticesModelList;
    private RecyclerView noticesRecyclerView;
    private NoticesAdapter noticesAdapter;
    private MeowBottomNavigation meo;
    FirebaseAuth fAuth;

    //bottom_nav
    private final static int Id_home = 1;
    private final static int Id_notification = 2;
    private final static int Id_profile = 3;
    private final static int Id_chatPanel = 4;
    private final static int Id_settings = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fAuth = FirebaseAuth.getInstance();
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

        // Notices
        noticesModelList = new ArrayList<>();
        noticesModelList.add(new NoticesModel("Hello"));
        noticesModelList.add(new NoticesModel("Hello1"));
        noticesModelList.add(new NoticesModel("Hello2"));
        noticesModelList.add(new NoticesModel("Hello3"));

        noticesRecyclerView = (RecyclerView) findViewById(R.id.recyclerViewNotices);
        noticesAdapter = new NoticesAdapter(this, noticesModelList);
        noticesRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        noticesRecyclerView.setAdapter(noticesAdapter);

        //Bottom Navigation Bar
        meo = (MeowBottomNavigation) findViewById(R.id.BottomNavigationBar);
        meo.add(new MeowBottomNavigation.Model(1, R.drawable.ic_home_black_24dp));
        meo.add(new MeowBottomNavigation.Model(2, R.drawable.ic_notifications_black_24dp));
        meo.add(new MeowBottomNavigation.Model(3, R.drawable.ic_profile_black_24dp));
        meo.add(new MeowBottomNavigation.Model(4, R.drawable.ic_chat_black_24dp));
        meo.add(new MeowBottomNavigation.Model(5, R.drawable.ic_more_horiz_black_24dp));

        meo.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {
                // Toast.makeText(getApplicationContext(),""+item.getId(),Toast.LENGTH_SHORT).show();
            }
        });

        meo.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {
                switch (item.getId()) {
                    case Id_home:
                        break;
                    case Id_profile:
                        if (fAuth.getCurrentUser() != null) {
                            Intent profile_intent = new Intent(MainActivity.this, ProfileDetails.class);
                            startActivity(profile_intent);
                            break;
                        } else {
                            Intent profile_intent = new Intent(MainActivity.this, RegisterPage.class);
                            startActivity(profile_intent);
                            break;
                        }
                    case Id_settings:
                        Intent setting_intent = new Intent(MainActivity.this, About_us.class);
                        startActivity(setting_intent);
                        break;
                    default:


                }
            }
        });

        meo.setOnReselectListener(new MeowBottomNavigation.ReselectListener() {
            @Override
            public void onReselectItem(MeowBottomNavigation.Model item) {
                switch (item.getId()) {
                    case Id_home:
                        break;
                    case Id_profile:
                        if (fAuth.getCurrentUser() != null) {
                            Intent profile_intent = new Intent(MainActivity.this, ProfileDetails.class);
                            startActivity(profile_intent);
                            break;
                        } else {
                            Intent profile_intent = new Intent(MainActivity.this, RegisterPage.class);
                            startActivity(profile_intent);
                            break;
                        }
                    case Id_settings:
                        Intent setting_intent = new Intent(MainActivity.this, About_us.class);
                        startActivity(setting_intent);
                        break;
                    default:

                }

            }
        });

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

    // Navigation Drawer
    public void selectItemSelect(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.about_us:
                Intent intent = new Intent(MainActivity.this, About_us.class);
                startActivity(intent);
                break;
            case R.id.Academics:
                Intent Acd_intent = new Intent(MainActivity.this, Academics.class);
                startActivity(Acd_intent);
                break;
            case R.id.Staff:
                Intent Staff_intent = new Intent(MainActivity.this, Staff.class);
                startActivity(Staff_intent);
                break;
            case R.id.Campus:
                Intent Cam_intent = new Intent(MainActivity.this, CampusLife.class);
                startActivity(Cam_intent);
                break;
            case R.id.Admission:
                Intent Admi_Intent = new Intent(MainActivity.this, Admission.class);
                startActivity(Admi_Intent);
                break;
            case R.id.RePub:
                Intent RP_Intent = new Intent(MainActivity.this, ResearchAndPublication.class);
                startActivity(RP_Intent);
                break;
            case R.id.Sports:
                Intent Sports_intent = new Intent(MainActivity.this, Sports.class);
                startActivity(Sports_intent);
                break;
            case R.id.IQAC:
                Intent IQAC_intent = new Intent(MainActivity.this, IQAC.class);
                startActivity(IQAC_intent);
                break;
            case R.id.Alumni:
                Intent Alumni_intent = new Intent(MainActivity.this, Alumni.class);
                startActivity(Alumni_intent);
                break;
            case R.id.Contact_us:
                Intent Cont_intent = new Intent(MainActivity.this, ContactUs.class);
                startActivity(Cont_intent);
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


