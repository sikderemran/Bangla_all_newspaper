package com.eapp.bangla_all_newspaper;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class WebJobs extends AppCompatActivity {
    private WebView myWeb;
    SwipeRefreshLayout Swipe;
    AdView adss;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_jobs);
        if(getSupportActionBar() != null){
            getSupportActionBar().hide();
        }        Swipe=(SwipeRefreshLayout)findViewById(R.id.swipe);
        Swipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                LoadWeb();
            }
        });
        LoadWeb();
    }
    @SuppressLint("SetJavaScriptEnabled")
    public void LoadWeb()
    {
        adss=(AdView)findViewById(R.id.adView);
        MobileAds.initialize(this,"ca-app-pub-5061141653410008~8430390108");
        AdRequest request=new AdRequest.Builder().build();
        adss.loadAd(request);
        AdView adss=new AdView(this);
        adss.setAdSize(AdSize.SMART_BANNER);

        myWeb=(WebView)findViewById(R.id.myWeb);
        WebSettings getWeb=myWeb.getSettings();
        getWeb.setJavaScriptEnabled(true);
        getWeb.setBuiltInZoomControls(true);
        getWeb.setDisplayZoomControls(false);
        getWeb.setAppCacheEnabled(false);
        Intent link=getIntent();
        String uri=link.getStringExtra("address");
        myWeb.loadUrl(uri);
        Swipe.setRefreshing(true);
        myWeb.setWebViewClient(new WebViewClient()
        {
            @SuppressWarnings("deprecation")
            @Override
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl)

            {
                myWeb.loadUrl("file:///android_asset/connection.html");
            }
            public void onPageFinished(WebView view,String url)
            {
                Swipe.setRefreshing(false);
            }
        });

    }
    @Override
    public void onBackPressed()
    {
        if(myWeb.canGoBack())
        {
            myWeb.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }
}
