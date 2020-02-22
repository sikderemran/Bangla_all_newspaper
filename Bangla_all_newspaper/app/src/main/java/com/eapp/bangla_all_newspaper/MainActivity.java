package com.eapp.bangla_all_newspaper;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    NavigationView navigationView;
    Toolbar toolbar;
    BdNews fragmentBd;
    JobsBD fragmentJobs;
    PlayNews fragmentPlay;
    BanglaEpaper fragmentEpaper;
    FragmentTransaction fragmentTransaction;
    InterstitialAd inAds;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentBd = new BdNews();
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragmentView, fragmentBd);
        fragmentTransaction.commit();
        Toast.makeText(this,"please make sure your internet connection",Toast.LENGTH_LONG).show();
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }
public void myOnAds()
{
    inAds.setAdUnitId("ca-app-pub-5061141653410008/1450048785");
    AdRequest adRequest = new AdRequest.Builder().build();
    inAds.loadAd(adRequest);
    inAds.setAdListener(new AdListener() {
        public void onAdLoaded() {
            if (inAds.isLoaded()) {
                inAds.show();
            }
        }
    });
}
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            inAds = new InterstitialAd(this);
            myOnAds();
            final AlertDialog.Builder exit = new AlertDialog.Builder(MainActivity.this);
            exit.setMessage("Are you want to exit ?");
            exit.setCancelable(true);
            exit.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });
            exit.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });

            AlertDialog alert = exit.create();
            alert.show();
        }

    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.banglaPaper) {
            fragmentBd = new BdNews();
            fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragmentView, fragmentBd);
            fragmentTransaction.commit();
            Toast.makeText(this,"বাংলা পত্রিকা",Toast.LENGTH_LONG).show();
            inAds = new InterstitialAd(getApplicationContext());
            myOnAds();

        }else if (id == R.id.banglaEpaper) {
            fragmentEpaper = new BanglaEpaper();
            fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragmentView, fragmentEpaper);
            fragmentTransaction.commit();
            Toast.makeText(this,"বাংলা ই-পত্রিকা",Toast.LENGTH_LONG).show();

            inAds = new InterstitialAd(getApplicationContext());
            myOnAds();
        } else if (id == R.id.banglajob) {
            fragmentJobs = new JobsBD();
            fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragmentView, fragmentJobs);
            fragmentTransaction.commit();

            inAds = new InterstitialAd(getApplicationContext());
            myOnAds();
        } else if (id == R.id.playnewS) {
            fragmentPlay = new PlayNews();
            fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragmentView, fragmentPlay);
            fragmentTransaction.commit();
            Toast.makeText(this,"খেলার খবর",Toast.LENGTH_LONG).show();
            inAds = new InterstitialAd(getApplicationContext());
            myOnAds();
        }else if(id==R.id.rateus)
        {
            try{
                Uri link=Uri.parse("market://details?id="+getPackageName());
                Intent ratUS=new Intent(Intent.ACTION_VIEW,link);
                startActivity(ratUS);
            }
            catch (ActivityNotFoundException e)
            {
                Uri link=Uri.parse("http://play.google.com/store/apps/details?id="+getPackageName());
                Intent ratUS=new Intent(Intent.ACTION_VIEW,link);
                startActivity(ratUS);
            }
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
