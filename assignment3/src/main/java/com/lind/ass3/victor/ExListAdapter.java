package com.lind.ass3.victor;

import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.BaseExpandableListAdapter;
        import android.widget.TextView;

import com.lind.ass3.victor.ParserRelated.Journey;

import java.util.ArrayList;


public class ExListAdapter extends BaseExpandableListAdapter {

    private ArrayList<Journey> j;
    private Context c;

    public ExListAdapter(Context c, ArrayList<Journey> j){
        this.j = j;
        this.c = c;
    }

    @Override
    public int getGroupCount(){
        return j.size();
    }

    @Override
    public int getChildrenCount(int groupPosition){
        return 1;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        LayoutInflater li = (LayoutInflater) this.c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = li.inflate(R.layout.list_collapsed,null);

        TextView arrTime = (TextView) convertView.findViewById(R.id.travelMinutes);
        String arrival ="Arrives in " +j.get(groupPosition).getTimeToDeparture() + " minutes";
        arrTime.setText(arrival);

        TextView depTime = (TextView) convertView.findViewById(R.id.depTimeDev);
        String departure = "Linje " +j.get(groupPosition).getLineOnFirstJourney();
        depTime.setText(departure);


        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        LayoutInflater li = (LayoutInflater) this.c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = li.inflate(R.layout.list_expanded,null);

        TextView arrTime = (TextView) convertView.findViewById(R.id.depTime);
        String arrival = "TravelMinutes: " + j.get(groupPosition).getTravelMinutes().toString() + " min";
        arrTime.setText(arrival);

        TextView depTime = (TextView) convertView.findViewById(R.id.arrTime);
        if(j.get(groupPosition).getDepTimeDeviation() != "") {


            String departure = "Latency: " + j.get(groupPosition).getDepTimeDeviation() + " min";
            depTime.setText(departure);
        }else{
            String departure = "On Time";
            depTime.setText(departure);
        }

        return convertView;
    }


    @Override
    public Object getGroup(int groupPosition) {
        return null;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return null;
    }

    @Override
    public long getGroupId(int groupPosition) {
        return 0;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }

}