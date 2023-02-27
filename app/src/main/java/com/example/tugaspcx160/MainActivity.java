package com.example.tugaspcx160;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mButton;
//    dipakai untuk merubah status onclick button
    private boolean isFragmentDisplayed = false;
//    inisiasi fragment di main untuk diatur visibilitasnya
    private View fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//button yang ada di activitymain
        mButton = findViewById(R.id.buttonLihatKelebihan);
        fragment = findViewById(R.id.fragment_awal);

        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (!isFragmentDisplayed) {
                    displayFragment();
                } else {
                    closeFragment();
                }
            }
        });
    }

    public void displayFragment() {
//        untuk membuat objek baru dari fragment dinamis
        Dinamis_Fragment dinamisFragment = Dinamis_Fragment.newInstance();
// TODO: Get the FragmentManager and start a transaction.
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager
                .beginTransaction();
// TODO: Add the SimpleFragment.
        fragmentTransaction.add(R.id.fragment_container,
                dinamisFragment).addToBackStack(null).commit();
        fragment.setVisibility(View.GONE);
        mButton.setText("Mantap!");
        isFragmentDisplayed = true;
    }


    public void closeFragment() {
// Get the FragmentManager.
        FragmentManager fragmentManager = getSupportFragmentManager();
// Check to see if the fragment is already showing.
        Dinamis_Fragment dinamisFragment = (Dinamis_Fragment) fragmentManager
                .findFragmentById(R.id.fragment_container);
        if (dinamisFragment != null) {
// Create and commit the transaction to remove the fragment.
                    FragmentTransaction fragmentTransaction =
                    fragmentManager.beginTransaction();
            fragmentTransaction.remove(dinamisFragment).commit();
        }
        fragment.setVisibility(View.VISIBLE);
// Update the Button text.
        mButton.setText("Lihat Kelebihan");
// Set boolean flag to indicate fragment is closed.
        isFragmentDisplayed = false;
    }




}