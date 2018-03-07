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

import com.example.myframenttabhost.R;
import com.example.myframenttabhost.adpater.OuMeiAdpater;
import com.example.myframenttabhost.student.User;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class OuMeiFragment extends Fragment {


    private RecyclerView ourecy;
    private String a="http://192.168.1.114:8080/qinzi.txt";
    private List<User.ResultBean.DataBean> data;
    private Handler handler=new Handler(){

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            String jsonstring = (String) msg.obj;
            Gson gson = new Gson();
            User user = gson.fromJson(jsonstring, User.class);
            data = user.getResult().getData();

            OuMeiAdpater ouMeiAdpater = new OuMeiAdpater(data,getActivity());
            ourecy.setAdapter(ouMeiAdpater);

            LinearLayoutManager manager = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);
            ourecy.setLayoutManager(manager);
        }
    };

    public OuMeiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_ou_mei, container, false);
        initView(inflate);
        initData();
        return inflate;
    }

    private void initData() {
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
                    message.obj=string;

                    handler.sendMessage(message);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }).start();
    }

    private void initView(View inflate) {
        ourecy = (RecyclerView) inflate.findViewById(R.id.ourecy);
    }
}
