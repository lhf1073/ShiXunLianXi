package com.example.myframenttabhost;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;


import com.example.myframenttabhost.frament.DengFragment;
import com.example.myframenttabhost.frament.DingFragment;
import com.example.myframenttabhost.frament.ShouFragment;
import com.example.myframenttabhost.frament.WoFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity implements ViewPager.OnPageChangeListener, TabHost.OnTabChangeListener {

    private ViewPager vp;
    private FrameLayout tabcontent;
    private FragmentTabHost tabhost;
    private List<Fragment> fragmentList;
    private Class fragmentArray[]={ShouFragment.class,DingFragment.class,DengFragment.class,WoFragment.class};
    private LayoutInflater layoutInflater;
    private String textViewArray[]={"首页","定制","当地玩乐","我的"};
    private int imageViewArray[]={R.drawable.list,R.drawable.diy,R.drawable.play,R.drawable.my};


    private View getTabItemView(int i) {
        //将xml布局转换为view对象
        View view = layoutInflater.inflate(R.layout.tab_indicator, null);
        //利用view对象，找到布局中的组件,并设置内容，然后返回视图
        ImageView mImageView = (ImageView) view
                .findViewById(R.id.tab_img);
        TextView mTextView = (TextView) view.findViewById(R.id.tab_text);
        mImageView.setBackgroundResource(imageViewArray[i]);
        mTextView.setText(textViewArray[i]);
        return view;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initdata();
    }

    private void initdata() {
        fragmentList = new ArrayList<>();
        fragmentList.add(new ShouFragment());
        fragmentList.add(new DingFragment());
        fragmentList.add(new DengFragment());
        fragmentList.add(new WoFragment());
        vp.setAdapter(new Viewpageadapter(getSupportFragmentManager(),fragmentList));
        tabhost.getTabWidget().setDividerDrawable(null);
    }

    private void initView() {

        vp = (ViewPager) findViewById(R.id.vp);

        vp.addOnPageChangeListener(this);
        layoutInflater = LayoutInflater.from(this);

        tabcontent = (FrameLayout) findViewById(android.R.id.tabcontent);
        tabhost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        tabhost.setup(this,getSupportFragmentManager(),R.id.vp);
        tabhost.setOnTabChangedListener(this);

        int count = textViewArray.length;
        for (int i = 0; i <count ; i++) {
            TabHost.TabSpec tabSpec = tabhost.newTabSpec(textViewArray[i]).setIndicator(getTabItemView(i));
            tabhost.addTab(tabSpec, fragmentArray[i], null);
            tabhost.setTag(i);
            //tabhost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.color);//设置Tab被选中的时候颜色改变
        }

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        TabWidget widget = tabhost.getTabWidget();
        int oldFocusability = widget.getDescendantFocusability();
        widget.setDescendantFocusability(ViewGroup.FOCUS_BLOCK_DESCENDANTS);//设置View覆盖子类控件而直接获得焦点
        tabhost.setCurrentTab(position);//根据位置Postion设置当前的Tab
        widget.setDescendantFocusability(oldFocusability);//设置取消分割线
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onTabChanged(String tabId) {
        int position = tabhost.getCurrentTab();
        vp.setCurrentItem(position);//把选中的Tab的位置赋给适配器，让它控制页面切换
    }
}
