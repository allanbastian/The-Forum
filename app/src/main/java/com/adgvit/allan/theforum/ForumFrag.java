package com.adgvit.allan.theforum;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Allan on 28-08-2017.
 */

public class ForumFrag extends android.support.v4.app.Fragment {

    private RecyclerView recyclerView;
    private ForumRecyclerAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.row_layout, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler);
        adapter = new ForumRecyclerAdapter(getActivity(), getData());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return rootView;
    }

    public List<Item> getData() {
        List<Item> data = new ArrayList<>();
        //GET request
        return data;
    }
}
