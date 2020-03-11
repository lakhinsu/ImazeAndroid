package com.example.imazeandroid.Fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.imazeandroid.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class other_fragment extends Fragment {


    public other_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.other_fragment, container, false);

        LinearLayout other_1 = v.findViewById(R.id.other_event_1);
        LinearLayout other_2 = v.findViewById(R.id.other_event_2);
        LinearLayout other_3 = v.findViewById(R.id.other_event_3);
        LinearLayout other_4 = v.findViewById(R.id.other_event_4);

        other_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),com.example.imazeandroid.other_activity.diy_activity.class);
                startActivity(i);
            }
        });
        other_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),com.example.imazeandroid.other_activity.design_innovation.class);
                startActivity(i);
            }
        });
        other_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),com.example.imazeandroid.other_activity.diy_activity.class);
                startActivity(i);
            }
        });
        other_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(),com.example.imazeandroid.other_activity.diy_activity.class);
                startActivity(i);
            }
        });
        // Inflate the layout for this fragment
        return v;
    }

}
