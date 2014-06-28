package com.helm.carousel;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import net.leolink.android.simpleinfinitecarousel.R;

public class MainActivity extends Activity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private String[] myDataset = new String[]{"Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda","Economia Oriental del Asia Profunda"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // improve performance if you know that changes in content
        // do not change the size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)

        mAdapter = new MyAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);
    }

}