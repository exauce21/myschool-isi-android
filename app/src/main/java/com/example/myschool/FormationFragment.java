package com.example.myschool;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class FormationFragment extends Fragment {

    private ListView listFormation;
    private String [] tabFormation, tabDetails;
    private String formtation, details;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_formation, container, false);
        listFormation = view.findViewWithTag(R.id.listFormation);
        tabFormation = getResources().getStringArray(R.array.tab_formation);
        tabDetails = getResources().getStringArray(R.array.tab_details);

        return view;
    }
}