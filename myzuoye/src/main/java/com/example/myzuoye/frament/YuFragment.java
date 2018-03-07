package com.example.myzuoye.frament;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myzuoye.R;
import com.example.myzuoye.WebActivity;
import com.example.myzuoye.adpater.YuAdpater;
import com.example.myzuoye.student.User;
import com.example.myzuoye.student.User1;
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
public class YuFragment extends Fragment {


    private RecyclerView recy;
    private String a="http://172.16.54.20:8080/chuan02.txt";
    private List<User1.ResultBean.DataBean> data;
    private YuAdpater yuAdpater;

    private Handler handler=new Handler(){


        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            String jsonstring = (String) msg.obj;
            Gson gson = new Gson();
            User1 user1 = gson.fromJson(jsonstring, User1.class);
            data = user1.getResult().getData();

            yuAdpater = new YuAdpater(data,getActivity());
            recy.setAdapter(yuAdpater);
            LinearLayoutManager manager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
            recy.setLayoutManager(manager);
            initLineret();

        }
    };

    public YuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_yu, container, false);
        initView(inflate);
        initData();

        return inflate;
    }

    private void initLineret() {
        yuAdpater.setOnClickListener(new YuAdpater.OnClickListener() {
            @Override
            public void onitemclick(int position) {
                String url = data.get(position).getUrl();
                String title = data.get(position).getTitle();
                Intent intent = new Intent(getActivity(), WebActivity.class);
                intent.putExtra("url",url);
                intent.putExtra("title",title);
                startActivity(intent);
            }
        });
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
        recy = (RecyclerView) inflate.findViewById(R.id.recy);
    }
}
