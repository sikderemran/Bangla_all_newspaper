package com.eapp.bangla_all_newspaper;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BdNews extends Fragment implements View.OnClickListener{
    CardView prothomAlo;
    CardView kalerKontho;
    CardView itteafaq;
    CardView jugantor;
    CardView inquilab;
    CardView jonokontho,noiahdigonto,bdprotidin,shomokal,jaijaidin,manobjomin,amarsonbad,songram,vorerkagoj;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.bdnews, container, false);
        getActivity().setTitle("বাংলা পত্রিকা");
        prothomAlo=(CardView) rootView.findViewById(R.id.prothom_alo);
        kalerKontho=(CardView) rootView.findViewById(R.id.kalerkontho);
        itteafaq=(CardView) rootView.findViewById(R.id.doinikitteafak);
        inquilab=(CardView) rootView.findViewById(R.id.inkilav);
        jugantor=(CardView) rootView.findViewById(R.id.jugantor);
        jonokontho=(CardView) rootView.findViewById(R.id.jonokotho);
        noiahdigonto=(CardView) rootView.findViewById(R.id.noahadigonto);
        bdprotidin=(CardView) rootView.findViewById(R.id.bangladeshprotidun);
        shomokal=(CardView) rootView.findViewById(R.id.doinikshomokal);
        jaijaidin=(CardView) rootView.findViewById(R.id.jaijaidin);
        manobjomin=(CardView) rootView.findViewById(R.id.manobjomin);
        amarsonbad=(CardView) rootView.findViewById(R.id.amarsonbad);
        songram=(CardView) rootView.findViewById(R.id.shongram);
        vorerkagoj=(CardView) rootView.findViewById(R.id.bhorerkagoj);
        prothomAlo.setOnClickListener(this);
        kalerKontho.setOnClickListener(this);
        itteafaq.setOnClickListener(this);
        inquilab.setOnClickListener(this);
        jugantor.setOnClickListener(this);
        jonokontho.setOnClickListener(this);
        noiahdigonto.setOnClickListener(this);
        bdprotidin.setOnClickListener(this);
        shomokal.setOnClickListener(this);
        jaijaidin.setOnClickListener(this);
        manobjomin.setOnClickListener(this);
        amarsonbad.setOnClickListener(this);
        songram.setOnClickListener(this);
        vorerkagoj.setOnClickListener(this);
        return rootView;
    }


    @Override
    public void onClick(View news) {
        switch (news.getId()) {
            case R.id.prothom_alo:
                Intent Prothomalo = new Intent(getActivity(), WebBdPaper.class);
                Prothomalo.putExtra("address", "http://www.prothomalo.com/");
                startActivity(Prothomalo);
                break;
            case R.id.kalerkontho:
                Intent Kalerkontho = new Intent(getActivity(), WebBdPaper.class);
                Kalerkontho.putExtra("address", "http://www.kalerkantho.com/");
                startActivity(Kalerkontho);
                break;
            case R.id.doinikitteafak:
                Intent itteafaq = new Intent(getActivity(), WebBdPaper.class);
                itteafaq.putExtra("address", "http://www.ittefaq.com.bd");
                startActivity(itteafaq);
                break;
            case R.id.inkilav:
                Intent inkilub = new Intent(getActivity(), WebBdPaper.class);
                inkilub.putExtra("address", "https://www.dailyinqilab.com/");
                startActivity(inkilub);
                break;
            case R.id.jugantor:
                Intent Jugantor = new Intent(getActivity(), WebBdPaper.class);
                Jugantor.putExtra("address", "https://www.jugantor.com");
                startActivity(Jugantor);
                break;
            case R.id.jonokotho:
                Intent jonokontho = new Intent(getActivity(), WebBdPaper.class);
                jonokontho.putExtra("address", "http://www.dailyjanakantha.com/");
                startActivity(jonokontho);
                break;
            case R.id.noahadigonto:
                Intent digonto = new Intent(getActivity(), WebBdPaper.class);
                digonto.putExtra("address", "http://www.dailynayadiganta.com/");
                startActivity(digonto);
                break;
            case R.id.bangladeshprotidun:
                Intent bdpotidin = new Intent(getActivity(), WebBdPaper.class);
                bdpotidin.putExtra("address", "http://www.bd-pratidin.com");
                startActivity(bdpotidin);
                break;
            case R.id.doinikshomokal:
                Intent shomokal = new Intent(getActivity(), WebBdPaper.class);
                shomokal.putExtra("address", "http://samakal.com");
                startActivity(shomokal);
                break;
            case R.id.jaijaidin:
                Intent jaidin = new Intent(getActivity(), WebBdPaper.class);
                jaidin.putExtra("address", "http://www.jaijaidinbd.com/");
                startActivity(jaidin);
                break;
            case R.id.manobjomin:
                Intent jomin = new Intent(getActivity(), WebBdPaper.class);
                jomin.putExtra("address", "http://www.mzamin.com");
                startActivity(jomin);
                break;
            case R.id.amarsonbad:
                Intent sonbad = new Intent(getActivity(), WebBdPaper.class);
                sonbad.putExtra("address", "http://www.amar-sangbad.com");
                startActivity(sonbad);
                break;
            case R.id.shongram:
                Intent Shongram = new Intent(getActivity(), WebBdPaper.class);
                Shongram.putExtra("address", "http://www.dailysangram.com/");
                startActivity(Shongram);
                break;
            case R.id.bhorerkagoj:
                Intent kagoj = new Intent(getActivity(), WebBdPaper.class);
                kagoj.putExtra("address", "http://www.bhorerkagoj.net");
                startActivity(kagoj);
                break;


        }
    }
}
