package com.example.myzuoye1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.myzuoye1.adpater.CengAdpater;
import com.example.myzuoye1.adpater.ShouAdpater;
import com.example.myzuoye1.user.Student;
import com.example.myzuoye1.user.User;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import app.jiyun.com.testsqlitegd.DaoSession;
import app.jiyun.com.testsqlitegd.UserDao;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class ShouYeActivity extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView recy;
    private Button lb;
    private Button sc;
    private String a="http://172.16.54.20:8080/data.txt";
    private List<Student.StudentsBean.StudentBean> student1;
    private ShouAdpater shouAdpater;
    private List<User> users;
    private CengAdpater cengAdpater;

    private Handler handler =new Handler(){

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            String jsonstring = (String) msg.obj;
            Gson gson = new Gson();
            Student student = gson.fromJson(jsonstring, Student.class);
            Student.StudentsBean students = student.getStudents();
            student1 = students.getStudent();

            shouAdpater = new ShouAdpater(student1, ShouYeActivity.this);
            recy.setAdapter(shouAdpater);
            LinearLayoutManager manager = new LinearLayoutManager(ShouYeActivity.this,LinearLayoutManager.VERTICAL,false);
            recy.setLayoutManager(manager);
        }
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shou_ye);
        initView();
        initData();
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


    private void initView() {
        recy = (RecyclerView) findViewById(R.id.recy);
        lb = (Button) findViewById(R.id.lb);
        sc = (Button) findViewById(R.id.sc);

        lb.setOnClickListener(this);
        sc.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.lb:

                shouAdpater = new ShouAdpater(student1, ShouYeActivity.this);
                recy.setAdapter(shouAdpater);
                LinearLayoutManager manager = new LinearLayoutManager(ShouYeActivity.this,LinearLayoutManager.VERTICAL,false);
                recy.setLayoutManager(manager);
                break;

            case R.id.sc:

                UserDao userDao = Squlet.getSqulet().getDaoSession().getUserDao();
                users = userDao.loadAll();
                cengAdpater = new CengAdpater(users,ShouYeActivity.this);
                recy.setAdapter(cengAdpater);
                LinearLayoutManager manager1 = new LinearLayoutManager(ShouYeActivity.this, LinearLayoutManager.VERTICAL, false);
                recy.setLayoutManager(manager1);
                initlineret();
                break;
        }
    }


    private void initlineret() {
        cengAdpater.setOnClickListener(new CengAdpater.OnClickListener() {

            @Override
            public void onitemClick(int position) {
                String img = users.get(position).getImg();
                String conner = users.get(position).getConner();
                String name = users.get(position).getName();

                Intent intent = new Intent(ShouYeActivity.this,XingQActivity.class);
                intent.putExtra("img",img);
                intent.putExtra("conner",conner);
                intent.putExtra("name",name);
                startActivity(intent);
            }

        });
        cengAdpater.setLongOnClick(new CengAdpater.OnClickListener() {
            @Override
            public void onitemClick(int position) {
                users.remove(position);
                UserDao userDao = Squlet.getSqulet().getDaoSession().getUserDao();
                userDao.deleteByKey(users.get(position).getId());
                cengAdpater.notifyDataSetChanged();
            }
        });
    }
}
