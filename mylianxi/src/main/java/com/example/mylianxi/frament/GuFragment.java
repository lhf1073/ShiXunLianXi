package com.example.mylianxi.frament;


import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.mylianxi.MainActivity;
import com.example.mylianxi.R;
import com.example.mylianxi.adpater.GuAdpater;
import com.example.mylianxi.student.User;
import com.google.gson.Gson;
import com.recker.flybanner.FlyBanner;
import com.umeng.socialize.ShareAction;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;

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
public class GuFragment extends Fragment {


    private FlyBanner fly;
    private RecyclerView recy;
    private String a="http://172.16.54.20:8080/jinri.txt";
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
            recy.setAdapter(guAdpater);
            GridLayoutManager manager = new GridLayoutManager(getActivity(),2);
            recy.setLayoutManager(manager);
        }
    };

    public GuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_gu, container, false);
        initView(inflate);
        initData();
        return inflate;
    }

    private void initData() {
        ArrayList<String> flylist = new ArrayList<>();
        flylist.add("http://03.imgmini.eastday.com/mobile/20171109/20171109180455_d41d8cd98f00b204e9800998ecf8427e_5_mwpm_03200403.jpg");
        flylist.add("http://03.imgmini.eastday.com/mobile/20171109/20171109180455_d41d8cd98f00b204e9800998ecf8427e_3_mwpm_03200403.jpg");
        flylist.add("http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg");
        flylist.add("http://07.imgmini.eastday.com/mobile/20171109/20171109175525_cc33bfe071a38cc75687f5e62d840b96_5_mwpm_03200403.jpg");
        flylist.add("http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg");

        fly.setImagesUrl(flylist);

        final UMImage umImage=new UMImage(getActivity(),R.mipmap.ic_launcher);
        fly.setOnItemClickListener(new FlyBanner.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
//                new ShareAction(getActivity())
//                        .withText("hello")
//                        .withMedia(umImage)
//                        .setDisplayList(SHARE_MEDIA.SINA,SHARE_MEDIA.QQ,SHARE_MEDIA.WEIXIN)
//                        .setCallback(shareListener).open();
                Toast.makeText(getActivity(), "ssss", Toast.LENGTH_SHORT).show();
            }
        });


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
        fly = (FlyBanner) inflate.findViewById(R.id.fly);
        recy = (RecyclerView) inflate.findViewById(R.id.recy);
    }
    private UMShareListener shareListener = new UMShareListener() {
        /**
         * @descrption 分享开始的回调
         * @param platform 平台类型
         */
        @Override
        public void onStart(SHARE_MEDIA platform) {

        }

        /**
         * @descrption 分享成功的回调
         * @param platform 平台类型
         */
        @Override
        public void onResult(SHARE_MEDIA platform) {
            Toast.makeText(getActivity(),"成功                                     了",Toast.LENGTH_LONG).show();
        }

        /**
         * @descrption 分享失败的回调
         * @param platform 平台类型
         * @param t 错误原因
         */
        @Override
        public void onError(SHARE_MEDIA platform, Throwable t) {
            Toast.makeText(getActivity(),"失                                            败"+t.getMessage(),Toast.LENGTH_LONG).show();
        }

        /**
         * @descrption 分享取消的回调
         * @param platform 平台类型
         */
        @Override
        public void onCancel(SHARE_MEDIA platform) {
            Toast.makeText(getActivity(),"取消                                     了",Toast.LENGTH_LONG).show();

        }
    };
}
