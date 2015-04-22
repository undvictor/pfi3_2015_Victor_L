package com.example.victo.assignment_4;

/**
 * Created by Victo on 2015-04-22.
 */

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class FragmentDialog extends DialogFragment implements View.OnClickListener {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment__dialog, container, false);

//        Planet p = (Planet) getArguments().getSerializable("book");

        TextView tv_title = (TextView) v.findViewById(R.id.tv_dialog_title);
        //tv_title.setText(p.getName());
        TextView tv_description = (TextView) v.findViewById(R.id.tv_dialog_description);
      //  tv_description.setText(p.getSummary());
        ImageView iv = (ImageView) v.findViewById(R.id.iv_dialog);
        v.setOnClickListener(this);
        tv_description.setOnClickListener(this);
        iv.setOnClickListener(this);
        tv_title.setOnClickListener(this);
        return v;
    }


    @Override
    public void onClick(View v) {
        FragmentDialog.this.dismiss();
    }
}
