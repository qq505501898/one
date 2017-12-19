package com.example.white.panda_live.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by 卢本伟·White on 2017/12/18.
 */
public class MyAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> mList;

    public MyAdapter(FragmentManager fm, ArrayList<Fragment> mList) {
        super(fm);
        this.mList = mList;
    }

    @Override
    public Fragment getItem(int position) {
        return mList.get(position);
    }

    @Override
    public int getCount() {
        return mList.size();
    }
}
