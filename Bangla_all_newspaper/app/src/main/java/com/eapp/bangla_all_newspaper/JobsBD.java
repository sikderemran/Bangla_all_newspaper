package com.eapp.bangla_all_newspaper;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class JobsBD extends Fragment implements View.OnClickListener{
    CardView bdjobs;
    CardView jobsa1;
    CardView jobsbd;
    CardView cyberjobs,chakri,noiahjobs,jobsbangla,deshijobs,everjobs,chakuri;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.jobs_bd, container, false);
        getActivity().setTitle("চাকরির পত্রিকা");
        bdjobs=(CardView) rootView.findViewById(R.id.bdjobs);
        jobsa1=(CardView) rootView.findViewById(R.id.jobs1);
        jobsbd=(CardView) rootView.findViewById(R.id.jobsbd);
        cyberjobs=(CardView) rootView.findViewById(R.id.cyberjobs);
        chakri=(CardView) rootView.findViewById(R.id.chakri);
        noiahjobs=(CardView) rootView.findViewById(R.id.noiahajobs);
        jobsbangla=(CardView) rootView.findViewById(R.id.jobsbangladesh);
        everjobs=(CardView) rootView.findViewById(R.id.everjobs);
        jobsa1=(CardView) rootView.findViewById(R.id.jobs1);
        deshijobs=(CardView) rootView.findViewById(R.id.deshijob);
        chakuri=(CardView) rootView.findViewById(R.id.chakuri);
        chakuri.setOnClickListener(this);
        bdjobs.setOnClickListener(this);
        jobsa1.setOnClickListener(this);
        jobsbd.setOnClickListener(this);
        cyberjobs.setOnClickListener(this);
        chakri.setOnClickListener(this);
        noiahjobs.setOnClickListener(this);
        everjobs.setOnClickListener(this);
        jobsbangla.setOnClickListener(this);
        deshijobs.setOnClickListener(this);
        return rootView;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.bdjobs:
                Intent Prothomalo = new Intent(getActivity(), WebJobs.class);
                Prothomalo.putExtra("address", "http://www.bdjobs.com/");
                startActivity(Prothomalo);
                break;
            case R.id.jobs1:
                Intent itteafaq = new Intent(getActivity(), WebJobs.class);
                itteafaq.putExtra("address", "http://jobsa1.com/");
                startActivity(itteafaq);
                break;
            case R.id.jobsbd:
                Intent inkilub = new Intent(getActivity(), WebJobs.class);
                inkilub.putExtra("address", "http://www.jobsbd.com/");
                startActivity(inkilub);
                break;
            case R.id.cyberjobs:
                Intent jonokontho = new Intent(getActivity(), WebJobs.class);
                jonokontho.putExtra("address", "http://www.cyberjob.com.bd");
                startActivity(jonokontho);
                break;
            case R.id.chakri:
                Intent shomokal = new Intent(getActivity(), WebJobs.class);
                shomokal.putExtra("address", "http://www.chakri.com");
                startActivity(shomokal);
                break;
            case R.id.chakuri:
                Intent chakuri = new Intent(getActivity(), WebJobs.class);
                chakuri.putExtra("address", "http://chakuri.net");
                startActivity(chakuri);
                break;
            case R.id.noiahajobs:
                Intent jaidin = new Intent(getActivity(), WebJobs.class);
                jaidin.putExtra("address", "http://www.nayadigantajobs.com/");
                startActivity(jaidin);
                break;
            case R.id.everjobs:
                Intent everjob = new Intent(getActivity(), WebJobs.class);
                everjob.putExtra("address", "https://www.everjobs.com.bd");
                startActivity(everjob);
                break;
            case R.id.jobsbangladesh:
                Intent jomin = new Intent(getActivity(), WebJobs.class);
                jomin.putExtra("address", "http://www.jobsbangladesh.com/");
                startActivity(jomin);
                break;
            case R.id.deshijob:
                Intent sonbad = new Intent(getActivity(), WebJobs.class);
                sonbad.putExtra("address", "http://www.deshijob.com/");
                startActivity(sonbad);
                break;

        }
    }
}
