package com.lind.victo.ass2;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by Victo on 2015-04-08.
 */
public class  searchFragment extends Fragment {


    public searchFragment() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.search_layout, container, false);

        return v;

    }



}