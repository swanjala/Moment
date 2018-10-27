package com.example.sam.moment.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.sam.moment.R;

public class FirstClockFragment extends android.support.v4.app.Fragment {
    // extension how android knows how to implement the class

    // constructor
    public FirstClockFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container
   , Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_clock_one,
                container, false);

        ImageView imageView = rootView.findViewById(R.id.firstClock);
        imageView.setImageResource(R.mipmap.timer_primary);
        return rootView;

    }

}
