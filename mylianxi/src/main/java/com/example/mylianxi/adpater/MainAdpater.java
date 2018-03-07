package com.example.mylianxi.adpater;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Lenovo on 2018/3/1.
 */

public class MainAdpater extends FragmentPagerAdapter{
    private ArrayList<Fragment> fragmentList;
    private ArrayList<String> stringlist;

    public MainAdpater(FragmentManager fm, ArrayList<Fragment> fragmentList, ArrayList<String> stringlist) {
        super(fm);
        this.fragmentList = fragmentList;
        this.stringlist = stringlist;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return stringlist.get(position);
    }
}
