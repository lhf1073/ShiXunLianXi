package com.example.myzuoye.adpater;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Lenovo on 2018/3/5.
 */

public class MainAdpater extends FragmentPagerAdapter{

    private ArrayList<String> stringList;
    private ArrayList<Fragment> fragmentList;

    public MainAdpater(FragmentManager fm, ArrayList<String> stringList, ArrayList<Fragment> fragmentList) {
        super(fm);
        this.stringList = stringList;
        this.fragmentList = fragmentList;
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
        return stringList.get(position);
    }
}
