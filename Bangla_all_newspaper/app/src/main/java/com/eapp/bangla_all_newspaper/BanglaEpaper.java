package com.eapp.bangla_all_newspaper;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BanglaEpaper extends Fragment implements View.OnClickListener{
    CardView prothomAlo;
    CardView kalerKontho;
    CardView itteafaq;
    CardView jugantor;
    CardView inquilab;
    CardView jonokontho,noiahdigonto,bdprotidin,shomokal,jaijaidin,alokito,amarsonbad,amarsomoy,vorerkagoj;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.bangla_epaper, container, false);
        getActivity().setTitle("বাংলা ই-পত্রিকা");
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
        alokito=(CardView) rootView.findViewById(R.id.alokito);
        amarsonbad=(CardView) rootView.findViewById(R.id.amarsonbad);
        amarsomoy=(CardView) rootView.findViewById(R.id.somoy);
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
        alokito.setOnClickListener(this);
        amarsonbad.setOnClickListener(this);
        amarsomoy.setOnClickListener(this);
        vorerkagoj.setOnClickListener(this);
        return rootView;
    }


    @Override
    public void onClick(View news) {
        switch (news.getId()) {
            case R.id.prothom_alo:
                Intent Prothomalo = new Intent(getActivity(), Eweb.class);
                Prothomalo.putExtra("address", "http://epaper.prothom-alo.com/");
                startActivity(Prothomalo);
                break;
            case R.id.kalerkontho:
                Intent Kalerkontho = new Intent(getActivity(), Eweb.class);
                Kalerkontho.putExtra("address", "http://www.ekalerkantho.com/");
                startActivity(Kalerkontho);
                break;
            case R.id.doinikitteafak:
                Intent itteafaq = new Intent(getActivity(), Eweb.class);
                itteafaq.putExtra("address", "http://epaper.ittefaq.com.bd/");
                startActivity(itteafaq);
                break;
            case R.id.inkilav:
                Intent inkilub = new Intent(getActivity(), Eweb.class);
                inkilub.putExtra("address", "http://www.dailyinqilab.com/epaper/");
                startActivity(inkilub);
                break;
            case R.id.jugantor:
                Intent Jugantor = new Intent(getActivity(), Eweb.class);
                Jugantor.putExtra("address", "http://epaper.jugantor.com");
                startActivity(Jugantor);
                break;
            case R.id.jonokotho:
                Intent jonokontho = new Intent(getActivity(), Eweb.class);
                jonokontho.putExtra("address", "http://www.edailyjanakantha.com/");
                startActivity(jonokontho);
                break;
            case R.id.noahadigonto:
                Intent digonto = new Intent(getActivity(), Eweb.class);
                digonto.putExtra("address", "http://enayadiganta.com/");
                startActivity(digonto);
                break;
            case R.id.bangladeshprotidun:
                Intent bdpotidin = new Intent(getActivity(), Eweb.class);
                bdpotidin.putExtra("address", "http://www.ebdpratidin.com/");
                startActivity(bdpotidin);
                break;
            case R.id.doinikshomokal:
                Intent shomokal = new Intent(getActivity(), Eweb.class);
                shomokal.putExtra("address", "http://epaper.samakal.com/");
                startActivity(shomokal);
                break;
            case R.id.jaijaidin:
                Intent jaidin = new Intent(getActivity(), Eweb.class);
                jaidin.putExtra("address", "http://www.ejjdin.com/");
                startActivity(jaidin);
                break;
            case R.id.alokito:
                Intent jomin = new Intent(getActivity(), Eweb.class);
                jomin.putExtra("address", "http://www.alokitobangladesh.com/epaper/");
                startActivity(jomin);
                break;
            case R.id.amarsonbad:
                Intent sonbad = new Intent(getActivity(), Eweb.class);
                sonbad.putExtra("address", "http://www.eamar-sangbad.com/");
                startActivity(sonbad);
                break;
            case R.id.somoy:
                Intent Shongram = new Intent(getActivity(), Eweb.class);
                Shongram.putExtra("address", "http://epaper.dainikamadershomoy.com");
                startActivity(Shongram);
                break;
            case R.id.bhorerkagoj:
                Intent kagoj = new Intent(getActivity(), Eweb.class);
                kagoj.putExtra("address", "https://www.bhorerkagoj.net/epaper");
                startActivity(kagoj);
                break;


        }
    }
}
