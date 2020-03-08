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
import com.example.imazeandroid.common;
import com.example.imazeandroid.common_screen;

/**
 * A simple {@link Fragment} subclass.
 */
public class nontech_fragment extends Fragment {

    private TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10,tv11;
    public nontech_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.nontech_fragment,container,false);
        ////Title Id and Object's
        tv1=v.findViewById(R.id.text_nt_1);
        tv2=v.findViewById(R.id.text_nt_2);
        tv3=v.findViewById(R.id.text_nt_3);
        tv4=v.findViewById(R.id.text_nt_4);
        tv5=v.findViewById(R.id.text_nt_5);
        tv6=v.findViewById(R.id.text_nt_6);
        tv7=v.findViewById(R.id.text_nt_7);
        tv8=v.findViewById(R.id.text_nt_8);
        tv9=v.findViewById(R.id.text_nt_9);
        tv10=v.findViewById(R.id.text_nt_10);
        tv11=v.findViewById(R.id.text_nt_11);
        ////Card Layout Id and Object's
        LinearLayout nt1=v.findViewById(R.id.non_event_1);
        LinearLayout nt2=v.findViewById(R.id.non_event_2);
        LinearLayout nt3=v.findViewById(R.id.non_event_3);
        LinearLayout nt4=v.findViewById(R.id.non_event_4);
        LinearLayout nt5=v.findViewById(R.id.non_event_5);
        LinearLayout nt6=v.findViewById(R.id.non_event_6);
        LinearLayout nt7=v.findViewById(R.id.non_event_7);
        LinearLayout nt8=v.findViewById(R.id.non_event_8);
        LinearLayout nt9=v.findViewById(R.id.non_event_9);
        LinearLayout nt10=v.findViewById(R.id.non_event_10);
        LinearLayout nt11=v.findViewById(R.id.non_event_11);
        //Onclick event of all event's
        nt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getContext(), common_screen.class);
                String str=tv1.getText().toString();
                i.putExtra("ev",str);
                startActivity(i);
            }
        });
        nt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getContext(), common_screen.class);
                String str=tv2.getText().toString();
                i.putExtra("ev",str);
                startActivity(i);
            }
        });
        nt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getContext(), common_screen.class);
                String str=tv3.getText().toString();
                i.putExtra("ev",str);
                startActivity(i);
            }
        });
        nt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getContext(), common_screen.class);
                String str=tv4.getText().toString();
                i.putExtra("ev",str);
                startActivity(i);
            }
        });
        nt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getContext(), common_screen.class);
                String str=tv5.getText().toString();
                i.putExtra("ev",str);
                startActivity(i);
            }
        });
        nt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getContext(), common_screen.class);
                String str=tv6.getText().toString();
                i.putExtra("ev",str);
                startActivity(i);
            }
        });
        nt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getContext(), common_screen.class);
                String str=tv7.getText().toString();
                i.putExtra("ev",str);
                startActivity(i);
            }
        });
        nt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getContext(), common_screen.class);
                String str=tv8.getText().toString();
                i.putExtra("ev",str);
                startActivity(i);
            }
        });
        nt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getContext(), common_screen.class);
                String str=tv9.getText().toString();
                i.putExtra("ev",str);
                startActivity(i);
            }
        });
        nt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getContext(), common_screen.class);
                String str=tv10.getText().toString();
                i.putExtra("ev",str);
                startActivity(i);
            }
        });
        nt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getContext(), common_screen.class);
                String str=tv11.getText().toString();
                i.putExtra("ev",str);
                startActivity(i);
            }
        });
        // Inflate the layout for this fragment
        return v;
    }

}
