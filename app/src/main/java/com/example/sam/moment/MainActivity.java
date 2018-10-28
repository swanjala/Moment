package com.example.sam.moment;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sam.moment.fragments.FirstClockFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // create a fragment and all the fragment initializations.

        FirstClockFragment firstClockFragment = new FirstClockFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction()
                .add(R.id.firstClockFrag, firstClockFragment)
                .commit();

        setContentView(R.layout.activity_main);
    }
}
