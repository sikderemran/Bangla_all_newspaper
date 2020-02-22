package com.eapp.bangla_all_newspaper;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PlayNews extends Fragment implements View.OnClickListener{
    CardView cricbuz;
    CardView sky;
    CardView espnin;
    CardView espn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.play_news, container, false);
        getActivity().setTitle("খেলার খবর");
        cricbuz=(CardView) rootView.findViewById(R.id.cricbz);
        sky=(CardView) rootView.findViewById(R.id.sky);
        espnin=(CardView) rootView.findViewById(R.id.espnci);
        espn=(CardView) rootView.findViewById(R.id.espn);
        cricbuz.setOnClickListener(this);
        sky.setOnClickListener(this);
        espnin.setOnClickListener(this);
        espn.setOnClickListener(this);
        return rootView;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cricbz:
                Intent buzz = new Intent(getActivity(), WebPlay.class);
                buzz.putExtra("address", "http://www.cricbuzz.com");
                startActivity(buzz);
                break;
            case R.id.sky:
                Intent Jugantor = new Intent(getActivity(), WebPlay.class);
                Jugantor.putExtra("address", "http://www.skysports.com");
                startActivity(Jugantor);
                break;
            case R.id.espnci:
                Intent esin = new Intent(getActivity(), WebPlay.class);
                esin.putExtra("address", "http://www.espncricinfo.com");
                startActivity(esin);
                break;
            case R.id.espn:
                Intent espn1 = new Intent(getActivity(), WebPlay.class);
                espn1.putExtra("address", "http://www.espn.in");
                startActivity(espn1);
                break;


        }
    }
}
