package com.example.mylianxi.frament;


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

import com.example.mylianxi.R;
import com.example.mylianxi.adpater.GuAdpater;
import com.example.mylianxi.student.User;
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
public class QinFragment extends Fragment {


    private FlyBanner fly1;
    private RecyclerView recy2;
    private RecyclerView recy3;
    private String b="http://172.16.54.20:8080/jinri.txt";
    private List<User.ResultBean.DataBean> data;
    private Handler handler=new Handler(){

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            String jsonstring = (String) msg.obj;
            Gson gson = new Gson();
            User user = gson.fromJson(jsonstring, User.class);
            data = user.getResult().getData();

            GuAdpater guAdpater = new GuAdpater(data,getActivity());
            recy2.setAdapter(guAdpater);
            recy3.setAdapter(guAdpater);
            LinearLayoutManager manager = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
            recy2.setLayoutManager(manager);
            LinearLayoutManager manager1 = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
            recy3.setLayoutManager(manager1);

        }
    };

    public QinFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_qin, container, false);
        initView(inflate);
        initData();
        return inflate;
    }

    private void initData() {
        ArrayList<String> fly1list = new ArrayList<>();
        fly1list.add("http://04.imgmini.eastday.com/mobile/20171109/20171109163206_c7376709f2a01c6ba9c588bf6448b797_1_mwpm_03200403.jpg");
        fly1list.add("http://04.imgmini.eastday.com/mobile/20171109/20171109163206_c7376709f2a01c6ba9c588bf6448b797_3_mwpm_03200403.jpg");
        fly1list.add("http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg");

        fly1.setImagesUrl(fly1list);


        new Thread(new Runnable() {
            @Override
            public void run() {
                OkHttpClient okHttpClient = new OkHttpClient();
                Request build = new Request.Builder().url(b).build();
                Call call = okHttpClient.newCall(build);
                try {
                    Response execute = call.execute();
                    String string = execute.body().string();
                    Message message = new Message();
                    message.obj=string;

                    handler.sendMessage(message);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();


    }

    private void initView(View inflate) {
        fly1 = (FlyBanner) inflate.findViewById(R.id.fly1);
        recy2 = (RecyclerView) inflate.findViewById(R.id.recy2);
        recy3 = (RecyclerView) inflate.findViewById(R.id.recy3);
    }
}
