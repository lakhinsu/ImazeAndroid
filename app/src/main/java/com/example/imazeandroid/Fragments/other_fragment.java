package com.example.imazeandroid.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.other_fragment, container, false);
    }

}
