package com.example.victo.ass2; /**
 * Created by Victo on 2015-04-09.
 */

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ListFragment;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.victo.ass2.R;


/**
 * A simple {@link android.app.Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnClickListener{


    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.home_layout, container, false);
        View myButtonView = v.findViewById(R.id.searchButton);
        //Button myButton = (Button) myButtonView;
        myButtonView.setOnClickListener(this);
        return v;
    }


    @Override
    public void onClick(View v) {
        MainActivity a = (MainActivity) getActivity();
        Toast t = Toast.makeText(getActivity(),"Hej",Toast.LENGTH_LONG);
        t.show();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        searchFragment bf = new searchFragment();
        ft.replace(R.id.mainActivity,bf);
        ft.commit();

        //   getFragmentManager().beginTransaction().replace(R.id.main_layout,new ListFragment()).commit();
    }
}
