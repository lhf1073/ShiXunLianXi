package com.example.myzuoye1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class XingQActivity extends AppCompatActivity {

    private ImageView ximg;
    private TextView xqcon;
    private TextView xqname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xing_q);
        initView();
        initData();
    }

    private void initData() {
        Intent intent = getIntent();
        String img = intent.getStringExtra("img");
        String conner = intent.getStringExtra("conner");
        String name = intent.getStringExtra("name");

        Picasso.with(XingQActivity.this).load(img).into(ximg);
        xqcon.setText(conner);
        xqname.setText(name);
    }

    private void initView() {
        ximg = (ImageView) findViewById(R.id.ximg);
        xqcon = (TextView) findViewById(R.id.xqcon);
        xqname = (TextView) findViewById(R.id.xqname);
    }
}
