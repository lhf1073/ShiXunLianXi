package com.example.myframenttabhost.frament;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myframenttabhost.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RiHanFragment extends Fragment {


    public RiHanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ri_han, container, false);
    }

}
