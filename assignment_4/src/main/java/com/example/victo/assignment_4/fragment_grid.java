package com.example.victo.assignment_4;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.content.res.Resources;

import java.util.ArrayList;

/**
 * Created by Victo on 2015-04-22.
 */
public class fragment_grid extends Fragment {


    public static ArrayList<Planet> planets = new ArrayList<Planet>();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        planets.clear();



        Drawable d = getResources().getDrawable(R.drawable.earth);
        planets.add(new Planet(getResources().getString(R.string.earth_name),d,getResources().getString(R.string.earth_description)));
        d = getResources().getDrawable(R.drawable.mars);
        planets.add(new Planet(getResources().getString(R.string.mars_name),d,getResources().getString(R.string.mars_description)));
        d = getResources().getDrawable(R.drawable.jupiter);
        planets.add(new Planet(getResources().getString(R.string.jupter_name),d,getResources().getString(R.string.jupiter_description)));
        d = getResources().getDrawable(R.drawable.mercury);
        planets.add(new Planet(getResources().getString(R.string.mercury_name),d,getResources().getString(R.string.mercury_description)));
        d = getResources().getDrawable(R.drawable.neptune);
        planets.add(new Planet(getResources().getString(R.string.neptune_name),d,getResources().getString(R.string.neptune_description)));
        d = getResources().getDrawable(R.drawable.saturn);
        planets.add(new Planet(getResources().getString(R.string.saturn_name),d, getResources().getString(R.string.saturn_description)));
        d = getResources().getDrawable(R.drawable.uranus);
        planets.add(new Planet(getResources().getString(R.string.uranus_name),d,getResources().getString(R.string.uranus_description)));
        d = getResources().getDrawable(R.drawable.venus);
        planets.add(new Planet(getResources().getString(R.string.venus_name),d,getResources().getString(R.string.venus_description)));

    }
    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {

        final View v = inflater.inflate(R.layout.planet_gridlayout, container, false);
        GridView gridview = (GridView) v.findViewById(R.id.gridview);
        Log.i("yeah", " antal element " + planets.size());

        gridview.setAdapter(new ImageAdapter(getActivity(), planets));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Log.i("FragmentWithList", "Clicked on position: " + position);

                PlanetGridFragment pGF = new PlanetGridFragment(planets.get(position));
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.planetFragment, pGF);
                ft.addToBackStack(null);
                ft.commit();

            }

        });
        return v;
    }

}