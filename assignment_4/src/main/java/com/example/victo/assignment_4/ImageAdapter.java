package com.example.victo.assignment_4;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Victo on 2015-04-22.
 */
public class ImageAdapter extends ArrayAdapter<Planet> {
    ArrayList<Planet> planetList;
    private Context mContext;

    public ImageAdapter(Context c, ArrayList<Planet> planetList) {
        super(c,0,planetList);
        mContext = c;
        this.planetList = planetList;
    }


    @Override
    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        ImageButton imageView;
        Log.i("MyListAdapter", "Called for position: " + position);
        Planet p = planetList.get(position);

        convertView = inflater.inflate(R.layout.list_item,null);
        ImageView iv = (ImageView) convertView.findViewById(R.id.iv_planet);

        TextView tv = (TextView) convertView.findViewById(R.id.iv_text);

        tv.setText(p.getName());
        iv.setImageDrawable(p.getImage());
        return convertView;
    }


}
