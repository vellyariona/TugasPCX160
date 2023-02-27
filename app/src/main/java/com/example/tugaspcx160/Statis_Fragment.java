package com.example.tugaspcx160;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Statis_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Statis_Fragment extends Fragment {


    public Statis_Fragment() {
        // Required empty public constructor
    }

    public static Statis_Fragment newInstance() {
        return new Statis_Fragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_statis_, container, false);
        return view;

    }
}