package com.example.myzuoye;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.myzuoye.adpater.MainAdpater;
import com.example.myzuoye.frament.SheFragment;
import com.example.myzuoye.frament.YuFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private TabLayout tab;
    private ViewPager vp;
    private ArrayList<String> stringList;
    private ArrayList<Fragment> fragmentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        initAdpter();
    }

    private void initAdpter() {
        MainAdpater mainAdpater = new MainAdpater(getSupportFragmentManager(),stringList,fragmentList);
        vp.setAdapter(mainAdpater);
        tab.setupWithViewPager(vp);
    }

    private void initData() {
        stringList = new ArrayList<>();
        stringList.add("社会");
        stringList.add("娱乐");

        fragmentList = new ArrayList<>();
        fragmentList.add(new SheFragment());
        fragmentList.add(new YuFragment());

    }

    private void initView() {
        tab = (TabLayout) findViewById(R.id.tab);
        vp = (ViewPager) findViewById(R.id.vp);
    }
}
