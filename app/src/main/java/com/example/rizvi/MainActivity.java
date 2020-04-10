package com.example.rizvi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

import Adapters.InfrastructureAdapter;
import Adapters.NoticesAdapter;
import Adapters.PlacementAdapter;
import Campus.Infrastructure;
import Logins.ProfileDetails;
import Logins.RegisterPage;



public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    private ViewFlipper v_flipper;
    private MeowBottomNavigation meo;
    FirebaseAuth fAuth;

    //bottom_nav
    private final static int Id_home = 1;
    private final static int Id_notification = 2;
    private final static int Id_profile = 3;
    private final static int Id_chatPanel = 4;
    private final static int Id_settings = 5;

    //Notices
    private RecyclerView NoticesRecyclerView;
    private int[] NoticesImages;
    private String[] NoticesLabels;
    private String[] NoticesUrl;

    //Placement
    private RecyclerView PLRecyclerView;
    private int[] PLImages;
    private String[] PLLabels;
    private String[] PLUrl;

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
        NoticesRecyclerView = findViewById(R.id.Notices_RecyclerView);
        NoticesImages = new int[]{R.drawable.pdf_logo,R.drawable.pdf_logo,R.drawable.marathon_image,R.drawable.pdf_logo,R.drawable.pdf_logo,R.drawable.pdf_logo,
        R.drawable.pdf_logo};
        NoticesLabels = new String[]{"BioInformatics Workshop Brochure","BioInformatics Registration\nForm","Saquib Rizvi Memorial Cancer Awareness Marathon",
        "Admission fees payable by Demand Draft ","SY & TY in-house Admission Schedule","ATKT Examination Time Table March 2018","Lecture on E-Resources- Access and Use in the Library"};
        NoticesUrl = new String[]{"http://www.rizvicollege.edu.in/pdf/Brochure_Workshop.pdf","http://www.rizvicollege.edu.in/pdf/Registration-of-workshop.pdf",
        "https://www.townscript.com/e/saqib-rizvi-memorial-cancer-awareness-marathon-014301","https://redox-college.s3.ap-south-1.amazonaws.com/rizvi/2018/Jun/30/oS5Hlc6YO7xMp5XXMGFi.pdf",
        "https://redox-college.s3.ap-south-1.amazonaws.com/rizvi/2018/Jun/23/RCsPsnMtTlm5sa2U1LvQ.pdf","https://redox-college.s3.ap-south-1.amazonaws.com/rizvi/2018/Mar/16/FWs6oZus8rr0FYryWdgY.pdf",
                "https://redox-college.s3.ap-south-1.amazonaws.com/rizvi/2018/Jan/10/Jb88YoN5fO6QUeT7opcW.pdf"};

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        NoticesRecyclerView.setLayoutManager(linearLayoutManager);
        NoticesAdapter noticesAdapter = new NoticesAdapter(MainActivity.this, NoticesImages,NoticesLabels, NoticesUrl);
        NoticesRecyclerView.setAdapter(noticesAdapter);

        //Placement
        PLRecyclerView = findViewById(R.id.Placements_RecyclerView);
        PLImages = new int[]{R.drawable.tata,R.drawable.l_and_t,R.drawable.wipro,R.drawable.cp_logo,R.drawable.igate,R.drawable.infosys,R.drawable.icici, R.drawable.arena,R.drawable.sign_por};
        PLLabels = new String[]{"Tata Consultancy Services","L and T Infotech","Wipro","Capgemini India","IGate","Infosys","ICICI Prudential","Arena MultiMedia","Singapore Airlines"};
        PLUrl = new String[]{"https://www.tcs.com","https://www.lntinfotech.com/","https://www.wipro.com/en-IN/","https://www.capgemini.com/in-en/","https://www.capgemini.com/in-en/",
        "https://www.infosys.com/","https://www.icicipruamc.com/Registration?utm_source=google&utm_medium=cpc&utm_campaign=&utm_adgroup=&utm_term=icici%20prudential&utm_network=Search_g&utm_matchtype=e&utm_device=c&utm_placement=&utm_content=429067407746&utm_Adposition=&utm_location=9040243&utm_campaignid=8381103503&gclid=CjwKCAjwssD0BRBIEiwA-JP5rEdjv0xhl0UBRq1GaKZ9DNvn4Yy6pyEB3wkSMlL8gnm1Uh3NrLTCyxoCucgQAvD_BwE&gclsrc=aw.ds",
        "https://m.arena-multimedia.com/campaign/animation-vfx1/index.aspx?Psource=Mobile%20Campaign&source=Brand_Campaign_mumbai&utm_medium=ppc&utm_campaign=Metro&utm_source=adwords&utm_term=arena%20multimedia&hsa_acc=4048179884&hsa_src=g&hsa_net=adwords&hsa_tgt=kwd-112261361&hsa_ver=3&hsa_ad=280856938452&hsa_grp=56764014677&hsa_kw=arena%20multimedia&hsa_cam=1469617160&hsa_mt=b&gclid=CjwKCAjwssD0BRBIEiwA-JP5rHPe1iepnl4knlXQHVANn6yNRSETfeMAAWk6M9-9CqAlqk4WAEbvlBoCOI0QAvD_BwE",
        "https://www.singaporeair.com/en_UK/in/home?ds_rl=1012408&gclid=CjwKCAjwssD0BRBIEiwA-JP5rJVitEs3sSTqUMfecdQOGGdsCNw74-58Um8U5MXP1vVCiJ1xo1q5YBoCiwwQAvD_BwE&gclsrc=aw.ds#/book/bookflight"};

        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        PLRecyclerView.setLayoutManager(linearLayoutManager2);
        PlacementAdapter placementAdapter = new PlacementAdapter(MainActivity.this, PLImages,PLLabels, PLUrl);
        PLRecyclerView .setAdapter(placementAdapter);




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
                        Intent setting_intent = new Intent(MainActivity.this, Settings.class);
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


