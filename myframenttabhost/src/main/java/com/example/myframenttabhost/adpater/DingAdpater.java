package com.example.myframenttabhost.adpater;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Lenovo on 2018/3/4.
 */

public class DingAdpater extends FragmentPagerAdapter{

    private ArrayList<Fragment> fragmentList;
    private ArrayList<String> stringlist;

    public DingAdpater(FragmentManager fm, ArrayList<Fragment> fragmentList, ArrayList<String> stringlist) {
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
