package com.example.myframenttabhost.frament;


import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myframenttabhost.R;
import com.example.myframenttabhost.adpater.OuMeiAdpater;
import com.example.myframenttabhost.student.User;
import com.google.gson.Gson;
import com.recker.flybanner.FlyBanner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShouFragment extends Fragment {


    private FlyBanner fly;
    private RecyclerView shourecy;
    private TextView beijing;
    private String a = "http://192.168.1.114:8080/qinzi.txt";
    private List<User.ResultBean.DataBean> data;
    private Handler handler = new Handler() {

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            String json = (String) msg.obj;
            Gson gson = new Gson();
            User user = gson.fromJson(json, User.class);
            data = user.getResult().getData();
            OuMeiAdpater ouMeiAdpater = new OuMeiAdpater(data, getActivity());
            shourecy.setAdapter(ouMeiAdpater);

            LinearLayoutManager manager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
            shourecy.setLayoutManager(manager);
        }
    };


    public ShouFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_shou, container, false);
        initView(inflate);
        initData();
        initLineret();
        return inflate;
    }

    private void initLineret() {
        beijing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });
    }

    private void initData() {
        ArrayList<String> flyList = new ArrayList<>();
        flyList.add("http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg");
        flyList.add("http://07.imgmini.eastday.com/mobile/20171109/20171109175525_cc33bfe071a38cc75687f5e62d840b96_5_mwpm_03200403.jpg");
        flyList.add("http://01.imgmini.eastday.com/mobile/20171109/20171109170030_447ce0a22cffc2871db1e4d3bb47e306_2_mwpm_03200403.jpg");

        fly.setImagesUrl(flyList);

        new Thread(new Runnable() {
            @Override
            public void run() {
                OkHttpClient okHttpClient = new OkHttpClient();
                Request build = new Request.Builder().url(a).build();
                Call call = okHttpClient.newCall(build);

                try {
                    Response execute = call.execute();
                    String string = execute.body().string();
                    Message message = new Message();
                    message.obj = string;

                    handler.sendMessage(message);
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        }).start();

    }

    private void initView(View inflate) {
        fly = (FlyBanner) inflate.findViewById(R.id.fly);
        shourecy = (RecyclerView) inflate.findViewById(R.id.shourecy);
        beijing = (TextView) inflate.findViewById(R.id.beijing);
    }
}
