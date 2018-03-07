package com.example.myframenttabhost.frament;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myframenttabhost.R;
import com.example.myframenttabhost.adpater.DingAdpater;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class DingFragment extends Fragment {


    private TabLayout tab;
    private ViewPager vp;
    private ArrayList<Fragment> fragmentList;
    private ArrayList<String> stringlist;

    public DingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_ding, container, false);
        initView(inflate);
        initData();
        initAdpater();
        return inflate;
    }

    private void initAdpater() {
        DingAdpater dingAdpater = new DingAdpater(getChildFragmentManager(), fragmentList, stringlist);
        vp.setAdapter(dingAdpater);
        tab.setupWithViewPager(vp);
    }

    private void initData() {
        fragmentList = new ArrayList<>();
        fragmentList.add(new OuMeiFragment());
        fragmentList.add(new HaiNanFragment());
        fragmentList.add(new RiHanFragment());


        stringlist = new ArrayList<>();
        stringlist.add("欧美");
        stringlist.add("海南岛");
        stringlist.add("日韩");
    }

    private void initView(View inflate) {
        tab = (TabLayout) inflate.findViewById(R.id.tab);
        vp = (ViewPager) inflate.findViewById(R.id.vp);
    }
}
