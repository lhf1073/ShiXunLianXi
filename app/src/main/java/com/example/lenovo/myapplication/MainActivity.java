package com.example.lenovo.myapplication;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.example.lenovo.myapplication.frament.GuFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager vp;
    private FrameLayout fram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initData() {
        ArrayList<String> stringlist = new ArrayList<>();
        stringlist.add("故事");
        stringlist.add("亲子");

        ArrayList<FrameLayout> framelist = new ArrayList<>();
        framelist.add(new GuFragment());
    }

    private void initView() {
        vp = (ViewPager) findViewById(R.id.vp);
        fram = (FrameLayout) findViewById(R.id.fram);
    }
}
