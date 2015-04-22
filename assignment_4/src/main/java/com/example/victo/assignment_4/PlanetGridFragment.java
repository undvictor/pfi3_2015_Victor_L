package com.example.victo.assignment_4;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by Victo on 2015-04-22.
 */
public class PlanetGridFragment extends Fragment {
    private static Planet planet;


    public PlanetGridFragment(Planet planet){
    this.planet = planet;

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View v = inflater.inflate(R.layout.fact_layout, container, false);

        ImageView iv = (ImageView) v.findViewById(R.id.planetFactImage);
        iv.setImageDrawable(planet.getImage());

        TextView titleView = (TextView) v.findViewById(R.id.factTitle);
        titleView.setText(planet.getName());

        TextView desView = (TextView) v.findViewById(R.id.factDescription);
        desView.setText(planet.getSummary());

        return v ;
    }

}
