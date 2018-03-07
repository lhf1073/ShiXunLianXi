package com.example.mylianxi;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.mylianxi.adpater.MainAdpater;
import com.example.mylianxi.frament.GuFragment;
import com.example.mylianxi.frament.QinFragment;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    private ViewPager vp;
    private TabLayout tab;
    private ArrayList<Fragment> fragmentList;
    private ArrayList<String> stringlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        initAdpater();
    }

    private void initAdpater() {
        MainAdpater mainAdpater = new MainAdpater(getSupportFragmentManager(),fragmentList,stringlist);
        vp.setAdapter(mainAdpater);
        tab.setupWithViewPager(vp);
    }

    private void initData() {
        stringlist = new ArrayList<>();
        stringlist.add("故事");
        stringlist.add("亲子");


        fragmentList = new ArrayList<>();
        fragmentList.add(new GuFragment());
        fragmentList.add(new QinFragment());

    }


    private void initView() {


        vp = (ViewPager) findViewById(R.id.vp);
        tab = (TabLayout) findViewById(R.id.tab);
    }
}
