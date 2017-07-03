package com.example.android.android_me.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

/**
 * Created by Romolo on 03/07/2017.
 */
// TODO (2) Create a new class called MasterListFragment which will display the GridView list of ALL AndroidMe images
// In the fragment class, you'll need to implement an empty constructor, and onCreateView

public class MasterListFragment {
    public MasterListFragment() {
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        final View rootView=inflater.inflate(R.layout.fragment_master_list,container,false);
        GridView gridView=(GridView)rootView.findViewById(R.id.images_grid_view);
        MasterListAdapter masterListAdapter=new MasterListAdapter(getContext(), AndroidImageAssets.getAll());
        gridView.setAdapter(masterListAdapter);
        return rootView;
    }
}
