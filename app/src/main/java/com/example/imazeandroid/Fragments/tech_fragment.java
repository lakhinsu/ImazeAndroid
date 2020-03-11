package com.example.imazeandroid.Fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.imazeandroid.R;
import com.example.imazeandroid.common_screen;


/**
 * A simple {@link Fragment} subclass.
 */
public class tech_fragment extends Fragment {

    private TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10;
    public tech_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.tech_fragment, container, false);



        tv1= v.findViewById(R.id.text_tec_1);
        tv2= v.findViewById(R.id.text_tec_2);
        tv3= v.findViewById(R.id.text_tec_3);
        tv4= v.findViewById(R.id.text_tec_4);
        tv5= v.findViewById(R.id.text_tec_5);
        tv6= v.findViewById(R.id.text_tec_6);
        tv7= v.findViewById(R.id.text_tec_7);
        tv8= v.findViewById(R.id.text_tec_8);
        tv9= v.findViewById(R.id.text_tec_9);
        tv10= v.findViewById(R.id.text_tec_10);

        LinearLayout tech1 = v.findViewById(R.id.event_1);
        LinearLayout tech2 = v.findViewById(R.id.event_2);
        LinearLayout tech3 = v.findViewById(R.id.event_3);
        LinearLayout tech4 = v.findViewById(R.id.event_4);
        LinearLayout tech5 = v.findViewById(R.id.event_5);
        LinearLayout tech6 = v.findViewById(R.id.event_6);
        LinearLayout tech7 = v.findViewById(R.id.event_7);
        LinearLayout tech8 = v.findViewById(R.id.event_8);
        LinearLayout tech9 = v.findViewById(R.id.event_9);
        LinearLayout tech10 = v.findViewById(R.id.event_10);


        tech1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getContext(), common_screen.class);
                String str=tv1.getText().toString();
                i.putExtra("ev",str);
                startActivity(i);
            }
        });
        tech2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getContext(), common_screen.class);
                String str=tv2.getText().toString();
                i.putExtra("ev",str);
                startActivity(i);
            }
        });
        tech3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getContext(), common_screen.class);
                String str=tv3.getText().toString();
                i.putExtra("ev",str);
                startActivity(i);
            }
        });
        tech4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getContext(), common_screen.class);
                String str=tv4.getText().toString();
                i.putExtra("ev",str);
                startActivity(i);
            }
        });
        tech5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getContext(), common_screen.class);
                String str=tv5.getText().toString();
                i.putExtra("ev",str);
                startActivity(i);
            }
        });
        tech6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getContext(), common_screen.class);
                String str=tv6.getText().toString();
                i.putExtra("ev",str);
                startActivity(i);
            }
        });
        tech7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getContext(), common_screen.class);
                String str=tv7.getText().toString();
                i.putExtra("ev",str);
                startActivity(i);
            }
        });
        tech8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getContext(), common_screen.class);
                String str=tv8.getText().toString();
                i.putExtra("ev",str);
                startActivity(i);
            }
        });
        tech9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getContext(), common_screen.class);
                String str=tv9.getText().toString();
                i.putExtra("ev",str);
                startActivity(i);
            }
        });
        tech10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getContext(), common_screen.class);
                String str=tv10.getText().toString();
                i.putExtra("ev",str);
                startActivity(i);
            }
        });

        // Inflate the layout for this fragment
        return v;
    }

}
