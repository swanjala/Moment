package com.example.sam.moment;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.sam.moment.fragments.FirstClockFragment;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FirstClockFragment firstClockFragment = new FirstClockFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();


        // this is to begin the transaction
        fragmentManager.beginTransaction()
                .add(R.id.firstClockFrag, firstClockFragment)
                .commit();

        /* See if you are able to change the things that are a in the position on it*/

        FrameLayout frameLayout = findViewById(R.id.firstClockFrag);
        frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // adding an onclick listener to the layout

                Toast.makeText(getApplicationContext(),"This  is a aclicker",
                        Toast.LENGTH_SHORT).show();
            }
        });

        setContentView(R.layout.activity_main);
    }
}
